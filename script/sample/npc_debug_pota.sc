// �f�o�b�N�]��
prontera.gat,154,195,4	script	�|�^�q	115,{
	cutin "kafra_03",2;
	mes "[�|�^�q]";
	mes "����ɂ��́B�|�^�q�ł��B";
	mes "�F����𖳗��Ń_���W�����ɓ]�����č����グ�܂���B";
	mes "�|�^�����񏤔��オ������ł��ˁG�G";
	mes "�]�����č����グ�܂��傤���H";
	next;
	if(select("���肢���܂�","���������ł�") == 2) {
		mes "[�|�^�q]";
		mes "���ł������p���Ă��������ˁB";
		close2;
		cutin "kafra_03",255;
		end;
	}
	mes "[�|�^�q]";
	mes "�܂��͒n���I��ł��������B";
	next;
	set @menu,select("�v�����e��","�����N","�O���X�g�w�C��","�A���f�o����","�Q�t�F��","�C�Y���[�h","�A���x���^",
	                 "�t�F�C����","���e�B�G","�R���h","�W���m�[","�A�}�c","�R������","�M���h�_���W����","����ς�߂�");
	if(@menu != 15) {
		mes "[�|�^�q]";
		mes "�s�������ꏊ��I��ł��������B";
		next;
	}

	switch(@menu) {
	case 1:
		switch(select("�n�����HB1F","�n�����HB2F","�n�����HB3F","�n�����HB4F","���{�̐X1",
		              "���{�̐X2","���{�̐X3","����ς�߂�")) {
			case 1: warp "prt_sewb1",131,247; end;
			case 2: warp "prt_sewb2",19,19;   end;
			case 3: warp "prt_sewb3",180,169; end;
			case 4: warp "prt_sewb4",100,192; end;
			case 5: warp "prt_maze01",176,7;  end;
			case 6: warp "prt_maze02",94,19;  end;
			case 7: warp "prt_maze03",23,8;   end;
		}
		break;

	case 2:
		switch(select("�X�t�B���N�X1F","�X�t�B���N�X2F","�X�t�B���N�X3F","�X�t�B���N�X4F","�X�t�B���N�X5F",
		              "�s���~�b�h1F","�s���~�b�h2F","�s���~�b�h3F","�s���~�b�h4F","�a�n��1","�a�n��2","����ς�߂�")) {
			case 1:  warp "in_sphinx1",289,9;  end;
			case 2:  warp "in_sphinx2",149,81; end;
			case 3:  warp "in_sphinx3",210,54; end;
			case 4:  warp "in_sphinx4",10,222; end;
			case 5:  warp "in_sphinx5",100,99; end;
			case 6:  warp "moc_pryd01",192,9;  end;
			case 7:  warp "moc_pryd02",10,192; end;
			case 8:  warp "moc_pryd03",100,92; end;
			case 9:  warp "moc_pryd04",18,187; end;
			case 10: warp "anthell01",35,262;  end;
			case 11: warp "anthell02",34,263;  end;
		}
		break;

	case 3:
		switch(select("�C���@�O","�Ï�1F","�Ï�2F","�R�m�c1F","�R�m�c2F","���O","�J�^�R��","�K�i",
		              "�n�����HB1F","�n�����HB2F","�n�����HB3F","�n�����HB4F","�ŉ��w�n�����AB1F","�ŉ��w�n�����AB2F",
		              "�č�B1F","�č�B2F","����ς�߂�")) {
			case 1:  warp "glast_01",200,125;  end;
			case 2:  warp "glast_01",200,336;  end;
			case 3:  warp "gl_cas01",199,29;   end;
			case 4:  warp "gl_cas02",104,25;   end;
			case 5:  warp "gl_knt01",150,15;   end;
			case 6:  warp "gl_knt02",157,287;  end;
			case 7:  warp "gl_chyard",147,15;  end;
			case 8:  warp "gl_step",12,7;      end;
			case 9:  warp "gl_sew01",258,274;  end;
			case 10: warp "gl_sew02",29,270;   end;
			case 11: warp "gl_sew03",171,283;  end;
			case 12: warp "gl_sew04",68,277;   end;
			case 13: warp "gl_dun01",133,271;  end;
			case 14: warp "gl_dun02",224,274;  end;
			case 15: warp "gl_prison",17,70;   end;
			case 16: warp "gl_prison1",150,14; end;
		}
		break;

	case 4:
		switch(select("���v��1F","���v��2F","���v��3F","���v��4F","���v��B1F","���v��B2F",
		              "���v��B3F","���v��B4F","����ς�߂�")) {
			case 1: warp "c_tower1",199,159;   end;
			case 2: warp "c_tower2",268,26;    end;
			case 3: warp "c_tower3",65,147;    end;
			case 4: warp "c_tower4",189,39;    end;
			case 5: warp "alde_dun01",171,158; end;
			case 6: warp "alde_dun02",128,169; end;
			case 7: warp "alde_dun03",277,178; end;
			case 8: warp "alde_dun04",203,220; end;
		}
		break;

	case 5:
		switch(select("�_���W����B1F","�_���W����B2F","�_���W����B3F","�_���W����B4F","�~�j���[���p�BB1F",
		              "�~�j���[���p�BB2F","�~�j���[���p�BB3F","�I�[�N�n�����A1","�I�[�N�n�����A2","����ς�߂�")) {
			case 1: warp "gef_dun00",104,99;  end;
			case 2: warp "gef_dun01",115,236; end;
			case 3: warp "gef_dun02",106,132; end;
			case 4: warp "gef_dun03",203,204; end;
			case 5: warp "mjo_dun01",52,17;   end;
			case 6: warp "mjo_dun02",381,343; end;
			case 7: warp "mjo_dun03",302,262; end;
			case 8: warp "orcsdun01",32,170;  end;
			case 9: warp "orcsdun02",180,17;  end;
		}
		break;

	case 6:
		switch(select("�C�ꓴ�A��w","�C�ꓴ�A��w","�C�ꓴ�A�O�w","�C�ꓴ�A�l�w","�C��_�a","����ς�߂�")) {
			case 1: warp "iz_dun00",168,168; end;
			case 2: warp "iz_dun01",41,37;   end;
			case 3: warp "iz_dun02",236,204; end;
			case 4: warp "iz_dun03",32,63;   end;
			case 5: warp "iz_dun04",26,27;   end;
		}
		break;

	case 7:
		switch(select("���v�D��w","���v�D��w","�^�[�g���A�C�����h","�^�[�g���A�C�����h�_���W����",
		              "�^�[�g���A�C�����h�z����","�^�[�g���A�C�����h�v�z�{","����ς�߂�")) {
			case 1: warp "treasure01",69,24;  end;
			case 2: warp "treasure02",102,27; end;
			case 3: warp "tur_dun01",154,46;  end;
			case 4: warp "tur_dun02",148,264; end;
			case 5: warp "tur_dun03",132,189; end;
			case 6: warp "tur_dun04",100,192; end;
		}
		break;

	case 8:
		switch(select("�n�����AB1F","�n�����AB2F","�n�����AB3F","�n�����@1","�n�����@2","����ς�߂�")) {
			case 1: warp "pay_dun00",21,183;  end;
			case 2: warp "pay_dun01",19,33;   end;
			case 3: warp "pay_dun02",19,63;   end;
			case 4: warp "pay_dun03",155,159; end;
			case 5: warp "pay_dun04",98,205;  end;
		}
		break;

	case 9:
		switch(select("��������H��q��","��������H�ꕪ�ޏ�","����ς�߂�")) {
			case 1: warp "xmas_dun01",205,15;  end;
			case 2: warp "xmas_dun02",129,133; end;
		}
		break;

	case 10:
		switch(select("�����A�J��","�k���A�������_","�����A�}�I","����ς�߂�")) {
			case 1: warp "beach_dun",266,67;  end;
			case 2: warp "beach_dun2",154,25; end;
			case 3: warp "beach_dun3",23,260; end;
		}
		break;

	case 11:
		switch(select("�m�[�N���[�h��w","�m�[�N���[�h��w","����ς�߂�")) {
			case 1: warp "mag_dun01",126,68; end;
			case 2: warp "mag_dun02",47,30;  end;
		}
		break;

	case 12:
		switch(select("��̖��{","�n������","�A�}�c�n���_��","����ς�߂�")) {
			case 1: warp "ama_dun01",228,9;   end;
			case 2: warp "ama_dun02",31,41;   end;
			case 3: warp "ama_dun03",195,123; end;
		}
		break;

	case 13:
		switch(select("����D1","����D2","����D3","����ς�߂�")) {
			case 1: warp "gon_dun01",154,45; end;
			case 2: warp "gon_dun02",26,114; end;
			case 3: warp "gon_dun03",68,8;   end;
		}
		break;

	case 14:
		switch(select("�t�F�C����","�A���f�o����","�v�����e��","�Q�t�F��","����ς�߂�")) {
			case 1: warp "gld_dun01",120,23; end;
			case 2: warp "gld_dun02",25,160; end;
			case 3: warp "gld_dun03",44,37;  end;
			case 4: warp "gld_dun04",110,28; end;
		}
		break;
	}
	mes "[�|�^�q]";
	mes "���ł������p���Ă��������ˁB";
	close2;
	cutin "kafra_03",255;
	end;
}