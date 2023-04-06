//=========================================================================
// �J�v���E���ꊇ�t�@���N�V����
//	callfunc "KafraMain",Speech,SelectNum,"OutSave",OutX,OutY,"InSave",InX,InY,
//				Storage,Cart,MapCodeArray,PriceArray;
// �� �����̏ڍ�
//	Speech -> �Z���t�̕���
//			0: ���A3�s
//			1: ���A4�s
//			2: �R���h�p
//			3: ����p�A�Z���t�Ȃ�
//			4: �A�C���u���O�E�A�C���x�t�p�i��Ԉړ��I�����j
//	SelectNum -> 7�̃T�[�r�X�̒�����I������r�b�g�t���O�i0x1ff��7�S���j
//			+1:   �ʒu�Z�[�u
//			+2:   �q��
//			+4:   ��Ԉړ�
//			+8:   �J�[�g
//			+16:  �J�v���|�C���g
//			+32:  �J�v���z�u�ē�
//			+64:  ��������
//			+128: �q�ɃV���[�g�J�b�g
//			+256: �I��
//	"OutSave",OutX,OutY -> �u�O�ŃZ�[�u�v�̃Z�[�u�|�C���g
//	                        �I�������o�Ȃ��ꍇ������ɊY��
//	"InSave",InX,InY    -> �u���ŃZ�[�u�v�̃Z�[�u�|�C���g
//	                        �I�������o�Ȃ��ꍇ��"InSave"��"NULL"�ɂ���
//	                        �������ʒu�Z�[�u�T�[�r�X���̂��Ȃ��ꍇ�͊��S�ɖ���
//	Storage -> �q�ɗ���
//	Cart -> �J�[�g���p����
//	MapCodeArray -> ��Ԉړ����MAP�R�[�h���i�[�����z��ϐ�
//	PriceArray -> �K�v�ȗ������i�[�����z��ϐ�
//
// �� ��Ԉړ��pMAP�R�[�h
//	1	�v�����e��
//	2	�C�Y���[�h
//	3	�Q�t�F��
//	4	�t�F�C����
//	5	�����N
//	6	�A���x���^
//	7	�I�[�N�_���W����
//	8	�A���f�o����
//	9	�~�����j�[���p�z
//	10	�R���h
//	11	�t�@���X���䓇
//	12	�R���h�t�@���X����i11�̕ʕ\�����j
//	13	�W���m�[
//	14	�v�����e���i�A�W�g�j
//	15	�Q�t�F���i�A�W�g�j
//	16	�t�F�C�����i�A�W�g�j
//	17	�A���f�o�����i�A�W�g�j
//	18	���w���i�A�W�g�j
//	19	�E���o��
//	20	�}������
//
// �� parse�I������
//	�u�J�v���z�u�ē��v������ꍇ�ɂ�viewpoint��t�������Acutin������
//	�Ȃ��ꍇ��end�ŏI���i�Ȃ��Ă��ǂ��j
//
// �� �L�����N�^�i���ϐ�
//	KAFRA_PIT -> �J�v���|�C���g
//-------------------------------------------------------------------------

function	script	KafraMain	{
	//���A����
	function KafraSpeech {
		if(getarg(0)!=3) {
			mes "[�J�v���E��]";
			mes "��������Ⴂ�܂�";
			mes "�J�v���T�[�r�X��";
			mes "�����F�l�̂��΂ɂ��܂��B";
			switch(getarg(0)) {
			case 0:
				break;
			case 1:
			case 4:	//case4�̓A�C���u���O�E�A�C���x�t
				mes "��������`���������܂��傤�H";
				break;
			case 2:	//�R���h
				mes "���A�J�v���T�[�r�X�����x����";
				mes "�T�[�r�X�v���O�������ǂɂ��";
				mes "��荂�i���̃T�[�r�X�����񑩂��܂��B";
				break;
			}
			next;
		}
		return;
	}

	//�ʒu�Z�[�u�T�[�r�X
	function KafraSave {
		if(getarg(5) == "NULL")
			savepoint getarg(2),getarg(3),getarg(4);	//�I�����Ȃ���OutSave
		else if(select("���̊O�ŃZ�[�u","���̒��ŃZ�[�u")==1)
			savepoint getarg(2),getarg(3),getarg(4);	//OutSave
		else
			savepoint getarg(5),getarg(6),getarg(7);	//InSave
		mes "[�J�v���E��]";
		mes "�Z�[�u���܂����B";
		mes "�����p���肪�Ƃ��������܂��B";
		return;
	}

	//��Ԉړ��T�[�r�X
	function KafraTrans {
		if(getarg(0)==4) {	//�A�C���u���O�E�A�C���x�t
			mes "[�J�v���E��]";
			mes "���J�v���T�[�r�X��";
			mes "�V���o���c�o���h�{���ł́A";
			mes "�V���o���c�o���h���a���Ƃ̋���";
			mes "�u^FF0000��Ԉړ��T�[�r�X����^000000�v";
			mes "�ɂ��A�{�T�[�r�X��";
			mes "�s��Ȃ����j�ƂȂ��Ă���܂��B";
			next;
			mes "[�J�v���E��]";
			mes "���n��ւ̈ړ��ɂ́A";
			mes "��s�D�������p���������B";
			return;
		}
		copyarray '@price,getarg(11),getarraysize(getarg(11));	//�󂯎����PriceArray��z��ɓW�J
		//����Ăяo�����̂�setarray����
		if('placename$[0] == "") {
			setarray 'placename$,	"�v�����e��","�C�Y���[�h","�Q�t�F��","�t�F�C����","�����N","�A���x���^",
						"�I�[�N�_���W����","�A���f�o����","�~�����j�[���p�z","�R���h","�t�@���X���䓇",
						"�R���h�t�@���X����","�W���m�[","�v�����e��","�Q�t�F��","�t�F�C����","�A���f�o����",
						"���w��","�E���o��","�}������";
		}
		for(set '@i,0; '@i<getarraysize(getarg(10)); set '@i,'@i+1)
			set '@place$['@i],'placename$[ getelementofarray(getarg(10),'@i)-1 ] +" -> "+ '@price['@i] +" z";
		mes "[�J�v���E��]";
		mes "�ړI�n�����I�щ������B";
		next;
		set '@j,select(		'@place$[0],'@place$[1],'@place$[2],'@place$[3],'@place$[4],'@place$[5],'@place$[6],'@place$[7],
					'@place$[8],'@place$[9],'@place$[10],'@place$[11],'@place$[12],'@place$[13],'@place$[14],'@place$[15],
					'@place$[16],'@place$[17],'@place$[18],'@place$[19],"������")-1;
		if('@j==20) {
			mes "[�J�v���E��]";
			mes "���肪�Ƃ��������܂����B";
			mes "�܂������p���������܂��B";
			return;
		}
		if(Zeny<'@price['@j]) {
			mes "[�J�v���E��]";
			mes "���q�l�A����������܂���B";
			mes "�����������m���߂��������B";
			return;
		}
		set Zeny,Zeny-'@price['@j];
		set KAFRA_PIT,KAFRA_PIT+('@price['@j]/10);
		switch ( getelementofarray(getarg(10),'@j) ) {
			case 1: warp "prontera.gat",116,72; 	break;
			case 2: warp "izlude.gat",91,105; 	break;
			case 3: warp "geffen.gat",120,39; 	break;
			case 4: warp "payon.gat",160,58; 	break;
			case 5: warp "morocc.gat",156,46; 	break;
			case 6: warp "alberta.gat",117,56; 	break;
			case 7: warp "gef_fild10.gat",52,326; 	break;
			case 8: warp "aldebaran.gat",167,112; 	break;
			case 9: warp "mjolnir_02.gat",99,351; 	break;
			case 10: warp "comodo.gat",209,143; 	break;
			case 11:
			case 12:
				 warp "cmd_fild07.gat",127,134; break;
			case 13: warp "yuno.gat",158,124; 	break;
			//�A�W�g�ꑮ�J�v���p
			case 14: warp "prontera.gat",278,211; 	break;
			case 15: warp "geffen.gat",120,39; 	break;
			case 16: warp "payon.gat",158,88; 	break;
			case 17: warp "aldebaran.gat",132,103;	break;
			case 18: warp "rachel.gat",115,125;	break;
			case 19: warp "umbala",100,154;		break;
			//�ǉ�
			case 20: warp "malangdo.gat",135,134;	break;
		}
		end;
	}

	//�J�[�g�T�[�r�X
	function KafraCart {
		if(getbaseclass(Class) != CLASS_MC) {
			mes "[�J�v���E��]";
			mes "�\���󂲂����܂���B";
			mes "�J�[�g�͏��l�Ƃ��̏�ʐE��p��";
			mes "�T�[�r�X�ł��B";
			return;
		}
		if(checkcart()) {
			mes "[�J�v���E��]";
			mes "���q�l�͌��݃J�[�g��";
			mes "���p����Ă��܂��B";
			return;
		}
		mes "[�J�v���E��]";
		mes "�J�[�g���p������" +getarg(9)+ "Zeny�ł��B";
		mes "�܂��A�J�[�g�𗘗p����ɂ�";
		mes "�u�v�b�V���J�[�g�v�X�L�����K�v�ł��B";
		mes "���̃X�L�����Ȃ��ƃJ�[�g�𗘗p";
		mes "�ł����ɂ������������Ă��܂��܂��B";
		mes "�����͂�낵���ł����H";
		next;
		if(select("���p����","������")==2) {
			mes "[�J�v���E��]";
			mes "���肪�Ƃ��������܂����B";
			mes "�܂������p���������܂��B";
			return;
		}
		if(Zeny<getarg(9)) {
			mes "[�J�v���E��]";
			mes "���q�l�A����������܂���B";
			mes "�J�[�g���p������"+getarg(9)+"Zeny�ł��B";
			return;
		}
		set Zeny,Zeny-getarg(9);
		set KAFRA_PIT,KAFRA_PIT+(getarg(9)/10);
		setcart;
		return;
	}

	//�J�v���|�C���g�m�F
	function KafraPoint {
		mes "[�J�v���E��]";
		mes strcharinfo(0)+ "�l�̊l���|�C���g�́A";
		mes KAFRA_PIT+ "�_�ł��B";
		next;
		mes "[�J�v���E��]";
		mes "�J�v���|�C���g�͓��J�v���T�[�r�X��";
		mes "�{�Ђŏܕi�ƈ����������\�ł��B";
		mes "����Ƃ��J�v���T�[�r�X����낵��";
		mes "���肢�v���܂��B";
		return;
	}

	//���������T�[�r�X
	function KafraUnequip {
		misceffect 389,"";
		misceffect 411,"";
		unequip -2;
		mes "[�J�v���E��]";
		mes "�����A�C�e���������������܂����B";
		mes "�����p���肪�Ƃ��������܂��B";
		return;
	}

	//�u�q�ɃV���[�g�J�b�g�v�̐ݒ�ύX
	function KafraStorageConf {
		mes "[�J�v���E��]";
		mes "�u�q�ɃV���[�g�J�b�g�v��";
		mes "�ݒ��ύX���Ă��������܂��B";
		if(checkquest(202060) & 0x8)
			mes "���݂́u�ݒ�^FF0000ON^000000�v�ƂȂ��Ă��܂��B";
		else
			mes "���݂́u�ݒ�^0000FFOFF^000000�v�ƂȂ��Ă��܂��B";
		mes "�������������܂��傤���H";
		next;
		if(select("�؂�ւ���","����ς��߂�") == 2) {
			mes "[�J�v���E��]";
			mes "�������܂�܂����B";
			mes "�ݒ��ύX����ۂ�";
			mes "�܂����z�����������܂��B";
			return;
		}
		if(checkquest(202060) & 0x8) {
			setquest 202060;
			delquest 202060;
		}
		else {
			setquest 202060;
			compquest 202060;
		}
		misceffect 128,"";
		mes "[�J�v���E��]";
		if(checkquest(202060) & 0x8)
			mes "�u�ݒ�^FF0000ON^000000�v�ɐ؂�ւ��܂����B";
		else
			mes "�u�ݒ�^0000FFOFF^000000�v�ɐ؂�ւ��܂����B";
		mes "�ݒ��ύX����ۂ�";
		mes "�܂����z�����������܂��B";
		return;
	}

	//����ݒ�
	function KafraInit {
		mes "[�J�v���E��]";
		mes "�`���҂̊F�l�ɁA��薞������������悤";
		mes "�u^FF0000�q�ɃV���[�g�J�b�g^000000�v�T�[�r�X��";
		mes "�u^FF0000��������^000000�v�T�[�r�X�̒񋟂�";
		mes "�J�n�������܂����B";
		next;
		mes "[�J�v���E��]";
		mes "�u^FF0000�q�ɃV���[�g�J�b�g^000000�v�T�[�r�X��";
		mes "�ݒ���uON�v�ɂ��邱�Ƃ�";
		mes "�����p���������܂��B";
		mes "���݂́u�ݒ�^0000FFOFF^000000�v�ƂȂ��Ă��܂��B";
		mes "�������ݒ��؂�ւ��܂����H";
		mes "����A�؂�ւ��邱�Ƃ��ł��܂��B";
		next;
		switch(select("���͂�߂Ă���","�uON�v�ɐ؂�ւ���")) {
		case 1:
			mes "[�J�v���E��]";
			mes "�������܂�܂����B";
			break;
		case 2:
			setquest 202060;
			compquest 202060;
			misceffect 128,"";
			mes "[�J�v���E��]";
			mes "�u�ݒ�^FF0000ON^000000�v�ɐ؂�ւ��܂����B";
			break;
		}
		mes "�ݒ��ύX����ۂ�";
		mes "�u^FF0000�u�q�ɃV���[�g�J�b�g�v�̐ݒ�ύX^000000�v��";
		mes "���\���t�����������B";
		next;
		setquest 202065;
		compquest 202065;
		return;
	}

	//�I��
	function KafraEnd {
		mes "[�J�v���E��]";
		mes "��X�J�v���T�[�r�X�́A��芮����";
		mes "�T�[�r�X�ƊǗ��Ɩ���ڎw��";
		mes "���q�l�����S���Ă����p����������悤";
		mes "�����őP��s�����Ă��܂��B";
		mes "�i���j�J�v���T�[�r�X�������p��������";
		mes "���肪�Ƃ��������܂����B";
		return;
	}

	//��������main
	KafraSpeech getarg(0);
	if(!checkquest(202065)) {
		KafraInit;
	}
	if(checkquest(202060) & 0x8) {
		while(1) {
			switch(select("^0000FF�q��^000000���J��","�����̉���","�����̃T�[�r�X�𗘗p")) {
			case 1:
				//�q�ɃT�[�r�X�͕���
				callfunc "KafraStorage",getarg(8);
				end;
			case 2:
				misceffect 389,"";
				misceffect 411,"";
				unequip -2;
				mes "[�J�v���E��]";
				mes "�����A�C�e���������������܂����B";
				mes "�����đq�ɃT�[�r�X�������p���������܂��B";
				next;
				continue;
			case 3:
				break;
			}
			break;
		}
	}
	setarray '@serv$,"�ʒu�Z�[�u�T�[�r�X","�q�ɃT�[�r�X -> " +getarg(8)+ "zeny","��Ԉړ��T�[�r�X",
				"�J�[�g�T�[�r�X","�J�v���|�C���g�m�F","�J�v���E���z�u�ē�","���������T�[�r�X","�u�q�ɃV���[�g�J�b�g�v�̐ݒ�ύX","�I��";
	for(set '@i,0; '@i<9; set '@i,'@i+1) {
		if(getarg(1)&(1<<'@i) == 0)
			set '@serv$['@i],"";	//SelectNum�̃r�b�g�t���O�������ĂȂ���΋�Ŗ��߂�
	}
	switch (select('@serv$[0],'@serv$[1],'@serv$[2],'@serv$[3],'@serv$[4],'@serv$[5],'@serv$[6],'@serv$[7],'@serv$[8])) {
		case 1:
			//0,1�̓_�~�[
			KafraSave 0,1,getarg(2),getarg(3),getarg(4),getarg(5),getarg(6),getarg(7);
			break;
		case 2:
			//�q�ɃT�[�r�X�͕���
			callfunc "KafraStorage",getarg(8);
			end;
		case 3:
			//1�`9�̓_�~�[
			if(getarg(0) != 4)
				KafraTrans getarg(0),1,2,3,4,5,6,7,8,9,getarg(10),getarg(11);
			else
				KafraTrans getarg(0);
			break;
		case 4:
			//0�`8�̓_�~�[
			KafraCart 0,1,2,3,4,5,6,7,8,getarg(9);
			break;
		case 5:
			KafraPoint;
			break;
		case 6:
			mes "[�J�v���E��]";
			mes "�~�jMAP�\���n�_��";
			mes "�J�v���E�������܂��B";
			return;	//case6�̂�return���Ĕz�u�ē�
		case 7:
			KafraUnequip;
			break;
		case 8:
			KafraStorageConf;
			break;
		case 9:
			KafraEnd;
			break;
	}
	close2;
	cutin "kafra_01",255;
	end;
}

//�q�ɃT�[�r�X��������
function	script	KafraStorage	{
	if(basicskillcheck() && ((getskilllv(1) < 6 && Job != Job_Summoner) || (getskilllv(5018) < 1 && Job == Job_Summoner))) {
		mes "[�J�v���E��]";
		mes "�q�ɂ͊�{�X�L�����x��6��";
		mes "�K�����Ă��痘�p�\�ƂȂ�܂��B";
	}
	else if(Zeny<getarg(0)) {
		mes "[�J�v���E��]";
		mes "���q�l�A����������܂���B";
		mes "�q�ɗ��p������"+getarg(0)+"Zeny�ł��B";
	}
	else {
		set Zeny,Zeny-getarg(0);
		set KAFRA_PIT,KAFRA_PIT+(getarg(0)/10);
		openstorage;
		cutin "kafra_01",255;
		close;
	}
	close2;
	cutin "kafra_01",255;
	return;
}

//----------------------------------
// < �v�����e�� - ���� >
//----------------------------------

prontera.gat,146,89,6	script	�J�v���E��	117,{
	cutin "kafra_01",2;
	setarray '@code,2,3,4,5,6,8,7;
	setarray '@price,600,1200,1200,1200,1800,2000,1700;
	callfunc "KafraMain",1,0x1ff,"prontera.gat",116,72,"NULL",0,0,40,800,'@code,'@price;
	close2;
	viewpoint 1,146,89,1,0x0000FF;
	viewpoint 1,282,200,2,0x0000FF;
	viewpoint 1,151,29,3,0x0000FF;
	viewpoint 1,29,207,4,0x0000FF;
	cutin "kafra_01",255;
	end;
}

//----------------------------------
// < �v�����e�� - ���J�v�� >
//----------------------------------

prontera.gat,282,200,2	script	�J�v���E��	114,{
	cutin "kafra_04",2;
	setarray '@code,2,3,4,5,6,8,7;
	setarray '@price,600,1200,1200,1200,1800,2000,1700;
	callfunc "KafraMain",1,0x1ff,"prt_fild06.gat",33,192,"prontera.gat",279,200,40,800,'@code,'@price;
	close2;
	viewpoint 1,146,89,1,0x0000FF;
	viewpoint 1,282,200,2,0x0000FF;
	viewpoint 1,151,29,3,0x0000FF;
	viewpoint 1,29,207,4,0x0000FF;
	cutin "kafra_04",255;
	end;
}

//----------------------------------
// < �v�����e�� - ��J�v�� >
//----------------------------------

prontera.gat,151,29,0	script	�J�v���E��	115,{
	cutin "kafra_03",2;
	setarray '@code,2,3,4,5,6,8,7;
	setarray '@price,600,1200,1200,1200,1800,2000,1700;
	callfunc "KafraMain",1,0x1ff,"prt_fild08.gat",170,368,"prontera.gat",116,72,40,800,'@code,'@price;
	close2;
	viewpoint 1,146,89,1,0x0000FF;
	viewpoint 1,282,200,2,0x0000FF;
	viewpoint 1,151,29,3,0x0000FF;
	viewpoint 1,29,207,4,0x0000FF;
	cutin "kafra_03",255;
	end;
}

//----------------------------------
// < �v�����e�� - ���J�v�� >
//----------------------------------

prontera.gat,29,207,6	script	�J�v���E��	113,{
	cutin "kafra_05",2;
	setarray '@code,2,3,4,5,6,8,7;
	setarray '@price,600,1200,1200,1200,1800,2000,1700;
	callfunc "KafraMain",1,0x1ff,"prt_fild05.gat",368,205,"prontera.gat",33,207,40,800,'@code,'@price;
	close2;
	viewpoint 1,146,89,1,0x0000FF;
	viewpoint 1,282,200,2,0x0000FF;
	viewpoint 1,151,29,3,0x0000FF;
	viewpoint 1,29,207,4,0x0000FF;
	cutin "kafra_05",255;
	end;
}

//----------------------------------
// < �v�����e�� - �k�J�v�� >
//----------------------------------

prt_fild01.gat,198,47,0	script	�J�v���E��	112,{
	cutin "kafra_06",2;
	setarray '@code,2,3,4,5,6,8,7;
	setarray '@price,600,1200,1200,1200,1800,2000,1700;
	callfunc "KafraMain",1,0x1df,"prt_fild01.gat",198,51,"NULL",0,0,40,800,'@code,'@price;
	end;
}

//----------------------------------
// < �v�����e�� - �n�����H�O�̃J�v�� >
//----------------------------------

prt_fild05.gat,290,224,4	script	�J�v���E��	114,{
	cutin "kafra_04",2;
	callfunc "KafraMain",0,0x1db,"prt_fild05.gat",274,244,"NULL",0,0,30,800;
	end;
}

//----------------------------------
// < �C�Y���[�h - ���̒� >
//----------------------------------

izlude.gat,134,88,4	script	�J�v���E��	115,{
	cutin "kafra_03",2;
	setarray '@code,1,5,4,3,8;
	setarray '@price,600,1200,1200,1200,1800;
	callfunc "KafraMain",1,0x1ff,"prt_fild08.gat",350,202,"izlude.gat",94,103,30,800,'@code,'@price;
	close2;
	viewpoint 1,136,88,1,0x0000FF;
	cutin "kafra_03",255;
	end;
}

//----------------------------------
// < �Q�t�F�� - �앬�� >
//----------------------------------

geffen.gat,120,62,0	script	�J�v���E��	115,{
	cutin "kafra_03",2;
	setarray '@code,1,8,7,9;
	setarray '@price,1200,1200,1700,1700;
	callfunc "KafraMain",0,0x1ff,"geffen.gat",120,38,"NULL",0,0,30,800,'@code,'@price;
	close2;
	viewpoint 1,120,62,1,0x0000FF;
	viewpoint 1,203,123,2,0x0000FF;
	cutin "kafra_03",255;
	end;
}

//----------------------------------
// < �Q�t�F�� - ������� >
//----------------------------------

geffen.gat,203,123,4	script	�J�v���E��	114,{
	cutin "kafra_04",2;
	setarray '@code,1,8,7,9;
	setarray '@price,1200,1200,1700,1700;
	callfunc "KafraMain",0,0x1ff,"gef_fild00.gat",55,222,"geffen.gat",120,38,30,800,'@code,'@price;
	close2;
	viewpoint 1,120,62,1,0x0000FF;
	viewpoint 1,203,123,2,0x0000FF;
	cutin "kafra_04",255;
	end;
}

//----------------------------------
// < �����N - �� >
//----------------------------------

morocc.gat,156,97,4	script	�J�v���E��	113,{
	cutin "kafra_05",2;
	setarray '@code,1,4,6,10,11;
	setarray '@price,1200,1200,1800,1800,1200;
	callfunc "KafraMain",1,0x1ff,"morocc.gat",156,46,"NULL",0,0,40,800,'@code,'@price;
	close2;
	viewpoint 1,160,258,1,0x0000FF;
	viewpoint 1,159,97,2,0x0000FF;
	cutin "kafra_05",255;
	end;
}

//----------------------------------
// < �����N - �k����� >
//----------------------------------

morocc.gat,160,258,4	script	�J�v���E��	114,{
	cutin "kafra_04",2;
	setarray '@code,1,4,6,10,11;
	setarray '@price,1200,1200,1800,1800,1200;
	callfunc "KafraMain",1,0x1ff,"moc_fild07.gat",211,29,"morocc.gat",160,283,40,800,'@code,'@price;
	close2;
	viewpoint 1,160,258,1,0x0000FF;
	viewpoint 1,159,97,2,0x0000FF;
	cutin "kafra_04",255;
	end;
}

//----------------------------------
// < �����N - �s���~�b�h����� >
//----------------------------------

moc_ruins.gat,59,157,6	script	�J�v���E��	117,{
	cutin "kafra_01",2;
	callfunc "KafraMain",1,0x1da,0,0,0,0,0,0,50,800;
	end;
}

//----------------------------------
// < �A���x���^ - �k����� >
//----------------------------------

alberta.gat,28,229,0	script	�J�v���E��	116,{
	cutin "kafra_02",2;
	setarray '@code,4,1,5;
	setarray '@price,1200,1800,1800;
	callfunc "KafraMain",1,0x1ff,"pay_fild03.gat",387,76,"alberta.gat",31,231,50,800,'@code,'@price;
	close2;
	viewpoint 1,28,229,1,0x0000FF;
	viewpoint 1,113,60,2,0x0000FF;
	cutin "kafra_02",255;
	end;
}

//----------------------------------
// < �A���x���^ - �앬�� >
//----------------------------------

alberta.gat,113,60,6	script	�J�v���E��#alberta2	112,{
	cutin "kafra_06",2;
	setarray '@code,4,1,5;
	setarray '@price,1200,1800,1800;
	callfunc "KafraMain",1,0x1ff,"alberta.gat",117,56,"NULL",0,0,50,800,'@code,'@price;
	close2;
	viewpoint 1,28,229,1,0x0000FF;
	viewpoint 1,113,60,2,0x0000FF;
	cutin "kafra_06",255;
	end;
}

//----------------------------------
// < �A���x���^ - �� >
//----------------------------------

alb2trea.gat,59,69,6	script	�J�v���E��	117,{
	cutin "kafra_01",2;
	callfunc "KafraMain",0,0x1da,0,0,0,0,0,0,50,800;
	end;
}

//----------------------------------
// < �t�F�C���� - �k >
//----------------------------------

payon.gat,175,226,4	script	�J�v���E��	116,{
	cutin "kafra_02",2;
	setarray '@code,6,1,5;
	setarray '@price,1200,1200,1200;
	callfunc "KafraMain",1,0x1df,"payon.gat",207,113,"NULL",0,0,40,800,'@code,'@price;
	end;
}

//----------------------------------
// < �t�F�C���� - �� >
//----------------------------------

payon.gat,181,104,4	script	�J�v���E��	113,{
	cutin "kafra_05",2;
	setarray '@code,6,1,5;
	setarray '@price,1200,1200,1200;
	callfunc "KafraMain",1,0x1df,"payon.gat",160,58,"NULL",0,0,40,800,'@code,'@price;
	end;
}

//----------------------------------
// < �t�F�C���� - �A�[�`���[�� >
//----------------------------------

pay_arche.gat,55,123,4	script	�J�v���E��	114,{
	cutin "kafra_04",2;
	callfunc "KafraMain",1,0x1db,"pay_arche.gat",50,145,"NULL",0,0,40,800;
	end;
}

//----------------------------------
// < �A���f�o���� >
//----------------------------------

aldebaran.gat,143,119,4	script	�J�v���E��	113,{
	cutin "kafra_05",2;
	setarray '@code,3,13,2,1,9;
	setarray '@price,1200,1200,1800,2000,1700;
	callfunc "KafraMain",0,0x1df,"aldebaran.gat",167,112,"NULL",0,0,40,800,'@code,'@price;
	end;
}

//----------------------------------
// < �R���h ���� >
//----------------------------------

cmd_in02.gat,146,180,4	script	�J�v���E��	721,{
	cutin "kafra_07",2;
	setarray '@code,5,12;
	setarray '@price,1800,1200;
	callfunc "KafraMain",2,0x1df,"comodo.gat",209,143,"NULL",0,0,40,800,'@code,'@price;
	end;
}

//----------------------------------
// < �R���h �t�@���X ���� >
//----------------------------------

cmd_fild07.gat,136,134,4	script	�J�v���E��	721,{
	cutin "kafra_07",2;
	setarray '@code,10,5;
	setarray '@price,1200,1200;
	callfunc "KafraMain",2,0x1df,"cmd_fild07.gat",127,134,"NULL",0,0,80,1000,'@code,'@price;
	end;
}

//----------------------------------
// < �R���h > 
//----------------------------------

comodo.gat,195,150,4	script	�J�v���E��	721,{
	cutin "kafra_07",2;
	setarray '@code,5,12,19;
	setarray '@price,1800,1200,1800;
	callfunc "KafraMain",2,0x1df,"comodo.gat",180,151,"NULL",0,0,80,1000,'@code,'@price;
	end;
}

//----------------------------------
// < �I�[�N�_���W�����O >
//----------------------------------

gef_fild10.gat,73,340,5	script	�J�v���E��	117,{
	cutin "kafra_01",2;
	setarray '@code,3,8;
	setarray '@price,1700,1700;
	callfunc "KafraMain",0,0x1da,0,0,0,0,0,0,130,800;
	end;
}

//----------------------------------
// < �~�����j�[���p�z�O >
//----------------------------------

mjolnir_02.gat,82,362,4	script	�J�v���E��	117,{
	cutin "kafra_01",2;
	setarray '@code,1,3;
	setarray '@price,1700,1700;
	callfunc "KafraMain",1,0x1da,0,0,0,0,0,0,100,800;
	end;
}

//----------------------------------
// < �W���m�[ > ������
//----------------------------------

yuno.gat,152,187,4	script	�J�v���E��	113,{
	cutin "kafra_05",2;
	set '@code,8;
	set '@price,1200;
	callfunc "KafraMain",0,0x1ff,"yuno.gat",158,124,"NULL",0,0,40,800,'@code,'@price;
	close2;
	viewpoint 1,327,109,2,0x0000FF;
	viewpoint 1,277,221,3,0x0000FF;
	cutin "kafra_05",255;
	end;
}

//----------------------------------
// < �W���m�[ > �쓌
//----------------------------------

yuno.gat,327,109,4	script	�J�v���E��	113,{
	cutin "kafra_05",2;
	set '@code,8;
	set '@price,1200;
	callfunc "KafraMain",0,0x1ff,"yuno.gat",327,100,"NULL",0,0,40,800,'@code,'@price;
	close2;
	viewpoint 1,152,187,1,0x0000FF;
	viewpoint 1,277,221,3,0x0000FF;
	cutin "kafra_05",255;
	end;
}

//----------------------------------
// < �W���m�[ > �k��
//----------------------------------

yuno.gat,277,221,4	script	�J�v���E��	113,{
	cutin "kafra_05",2;
	set '@code,8;
	set '@price,1200;
	callfunc "KafraMain",0,0x1ff,"yuno.gat",275,229,"NULL",0,0,40,800,'@code,'@price;
	close2;
	viewpoint 1,152,187,1,0x0000FF;
	viewpoint 1,327,109,2,0x0000FF;
	cutin "kafra_05",255;
	end;
}

//----------------------------------
// < �A�}�c >
//----------------------------------

amatsu.gat,102,149,5	script	�J�v���E��#amatsunomal	116,{
	cutin "kafra_02",2;
	mes "[�J�v���E��]";
	mes "�܂����������A���C�ɑ������R��";
	mes "�ǂ��ɂ�����������̂�����c�c";
	mes "���q�l������Ȃɉ����܂Ŋό��ł����H";
	mes "�����������������񂾂���������";
	mes "���Ă������ƁB";
	mes "��C�͗ǂ����A���Ԃ��Y��ł����ˁB";
	next;
	mes "[�J�v���E��]";
	mes "���āA�J�v���T�[�r�X�͂��Ƃ�";
	mes "�ٍ��̒n�ł����q�l�̂��߂�";
	mes "�T�[�r�X���������܂���B";
	mes "��������`���������܂��傤�H";
	next;
	callfunc "KafraMain",3,0x1db,"amatsu.gat",116,94,"NULL",0,0,80,700;
	end;
}

//----------------------------------
// < �R������ >
//----------------------------------

gonryun.gat,159,122,4	script	�J�v���E��	116,{
	cutin "kafra_02",2;
	callfunc "KafraMain",1,0x1db,"gonryun.gat",160,62,"NULL",0,0,80,700;
	end;
}

//----------------------------------
// < �E���o�� >
//----------------------------------

umbala.gat,87,160,5	script	�J�v���E��	721,{
	cutin "kafra_07",2;
	set '@code,10;
	set '@price,1800;
	callfunc "KafraMain",0,0x1d7,"umbala.gat",100,154,"NULL",0,0,80,0,'@code,'@price;
	end;
}

//----------------------------------
// < �j�u���w�C�� >
//----------------------------------

niflheim.gat,202,180,3	script	�J�v���E��	791,{
	mes "[�J�v���E��]";
	mes "��������Ⴂ�܂��c�c";
	mes "�J�v���T�[�r�X�́c�c";
	mes "����ł��F�l�̂��΂ɂ��܂��B";
	mes "��������`�����܂��傤�H";
	next;
	if(select("�q�ɃT�[�r�X","�I��")==2) {
		percentheal 0,-25;
		mes "[�J�v���E��]";
		mes "��X�J�v���T�[�r�X�́c�c ";
		mes "���ł��ǂ��łł��c�c ";
		mes "���q�l�̂��΂Ɂc�c���܂��B";
		mes "�c�c�ł����猈���āc�c";
		mes "�Y��Ȃ��ł��������c�c";
		close;
	}
	if(basicskillcheck() && ((getskilllv(1) < 6 && Job != Job_Summoner) || (getskilllv(5018) < 1 && Job == Job_Summoner))) {
		mes "[�J�v���E��]";
		mes "�q�ɂ́c�c��{�X�L�����x��6��";
		mes "�K�����Ă��痘�p�\�ƂȂ�܂��c�c";
		close;
	}
	else if(Zeny < 150) {
		percentheal -50,-50;
		mes "[�J�v���E��]";
		mes "���q�l�c�c����������܂���B";
		mes "�q�ɗ��p������ 150 Zeny�ł��c�c";
		mes "����Ȃ���΁c�c���Ȃ��̐������c�c";
		mes "���Ɂc�c�����Ă��������c�c";
		close;
	}
	set Zeny,Zeny-150;
	percentheal 0,-10;
	openstorage;
	close;
}

//----------------------------------
// < ���V�� >
//----------------------------------

louyang.gat,210,104,4	script	�J�v���E��	116,{
	cutin "kafra_02",2;
	callfunc "KafraMain",1,0x1db,"louyang.gat",218,97,"NULL",0,0,80,700;
	end;
}

//----------------------------------
// < �A���^�� >
//----------------------------------

ayothaya.gat,212,169,6	script	�J�v���E��	116,{
	cutin "kafra_02",2;
	callfunc "KafraMain",1,0x1db,"ayothaya.gat",217,187,"NULL",0,0,80,700;
	end;
}

//----------------------------------
// < �A�C���u���b�N - �L�� >
//----------------------------------

einbroch.gat,242,205,5	script	�J�v���E��#einbroch1	116,{
	cutin "kafra_02",2;
	callfunc "KafraMain",4,0x1ff,"einbroch.gat",239,197,"NULL",0,0,40,800;
	close2;
	viewpoint 1,242,205,1,0x0000FF;
	viewpoint 1,59,203,2,0x0000FF;
	cutin "kafra_02",255;
	end;
}

//----------------------------------
// < �A�C���u���b�N - ��` >
//----------------------------------

einbroch.gat,59,203,5	script	�J�v���E��#einbroch2	117,{
	cutin "kafra_01",2;
	callfunc "KafraMain",4,0x1ff,"einbroch.gat",239,197,"NULL",0,0,40,800;
	close2;
	viewpoint 1,242,205,1,0x0000FF;
	viewpoint 1,59,203,2,0x0000FF;
	cutin "kafra_01",255;
	end;
}

//----------------------------------
// < �A�C���x�t >
//----------------------------------

einbech.gat,181,132,5	script	�J�v���E��	115,{
	cutin "kafra_03",2;
	callfunc "KafraMain",4,0x1ff,"einbech.gat",181,123,"NULL",0,0,40,850;
	close2;
	viewpoint 1,181,132,1,0x0000FF;
	cutin "kafra_03",255;
	end;
}

//----------------------------------
// < ���q�^���[���k >
//----------------------------------

lighthalzen.gat,191,320,4	script	�J�v���E��	861,{
	cutin "kafra_09",2;
	callfunc "KafraMain",4,0x1df,"lighthalzen.gat",194,313,"NULL",0,0,40,800;
	end;
}

//----------------------------------
// < ���q�^���[���� >
//----------------------------------

lighthalzen.gat,164,100,4	script	�J�v���E��	860,{
	cutin "kafra_08",2;
	callfunc "KafraMain",4,0x1df,"lighthalzen.gat",158,96,"NULL",0,0,40,800;
	end;
}

//----------------------------------
// < ���q�^���[���z�e�� >
//----------------------------------

lhz_in02.gat,237,284,4	script	�J�v���E��	861,{
	cutin "kafra_09",2;
	callfunc "KafraMain",4,0x1df,"lhz_in02.gat",278,214,"NULL",0,0,40,800;
	end;
}

//----------------------------------
// < ���X�R�r�A >
//----------------------------------

moscovia.gat,223,191,3	script	�J�v���E��	114,{
	cutin "kafra_04",2;
	callfunc "KafraMain",1,0x1db,"moscovia.gat",220,193,"NULL",0,0,80,700;
	end;
}

//----------------------------------
// < �u���W���X >
//----------------------------------

brasilis.gat,197,221,3	script	�J�v���E��	112,{
	cutin "kafra_06",2;
	callfunc "KafraMain",1,0x1db,"brasilis.gat",195,259,"NULL",0,0,40,700;
	end;
}

//----------------------------------
// < �f���^ >
//----------------------------------

dewata.gat,202,184,6	script	�J�v���E��	117,{
	cutin "kafra_01",2;
	callfunc "KafraMain",1,0x1db,"dewata.gat",199,177,"NULL",0,0,40,800;
	end;
}

//----------------------------------
// < �|�[�g�}���� >
//----------------------------------

malaya.gat,71,79,4	script	�J�v���E��	581,{
	callfunc "KafraMain",1,0x1db,"malaya.gat",44,54,"NULL",0,0,500,800;
	end;
}

malaya.gat,234,204,4	script	�J�v���E��	581,{
	callfunc "KafraMain",1,0x1db,"malaya.gat",281,211,"NULL",0,0,500,800;
	end;
}

//----------------------------------
// < �v�����e�� - �̂̌��m�M���h >
//----------------------------------

prontera.gat,248,42,0	script	�J�v���E��#ProSword	116,{
	cutin "kafra_02",2;
	mes "[�J�v���E��]";
	mes "��������Ⴂ�܂��A�i���j�J�v���ł��B";
	mes "�����̂Ƃ��茕�m�M���h��";
	mes "��s�v�����e������";
	mes "�q���s�s�u�C�Y���[�h�v��";
	mes "�ړ]���܂����B";
	next;
	mes "[�J�v���E��]";
	mes "��X�i���j�J�v���ł�";
	mes "�����v�����e������C�Y���[�h�܂�";
	mes "���p�� 600 Zeny�ňړ��T�[�r�X��";
	mes "�s���Ă��܂��B";
	next;
	switch (select("���p����","�J�v���|�C���g�m�F","�I��")) {
	case 1:
		if(Zeny<600) {
			mes "[�J�v���E��]";
			mes "���q�l�A����������Ȃ��悤�ł����B";
			break;
		}
		set Zeny,Zeny-600;
		set KAFRA_PIT,KAFRA_PIT+60;
		warp "izlude.gat",94,103;
		end;
	case 2:	//function������R�s�[
		mes "[�J�v���E��]";
		mes strcharinfo(0)+ "�l�̊l���|�C���g�́A";
		mes KAFRA_PIT+ "�_�ł��B";
		next;
		mes "[�J�v���E��]";
		mes "�J�v���|�C���g�͓��J�v���T�[�r�X��";
		mes "�{�Ђŏܕi�ƈ����������\�ł��B";
		mes "����Ƃ��J�v���T�[�r�X����낵��";
		mes "���肢�v���܂��B";
		break;
	case 3:
		mes "[�J�v���E��]";
		mes "���肪�Ƃ��������܂����B";
		break;
	}
	close2;
	cutin "kafra_02",255;
	end;
}

//----------------------------------
// < �C�Y���[�h - �o�C������ >
//----------------------------------

izlu2dun.gat,106,58,4	script	�J�v���E��#Byalan	116,{
	cutin "kafra_02",2;
	callfunc "KafraMain",0,0x1da,0,0,0,0,0,0,40,800;
	end;
}

//----------------------------------
// < �`�����U�[�j�� >
//----------------------------------

lasagna.gat,300,242,4	script	�J�v���E��#lasagna	117,5,5,{
	cutin "kafra_01",2;
	setarray '@code,1,2,20;
	setarray '@price,0,0,0;
	callfunc "KafraMain",1,0x1df,"lasagna.gat",298,239,"NULL",0,0,0,800,'@code,'@price;
	close2;
	cutin "kafra_01",255;
	end;
OnTouch:
	if(DORAM_1QUE == 100) {
		cutin "kafra_01",2;
		mes "[�J�v���E��]";
		mes "�h�����̐V�Ė`���҂���A";
		mes "����ɂ��́B";
		mes "������̓J�v���T�[�r�X�ł��B";
		set DORAM_1QUE,0;
		next;
		cutin "kafra_01",255;
		mes "^009eff�y�C���t�H���[�V�����z";
		mes "�e�n�ɂ���J�v���T�[�r�X�ł�";
		mes "�ʒu�Z�[�u�T�[�r�X��";
		mes "�q�ɃT�[�r�X�A";
		mes "��Ԉړ��T�[�r�X�ȂǁA";
		mes "�`���ɕK�v�ȃT�|�[�g��";
		mes "�󂯂邱�Ƃ��ł��܂��B^000000";
		next;
		cutin "do_su_025",3;
		mes "^009eff�y�C���t�H���[�V�����z";
		mes "�q�ɃT�[�r�X�͏������Ă���";
		mes "�A�C�e����q�ɂɗa���邱�Ƃ�";
		mes "�ł��܂��B";
		mes "�a�����A�C�e���͎�ʂ��Ƃ�";
		mes "�^�u�ɕ������ĕۊǂ���܂��B^000000";
		next;
		cutin "do_su_026",3;
		mes "^009eff�y�C���t�H���[�V�����z";
		mes "�q�ɂɗa�����A�C�e����";
		mes "�ʂ̏ꏊ�̑q�ɂ����";
		mes "���o�����Ƃ��ł��܂��B";
		mes "�܂��A�����A�J�E���g����";
		mes "�ʂ̃L�����N�^�[��";
		mes "���o�����Ƃ��ł��܂��B^000000";
		next;
		cutin "kafra_01",2;
		mes "[�J�v���E��]";
		mes "���x�c�̃I���I����";
		mes "�V�Ė`���҂��񂪗�����";
		mes "�����̂Ƃ���ɗ���悤��";
		mes "�`���ė~�����ƌ����Ă��܂����B";
		next;
		mes "[�J�v���E��]";
		mes "�I���I�����";
		mes "��������쓌�̍L��ɂ��܂��B";
		mes "����̖`���̕��@�ɂ���";
		mes "���N�`���[����Ƃ̂��Ƃł��̂ŁA";
		mes "���ډ���Ă��b�𕷂��Ă݂Ă�";
		mes "�������ł��傤���H";
		next;
		cutin "kafra_01",255;
		mes "^009eff�y�C���t�H���[�V�����z";
		mes "�쓌�̍L��ɂ���";
		mes "�I���I�ɘb�������܂��傤�I^000000";
		viewpoint 1,323,229,1,0xFF0000;
		close;
	}
	end;
}

//----------------------------------
// < ���b�N���b�W >
//----------------------------------

harboro1.gat,291,207,5	script	�J�v���E��#rockridge	117,{
	cutin "kafra_01",2;
	set '@code,1;
	set '@price,2000;
	callfunc "KafraMain",1,0x1db,"harboro1.gat",298,203,"NULL",0,0,40,800,'@code,'@price;
	end;
}