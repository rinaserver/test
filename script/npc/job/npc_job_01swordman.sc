//====================================================================
//Ragnarok Online Swordman jobchange script
//
//�@�� CHANGE_SM -> 0�`1, 0�`4(Old)
//     OLD_CLASS -> �]���O�̐E��
//====================================================================

//==========================================
// �����\������ѓ]�E
//------------------------------------------

izlude_in.gat,74,172,4	script	���m�M���h��#SM	119,{
	if(Upper == UPPER_HIGH && (OLD_CLASS == Job_Knight || OLD_CLASS == Job_Crusader)) {
		if(Job == Job_Novice) {
			mes "[���m�M���h��]";
			mes "�n�n�n�I";
			mes "���܂�ς���Ă��܂��\�[�h�}����";
			mes "�Ȃ肽���Ƃ́A���������Ƃ�";
			mes "��������ˁ[���I";
			next;
			if(getskilllv(1) < 9) {
				mes "[���m�M���h��]";
				mes "�킵�͍��Z��������A";
				mes "������������U���Ă��痈���B";
				mes "�܂��́AJobLv��10�ɂ܂Ő��������āA";
				mes "^0000FF�u��{�X�L���v�̃��x����9�@^000000��";
				mes "���Ă�����Ă��Ƃ��B";
				next;
				mes "[���m�M���h��]";
				mes "������Ƌ����Ă����Ƃ��ȁA";
				mes "^0000FF�u��{�X�L���v^000000�̃��x����";
				mes "^0000FF�u�X�L�����X�g�v^000000�E�B���h�E��";
				mes "�グ�邱�Ƃ��ł���B";
				next;
				mes "[���m�M���h��]";
				mes "�����āA^0000FF�u�X�L�����X�g�v^000000�E�B���h�E��";
				mes "^0000FF�u��{���v^000000�E�B���h�E����";
				mes "^0000FF�uSkill�v^000000�{�^���ŕ\������邩��ȁB";
				next;
				mes "[���m�M���h��]";
				mes "�Ō�ɖY�ꂿ��Ȃ�Ȃ��̂�";
				mes "�X�L���̃��x�����グ��ɂ́A";
				mes "�X�L���|�C���g������U������A";
				mes "^FF0000�u�m��v^000000�{�^����";
				mes "�K�v���Ă��Ƃ���B";
				mes "���ӂ����B";
				next;
				mes "[���m�M���h��]";
				mes "���܂łǂ����Ă������m���";
				mes "���̂܂܂ł̓\�[�h�}���Ƃ���";
				mes "�F�߂���B";
				close;
			}
			mes "[���m�M���h��]";
			mes "�悵�A���Ȃ��ȁB";
			mes "�葱�������ɂ����B";
			mes "�����ɓ]�E�����Ă�낤�B";
			next;
			unequip;
			jobchange Job_Swordman,UPPER_HIGH;
			//setquest 50615;
			//setquest 50670;
			//setquest 50725;
			skill 144,1,0;
			skill 145,1,0;
			skill 146,1,0;
			mes "[���m�M���h��]";
			mes "�悵�A�������܂����ȁB";
			mes "���ꂩ����C�B���T�{��Ȃ�I";
			close;
		}
	}
	if(Upper == UPPER_HIGH) {
		mes "[���m�M���h��]";
		mes "����H";
		mes "�Ȃ񂾁H";
		mes "�킵�͌��m�M���h�̎҂��B";
		next;
		mes "[���m�M���h��]";
		mes "�������Č����񂾁c�c";
		mes "�킵�͍������񂾁B";
		mes "�p�������Ȃ�A���Ă���B";
		close;
	}
	mes "[���m�M���h��]";
	mes "�킵�́A�������m�M���h��";
	mes "�]�E�W�I���̗p���H";
	next;
	switch (select("�\�[�h�}���ɓ]�E����","�\�[�h�}���ɂ��ĕ���","�\�[�h�}���]�E�v���𕷂�","�Ȃ�ł�����܂���")) {
	case 1:
		if(Job == Job_Swordman) {
			mes "[���m�M���h��]";
			mes "���͂͂͂́I";
			mes "�ʔ����W���[�_������ˁ[���I";
			mes "�N�͂����\�[�h�}�����낤�H";
			next;
			mes "[�g�����}���X]";
			mes "�ʔ����z���ȁI";
			mes "�\�[�h�}���ɂȂ����̂Ȃ�A";
			mes "�`���҃A�J�f�~�[��";
			mes "�s���Ă݂�Ƃ������B";
			next;
			mes "[�g�����}���X]";
			mes "���̌������o����";
			mes "�`���҃A�J�f�~�[�̃T�|�[�g��";
			mes "�s���Ă���z�����邩��A";
			mes "�����Ă��炤�Ƃ������I";
			close;
		}
		if(Job != Job_Novice) {
			mes "[���m�M���h��]";
			mes "�͂́I�@�܂������A�ςȂ��ƌ����ȁI";
			mes "�N�͂������̐E�Ƃ�";
			mes "�Ȃ��Ă���ł͂Ȃ����I";
			close;
		}
		break;
	case 2:
		mes "[���m�M���h��]";
		mes "�\�[�h�}���ɂ��Ēm�肽���H";
		mes "�悵�A�������悤�I";
		next;
		mes "[���m�M���h��]";
		mes "�\�[�h�}���̈�ԑ傫�ȓ����́A";
		mes "�ߐڐ�ōŋ��̈З͂�";
		mes "�����ł�����Ă��Ƃ��I";
		mes "�\�[�h�}�����ڋߐ��";
		mes "�ŋ��ȗ��R�͂R�I";
		next;
		mes "[���m�M���h��]";
		mes "1�ځA���E�Ƃɔ�ׂ�";
		mes "HP����荂���I";
		mes "2�ځA�|�Ə���������A�S�Ă�";
		mes "������g����I������󋵂ɂ����";
		mes "�K�v�ȕ����I�ׂ�I";
		next;
		mes "[���m�M���h��]";
		mes "3�ځA�\�[�h�}���̃X�L���́A���";
		mes "���͂ȕ����Ō���^������̂������B";
		mes "�ȒP�Ȑ��������A����ŏ\�����B";
		mes "���̂��Ƃ����ƁA�\�[�h�}���͐��E��";
		mes "��Ԋi�D�����E�ƂŁA��������";
		mes "�����Ȃǂ́A�K�v���Ȃ����炾�I";
		close;
	case 3:
		mes "[���m�M���h��]";
		mes "�\�[�h�}���ɂȂ肽���̂�!?";
		if(Job != Job_Novice) {
			if(Job == Job_Swordman) {
				mes "�c�c���Ă������A";
				mes "�N�͂����\�[�h�}�����낤�c�c�H";
			}
			else {
				mes "�������A�N�͂������̐E�Ƃ�";
				mes "�Ȃ��Ă��邾�낤�H";
			}
			mes "����ł����������c�c�H";
			mes "�܂��A�Ȃ狳���悤�B";
		}
		mes "[���m�M���h��]";
		mes "�\�[�h�}���ɂȂ邽�߂ɂ́A";
		mes "�܂��A^0000FF�u��{�X�L���v�̃��x����9^000000 ��";
		mes "�グ�Ă��炶��Ȃ��Ƒʖڂ��B";
		next;
		mes "[���m�M���h��]";
		mes "�܂��́AJobLv��10�ɂ܂Ő��������āA";
		mes "^0000FF�u��{�X�L���v�̃��x����9^000000 ��";
		mes "���Ă�����Ă��Ƃ��B";
		mes "^0000FF�u��{�X�L���v^000000�̃��x����";
		mes "^0000FF�u�X�L�����X�g�v^000000�E�B���h�E��";
		mes "�グ�邱�Ƃ��ł���B";
		next;
		mes "[���m�M���h��]";
		mes "^0000FF�u�X�L�����X�g�v^000000�E�B���h�E��";
		mes "^0000FF�u��{���v^000000�E�B���h�E����";
		mes "^0000FF�uSkill�v^000000�{�^���ŕ\������邼�B";
		next;
		mes "[���m�M���h��]";
		mes "�Ō�ɖY�ꂿ��Ȃ�Ȃ��̂�";
		mes "�X�L���̃��x�����グ��ɂ́A";
		mes "�X�L���|�C���g������U������A";
		mes "^FF0000�u�m��v^000000�{�^����";
		mes "�K�v���Ă��Ƃ���B";
		mes "���ӂ����B";
		next;
		mes "[���m�M���h��]";
		mes "�܂��A���܌��������Ƃ��ς܂��΁A";
		mes "�\�[�h�}���ɂȂ�v�����S����������A";
		mes "�D���Ȏ��ɂ��ł�";
		mes "�]�E�ł���̂��B";
		close2;
		cutin "start_020_jp.bmp",4;
		end;
	case 4:
		mes "[���m�M���h��]";
		mes "�͂͂́I�N�����Ă���ƁA";
		mes "�킵�̎Ⴂ�����v���o����I";
		close;
	}
	//case1�̑���
	if(CHANGE_SM==0) {
		mes "[���m�M���h��]";
		mes "�\�[�h�}���ɓ]�E���������H";
		mes "�悵�A�Ȃ���";
		mes "�\�����݂�����̂��B";
		next;
		if(select("�]�E�\�����݂�����","��߂�")==2) {
			mes "[���m�M���h��]";
			mes "�������c�c�C���ς������";
			mes "�܂����ȁB";
			close;
		}
		mes "[���m�M���h��]";
		mes "�����ɃT�C�����āc�c�悵�I";
		mes "���̐\�����͂������������悤�B";
		mes "���A�]�E�v���𖞂�������";
		mes "�����]�E�ł��邼�B";
		mes "�]�E�v���𖞂����Ă��邩���ׂ邩�H";
		next;
		if(select("�͂�","������")==2) {
			mes "[���m�M���h��]";
			mes "�]�E�v���ɂ��Ēm��Ȃ�������";
			mes "��������A�킵�ɕ����Ă݂�B";
			mes "���Ƃ́A���������񎦂���������";
			mes "�������������B�ł́A�K�^���F��I";
			close;
		}
		set CHANGE_SM,1;
		mes "[���m�M���h��]";
		mes "�ق��H�@���ĂƁA�m�F���Ă݂悤���H";
		next;
	}
	mes "[���m�M���h��]";
	mes "���ꂶ��A�����\�[�h�}����";
	mes "�]�E�ł��邩�m�F���s�����I";
	next;
	mes "[���m�M���h��]";
	mes "�c�c�ق��B";
	next;
	mes "[���m�M���h��]";
	mes "�c�c�ӂނӂށB";
	next;
	if(getskilllv(1) < 9 || SkillPoint) {
		mes "[���m�M���h��]";
		mes "�����A�N�B�u��{�X�L���v�̃��x�����A";
		mes "�K�萅���ɂȂ��Ă��Ȃ����B";
		mes "�܂��́AJobLv��10�ɂ܂Ő��������āA";
		mes "^0000FF�u��{�X�L���v�̃��x����9^000000 ��";
		mes "���Ă��Ȃ����B";
		next;
		mes "[���m�M���h��]";
		mes "^0000FF�u��{�X�L���v^000000�̃��x����";
		mes "^0000FF�u�X�L�����X�g�v^000000�E�B���h�E��";
		mes "�グ�邱�Ƃ��ł���B";
		mes "^0000FF�u�X�L�����X�g�v^000000�E�B���h�E��";
		mes "^0000FF�u��{���v^000000�E�B���h�E����";
		mes "^0000FF�uSkill�v^000000�{�^���ŕ\������邼�B";
		next;
		mes "[���m�M���h��]";
		mes "�Ō�ɖY�ꂿ��Ȃ�Ȃ��̂�";
		mes "�X�L���̃��x�����グ��ɂ́A";
		mes "�X�L���|�C���g������U������A";
		mes "^FF0000�u�m��v^000000�{�^����";
		mes "�K�v���Ă��Ƃ�����B";
		mes "���ӂ��Ă����B";
		close2;
		cutin "start_020_jp.bmp",4;
		end;
	}
	mes "[���m�M���h��]";
	mes "^0000FF�u��{�X�L���v^000000�̃��x���͏\�������A";
	mes "���������肻�����ȁB";
	mes "���펎�����܂��܂��̂悤�����A";
	mes "���ꂩ��o����ς߂Ζ��Ȃ����낤�I";
	next;
	mes "[���m�M���h��]";
	mes "���߂łƂ��I";
	mes "�N�́A���ꂩ�炻�[�[�ǂ܂�Ƃ���";
	mes "�f���炵���E�ƂɂȂ�킯���I";
	mes "�N���\�[�h�}���ɔC������I";
	next;
	getitem 11025,1;
	unequip;
	jobchange Job_Swordman;
	set CHANGE_SM,0;
	setquest 50165;
	mes "[���m�M���h��]";
	mes "�����āA������󂯎�邪�����I";
	mes "���̃\�[�h�}���̏���ǂ߂΁A";
	mes "�N�̓\�[�h�}���Ƃ���";
	mes "����������ł����邾�낤�I";
	next;
	mes "[���m�M���h��]";
	mes "�\�[�h�}���ɂȂ������Ƃ�������x";
	mes "���j������B���ꂩ��";
	mes "���m�M���h�̂��߁A";
	mes "��������͂�݂��Ă���I";
	close;
OnInit:
	waitingroom "�]�E",0;
	end;
}


//==========================================
// ���n����
//------------------------------------------
//�]�E�����P��
//izlude_in.gat,62,170,6	script	���m�M���h��	85,{
//	if(Job == Job_Swordman) {
//		mes "[���m�M���h��]";
//		mes "�~�܂�I�����͏��S�Ҏ��n�����ꂾ�I";
//		mes "���ɓ]�E�������O�����闝�R�͂Ȃ��I";
//		mes "�A��I";
//		close;
//	}
//	if(Job != Job_Novice) {
//		mes "[���m�M���h��]";
//		mes "���҂��I�������̐E�ƂɂȂ��Ă���";
//		mes "���O���A�����ɗ���񂶂�Ȃ��I";
//		close;
//	}
//	if(getskilllv(1) < 9) {
//		mes "[���m�M���h��]";
//		mes "�~�܂�I���S�҃X�L���|�C���g��";
//		mes "�X�ɂ��Ȃ�Ȃ��f�l�����鏊����Ȃ��I";
//		mes "�X�L���|�C���g���X�ȏ�ɂȂ�����A";
//		mes "�]�E������ɓ��点�邩��ȁB";
//		close;
//	}
//	switch(CHANGE_SM) {
//	case 0:
//		mes "[���m�M���h��]";
//		mes "�~�܂�I���m�]�E������";
//		mes "�󂯂����Ȃ�A�]�E�\������";
//		mes "�����Ă��炾�I";
//		close;
//	default:
//		warp "izlude_in.gat",39,170;
//		end;
//	case 4:
//		mes "[���m�M���h��]";
//		mes "�~�܂�I�܂������̃M���h����";
//		mes "�₢���킹�Ă��炾�I";
//		close;
//	}
//}

//==============================================================
izlude_in.gat,30,175,4	script	���m�M���h��	92,{
	mes "[���m�M���h��]";
	mes "���n�����Ɋւ��āA�ȒP�ɐ������悤�I";
	mes "��[�������āA���ƂŕςȎ���Ƃ�";
	mes "���Ȃ��悤�ɁI";
	next;
	mes "[���m�M���h��]";
	mes "���̎����̖ړI�́A��v�ȑ̗͂Ƌ��x��";
	mes "���_�͂��K�v�ł��錕�m�̍˔\��";
	mes "���邩�ǂ������e�X�g����̂��I";
	mes "�������˔\���Ȃ���΁A";
	mes "�����ŗ����Ă��܂����낤�B";
	next;
	mes "[���m�M���h��]";
	mes "������^33ff55���i����^000000�́A�����[���ȒP���I";
	mes "������̑S�ẴR�[�X��";
	mes "�����ɒʉ߂��āA�Ō��";
	mes "�`�F�b�N�|�C���g�ő҂��Ă��鎎������";
	mes "���i�F������炤�����ł����񂾁B";
	next;
	mes "[���m�M���h��]";
	mes "���΂ɁA�����錾��������A�Ō��";
	mes "�`�F�b�N�|�C���g�ɓ����ł��Ȃ�����";
	mes "�ꍇ�͕s���i�ɂȂ�A�����A�����錾��";
	mes "�������Ȃ�A�e�R�[�X�������";
	mes "�߂�����A�e�`�F�b�N�|�C���g��";
	mes "�֌W�҂ɘb�����炢���B";
	next;
	mes "[���m�M���h��]";
	mes "������͂R�̃R�[�X�ɂȂ��Ă��āA";
	mes "�R�[�X�𗣒E������A�n�����A��";
	mes "�����_���Ȉʒu�ɗ����Ă��܂�����A";
	mes "���ӂ������������B";
	mes "���ꂶ��A�K�^���F��B";
	close;
}

//==============================================================
izlude_in.gat,30,163,0	script	������E��	105,{
	switch(CHANGE_SM) {
	default:
		mes "[������E��]";
		mes "�ށA�ǂ�����ē����Ă����񂾁H";
		close2;
		warp "izlude_in.gat",63,169;
		end;
	case 1:
		mes "[������E��]";
		mes "���m�ɂȂ肽���̂��H�ӂ�A";
		mes "�܂��A�˔\�͂���݂������ȁB";
		mes "���ꂩ��̐l���ɔ�ׂ���A������";
		mes "���́A���Ƃ��Ȃ����낤�I";
		mes "�ْ�����ȁI���O�Ȃ�ł���I";
		close2;
		set CHANGE_SM,2;
		break;
	case 2:
		mes "[������E��]";
		mes "���s�����̂��c";
		mes "����������Ă���";
		close2;
		getitem 512,5;
		set CHANGE_SM,3;
		break;
	case 3:
		mes "[������E��]";
		mes "���߂�ȁI�Ē��킾�h";
		close2;
		break;
	}
	warp "sword_1-1.gat",10,245;
	end;
}

//==============================================================
sword_1-1.gat,7,245,0	script	������T�|�[�^�[#1	45,1,3,{
	end;
OnTouch:
	mes "[������T�|�[�^�[]";
	mes "�󌱐� " +strcharinfo(0)+ "�A�����錾�����܂����H";
	next;
	if(select("�͂�","������")==1) {
		announce "������T�|�[�^�[: �󌱐� " +strcharinfo(0)+ " ��������������܂����B",9;
		warp "izlude_in.gat",65,165;
		end;
	}
	set '@num,strnpcinfo(2);
	switch('@num) {
		case 1: warp "sword_1-1.gat",10,245; break;
		case 2: warp "sword_1-1.gat",11,207; break;
		case 3: warp "sword_1-1.gat",11,169; break;
	}
	end;
}

sword_1-1.gat,8,207,0	duplicate(������T�|�[�^�[#1)	������T�|�[�^�[#2	45,1,1
sword_1-1.gat,8,169,0	duplicate(������T�|�[�^�[#1)	������T�|�[�^�[#3	45,1,1

//==============================================================
sword_1-1.gat,192,244,0	script	������T�|�[�^�[#4	45,1,3,{
	end;
OnTouch:
	set '@num,strnpcinfo(2);
	announce "������T�|�[�^�[: �󌱐� " +strcharinfo(0)+ "�A��" +(('@num==4)? "�P": ('@num==5)? "�Q": "�R")+ "�|�C���g�ʉ߁B",9;
	switch('@num) {
		case 4: warp "sword_1-1.gat",215,244; break;
		case 5: warp "sword_1-1.gat",215,205; break;
		case 6: warp "sword_1-1.gat",215,167; break;
	}
	end;
}

sword_1-1.gat,193,207,0	duplicate(������T�|�[�^�[#4)	������T�|�[�^�[#5	45,1,1
sword_1-1.gat,193,168,0	duplicate(������T�|�[�^�[#4)	������T�|�[�^�[#6	45,1,1

//==============================================================
sword_1-1.gat,230,242,2		script	������T�|�[�^�[#7	105,{
	mes "[������T�|�[�^�[]";
	mes "�����錾������̂��H";
	next;
	if(select("�͂�","������")==1) {
		announce "������T�|�[�^�[: �󌱐� " +strcharinfo(0)+ " ��������������܂����B",9;
		warp "izlude_in.gat",65,165;
		end;
	}
	mes "[������T�|�[�^�[]";
	mes "��[���I";
	mes "�R����Ⴂ�p���[�ŗ����������̂��I";
	close;
}

sword_1-1.gat,230,204,2		duplicate(������T�|�[�^�[#7)	������T�|�[�^�[#8	105

//==============================================================
sword_1-1.gat,230,245,2		script	��ÒS���T�|�[�^�[#1	105,{
	mes "[��ÒS���T�|�[�^�[]";
	mes "��������" +((strnpcinfo(2)==1)? "�P": "�Q")+ "�`�F�b�N�|�C���g���I";
	mes "�̗͂��񕜂��Ă����邩��撣���I";
	heal 1000,0;
	close;
}

sword_1-1.gat,230,207,2		duplicate(��ÒS���T�|�[�^�[#1)	��ÒS���T�|�[�^�[#2	105

//==============================================================
sword_1-1.gat,223,167,4	script	�}���V���^�C��	92,{
	announce "�}���V���^�C��: �󌱐� " +strcharinfo(0)+ "�A�����ɍ��i���܂����B",9;
	set CHANGE_SM,4;
	mes "[�}���V���^�C��]";
	mes "�����̍��i�A���߂łƂ��������܂��I";
	mes "���ɍ��i�̎|�́A";
	mes "�]�E�Ǘ��ۂɓ`���܂����B";
	mes "�������o�āA�����̓]�E�Ǘ��E����";
	mes "�Ƃ���ɍs���ĉ������B";
	close2;
	warp "izlude_in.gat",66,173;
	end;
}

//==============================================================
sword_1-1.gat,16,250,0		script	SM_1stfall	-1,{
	switch(rand(5)) {
		case 0:	warp "sword_1-1.gat",65,56; end;
		case 1:	warp "sword_1-1.gat",29,26; end;
		case 2:	warp "sword_1-1.gat",43,16; end;
		case 3:	warp "sword_1-1.gat",23,112; end;
		case 4:	warp "sword_1-1.gat",58,83; end;
	}
}
sword_1-1.gat,16,251,0		duplicate(SM_1stfall)	#swordwarp6101_a	139,0,1
sword_1-1.gat,19,251,0		duplicate(SM_1stfall)	#swordwarp6101_b	139,0,1
sword_1-1.gat,17,250,0		duplicate(SM_1stfall)	#swordwarp6101_c	139,1,0
sword_1-1.gat,16,238,0		duplicate(SM_1stfall)	#swordwarp6102_a	139,0,1
sword_1-1.gat,19,238,0		duplicate(SM_1stfall)	#swordwarp6102_b	139,0,1
sword_1-1.gat,17,239,0		duplicate(SM_1stfall)	#swordwarp6102_c	139,0,1
sword_1-1.gat,28,247,0		duplicate(SM_1stfall)	#swordwarp6103_a	139,4,0
sword_1-1.gat,33,245,0		duplicate(SM_1stfall)	#swordwarp6103_b	139,0,2
sword_1-1.gat,29,242,0		duplicate(SM_1stfall)	#swordwarp6103_c	139,4,0
sword_1-1.gat,24,244,0		duplicate(SM_1stfall)	#swordwarp6103_d	139,0,2
sword_1-1.gat,38,251,0		duplicate(SM_1stfall)	#swordwarp6104_a	139,0,1
sword_1-1.gat,41,251,0		duplicate(SM_1stfall)	#swordwarp6104_b	139,0,1
sword_1-1.gat,39,250,0		duplicate(SM_1stfall)	#swordwarp6104_c	139,1,0
sword_1-1.gat,38,238,0		duplicate(SM_1stfall)	#swordwarp6105_a	139,0,1
sword_1-1.gat,41,238,0		duplicate(SM_1stfall)	#swordwarp6105_b	139,0,1
sword_1-1.gat,39,239,0		duplicate(SM_1stfall)	#swordwarp6105_c	139,1,0
sword_1-1.gat,54,251,0		duplicate(SM_1stfall)	#swordwarp6106_a	139,0,1
sword_1-1.gat,71,251,0		duplicate(SM_1stfall)	#swordwarp6106_b	139,0,1
sword_1-1.gat,62,250,0		duplicate(SM_1stfall)	#swordwarp6106_c	139,9,0
sword_1-1.gat,62,247,0		duplicate(SM_1stfall)	#swordwarp6107_a	139,8,0
sword_1-1.gat,71,244,0		duplicate(SM_1stfall)	#swordwarp6107_b	139,0,2
sword_1-1.gat,63,242,0		duplicate(SM_1stfall)	#swordwarp6107_c	139,8,0
sword_1-1.gat,54,244,0		duplicate(SM_1stfall)	#swordwarp6107_d	139,0,2
sword_1-1.gat,54,238,0		duplicate(SM_1stfall)	#swordwarp6108_a	139,0,1
sword_1-1.gat,71,238,0		duplicate(SM_1stfall)	#swordwarp6108_b	139,0,1
sword_1-1.gat,62,239,0		duplicate(SM_1stfall)	#swordwarp6108_c	139,9,0
sword_1-1.gat,102,247,0		duplicate(SM_1stfall)	#swordwarp6109_a	139,2,0
sword_1-1.gat,105,245,0		duplicate(SM_1stfall)	#swordwarp6109_b	139,0,2
sword_1-1.gat,103,242,0		duplicate(SM_1stfall)	#swordwarp6109_c	139,2,0
sword_1-1.gat,100,244,0		duplicate(SM_1stfall)	#swordwarp6109_d	139,0,2
sword_1-1.gat,156,249,0		duplicate(SM_1stfall)	#swordwarp6110_a	139,14,0
sword_1-1.gat,156,248,0		duplicate(SM_1stfall)	#swordwarp6110_b	139,14,0
sword_1-1.gat,170,249,0		duplicate(SM_1stfall)	#swordwarp6110_c	139,1,0
sword_1-1.gat,170,248,0		duplicate(SM_1stfall)	#swordwarp6110_d	139,1,0
sword_1-1.gat,156,245,0		duplicate(SM_1stfall)	#swordwarp6111_a	139,14,0
sword_1-1.gat,156,244,0		duplicate(SM_1stfall)	#swordwarp6111_b	139,14,0
sword_1-1.gat,170,245,0		duplicate(SM_1stfall)	#swordwarp6111_c	139,1,0
sword_1-1.gat,170,244,0		duplicate(SM_1stfall)	#swordwarp6111_d	139,1,0
sword_1-1.gat,156,241,0		duplicate(SM_1stfall)	#swordwarp6112_a	139,14,0
sword_1-1.gat,156,240,0		duplicate(SM_1stfall)	#swordwarp6112_b	139,14,0
sword_1-1.gat,170,241,0		duplicate(SM_1stfall)	#swordwarp6112_c	139,1,0
sword_1-1.gat,170,240,0		duplicate(SM_1stfall)	#swordwarp6112_d	139,1,0
sword_1-1.gat,180,251,0		duplicate(SM_1stfall)	#swordwarp6113_a	139,0,1
sword_1-1.gat,183,251,0		duplicate(SM_1stfall)	#swordwarp6113_b	139,0,1
sword_1-1.gat,181,250,0		duplicate(SM_1stfall)	#swordwarp6113_c	139,1,0
sword_1-1.gat,180,238,0		duplicate(SM_1stfall)	#swordwarp6114_a	139,0,1
sword_1-1.gat,183,238,0		duplicate(SM_1stfall)	#swordwarp6114_b	139,0,1
sword_1-1.gat,181,239,0		duplicate(SM_1stfall)	#swordwarp6114_c	139,1,0

//==============================================================
sword_1-1.gat,56,211,0		script	SM_2ndfall	-1,{
	switch(rand(5)) {
		case 0:	warp "sword_1-1.gat",162,120; end;
		case 1:	warp "sword_1-1.gat",94,120; end;
		case 2:	warp "sword_1-1.gat",94,85; end;
		case 3:	warp "sword_1-1.gat",162,85; end;
		case 4:	warp "sword_1-1.gat",130,47; end;
	}
}
sword_1-1.gat,26,212,0		duplicate(SM_2ndfall)	#swordwarp6201_a	139,10,0
sword_1-1.gat,47,212,0		duplicate(SM_2ndfall)	#swordwarp6201_b	139,10,0
sword_1-1.gat,68,212,0		duplicate(SM_2ndfall)	#swordwarp6201_c	139,10,0
sword_1-1.gat,87,212,0		duplicate(SM_2ndfall)	#swordwarp6201_d	139,10,0
sword_1-1.gat,26,210,0		duplicate(SM_2ndfall)	#swordwarp6201_e	139,10,0
sword_1-1.gat,47,210,0		duplicate(SM_2ndfall)	#swordwarp6201_f	139,10,0
sword_1-1.gat,68,210,0		duplicate(SM_2ndfall)	#swordwarp6201_g	139,10,0
sword_1-1.gat,87,210,0		duplicate(SM_2ndfall)	#swordwarp6201_h	139,10,0
sword_1-1.gat,16,206,0		duplicate(SM_2ndfall)	#swordwarp6202_a	139,0,3
sword_1-1.gat,97,206,0		duplicate(SM_2ndfall)	#swordwarp6202_b	139,0,3
sword_1-1.gat,26,203,0		duplicate(SM_2ndfall)	#swordwarp6203_a	139,10,0
sword_1-1.gat,47,203,0		duplicate(SM_2ndfall)	#swordwarp6203_b	139,10,0
sword_1-1.gat,68,203,0		duplicate(SM_2ndfall)	#swordwarp6203_c	139,10,0
sword_1-1.gat,87,203,0		duplicate(SM_2ndfall)	#swordwarp6203_d	139,10,0
sword_1-1.gat,26,201,0		duplicate(SM_2ndfall)	#swordwarp6203_e	139,10,0
sword_1-1.gat,47,201,0		duplicate(SM_2ndfall)	#swordwarp6203_f	139,10,0
sword_1-1.gat,68,201,0		duplicate(SM_2ndfall)	#swordwarp6203_g	139,10,0
sword_1-1.gat,87,201,0		duplicate(SM_2ndfall)	#swordwarp6203_h	139,10,0
sword_1-1.gat,113,212,0		duplicate(SM_2ndfall)	#swordwarp6204_a	139,14,0
sword_1-1.gat,125,212,0		duplicate(SM_2ndfall)	#swordwarp6204_b	139,2,0
sword_1-1.gat,113,210,0		duplicate(SM_2ndfall)	#swordwarp6205_a	139,14,0
sword_1-1.gat,125,210,0		duplicate(SM_2ndfall)	#swordwarp6205_b	139,2,0
sword_1-1.gat,100,206,0		duplicate(SM_2ndfall)	#swordwarp6205_c	139,0,3
sword_1-1.gat,127,206,0		duplicate(SM_2ndfall)	#swordwarp6205_d	139,0,3
sword_1-1.gat,113,203,0		duplicate(SM_2ndfall)	#swordwarp6205_e	139,14,0
sword_1-1.gat,125,203,0		duplicate(SM_2ndfall)	#swordwarp6205_f	139,2,0
sword_1-1.gat,113,201,0		duplicate(SM_2ndfall)	#swordwarp6206_a	139,14,0
sword_1-1.gat,125,201,0		duplicate(SM_2ndfall)	#swordwarp6206_b	139,2,0
sword_1-1.gat,132,212,0		duplicate(SM_2ndfall)	#swordwarp6207_0	139,2,0
sword_1-1.gat,155,212,0		duplicate(SM_2ndfall)	#swordwarp6207_a	139,21,0
sword_1-1.gat,181,212,0		duplicate(SM_2ndfall)	#swordwarp6207_b	139,2,0
sword_1-1.gat,132,210,0		duplicate(SM_2ndfall)	#swordwarp6208_0	139,2,0
sword_1-1.gat,155,210,0		duplicate(SM_2ndfall)	#swordwarp6208_a	139,21,0
sword_1-1.gat,181,210,0		duplicate(SM_2ndfall)	#swordwarp6208_b	139,2,0
sword_1-1.gat,130,206,0		duplicate(SM_2ndfall)	#swordwarp6208_c	139,0,3
sword_1-1.gat,183,206,0		duplicate(SM_2ndfall)	#swordwarp6208_d	139,0,3
sword_1-1.gat,132,203,0		duplicate(SM_2ndfall)	#swordwarp6208_1	139,2,0
sword_1-1.gat,155,203,0		duplicate(SM_2ndfall)	#swordwarp6208_e	139,21,0
sword_1-1.gat,181,203,0		duplicate(SM_2ndfall)	#swordwarp6208_f	139,2,0
sword_1-1.gat,132,201,0		duplicate(SM_2ndfall)	#swordwarp6209_0	139,2,0
sword_1-1.gat,155,201,0		duplicate(SM_2ndfall)	#swordwarp6209_a	139,21,0
sword_1-1.gat,181,201,0		duplicate(SM_2ndfall)	#swordwarp6209_b	139,2,0

//==============================================================
sword_1-1.gat,17,174,0		script	SM_3rdfall	-1,{
	switch(rand(5)) {
		case 0:	warp "sword_1-1.gat",195,15; end;
		case 1:	warp "sword_1-1.gat",195,38; end;
		case 2:	warp "sword_1-1.gat",231,30; end;
		case 3:	warp "sword_1-1.gat",198,65; end;
		case 4:	warp "sword_1-1.gat",196,116; end;
	}
}
sword_1-1.gat,17,174,0		duplicate(SM_3rdfall)	#swordwarp6301_a	139,2,0
sword_1-1.gat,17,163,0		duplicate(SM_3rdfall)	#swordwarp6302_a	139,2,0
sword_1-1.gat,29,171,0		duplicate(SM_3rdfall)	#swordwarp6303_a	139,2,0
sword_1-1.gat,31,168,0		duplicate(SM_3rdfall)	#swordwarp6303_b	139,0,2
sword_1-1.gat,28,166,0		duplicate(SM_3rdfall)	#swordwarp6303_c	139,2,0
sword_1-1.gat,26,168,0		duplicate(SM_3rdfall)	#swordwarp6303_d	139,0,2
sword_1-1.gat,36,169,0		duplicate(SM_3rdfall)	#swordwarp6304_a	139,0,0
sword_1-1.gat,37,169,0		duplicate(SM_3rdfall)	#swordwarp6304_b	139,0,0
sword_1-1.gat,37,168,0		duplicate(SM_3rdfall)	#swordwarp6304_c	139,0,0
sword_1-1.gat,36,168,0		duplicate(SM_3rdfall)	#swordwarp6304_d	139,0,0
sword_1-1.gat,40,175,0		duplicate(SM_3rdfall)	#swordwarp6305_a	139,0,1
sword_1-1.gat,41,175,0		duplicate(SM_3rdfall)	#swordwarp6305_b	139,0,1
sword_1-1.gat,41,171,0		duplicate(SM_3rdfall)	#swordwarp6306_a	139,1,0
sword_1-1.gat,41,170,0		duplicate(SM_3rdfall)	#swordwarp6306_b	139,1,0
sword_1-1.gat,41,167,0		duplicate(SM_3rdfall)	#swordwarp6306_c	139,1,0
sword_1-1.gat,41,166,0		duplicate(SM_3rdfall)	#swordwarp6306_d	139,1,0
sword_1-1.gat,42,169,0		duplicate(SM_3rdfall)	#swordwarp6306_e	139,0,1
sword_1-1.gat,43,170,0		duplicate(SM_3rdfall)	#swordwarp6306_f	139,0,1
sword_1-1.gat,43,167,0		duplicate(SM_3rdfall)	#swordwarp6306_g	139,0,1
sword_1-1.gat,40,162,0		duplicate(SM_3rdfall)	#swordwarp6307_a	139,0,1
sword_1-1.gat,41,162,0		duplicate(SM_3rdfall)	#swordwarp6307_b	139,0,1
sword_1-1.gat,46,175,0		duplicate(SM_3rdfall)	#swordwarp6308_a	139,0,1
sword_1-1.gat,51,175,0		duplicate(SM_3rdfall)	#swordwarp6308_b	139,0,1
sword_1-1.gat,47,174,0		duplicate(SM_3rdfall)	#swordwarp6308_c	139,1,0
sword_1-1.gat,50,174,0		duplicate(SM_3rdfall)	#swordwarp6308_d	139,1,0
sword_1-1.gat,48,173,0		duplicate(SM_3rdfall)	#swordwarp6308_e	139,0,1
sword_1-1.gat,49,173,0		duplicate(SM_3rdfall)	#swordwarp6308_f	139,0,1
sword_1-1.gat,46,162,0		duplicate(SM_3rdfall)	#swordwarp6309_a	139,0,1
sword_1-1.gat,51,162,0		duplicate(SM_3rdfall)	#swordwarp6309_b	139,0,1
sword_1-1.gat,47,163,0		duplicate(SM_3rdfall)	#swordwarp6309_c	139,1,0
sword_1-1.gat,50,163,0		duplicate(SM_3rdfall)	#swordwarp6309_d	139,1,0
sword_1-1.gat,48,164,0		duplicate(SM_3rdfall)	#swordwarp6309_e	139,0,1
sword_1-1.gat,49,164,0		duplicate(SM_3rdfall)	#swordwarp6309_f	139,0,1
sword_1-1.gat,54,170,0		duplicate(SM_3rdfall)	#swordwarp6310_a	139,0,1
sword_1-1.gat,55,170,0		duplicate(SM_3rdfall)	#swordwarp6310_b	139,0,1
sword_1-1.gat,54,167,0		duplicate(SM_3rdfall)	#swordwarp6310_c	139,0,1
sword_1-1.gat,55,167,0		duplicate(SM_3rdfall)	#swordwarp6310_d	139,0,1
sword_1-1.gat,53,169,0		duplicate(SM_3rdfall)	#swordwarp6310_e	139,1,0
sword_1-1.gat,53,168,0		duplicate(SM_3rdfall)	#swordwarp6310_f	139,1,0
sword_1-1.gat,56,169,0		duplicate(SM_3rdfall)	#swordwarp6310_g	139,1,0
sword_1-1.gat,56,168,0		duplicate(SM_3rdfall)	#swordwarp6310_h	139,1,0
sword_1-1.gat,58,175,0		duplicate(SM_3rdfall)	#swordwarp6311_a	139,0,1
sword_1-1.gat,59,174,0		duplicate(SM_3rdfall)	#swordwarp6311_b	139,1,0
sword_1-1.gat,60,173,0		duplicate(SM_3rdfall)	#swordwarp6311_c	139,0,1
sword_1-1.gat,61,172,0		duplicate(SM_3rdfall)	#swordwarp6311_d	139,1,0
sword_1-1.gat,58,162,0		duplicate(SM_3rdfall)	#swordwarp6312_a	139,0,1
sword_1-1.gat,59,163,0		duplicate(SM_3rdfall)	#swordwarp6312_b	139,1,0
sword_1-1.gat,60,164,0		duplicate(SM_3rdfall)	#swordwarp6312_c	139,0,1
sword_1-1.gat,61,165,0		duplicate(SM_3rdfall)	#swordwarp6312_d	139,1,0
sword_1-1.gat,76,172,0		duplicate(SM_3rdfall)	#swordwarp6313_a	139,1,0
sword_1-1.gat,77,173,0		duplicate(SM_3rdfall)	#swordwarp6313_b	139,0,1
sword_1-1.gat,78,174,0		duplicate(SM_3rdfall)	#swordwarp6313_c	139,1,0
sword_1-1.gat,79,175,0		duplicate(SM_3rdfall)	#swordwarp6313_d	139,0,1
sword_1-1.gat,76,165,0		duplicate(SM_3rdfall)	#swordwarp6314_a	139,1,0
sword_1-1.gat,77,164,0		duplicate(SM_3rdfall)	#swordwarp6314_b	139,0,1
sword_1-1.gat,78,163,0		duplicate(SM_3rdfall)	#swordwarp6314_c	139,1,0
sword_1-1.gat,79,162,0		duplicate(SM_3rdfall)	#swordwarp6314_d	139,0,1
sword_1-1.gat,94,175,0		duplicate(SM_3rdfall)	#swordwarp6315_a	139,0,1
sword_1-1.gat,95,174,0		duplicate(SM_3rdfall)	#swordwarp6315_b	139,1,0
sword_1-1.gat,98,174,0		duplicate(SM_3rdfall)	#swordwarp6315_c	139,1,0
sword_1-1.gat,99,175,0		duplicate(SM_3rdfall)	#swordwarp6316_d	139,0,1
sword_1-1.gat,96,169,0		duplicate(SM_3rdfall)	#swordwarp6317_a	139,0,0
sword_1-1.gat,97,169,0		duplicate(SM_3rdfall)	#swordwarp6317_b	139,0,0
sword_1-1.gat,97,168,0		duplicate(SM_3rdfall)	#swordwarp6317_c	139,0,0
sword_1-1.gat,96,168,0		duplicate(SM_3rdfall)	#swordwarp6317_d	139,0,0
sword_1-1.gat,94,162,0		duplicate(SM_3rdfall)	#swordwarp6318_a	139,0,1
sword_1-1.gat,95,163,0		duplicate(SM_3rdfall)	#swordwarp6318_b	139,1,0
sword_1-1.gat,98,163,0		duplicate(SM_3rdfall)	#swordwarp6318_c	139,1,0
sword_1-1.gat,99,162,0		duplicate(SM_3rdfall)	#swordwarp6318_d	139,0,1
sword_1-1.gat,114,175,0		duplicate(SM_3rdfall)	#swordwarp6319_a	139,0,1
sword_1-1.gat,115,175,0		duplicate(SM_3rdfall)	#swordwarp6319_b	139,0,1
sword_1-1.gat,114,162,0		duplicate(SM_3rdfall)	#swordwarp6320_a	139,0,1
sword_1-1.gat,115,162,0		duplicate(SM_3rdfall)	#swordwarp6320_b	139,0,1
sword_1-1.gat,126,175,0		duplicate(SM_3rdfall)	#swordwarp6321_a	139,0,1
sword_1-1.gat,127,175,0		duplicate(SM_3rdfall)	#swordwarp6321_b	139,0,1
sword_1-1.gat,126,162,0		duplicate(SM_3rdfall)	#swordwarp6323_a	139,0,1
sword_1-1.gat,127,162,0		duplicate(SM_3rdfall)	#swordwarp6323_b	139,0,1
sword_1-1.gat,160,174,0		duplicate(SM_3rdfall)	#swordwarp6324_a	139,0,2
sword_1-1.gat,161,174,0		duplicate(SM_3rdfall)	#swordwarp6324_b	139,0,2
sword_1-1.gat,160,163,0		duplicate(SM_3rdfall)	#swordwarp6325_a	139,0,2
sword_1-1.gat,161,163,0		duplicate(SM_3rdfall)	#swordwarp6325_b	139,0,2
sword_1-1.gat,168,175,0		duplicate(SM_3rdfall)	#swordwarp6326_a	139,0,2
sword_1-1.gat,169,175,0		duplicate(SM_3rdfall)	#swordwarp6326_b	139,0,2
sword_1-1.gat,168,162,0		duplicate(SM_3rdfall)	#swordwarp6327_a	139,0,2
sword_1-1.gat,169,162,0		duplicate(SM_3rdfall)	#swordwarp6327_b	139,0,2
sword_1-1.gat,176,174,0		duplicate(SM_3rdfall)	#swordwarp6328_a	139,0,2
sword_1-1.gat,177,174,0		duplicate(SM_3rdfall)	#swordwarp6328_b	139,0,2
sword_1-1.gat,178,173,0		duplicate(SM_3rdfall)	#swordwarp6328_c	139,1,0
sword_1-1.gat,178,172,0		duplicate(SM_3rdfall)	#swordwarp6328_d	139,1,0
sword_1-1.gat,181,174,0		duplicate(SM_3rdfall)	#swordwarp6328_e	139,2,0
sword_1-1.gat,179,169,0		duplicate(SM_3rdfall)	#swordwarp6329_a	139,3,0
sword_1-1.gat,179,168,0		duplicate(SM_3rdfall)	#swordwarp6329_b	139,3,0
sword_1-1.gat,182,169,0		duplicate(SM_3rdfall)	#swordwarp6329_c	139,0,2
sword_1-1.gat,183,169,0		duplicate(SM_3rdfall)	#swordwarp6329_d	139,0,2
sword_1-1.gat,181,167,0		duplicate(SM_3rdfall)	#swordwarp6329_e	139,1,0
sword_1-1.gat,181,166,0		duplicate(SM_3rdfall)	#swordwarp6329_f	139,1,0
sword_1-1.gat,183,167,0		duplicate(SM_3rdfall)	#swordwarp6329_g	139,0,1
sword_1-1.gat,176,163,0		duplicate(SM_3rdfall)	#swordwarp6330_a	139,0,2
sword_1-1.gat,177,163,0		duplicate(SM_3rdfall)	#swordwarp6330_b	139,0,2
sword_1-1.gat,181,163,0		duplicate(SM_3rdfall)	#swordwarp6330_c	139,2,0