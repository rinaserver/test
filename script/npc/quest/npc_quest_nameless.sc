//==============================================================================
// Ragnarok Online Nameless Island Script     by Blaze
//==============================================================================

//============================================================
// �����Ȃ����̔閧�N�G�X�g
//- Registry -------------------------------------------------
// NAME_1QUE -> 0�`25
//------------------------------------------------------------
airplane_01.gat,90,63,0	script	��s�D��#name	139,3,3,{
	if((PRT_2QUE != 36 && PRT_2QUE != 45 && PRT_2QUE != 56 && PRT_2QUE != 61) || VE_3QUE < 25 || BaseLevel < 80 || NAME_1QUE)
		end;
	hideoffnpc "�v��#name";
	mes "[????]";
	mes strcharinfo(0)+ "�l�ł��ˁH";
	mes "���҂����Ă���܂����B";
	mes "^668822�v�����e���吹��^000000�ŁA";
	mes "^668822�o���v�_��^000000�l�����҂��ł��B";
	mes "���}�A�吹���ɂ��z�����������B";
	set NAME_1QUE,1;
	close2;
	hideonnpc "�v��#name";
	end;
}

airplane_01.gat,95,61,3	script	�v��#name	899,{
	end;
OnInit:
	hideonnpc;
	end;
}

cmd_in02.gat,174,89,7	script	���}�Ȓj	97,{
	if(NAME_1QUE < 2) {
		mes "[�����q�X]";
		mes "��΂��ȁc�c�܂��������c�c";
		mes "����͍������Ȃ����H";
		mes "�������炢�������ɏ������Ă���Ă�";
		mes "��������Ȃ����c�c";
		close;
	}
	if(NAME_1QUE > 2) {
		mes "[�����q�X]";
		mes "�܂��A�������I";
		mes "����͂܂����ȁc�c";
		close;
	}
	mes "[�����q�X]";
	mes "���Ă��āc�c";
	mes "�S���ł����畉�������ȁc�c";
	mes "�c�c�c�c�c�c�c�c";
	mes "�c�c�c�c�c�c�c�c�c�c";
	mes "����A����͂Ђǂ��I";
	next;
	menu "���A���́c�c",-;
	mes "[�����q�X]";
	mes "��H�@�������H";
	next;
	menu "^668822�o���v�_��^000000�́c�c",-;
	mes "[�����q�X]";
	mes "�����A���܂ꂽ�l���B";
	mes "�����ˁA�ςȏ�������������āB";
	mes "�ɂ���������";
	mes "�����������Ă��񂾂��c�c";
	mes "�����ڂ�ڂ낾��B";
	next;
	mes "[�����q�X]";
	mes "���āA�������ցB";
	mes "�����͐l�ڂ���������ˁc�c";
	close2;
	set NAME_1QUE,3;
	warp "cmd_in02.gat",110,53;
	end;
}

cmd_in02.gat,111,52,3	script	���}�Ȓj	97,{
	if(NAME_1QUE < 3) {
		mes "[�����q�X]";
		mes "�ӂ��c�c";
		mes "�������ȁc�c";
		close;
	}
	if(NAME_1QUE > 3) {
		mes "[�����q�X]";
		mes "�v�����e����^668822�o���v�_��^000000�l��";
		mes "�`���Ă���B";
		mes "���̕��Ȃ炫���Ɖ���";
		mes "�΍���l���Ă���邳�B";
		next;
		mes "[�����q�X]";
		mes "���͂�����Ǝ؋���";
		mes "�肪�ӂ������ĂĂȁc�c";
		mes "�ǂ��������̂��c�c";
		close;
	}
	mes "[�����q�X]";
	mes "�����Ȃ�b���Ă����v���B";
	mes "�c�c���āA��قǓ��肵����񂾂��A";
	mes "���ʐE�̐l�������������ɂ��āA";
	mes "��̏��𓾂��B";
	next;
	mes "[�����q�X]";
	mes "��́A�s���s���ɂȂ���";
	mes "���ʐE�̕����A���鏗���ɉ��";
	mes "�x��S�����痣�ꂽ���B";
	mes "������́A���̌�傫�ȑ܂�";
	mes "�S���������l�����̕��ɍs���̂�";
	mes "�ڌ�����Ă��鎖�B";
	next;
	mes "[�����q�X]";
	mes "���̓�̏�񂩂�l���Ă݂�ƁA";
	mes "���ʐE�̕��́A���҂��ɂ����";
	mes "���̕��ɗU�����ꂽ�̂�";
	mes "���R�Ȑ������낤�B";
	next;
	menu "���̕��ƌ����܂��ƁH",-;
	mes "[�����q�X]";
	mes "�������琼�ɍs���Ƃ����ɊC���B";
	mes "�ƂȂ�ƑD���g�����c�c";
	mes "�Ȃ�A�ŗL�͌��Ƃ��Ă�";
	mes "�ߗׂ́u^224422�A���i�x���c����^000000�v���낤�B";
	next;
	mes "[�����q�X]";
	mes "�ł́A���̏���";
	mes "�v�����e����^668822�o���v�_��^000000�l��";
	mes "�`���Ă���B";
	mes "���̕��Ȃ炫���Ɖ���";
	mes "�΍���l���Ă���邳�B";
	set NAME_1QUE,4;
	close;
}

ra_in01.gat,308,59,1	script	�]�ƈ�	930,{
	if(NAME_1QUE > 6) {
		mes "[�]�ƈ�]";
		mes "�����̗����̓��w���ň�ԁc�c";
		mes "�����A�A���i�x���c������";
		mes "��Ԕ�����������������������";
		mes "���������Ă܂��B";
		close;
	}
	mes "[�]�ƈ�]";
	mes "����ɂ��́I";
	mes "���w���̕�΁A�u���w���̖��o�v";
	mes "�ւ悤�����I";
	mes "���������ǂ����B";
	if(NAME_1QUE != 6)
		close;
	next;
	mes "[�]�ƈ�]";
	mes "���H���ł����H";
	mes "����Ƃ��A���̌�p�ł����H";
	next;
	if(select("�H���ɗ��܂���","���ɗp������܂�")==2) {
		mes "[�]�ƈ�]";
		mes "�͂��A�������܂�܂����B";
		mes "�ł́A���������ǂ����B";
		close;
	}
	mes "[�]�ƈ�]";
	mes "�͂��A�������܂�܂����B";
	mes "����l�l�ł��傤���H";
	next;
	menu "�͂�",-;
	mes "[�]�ƈ�]";
	mes "�ł́A������ւǂ����B";
	close2;
	set NAME_1QUE,7;
	warp "ra_in01.gat",303,43;
	end;
}

ra_in01.gat,301,43,0	script	#���w���̖��o	139,3,3,{
	if(NAME_1QUE != 7)
		close;
	mes "[�]�ƈ�]";
	mes "�������͂ǂ��Ȃ���܂����H";
	mes "�����̓x�C���X���犈���̗ǂ�����";
	mes "�����Ă���܂��āA�����̎����̈�i�A";
	mes "�u�x�C���X�Y�V�}�g�Q���̐��t�����v";
	mes "�������\�o���܂��B";
	next;
	menu "�ł́A�����",-;
	mes "[�]�ƈ�]";
	mes "�������܂�܂����B";
	mes "���l�i�� ^9933CC3000z^000000�ł������܂��B";
	mes "�����A���p�ӂ������܂��B";
	next;
	mes "-���������ď]�ƈ���";
	mes "�@�~�[�̕��֎p��������-";
	next;
	mes "-������҂��Ă���ԁA";
	mes "�@����̉�b�Ɏ��𐟂܂���ƁA";
	mes "�@�����[���b���������Ă���-";
	next;
	mes "[�Ⴂ���̒j]";
	mes "�c�c�c�c�c�c�c�c";
	mes "�����A�{�����B";
	mes "���̑O�A���̐H�ނƌ�����";
	mes "�u�x�C���X�Y�����V�}�g�Q���v";
	mes "��H�ׂ��񂾁B";
	next;
	mes "[�̂����Ȑ��̒j]";
	mes "�ق��c�c�Ȃ�A";
	mes "�u�x�C���X�Y�����V�}�g�Q���v�ō����";
	mes "�u�x�C���X�Y�����V�}�g�Q���W���[�X�v";
	mes "������ł݂����H";
	next;
	mes "[���}�Ȑ��̒j]";
	mes "�����܂����ȁ`";
	mes "10�N��1�C�����Ȃ���������";
	mes "�u�x�C���X�Y�����V�}�g�Q���v��";
	mes "������W���[�X�����߂�Ȃ�āc�c";
	mes "�܂����������Ă����܂��`";
	next;
	mes "[�Ⴂ���̒j]";
	mes "���������̂��Ȃ񂾂��A";
	mes "���̃W���[�X�͂��΂炵�������B";
	mes "���ɋ��������܂�A���̐����c�c";
	mes "����ȕ��ɕς���Ă��܂����B";
	mes "�ӂӂӁB";
	next;
	mes "[���}�Ȑ��̒j]";
	mes "���`�H�@�����܂�!?";
	mes "���ׂōA������Ă����̂���";
	mes "�v���Ă����ǁA���̃W���[�X��";
	mes "�����������́H";
	next;
	mes "[�̂����Ȑ��̒j]";
	mes "���̒������W���[�X��";
	mes "�ǂ�����Ď�ɓ��ꂽ�񂾁H";
	mes "�\�񂵂Ă���q��";
	mes "�������񂢂�͂������c�c";
	next;
	mes "[�Ⴂ���̒j]";
	mes "����͋��R�Ȃ񂾂��c�c";
	mes "�x�C���X�̂������ɓ������񂾁B";
	mes "�����ŁA�ςȘb�𕷂����񂾁B";
	mes "^DD7799�쓌�̊C�ӂ���";
	mes "�������W�c�����q���ė��āA";
	mes "�x�����ɕ߂܂���^000000���ĂȁB";
	next;
	mes "[�Ⴂ���̒j]";
	mes "����ŁA���̑����Ɋ������܂�A";
	mes "�ٍ��̋���߂����܂܂̋��t�B��";
	mes "����̂ł͂Ȃ����Ǝv���A";
	mes "���̌���ɒ��ڍs���Ă݂��񂾁B";
	next;
	mes "[���}�Ȑ��̒j]";
	mes "�ւ��`";
	mes "�N�̐H�ו��ɑ΂��鎷���͂������ˁB";
	mes "�{���Ȃ̂��킩��Ȃ������̉\�Ȃ̂�";
	mes "���ۂɍs���Ɉڂ��Ȃ�āB";
	next;
	mes "[�Ⴂ���̒j]";
	mes "�Ȃ��ɁA���傤�ǉɂ������������B";
	mes "�Ƃ肠�����A���̌���ɍs���Ă݂�ƁA";
	mes "�m���ɉ������A�����߂܂��Ă����B";
	mes "�܂��A������͕����Ă����āA";
	mes "���t��T���Ă݂���A��l��";
	mes "�����^��ł����̂��������B";
	next;
	mes "[�Ⴂ���̒j]";
	mes "�������������Ă��Ȃ�����";
	mes "�����������Ă��������c�c";
	mes "�Ȃ�ƃx�C���X�Y�����V�}�g�Q����";
	mes "�������񂾁I";
	mes "�V���č�������������������I";
	next;
	mes "[�Ⴂ���̒j]";
	mes "���t�͂��̋����ǂ�Ȃɑf���炵����";
	mes "�悭�m��Ȃ���������A";
	mes "�����Ă�������B";
	mes "����ƁA�킴�킴���������^�񂾎���";
	mes "���������炵���ĂȁA�Ȃ��";
	mes "�^�_�ŏ����Ă��ꂽ�񂾂�B";
	next;
	mes "[�̂����Ȑ��̒j]";
	mes "�������A�H�ו��ɖڂ�����";
	mes "���Ȃ��炵�����b�ł��ˁc�c";
	mes "�����Ɨ]�v�Ȏ������킸��";
	mes "�����Ŕ�������Ă��܂����낤�ˁB";
	mes "�n�n�n�B";
	next;
	mes "[�Ⴂ���̒j]";
	mes "���₢��A��l�Ƃ�";
	mes "���Ɠ����󋵂ɂȂ��";
	mes "���̊����䂦�A�������������Ǝv���B";
	mes "����͉��̉^���ǂ������B";
	mes "�������ꂾ���̘b���B";
	mes "�t�t�t�B";
	next;
	mes "-�c�c�c�c�c�c�c�c";
	mes "�@���ꂩ���3�l��";
	mes "�@�y�������ɘb�����Ă���-";
	next;
	mes "[�]�ƈ�]";
	mes "���炢�����܂��B";
	mes "�u�x�C���X�Y�V�}�g�Q���̐��t�����v";
	mes "�ł��B";
	mes "�ł́A���������ǂ����B";
	next;
	if(Zeny < 3000) {
		mes "[�]�ƈ�]";
		mes "�́H";
		mes "���������Y��ɁH";
		mes "�킩��܂����B";
		mes "�������߂�ɂȂ���̂ł�����A";
		mes "�������c���Ă����܂��̂ŁB";
		close;
	}
	mes "[" +strcharinfo(0)+ "]";
	mes "�i^FF0000�x�C���X^000000���c�c";
	mes "�@���ׂ鉿�l�͂��肻�����c�c�j";
	set NAME_1QUE,8;
	set Zeny,Zeny-3000;
	getitem 12052,4;
	close;
}

ra_in01.gat,301,50,3	script	���ʂ̒j	927,{
	mes "[���ʂ̒j]";
	mes "���O���O�c�c";
	mes "��`�������I";
	close;
}

ra_in01.gat,301,52,3	script	�ǂ����Ō����悤�Ȓj	927,{
	mes "[�ǂ����Ō����悤�Ȓj]";
	mes "�ӂށc�c";
	mes "�������Ȃ��Ȃ��Ȗ������A";
	mes "��͂�t�B�Q���̖��ɂ�";
	mes "������ȁB";
	close;
}

ra_in01.gat,297,50,7	script	���������Ȓj	926,{
	mes "[���������Ȓj]";
	mes "���E���̑S�Ă̗�����";
	mes "���ꂼ��̖����o���Ă���B";
	mes "�Ƃ�ł��Ȃ�������";
	mes "����w�ȁc�c";
	close;
}

ve_in.gat,78,314,5	script	������	945,{
	if(NAME_1QUE < 8) {
		mes "[�A���E�n�}�[�h]";
		mes "�ӂ��c�c";
		mes "��̂ǂ��Ȃ����̂��c�c";
		mes "���������Œ�N���Ƃ����̂�";
		mes "���̕񍐂����Ȃ�����Ȃ����c�c";
		close;
	}
	switch(NAME_1QUE) {
	case 8:
		mes "[�A���E�n�}�[�h]";
		mes "�ӂ��c�c";
		mes "��̂ǂ��Ȃ����̂��c�c";
		mes "���������Œ�N���Ƃ����̂�";
		mes "���̕񍐂����Ȃ�����Ȃ����c�c";
		next;
		menu "�ǂ����܂����H",-;
		mes "[�A���E�n�}�[�h]";
		mes "��H";
		mes "�N�͒N���H";
		mes "�������O���̐l�ɂ�";
		mes "�֌W�������Ƃ���B";
		set NAME_1QUE,9;
		close;
	case 9:
		mes "[�A���E�n�}�[�h]";
		mes "�p�������Ȃ�";
		mes "�����֗�������Ȃ��ŁB";
		mes "�����͎������Ǘ����鏊�ŁA";
		mes "��ʐl�̗�����͊�{�I��";
		mes "�֎~�ƂȂ��Ă��܂��B";
		close;
	case 10:
		mes "[�A���E�n�}�[�h]";
		mes "�c�c������A������֎~����";
		mes "�������̂Ɂc�c";
		mes "��̂ǂ������̂ł����H";
		mes "���̂��p�ł����H";
		next;
		if(select("�����c�c���́c�c","�ȑO�߂܂����������l�́H")==1) {
			mes "[�A���E�n�}�[�h]";
			mes "����������ł����H";
			mes "�Ȃ�A������������o�Ă��������B";
			close;
		}
		mes "[�A���E�n�}�[�h]";
		mes "��H";
		mes "���̂�����H";
		mes "�c�c�\�𕷂����悤�ł��ˁB";
		mes "�Ƃɂ����A�����̎����O���̕���";
		mes "�b���킯�ɂ͂����܂���B";
		next;
		mes "[�A���E�n�}�[�h]";
		mes "^9977DD���̌��𒲍��������Ȃ�A";
		mes "�ォ��̖��ߏ��c�c";
		mes "�����ł��ˁA��_����";
		mes "����������Ă��������B";
		mes "�܂��A�܂������ł����B^000000";
		set NAME_1QUE,11;
		close;
	case 11:
	case 12:
		mes "[�A���E�n�}�[�h]";
		mes "^9977DD�ォ��̖��ߏ��c�c";
		mes "�����ł��ˁA��_����";
		mes "����������Ă��������B";
		mes "�܂��A�܂������ł����B^000000";
		close;
	case 13:
		mes "[�A���E�n�}�[�h]";
		mes "�ӂށc�c���Ȃ��͕s�v�c�Ȑl�ł��ˁB";
		mes "�A���i�x���X��������";
		mes "�l�ɂ͌����܂��񂪁A��_����";
		mes "���m�荇�����Ȃ�āc�c";
		mes "�܂��A�Ƃɂ���";
		mes "����񋟂��܂��傤�B";
		next;
		mes "[�A���E�n�}�[�h]";
		mes "��X�����̔ƍߎ҂�����";
		mes "��蒲�ׂ����ʁA�ނ�͌��X�A";
		mes "�l�g������s�@�s�ׂ����Ă���";
		mes "�����ȘA���ł����B";
		next;
		mes "[�A���E�n�}�[�h]";
		mes "�������A����͒N�������炢�A";
		mes "�C��n�������ŁA";
		mes "��X�ɕ߂܂����̂ł��B";
		next;
		mes "[�A���E�n�}�[�h]";
		mes "�z�炪���̐l������������̂̓R���h�B";
		mes "�c�c�R���h�͒m���Ă邩�ȁH";
		mes "���[���~�b�h�K�b�c������";
		mes "�쐼�̕��ɂ���X����B";
		next;
		mes "[�A���E�n�}�[�h]";
		mes "�Ƃɂ����A�����ŋ������Ɍ�����j��";
		mes "���𗘗p���ĕ߂܂����炵���B";
		mes "�������A�悭�悭���ׂĂ݂�ƁA";
		mes "�߂܂����̂͂����̂�����������Ȃ��A";
		mes "���[���~�b�h�K�b�c�����̍��ʐE��";
		mes "�A���l�������炵���B";
		next;
		mes "[�A���E�n�}�[�h]";
		mes "����Ȑl��U�����Ă��܂��A";
		mes "�R��R�m�c�ɒǂ���̂�";
		mes "���ꂽ�z��́A�D�ŊC��n��A";
		mes "�����܂œ����Ă������A";
		mes "�����̌x������������";
		mes "�߂܂��鎖���ł����񂾁B";
		next;
		mes "[�A���E�n�}�[�h]";
		mes "�܂��A���̗U�����ꂽ�l��";
		mes "�����ł��΂炭�ی삵�Ă������c�c";
		mes "�����̍��ʐE�ɂ��Ă�l�Ƃ͈Ⴄ�A";
		mes "�ʂ̉������������̂��c�c";
		next;
		mes "[�A���E�n�}�[�h]";
		mes "�����ŁA�_�a�ɘA�������Ă���";
		mes "�ڂ����ނ�𒲍����悤�Ƃ��Ă������A";
		mes "�����ɐ_�a���痈���l�����ɂ����";
		mes "�A��čs����Ă��܂����B";
		mes "�������̒�����������";
		mes "�I����Ă��܂����킯���B";
		next;
		mes "[�A���E�n�}�[�h]";
		mes "���̌㕷�����b�Ȃ񂾂��A";
		mes "����^33CC33�����ꂽ�l���͂���ꏊ^000000��";
		mes "�u�����ꂽ�炵���B";
		next;
		mes "[�A���E�n�}�[�h]";
		mes "���ꂪ���̒m���Ă���S�Ă̏�񂾁B";
		next;
		mes "[�A���E�n�}�[�h]";
		mes "���Ƃ��Ă͂����Əڂ���";
		mes "��񂪗~�����������A";
		mes "�������ɒ�N�O�ɖ����͂ł��Ȃ��B";
		mes "�ォ��̈��͂�����A";
		mes "����ȏ�̒����͏o���Ȃ������B";
		next;
		mes "[�A���E�n�}�[�h]";
		mes "�����Əڂ�����񂪗~������΁A";
		mes "�����Œ��ׂĂ���B";
		mes "����Ƃ͎v�����c�c";
		set NAME_1QUE,14;
		close;
	default:
		mes "[�A���E�n�}�[�h]";
		mes "�����m���Ă��鎖�͑S�Ęb�����B";
		mes "����ȏ�̎��͎����Œ��ׂĂ���B";
		close;
	}
}

ve_in.gat,81,296,3	script	���m	946,{
	if(NAME_1QUE < 9) {
		mes "[�q���X]";
		mes "�ŋ߂̎����ǁc�c";
		mes "���q�������̂��ȁc�c";
		mes "�������������O�̎��Ȃ̂�";
		mes "�����Ɉ��������Ă��邵�c�c";
		close;
	}
	if(NAME_1QUE == 10) {
		mes "[�q���X]";
		mes "�����ǁA����������N�Ȃ񂾂���A";
		mes "�������낻�됁���؂ꂽ����";
		mes "�ǂ��Ǝv���񂾂��ǂˁB";
		close;
	}
	if(NAME_1QUE > 10) {
		mes "[�q���X]";
		mes "�������ǂ��V�C���ˁB";
		mes "���̎������N���Ȃ������F���B";
		close;
	}
	mes "[�q���X]";
	mes "��H";
	mes "���`�A�����ǁH";
	mes "�������ˁA�ŋ߂�����";
	mes "�Y��ł���񂾁B";
	next;
	mes "[�q���X]";
	mes "���������O�A^33CC33�삩�疧�q���ė���";
	mes "�������A����߂�����^000000";
	mes "���������񂾁B";
	mes "���������ꏊ�͉�X�̊Ǌ�������";
	mes "�����ǒ��X�Ɏ�������蒲�ׂĂ����B";
	next;
	mes "[�q���X]";
	mes "�������A�����̒������ʂ�";
	mes "�_�a�ɕ񍐂�����A";
	mes "�_�a���狳�c�����̕��m�B�����āA";
	mes "�ނ��A��Ă����Ă��܂����񂾁B";
	next;
	mes "[�q���X]";
	mes "���́A���ꂩ��_�a�̕�����";
	mes "�A�������Ȃ��񂾁B";
	mes "�ǂ������Ή����s�����̂����ĂˁB";
	next;
	mes "[�q���X]";
	mes "�܂��A�N�����Ď����̎d����";
	mes "���l�ɒD��ꂽ��A�r���Ŏ��グ";
	mes "��ꂽ�肷��ƁA�C�ɂ����ȁc�c";
	mes "�����ǂ͂܂��ɂ��̏�Ԃ�";
	mes "�������C�ɂ��Ă���񂾁B";
	next;
	menu "�������l�����āH",-;
	mes "[�q���X]";
	mes "�����A�����܂ł͒m��Ȃ��B";
	mes "���ׂ����e�́A�����ǂ����m��Ȃ���B";
	set NAME_1QUE,10;
	close;
}

ve_in.gat,239,115,1	script	��������	943,{
	if(NAME_1QUE < 14) {
		mes "[��������]";
		mes "�q�b�N�A�t�q�q�B";
		mes "���`��!!�@������t�I";
		close;
	}
	if(NAME_1QUE > 14) {
		mes "[��������]";
		mes "���`���`��́A";
		mes "���őD���o�����Ȃ��񂾂�I";
		mes "�D���o���Ȃ�������";
		mes "�������Ȃ�����񂩂�`�I";
		mes "�������c�c";
		mes "�ǂ��H���Ă��Ηǂ����Ă񂾁I";
		close;
	}
	mes "[��������]";
	mes "������c�c�q�b�N�c�c�t�q�q�B";
	mes "�q�b�N�A�E�q�c�c�q�q�q�B";
	mes "���̑O�A�������肳�A";
	mes "^33CC33�D^000000�ɁA�q�b�N�A�����";
	mes "�ł��z���邶���A�q�b�N�c�c";
	next;
	mes "[��������]";
	mes "���ő����A�A���Ă������A";
	mes "�m���Ă邩�H";
	mes "�q�b�N�c�c���c�c���c�c�S�N�S�N�B";
	mes "�C�q�q�q�A���ꂪ���A";
	mes "^DDDD77�H��^000000�������炵����B";
	mes "�C�q�q�q�`�A�q�b�N�B";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "�i�D���c�c���������΁A";
	mes "�@^33CC33�P�C���̂������񂪋��t^000000����";
	mes "�@�������C������c�c�j";
	set NAME_1QUE,15;
	close;
}

ve_in.gat,238,120,5	script	��������	940,{
	mes "[��������]";
	mes "�A�n�n�n�@�`";
	mes "�����A�������`";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "�i�ւ������A�܂��ԈႢ�Ȃ�";
	mes "�@�ʓ|�Ɋ������܂ꂻ���Ȑl���B�j";
	close;
}

ve_fild07.gat,125,128,0	script	�D	111,{
	if(NAME_1QUE < 16) {
		mes "-�g�������ȑD������B";
		mes "�@������͒N���낤-";
		close;
	}
	if(NAME_1QUE > 16) {
		mes "-�C���@�̂��铇�֍s����";
		mes "�@�D������-";
		next;
		if(select("�C���@�̂��铇�֍s��","�������Ȃ�")==2) {
			mes "-���͓��ɗp�͂Ȃ�-";
			close;
		}
		mes "-�D�𓮂�����-";
		close2;
		if(NAME_1QUE < 20) warp "nameless_i.gat",257,217;
		else warp "nameless_n.gat",257,217;
		end;
	}
	mes "-�P�C���̂�������̑D���B";
	mes "�@�\���g���������B";
	mes "�@����œ쐼�̓��֍s����-";
	next;
	hideoffnpc "������#name";
	next;
	mes "[�����q�X]";
	mes "���v���Ԃ肾�ˁB";
	mes strcharinfo(0)+ "����B";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "�c�c�����q�X����H";
	next;
	mes "[�����q�X]";
	mes "���܂ł����ƌ��ǂ��Ă����ǁA";
	mes "����������΂ꂻ���ɂȂ������";
	mes "��ς�������B";
	mes "�c�c���A���̉��������ɗ����̂�";
	mes "�C�ɂȂ��Ă�̂����H";
	next;
	mes "[�����q�X]";
	mes "������Ȃ��ŗ~�����B";
	mes "�ŏ����� " +strcharinfo(0)+ "�����";
	mes "�Ď������킯����Ȃ��񂾁B";
	next;
	mes "[�����q�X]";
	mes "�����̒�����i�߂Ă��邤���ɁA";
	mes "�A���i�x���c������";
	mes "�֌W�����鎖���킩��A";
	mes "���̌�̒�������c�c";
	next;
	mes "[�����q�X]";
	mes strcharinfo(0)+ "����";
	mes "�A���i�x���c�����̌��͎҂�����";
	mes "���炩�̊֌W�������Ă��鎖���킩��A";
	mes "�Ď����n�߂����Ă�������B";
	next;
	mes "[�����q�X]";
	mes "�m���Ă̒ʂ�A���̎�����";
	mes "���łɃ��[���~�b�h�K�b�c����";
	mes "���O�̎����ɔ��W���Ă���B";
	mes "���̂��߁A�������̂悤�Ȓ�������";
	mes "����݂ɏo��̂͂��������낤���B";
	next;
	mes "[�����q�X]";
	mes "����������ƁA�A���i�x���c�����Ƃ�";
	mes "�l�X�ȗ�����肪";
	mes "�������邩������Ȃ��B";
	mes "�܁A����Ȏ�������������";
	mes "���܂ł͂��������";
	mes "�Ď������Ă�������킯���B";
	next;
	mes "[�����q�X]";
	mes "�������A���Ȃ���������";
	mes "�s�����Ƃ��Ă��鏊�B";
	mes "���̂܂܌��߂����킯�ɂ�";
	mes "�����Ȃ����߁A";
	mes "�������Ďp�����킵���񂾁B";
	next;
	mes "[�����q�X]";
	mes "���A" +strcharinfo(0)+ "����";
	mes "�s�����Ƃ��Ă��鏊�́A";
	mes "�N�ł��s����悤�ȏꏊ����Ȃ��B";
	mes "�g���r���A�f�l�̑D���ł�";
	mes "���𗎂Ƃ��Ă��܂����B";
	next;
	mes "[�����q�X]";
	mes "�܂��A�^���ǂ���Ζ����ɒ�������";
	mes "�m��Ȃ����c�c�^�ɔC���Ă����ɂ�";
	mes "�댯�������Łc�c";
	next;
	mes "[�����q�X]";
	mes "����œ��ւ̍q�H��m��l�ɗ����";
	mes "�s������������Ă����񂾁B";
	mes "�������̍q�H�ɂ��Ă���";
	mes "�@����񂾂�����ŁA";
	mes "������Ԃ�����������c�c";
	next;
	mes "[�����q�X]";
	mes "�����͂��������H";
	mes "���ɍs���Ȃ���A�D�̈�������";
	mes "�q�H�������Ă������B";
	mes "�����A�s�������H";
	next;
	if(select("�͂��A�s���܂��傤","�����҂��Ă�������")==2) {
		mes "[�����q�X]";
		mes "�������ł����炷���o�����悤�B";
		close;
	}
	mes "[�����q�X]";
	mes "���ꂶ�Ⴀ�o�����B";
	mes "�����h��邩��C�����āB";
	close2;
	hideonnpc "������#name";
	set NAME_1QUE,17;
	warp "nameless_i.gat",257,217;
	end;
}

ve_fild07.gat,128,130,1	script	������#name	97,{
	if(NAME_1QUE != 16)
		end;
	mes "[�����q�X]";
	mes "�����͂��������H";
	mes "���ɍs���Ȃ���A�D�̈�������";
	mes "�q�H�������Ă������B";
	mes "�����A�s�������H";
	next;
	if(select("�͂��A�s���܂��傤","�����҂��Ă�������")==2) {
		mes "[�����q�X]";
		mes "�������ł����炷���o�����悤�B";
		close;
	}
	mes "[�����q�X]";
	mes "���ꂶ�Ⴀ�o�����B";
	mes "�����h��邩��C�����āB";
	close2;
	hideonnpc "������#name";
	set NAME_1QUE,17;
	warp "nameless_i.gat",257,217;
	end;
OnInit:
	hideonnpc;
	end;
}

nameless_i.gat,259,218,3	script	�����q�X	97,{
	if(NAME_1QUE < 18) {
		mes "[�����q�X]";
		mes "�������C���������ȁc�c";
		mes "�C�����āB";
		close;
	}
	mes "[�����q�X]";
	mes "�܂������͏I����ĂȂ����c�c";
	mes "�������񓇂��痣��邩�H";
	next;
	if(select("���𗣂��","����Ȃ�")==2) {
		mes "[�����q�X]";
		mes "���������C�����āB";
		mes "�����͊댯�ȏ����B";
		close;
	}
	mes "[�����q�X]";
	mes "�킩�����B";
	mes "���ꂶ�Ⴀ����Ă���B";
	close2;
	warp "ve_fild07.gat",130,130;
	end;
}

nameless_i.gat,212,184,0	script	���̍���#name1	139,2,3,{
	if(NAME_1QUE != 17)
		end;
	mes "-���͒N�����Ȃ��̂��A�Â����B";
	mes "�@�������A�����ԑO�܂�";
	mes "�@�����������悤�ȍ��Ղ�����B";
	mes "�@���͉������Ɉړ��c�c";
	mes "�@�������́A�B��Ă���̂��c�c-";
	next;
	mes "-�������c�c���̂��l�̋C�z���c�c";
	mes "�@�܂��������Ȃ��c�c-";
	close;
}

nameless_in.gat,21,176,0	script	���̍���#name2	139,2,2,{
	if(NAME_1QUE != 17)
		end;
	mes "-�l�X���Z��ł������Ղ�����B";
	mes "�@�������A���̏�ɉ�������";
	mes "�@���Ղ��c����Ă���B";
	mes "�@���ɋC�����������Ղ�-";
	close;
}

nameless_i.gat,129,218,0	script	���̍���#name3	139,4,3,{
	if(NAME_1QUE != 17)
		end;
	mes "-�ςȓ���������Ő����B";
	mes "�@�����āA���������";
	mes "�@^33CC33�����̎��[^000000������-";
	close;
}

nameless_i.gat,127,207,0	script	�J���X�̎��[	111,{
	if(NAME_1QUE == 18 || NAME_1QUE == 19) {
		mes "[" +strcharinfo(0)+ "]";
		mes "�����N�����Ȃ��悤���ȁc�c";
		mes "�����������P�����z��́A��́c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�^�΂ꂽ�Ƃɂ́A�o��������c�c";
		mes "�m���A���̖k���ɂ������Ƃ��B";
		mes "������x�A�s���Ă݂悤�B";
		close2;
		warp "nameless_i.gat",168,252;
		end;
	}
	if(NAME_1QUE != 17) {
		mes "-�J���X�̎��[������-";
		close;
	}
	mes "-����������";
	mes "�@^33CC33�J���X�̎��[^000000������-";
	next;
	if(select("�C�ɂ��Ȃ�","���ׂĂ݂�")==1) {
		mes "-�C�ɂ����畉�����Ǝv��-";
		close;
	}
	mes "-�J���X�̎��[�����Ă݂�ƁA";
	mes "�@���΂��ɗΐF�̉t�̂̍��Ղ�";
	mes "�@�t���Ă���̂�������-";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "�i�J���X�����̑���H�ׂ��̂��ȁH�j";
	next;
	mes "-�H�т������ꂽ�̂��݂�ƁA";
	mes "�@�����ւ̗؂̂悤�Ȃ��̂ɕ�����";
	mes "�@����̂�������-";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "�i���̖͗l�c�c�������c�c�j";
	next;
	mes "-�ǂ����A�Q�I���O�Ƃ̉��q�B��";
	mes "�@�E�����ł̌����́A���̑��̂悤��-";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "����ȏ��Ō�����Ȃ�āc�c";
	mes "�c�c��H";
	next;
	mes "-��납��C�z�������A";
	mes "�@�����q�X���񂩂Ǝv����";
	mes "�@�U��������u�ԁA";
	mes "�@���ɋ����Ռ��������A";
	mes "�@�C�������Ă��܂���-";
	close2;
	set NAME_1QUE,18;
	warp "nameless_in.gat",15,60;
	end;
}

nameless_i.gat,168,257,0	script	�k�̉�#name	45,1,1,{
	if(NAME_1QUE == 18 || NAME_1QUE == 19) {
		warp "nameless_in.gat",12,41;
		end;
	}
	mes "-�h�A�����Ă���B";
	mes "�@��������͓���Ȃ��悤��-";
	close;
}

nameless_in.gat,15,60,0	script	�k�̉Ɠ�#name	139,3,3,{
	if(NAME_1QUE != 18)
		end;
	sc_start3 SC_BLIND,0,0,0,0,200000,10;
	mes "-�N���������^��ł���C�����A";
	mes "�@�ڂ��J���悤�Ƃ������A";
	mes "�@����Ȏv�l�ł͂��܂�";
	mes "�@�̂������Ȃ�����-";
	next;
	mes "-���̂����͍~�낳��A";
	mes "�@�����Â��ɂȂ����Ǝv������A";
	mes "�@�����������悤�ȉ�������-";
	next;
	mes "-�����āc�c�N�������̖��O��";
	mes "�@�Ă�ł���悤���B";
	mes "�@���̒��ɗ₽���t�̂�������A";
	mes "�@�₪�Ĉӎ����n�b�L���Ƃ��Ă���-";
	next;
	sc_end SC_BLIND;
	next;
	mes "[�����q�X]";
	mes "�����A�ǂ������B";
	mes "�{���Ɋ�Ȃ�������B";
	mes "�Ԃɍ����ėǂ������c�c";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "�����q�X����c�c";
	mes "��̉����c�c";
	mes "��������ł����c�c�H";
	mes "�Ƀb�c�c�����c�c";
	next;
	mes "[�����q�X]";
	mes "�D�ő҂��Ă������ǁA";
	mes "�����s���ȋ�C��������";
	mes strcharinfo(0)+ "�����";
	mes "�T���ɗ����񂾁B";
	next;
	mes "[�����q�X]";
	mes "����������A�ςȘA����";
	mes strcharinfo(0)+ "����";
	mes "�߂܂��Ă���̂������ĂˁB";
	mes "���ǂ��Ă����񂾂��c�c";
	next;
	mes "[�����q�X]";
	mes "�����ɂ�����A�}�ɂ����炪";
	mes strcharinfo(0)+ "�����";
	mes "�P�����Ƃ�������A";
	mes "�������Еt�����񂾁B";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "���c�c���肪�Ƃ��������܂��B";
	mes "�ŁA���̂�����Ƃ����̂́c�c�H";
	next;
	mes "[�����q�X]";
	mes "����c�c���ꂪ�c�c";
	mes "�l�̌`�����Ă��邪�l�ł͂Ȃ������B";
	mes "�|�ꂽ�u�ԁA���̂悤�ɗn����";
	mes "�����Ă��܂����񂾁c�c";
	next;
	hideoffnpc "���l��#name";
	emotion 0,"";
	emotion 0,"�����q�X#name";
	next;
	mes "[�����q�X]";
	mes "�`�b�I�@�܂��������B";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "�c�c�ȁc�c���H";
	mes "�������H";
	next;
	mes "[�����q�X]";
	mes "�c�c�P���Ă��Ȃ��c�c�H";
	mes "�������̓z��Ƃ͈Ⴄ�̂��H";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "�c�c�c�c";
	mes "�Ƃ肠�����A�����߂��ɍs����";
	mes "���܂����H";
	set NAME_1QUE,19;
	close;
}

nameless_in.gat,13,58,6	script	�����q�X#name	97,{
	mes "[�����q�X]";
	mes "�C�����������ǂ��B";
	mes "�����A�댯�ȋC������B";
	close;
}

nameless_in.gat,13,53,0	script	���l��#name	1864,{
	end;
OnInit:
	hideonnpc;
	end;
}

nameless_in.gat,13,53,0	script	�P��#name	139,2,2,{
	if(NAME_1QUE != 19 || 'flag)
		end;
	mes "[???????]";
	mes "�E�H�[�D�I";
	close2;
	set 'flag,1;
	hideonnpc "���l��#name";
	monster "nameless_in.gat",13,53,"�]���r�X���[�^�[",1864,1,"name_mob::OnKilled";
	end;
}

nameless_in.gat,0,0,0	script	name_mob	-1,{
OnKilled:
	initnpctimer;
	enablenpc "name_warp";
	end;
OnTimer100000:
	stopnpctimer;
	disablenpc "name_warp";
	set getvariableofnpc('flag,"�P��#name"),0;
	end;
}

nameless_in.gat,12,37,0	script	name_warp	45,1,1,{
	if(NAME_1QUE != 19)
		end;
	set NAME_1QUE,20;
	warp "nameless_n.gat",168,252;
	end;
OnInit:
	disablenpc;
	end;
}

nameless_n.gat,169,254,0	script	������������#name	139,2,2,{
	if(NAME_1QUE != 20)
		end;
	hideoffnpc "�����q�X#name2";
	mes "[" +strcharinfo(0)+ "]";
	mes "����́c�c��́c�c";
	next;
	mes "[�����q�X]";
	mes "�ӂށc�c";
	mes "�ǂ���炱�ꂪ���̓���";
	mes "�{���̎p�̂悤���ˁB";
	next;
	mes "[�����q�X]";
	mes "�c�c�D���S�z���B";
	mes "���͐�ɑD�ɖ߂�Ƃ��悤�B";
	mes strcharinfo(0)+ "�����";
	mes "�������������𗊂ށB";
	mes "��Ȃ�����C������悤�ɁB";
	close2;
	set NAME_1QUE,21;
	hideonnpc "�����q�X#name2";
	end;
}

nameless_n.gat,166,254,7	script	�����q�X#name2	97,{
	end;
OnInit:
	hideonnpc;
	end;
}

nameless_n.gat,259,218,3	script	�����q�X	97,{
	if(NAME_1QUE == 23 && countitem(7726)) {
		mes "[�����q�X]";
		mes "�c�c����ȁc�c�����c�c";
		mes "�P�Ȃ鍂�ʐE�̐l�ł͂Ȃ���";
		mes "�v���Ă������A";
		mes "�܂����g���X�^��3���Ƃ́c�c";
		mes "�c�c�ӂ��c�c";
		next;
		mes "[�����q�X]";
		mes "�킩�����B���̏���";
		mes "���̏؂Ƌ��ɗa���낤�B";
		mes "���ꂩ��A���̑��̏����c�c";
		next;
		mes "[�����q�X]";
		mes "��͂�A�A���i�x���c����";
		mes "�̎d�Ƃ��������c�c";
		mes "�܂������A���̓��͂Ƃ�ł��Ȃ��ȁB";
		next;
		mes "[�����q�X]";
		mes "���������ƁA���E�͂��̏���";
		mes "�傫�ȕω����}���邩������Ȃ��c�c";
		next;
		mes "[�����q�X]";
		mes "�Ƃɂ������肪�Ƃ��B";
		mes "���͂��������ꍏ������";
		mes "�񍐂���B";
		set NAME_1QUE,24;
		delitem 7726,1;
		if(checkre())
			getexp 100000,0;
		else
			getexp 1000000,0;
		close;
	}
	mes "[�����q�X]";
	mes "�����痣��邩���H";
	next;
	if(select("���𗣂��","����Ȃ�")==2) {
		mes "[�����q�X]";
		mes "���������C�����āB";
		mes "�����͊댯�ȏ����B";
		close;
	}
	mes "[�����q�X]";
	mes "�킩�����B";
	mes "���ꂶ�Ⴀ����Ă���B";
	close2;
	warp "ve_fild07.gat",130,130;
	end;
}

abbey02.gat,224,70,0	script	�{	111,{
	if(NAME_1QUE < 21) {
		mes "-�Â��{������ł���-";
		close;
	}
	if(NAME_1QUE > 21) {
		mes "-�Â��{���U�炩���Ă���-";
		close;
	}
	mes "-�Â��{�̊ԂɁA";
	mes "�@���܂݂�̖{������-";
	next;
	if(select("���ׂĂ݂�","��������")==2) {
		mes "-�債�����e�ł͂Ȃ����낤-";
		close;
	}
	mes "^FF0000<<����>>";
	mes "���N�G�X�g�A�C�e������肵�܂����B";
	mes "�N�G�X�g�A�C�e���𕴎������ꍇ�A";
	mes "�N�G�X�g��i�s���邱�Ƃ�";
	mes "�ł��Ȃ��Ȃ�\��������܂��B";
	mes "�A�C�e���̎戵���ɂ����ӂ��������B";
	set NAME_1QUE,22;
	getitem 7755,1;
	openbook 7755;
	close;
}

abbey03.gat,232,233,4	script	�|�ꂽ�j#name	956,{
	if(NAME_1QUE < 22) {
		mes "-�j��ĉ���Ă��邪�A";
		mes "�@�����ȕ���g�ɓZ�����j��";
		mes "�@�|��Ă���-";
		next;
		mes "-�ǂ����r�̂悤��-";
		close;
	}
	if(NAME_1QUE > 22) {
		mes "-�N���̎r�̂悤��-";
		close;
	}
	mes "-�j��ĉ���Ă��邪�A";
	mes "�@�����ȕ���g�ɓZ�����j��";
	mes "�@�|��Ă���B";
	mes "�@����ł��邩�Ǝv�������A";
	mes "�@�����Ȃ��߂�������������-";
	next;
	if(select("�j�ɐG���Ă݂�","��������")==2) {
		mes "-���̂��댯�ȋC�z������-";
		close;
	}
	mes "[" +strcharinfo(0)+ "]";
	mes "���̐l�A�ǂ����Ō����悤�ȁc�c";
	next;
	mes "-�j�ɐG��ƁA��ȉ��Ƌ��ɁA";
	mes "�@�|��Ă����j���N���オ����-";
	close2;
	hideonnpc;
	monster "abbey03.gat",232,232,"���̎��[",1875,1,"name_mob2::OnKilled";
	end;
}

abbey03.gat,0,0,0	script	name_mob2	-1,{
OnKilled:
	initnpctimer;
	hideoffnpc "�������̎��[#name";
	end;
OnTimer100000:
	stopnpctimer;
	hideonnpc "�������̎��[#name";
	hideoffnpc "�|�ꂽ�j#name";
	end;
}

abbey03.gat,232,232,4	script	�������̎��[#name	956,{
	if(NAME_1QUE != 22)
		end;
	mes "[" +strcharinfo(0)+ "]";
	mes "��̂���́c�c";
	mes "��A�㒅�̋��̏��Ɂc�c";
	mes "�܁A�܂����c�c���̐l��!?";
	set NAME_1QUE,23;
	getitem 7726,1;
	hideonnpc;
	hideoffnpc "�|�ꂽ�j#name";
	stopnpctimer "name_mob2";
	next;
	mes "^FF0000<<����>>";
	mes "���N�G�X�g�A�C�e������肵�܂����B";
	mes "�N�G�X�g�A�C�e���𕴎������ꍇ�A";
	mes "�N�G�X�g��i�s���邱�Ƃ�";
	mes "�ł��Ȃ��Ȃ�\��������܂��B";
	mes "�A�C�e���̎戵���ɂ����ӂ��������B";
	close;
OnInit:
	hideonnpc;
	end;
}

//============================================================
// ��_���N�G�X�g
//- Registry -------------------------------------------------
// NAME_2QUE -> 0�`24
//------------------------------------------------------------
//morocc.gat,167,106,3	script	�ٍ��̏��l	880,5,5,{
moc_ruins.gat,77,167,3	script	�ٍ��̏��l	880,5,5,{
	if(VE_4QUE != 27) {
		mes "[�ٍ��̏��l]";
		mes "�n�@�c�c�n�@�c�c";
		mes "���̕����̒����������ǁA";
		mes "���������[����Ȃ��ȁc�c";
		mes "��́A�F���R�Ƃ��Ă��鎖���s�v�c���I";
		mes "����Ȃɏ������Ă����̂�";
		mes "�l���������c�c";
		close;
	}
	switch(NAME_2QUE) {
	case 0:
		mes "[�ٍ��̏��l]";
		mes "�n�@�c�c�n�@�c�c";
		mes "���̕����̒����������ǁA";
		mes "���������[����Ȃ��ȁc�c";
		mes "��́A�F���R�Ƃ��Ă��鎖���s�v�c���I";
		mes "����Ȃɏ������Ă����̂�";
		mes "�l���������c�c";
		emotion 9;
		next;
		mes "[�ٍ��̏��l]";
		mes "���𔄂�ɗ������ǁc�c";
		mes "���C���o�Ȃ��c�c";
		mes "�n�@�c�c�n�@�c�c";
		emotion 9;
		next;
		menu "�h�����ł��ˁc�c",-;
		mes "[�ٍ��̏��l]";
		mes "�����c�c�܂������ȁc�c";
		mes "�n�@�n�@�c�c";
		mes "���́A�F��ȉ\�𕷂��A";
		mes "���̃����N����ԁA�����ɂ͓K���Ă���";
		mes "�X���Ǝv���Ă����񂾂��c�c";
		mes "���̏����͗\�z�O�������c�c";
		emotion 9;
		next;
		mes "[�ٍ��̏��l]";
		mes "�����A�����Ȃ�Ăǂ��ł������c�c";
		mes "�����ɂȂ�ƁA���̏����ɕ����āc�c";
		mes "�R���h���̉a�ɂȂ���";
		mes "���邩���m��Ȃ��ȁc�c";
		mes "�n�@�c�c�n�@�c�c";
		emotion 4;
		next;
		mes "[�ٍ��̏��l]";
		mes "�\�ɂ��ƁA�����̌΂�";
		mes "�����������������ݕ��𔄂�";
		mes "���l�����X����炵���񂾂��c�c";
		mes "��������߂��ɁA���̂܂ܑ�����";
		mes "���𗎂Ƃ��̂��c�c�c�c";
		emotion 28;
		emotion 4,"";
		set NAME_2QUE,1;
		close;
	case 1:
	case 2:
	case 3:
	case 4:
	case 5:
	case 6:
		mes "[�ٍ��̏��l]";
		mes "�����������������ݕ���";
		mes "�����Ă��鏤�l���A";
		mes "�����̌΂Ɏ��X��������炵���c�c";
		mes "�n�@�c�c�n�@�c�c";
		next;
		mes "[�ٍ��̏��l]";
		mes "���ʑO�Ɂc�c�c�c�c�c";
		mes "����Łc�c�݂����c�c";
		mes "�����āc�c���������Ȃ��c�c";
		mes "�c�c�c�c�c�c�c�c";
		close;
	case 7:
		mes "[�ٍ��̏��l]";
		mes "�n�@�c�c�n�@�c�c";
		next;
		if(select("���l�ɉʎ�����n��","�����ƌ��Ă݂�")==2) {
			mes "[�ٍ��̏��l]";
			mes "�n�@�c�c�n�@�c�c";
			mes "�����Ă�񂾂�c�c";
			close;
		}
		mes "[�ٍ��̏��l]";
		mes "�n�b�I�@���̍����!?";
		mes "�܂����c�c����͉\�́c�c!?";
		mes "���A���肪�Ƃ��I";
		next;
		mes "-�S�N�@�S�N�@�S�N�@�S�N";
		mes "�@�S�N�@�S�N�@�S�N�@�S�N";
		mes "�@�S�N�@�S�N�@�S�N�@�S�N";
		mes "�@�S�N�@�S�N�@�S�N�@�S�N";
		mes "�@�S�N�@�S�N�@�S�N�@�S�N-";
		next;
		mes "[�ٍ��̏��l]";
		mes "�N�A�@�@�@�b�[!!";
		mes "�V�������ǁA�ǂ������������A";
		mes "�R���h�̃_���T�[�̗x��Ɏ���";
		mes "�u�₩�ŁA�z�Ƃ����A�������";
		mes "�L����F���̖�������!!!!";
		mes "�{���ɂ��΂炵���I";
		emotion 3;
		next;
		mes "[�ٍ��̏��l]";
		mes "���₟�A���肪�Ƃ��B";
		mes "��������������������I";
		mes "���c�c�������������I";
		mes "����ɂ���������Ȃ�����ȁB";
		next;
		mes "[�ٍ��̏��l]";
		mes "�N�͂������c�c";
		mes strcharinfo(0);
		mes "�c�c���ˁH";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�����H";
		mes "�ǂ��Ŏ��̖��O���H";
		next;
		mes "-���l�̓j�����Ə΂��Ȃ���";
		mes "�@�����Ȏ莆��n���Ă���-";
		next;
		mes "-�莆�ɂ́A�悭�m�����l�����";
		mes "�@�`���������Ă�����-";
		next;
		mes "�u" +strcharinfo(0)+ "�v��";
		mes " ";
		mes "���Ɏ������������o�����������B";
		mes "�����Ɏ��̌��֗��Ă���B";
		mes " ";
		mes "�@�@�@�@�@�@�@�@�@�@�@-�x�P���g";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�i�x�P���g�c�c";
		mes "�@�W�F�h�E�x�P���g!?";
		mes "�@����̓W�F�h��_������̎莆!?�j";
		mes "����c�c���Ȃ��́I";
		mes "�����̏��l����Ȃ��ł��ˁI";
		emotion 23,"";
		next;
		mes "-���l�͐�قǂ܂łƈႢ�A";
		mes "�@�l�����o�J�ɂ����悤��";
		mes "�@���ȕ\��ŏ΂��Ă݂��邾��������-";
		emotion 39;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�����c�c";
		mes "���ݕ����{���͂���Ȃ��B";
		mes "�����A�������炩�����B";
		mes "�����Ȃ�ł��ˁH";
		emotion 28,"";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�莆�͊m���Ɏ󂯎��܂����B";
		mes "�ł��A���ꂩ��͉ʎ�����";
		mes "�����Ŕ����Ĉ���ł���������!!";
		next;
		mes "[�ٍ��̏��l]";
		mes "�n�n�A�����{��Ȃ��āB";
		mes "�W�F�h��_�����畷�����ʂ�̐l��";
		mes "������Ǝ����Ă݂���������Ȃ����B";
		mes "�ӂӁc�c����A�C������";
		mes "�s���Ă����ŁB";
		set NAME_2QUE,8;
		close;
	default:
		mes "[�ٍ��̏��l]";
		mes "�����ĂƁB";
		mes "�������������A�ό����Ă���";
		mes "�A��Ƃ��邩�ȁB";
		close;
	}
OnTouch:
	if(VE_4QUE != 27 || NAME_2QUE)
		end;
	mes "[�ٍ��̏��l]";
	mes "�n�@�c�c�����c�c";
	close;
}

//morocc.gat,147,151,0	script	�ٍ��̏��l#name1	139,3,3,{
moc_ruins.gat,88,136,0	script	�ٍ��̏��l#name1	139,3,3,{
	if(NAME_2QUE == 1)
		set NAME_2QUE,2;
	if(NAME_2QUE == 5) {
		if(rand(10) < 4) {
			hideoffnpc "�ٍ��̏��l#name";
			set NAME_2QUE,6;
		}
		else
			set NAME_2QUE,2;
	}
	end;
}

//morocc.gat,160,160,0	script	�ٍ��̏��l#name2	139,3,3,{
moc_ruins.gat,86,149,0	script	�ٍ��̏��l#name2	139,3,3,{
	if(NAME_2QUE == 2)
		set NAME_2QUE,3;
	end;
}

//morocc.gat,171,151,0	script	�ٍ��̏��l#name3	139,3,3,{
moc_ruins.gat,115,147,0	script	�ٍ��̏��l#name3	139,3,3,{
	if(NAME_2QUE == 3)
		set NAME_2QUE,4;
	end;
}

//morocc.gat,159,142,0 	script	�ٍ��̏��l#name4	139,3,3,{
moc_ruins.gat,106,133,0	script	�ٍ��̏��l#name4	139,3,3,{
	if(NAME_2QUE == 4)
		set NAME_2QUE,5;
	end;
}

//morocc.gat,140,160,7	script	�ٍ��̏��l#name	929,{
moc_ruins.gat,101,133,7	script	�ٍ��̏��l#name	929,{
	if(NAME_2QUE < 1 || NAME_2QUE > 6) {
		mes "[�ٍ��̏��l]";
		mes "���݂܂���B";
		mes "�ʎ����͔���؂�܂����B";
		mes "���x�͂����������߂�";
		mes "�����Ă���̂ŁA";
		mes "�܂����Ă��������B";
		close;
	}
	mes "[" +strcharinfo(0)+ "]";
	mes "����ɂ��́B";
	mes "���������āA����������������";
	mes "���ݕ��𔄂��Ă�����ĉ\��";
	mes "���l����ł����H";
	next;
	mes "[�ٍ��̏��l]";
	mes "�ʎ����̎��ł����H";
	mes "����ȉ\�Ɂc�c�H";
	mes "���͐̂���F�l�ƈ���ł�������";
	mes "���������Ă��邾���ł���B";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "����ٍ����痈�����l���񂪁A";
	mes "���̉ʎ����̉\�𕷂��āA";
	mes "�������ł݂����ƌ����Ă��܂��B";
	mes "���������ł������Ē����܂��񂩁H";
	next;
	mes "[�ٍ��̏��l]";
	mes "����́c�c����܂����ˁB";
	mes "���́A�������̗p�ӂ�������";
	mes "����؂�Ă��܂��܂����c�c";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "�����c�c�ł����c�c�c�c";
	emotion 57,"";
	next;
	mes "[�ٍ��̏��l]";
	mes "�c�c�c�c�c�c�c�c�c�c";
	emotion 19;
	next;
	mes "[�ٍ��̏��l]";
	mes "���́c�c�����A���Ă����������";
	mes "�v���āA��c���Ă��������̂�";
	mes "����܂��B";
	mes "����ł�낵�����";
	mes "���q����ɍ����グ�܂��B";
	emotion 23,"";
	next;
	mes "[�ٍ��̏��l]";
	mes "���ꂩ��A���̐l�ɂ�";
	mes "���̍�����ʎ�����";
	mes "�J�߂Ă���Ă��肪�Ƃ�";
	mes "�Ɠ`���Ă��������B";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "�����̕��Ȃ̂ɐɂ��܂���";
	mes "��������Ȃ�āc�c";
	mes "���肪�Ƃ��������܂�!!";
	next;
	mes "[�ٍ��̏��l]";
	mes "���������A";
	mes "����ȂɈ��݂����̂ł�����";
	mes "�����{�]�ł�����B";
	next;
	mes "[�ٍ��̏��l]";
	mes "�ł́A���͂��낻��";
	mes "�A�点�Ē����܂��B";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "�i�D�����V�l����A";
	mes "�@�\�̉ʎ�������{�������B";
	mes "�@���̏��l����ɓn���ɂ������B�j";
	set NAME_2QUE,7;
	hideonnpc;
	close;
OnInit:
	hideonnpc;
	end;
}

ra_temin.gat,103,151,7	script	�����M�k	917,{
	switch(NAME_2QUE) {
	default:
		mes "[�M�k�T�s�[]";
		mes "��_���l���d�����I���ċA��ꂽ���A";
		mes "������ꂪ�Ƃ��悤��";
		mes "�ǂ����ɂ��Ȃ��Ă͂Ȃ�܂���B";
		mes "�������ɍL����A���}�̍���A";
		mes "���Ȃ���������܂��񂩁H";
		close;
	case 9:
		mes "[�M�k�T�s�[]";
		mes "��_���l���d�����I���ċA��ꂽ���A";
		mes "������ꂪ�Ƃ��悤��";
		mes "�ǂ����ɂ��Ȃ��Ă͂Ȃ�܂���B";
		mes "�������ɍL����A���}�̍���A";
		mes "���Ȃ���������܂��񂩁H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�����A�����ł��ˁB";
		mes "�܂�ő��̕����Ƃ͈Ⴂ�܂��B";
		mes "�c�c�Ƃ���ŁA������";
		mes "�j���G����_���̎������ł���ˁH";
		mes "�j���G����_���͍��ǂ���ɁH";
		next;
		mes "[�M�k�T�s�[]";
		mes "�����Ɓc�c�j���G����_���l�́A";
		mes "���������������炨�d����";
		mes "�o�������Ă����܂��B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�����H�@�d���H";
		mes "��̂ǂ��ցH";
		next;
		mes "[�M�k�T�s�[]";
		mes "�����Ɓc�c�������V�s�[��";
		mes "�ǂ��������Ă����悤�ȁc�c";
		mes "���`���Ɓc�c�c�c";
		next;
		mes "[�M�k�T�s�[]";
		mes "�c�c�������I";
		mes "�m���뉀�֍s�����Č����Ă��܂����B";
		mes "�Z�X�����j���_�a�̒뉀��";
		mes "�L���������̂ŁA�W�܂����M�k�B��";
		mes "�}����̂Ɉ�Ԃ̏ꏊ�ł��B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�W�܂����M�k�B�H";
		mes "�j���G����_����";
		mes "�ƂĂ��Z�����悤�ł��ˁB";
		next;
		mes "[�M�k�T�s�[]";
		mes "�����Ȃ�ł��B";
		mes "���c�l���Ԃ�V�̍��A";
		mes "�j���G���l�͋��c�l��";
		mes "��ɂ��ꏏ�ł����B";
		next;
		mes "[�M�k�T�s�[]";
		mes "����Ȏ����ɖ������j���G���l��";
		mes "���������߂�l�X��";
		mes "�吨����������̂ł��B";
		mes "������p������̂ł�����A";
		mes "�l���吨�W�܂�O��";
		mes "�s�������������ł���B";
		set NAME_2QUE,10;
		close;
	case 10:
		mes "[�M�k�T�s�[]";
		mes "���炭�A�j���G����_���l��";
		mes "�뉀�ɂ���������Ǝv���܂��B";
		mes "������p������̂ł�����A";
		mes "�l���吨�W�܂�O��";
		mes "�s�������������ł���B";
		close;
	case 23:
	case 24:
		mes "[�M�k�T�s�[]";
		mes "���c�l�Ƀt���C���l���~�Ղ��A";
		mes "�������͂����t��������܂����I";
		mes "����ł����A���̃Z�X�����j����";
		mes "�呛���ł���I";
		close;
	}
}

ra_temple.gat,165,57,5	script	�j���G����_��	915,{
	cutin "ra_gwoman",2;
	mes "[�j���G����_��]";
	mes "���ɘb������悤�ł��ˁB";
	mes "���́c�c���X���Ă���̂ŁA";
	mes "�����b�łȂ���Ί������̂ł����c�c";
	mes "�ŁA�ǂ���������p�ł����H";
	next;
	if(select("�x�C���X�ŕ߂܂����l�ɂ���","�W�F�h��_���ɂ���")==1) {
		switch(NAME_1QUE) {
		default:
			if(NAME_1QUE > 12 && NAME_1QUE < 24) {
				mes "[�j���G����_��]";
				mes "���̈ʒu�́A�x�C���X�̓�̊C�ӂ���";
				mes "�쐼�̕��ɑD���o���Β����܂��B";
				mes "�s���̂͊ȒP�ł����A";
				mes "���n�ň�̉����N�����Ă���̂�";
				mes "�킩��܂���c�c";
				break;
			}
			mes "[�j���G����_��]";
			mes "�x�C���X�ŕ߂܂����l�H";
			mes "���̎��ł����H";
			break;
		case 12:
			mes "[�j���G����_��]";
			mes "�x�C���X�ŕ߂܂����l�H";
			mes "���������ڂ�����������";
			mes "����܂��񂩁H";
			next;
			mes "-�j���G����_���ɁA";
			mes "�@�x�C���X�ŕ߂܂���";
			mes "�@�������l���̎���b����-";
			next;
			mes "[�j���G����_��]";
			mes "�ӂށc�c";
			mes "���̐l�����ł��ˁB";
			mes "�m���ɁA���͒m���Ă��܂��B";
			mes "�Ƃ���ŁA���̒���������";
			mes "����̂������Ă��ǂ��ł����H";
			next;
			mes "[�j���G����_��]";
			mes "�ނ�̑��݂́A�������ɂ�";
			mes "�d�v�ȏ��Ȃ̂ŁA";
			mes "�ȒP�ɋ�����킯�ɂ͂����܂���B";
			next;
			mes "-�j���G����_���ɘb���̂�";
			mes "�@�������������A�ނ�ɂ����ꂽ�l�A";
			mes "�@���[���~�b�h�K�b�c�����̍��ʐE";
			mes "�@�ƌ����Ă���l��";
			mes "�@�T���Ă��鎖��b�����B";
			mes "�@�ܘ_�A���̒����̈˗���ɂ��Ă�";
			mes "�@����Ȃ�����-";
			next;
			mes "[�j���G����_��]";
			mes "�c�c��͂�A�ނ�ł͂Ȃ��A";
			mes "�ނ炪�S�����Ă����l��";
			mes "�ړI�Ȃ̂ł��ˁH";
			next;
			mes "[�j���G����_��]";
			mes "�ӂށc�c�ǂ��ł��傤�B";
			mes "����񋟂������܂��B";
			mes "�������A���������Ƃ���";
			mes "���̗��݂�������Ă��������B";
			mes "�X�����ł����H";
			next;
			menu "�킩��܂���",-;
			mes "[�j���G����_��]";
			mes "�����Ɍ����܂��ƁA";
			mes "�c�c���������ނ��߂܂������A";
			mes "�����čS�����ꂽ�l�����āc�c";
			mes "�ǂ�������ǂ����Y�݂܂����B";
			next;
			mes "[�j���G����_��]";
			mes "���̍S�����ꂽ�l���ǂ��������B";
			mes "�������ɂƂ��Ă͂���͂���";
			mes "�A����肪�o��قǗ~�����������݁B";
			mes "�������A�������������܂����B";
			mes "�����I�ɂ��A�O���I�ɂ��c�c";
			mes "�����āA���̑��݂ւ̏������c�c";
			next;
			mes "[�j���G����_��]";
			mes "�����A����������Ȃ������̂ł��B";
			mes "����ŁA�������͍S�����ꂽ�l��";
			mes "�閧�̏ꏊ�Ɋu�����鎖�ɂ��܂����B";
			mes "�{���Ɉꕔ�̐l�����m��Ȃ��A";
			mes "�����������ɂł��c�c";
			mes "�������c�c";
			next;
			mes "[�j���G����_��]";
			mes "�ނ������Ɋu�����ĊԂ��Ȃ��A";
			mes "�����Ƃ̘A�����؂ꂽ��ł��B";
			next;
			mes "[�j���G����_��]";
			mes "��X�͍Q�ĂĘA�������݁A";
			mes "�����������������I�ɑ���܂������A";
			mes "���������Ȃ������̂ł��B";
			mes "�������������͈�l������";
			mes "�߂��Ă��܂������ǁc�c";
			next;
			mes "[�j���G����_��]";
			mes "���̒������͐��C�������Ă���A";
			mes "�ڂ������͓����܂���ł����B";
			next;
			mes "[�j���G����_��]";
			mes "�����A�u�z��͈������v��";
			mes "���������Ă���炵���ł��c�c";
			mes "����ȗ��A��X�͂����̒�����";
			mes "���߂܂����B";
			next;
			mes "[�j���G����_��]";
			mes "���������A���̐l����";
			mes "���̎��i��ł����������̌v��Ƃ�";
			mes "���֌W�ł����B";
			mes "�܂��A�����̗l�X�Ȗ��̉�����";
			mes "�D�悷�鎖�ɂ��܂����B";
			next;
			mes "[�j���G����_��]";
			mes "���āc�c���̗��݂Ƃ́A";
			mes "���̐l�����u�������ꏊ�ɍs���A";
			mes "�����̏�ԁA�y�т��̐l���̏�Ԃ�";
			mes "���ɋ����ė~�����̂ł��B";
			mes "�ǂ��ł��ˁH";
			next;
			mes "[�j���G����_��]";
			mes "�ǂ����݂��A�����֍s���Ȃ���";
			mes "���Ȃ��̒����͐i�܂Ȃ��̂ŁA";
			mes "���ł��Ǝv���Ă��������B";
			next;
			mes "[�j���G����_��]";
			mes "�ł́A���̐l�����u�������ꏊ��";
			mes "���������܂��傤�B";
			mes "�u�������ꏊ�́A�C���@�ƌĂ΂��";
			mes "�ꏊ�ł��B";
			next;
			mes "[�j���G����_��]";
			mes "�C���@�͂��铇�ɂ���A";
			mes "���܂����n���͂���܂���B";
			mes "�̍��ꂽ�C���@�ŁA�l�X�Ȑl��";
			mes "�Â��Ȋ��ŏC�s���邽�߂�";
			mes "�g���Ă������ł��B";
			next;
			mes "[�j���G����_��]";
			mes "���̎����̑O�܂ł́A";
			mes "�C�s��Ƃ��āA���̍���";
			mes "����������ł��B";
			next;
			mes "[�j���G����_��]";
			mes "����ȏ�ڂ����b�́c�c";
			mes "�@�������Ȃ̂Řb���܂���B";
			mes "�ʒu�́A�x�C���X�̓�̊C�ӂ���";
			mes "�쐼�̕��ɑD���o���Β����܂��B";
			next;
			mes "[�j���G����_��]";
			mes "���܂ł̈ړ����@�ɂ��ẮA";
			mes "�x�C���X�Ŏ��͂ŒT���Ă��������B";
			next;
			mes "[�j���G����_��]";
			mes "�ł͂�낵�����肢���܂��B";
			mes "�������𓾂���A";
			mes "�Y�ꂸ�ɓ`���ɗ��Ă��������B";
			next;
			mes "[�j���G����_��]";
			mes "���ꂩ��A�x�C���X�̎����ǂ�";
			mes "�b�����Ă����܂�����A";
			mes "�b�𕷂��Ă݂�Ɨǂ��ł��B";
			mes "������Ƃ������͕������";
			mes "�v���܂��B";
			set NAME_1QUE,13;
			break;
		case 24:
			if(countitem(7755) < 1) {
				mes "[�j���G����_��]";
				mes "���̈ʒu�́A�x�C���X�̓�̊C�ӂ���";
				mes "�쐼�̕��ɑD���o���Β����܂��B";
				mes "�s���̂͊ȒP�ł����A";
				mes "���n�ň�̉����N�����Ă���̂�";
				mes "�킩��܂���c�c";
				break;
			}
			mes "[�j���G����_��]";
			mes "�c�c�Ȃ�قǁc�c";
			mes "���̌����L�^�ŁA�����ŉ���";
			mes "�������̂��킩��܂����B";
			mes "�����̏d�v�l�����吨";
			mes "�����ɂ��܂������c�c�����Ȃ��Ắc�c";
			mes "�������m�B�𑗂�Ȃ��Ɓc�c";
			next;
			mes "[�j���G����_��]";
			mes "���̂܂ܕ����Ă����ɂ́A";
			mes "�ǂ�Ȋ댯�Ȏ����N���邩";
			mes "�킩��Ȃ����c�c���R�ς݂ł��B";
			mes "�Ƃɂ����A��������J�l�ł����B";
			set NAME_1QUE,25;
			delitem 7755,1;
			if(checkre())
				getexp 50000,0;
			else
				getexp 500000,0;
			break;
		case 25:
			mes "[�j���G����_��]";
			mes "�c�c�܂��A�Z�����Ȃ肻���ł��B";
			break;
		}
		close2;
		cutin "ra_gwoman",255;
		end;
	}
	switch(NAME_2QUE) {
	default:
		mes "[�j���G����_��]";
		mes "�W�F�h�c�c";
		mes "�ނɂ��āA";
		mes "�����b�����͂���܂���B";
		break;
	case 10:
		mes "[�j���G����_��]";
		mes "�b���āc�c�x�P���g�c�c";
		mes "�����A�W�F�h�̎��ł����H";
		next;
		mes "[�j���G����_��]";
		mes "�c�c�����A�v���o���܂����I";
		mes "���Ȃ��͈ȑO����ɓ������l�ł���!?";
		mes "���̐l�͊Â�����I";
		mes "���Ȃ�������ɓ���������";
		mes "�ނ�����Ȗڂɂ����Ă���̂ɁA";
		mes "����ł����Ȃ��Ɓ\�\�\";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "����́A���Ɣނ̖��ł��B";
		mes "������A�W�F�h��_����";
		mes "�����鎖���o����l�́A";
		mes "�j���G����_���������Ȃ��Ɓc�c";
		mes "�����W�F�h��_���{�l����";
		mes "�����܂����B";
		next;
		mes "[�j���G����_��]";
		mes "�c�c�c�c�c�c�c�c";
		mes "�c�c�c�c�c�c�c�c";
		mes "�c�c�c�c�c�c";
		next;
		mes "[�j���G����_��]";
		mes "�m���ɁA�̂̎��Ɣނ�";
		mes "���ʂ̖ړI�������Ԃł����B";
		mes "�c�c�ł��A���͈Ⴂ�܂��B";
		next;
		mes "[�j���G����_��]";
		mes "�������K�v�Ƃ����Ȃ�A";
		mes "���𓖂����Ă݂����������ł��傤�B";
		mes "���͔ނƈႢ�A�ꍏ�������푈��";
		mes "�N���鎖������Ă���̂ł���I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���Ă͔ނƈӎv�����ɂ���";
		mes "���Ȃ��ɉ����������̂ł����H";
		mes "���ɂ́A���Ȃ������̋}�i�h��";
		mes "�l�̂悤�ɍU���I�ɂ�";
		mes "�����܂��񂪁c�c�c�c";
		next;
		mes "[�j���G����_��]";
		mes "�}�i�h���U���I�ł����āc�c�H";
		mes "�Ȃ�A�����h�͕��a��`�ł����H";
		mes "�Ӂc�c���̍l�����̂��Ⴂ�܂��I";
		next;
		mes "[�j���G����_��]";
		mes "�푈�����Ȃ��ƌ����Ă��邾���ŁA";
		mes "�������͖ܘ_�A�������ɂ܂�";
		mes "��l���I�Ŏc���Ȏ�������";
		mes "�ނ�̉������A";
		mes "���a��]�މ����h�Ȃ�ł����I";
		next;
		mes "[�j���G����_��]";
		mes "����Ȏ����m�炸�A";
		mes "�������ŋF���Ă΂��肾����";
		mes "���ƃW�F�h�c�c";
		mes "�����h�A�}�i�h�I";
		mes "����Ă鎖�͉����ς��͂��Ȃ��I";
		next;
		mes "[�j���G����_��]";
		mes "�Ȃ�ǂ�����΂������I";
		mes "���͍s�����܂��B";
		mes "�ꍏ�������푈���N�����A";
		mes "���̍������E�ɏI�~����łI";
		mes "������A���̓W�F�h�ɋ��͂ł��܂���B";
		mes "������肭�������I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�i����ȏ�j���G����_���Ƙb���̂�";
		mes "�@�����݂������c�c";
		mes "�@�W�F�h��_���̏��֖߂�A";
		mes "�@���̘b��`���悤�j";
		set NAME_2QUE,11;
		break;
	case 11:
	case 12:
		mes "[�j���G����_��]";
		mes "�܂������b������";
		mes "�����̂ł����c�c�H";
		mes "������肭�������I";
		break;
	case 13:
		mes "[�j���G����_��]";
		mes "�܂������b������";
		mes "�����̂ł����c�c�H";
		mes "������肭�������I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���̘b�͉�������܂���B";
		mes "�ł��A������c�c";
		next;
		mes "-�j���G����_����";
		mes "�@�W�F�h��_������̎莆��n����-";
		next;
		mes "-�j���G����_���͕s�������ȕ\���";
		mes "�@�莆���󂯎��A����j����-";
		next;
		mes "-�c�c�W�F�h��_���̕��a��]��";
		mes "�@�ӎv���`������̂��A";
		mes "�@�莆��ǂނɂ�A";
		mes "�@�j���G����_���̕\�";
		mes "�@�i�X�Ə_�炩���Ȃ��Ă�����-";
		next;
		mes "[�j���G����_��]";
		mes "�c�c�c�c�c�c�c�c�c�c";
		mes "�c�c�c�c�c�c�c�c";
		mes "�c�c�c�c";
		next;
		mes "[�j���G����_��]";
		mes "�ӂ��c�c";
		next;
		mes "[�M�k�V�s�[]";
		mes "���v�ł����H";
		mes "�j���G���l�c�c�H";
		next;
		mes "[�j���G����_��]";
		mes "���c�c���v�B";
		mes "�����c�c��ꂽ������B";
		next;
		mes "[�j���G����_��]";
		mes "�c�c�c�c�c�c�c�c�c�c";
		mes "�W�F�h�̂������ɂ́c�c";
		mes "�m���Ɉꗝ����܂��B";
		mes "�������A�푈�����̍���";
		mes "�j�ł��ĂԂȂ�āc�c";
		next;
		mes "[�j���G����_��]";
		mes "���ꂪ�{���Ȃ�A";
		mes "�m���ɉ�X��_���B�ɂ́A";
		mes "���̍��Ƌ��c�l�A�����ĐM�k�B�����";
		mes "�`��������܂��B";
		mes "�������c�c�c�c";
		next;
		mes "[�j���G����_��]";
		mes "�c�c�c�c�c�c�c�c";
		mes "�c�c�c�c�c�c�c�c";
		next;
		mes "[�j���G����_��]";
		mes "���������l���鎞�Ԃ����������B";
		mes "�l������������A���̎���";
		mes "�������������܂��B";
		mes "�����͂���ł�����肭�������B";
		set NAME_2QUE,14;
		break;
	case 14:
		if(rand(10)) {
			mes "[�j���G����_��]";
			mes "���������c�c�l�������Ă��������B";
			break;
		}
		mes "[�j���G����_��]";
		mes "�c�c�c�c�c�c�c�c";
		mes "�c�c�c�c�c�c�c�c";
		mes "�c�c�c�c�c�c�c�c";
		emotion 9;
		next;
		mes "[�M�k�V�s�[]";
		mes "�j���G���l�c�c��F�������ł��B";
		mes "�����ł����H";
		emotion 19,"�M�k�V�s�[";
		next;
		mes "[�j���G����_��]";
		mes "�c�c�����A�����ˁc�c";
		mes "���܂ő���ł������A";
		mes "�����Ă������c�c";
		mes "�����������S���c�c�������B";
		mes "�ł��A����Ǝ����̓���";
		mes "�킩�����݂����c�c";
		next;
		mes "-�ƌ����Ȃ���A�j���G����";
		mes "�@���̕���������-";
		next;
		mes "[�j���G����_��]";
		mes "���Ȃ��c�c�����O�́H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes strcharinfo(0);
		mes "�ƌ����܂��B";
		next;
		mes "[�j���G����_��]";
		mes strcharinfo(0)+ "�l�B";
		mes "���Ȃ��͋��c�l�ƌl�I�Șb��";
		mes "������������܂����ˁc�c�H";
		mes "�ł��A^0000FF�����b^000000��";
		mes "�o���Ȃ������ł��傤�B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "����͂܂�c�c";
		mes "���͂��Ă����̂ł����H";
		next;
		mes "-�j���G���͖ق����܂�������-";
		next;
		mes "[�j���G����_��]";
		mes "�����B";
		mes "�ނ̌����ʂ�ɂ��Ă��c�c";
		mes "�܂����ʂȂ񂶂�Ȃ����c�c";
		mes "�����̈Ӗ��̖������~������Ȃ����c�c";
		mes "�S�z�ł����ǂˁB";
		next;
		mes "[�j���G����_��]";
		mes "����ł��A�ނ̓A���i�x���c��";
		mes "����Ȃ�������l�ł��B";
		mes "���̔ނ��F�邾���ł͂Ȃ��A";
		mes "�s�����悤�Ƃ��Ă���B";
		mes "�����獡�x�����c�c";
		mes "������x�����ނ���`���܂��B";
		next;
		mes "[�j���G����_��]";
		mes "�������A�����������܂��B";
		mes "���c�l�ɂ͑S�Ă����b���鎖�B";
		mes "�R���x�����Ȃ�čl����";
		mes "�܂������Ă��Ȃ��Ƃ͎v���܂����c�c";
		next;
		mes "[�j���G����_��]";
		mes "�c�c�b��߂��܂��傤�B";
		mes "���c�l�ɂ́A�������c�l��";
		mes "�����b������_����M�k�B��";
		mes "���Ă��܂��B";
		next;
		mes "[�j���G����_��]";
		mes "�ނ�́A���̍��̎哱����";
		mes "�����Ă���r���h��_����";
		mes "���ڌق����l�����Ȃ̂ŁA";
		mes "�����ǂ������ł���l����";
		mes "�ł͂���܂���B";
		next;
		mes "[�j���G����_��]";
		mes "�������A�W�F�h�̖]�ݒʂ�A";
		mes "���c�l�Ɠ����Șb������ɂ́A";
		mes "�ނ�����c�l����";
		mes "���������K�v������܂��B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c�����ǂ����@��";
		mes "����܂����H";
		next;
		mes "[�j���G����_��]";
		mes "�����ł��ˁc�c�c�c";
		next;
		mes "[�j���G����_��]";
		mes "������x�A���c�l�ɉ���Ă݂܂��񂩁H";
		mes "�ȑO�̂悤�ɁA����I�Șb�����Ȃ���A";
		mes "���b�W�̐_����M�k�B�̏���";
		mes "�T���Ă݂Ă��������B";
		mes "�ǂ�Ȃ����₩�Ȏ��ł��\���܂���B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�͂��I�@�킩��܂����I";
		mes "�C���Ă��������I";
		emotion 21,"";
		set NAME_2QUE,15;
		break;
	case 15:
		mes "[�j���G����_��]";
		mes "�ȑO�̂悤�ɁA";
		mes "���c�l�Ɠ���I�Șb�����Ȃ���A";
		mes "���b�W�̐_����M�k�B�̏���";
		mes "�T���Ă݂Ă��������B";
		mes "�ǂ�Ȃ����₩�Ȏ��ł��\���܂���B";
		break;
	case 16:
		mes "[�j���G����_��]";
		mes "���c�l�͂����C�ł������H";
		mes "���̗���ł͋C����";
		mes "���c�l�Ƃ��b���鎖��";
		mes "�ł��Ȃ��̂Łc�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�͂��B�����C�ł����B";
		mes "���ς炸�����͏��Ȃ��ł����B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�ǂ����A���c�̘b���ƁA";
		mes "���b�W�̐l�X�́A";
		mes "�����ԁA�ƂɋA���Ă��Ȃ��悤�ł��B";
		next;
		mes "[�j���G����_��]";
		mes "�����ł��ˁB";
		mes "������A�����ƈꏏ�ɂ���d���ł��c�c";
		mes "�������N���A���c�l����";
		mes "����鎖�����������Ǝv���܂����c�c";
		next;
		mes "[�M�k�V�s�[]";
		mes "�����`�V�s�[�͂ł��ˁA";
		mes "�j���G���l����D���ł����ǁc�c";
		mes "�ł��A��N�Ɉ�񂭂炢��";
		mes "�Ƒ��ɉ�Ȃ��Ɛh���āc�c";
		mes "�������Ⴄ�����m��܂���I";
		emotion 16,"�M�k�V�s�[";
		next;
		mes "[�j���G����_��]";
		mes "�c�c�c�c�c�c�c�c";
		mes "�����ˁB�V�s�[�̌����ʂ�ˁB";
		mes "�ނ�������������ǁA�����Ȃ�����";
		mes "���t�������ł��傤�ˁB";
		emotion 5;
		next;
		mes "[�M�k�V�s�[]";
		mes "���H�@���t�ł����H";
		mes "������Ă��������āI";
		emotion 2,"�M�k�V�s�[";
		next;
		mes "[�j���G����_��]";
		mes "�ӂӁc�c�����B";
		mes "���E��E���E�݁I";
		next;
		mes "[�j���G����_��]";
		mes strcharinfo(0)+ "�l�B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�͂��I";
		next;
		mes "[�j���G����_��]";
		mes "�ǂ����c�c�ߍ��ȋƖ���";
		mes "��ꂽ�ނ�ɁA�����J�܂�^���Ȃ���";
		mes "�����܂���ˁB";
		next;
		mes "[�j���G����_��]";
		mes "�ł��A�ނ�̓r���h��_����";
		mes "�ق�ꂽ�g�ł��̂Łc�c";
		mes "��������ɋx�ɂ�";
		mes "�^����킯�ɂ͂����܂���B";
		mes "�����Łc�c";
		mes "�V�s�[�A���ƃy�����B";
		next;
		cutin "ra_gwoman",255;
		mes "[�M�k�V�s�[]";
		mes "�͂��I�@�j���G���l�I";
		mes "���ƃy���ł���`";
		next;
		mes "-�j���G���͐^���Ȋ��";
		mes "�@���ɉ�����������-";
		next;
		cutin "ra_gwoman",2;
		mes "[�j���G����_��]";
		mes "�́A�t���C���l�ɕς��A";
		mes "���錴�Z���̎q���ɏj����^����";
		mes "��������܂��B���̍��̌��Z����";
		mes "�n�ʂ͂��Ȃ�Ⴂ�̂ŁA�ނ��";
		mes "�������l���Ǝv���Ă��ꂽ�悤�ł��B";
		next;
		mes "[�j���G����_��]";
		mes "�������b���ƁA";
		mes "���̎q�͑��l�̕M�Ղ�";
		mes "�������肻�̂܂�";
		mes "���������ł���悤�ł��B";
		next;
		mes "[�j���G����_��]";
		mes "���̎莆�ƁA�r���h��_����";
		mes "�M�Ղ����鏑�ނ����n�����܂��B";
		mes "���w���̖k�ɂ���";
		mes "���Z���̕��X���Z��ł��鑺�ɍs���A";
		mes "�C�X�}�G���ƌ����q��";
		mes "�n���Ă��������B";
		next;
		mes "[�j���G����_��]";
		mes "�����ƁA��������";
		mes "���͂��Ă����͂��ł��B";
		mes " ";
		mes "^FF0000���N�G�X�g�A�C�e������肵�܂����B^000000";
		set NAME_2QUE,17;
		getitem 7343,1;
		next;
		mes "^FF0000<<����>>";
		mes "�N�G�X�g�A�C�e���𕴎������ꍇ�A";
		mes "�N�G�X�g��i�s���邱�Ƃ�";
		mes "�ł��Ȃ��Ȃ�\��������܂��B";
		mes "�A�C�e���̎戵���ɂ����ӂ��������B^000000";
		break;
	case 17:
		mes "[�j���G����_��]";
		mes "���̎莆�ƁA�r���h��_����";
		mes "�M�Ղ����鏑�ނ����n�����܂��B";
		mes "���w���̖k�ɂ���";
		mes "���Z���̕��X���Z��ł��鑺�ɍs���A";
		mes "�C�X�}�G���ƌ����q��";
		mes "�n���Ă��������B";
		next;
		mes "[�j���G����_��]";
		mes "�����ƁA��������";
		mes "���͂��Ă����͂��ł��B";
		break;
	case 18:
		mes "[�j���G����_��]";
		mes "�c�c�c�c";
		break;
	case 19:
		mes "[�j���G����_��]";
		mes "�C�X�}�G���ɂ͉�܂������H";
		next;
		mes "-���Ȃ��̓C�X�}�G������";
		mes "�@�󂯎�������ނ�";
		mes "�@�j���G����_���ɓn����-";
		next;
		mes "[�j���G����_��]";
		mes "�c�c����͂������I";
		mes "����Ȃ�A";
		mes "�r���h��_���{�l�����Ă��A";
		mes "���������������̂���";
		mes "�v���Ă��܂��ł��傤�ˁB";
		emotion 0;
		next;
		mes "[�j���G����_��]";
		mes strcharinfo(0)+ "�l�B";
		mes "���͂��̋U�̋x�ɏ��ނŁA";
		mes "���c�l�̐��b�W�B���A";
		mes "��������Ƒ��̏��ɖ߂�����ł��B";
		next;
		mes "[�j���G����_��]";
		mes "��������΁A�W�F�h�͋��c�l��";
		mes "���̎҂ɕ��������Ȃ��悤�Ȏ���";
		mes "�b�����Ƃ��ł��܂��B";
		next;
		mes "[�j���G����_��]";
		mes "�W�F�h���A�c�����c�l��";
		mes "�d�ׂ�w���킹��̂ł͂Ȃ�����";
		mes "�S�z�ł����c�c";
		mes "���c�l���A�������������Ă����̂�";
		mes "�����Ă����������h���ł��傤�c�c";
		next;
		mes "[�j���G����_��]";
		mes "�V�s�[�B";
		mes "���̋x�ɏ��ނ��A�Ƒ��ɉ�Ȃ���";
		mes "�h���v�������Ă���ނ��";
		mes "�n���Ă��Ă��������B";
		next;
		mes "[�M�k�V�s�[]";
		mes "�͂��I";
		next;
		mes "[�j���G����_��]";
		mes strcharinfo(0)+ "�l�B";
		mes "�W�F�h�ɏ������o������";
		mes "�`���Ă��������B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�͂��I";
		next;
		mes "[�j���G����_��]";
		mes "�r���h��_���Ɋ��Â����O�ɁA";
		mes "�S�Ă��I��点�Ȃ���΂Ȃ�܂���B";
		mes "�����A�}���ł��������I";
		delitem 7343,1;
		set NAME_2QUE,20;
		break;
	case 20:
	case 21:
		mes "[�j���G����_��]";
		mes "�����o���邱�Ƃ͂��܂����B";
		mes "��̓W�F�h����ł��c�c";
		break;
	case 22:
		mes "[�j���G����_��]";
		mes "���c�l�̉����c�c";
		mes "�����܂������H";
		next;
		mes "[�j���G����_��]";
		mes "���c�l�Ƀt���C���l��";
		mes "�����t���������ɂȂ�ꂽ�̂��c�c";
		mes "�{���̎��͂킩��܂��񂪁A";
		mes "�f���炵�������ł����B";
		next;
		mes "[�j���G����_��]";
		mes "��_���B���߂���Ƃ����Ƃ͂����A";
		mes "���̍����x���ė����l�X�ł��B";
		mes "�ȒP�ɉ�C����킯�ɂ�";
		mes "�����܂���B";
		next;
		mes "[�j���G����_��]";
		mes "�ł��A���c�l��";
		mes "���ƃW�F�h�ɑ傫�ȗ͂�";
		mes "�����Ă��������܂����B";
		mes "������x�A��_���B�̍s����";
		mes "�����ł���悤�ɂȂ�ł��傤�B";
		next;
		mes "[�j���G����_��]";
		mes "���܂ŉe�Ȃ���w�͂��Ă���";
		mes "�W�F�h�̎���m��A";
		mes "��]���Ă��̍������ׂɗ������Ƃ���";
		mes "�������p���������Ȃ�܂��c�c";
		next;
		mes "[�j���G����_��]";
		mes "�t���C���l�������Ă������邩";
		mes "�킩��܂��񂪁c�c";
		mes "���͂��ꂩ��A���c�l�ƃW�F�h�A";
		mes "����l�Ƌ��ɂ��̍��ׂ̈�";
		mes "�͂�s�����Ă����܂��B";
		next;
		mes "[�j���G����_��]";
		mes "�����A�W�F�h��_�����҂��Ă��܂��B";
		mes "�ނɉ�ɍs���Ă��������B";
		next;
		mes "-�₽�������j���G����_����";
		mes "�@�\��_�炩���Ȃ�A";
		mes "�@���΂݂�������ł���悤�Ɍ�����B";
		mes "�@�����ƁA���̔ޏ��̊炪";
		mes "�@���c�ƃW�F�h��_�����m���Ă���";
		mes "�@�ޏ��{���̕\��Ȃ̂��낤-";
		set NAME_2QUE,23;
		if(checkre())
			getexp 100000,0;
		else
			getexp 1000000,0;
		break;
	case 23:
	case 24:
		mes "[�j���G����_��]";
		mes "�����A���͓��ɖ������肵�܂���B";
		break;
	}
	close2;
	cutin "ra_gwoman",255;
	end;
}

ra_temple.gat,168,54,3	script	�M�k�V�s�[	917,{
	mes "[�M�k�V�s�[]";
	mes "�j���G���l�B";
	mes "����Ƌx�e�o�������ł��ˁI";
	mes "�ŋ߁A�M�k�B���������Ă���̂ŁA";
	mes "�{���ɖZ�����ł��ˁ`";
	mes "�ܘ_�A������Ȃ��āA�j���G���l��";
	mes "�Z������ł����ǂˁB���ւցB";
	if(NAME_2QUE != 11)
		close;
	next;
	mes "[�M�k�V�s�[]";
	mes "�c�c�c�c���c�c";
	next;
	mes "[�M�k�V�s�[]";
	mes "���Ȃ��͋��c�l�̂��F�B�c�c";
	mes "�ł���ˁH";
	mes "�O�ɁA���c�l�Ƃ��Ȃ���";
	mes "�y�������ɘb���Ă���p��";
	mes "������������܂���B";
	next;
	mes "[�M�k�V�s�[]";
	mes "���D�����j���G���l���A";
	mes "���̐푈��]��ł���̂��A";
	mes "���ɂ͂��̗��R�͂킩��Ȃ��c�c";
	mes "�ł��A���̍���������j���G���l���A";
	mes "�{�C�Ő푈��]��ł���͂���";
	mes "����܂���I";
	next;
	mes "[�M�k�V�s�[]";
	mes "�j���G���l�́A";
	mes "�{���ɂ��D�������Ȃ�ł��B";
	mes "�܂�Ŏq���B��������A";
	mes "�A���i�x���c�̂��ꂳ��";
	mes "�݂����ȕ��ł��B";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "���c���A�c������";
	mes "�j���G����_������";
	mes "�F�X�Ƌ�����������ł��ˁB";
	next;
	mes "[�M�k�V�s�[]";
	mes "�����Ȃ�ł��I";
	mes "�܂��Ԃ���񂾂������c�l���A";
	mes "�j���G���l�����w���ɘA���";
	mes "������ł��B";
	next;
	mes "[�M�k�V�s�[]";
	mes "�܂�Ŏ��������񂾎q�̂悤�ɁA";
	mes "���c�l��厖�ɂ��Ă��܂�����B";
	mes "�����A�N�����Ă��{���̐e�q����";
	mes "�v���Ă��܂����ł��傤�ˁB";
	close;
}

ra_fild03.gat,139,355,5	script	�C�X�}�G��	914,{
	switch(NAME_2QUE) {
	default:
		if(NAME_2QUE < 17) {
			mes "[�C�X�}�G��]";
			mes "�ߊ��Ȃ��ŁI";
			mes "�߂��ɒN������ƁA";
			mes "�������s���Ȃ�ł��I";
			emotion 19;
			close;
		}
		mes "[�C�X�}�G��]";
		mes "�j���G���l�͗D�����l�ł��B";
		mes "���́A�j���G���l��M���Ă܂��B";
		mes "�c�c���ǁA���Ȃ���";
		mes "���̋߂��ɂ���͕̂s���ł�����A";
		mes "��������Ă�������!!";
		close;
	case 17:
		mes "[�C�X�}�G��]";
		mes "�ߊ��Ȃ��ŁI";
		mes "�߂��ɒN������ƁA";
		mes "�������s���Ȃ�ł��I";
		mes "���ɗp���Ȃ��Ȃ�A";
		mes "�������ցA�����Ɖ�����";
		mes "�s���Ă��������I";
		emotion 19;
		next;
		if(select("�j���G������n���ꂽ���ނ�n��","�Â��ɗ�������")==2) {
			mes "[�C�X�}�G��]";
			mes "�������Ȃ��ł��������ˁI";
			close;
		}
		mes "[" +strcharinfo(0)+ "]";
		mes "�j���G����_����";
		mes "�m���Ă��܂��ˁH";
		mes "����́A���̕����炠�Ȃ��ւ�";
		mes "���͂����ł��B";
		next;
		mes "[�C�X�}�G��]";
		mes "�����H�@�j���G���l!?";
		mes "���������āI";
		mes "�����I�@��������āA";
		mes "����܂�ߊ��Ȃ��ł�I";
		emotion 19;
		next;
		mes "[�C�X�}�G��]";
		mes "���ւց`";
		mes "�j���G���l�͖{���ɗD�����l�Ȃ񂾂�B";
		mes "���̐l�ƈ���āA";
		mes "���Z�������ʂ����肵�Ȃ����c�c";
		mes "����ȃj���G���l���玄�Ɂc�c";
		mes "��̂Ȃɂ��ȁ`�H";
		next;
		mes "-�J�T�@�J�T�@�J�T�@�J�T-";
		next;
		mes "[�C�X�}�G��]";
		mes "�ӂ�ӂ�c�c";
		mes "������Ƃ��������ʂ���";
		mes "���肢�ˁB";
		next;
		mes "[�C�X�}�G��]";
		mes "�����ʂ��Ȃ�āA";
		mes "���ɂƂ��Ă͒��ёO�I";
		mes "������Ƒ҂��ĂĂˁB";
		mes "�����ɂ�����Ⴄ����B";
		next;
		mes "[�C�X�}�G��]";
		mes "�����I�@��΃b�I";
		mes "����A����p�̕M�L�p���";
		mes "���E�B�[���ɓ��܂ꂽ�񂾂����c�c";
		mes "�ǂ����悤�c�c";
		emotion 23;
		next;
		mes "[�C�X�}�G��]";
		mes "^FF0000�T�[�h�I�j�L�X^000000���Đ΂�";
		mes "����č�����M�L�p������̂Ɂc�c";
		mes "�A���i�x���c����A���̐΂𔄂��Ă���";
		mes "�l�����Ȃ��́c�c";
		mes "�ׂ̍��ł͂������񔄂��Ă������";
		mes "�������񂾂��ǁc�c";
		emotion 28;
		next;
		mes "[�C�X�}�G��]";
		mes "�M�L�p��Ⴄ��";
		mes "�����Ə��肪�Ⴄ����";
		mes "��肭�����Ȃ��c�c";
		mes "�j���G���l�̂��肢��";
		mes "�����Ă������������̂Ɂc�c";
		delitem 7343,1;
		set NAME_2QUE,18;
		close;
	case 18:
		if(countitem(725) < 1) {
			mes "[�C�X�}�G��]";
			mes "�T�[�h�I�j�L�X�ō����";
			mes "���̕M�L�p�������΁A";
			mes "�����ɂł���̂Ɂ`�I";
			emotion 28;
			close;
		}
		mes "[" +strcharinfo(0)+ "]";
		mes "���̃T�[�h�I�j�L�X�������";
		mes "���v�H";
		next;
		mes "[�C�X�}�G��]";
		mes "���H";
		mes "�c�c���������A����I";
		mes "�T�[�h�I�j�L�X�b!!";
		next;
		mes "[�C�X�}�G��]";
		mes "���A�T�[�h�I�j�L�X�����邩����āA";
		mes "���܂�ߊ��Ȃ��łˁB";
		emotion 19;
		next;
		mes "[�C�X�}�G��]";
		mes "���̃T�[�h�I�j�L�X�������";
		mes "�����ɏ����ʂ����ł����B";
		mes "�����炻������ɂ��傤�����I";
		next;
		if(select("�����Ȃ�","������")==1) {
			mes "[�C�X�}�G��]";
			mes "����!?";
			mes "���Ȃ��A�j���G���l��";
			mes "�g���̎҂ł���!?";
			mes "�����ʂ�������񂶂�Ȃ��́I";
			close;
		}
		mes "[�C�X�}�G��]";
		mes "��������I";
		mes "���肪�Ƃ�!!";
		next;
		mes "[�C�X�}�G��]";
		mes "���`�āA�r��U�邤�Ƃ��܂����I";
		next;
		mes "-�M�R�@�M�R�@�M�R�@�M�R-";
		misceffect 188;
		next;
		mes "-�J���@�J���@�J��-";
		misceffect 190;
		next;
		mes "-�V���@�V���@�V��-";
		misceffect 190;
		misceffect 18;
		emotion 5;
		next;
		mes "[�C�X�}�G��]";
		mes "�͂��I�@�o������!!";
		mes "�j���G���l�ɂ�낵������";
		mes "�`���ĂˁB";
		mes " ";
		mes "-�C�X�}�G������A";
		mes "�@�U�̋x�ɏ��ނ��󂯎����-";
		set NAME_2QUE,19;
		delitem 725,1;
		getitem 7343,1;
		next;
		mes "^FF0000<<����>>";
		mes "���N�G�X�g�A�C�e������肵�܂����B";
		mes "�N�G�X�g�A�C�e���𕴎������ꍇ�A";
		mes "�N�G�X�g��i�s���邱�Ƃ�";
		mes "�ł��Ȃ��Ȃ�\��������܂��B";
		mes "�A�C�e���̎戵���ɂ����ӂ��������B";
		close;
	}
}

que_temsky.gat,99,7,0	warp	quetemskyout	1,1,ra_temin.gat,276,231

que_temsky.gat,101,93,1	script	�j���G����_��#name	915,{}
que_temsky.gat,98,93,7	script	�W�F�h��_��#name	932,{}
que_temsky.gat,99,100,6	script	���c#name	936,{}
que_temsky.gat,100,93,0	script	�y��#name	139,5,2,{
	if(NAME_2QUE != 21)
		end;
	mes "-�W�F�h�ƃj���G���A";
	mes "�@��l�̑�_���c�c�����ċ��c�B";
	mes "�@��l�͂��ꂩ��s������";
	mes "�@���ꂪ����̂��A�Â����";
	mes "�@���c�����Ă���-";
	next;
	cutin "ra_gman",0;
	mes "[�W�F�h��_��]";
	mes "�c�c���c�l�A�����������Ă���܂��B";
	mes "���̖��\�ȑ�_���c�c";
	mes "���c�l�ɍ��킹��炪�Ȃ��A";
	mes "�����A���A���o���܂���ł����B";
	mes "�\���󂠂�܂���c�c";
	next;
	cutin "ra_bishop",2;
	mes "[���c]";
	mes "�c�c�c�c";
	mes "�W�F�h�c�c";
	next;
	mes "-���c�͋v���Ԃ�ɉ�W�F�h��";
	mes "�@�\���ς����Ɍ���-";
	next;
	cutin "ra_gwoman",0;
	mes "[�j���G����_��]";
	mes "���c�l�B";
	mes "���̃j���G���A���c�l�ɂ�";
	mes "�Y��Ŕ��������̂����������A";
	mes "�ǂ��b������`���悤��";
	mes "�w�͂��Ă܂���܂����B";
	next;
	cutin "ra_bishop",2;
	mes "[���c]";
	mes "�c�c�c�c";
	mes "�j���G���c�c�c�c";
	next;
	cutin "ra_gwoman",0;
	mes "[�j���G����_��]";
	mes "�������A�����͗ǂ��񍐂�����";
	mes "�����̂ł͂���܂���B";
	mes "��ϐh���b�ɂȂ邩�Ǝv���܂��c�c";
	mes "�\���󂠂�܂���c�c";
	next;
	mes "[�j���G����_��]";
	mes "�c�c�c�c�c�c�c�c";
	mes "�c�c�c�c�c�c�c�c";
	next;
	mes "[�j���G����_��]";
	mes "�󒆒뉀�̊F�ɋx�ɂ�^�����̂́A";
	mes "���ł��c�c";
	mes "�����͋��c�l�ɐ���Ƃ�";
	mes "�\���グ���������Ȃ��b������܂��B";
	next;
	cutin "ra_bishop",2;
	mes "[���c]";
	mes "�b�c�c�H";
	next;
	cutin "ra_gman2",0;
	mes "[�W�F�h��_��]";
	mes "���c�l�B";
	mes "�����畷���b���������c�c";
	mes "����̂܂܂ɕ����Ă��������B";
	next;
	mes "-�W�F�h�͖ڂ̑O�ɂ���c�����c�ɁA";
	mes "�@�A���i�x���c�̔閧����������";
	mes "�@�b���n�߂�-";
	next;
	mes "-�����h�Ƌ}�i�h�ɂ킩�ꂽ��_���B�A";
	mes "�@���a���咣���������h���ė����A";
	mes "�@�V���o���c�o���h�̊�ƂƎ��g�݁A";
	mes "�@��l���I�Ȏ��������Ă������B";
	mes "�@�}�i�h���g�[���ΎR�ŌR�̏�����";
	mes "�@�����Ă������Ȃǁc�c-";
	next;
	mes "-�A���i�x���c�̗��̎����";
	mes "�@����̂܂܂ɓ`�����W�F�h��_���́A";
	mes "�@��F��ς����A����������";
	mes "�@�ނ̊�����ߑ�����";
	mes "�@���c�̊�����āA";
	mes "�@��u�����b���~�߂�-";
	next;
	mes "[�W�F�h��_��]";
	mes "�c�c�ܘ_�c�c�܂��c�����c�l�ɂ�";
	mes "���̂悤�Șb�A�ƂĂ��d�����ׂ�";
	mes "�Ȃ邩�Ǝv���܂��c�c";
	mes "�������A���͋��c�l�̂��͂�";
	mes "���̍��ɂ͕K�v�Ȃ̂ł��I";
	next;
	cutin "ra_bishop",2;
	mes "[���c]";
	mes "�c�c�c�c�c�c�c�c�c�c";
	mes "�c�c�c�c�c�c�c�c";
	mes "�c�c�c�c";
	next;
	cutin "ra_gwoman",0;
	mes "[�j���G����_��]";
	mes "���c�l�c�c";
	mes "���̂悤�ȓ���b�����鎄��";
	mes "���������������B";
	mes "�������A�A���i�x���c��";
	mes "�푈�Ɋ������ގ������́A";
	mes "�����Ȃ���΂Ȃ�Ȃ��̂ł��I";
	next;
	cutin "ra_bishop",2;
	mes "[���c]";
	mes "�c�c�c�c�c�c�c�c�c�c";
	mes "�c�c�c�c�c�c�c�c";
	mes "�c�c�c�c�c�c";
	mes "�c�c����Ɓc�c";
	next;
	cutin "ra_gman2",0;
	mes "[�W�F�h��_�� / �j���G����_��]";
	mes "�c�c�c�c���H";
	next;
	cutin "ra_bishop",2;
	mes "[���c]";
	mes "����ƁA��l�Ŏ��̏���";
	mes "���Ă���܂����ˁB";
	mes "�j���G���A�W�F�h�B";
	next;
	mes "[���c]";
	mes "���̎��͗c�����ǁA";
	mes "�����Ɨc�����A";
	mes "���͐���ɓ�������������܂��B";
	next;
	mes "-���c�̒�����́A";
	mes "�@����قǂ܂ł̕Ќ��Ȍ��t�g��";
	mes "�@�Ƃ͈Ⴂ�A�z�Ƃ��Ă���-";
	next;
	mes "-�W�F�h�ƃj���G���́A";
	mes "�@�ʐl�̗l�ȋ��c�̎p��";
	mes "�@���R�Ƃ��Ă����B";
	mes "�@�c�c����A����͎�������������-";
	next;
	mes "[���c]";
	mes "�j���G���A�o���Ă��܂��񂩁H";
	mes "���̎��A���悩�玄��A��o�����̂�";
	mes "�j���G���������̂ł����c�c";
	next;
	mes "[���c]";
	mes "���̎��A����𖄂ߐs�����Ă���";
	mes "^3131FF���~���̐S��^000000�A";
	mes "�������̖ڂŌ��܂����B";
	next;
	cutin "ra_gman2",0;
	mes "[�W�F�h��_��]";
	mes "�c�c���A���ꂪ";
	mes "���~���̐S���ł��鎖���A";
	mes "�ǂ��ł��m���!?";
	next;
	cutin "ra_bishop",2;
	mes "[���c]";
	mes "�󒆒뉀�̐_���B�́A";
	mes "���ł��b���Ă��܂����B";
	mes "�c�c�����A���ɕ������Ă�";
	mes "�킩��Ȃ��Ǝv�����̂ł��傤�B";
	next;
	mes "-���c�͍��܂ł̐U�镑������";
	mes "�@�J�����ꂽ�������A";
	mes "�@���������ߑ������A";
	mes "�@�ɂ�����Ɣ��΂�-";
	next;
	mes "[���c]";
	mes "�����h�̎����A�}�i�h�̌R�A";
	mes "���̂ǂ�������͒m���Ă��܂����B";
	mes "�c�c�������A���ɏo���鎖�͉����c�c";
	mes "��������܂���ł����c�c";
	next;
	mes "[���c]";
	mes "����ȏ����Ȏq����";
	mes "�����o����ł��傤�c�c";
	mes "�����A�Ⴆ���悤�Ƃ��Ă��A";
	mes "��������l�ł͑��̎҂�����";
	mes "�����ׂ���邾���ł��c�c";
	next;
	mes "[���c]";
	mes "�c�c������҂��Ă��܂����B";
	mes "���Ƌ��ɂ��Ă����l���B";
	mes "�W�F�h�A�j���G���B";
	mes "���Ȃ����������ӂ��A";
	mes "���ɉ�ɗ��Ă����̂��B";
	next;
	mes "[���c]";
	mes "�W�F�h�A���Ȃ�������ɊO�̐l�����A";
	mes "���͂��������ƕ����Ă��炸���ƁA";
	mes "���Ȃ��̎������Ă��܂����B";
	mes "��͂�c�c���̕����A";
	mes "�A���i�x���c�ׂ̈�";
	mes "�撣���Ă����������̂ł��ˁH";
	next;
	mes "[���c]";
	mes "����Ɂc�c�ӂӁc�c";
	mes "���ɖʔ����b��";
	mes "�������Ă���܂����ˁB";
	next;
	mes "-���̕����݂ď��������΂�";
	mes "�@���c�����āA���ɂǂ���";
	mes "�@���₵���悤�Ȋ���������B";
	mes "�@����Ȃɕ��ʂɂ���ׂ���q���A";
	mes "�@���܂ł����Ɩ����Ȏq���Ƃ���";
	mes "�@�U�����Ă����Ȃ�āc�c-";
	next;
	cutin "ra_gwoman",0;
	mes "[�j���G����_��]";
	mes "���c�l�����̂悤��";
	mes "�����h�ɂȂ��Ă���Ƃ�";
	mes "�v���Ă��݂܂���ł����c�c";
	mes "�����ԁA���c�l�̂����b��";
	mes "�����Ă��������Ă����̂Ɂc�c";
	mes "�{���ɂ��p������������ł��c�c";
	next;
	cutin "ra_bishop",2;
	mes "[���c]";
	mes "����グ�āA�j���G���B";
	mes "�j���G�������Ȃ�������c�c";
	mes "�j���G�����c������";
	mes "�΂��Ă���Ȃ�������c�c";
	mes "���̎��͂��Ȃ��B�������܂ł�";
	mes "�p���{���Ɏ��ɂȂ��Ă����c�c";
	next;
	mes "[���c]";
	mes "���Ɋ����^���Ă��ꂽ�l�c�c";
	mes "���̓j���G�����A��̂悤��";
	mes "�v���Ă��܂��B";
	next;
	cutin "ra_gwoman",0;
	mes "[�j���G����_��]";
	mes "���c�l�c�c";
	next;
	mes "[�j���G����_��]";
	mes "���c�l�́c�c���ɂƂ��Ă��c�c";
	mes "�c�c���́c�c�悤�Ɂc�c";
	mes "��؂Ȑl�ł��B";
	next;
	mes "-�j���G����_���́A";
	mes "�@�����o�������Ȋ����";
	mes "�@�K���ɂ��炦�Ȃ���A";
	mes "�@�����̎v����������-";
	next;
	cutin "ra_bishop",2;
	mes "[���c]";
	mes "�W�F�h�c�c";
	next;
	cutin "ra_gman",0;
	mes "[�W�F�h��_��]";
	mes "�͂��A���c�l�B";
	next;
	cutin "ra_bishop",2;
	mes "[���c]";
	mes "�����h�̑�_���̖���B";
	mes "�A���i�x���c�ƃV���o���c�o���h��";
	mes "���s�����������e�B";
	mes "�����āA�����ƂƂ̊֌W�ɂ��Ă�";
	mes "�񍐏����쐬���Ă��������B";
	next;
	cutin "ra_gman",0;
	mes "[�W�F�h��_��]";
	mes "�͂��A�킩��܂����B";
	next;
	cutin "ra_bishop",2;
	mes "[���c]";
	mes "�����āA�j���G���B";
	next;
	cutin "ra_gwoman",0;
	mes "[�j���G����_��]";
	mes "�c�c�͂��B";
	next;
	cutin "ra_bishop",2;
	mes "[���c]";
	mes "�j���G���́A�}�i�h���i�߂Ă���";
	mes "�푈�����̏؋����W�߂Ă��������B";
	next;
	cutin "ra_gwoman",0;
	mes "[�j���G����_��]";
	mes "�킩��܂����B";
	next;
	cutin "ra_bishop",2;
	mes "[���c]";
	mes "����A�S�Ă̑�_���������ɌĂт܂��B";
	mes "���̎���l�́A���̂��΂�";
	mes "���̑�_�����������Ȃ��悤";
	mes "���ӂ��Ă��������B";
	next;
	mes "[���c]";
	mes "�t���C���l�̐��Ȃ�Ƃ�";
	mes "�l�ԓ��m�̑����݂̏ꏊ�ɂ���";
	mes "�킯�ɂ͂����܂���B";
	next;
	cutin "ra_gwoman",0;
	mes "[�W�F�h��_�� / �j���G����_��]";
	mes "�͂��B";
	next;
	cutin "ra_bishop",2;
	mes "[���c]";
	mes "�����āc�c�c�c";
	next;
	cutin "ra_gman",0;
	mes "[�W�F�h��_��]";
	mes "���A���̕��̖���";
	mes strcharinfo(0);
	mes "�Ɛ\���܂��B";
	next;
	cutin "ra_bishop",2;
	mes "[���c]";
	mes strcharinfo(0)+ "�B";
	mes "���܂ŃA���i�x���c�ׂ̈�";
	mes "�͂𒍂��ł�������A";
	mes "���肪�Ƃ��������܂����B";
	next;
	mes "[���c]";
	mes "���ꂩ��A���̓W�F�h�ƃj���G���A";
	mes "��l�̗͂��؂�A";
	mes "�A���i�x���c�̂��߂�";
	mes "�s�����Ă����܂��B";
	next;
	mes "[���c]";
	mes "�������A���Ȃ��͉��ɂ����O�ҁc�c";
	mes "����ȏ�A��_���B�Ƃ̝��ߎ��ɁA";
	mes "�������ނ킯�ɂ͂����܂���B";
	mes "����͎������ŉ������ׂ����c�c";
	mes "�ǂ����A���������A���i�x���c�̕��a��";
	mes "���߂��̂�������Ă��Ă��������B";
	next;
	mes "[���c]";
	mes "�S�Ă̓t���C���l��";
	mes "�]�ނ悤�ɂȂ�ł��傤�B";
	next;
	misceffect 125,"";
	mes "-���c�̘b���I���ƁA";
	mes "�@�����g�����������̑̂�";
	mes "�@�����C�������B";
	mes "�@�ƂĂ��_�炩���c�c���������c�c";
	mes "�@�C�����̗ǂ���������-";
	set NAME_2QUE,22;
	close2;
	warp "rachel.gat",142,136;
	end;
}

rachel.gat,142,136,0	script	����#name	139,5,5,{
	if(NAME_2QUE == 22) {
		initnpctimer;
		hideonnpc;
	}
	end;
OnTimer4000:
	announce "���c�F�e���Ȃ�A���i�x���c�����̊F�l�B",9,0xFFCE00;
	end;
OnTimer7000:
	announce "���c�F�����āA�󒆒뉀�ɏW�܂�����_���̕��X�B",9,0xFFCE00;
	end;
OnTimer10000:
	announce "���c�F�t���C���l�̉��g�Ƃ��āA���̋󒆒뉀�ɏZ�ގ��ɁA�t���C���l���炨���t������܂����B",9,0xFFCE00;
	end;
OnTimer15000:
	announce "���c�F�c�c�c�c���܂ŁA�A���i�x���c�̑S�Ă����Ă����B",9,0x66CCCC;
	end;
OnTimer19000:
	announce "���c�F��_���B�͔h��������ċ����A�����͐S����ɂ��Ȃ������S�Č��Ă����B",9,0x66CCCC;
	end;
OnTimer23000:
	announce "���c�F�������A���̃A���i�x���c�̕��a�ׁ̈A�S���𒍂����҂���l�����B",9,0x66CCCC;
	end;
OnTimer30000:
	announce "���c�F�W�F�h�A�j���G���B��l�͉��g�Ƌ��ɍ݂�B�����āA�䂪�~�Ղ���܂ŉ��g����邪�悢�B",9,0x66CCCC;
	end;
OnTimer35000:
	announce "���c�F�����āA���@���n���ւ̖��ɖڂ�D��ꂽ���̑�_���B�́A���̗͂𔼂Ƃ��A�j���G���ƃW�F�h�̉��ɍ݂�B",9,0x66CCCC;
	end;
OnTimer43000:
	announce "���c�F���������A���̍��������邪�悢�I�@�A���i�x���c�̐M�k�B��I",9,0x66CCCC;
	end;
OnTimer47000:
	announce "���c�F���̐S����΁A��������Ɋy�����K���ł��낤�I",9,0x66CCCC;
	end;
OnTimer53000:
	announce "�l�X�̋��сF���@�[!!�@�t���C���l���΁I�@���c�l���΁I",9,0x99CC00;
	stopnpctimer;
	hideoffnpc;
	end;
}

//============================================================
// �؋��ԍσN�G�X�g
//- Registry -------------------------------------------------
// NAME_3QUE -> 0�`14
//------------------------------------------------------------
comodo.gat,224,187,3	script	�}�v	86,{
	switch(NAME_3QUE) {
	case 0:
		mes "[�}�v]";
		mes "����������Ȃ���!!";
		mes "�����Ȃ�b�������Ȃ��ł���Ȃ����H";
		next;
		mes "[�}�v]";
		mes "�ӂ��c�c";
		mes "�����ˁH";
		mes "���ɗp������̂����H";
		next;
		if(select("�ǂ�������܂����H","�������A���炵�܂�")==2) {
			mes "[�}�v]";
			mes "�ȁA������H";
			mes "���܂𔄂��Ă���̂��H";
			next;
			mes "[�}�v]";
			mes "������A�N�́c�c";
			mes "�x���_�̎艺���c�c�H";
			mes "���̕󕨂͎��߂��Ă�邩��A";
			mes "�o�債�Ƃ���!!";
			mes "���̃����[!!";
			next;
			if(select("�ǂ��������ł����H","���݂܂���B��k�̂���ł�����")==1) {
				mes "[�}�v]";
				mes "����؂����Ƃ���ł킩���Ă�񂾁I";
				mes "���O��Ƙb�����Ȃ񂩁A����!!";
				close;
			}
			mes "[�}�v]";
			mes "��k�H";
			mes "�x���_�̎艺����Ȃ��̂��c�c";
			mes "���́A����k�𕷂��C�����ᖳ���c�c";
			mes "�ӂ�����̂͂�߂Ă���I";
			close;
		}
		if(BaseLevel <= 60) {
			mes "[�}�v]";
			mes "�����Ă���Ă��肪�������ǁA";
			mes "���̔Y�ݑ��k�ɏ��ɂ́c�c";
			mes "�N�́A������c�c";
			next;
			mes "[�}�v]";
			mes "�܂��A�����v��Ȃ��ł���B";
			mes "�ȒP�ɉ����ł���Y�݂Ȃ�A";
			mes "��������Ȃɂ͋ꂵ�܂Ȃ��B";
			mes "�N�ɂ́A�������B";
			next;
			mes "[�}�v]";
			mes "�N�́A�����̐����ɗ��ł���B";
			mes "�C��������������B";
			mes "���肪�Ƃ��`";
			set NAME_3QUE,1;
			close;
		}
		mes "[�}�v]";
		mes "�����Ă���Ă��肪�Ƃ��I";
		mes "�c�c���͉������̊ԁA";
		mes "������ŔY��ł��ĂˁB";
		mes "�N�ɂȂ痊�߂������ȁc�c";
		next;
		mes "[�}�v]";
		mes "�ŋ߁c�c�����J��ɍ����Ă���";
		mes "�A���x���^��^0000FF�x���_^000000�Ƃ���";
		mes "�����݂��ɂ������؂肽�񂾁B";
		mes "���̕ӂł͗L���Ȉ��������݂������ǁA";
		mes "�����؉H�l���Ă�������ˁc�c";
		next;
		mes "[�}�v]";
		mes "�����Ǝ؋���Ԃ��Z�i�͂������񂾁I";
		mes "���ۂɕԍϊ����O�ɋ����p�ӂ������ˁB";
		mes "�ł��c�c";
		next;
		mes "[�}�v]";
		mes "���́c�c";
		mes "�ؓ��؏��𖳂����Ă��܂����񂾁I";
		next;
		mes "[�}�v]";
		mes "�x���_�ɂ��̎���b���Ă݂���";
		mes "���ɋ���݂����o���������Ƃ��A";
		mes "��̂킩��Ȃ����������񂾁c�c";
		next;
		mes "[�}�v]";
		mes "���������ǁc�c";
		mes "�S�ۂƂ��ĉ����a��������";
		mes "�Ԃ������Ȃ�����A";
		mes "����Ȏ��������Ă���񂾂�";
		mes "�v���񂾂��c�c";
		next;
		mes "[�}�v]";
		mes "���肢���c�c";
		mes "�����Ȃ����ؓ��؏���T���Ă���I";
		mes "�S�ۂƂ��ėa�������́c�c";
		mes "���ɂƂ��Ė������厖�ȕ󕨂Ȃ񂾁I";
		mes "���肢���c�c";
		next;
		if(select("���������ꏊ���o���Ă��܂����H","�����Ɓc�c���炵�܂�")==2) {
			mes "[�}�v]";
			mes "�c�c�b�𕷂�����������";
			mes "������̂��c�c";
			close;
		}
		mes "[�}�v]";
		mes "���������������o���Ă����";
		mes "�N�ɗ��ޑO�Ɏ����ŒT���ɍs�����낤�H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�܂��A�������킸�A";
		mes "�����̎����v���o���Ă݂Ă��������B";
		next;
		mes "[�}�v]";
		mes "���[��c�c";
		mes "���̓��́A�m���c�c";
		next;
		mes "[�}�v]";
		mes "���l�g���̉���������񂾂���";
		mes "�����߂�r���A";
		mes "�R���h�̋߂��ɂ��鐅�����";
		mes "�����ɓ]�񂾂񂾁c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c";
		next;
		mes "[�}�v]";
		mes "�ȁA������B���̊�́I";
		mes "���̎��́A�w�x���P�����������";
		mes "�悭�o���Ă��Ȃ��񂾁I";
		next;
		mes "[�}�v]";
		mes "�ł��c�c";
		mes "�R���h�ɒ������O�܂ł�";
		mes "�ؓ��؏��͂������Ǝv����B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���́A���������؂���ł����H";
		next;
		mes "[�}�v]";
		mes "�ؓ��؏��́A���z�ɓ���Ă��ĂˁB";
		mes "���z�́A������œ]�ԑO��";
		mes "�G�����L��������񂾁B";
		mes "�������A���������Ă������A";
		mes "���ƂȂ������ǂˁc�c";
		next;
		mes "[�}�v]";
		mes "���̂܂ܐ�����ŐQ�Ă��܂����悤�ŁA";
		mes "�����A�C���t��������z�ƈꏏ��";
		mes "�ؓ��؏��͏����Ă������Ė�B";
		next;
		mes "[�}�v]";
		mes "�������c�c";
		mes "���Ȃ�Ĉ��܂Ȃ���΂悩����!!";
		next;
		mes "[�}�v]";
		mes "��́A�����Ƃ��邩��c�c";
		mes "�ǂ����ؓ��؏���T���Ă���!!";
		set NAME_3QUE,2;
		close;
	case 1:
		if(BaseLevel <= 60) {
			mes "[�}�v]";
			mes "�c�O�����ǁA�N�ɂ͗��߂����ɖ����B";
			mes "�����Ǝ�����b���Ȃ����B";
			mes "�l�̔Y�݂��A";
			mes "�����𐬒�������̂��悾�낤�H";
			close;
		}
		mes "[�}�v]";
		mes "�����Ă���Ă��肪�Ƃ��I";
		mes "�c�c���͉������̊ԁA";
		mes "������ŔY��ł��ĂˁB";
		mes "�N�ɂȂ痊�߂������ȁc�c";
		next;
		mes "[�}�v]";
		mes "�ŋ߁c�c�����J��ɍ����Ă���";
		mes "�A���x���^��^0000FF�x���_^000000�Ƃ���";
		mes "�����݂��ɂ������؂肽�񂾁B";
		mes "���̕ӂł͗L���Ȉ��������݂������ǁA";
		mes "�����؉H�l���Ă�������ˁc�c";
		next;
		mes "[�}�v]";
		mes "�����Ǝ؋���Ԃ��Z�i�͂������񂾁I";
		mes "���ۂɕԍϊ����O�ɋ����p�ӂ������ˁB";
		mes "�ł��c�c";
		next;
		mes "[�}�v]";
		mes "���́c�c";
		mes "�ؓ��؏��𖳂����Ă��܂����񂾁I";
		next;
		mes "[�}�v]";
		mes "�x���_�ɂ��̎���b���Ă݂���";
		mes "���ɋ���݂����o���������Ƃ��A";
		mes "��̂킩��Ȃ����������񂾁c�c";
		next;
		mes "[�}�v]";
		mes "���������ǁc�c";
		mes "�S�ۂƂ��ĉ����a��������";
		mes "�Ԃ������Ȃ�����A";
		mes "����Ȏ��������Ă���񂾂�";
		mes "�v���񂾂��c�c";
		next;
		mes "[�}�v]";
		mes "���肢���c�c";
		mes "�����Ȃ����ؓ��؏���T���Ă���I";
		mes "�S�ۂƂ��ėa�������́c�c";
		mes "���ɂƂ��Ė������厖�ȕ󕨂Ȃ񂾁I";
		mes "���肢���c�c";
		next;
		switch(select("���������ꏊ���o���Ă��܂����H","����S�ۂƂ��ėa�����̂ł����H","�����Ɓc�c���炵�܂�")) {
		case 1:
			mes "[�}�v]";
			mes "���������������o���Ă����";
			mes "�N�ɗ��ޑO�Ɏ����ŒT���ɍs�����낤�H";
			next;
			mes "[" +strcharinfo(0)+ "]";
			mes "�܂��A�������킸�A";
			mes "�����̎����v���o���Ă݂Ă��������B";
			next;
			mes "[�}�v]";
			mes "���[��c�c";
			mes "���̓��́A�m���c�c";
			next;
			mes "[�}�v]";
			mes "���l�g���̉���������񂾂���";
			mes "�����߂�r���A";
			mes "^FF0000�p�v�`�J�X^000000��ʂ������A";
			mes "�������ܐ����Ă��������ŁA";
			mes "������̏��œ]��ł��܂��āc�c";
			next;
			mes "[�}�v]";
			mes "��Ȃ����ɂǂ���炻�̂܂�";
			mes "�Q�Ă��܂����悤�Łc�c";
			mes "���A�N������c�c";
			mes "���z�������Ȃ��Ă����񂾁B";
			next;
			mes "[�}�v]";
			mes "���́c�c";
			mes "�ؓ��؏��́A���z�ɓ���Ă�����!!";
			mes "�������c�c";
			mes "���Ȃ�Ĉ��܂Ȃ���΂悩����!!";
			next;
			mes "[�}�v]";
			mes "���z���A�����S���v��Ȃ�����A";
			mes "�ؓ��؏������ł��A�T���Ă���Ȃ����H";
			mes "���肢���c�c!!";
			next;
			mes "[�}�v]";
			mes "��́A�����Ƃ��邩��c�c";
			mes "�ǂ����ؓ��؏���T���Ă���!!";
			set NAME_3QUE,2;
			close;
		case 2:
			mes "[�}�v]";
			mes "���c�c����́c�c";
			mes "�����ꐶ�������Č�����";
			mes "�厖�ȕ󕨂Ȃ񂾁B";
			mes "���ɂ͒m���Ă��Ȃ����ǁA";
			mes "�����M�d�ȕ��Ȃ񂾁I";
			next;
			mes "[�}�v]";
			mes "������c�c";
			mes "����ȖڂŌ��Ȃ��Ă��c�c";
			mes "�����̕�΂����āB";
			mes "�傫���Ĕ�������΁B";
			next;
			mes "[�}�v]";
			mes "����Ȃɍׂ�������";
			mes "�����Ȃ��ŗ~�����񂾂��c�c";
			mes "�N�ɐ�������K�v�͖������낤�H";
			next;
			mes "[�}�v]";
			mes "�܂��A�C�����Ȃ��Ȃ�A";
			mes "�����ɗ��񂾂�͂��Ȃ���B";
			mes "��ŋC���ς������A";
			mes "�܂����Ă���B";
			close;
		case 3:
			mes "[�}�v]";
			mes "�c�c�b�𕷂�����������";
			mes "������̂��c�c";
			close;
		}
	case 2:
	case 3:
		mes "[�}�v]";
		mes "�܂��o�����ĂȂ��̂��H";
		mes "�������Ă���!!";
		close;
	case 4:
		mes "[�}�v]";
		mes "�҂��Ă�����!!";
		mes "�ŁA���������̂��H";
		mes "�����A���������Ă���`!!";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���́c�c";
		mes "���ɔG��ă{���{���ɂȂ��������c�c";
		mes "�}�v����̒T���Ă���ؓ��؏��ł����H";
		next;
		mes "[�}�v]";
		mes "�����A���ꂾ�I";
		mes "�������A���ꂶ�Ⴀ�c�c";
		mes "�ǂ߂₵�Ȃ��ȁc�c";
		next;
		mes "[�}�v]";
		mes "�ؓ��؏������ʂ�ɖ߂��Ȃ��ƁA";
		mes "�N�Ɖ��̓w�͂́c�c���ʂɂȂ��ȁB";
		mes "�c�c�N�b�c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�ǂ�����Č��ʂ�ɂ����ł����H";
		mes "�����������āc�c";
		mes "�ǂ߂�悤�ɂ͂Ȃ�Ȃ��ł��傤�B";
		mes "�c�c�����A�����Ȃ񂶂�Ȃ��ł����H";
		next;
		mes "[�}�v]";
		mes "�c�c�c�c";
		mes "������!!";
		next;
		mes "[�}�v]";
		mes "�C�Y���[�h�ɂ���L���Ȕ�����";
		mes "^0000FF�h���A��^000000�̉\��";
		mes "�m���Ă��邩�H";
		mes "�ނ̔����i�̒���";
		mes "�u���@�����@�v���Ă̂�����炵���B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���@�����@�H";
		mes "�������A���ȗ\�������閼�O�ł��ˁc�c";
		next;
		mes "[�}�v]";
		mes "�ڂ����͂킩��Ȃ����ǁA";
		mes "���ɂ͂��̎ؓ��؏������ɖ߂���c�c";
		mes "�Ō�̊�]�̂悤�Ɏv����I";
		next;
		mes "[�}�v]";
		mes "�����܂ł���Ă��ꂽ���A";
		mes "���łɔ����ƃh���A����";
		mes "�ؓ��؏��̕����𗊂�ł݂Ă���B";
		next;
		mes "[�}�v]";
		mes "��́A�����Ƃ��邩��c�c";
		mes "���ށI";
		next;
		if(select("�����Ă�����","�ʓ|������A�f��")==2) {
			mes "[�}�v]";
			mes "������!?";
			mes "�������炢�����Ă���Ă�";
			mes "��������Ȃ����c�c";
			set NAME_3QUE,5;
			close;
		}
		mes "[�}�v]";
		mes "���肪�Ƃ�!!";
		mes "�ł́A�C�Y���[�h�̔�����";
		mes "^0000FF�h���A��^000000�̏��ɍs���āA";
		mes "�ؓ��؏��𕜋������Ă���I";
		set NAME_3QUE,6;
		close;
	case 5:
		mes "[�}�v]";
		mes "�߂��Ă��Ă��ꂽ�񂾂ˁI";
		mes "�����Ɩ߂��ė��Ă�����";
		mes "�M���Ă�����I";
		next;
		if(select("���݂������Ă�����","��͂�ʓ|������A�f��")==2) {
			mes "[�}�v]";
			mes "������!?";
			mes "�������炢�����Ă���Ă�";
			mes "��������Ȃ����c�c";
			close;
		}
		mes "[�}�v]";
		mes "���肪�Ƃ�!!";
		mes "�ł́A�C�Y���[�h�̔����Ƃ�";
		mes "^0000FF�h���A��^000000�̏��ɍs���āA";
		mes "�ؓ��؏��𕜋������Ă���I";
		set NAME_3QUE,6;
		close;
	case 6:
	case 7:
	case 8:
	case 9:
	case 10:
	case 11:
		mes "[�}�v]";
		mes "�܂��o�����Ă��Ȃ��̂��H";
		mes "���������āc�c";
		mes "�ǂ��ɍs���΂����̂��Y�ꂽ���H";
		next;
		mes "[�}�v]";
		mes "�C�Y���[�h�̔�����";
		mes "^0000FF�h���A��^000000�̏��ɍs���āA";
		mes "�ؓ��؏��𕜋������Ă���I";
		close;
	case 12:
		if(countitem(7722) < 1) {
			mes "[�}�v]";
			mes "�ؓ��؏��́c�c�H";
			mes "�ؓ��؏��́A�ǂ��Ȃ����H";
			mes "�����c�c��肪�������̂��H";
			next;
			mes "[�}�v]";
			mes "���肢������c�c";
			mes "�����Ƃ̃h���A���̏��ɍs���āA";
			mes "�ؓ��؏��𕜋������Ă���I";
			close;
		}
		mes "[�}�v]";
		mes "������!!";
		mes "�҂��Ă�����I";
		mes "����ŁA���܂��������̂��H";
		next;
		mes "[�}�v]";
		mes "�ǂ��������񂾁H";
		mes "�����A���������Ă���!!";
		next;
		mes "[�}�v]";
		mes "����!!";
		mes "�{���Ɂc�c�{���ɂ��肪�Ƃ�!!";
		next;
		mes "[�}�v]";
		mes "����́A�炾�I";
		mes "�N�ɂ͖{���ɐ��b�ɂȂ����ˁB";
		next;
		mes "[�}�v]";
		mes "���Ⴀ�A���͂��̎ؓ��؏���������";
		mes "�x���_�̏��ɍs���Ă݂��I";
		mes "����Ȃ�S�ۂ����߂��邾�낤�c�c";
		delitem 7722,1;
		set NAME_3QUE,13;
		getitem 603,1;
		getitem 608,4;
		close;
	default:
		mes "[�}�v]";
		mes "�����A�N!!";
		mes "�N�Ɉ���������Ă�낤�I";
		next;
		mes "[�}�v]";
		mes "�ǂ�Ȏ��������Ă��A";
		mes "�����݂��𗘗p����񂶂�Ȃ��I";
		mes "����́A�����̚����c�c";
		mes "�j�łւ̋ߓ���!!";
		close;
	}
}

alberta.gat,127,143,3	script	�x���_	85,{
	if(NAME_3QUE < 2) {
		mes "[�x���_]";
		mes "�ŋ߂́A�����؂肽���ƌ����z��";
		mes "�]�肢�Ȃ��񂾂�ȁc�c�`�b�I";
		mes "�c�c�A���o�C�g���ق��āA";
		mes "�L���ł��ł��Ȃ��Ⴂ���Ȃ����ȁc�c";
		next;
		mes "[�x���_]";
		mes "�I�b!!";
		mes "��������Ⴂ�`!!";
		mes "�ؓ��̂����k�ł��傤���H";
		mes "���Ȃ�Ƌ��Ă��������I";
		next;
		if(select("�A���o�C�g�ɉ��債�����ł��I","�p�͂Ȃ��ł�")==2) {
			mes "[�x���_]";
			mes "�p�͂Ȃ������āH";
			mes "�Ȃ�A�������Ǝ�����!!";
			mes "�c�c�c�c";
			mes "���ł��T���Ă��������ȁc�c";
			close;
		}
		if(Sex) {
			mes "[�x���_]";
			mes "�ȁc�c���H";
			mes "���q����������đ�ςȂ��̎�����";
			mes "���O�݂����Ȓj���L���Ɏg������A";
			mes "�����邨�q�܂œ������܂����낤�I";
			next;
			mes "[�x���_]";
			mes "�ז����I";
			mes "�������Ǝ�����!!";
			close;
		}
		mes "[�x���_]";
		mes "�ӂށc�c";
		mes "�A���o�C�g�������������āH";
		next;
		mes "[�x���_]";
		mes "�����ƕ����ė~�����񂾂��A";
		mes "���Ȃ��̑f�G�ȏΊ�����āA";
		mes "�F���������؂肽���Ǝv�����ȁH";
		next;
		mes "[�x���_]";
		mes "�ƂɋA���āA";
		mes "���̉���������Ō��Ȃ���A";
		mes "�l�������Ă����I";
		close;
	}
	if(NAME_3QUE < 13) {
		mes "[�x���_]";
		mes "�I�b!!";
		mes "��������Ⴂ�`!!";
		mes "�ؓ��̂����k�ł��傤���H";
		mes "���Ȃ�Ƌ��Ă��������I";
		next;
		menu "�}�v�̎��𕷂�",-;
		mes "[�x���_]";
		mes "�}�v�H";
		mes "�c�c�m��Ȃ��ȁB";
		next;
		mes "[�x���_]";
		mes "�l���Ă݂��B";
		mes "����݂�����A";
		mes "�Ԃ��ĖႢ�����Ɍ��܂��Ă邾��H";
		mes "���̂ɂ����f��H";
		next;
		mes "[�x���_]";
		mes "���́A�ɂ���Ȃ��񂾁I";
		mes "������Ȃ��b������Ȃ�";
		mes "�������Ǝ�����I";
		close;
	}
	mes "[�x���_]";
	mes "�ȁc�c���H";
	mes "�ؓ��؏������������c�c�H";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "����H";
	mes "�}�v�Ȃ�Đl��";
	mes "�m��Ȃ����Č����Ă����̂�";
	mes "�ǂ����ċ����Ă��ł����H";
	next;
	mes "[�x���_]";
	mes "���c�c���邳��!!";
	mes "�����c�c";
	mes "�Ƃɂ����c�c��������������I";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "�c�c�i�����ꂽ�c�c�j";
	next;
	mes "[�x���_]";
	mes "������I";
	mes "���ł���ȖڂŌ���񂾂�I";
	next;
	mes "[�x���_]";
	mes "�ؓ��؏���������Ȃ�āc�c";
	mes "����Ȃɂ�������B�����̂Ɂc�c";
	mes "�ł��A���̕�΂͂����c�c";
	mes "����A���ł��Ȃ��I";
	close;
OnTouch:
	if(NAME_3QUE < 4) {
		mes "[�x���_]";
		mes "���Ȃ璴������I";
		mes "���������S�ۂ�";
		mes "���̏�ł����Ɏ�����݂��܂�!!";
		next;
		mes "[�x���_]";
		mes "���k�́A�����ł����}!!";
		mes "�A���x���^�ōŒ�������ւ�";
		mes "�F����̗F�I";
		mes "�x���_����ҋ��Z�ł�!!";
		close;
	}
	end;
}

cmd_fild01.gat,55,160,0	script	�������y�̉�	844,{
	switch(NAME_3QUE) {
	case 0:
	case 1:
		mes "[" +strcharinfo(0)+ "]";
		mes "���ȓy�̉򂾁c�c";
		mes "�A���Q�[�^�[�B�������B���ׂ�";
		mes "�@�����̂��ȁc�c�H";
		mes "�܂��A�����Ă������B";
		close;
	case 2:
		mes "[" +strcharinfo(0)+ "]";
		mes "���̓y�̉�c�c�s���R������B";
		mes "�����𖄂߂��ՂɈႢ�Ȃ��B";
		next;
		if(select("�y���@���Ă݂�","�C������������~�߂悤")==2) {
			mes "[" +strcharinfo(0)+ "]";
			mes "���������ȗ\��������B";
			mes "�G��Ȃ��������������c�c";
			close;
		}
		mes "[" +strcharinfo(0)+ "]";
		mes "�������Ȃ��c�c";
		mes "�����낤�c�c";
		mes "���������ĕ�΂ł������Ă邩���I";
		next;
		mes "�U�N �U�N";
		next;
		mes "�U�b�U �U�b�U �U�b�U";
		next;
		mes "�U�N �U�N �U�N �U�N";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�������܂��Ă��銴��������I";
		mes "�����ƌ@���Ă݂悤�I";
		next;
		mes "�U�N �U�N";
		next;
		mes "�U�b�U �U�b�U �U�b�U";
		next;
		mes "�U�N �U�N �U�N �U�N";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�����낤�c�c";
		mes "���̌��ȗ\��������c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�q���A�I";
		mes "�ȁA��������ɐG�ꂽ�I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���O���������������̂��ȁc�c";
		mes "�C��������!!";
		set NAME_3QUE,3;
		close;
	case 3:
		mes "�U�N �U�N";
		next;
		mes "�U�b�U �U�b�U �U�b�U";
		next;
		mes "�U�N �U�N �U�N �U�N";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "����́c�c�G�ꂽ���z�H";
		mes "�Ƃ������́c�c";
		mes "���ꂪ�}�v����̎����������z���H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�ؓ��؏��́c�c�ǂ����낤�c�c";
		mes "�܂����c�c�c�c";
		mes "���̃O�Y�O�Y�ɔG�ꂽ�����ؓ��؏��H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���̂܂܂��ᔻ�f�����Ȃ����A";
		mes "�Ƃ肠�����A�}�v����Ɍ����悤�B";
		set NAME_3QUE,4;
		close;
	default:
		mes "[" +strcharinfo(0)+ "]";
		mes "��́A�N��";
		mes "���z�𖄂߂��񂾂낤�c�c";
		close;
	}
}

izlude_in.gat,110,64,3	script	�h���A��	878,2,2,{
	switch(NAME_3QUE) {
	case 0:
	case 1:
	case 2:
	case 3:
	case 4:
	case 5:
		mes "[�h���A��]";
		mes "���ɉ�������ė~�����̂ł����H";
		mes "���̎�Ɋ|����΁A�����̋@�B������";
		mes "�|�p��i�ɂȂ��Ă��܂�!!";
		mes "�����c�c";
		mes "�˔\�Ƃ͍߁c�c";
		close;
	case 6:
		mes "[�h���A��]";
		mes "�����i�ɃA�[�e�B�X�g�̍��𐁂����ށI";
		mes "���I�̃��}���`�b�N�N���G�C�^�[�A";
		mes "�h���A���̍H�[�ɂ悤�����I";
		next;
		mes "[�h���A��]";
		mes "�Ƃ���ŁA���̗p�H";
		next;
		switch(select("���@�����@���g������","�搶�̒�q�ɂȂ肽��","���ł�����܂���")) {
		case 1:
			break;
		case 2:
			if(Sex) {
				mes "[�h���A��]";
				mes "��ϐ\���󂠂�܂��񂪁A";
				mes "���́A�j���q�ɂ͂��܂���I";
				next;
				mes "[�h���A��]";
				mes "���̔������������������o����";
				mes "�r���[�e�B�t���ȏ����Ȃ�";
				mes "�b���Ⴂ�܂����ˁI";
				mes "�n�b�n�b�n�I";
				next;
				mes "[�h���A��]";
				mes "���̂悤�ȓV�˂̒�q�ɂȂ�Ȃ�����";
				mes "�������ދC�����́A�킩��܂��B";
				mes "�܂��A�C�𗎂Ƃ�����!!";
				close;
			}
			mes "[�h���A��]";
			mes "�����I ���h�ł��B";
			mes "�}�h���A�[���I";
			next;
			mes "[�h���A��]";
			mes "�ǂ��ł��H";
			mes "�t���ƒ�q�Ȃǂƌ���";
			mes "�����Ȋ֌W�ł͂Ȃ��A";
			mes "�V�˂ł��鎄�Ƌ���";
			mes "�������l���𑗂��Ă݂܂��񂩁H";
			next;
			mes "[�h���A��]";
			mes "���c�c���́c�c�}�h���A�[���I";
			mes "�Ԏ������Ă�������!!";
			mes "�ǂ��֍s���̂ł����H";
			mes "�}�h���A�[��!!";
			close;
		case 3:
			mes "[�h���A��]";
			mes "�c�c���̗p���Ȃ��̂ł����H";
			mes "���̌|�p�����̎ז������Ȃ���";
			mes "�����o�čs���Ă��������I";
			close;
		}
		mes "[�h���A��]";
		mes "���@�����@�c�cOh�`No!!";
		mes "���̌|�p�i�������������i�Ȗ��O��";
		mes "�ĂԂ͎̂~�߂Ă�������!!";
		next;
		mes "[�h���A��]";
		mes "���Ȃ��������Ă����i�́c�c�����A";
		mes "^0000FF�}�W�J���E�G���K���X�E�q�[�^�[^000000��";
		mes "���ł��ˁc�c";
		next;
		mes "[�h���A��]";
		mes "�Ƃ���Łc�c";
		mes "�}�W�J���E�G���K���X�E�q�[�^�[��";
		mes "���Ɏg���C�ł����H";
		next;
		switch(select("���ɔG�ꂽ�����𕜌������","���̖т���������","�D��S�Łc�c")) {
		case 1:
			break;
		case 2:
			mes "[�h���A��]";
			mes "���̃}�W�J���E�G���K���X�E�q�[�^�[��";
			mes "�����̃h���C���[��������";
			mes "�v���Ă����ł���!?";
			next;
			mes "[�h���A��]";
			mes "�c�c�c�c��]�����I";
			mes "���Ȃ��̂悤�Ȗ��m�Ȑl�ɐ�]�����I";
			mes "�����A��������������܂���B";
			mes "�o�čs���Ă��������I";
			set NAME_3QUE,7;
			pushpc 4,3;
			close;
		case 3:
			mes "[�h���A��]";
			mes "�Ƃ������́A���̌|�p�I�Ȕ����i��";
			mes "���쌴�����m�肽���Ɓc�c�H";
			next;
			mes "[�h���A��]";
			mes "�ł́A���̎������J���ڂ���";
			mes "���A�����Ă����܂��傤�I";
			mes "�V�˂ł��鎄�̐�����������Ȃ��";
			mes "���Ȃ��͉^���ǂ��I";
			next;
			mes "[�h���A��]";
			mes "�}�W�J���E�G���K���X�E�q�[�^�[��";
			mes "���̓V�˂ł��鎄���������i�ŁA";
			mes "���͂̌��ɂȂ郋�r�[�G���W����";
			mes "��]���ɂ���R�A��";
			mes " 3�g�����S�����Ŕ�������";
			mes "�c�c���́c�c����c�c";
			next;
			mes "[�h���A��]";
			mes "�Ȃ񂿂�炩�񂿂��Ȃ񂿂��c�c";
			mes "�Ȃ񂿂�炩�񂿂��Ȃ񂿂��c�c";
			next;
			mes "[�h���A��]";
			mes "�Ȃ񂿂�炩�񂿂��Ȃ񂿂��c�c";
			mes "�Ȃ񂿂�炩�񂿂��Ȃ񂿂��c�c";
			next;
			mes "[�h���A��]";
			mes "�c�c�ł��B";
			mes "�ǂ��ł��H";
			mes "�f���炵�����_���Ǝv���܂��񂩁H";
			mes "�n�[�n�b�n�b�n�I";
			next;
			mes "[" +strcharinfo(0)+ "]";
			mes "�c�c�c�c";
			close;
		}
		mes "[�h���A��]";
		mes "�ӂށc�c";
		mes "���̔������|�p�i���g���قǂ̎��Ƃ́A";
		mes "�v���܂��񂪁c�c�����ł��傤�B";
		mes "�����́A�ǂ��C���Ȃ̂ŁA";
		mes "���ʂɎg�킹�Ă����܂��I";
		mes "���̐��ɔG�ꂽ�����������Ă��������B";
		next;
		mes "[�h���A��]";
		mes "�c�c�c�c";
		mes "���S�ɔG�ꂽ��ɁA";
		mes "�Œ��ꒃ�ɂȂ��Ă��܂��ˁc�c";
		next;
		mes "[�h���A��]";
		mes "����ł́A�{���̓��e�͓ǂ߂܂���B";
		mes "��������ɖ߂��̂́c�c";
		mes "���ʂ́A�����ł��傤�ˁB";
		next;
		mes "[�h���A��]";
		mes "BUT!!";
		mes "���̓V�˔����ƃh���A����";
		mes "�t�@���^�X�e�B�b�N�Ȍ|�p��i�Ȃ�΁A";
		mes "�s�\�Ȃǂ���܂���!!";
		next;
		mes "[�h���A��]";
		mes "���̒��x�Ȃ�A";
		mes "�}�W�J���E�G���K���X�E�q�[�^�[��";
		mes "�ȒP�ɒ����܂���!!";
		next;
		mes "[�h���A��]";
		mes "�܊p�Ȃ̂ŁA�������̔�������i��";
		mes "���쌴�������������܂��傤�B";
		next;
		mes "[�h���A��]";
		mes "�}�W�J���E�G���K���X�E�q�[�^�[��";
		mes "���̓V�˂ł��鎄���������i�ŁA";
		mes "���͂̌��ɂȂ郋�r�[�G���W����";
		mes "��]���ɂ���R�A��";
		mes " 3�g�����S�����Ŕ�������";
		mes "���͂Ȏ���𗘗p���āc�c";
		next;
		mes "[�h���A��]";
		mes "�Ȃ񂿂�炩�񂿂��Ȃ񂿂��c�c";
		mes "�Ȃ񂿂�炩�񂿂��Ȃ񂿂��c�c";
		next;
		mes "[�h���A��]";
		mes "�Ȃ񂿂�炩�񂿂��Ȃ񂿂��c�c";
		mes "�Ȃ񂿂�炩�񂿂��Ȃ񂿂��c�c";
		next;
		if(select("Zzz�c�c","�����A�~�߂āc�c")==2) {
			mes "[�h���A��]";
			mes "���̐������ދ��ł������H";
			mes "����ȁc�c";
			next;
			mes "[�h���A��]";
			mes "�c�c�c�c��]�����I";
			mes "���Ȃ��̂悤�Ȗ��m�Ȑl�ɐ�]�����I";
			mes "�����A��������������܂���B";
			mes "�o�čs���Ă��������I";
			set NAME_3QUE,7;
			pushpc 4,3;
			close;
		}
		mes "[�h���A��]";
		mes "�c�c�����I";
		mes "���肦�Ȃ�!!";
		mes "�������������Ă���̂ɁA";
		mes "����������Ă�����ł����H";
		mes "����ȁc�c";
		next;
		mes "[�h���A��]";
		mes "���ł����āH";
		mes "�����Ɛ����𕷂��Ă����ƁH";
		mes "�ڂ��҂��Ă��������ł����āH";
		mes "�Ȃ�΁A��قǌ�����";
		mes "�}�W�J���E�G���K���X�E�q�[�^�[��";
		mes "�쓮�����Ƃ͉��ł����H";
		next;
		input '@str$;
		if('@str$ != "3�g�����S����") {
			mes "[�h���A��]";
			mes "�n�@�c�c���̐������c�c";
			mes "����Ȃɑދ��Ȃ�ł����H";
			next;
			mes "[�h���A��]";
			mes "���̔�������i�̓��쌴����";
			mes "�m�肽���Ȃ��̂ł����H";
			mes "�|�p�i�̉��l���킩��Ȃ��l��";
			mes "����Ɏg�킹���ɂ͍s���܂���I";
			close;
		}
		mes "[�h���A��]";
		mes "�ӂ��B����́A���炵�܂����B";
		mes "�����ɏW�����Ă��܂���";
		mes "���Y��Ă��܂��āc�c";
		next;
		mes "[�h���A��]";
		mes "���������A���������ʂ�";
		mes " 3�g�����S�����̗͂ŁA";
		mes "��ꂽ���̖{���̎p�𕜌�����̂ł��B";
		next;
		mes "[�h���A��]";
		mes "���ɔG�ꂽ�����������̂ł͂Ȃ��A";
		mes "���r�[�G���W���̃R�A����o��M��";
		mes " 3�g�����S�������N��������";
		mes "�q�[�^�[���ČĂ΂�Ă���̂ł��B";
		next;
		mes "[�h���A��]";
		mes "�������A���肪����܂��B";
		mes "���A�}�W�J���E�G���K���X�E�q�[�^�[��";
		mes "���r�[�G���W�����̏Ⴕ�Ă���̂Łc�c";
		mes "�g���Ȃ��̂ł��c�c";
		next;
		mes "[�h���A��]";
		mes "����Ɂc�c";
		mes "�v�����e���̍����̖��߂�";
		mes "�i�߂Ă���ʌ�������܂��āA";
		mes "�q�[�^�[���C�����鎞�Ԃ������̂ł��B";
		next;
		mes "[�h���A��]";
		mes "�������A�������܂��傤�I";
		mes "���Ȃ����q�[�^�[�̏C����";
		mes "���Ă����Ȃ�A";
		mes "���R�Ɏg���Ă������ł���B";
		next;
		mes "[�h���A��]";
		mes "�悸�́A�����ł��ˁc�c";
		mes "�C���ɕK�v�ȍޗ��������܂��B";
		mes "���ꂩ��A���r�[�G���W����";
		mes "�C���@���������܂��B";
		mes "�����Ɗo���Ă��������ˁB";
		next;
		mes "[�h���A��]";
		mes "�K�v�ȍޗ��́c�c";
		mes "^FF0000�K�т��l�W�� 20�A�S�z�΂� 10�A";
		mes "�|�S�� 5�A���r�[�� 2�A";
		mes "���b�h�W�F���X�g�[���� 5��^000000�ł��B";
		next;
		mes "[�h���A��]";
		mes "�ł́A�ޗ���S��������";
		mes "�����ė��Ă��������B";
		set NAME_3QUE,8;
		close;
	case 7:
		mes "[�h���A��]";
		mes "�܂��A���Ȃ��ł����c�c";
		mes "�����ɗ���͎̂~�߂Ē����܂��񂩁H";
		mes "���Ȃ��ɉ�����ŁA";
		mes "�ƂĂ��s�����ȋC���ɂȂ�܂��B";
		next;
		mes "[�h���A��]";
		mes "�ȁc�c���ł����H";
		mes "�c�c���c�c����ȋ����́c�c";
		mes "�͂��A�͂��c�c�킩��܂�����B";
		mes "���̌|�p�I�Ȕ����i���K�v�Ȃ�ł��ˁH";
		next;
		mes "[�h���A��]";
		mes "�ӂ��c�c�����ł��傤�B";
		mes "���x���������𕷂��Ă���������!!";
		mes "�s�^�ʖڂȑԓx�͋����܂���B";
		mes "�������o������A�b�������Ă��������B";
		set NAME_3QUE,6;
		close;
	case 8:
		mes "[�h���A��]";
		mes "�}�W�J���E�G���K���X�E�q�[�^�[��";
		mes "�C���ޗ��͎����ė��܂������H";
		next;
		if(countitem(7317) < 20 || countitem(1002) < 10 || countitem(999) < 5 || countitem(723) < 2 || countitem(716) < 5) {
			mes "[�h���A��]";
			mes "�ޗ�������܂���ˁB";
			mes "����ł͏C���o���܂���B";
			next;
			mes "[�h���A��]";
			mes "�K�v�ȍޗ��́c�c";
			mes "^FF0000�K�т��l�W�� 20�A�S�z�΂� 10�A";
			mes "�|�S�� 5�A���r�[�� 2�A";
			mes "���b�h�W�F���X�g�[���� 5��^000000�ł��B";
			close;
		}
		mes "[�h���A��]";
		mes "��A��c�c�O�c�c";
		mes "�ꉞ�A�S�������Ă����悤�ł��ˁB";
		delitem 7317,20;
		delitem 1002,10;
		delitem 999,5;
		delitem 723,2;
		delitem 716,5;
		set NAME_3QUE,9;
		next;
		mes "[�h���A��]";
		mes "���āA�ޗ��͑S���p�ӂł��܂������A";
		mes "���ꂩ��C�����@��������܂��傤�B";
		next;
		mes "[�h���A��]";
		mes "�����A���C�t�����Ǝv���܂����A";
		mes "���̌��ɂ���@�B���A";
		mes "�}�W�J���E�G���K���X�E�q�[�^�[�ł��B";
		next;
		mes "[�h���A��]";
		mes "�������ڒ��������Ƃ���ł����A";
		mes "����������̂Łc�c";
		mes "�肪���Ȃ��󋵂Ȃ�ł��B";
		next;
		mes "[�h���A��]";
		mes "������A�����ȒP�ɏC�����@��";
		mes "�������܂�����A";
		mes "�����ʂ�ɂ���Ă݂Ă��������B";
		next;
		mes "[�h���A��]";
		mes "���̍�i�͌|�p�������ł͂Ȃ��A";
		mes "�ϋv���������Ă���̂ŁA";
		mes "�����񂭂炢���s���Ă��A";
		mes "�S�z�����ɂ�蒼���Ă��������B";
		next;
		mes "[�h���A��]";
		mes "���r�[�G���W����";
		mes "�V�������r�[�����āA";
		mes "�l�W�����[�����߂܂��B";
		mes "^0000FF�J�`�b^000000�Ɖ���������A";
		mes "�o���オ��ł��B";
		next;
		mes "[�h���A��]";
		mes "����ȏ���߂�ƃG���W���̃��r�[��";
		mes "����Ă��܂��܂���I";
		next;
		mes "[�h���A��]";
		mes "���r�[�̌���������������A";
		mes "���̓X�C�b�`������悤�ɂȂ�܂��B";
		mes "�X�C�b�`�́A�ԁA�A���A�΂� 4�B";
		mes "�X�C�b�`�����鏇�Ԃ��d�v�ł��B";
		mes "�C��t���Ă��������ˁB";
		next;
		mes "[�h���A��]";
		mes "�G���W���̌W����";
		mes " 1�i�̏ꍇ��^0000FF�Ԃ̃X�C�b�`^000000�A";
		mes " 2�i�̏ꍇ��^0000FF�̃X�C�b�`^000000�A";
		mes " 3�i�̏ꍇ��^0000FF���̃X�C�b�`^000000�A";
		mes " 4�i�̏ꍇ��^0000FF�΂̃X�C�b�`^000000�A";
		mes "�������ƁA�q�[�^�[���쓮���܂��B";
		next;
		mes "[�h���A��]";
		mes "���ӓ_�Ƃ��āA�G���W���W����";
		mes "�����ŕ\������܂���B";
		mes "���ꂼ��̒i�K�ɂ���āA";
		mes "�����ɏo�͉����Ⴂ�܂��B";
		mes "���̏o�͉��̍��Ŕ��f���Ă��������B";
		next;
		mes "[�h���A��]";
		mes "����΂���́c�c";
		mes "�����̂��悤������܂���ˁB";
		mes "���ځA����Ă݂�̂���Ԃł��B";
		next;
		mes "[�h���A��]";
		mes "�G���W���W���ɍ��킹��";
		mes "���m�ɃX�C�b�`���������ꍇ�A";
		mes "�ēx�X�C�b�`�������Ă�";
		mes "�̏Ⴕ����͂��܂���B";
		mes "���S���Ă��������B";
		next;
		mes "[�h���A��]";
		mes "�@�B������ɍ쓮����Ǝv������A";
		mes "�����Ă��������B";
		mes "�Ō�Ɏ����m�F�����܂��B";
		close;
	case 9:
		mes "[�h���A��]";
		mes "�C���̎d�����킩��Ȃ����āH";
		mes "�c�c������x�A";
		mes "���̌|�p�I�Ȑ��������������̂ł����H";
		next;
		if(select("�͂��A���肢���܂�","���\�ł�")==2) {
			mes "[�h���A��]";
			mes "�����ł����H";
			mes "����́A�c�O�ł��ˁB";
			mes "�ł́A�撣���Ă��������ˁI";
			close;
		}
		mes "[�h���A��]";
		mes "���x�͂����ƕ����Ă��������ˁI";
		mes "���͖Z�����ł�����!!";
		next;
		mes "[�h���A��]";
		mes "���r�[�G���W����";
		mes "�V�������r�[�����āA";
		mes "�l�W�����[�����߂܂��B";
		mes "^0000FF�J�`�b^000000�Ɖ���������A";
		mes "�o���オ��ł��B";
		next;
		mes "[�h���A��]";
		mes "����ȏ���߂�ƃG���W���̃��r�[��";
		mes "����Ă��܂��܂���I";
		next;
		mes "[�h���A��]";
		mes "���r�[�̌���������������A";
		mes "���̓X�C�b�`������悤�ɂȂ�܂��B";
		mes "�X�C�b�`�́A�ԁA�A���A�΂� 4�B";
		mes "�X�C�b�`�����鏇�Ԃ��d�v�ł��B";
		mes "�C��t���Ă��������ˁB";
		next;
		mes "[�h���A��]";
		mes "�G���W���̌W����";
		mes " 1�i�̏ꍇ��^0000FF�Ԃ̃X�C�b�`^000000�A";
		mes " 2�i�̏ꍇ��^0000FF�̃X�C�b�`^000000�A";
		mes " 3�i�̏ꍇ��^0000FF���̃X�C�b�`^000000�A";
		mes " 4�i�̏ꍇ��^0000FF�΂̃X�C�b�`^000000�A";
		mes "�������ƁA�q�[�^�[���쓮���܂��B";
		next;
		mes "[�h���A��]";
		mes "���ӓ_�Ƃ��āA�G���W���W����";
		mes "�����ŕ\������܂���B";
		mes "���ꂼ��̒i�K�ɂ���āA";
		mes "�����ɏo�͉����Ⴂ�܂��B";
		mes "���̏o�͉��̍��Ŕ��f���Ă��������B";
		next;
		mes "[�h���A��]";
		mes "����΂���́c�c";
		mes "�����̂��悤������܂���ˁB";
		mes "���ځA����Ă݂�̂���Ԃł��B";
		next;
		mes "[�h���A��]";
		mes "�G���W���W���ɍ��킹��";
		mes "���m�ɃX�C�b�`���������ꍇ�A";
		mes "�ēx�X�C�b�`�������Ă�";
		mes "�̏Ⴕ����͂��܂���B";
		mes "���S���Ă��������B";
		next;
		mes "[�h���A��]";
		mes "�@�B������ɍ쓮����Ǝv������A";
		mes "�����Ă��������B";
		mes "�Ō�Ɏ����m�F�����܂��B";
		close;
	case 10:
		mes "[�h���A��]";
		mes "�ӂށH";
		mes "�C���͎��s�ł����H";
		mes "�܂��A�\�z�ʂ�ł��ˁB";
		next;
		mes "[�h���A��]";
		mes "�܂��A�����܂ŗ������܂���";
		mes "�ޗ��́A�܂�����܂���";
		mes "������x�`�������W���Ă݂Ă��������B";
		set NAME_3QUE,9;
		close;
	case 11:
		mes "[�h���A��]";
		mes "�ق��I";
		mes "�C���ɐ��������ƁH";
		mes "����́A�\�z�O�ƌ������A";
		mes "�A���r���[�o�u���ƌ�����";
		mes "�c�c�����ł���!!";
		next;
		mes "[�h���A��]";
		mes "�ӂށc�c";
		mes "�G���W���̏o�͉�����@�����";
		mes "�m���ɏC���͐������Ă��܂��ˁB";
		mes "���߂łƂ��������܂��I";
		next;
		mes "[�h���A��]";
		mes "����ł́c�c";
		mes "�}�W�J���E�G���K���X�E�q�[�^�[��";
		mes "�������������������āA";
		mes "�X�C�b�`�������Ă��������B";
		mes "�ƂĂ��ȒP�ł�����A";
		mes "�N�ł������܂���B";
		next;
		mes "[�h���A��]";
		mes "���ɂ͂����p������܂����ˁH";
		mes "�F�X����܂������A�y���������ł��B";
		mes "����������������������A";
		mes "���x�͎������肢�ɍs���܂���I";
		set NAME_3QUE,12;
		close;
	default:
		mes "[�h���A��]";
		mes "���v���Ԃ�ł��B";
		mes "�܂��A���̌|�p�I�Ȕ����i��";
		mes "�K�v�ł��炵���̂ł����H";
		mes "����Ƃ��c�c";
		mes "���̎��ɉ�����āH";
		mes "�ӂӂ��I";
		close;
	}
OnTouch:
	if(NAME_3QUE < 8) {
		mes "[�h���A��]";
		mes "�������Ă����ł����I";
		mes "���̌|�p�I�Ȕ����i��";
		mes "����ɐG������A�����܂�����!!";
		close;
	}
	if(NAME_3QUE == 8) {
		mes "[�h���A��]";
		mes "���͌̏Ⴕ�Ă��邩��";
		mes "�쓮���Ȃ����Č������ł��傤�H";
		mes "�����C������ׂ̍ޗ���";
		mes "�W�߂ė��Ă�������!!";
		close;
	}
	end;
}

izlude_in.gat,113,66,0	script	��ȋ@�B	111,{
	switch(NAME_3QUE) {
	case 0:
	case 1:
	case 2:
	case 3:
	case 4:
	case 5:
	case 6:
	case 7:
		mes "[�h���A��]";
		mes "���Ȃ��́c�c�N�ł����H";
		mes "��i�ɏ���ɐG��Ȃ��ł���I";
		close;
	case 8:
		mes "�C���ɕK�v�ȍޗ��𑵂��āA";
		mes "�h���A���̏��֎����Ă������B";
		close;
	case 9:
		mes "���ꂪ�A�h���A�����񂪌����Ă���";
		mes "�}�W�J���E�G���K���X�E�q�[�^�[���c�c";
		mes "�����A���ׂĂ݂邩�B";
		break;	//�C���H����
	case 10:
		mes "�C���Ɏ��s�����悤���B";
		mes "�h���A���ɕ����Ă݂悤�B";
		close;
	case 11:
		mes "[�h���A��]";
		mes "�C���͏I�������ł����H";
		mes "�����{�[�b�Ƃ��Ă����ł��I";
		close;
	case 12:
		if(countitem(7722)) {
			mes "���Ɏؓ��؏��͕��������B";
			mes "�����p���͂Ȃ����낤�B";
			close;
		}
		mes "�X�C�b�`������ƁA";
		mes "�Ⴍ�X��悤�ȋ쓮���Ƌ��ɁA";
		mes "���肪�����B";
		next;
		mes "���肪���Ɠ����ɋ@�B�̐��ʂɂ���";
		mes "���������ЂƂ�łɊJ�����B";
		mes "�����ɐ��ŔG�ꂽ�ؓ��؏�����ꂽ�B";
		next;
		mes "�ؓ��؏��������";
		mes "�@�B�͍X�ɒႭ�X��悤�ȉ��œ����A";
		mes "���΂炭�o�ƍĂѓ��������J�����B";
		next;
		mes "�������������Č���ƁA";
		mes "�����ɂ͐��ɔG�ꂽ�ؓ��؏���";
		mes "���S�ȏ�Ԃŕ�������Ă����I";
		next;
		mes "[ "+strcharinfo(0)+" ]";
		mes "���ꂪ�c�c";
		mes "�}�v���񂪒T���Ă����ؓ��؏���";
		mes "�{���̎p���c�c";
		getitem 7722,1;
		close;
	default:
		mes "[�h���A��]";
		mes "���v���Ԃ�ł��B";
		mes "�܂��A���̌|�p�I�Ȕ����i��";
		mes "�K�v�ł��炵���̂ł����H";
		next;
		mes "[�h���A��]";
		mes "����Ƃ��c�c";
		mes "���̎��ɉ�����āH";
		mes "�ӂӂ��I";
		close;
	}
	set '@screw_max,rand(3,6);
	while(1) {
		next;
		switch(select("�@�B�𒲂ׂ�","���r�[����������","�l�W����߂�","�X�C�b�`������")) {
		case 1:
			mes "���͂��؂�ē����Ȃ��悤���B";
			mes "�܂��́c�c";
			mes "��������΂����񂾂����H";
			break;
		case 2:
			if('@ruby) {
				mes "���Ƀ��r�[�͓���ւ��ς݂��B";
				break;
			}
			mes "���r�[�G���W������";
			mes "�Â����r�[�����o���A";
			mes "�h���A����������";
			mes "�V�������r�[�ɓ���ւ����B";
			set '@ruby,1;
			break;
		case 3:
			if('@ruby == 0) {
				mes "�܂��A���r�[������ւ��Ă��Ȃ��B";
				mes "�悸�̓��r�[�����ւ��悤�B";
				break;
			}
			set '@screw,'@screw+1;
			mes "�L���C �L���C";
			if('@screw < '@screw_max)
				mes "�L���C �L���C";
			else if('@screw == '@screw_max)
				mes "^0000FF�J�`^000000";
			else {
				mes "�L���C �p�L�b�I";
				next;
				mes "���߂������̂��ȁc�c";
				mes "���r�[������Ă��܂����悤���B";
				mes "�h���A���ɕ����Ă݂悤�B";
				set NAME_3QUE,10;
				close;
			}
			break;
		case 4:
			if('@ruby == 0) {
				mes "�܂��A���r�[������ւ��Ă��Ȃ��B";
				mes "�悸�̓��r�[�����ւ��悤�B";
				mes "���ꂩ��l�W����߂Ȃ��Ɓc�c";
				break;
			}
			if('@screw < '@screw_max) {
				mes "�����ƃl�W����߂āA";
				mes "��������Œ肵�Ȃ��Ɖ��Ă��܂��B";
				mes "�悸�A�l�W����߂悤�B";
				break;
			}
			if('@switch&0x0F == 0x0F) {
				mes "�Ⴍ�X��l�ȍ쓮���Ƌ���";
				mes "�q�[�^�[�̓��������������Ă����B";
				mes "�C���͐��������悤���B";
				next;
				mes "�h���A���ɏC�����I���������";
				mes "�񍐂��悤�B";
				set NAME_3QUE,11;
				close;
			}
			set '@sound,rand(1,4);
			switch('@sound) {
			case 1:
				mes "�u���u���u���u��";
				mes "�u���u���u���u��";
				break;
			case 2:
				mes "�h�b�h�b�h�b�h�b";
				mes "�h�b�h�b�h�b�h�b";
				break;
			case 3:
				mes "�K�^�K�^�K�^�K�^";
				mes "�K�^�K�^�K�^�K�^";
				break;
			case 4:
				mes "�K�b�V�����K�b�V����";
				mes "�K�b�V�����K�b�V����";
				break;
			}
			mes "�@�B���h��Ă���̂���������B";
			mes "�ǂ̃X�C�b�`�����悤�B";
			next;
			if(select("�Ԃ̃X�C�b�`","�̃X�C�b�`","���̃X�C�b�`","�΂̃X�C�b�`") != '@sound) {
				mes "�r�[�I �r�[�I �r�[�I";
				mes "�r�[�I �r�[�I �r�[�I";
				next;
				mes "�����ȉ����肾�����B";
				mes "����́c�c�x�񂩂ȁH";
				next;
				mes "�@�B�̗h��͒i�X�ƌ������Ȃ�A";
				mes "�₪�āA���S�Ɏ~�܂��Ă��܂����B";
				next;
				mes "�X�C�b�`���ԈႦ���悤���B";
				mes "���s�c�c���c�c";
				mes "�h���A���ɕ����Ă݂悤�B";
				set NAME_3QUE,10;
				close;
			}
			mes "�W�[�[�[�[";
			mes "�K�^�K�^�K�^�K�^!!";
			next;
			mes "�@�B�̗h�ꂪ�����Ȃ����l���B";
			mes "����́c�c�������ȁH";
			set '@switch,'@switch | (1 << ('@sound-1));
			break;
		}
	}
}

//============================================================
// �j�ł̃_�C�������h�N�G�X�g
//- Registry -------------------------------------------------
// NAME_3QUE -> 14�`
//------------------------------------------------------------
//morocc.gat,106,83,5	script	�C�u���q��	732,{
moc_ruins.gat,152,147,5	script	�C�u���q��	732,{
	if(NAME_3QUE < 14) {
		mes "[�C�u���q��]";
		mes "�N�c�c";
		mes "���ꂽ 4�̕�΂�m���Ă��邩�H";
		next;
		mes "[�C�u���q��]";
		mes "�ŋ߁A���ꂽ 4�̕�΂� 1�A";
		mes "�j�ł̃_�C�������h��";
		mes "���������炵���c�c";
		next;
		mes "[�C�u���q��]";
		mes "�o����΁A��ɓ��ꂽ���񂾂��A";
		mes "�c�c��񂪁c�c����Ȃ��Ăˁc�c";
		mes "�ӂ��c�c";
		close;
	}
	if(BaseLevel < 66) {
		mes "[�C�u���q��]";
		mes "���������āc�c";
		mes "���ꂽ 4�̕�΂�m���Ă��邩�H";
		mes "�ŋ߁A���� 4�̕�΂� 1�ł���";
		mes "�j�ł̃_�C�������h��";
		mes "���������炵���c�c";
		next;
		mes "[�C�u���q��]";
		mes "�o����Ύ�ɓ��ꂽ���񂾂��c�c";
		mes "�Ȃ��Ȃ���񂪎�ɓ���Ȃ���";
		mes "�����Ă�񂾂�ˁc�c";
		close;
	}
}

//============================================================
// Z�c�N�G�X�g
//- Registry -------------------------------------------------
// NAME_4QUE -> 0�`19
//------------------------------------------------------------
prontera.gat,150,326,0	script	��z���m	111,{
	if(NAME_4QUE > 18) {
		mes "[���������ێ��c��]";
		mes "���́A���������z����Ă���";
		mes "�ƍߎ҂͂��Ȃ��B";
		next;
		mes "[���������ێ��c��]";
		mes "�N�� Z�c��߂܂��Ă���A";
		mes "�ƍߎ҂̊������������܂����炵���B";
		mes "�S���A�N�̂��A���I";
		next;
		mes "[���������ێ��c��]";
		mes "���̐��ɁA�Ă� Z�c�̗l��";
		mes "�����A�������ꂽ��c�c";
		mes "���̎��͂܂��A��낵������!!";
		mes "�N�̗l�Ȏ�҂́A���̍��̕�!!";
		mes "�n�n�n�b!!";
		close;
	}
	mes "========= ���J��z =========";
	mes "�v�����e�������̎����ێ��c��";
	mes "���L�̐l���B����z����B";
	mes " ";
	mes "^0000FF���C�E�|���E�V���J���X^000000�B�l�ԁA�j�B";
	mes "^0000FF�}�[�T�E�w���e�B�[��^000000�B�l�ԁA���B";
	mes "^0000FF�L���b�g�|�C^000000�B�����A�L�B";
	next;
	mes "�ʏ́AZ�c�ƌĂ΂�� 3�l�g�B";
	mes "���Ɗ함�̐ޓ��A���\�A�������U����";
	mes "�^��������B";
	next;
	mes "��L�̐l���̑ߕ߁A";
	mes "�������́A���܂ꂽ�����̋֏��A";
	mes "�u�֒f�̐_��p���v�����߂����҂�";
	mes "�J�܂�񑩂���B";
	mes " ";
	mes "- �v�����e�����������ێ��c�� -";
	if(NAME_4QUE == 0)
		set NAME_4QUE,1;
	close;
}

prontera.gat,148,326,3	script	�����ێ��c��	734,{
	switch(NAME_4QUE) {
	case 0:
		if(BaseLevel > 70) {
			mes "[���������ێ��c��]";
			mes "���͗���!!";
			mes "���ׂ̈ɂ��̐g������鎞��!!";
			mes "�N�����̗͂�K�v�Ƃ��鎞�������̂��I";
			next;
			mes "[���������ێ��c��]";
			mes "��z���m���m�F���A";
			mes "���̉������������z���|���̂��I";
			close;
		}
		break;
	case 1:
		if(BaseLevel < 70) {
			mes "[���������ێ��c��]";
			mes "���J��z���m�����ė����̂��H";
			mes "�����̎�҂ɂ��Ă�";
			mes "���グ���S�ӋC���ȁI";
			next;
			mes "[���������ێ��c��]";
			mes "�������A�N�̘r���Ɓc�c";
			mes "�����A�S���Ȃ��c�c";
			next;
			mes "[���������ێ��c��]";
			mes "�N�̎u�͕]�����邪�A";
			mes "���������A�r�𖁂��Ă���";
			mes "�����̗͂ƂȂ��Ă��ꂽ�܂��I";
			close;
		}
		mes "[���������ێ��c��]";
		mes "�v�����e�����������ێ��c�́A";
		mes "���̐l���B����z���Ă���B";
		next;
		mes "[���������ێ��c��]";
		mes "�j 1�l�A�� 1�l�A�����ē��� 1�C��";
		mes "�\�����ꂽ 3�l�g�� Z�c�I";
		next;
		mes "[���������ێ��c��]";
		mes "���C�E�|���E�V���J���X�A�ʏ̃��C�B";
		mes "�}�[�T�E�w���e�B�[���A�ʏ̃}�[�T�B";
		mes "�L���b�g�|�C�A�ʏ̃L���b�g�|�C�B";
		next;
		mes "[���������ێ��c��]";
		mes "�ڍׂ́A���m���m�F���Ă���I";
		mes "�ȏ�I";
		set NAME_4QUE,2;
		close;
	case 2:
		mes "[���������ێ��c��]";
		mes "���ւ̔M���v��������҂�I";
		mes "���p���ˁH";
		next;
		switch(select("���J��z�ɂ���"," Z�c�ɂ���"," Z�c�̍߂͉��ł����H")) {
		case 1:
			mes "[���������ێ��c��]";
			mes "���J��z�̎����H";
			mes "�c�c���J��z������O�܂ŁA";
			mes "���̎����̒�����S�����Ă���";
			mes "^0000FF�o���f�X^000000�ƌ����R�m������B";
			next;
			mes "[���������ێ��c��]";
			mes "�{���ɗL�\�Ȑl���Ȃ񂾂��A";
			mes "�����̐i�����v�킵���Ȃ��ĂˁB";
			next;
			mes "[���������ێ��c��]";
			mes "�������A���J��z�ɂȂ���";
			mes "�S������O����Ă��܂����̂��B";
			mes "�{�l�́A�S������O���ꂽ����";
			mes "�����C�ɂ��Ă��Ăˁc�c";
			next;
			mes "[���������ێ��c��]";
			mes "�������ŁA";
			mes "���ł�����ł���񂶂�Ȃ����ȁc�c";
			next;
			mes "[���������ێ��c��]";
			mes "�ڂ������́A";
			mes "�ނɕ����Ă݂���ǂ����ˁH";
			mes "�ނ��C���]���ɂȂ邩���m��񂵁c�c";
			close;
		case 2:
			mes "[���������ێ��c��]";
			mes " Z�c�ɂ��Ēm�肽���̂��H";
			mes "�����ɂ���񂪂������񂠂��ł�";
			mes "�������c�c";
			mes "�܂��A�m�����͋��͂��悤�B";
			mes "�N�̎����m�肽���̂��ˁH";
			next;
			switch(select("���C","�}�[�T","�L���b�g�|�C","�֒f�̐_��p���H")) {
			case 1:
				mes "[���������ێ��c��]";
				mes "���C�E�|���E�V�[���J���X�B";
				mes "�����̋M���A�V�[���J���X�Ƃ̎O�j���B";
				mes "���͖v�����c�c";
				mes "�M���Ƃ��Ă̖����͐s�����񂾂��c�c";
				next;
				mes "[���������ێ��c��]";
				mes "�������@�w���";
				mes "3����������������ŁA";
				mes "���݂������A Z�c��������ƌ���";
				mes "�񍐂��������B";
				next;
				mes "[���������ێ��c��]";
				mes "�܂��A�}���ق��牤���̋֏��ł���";
				mes "�֒f�̐_��p���𓐂݁A�������񂾁B";
				mes "�����ɍs�����c�c�킩���Ă��Ȃ��B";
				next;
				break;
			case 2:
				mes "[���������ێ��c��]";
				mes "�}�[�T�E�w���e�B�[���B";
				mes "�A���x���^�̃w���e�B�[�����c�̎����B";
				mes "��\�΂̍�����A�Ƒ��Ɖ���؂���";
				mes "��l�ŕ�炵�Ă���炵���c�c";
				next;
				mes "[���������ێ��c��]";
				mes "�w���e�B�[�����c�o�g�ł��邪�ׂɁA";
				mes "�����J��ɍ˔\������A";
				mes "�g�D�̎����J��S���炵���c�c";
				mes "�Ƒ��Ƃ��ẮA�������f���낤�ȁB";
				next;
				break;
			case 3:
				mes "[���������ێ��c��]";
				mes "�L���b�g�|�C�B";
				mes "�l�Ԃł͂Ȃ��A�L�炵���B";
				mes "�y�b�g���Ǝv���Ă������A";
				mes "�������d�˂�ƁA";
				mes "�P�ƂŔƍs���s���Ă��邻�����B";
				next;
				mes "[���������ێ��c��]";
				mes "���̔L�Ɋւ��ẮA";
				mes "��񂪓����ė��Ȃ��̂Łc�c";
				next;
				break;
			case 4:
				mes "[���������ێ��c��]";
				mes "�����}���قŕۊǂ��Ă���";
				mes "��ꋉ�̋֏��ł���A";
				mes "�u�֒f�̐_��p���v��";
				mes "���񂾍߂���ԏd���c�c";
				next;
				mes "[���������ێ��c��]";
				mes "�{�̓��e�ɂ��Ă͂킩��Ȃ����A";
				mes "���l�̎�ɓn��ƁA";
				mes "��ςȎ��ɂȂ�ƕ����Ă���c�c";
				next;
				break;
			}
			mes "[���������ێ��c��]";
			mes "���ꂪ�A�����Ă�����̑S�Ă��B";
			mes "��X�����Ȃ�������ŔY��ł��āA";
			mes "�N�̗l�Ȏ�҂̗͂��؂肽���̂��B";
			mes "�N�̊�������҂���I";
			close;
		case 3:
			mes "[���������ێ��c��]";
			mes "�ӂ��c�c";
			mes "�����̈�Ԃ̔Y�݂�������Ȃ񂾁B";
			mes "�����̂��������ŋN���鎖���A";
			mes "���̗��ɂ͂����炪����c�c";
			next;
			mes "[���������ێ��c��]";
			mes "�Q�t�F���ł͗H�쑛�����N�����āA";
			mes "�l�X���������c�c";
			mes "�t�F�C�����ł͈�˂ɖ���܂��A";
			mes "�H���������c�c";
			next;
			mes "[���������ێ��c��]";
			mes "����̉ʂĂ�";
			mes "���̎����𔃂���߂āA�s��𗐂�";
			mes "�s���Ȏ���ɉ�����ė��v�𓾂���c�c";
			next;
			mes "[���������ێ��c��]";
			mes "���̒��ł���Ԃ̍߂́A";
			mes "��ꋉ�֏��Ɏw�肳�ꂽ�A";
			mes "�u�֒f�̐_��p���v�𓐂񂾎����B";
			mes "�{���ɁA������炩�����A";
			mes "���������Ȃ����}�����I";
			next;
			mes "[���������ێ��c��]";
			mes "�����̎����ێ��ׂ̈ɂ��A";
			mes "�����z���߂܂��Ă���I";
			close;
		}
	case 18:
		mes "[���������ێ��c��]";
		mes "�N�́c�c";
		mes "���̑O�̎�ҁI";
		mes "�����͂ǂ������񂾁H";
		next;
		mes "[���������ێ��c��]";
		mes "�ȁc�c���H";
		mes "����́c�c�{�����H";
		mes "�{���� Z�c�̃A�W�g��˂��~�߁A";
		mes "�z���|���A";
		mes "�֏������߂��Ă����̂��H";
		next;
		mes "[���������ێ��c��]";
		mes "�����I";
		mes "�{���ɂ��肪�Ƃ�!!";
		mes "����͕�����Ȃ��A";
		mes "���܂ꂽ�֒f�̐_��p���ł���!!";
		next;
		mes "[���������ێ��c��]";
		mes "�����É��ɑ���A";
		mes "���̎����N�ɗ���������B";
		mes "�����̌N!!";
		mes "���̎҂ɖJ�܂������ė��Ă���I";
		next;
		mes "[���������ێ���]";
		mes "�͂��I";
		next;
		mes "[���������ێ��c��]";
		mes "�����A������󂯎���Ă���B";
		mes "�N�̍��ւ̔M���v���́A";
		mes "�����Ǝ󂯌p����邾�낤�I";
		next;
		mes "[���������ێ��c��]";
		mes "���ꂩ������ׂ̈�";
		mes "�撣���Ă��ꂽ�܂��I";
		delitem 7724,1;
		set NAME_4QUE,19;
		if(checkre())
			getexp 100000,0;
		else
			getexp 1000000,0;
		close;
	}
	mes "[���������ێ��c��]";
	mes "�����̎����𗐂��S�Ă̎҂�I";
	mes "��X�A�E�҂ȋR�m�c������邪����!!";
	mes "�n�b�n�b�n!!";
	close;
}

prt_in.gat,168,18,1	script	�o���f�X	65,2,2,{
	switch(NAME_4QUE) {
	case 2:
		mes "[�o���f�X]";
		mes "�c�c�N���H";
		mes "�N�����Ɠ������A";
		mes "�l������荇���F�B���K�v�Ȃ̂��H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���́c�c�o���f�X����ł����H";
		mes "���������������������ł����c�c";
		next;
		mes "[�o���f�X]";
		mes "�c�c����m���Ă���H";
		mes "�����āc�c����ȂɗL���������H";
		mes "���������������m��񂯂ǂ�A";
		mes "�������邩�ǂ����c�c�q�b�N�I";
		next;
		switch(select(" Z�c�ɂ��ċ����Ă�������","�F�A�S�z���Ă��܂���","���悤�Ȃ�")) {
		case 1:
			mes "[�o���f�X]";
			mes "���c�c�H";
			mes " Z�c�H";
			mes "�z��̂����Łc�c�����c�c";
			mes "�ǂ�Ȗڂɂ������̂��c�c�q�b�N�I";
			mes "�����c�c���͏I��肾�[�I";
			next;
			mes "[�o���f�X]";
			mes "������B";
			mes "�N�����̎�z���m�����āA";
			mes "�������ǂ����肩�H";
			mes "������A���ɉ�ɗ����񂾂낤�H";
			next;
			mes "[�o���f�X]";
			mes "�c�c�������낤�B";
			mes "�ǂ���ɂ���A";
			mes "���̎肩�痣�ꂽ���������c�c";
			mes "�N���~�����̂͏�񂾂낤�H";
			mes "�q�b�N�I";
			next;
			mes "[�o���f�X]";
			mes "�`�L�V���[�I";
			mes "����؂炵���܂����I";
			mes "�c�c���Ƙb�������Ȃ�c�c�q�b�N�I";
			mes "���������ė����I";
			next;
			mes "[�o���f�X]";
			mes "�������I";
			mes "^0000FF�����N�ʎ���^000000�������c�c�H";
			mes "�����5�{�A�����ė���!!";
			set NAME_4QUE,3;
			close;
		case 2:
			mes "[�o���f�X]";
			mes "�ʂɊ֌W�Ȃ����낤�I";
			mes "�����A���̎��͂ق��Ƃ��Ă���I";
			mes "�������Ə�����[�I";
			close;
		case 3:
			mes "[�o���f�X]";
			mes "�����H";
			mes "���ܔ����Ă�̂���!!";
			mes "�`�L�V���[�I";
			close;
		}
	case 3:
		mes "[�o���f�X]";
		mes "���́A�����Ă������H";
		mes "���������b�͑f�ʂł͏o���Ȃ��B";
		mes "�N�������v�����낤�H";
		mes "�q�b�N�I";
		next;
		if(countitem(12049) < 5) {
			mes "[�o���f�X]";
			mes "�q�b�N�c�c";
			mes "�������������ė���!!";
			mes "�q�b�N�I";
			mes "^0000FF�����N�ʎ���^000000 5�{�����I";
			close;
		}
		delitem 12049,5;
		mes "[�o���f�X]";
		mes "���̍���́c�c";
		mes "�������������Ă����ȁI";
		mes "���āA�b�����悤���I";
		next;
		mes "[�o���f�X]";
		mes "�b�̑O�Ɂc�c";
		mes "�S�N�@�S�N�@�S�N�c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes " 3�{����C���݁c�c!?";
		next;
		mes "[�o���f�X]";
		mes "�ӂ��c�c";
		mes "�P�������ɘb�����B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�ȁc�c�����H";
		mes "�}�ɐ^�ʖڂɁc�c!?";
		next;
		mes "[�o���f�X]";
		mes "������Ȃ����ɋC�������ȁI";
		mes "�ł́A�������ׂ����e�ɂ��āA";
		mes "�������Ă�낤�B";
		next;
		mes "[�o���f�X]";
		mes " Z�c�ɂ��ẮA�m���Ă��邾�낤�H";
		mes " 3�l�g�̔ƍߑg�D�ŁA���܂ł́c�c";
		mes "�h��Ȏ����ɂ͊ւ���ĂȂ������B";
		mes "������A��X�����ʒ��ӂ𕥂��Ă�";
		mes "���Ȃ������񂾁B";
		next;
		mes "[�o���f�X]";
		mes "�������A�ŋ߉����̐F�X�Ȏ�����";
		mes "�z��̊ւ�肪�������āc�c";
		mes "����ȏ㖧���ɑ{����i�߂�̂�";
		mes "����󋵂ɂȂ��Ă����񂾁B";
		next;
		mes "[�o���f�X]";
		mes " Z�c�̓z��A";
		mes "���[�O�M���h�ɑ΂��Ă�";
		mes "������������o�����悤��";
		mes "��������Ö􂵂Ă���炵���B";
		next;
		mes "[�o���f�X]";
		mes "�����������n�߂āA���N���߂������A";
		mes "�z��̐K����͂ގ��͏o���Ȃ������B";
		mes "�z��́A���S�Ɏp���B���₪�����񂾁I";
		mes "�c�c���A�ŁA���͂��̌�����";
		mes "���S�ɊO���ꂽ�񂾁c�c";
		next;
		mes "[�o���f�X]";
		mes "�����m���Ă�����͂��ꂾ�����B";
		mes "�����Ə�񂪗~�����Ȃ�c�c";
		mes "���A�ł��ϋɓI�ɒ��������Ă���";
		mes "���[�O�M���h�̒m�l���Љ�Ă�낤�B";
		next;
		mes "[�o���f�X]";
		mes "���[�O�M���h��";
		mes "�u�}���[�x���v�ƌ�����������B";
		mes "�ޏ��ɘb�|����ƁA";
		mes "�Í��𕷂���邾�낤�B";
		next;
		mes "[�o���f�X]";
		mes "�Í��́c�c";
		mes "^0000FF�閾���͂܂������B^000000���B";
		next;
		mes "[�o���f�X]";
		mes "�����m���Ă�����͑S���b�����I";
		mes "�z����c�c";
		mes "�z���K���߂܂��Ă���I";
		mes "����!!";
		next;
		mes "[�o���f�X]";
		mes "���ꂩ��c�c";
		mes "�}���[�x���ɂ�낵���`���Ă���B";
		mes "���Ⴀ�A���񂾂��I";
		set NAME_4QUE,4;
		close;
	case 4:
		mes "[�o���f�X]";
		mes "���[�O�M���h��";
		mes "�u�}���[�x���v�ƌ���������ɉ�I";
		next;
		mes "[�o���f�X]";
		mes "�Í��́c�c";
		mes "^0000FF�閾���͂܂������B^000000���B";
		close;
	}
	mes "[�o���f�X]";
	mes "�͂��c�c";
	mes "���A�R�m�c�ɖ߂�邩�ȁc�c";
	mes "���̗l�ȗ������ڂ��";
	mes "�c���́A�����Ă���邾�낤���c�c";
	close;
OnTouch:
	if(NAME_4QUE == 2) {
		mes "[�o���f�X]";
		mes "�`�N�V���[�I";
		mes "�q�b�N�c�c�q�b�N�B";
		mes "�������J��z���ꂽ�񂾂���A";
		mes "���̒m����������Ȃ���ȁc�c�q�b�N�B";
		close;
	}
}

in_rogue.gat,359,116,3	script	�}���[�x��	747,{
	switch(NAME_4QUE) {
	case 4:
		mes "[�}���[�x��]";
		mes "���ɉ����p�H";
		next;
		menu "�Í�������",-;
		mes "[�}���[�x��]";
		mes "��������������H";
		mes "�����Ƌ߂��ɗ��Č����Ȃ����B";
		next;
		input '@pass$;
		if('@pass$ != "�閾���͂܂������B") {
			mes "[�}���[�x��]";
			mes "���c�c�H";
			mes "�킩��Ȃ���B";
			next;
			mes "[�}���[�x��]";
			mes "���ɋ���������́H";
			if(Sex) {
				mes "�����������Ȃ�A";
				mes "�����ƃ}�V�ȃR�����g��p�ӂ��ĂˁI";
			}
			else {
				mes "�c�O�����ǁA�����ɋ����͖�����B";
				mes "���߂�Ȃ����ˁB";
			}
			close;
		}
		mes "[�}���[�x��]";
		mes "�c�c�o���f�X�����Ȃ����񂱂����́H";
		mes "�ǂ������񂾂낤�c�c";
		mes "�������l���񂱂��Ȃ�āc�c";
		mes "�ςˁB";
		next;
		mes "[�}���[�x��]";
		mes "���Ȃ݂ɉ��̗p�H";
		mes "�ނ̗��݂Ȃ�A";
		mes "�����͋��͂�����B";
		mes "�b���Ă����Ȃ����B";
		next;
		if(select(" Z�c�̏���������","�o���f�X���񂪂�낵����") == 2) {
			mes "[�}���[�x��]";
			mes "�c�c�����c�c";
			mes "�ǂ������񂾂낤�c�c";
			mes "���̂��c�c�����A�����������́H";
			mes "����Ƃ��A��������́H";
			next;
			mes "[�}���[�x��]";
			mes "���������āA";
			mes "�܂���Z��ŁA�㉹�f���Ă�́c�c�H";
			mes "��́A�N�ׂ̈Ɏ����撣���Ă���̂���";
			mes "�l���ė~������ˁI";
			next;
			mes "[�}���[�x��]";
			mes "�܂��c�c�e�Ɋp�c�c";
			mes "���肪�ƂˁB";
			close;
		}
		mes "[�}���[�x��]";
		mes " Z�c�H";
		mes "�c�c�ŋ߁A����";
		mes "���̐L���ƍߎҒB�̂����ŁA";
		mes "�Z�������Ď��͒m���Ă��ˁH";
		next;
		mes "[�}���[�x��]";
		mes "�o���f�X�����̂���H";
		mes " Z�c�̌��ŁA�����ڂɂ����������Ɂc�c";
		mes "�l���ǂ������I";
		next;
		mes "[�}���[�x��]";
		mes "�܂��A������B";
		mes "���̏���������̂́A";
		mes "�\��Ȃ����ǁc�c";
		next;
		mes "[�}���[�x��]";
		mes "�N�����𕷂��ɒl����r�����邩�A";
		mes "�m�F���Ȃ��ƂˁB";
		mes "�����ł��傤�H";
		next;
		mes "[�}���[�x��]";
		mes "�t�F�C�����ɃA���E�����z�ƌ���";
		mes "�ꂳ�񂪂���񂾂��ǁc�c";
		mes "���Ă͔��������ƌĂ΂ꂽ";
		mes "�`���̃M�����u���[�Ȃ́B";
		mes "���̖ꂳ�񂩂�F�߂�ꂽ��";
		mes "�������Ȃ��̎���F�߂��B";
		next;
		mes "[�}���[�x��]";
		mes "�ꂳ��ɔF�߂ĖႤ���@�H";
		mes "�ܘ_�M�����u����I";
		mes "�ނɏ��Ă΂����́B";
		mes "�ȒP�ł��傤�H";
		next;
		mes "[�}���[�x��]";
		mes "���͎��Œ�����i�߂��B";
		mes "�܋��Ȃ�Ăǂ��ł������́B";
		mes "���ƃ��[�O�M���h�c�c";
		mes "�����āA�o���f�X�̖��_�̖��Ȃ́I";
		set NAME_4QUE,5;
		close;
	case 5:
	case 6:
		mes "[�}���[�x��]";
		mes "�t�F�C�����ɃA���E�����z�ƌ���";
		mes "�ꂳ�񂪂���񂾂��ǁc�c";
		mes "���Ă͔��������ƌĂ΂ꂽ";
		mes "�`���̃M�����u���[�Ȃ́B";
		mes "���̖ꂳ�񂩂�F�߂�ꂽ��";
		mes "�������Ȃ��̎���F�߂��B";
		close;
	case 7:
		mes "[�}���[�x��]";
		mes "�ǂ��H";
		mes "�ꂳ��ɔF�߂Ė�����H";
		next;
		mes "[�}���[�x��]";
		mes "�����c�c�{���ɁH";
		mes "�N���ꂳ����M�����u���Ŕj�����H";
		mes "�c�c�c�c�c�c����ȁc�c�c�c";
		mes "�����I�@���̘r�̈�́c�c";
		next;
		mes "[�}���[�x��]";
		mes "����́c�c";
		mes "�ꂳ�񂪔��������ŌĂ΂�Ă�������";
		mes "�󂾂ˁc�c";
		next;
		mes "[�}���[�x��]";
		mes "�{���ɂ���������񂾁B";
		mes "���̖ꂳ��A�������̂��c�c";
		next;
		mes "[�}���[�x��]";
		mes "�Q������I";
		mes "�N�͐���!!";
		next;
		mes "[�}���[�x��]";
		mes "���̎����𐢊E���ɒm�点�Ȃ��ƁI";
		mes "�`���̃M�����u���[�A�A���E�����z��";
		mes "�j�����l�����ꂽ���Ď����ˁB";
		next;
		mes "[�}���[�x��]";
		mes "������ŗ��Ă����H";
		mes "���̎��A�����������B";
		set NAME_4QUE,8;
		close;
	case 8:
		mes "[�}���[�x��]";
		mes "������ˁB";
		mes "���Ⴀ�A�����m���Ă��� Z�c�̏���";
		mes "�������B";
		next;
		mes "[�}���[�x��]";
		mes "�ǂ�������������悤������c�c";
		mes "�悸�͒m�肽�����𕷂��Ă����H";
		next;
		while(1) {
			switch(select(" Z�c�̖ړI�͉��ł���"," Z�c�̋ߋ���"," Z�c�̖{���n��","�������肪�Ƃ�")) {
			case 1:
				mes "[�}���[�x��]";
				mes "�z��̖ړI�́c�c";
				mes "���m�ɂ͂킩���Ă��Ȃ��񂾂��ǁA";
				mes "��������āA�����Ēu������";
				mes "��ςȎ��ɂȂ�̂́A�ԈႢ�Ȃ���I";
				next;
				mes "[�}���[�x��]";
				mes "�e�Ɋp�A";
				mes "�Ƃ�ł��Ȃ��z��Ȃ̂͊m����B";
				mes "�z��̔ƍs��U�Ԃ��Ă݂�ƁA";
				mes "�����Ȕƍ߂��Č������́A";
				mes "�ƍߍs�ׂ��̂��̂��D���ȋC������c�c";
				next;
				mes "[�}���[�x��]";
				mes "������������c�c";
				mes "�֒f�̐_��p�����g����";
				mes "���E���������ł���̂����c�c";
				next;
				mes "[�}���[�x��]";
				mes "�����A�����I";
				mes "���́A��������ȓz��ׂ̈�";
				mes "���Ԃ𖳑ʂɂ��Ȃ���΂Ȃ�Ȃ��́I";
				next;
				set '@talk,'@talk | 0x01;
				continue;
			case 2:
				mes "[�}���[�x��]";
				mes "�ŋ߁A�F�X�ȑ��ŋN�����Ă���";
				mes "������Ȃ񂩂��A";
				mes "�������̎d�Ƃ����ĉ\��B";
				next;
				mes "[�}���[�x��]";
				mes "�����Ƃ��Ắc�c";
				mes "����i���S���A�L���ȕ�΂ł��鎖��B";
				mes "�_�C�������h�A���r�[�A�G�������h�B";
				next;
				mes "[�}���[�x��]";
				mes "��Ή��ł��n�߂�C�Ȃ̂�����H";
				mes "�c�c�ӂ��c�c";
				mes "�{���ɂ킩��Ȃ��A����c�c";
				next;
				set '@talk,'@talk | 0x02;
				continue;
			case 3:
				mes "[�}���[�x��]";
				mes "�{���n�ˁc�c";
				mes "�킩��΁A�Ƃ����ɉ�����";
				mes "�����̃M���h���ׂ����B";
				next;
				mes "[�}���[�x��]";
				mes "��́A�ǂ��ɂ���̂��c�c";
				mes "��X�̏��Ԃł��A";
				mes "�z��̃A�W�g�͌�����Ȃ������񂾁B";
				mes "�{���ɓ��ɗ���c�c";
				next;
				mes "[�}���[�x��]";
				mes "�ǂ����e���� Z�c�̒���������āA";
				mes "��X�����ꂽ�r�[�A������@�m���A";
				mes "�����Ă��܂��c�c";
				next;
				mes "[�}���[�x��]";
				mes " Z�c�̒��������������΁c�c";
				mes "�������c�c";
				next;
				set '@talk,'@talk | 0x04;
				continue;
			case 4:
				if('@talk < 0x07) {
					mes "[�}���[�x��]";
					mes "���������Ă�������Č����̂�";
					mes "�����Ȃ�����H";
					next;
					continue;
				}
				mes "[�}���[�x��]";
				mes "�������!!";
				mes " Z�c�̓z��A�����N��";
				mes "��������W���Ă���炵���́B";
				next;
				mes "[�}���[�x��]";
				mes "��荇�����A���͂��ꂭ�炢�ˁB";
				mes "�����V������񂪓�������A";
				mes "�܂��������B";
				next;
				mes "[�}���[�x��]";
				mes "���Ⴀ�A�撣���ĂˁI";
				set NAME_4QUE,9;
				close;
			}
		}
	case 9:
	case 10:
		mes "[�}���[�x��]";
		mes "������!!";
		mes " Z�c�̓z��A�����N��";
		mes "��������W���Ă���炵���́B";
		next;
		mes "[�}���[�x��]";
		mes "����ȏ�́A";
		mes "���̂Ƃ����񂪖����̂�B";
		mes "���Ⴀ�A�N�������撣����!!";
		close;
	case 11:
		mes "[�}���[�x��]";
		mes "�悩�����I";
		mes "�T���Ă��̂�!!";
		next;
		mes "[�}���[�x��]";
		mes "�R���h�ɔh�����Ă��������̒������";
		mes " Z�c�̒��������A";
		mes "�肪����ɂȂ肻���ȕ���";
		mes "���肵���炵���̂�B";
		next;
		mes "[�}���[�x��]";
		mes "�������ꂽ�莆�Ȃ񂾂��ǁc�c";
		mes "�J���Ă݂��甒���łˁB";
		mes "�����ӎU�L���Ȃ��H";
		next;
		mes "[�}���[�x��]";
		mes "�����v���ɁA���������B�ɂ���";
		mes "�킩��Ȃ����@�ŕ�������������";
		mes "�Ⴂ�Ȃ���B";
		next;
		mes "[�}���[�x��]";
		mes "����łˁA�Í���ǂ̐��Ƃ�";
		mes "�莆�̒������˗����Ă������̂�B";
		mes "�������ł���H";
		next;
		mes "[�}���[�x��]";
		mes "���낻�댋�ʂ��o�鍠�����c�c";
		mes "�N���s���āA���ʂ��m�F���Ă݂Ȃ��H";
		next;
		mes "[�}���[�x��]";
		mes "�t�F�C�����̃A���E�S�E�ƌ����l�ŁA";
		mes "�Í���ǂ̒B�l��B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�A���E�S�E����H";
		mes "�c�c���O���c�c";
		next;
		mes "[�}���[�x��]";
		mes "�C�������H";
		mes "�A���E�S�E�搶�ƃA���E�����z����́A";
		mes "�Z��Ȃ́B";
		mes "�A���E�����z����̒킳��Ȃ̂�B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�`���̃M�����u���[��";
		mes "�ō��̈Í���ǎҁc�c���Z��c�c�H";
		mes "�s�v�c�ȌZ�킾�Ȃ��c�c";
		next;
		mes "[�}���[�x��]";
		mes "��荇�����A���E�S�E�搶�̏���";
		mes "�s���ė��Ē��ՁB";
		mes "�����ƁA Z�c��߂܂���ׂ�";
		mes "�q���g���������Ă���͂���I";
		set NAME_4QUE,12;
		close;
	case 12:
	case 13:
		mes "[�}���[�x��]";
		mes "�܂��A�o�����ĂȂ��́H";
		mes "�t�F�C�����̃A���E�S�E�搶�̏���";
		mes "�������˗����Ă��镶���̉�ǌ��ʂ�";
		mes "�����Ă���!!";
		close;
	case 14:
		mes "[�}���[�x��]";
		mes "��ǌ��ʂ͕����ė����H";
		mes "��́A���ď����Ă������́H";
		next;
		mes "[�}���[�x��]";
		mes "�c�c�c�c�c�c";
		mes "�c�c�c�c";
		next;
		mes "[�}���[�x��]";
		mes "������c�c�S�R�킩��Ȃ��B";
		mes "���ꂶ�Ⴀ�A�֒f�̐_��p����";
		mes "���������Ă���̂��c�c";
		mes "�킩��Ȃ�����Ȃ��B";
		next;
		mes "[�}���[�x��]";
		mes "������A������񂪓������̂�I";
		mes " Z�c�̃A�W�g�̏ꏊ���A";
		mes "������x�킩�����́I";
		next;
		mes "[�}���[�x��]";
		mes "���̎莆�������Ă����������";
		mes "�����̒�������ǂ����������ǁA";
		mes "�r���Ō������Ă��܂����炵���́B";
		next;
		mes "[�}���[�x��]";
		mes "���m�Ȉʒu�ł͂Ȃ����ǁA";
		mes " Z�c�̒������������������";
		mes "�����N�̓�̒n���ɒʂ���ʘH��";
		mes "����ł̂́A�ƌ����Ă���́B";
		mes "�����ɓz��A�W�g������ɈႢ�Ȃ���I";
		next;
		mes "[�}���[�x��]";
		mes "���Ƃ́A�A�W�g�����P���āA";
		mes "�z���߂܂��鎖���o����΁A";
		mes "���̒����{�����I�����Ď���I";
		set NAME_4QUE,15;
		close;
	case 15:
	case 16:
	case 17:
		mes "[�}���[�x��]";
		mes "���m�Ȉʒu�ł͂Ȃ����ǁA";
		mes " Z�c�̒������������������";
		mes "�����N�̓�̒n���ɒʂ���ʘH��";
		mes "����ł̂́A�ƌ����Ă���́B";
		mes "�����ɓz��A�W�g������ɈႢ�Ȃ���I";
		close;
	case 18:
	case 19:
		mes "[�}���[�x��]";
		mes " Z�c�̓z����Еt�������A";
		mes "��������J�͂���������c�c";
		mes "���A�����C����ˁH";
		next;
		mes "[�}���[�x��]";
		mes "�ʂɔP���ꂽ���肶��Ȃ��́B";
		mes "���͌N��F�߂����A";
		mes "�ꏏ�Ɋ撣���ė������c�c";
		mes "�w�͂Ƃ��̐��ʂ͔F�߂��I";
		next;
		mes "[�}���[�x��]";
		mes "�ł��c�c";
		mes "�o���f�X�́c�c�ނ����A";
		mes "�N�ɕ����Ȃ����炢�A";
		mes "�{���ɔM�S�������̂�B";
		mes "�Ȃ̂Ɂc�c���ꂶ��c�c";
		mes "�ނ����z����c�c";
		next;
		mes "[�}���[�x��]";
		mes "�߂�������";
		mes "���ł������ĈԂ߂ɍs���Ȃ��Ɓc�c";
		mes "���Ⴀ�A����Ŏ��炷���B";
		mes "�܂��ˁI";
		close;
	default:
		if(getbaseclass(Class) == CLASS_TF) {
			mes "[�}���[�x��]";
			mes "�ŋ߁A Z�c�Ƃ����z��̂����ŁA";
			mes "���B���Z�����Ȃ�����B";
			mes "�������̒����ł��������Ă΂��";
			mes "��ςȂ̂�B";
			close;
		}
		mes "[�}���[�x��]";
		mes "��������Ⴂ�B";
		mes "�M���h�̌��w�ɂ��炵���̂�����H";
		close;
	}
}

payon.gat,244,62,3	script	�A���E�����z	897,{
	switch(NAME_4QUE) {
	case 5:
		mes "[�A���E�����z]";
		mes "��H";
		mes "���̘V�l�ɉ��̗p����H";
		next;
		if(select("���Ȃ����`���̔��������c�c�H","���Ȃ��ɒ��킵�܂�") == 1) {
			mes "[�A���E�����z]";
			mes "�����Ă΂��ƏƂ��̂��`";
			mes "�t�H�b�t�H�b�t�H�c�c";
			mes "�m���ɎႢ���A";
			mes "�����Ă΂ꂽ�����������킢�B";
			next;
			mes "[�A���E�����z]";
			mes "���͂�������ĉɂ��Ƃ�";
			mes "�����Ȃ��V�l�ɉ߂��񂯂ǂȁB";
			mes "�t�H�b�t�H�b�t�H�c�c";
			next;
			mes "[�A���E�����z]";
			mes "���N���O�܂ł́A";
			mes "���V�ɒ��킵�ɗ���҂����\���Ă̂��B";
			mes "���������҂����̑�������āA";
			mes "�y�������Ԃ��߂������񂶂Ⴊ�A";
			mes "�ߍ��́A�F�a���łȁc�c";
			next;
			mes "[�A���E�����z]";
			mes "���V�̗B��ȃ��C�o��������";
			mes "�J�`�}�E�N������́A";
			mes "���͂ǂ��ŉ������Ă���񂶂�낤�B";
			mes "������x������̂��c�c";
			close;
		}
		mes "[�A���E�����z]";
		mes "�ق��H";
		mes "���V�ɒ��킾�ƁH";
		mes "���V�𔒂������ƒm���Ă̎����H";
		mes "�v���Ԃ肶��I";
		mes "���N���N����̂��I";
		next;
		mes "[�A���E�����z]";
		mes "���V�ɒ��킷��Ƃ������́A";
		mes "�������A�M�����u������ȁH";
		mes "��`���A�󂯂悤�I";
		next;
		mes "[�A���E�����z]";
		mes "�������A���V���N����c�c";
		mes "�Ⴂ���A�y����ł������G�ȃQ�[����";
		mes "������������āc�c";
		next;
		mes "[�A���E�����z]";
		mes "�c�c�c�c��������!!";
		mes "�P���ȃ��[�����Ⴊ�A����������ɂ�";
		mes "�����ė����̃M�����u��������!!";
		mes "�R�C���̐����ăQ�[���Ƃ�";
		mes "�Ă΂�Ă��邪�c�c";
		next;
		mes "[�A���E�����z]";
		mes "�����ɂ��镡���̃R�C���𗼎�Œ͂�";
		mes "�W�����W�����ƐU��A";
		mes "�Ў�ŃR�C�����M���b�ƒ͂ݎ��B";
		mes "����͒͂ݎ�����R�C���̐���";
		mes "����������𓖂Ă�Q�[������I";
		next;
		mes "[�A���E�����z]";
		mes "�R�C����U��̂́A 1�Q�[��";
		mes "3��܂ŁB";
		mes " 1�Q�[���� 2�񓖂Ă�Ə�������B";
		mes "���ŃR�C����U��A";
		mes "��� 2�Q�[������ŏ������肶��B";
		mes "�킩�������ȁH";
		next;
		mes "[�A���E�����z]";
		mes " 1�Q�[���ɂ��A�N�̓��V��";
		mes "�Q�[���Q����Ƃ��� ^0000FF500Zeny^000000��";
		mes "�����Ă�����B";
		mes "�܂��A�傫�����z�ł��Ȃ����A";
		mes "�N���̏������҂����Ǝv���Ă���B";
		mes "�t�H�b�t�H�b�t�H�I";
		next;
		mes "[�A���E�����z]";
		mes "����ł́A�����̏��������邩�́B";
		mes "�N���������I�������A";
		mes "���V�ɘb���|���Ă���B";
		mes "���N���N����̂��`";
		set NAME_4QUE,6;
		close;
	case 6:
		mes "[�A���E�����z]";
		mes "�����͂������H";
		mes "�ł́A�n�߂邼�I";
		next;
		if(select("����_�炩�ɂ��肢���܂�","�Q�[���̂����������Ă�������") == 2) {
			mes "[�A���E�����z]";
			mes "�����ɂ��镡���̃R�C���𗼎�Œ͂�";
			mes "�W�����W�����ƐU��A";
			mes "�Ў�ŃR�C�����M���b�ƒ͂ݎ��B";
			mes "����͒͂ݎ�����R�C���̐���";
			mes "����������𓖂Ă�Q�[������I";
			next;
			mes "[�A���E�����z]";
			mes "�R�C����U��̂́A 1�Q�[��";
			mes "3��܂ŁB";
			mes " 1�Q�[���� 2�񓖂Ă�Ə�������B";
			mes "���ŃR�C����U��A";
			mes "��� 2�Q�[������ŏ������肶��B";
			mes "�킩�������ȁH";
			next;
			mes "[�A���E�����z]";
			mes " 1�Q�[���ɂ��A�N�̓��V��";
			mes "�Q�[���Q����Ƃ��� ^0000FF500Zeny^000000��";
			mes "�����Ă�����B";
			mes "�܂��A�傫�����z�ł��Ȃ����A";
			mes "�N���̏������҂����Ǝv���Ă���B";
			mes "�t�H�b�t�H�b�t�H�I";
			close;
		}
		if(Zeny < 500) {
			mes "[�A���E�����z]";
			mes "�N�́c�c";
			mes "������ 500Zeny�������Ă����̂��H";
			mes "����ł́A�M�����u���͂��납";
			mes "�����o���Ȃ�����낤�H";
			next;
			mes "[�A���E�����z]";
			mes "�Q�[����� 500Zeny��";
			mes "�����ė���񂶂�I";
			close;
		}
		set Zeny,Zeny-500;
		mes "[�A���E�����z]";
		mes "�����炱��!!";
		mes "�ł́A�n�߂悤���́I";
		mes "�悸�́A���V����s����!!";
		mes "�N�����ĂĂ݂Ȃ����I";
		next;
		mes "�����A����H";
		mes "�������H";
		next;
		set '@win,0;
		set '@lose,0;
		set '@right,0;
		set '@false,0;
		while(1) {
			input '@str$;
			if('@str$ != "�" && '@str$ != "����") {
				mes "[�A���E�����z]";
				mes "�c�c�ԓ��́A";
				mes "��������ɂ��Ă���B";
				mes "���Ⴀ�A��蒼������!!";
				next;
				continue;
			}
			if(rand(2)) {
				set '@right,'@right+1;
				mes "[�A���E�����z]";
				mes "^0000FF" +'@str$+ "^000000����ƁH";
				mes "�����́c�c^0000FF" +'@str$+ "^000000����B";
				mes "�N�̏�������ȁc�c";
				next;
				if('@right < 2) && ('@false < 2) {
					mes "���āA������I";
					next;
					continue;
				}
			}
			else {
				set '@false,'@false+1;
				mes "[�A���E�����z]";
				mes "�����́c�c^0000FF" +('@str$ == "�"? "����": "�")+ "^000000����I";
				mes "�t�H�b�t�H�b�t�H�A���V�̏�������ȁB";
				next;
				if('@right < 2) && ('@false < 2) {
					mes "���āA������I";
					next;
					continue;
				}
			}
			if('@right == 2) {
				mes "[�A���E�����z]";
				mes "�c�c�N�̏�������B";
				mes "���Ⴊ�A�Q�[���͎n�܂����΂��肶��B";
				mes "���̃Q�[���͕����񂼁I";
				set '@win,'@win+1;
				next;
				break;
			}
			else if('@false == 2) {
				mes "[�A���E�����z]";
				mes "�c�O�����A����̓��V�̏�������I";
				mes "���V���܂��܂�";
				mes "�̂Ă����񂶂�Ȃ��̂��B";
				set '@lose,'@lose+1;
				next;
				break;
			}
		}
		mes "[�A���E�����z]";
		mes "���āA 2�Q�[���ڂ���B";
		mes "���x�̓��V���N�̐��𓖂Ă�Ԃ���ȁB";
		next;
		mes "[�A���E�����z]";
		mes "���ꂪ�Ō�̃Q�[���ɂȂ�ʂ悤";
		mes "�撣���Ă���`!!";
		next;
		set '@right,0;
		set '@false,0;
		setarray '@list$,"�","����";
		while(1) {
			mes "�����o������";
			next;
			set '@num,select("�","����") - 1;
			set '@num2,rand(2);
			mes "[�A���E�����z]";
			mes '@list$['@num2]+ "�c�c�I";
			mes "�ǂ�����H";
			next;
			if('@num == '@num2) {
				set '@false,'@false+1;
				mes "[�A���E�����z]";
				mes "�t�H�b�t�H�b�t�H�I";
				mes "���V�̏�������I";
				mes "�N�̏o�����R�C���̐��́c�c";
				mes "^0000FF" +'@list$['@num]+ "^000000����낤�H";
				next;
			}
			else {
				set '@right,'@right+1;
				mes "[�A���E�����z]";
				mes "�c�c�N�̏�������ȁB";
				mes "�N�̏o�����R�C���̐��́c�c";
				mes "^0000FF" +'@list$['@num]+ "^000000����ȁB";
				next;
			}
			if('@right == 2) {
				if('@win) {
					mes "[�A���E�����z]";
					mes "�ӂ��c�c�Q�����I";
					mes "�N�̏�������I";
					mes "�Ⴂ�̂ɐ����̂��B";
					mes "�t�H�b�t�H�b�t�H�I";
				}
				else {
					mes "[�A���E�����z]";
					mes "�N�̏�������I";
					mes "�N���Ȃ��Ȃ����̂��`";
				}
				set '@win,'@win+1;
				next;
				break;
			}
			else if('@false == 2) {
				mes "[�A���E�����z]";
				mes "���V�̏�������I";
				mes "���V�̘r�͌��݂̂悤����̂��B";
				set '@lose,'@lose+1;
				next;
				break;
			}
		}
		if('@win == 2 || '@lose == 2)
			break;
		mes "[�A���E�����z]";
		mes "���݂� 1�Q�[�����������̂��B";
		mes "���̃Q�[���ŏ��������悤��!!";
		next;
		mes "[�A���E�����z]";
		mes "�ł́A�n�߂悤���I";
		mes "���x�̓��V����s����I";
		mes "���ĂĂ݂Ȃ���I";
		next;
		mes "�����I";
		mes "����������I";
		next;
		set '@right,0;
		set '@false,0;
		while(1) {
			input '@str$;
			if('@str$ != "�" && '@str$ != "����") {
				mes "[�A���E�����z]";
				mes "�c�c�ԓ��́A";
				mes "��������ɂ��Ă���B";
				mes "���Ⴀ�A��蒼������!!";
				next;
				continue;
			}
			if(rand(2)) {
				set '@right,'@right+1;
				mes "[�A���E�����z]";
				mes "^0000FF" +'@str$+ "^000000����ƁH";
				mes "�����́c�c^0000FF" +'@str$+ "^000000����B";
				mes "�N�̏�������ȁc�c";
				next;
				if('@right < 2) && ('@false < 2) {
					mes "���āA������I";
					next;
					continue;
				}
			}
			else {
				set '@false,'@false+1;
				mes "[�A���E�����z]";
				mes "�����́c�c^0000FF" +('@str$ == "�"? "����": "�")+ "^000000����I";
				mes "�t�H�b�t�H�b�t�H�A���V�̏�������ȁB";
				next;
				if('@right < 2) && ('@false < 2) {
					mes "���āA������I";
					next;
					continue;
				}
			}
			if('@right == 2) {
				mes "[�A���E�����z]";
				mes "�c�c�N�̏�������B";
				set '@win,'@win+1;
				next;
				break;
			}
			else if('@false == 2) {
				mes "[�A���E�����z]";
				mes "�c�O�����A����̓��V�̏�������I";
				mes "���V���܂��܂�";
				mes "�̂Ă����񂶂�Ȃ��̂��B";
				set '@lose,'@lose+1;
				next;
				break;
			}
		}
		break;
	default:
		mes "[�A���E�����z]";
		mes "�����ɖڂɕ����ԁc�c";
		mes "���̌���I";
		mes "���V���F�߂��^�̃��C�o����";
		mes "�J�`�}�E�N�����񂵂�����񂩂����I";
		next;
		mes "[�A���E�����z]";
		mes "���̐l�Ԃ� 3�{�̓��̎��͂ŁA";
		mes "�Q�[���̎����ǂݎ��A";
		mes "�Q�[�������[�h���Ă����I";
		mes "�����������c�c";
		mes "������x������̂��B";
		close;
	}
	if('@lose == 2) {
		mes "[�A���E�����z]";
		mes "�c�O�����A���V�̏�������I";
		mes "�t�H�b�t�H�b�t�H�I";
		mes "�������c�c";
		mes "�N�̂��A�ŋv���Ԃ�Ɋy�����������I";
		next;
		mes "[�A���E�����z]";
		mes "���̓��A�΂͏����Ă��Ȃ��ƌ�����B";
		mes "�Đ��]�ނȂ�A���ł����邪�����I";
		mes "���V�́A���ł��劽�}����!!";
		close;
	}
	mes "[�A���E�����z]";
	mes "�ӂ��c�c�Q�����I";
	mes "�N�̏�����F�߂悤�I";
	mes "���̔��������Ƃ����̍���";
	mes "���V���N�ɑ��������I";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "�Ȃ�΁c�c";
	mes "���̏�����";
	mes "���������̏̍����󂯌p��������";
	mes "�ؖ�����ؖ����������Ă��������B";
	next;
	mes "[�A���E�����z]";
	mes "�ؖ����H";
	mes "�t�H�b�t�H�b�t�H�I";
	mes "�N�̓��V�ɏ���������";
	mes "�����������݂�������̂��`";
	next;
	mes "[�A���E�����z]";
	mes "�N���������͎̂����B";
	mes "�ؖ������炢�͏����Ă�낤���́B";
	next;
	mes "�T�T�T";
	next;
	mes "�T�T�T�T�T";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "���c�c����́c�c�H";
	mes "���̎��ɉ����������̂ł����H";
	next;
	mes "[�A���E�����z]";
	mes "����́A���������̏ے��B";
	mes "���V�̏������B";
	mes "�����������΁A�F�킩�邾�낤�B";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "�c�c�����ł����B";
	mes "���肪�Ƃ��������܂��B";
	mes "�ł́A����Ŏ��炵�܂��B";
	next;
	mes "[�A���E�����z]";
	mes "�t�H�b�t�H�b�t�H�I";
	mes "���A�Ŋy����������B";
	mes "����΂��A���ڂ�I";
	set NAME_4QUE,7;
	close;
}

//morocc.gat,223,265,3	script	�������j#name1	99,2,2,{
moc_ruins.gat,90,67,3	script	�������j#name1	99,2,2,{
	switch(NAME_4QUE) {
	case 9:
		if('lock) {
			mes "[�������j]";
			mes "�c�c�c�c";
			next;
			mes "[" +strcharinfo(0)+ "]";
			mes "����ς�A�������c�c";
			mes "�l�����Ȃ����ɗ��āA���ׂĂ݂悤�B";
			close;
		}
		break;
	case 10:
		if('lock) {
			mes "[" +strcharinfo(0)+ "]";
			mes "�c�c�l������c�c";
			mes "�ʖڂ��c�c";
			next;
			mes "[" +strcharinfo(0)+ "]";
			mes "����������Ƒ҂��āA";
			mes "�l�����Ȃ��Ȃ����璲�ׂ悤�B";
			close;
		}
		set 'lock,1;
		initnpctimer;
		mes "[????]";
		mes "�q�B�I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�߂܂����I";
		mes "�����A�f���ĖႨ���I";
		mes "�N�́c�c Z�c�̃X�p�C���낤�H";
		next;
		mes "[????]";
		mes "���c�c�m���I";
		mes " Z�c�c Z�c�H";
		mes "��������́H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���������H";
		mes "���Ⴀ�A����͉����ȁH";
		mes "���̎莆�́A�N�����Ƃ����񂾂�H";
		next;
		mes "[????]";
		mes "�����I";
		mes "���c�c����́c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "����ł��A����؂���肩�H";
		mes "�v�����e���R�m�c�����[�O�M���h��";
		mes "�˂��o�������ȁB";
		mes "�ǂ�Ȗڂɂ������y���݂��ˁc�c";
		next;
		mes "[Z�c�X�p�C]";
		mes "���A���ꂾ���͊��ق��Ă��������I";
		mes "�Ƃɂ͎q���B�ƔN�V�����ꂪ�c�c";
		mes "�E�E�b�c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�M�p�ł��Ȃ��ȁc�c";
		mes "���̎���ɂ����Ɠ�������A";
		mes "�v�����e���R�m�c�����[�O�M���h��";
		mes "�˂��o���̂͊��ق��Ă������B";
		next;
		mes "[Z�c�X�p�C]";
		mes "��A�킩��܂���!!";
		mes "���͂����̘A�����󂯂邾���Łc�c";
		mes "���ꂾ���Ȃ�ł��I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�Ӂ[��c�c";
		mes "�܂��A�����Ȃ�����d���Ȃ���ȁB";
		mes "�ꏏ�Ƀv�����e���֍s�������H";
		mes "�N�ɉ�������Ă���l�X��";
		mes "�������񂢂�͂�����!!";
		next;
		mes "[Z�c�X�p�C]";
		mes "���A���ꂾ����!!";
		mes "��A�킩��܂����c�c";
		mes "�m���Ă��鎖��\���グ�܂��B";
		next;
		mes "[Z�c�X�p�C]";
		mes "�����m���Ă��鎖�́c�c";
		mes "�A�W�g�́A";
		mes "�����N�암�̂ǂ����ɂ�����Ď��ƁA";
		mes "����ɂ͈Í����K�v�����Ď������ł��I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�{�����ȁH";
		mes "�܂��A�������낤�B";
		mes "��������Ȏ�����͑���􂢂ȁB";
		next;
		mes "[Z�c�X�p�C]";
		mes "�͂��I";
		mes "�킩��܂���!!";
		mes "���肪�Ƃ��������܂��`";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�悸�̓}���[�x���̏��ɖ߂��āA";
		mes "�V������񂪂��邩�m�F���悤�B";
		set NAME_4QUE,11;
		set 'lock,0;
		stopnpctimer;
		close;
	case 11:
	case 12:
	case 13:
	case 14:
		mes "[Z�c�X�p�C]";
		mes "�������Ă��܂����I";
		mes "�����ɗ����Ă��邾���ł��B";
		close;
	case 15:
	case 16:
	case 17:
	case 18:
	case 19:
		mes "[��Z�c�X�p�C]";
		mes "����Ȏ�����͑������āA";
		mes "���ꂩ��͐^�ʖڂɕ�炵��";
		mes "�s�������Ǝv���܂��I";
		close;
	default:
		mes "[�������j]";
		mes "������I";
		mes "�C�����b�������Ȃ��ł���I";
		close;
	}
OnTouch:
	if(NAME_4QUE != 9 || 'lock)
		end;
	set 'lock,1;
	initnpctimer;
	mes "[????]";
	mes "��X��ǂ��Ƃ͋����ȁc�c";
	mes "��炦�[��!!";
	misceffect 18;
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "���c�c�N���I";
	mes "�����ȒP�ɂ���Ă��܂邩�I";
	next;
	mes "[????]";
	mes "���s���c�c�H";
	mes "�`�N�V���[�I";
	mes "�o���Ă��₪��I";
	hideoffnpc "�������j#name" +(substr(strnpcinfo(2),-1,1) == "1"? "2": "1");
	hideonnpc;
	set 'lock,0;
	stopnpctimer;
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "����c�c�H";
	mes "����͉����낤�H";
	mes "�������̓z�����Ƃ����̂��ȁH";
	mes "����́c�c�莆�H";
	next;
	mes "- ��X��ǂ��Ă��鐶�ӋC�� -";
	mes "- " +strcharinfo(0)+ "�� -";
	mes "- �n�����Ȃ����I -";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "�����c�c Z�c�̃X�p�C�������̂��I";
	mes "�܂��A�����ɂ͍s���Ă��Ȃ��͂����I";
	mes "�߂܂��Ē��ׂȂ���!!";
	set NAME_4QUE,10;
	close;
OnTimer30000:
	set 'lock,0;
	stopnpctimer;
	end;
}
//morocc.gat,225,104,3	duplicate(�������j#name1)	�������j#name2	99,2,2
moc_ruins.gat,75,171,3	duplicate(�������j#name1)	�������j#name2	99,2,2

payon.gat,192,176,3	script	�A���E�S�E	903,{
	switch(NAME_4QUE) {
	case 12:
		mes "[�A���E�S�E]";
		mes "�N���H";
		mes "���o���̖����炾�ȁc�c";
		mes "�����p�ł��H";
		next;
		menu "���[�O�M���h�ŗ��񂾈Í������̉��",-;
		mes "[�A���E�S�E]";
		mes "�����A�}���[�x�����񂱂����̂��B";
		mes "��̕����̉�ǂ̌����ȁc�c�H";
		next;
		mes "[�A���E�S�E]";
		mes "���A���̕�������ǂ��悤��";
		mes "���Ă����Ƃ��낾�����̂��c�c";
		mes "���傤�ǂ悩�����B";
		mes "�N�A��������Ă���B";
		next;
		mes "[�A���E�S�E]";
		mes "���ꂪ�}���[�x�������ɉ�ǂ𗊂�";
		mes "�Í��������B";
		mes "���������Ă��Ȃ������Ɍ����邾�낤�H";
		mes "�����A���������Ă���B";
		emotion 1,"";
		next;
		mes "[�A���E�S�E]";
		mes "�����ɓK�x�ȔM��^����ƁA";
		mes "���e��������ł���񂾁B";
		mes "�������낤�H";
		mes "�ۈ����̍����Í������̍쐬���@���c�c";
		emotion 23,"";
		next;
		mes "[�A���E�S�E]";
		mes "�Í������̓��e����ǂ���ɂ́A";
		mes "�����ƓK�x�ȔM��^���Ă����Ȃ���";
		mes "���͂������Ă��܂��ĂˁB";
		next;
		mes "[�A���E�S�E]";
		mes "���ׂ̈Ɋ���ޗ����K�v�Ȃ񂾂��A";
		mes "�ޗ���؂炵�Ă��܂��āc�c";
		mes "�d�����i�܂Ȃ��񂾁B";
		next;
		mes "[�A���E�S�E]";
		mes "�������A�ޗ����W�߂Ă��Ă���Ȃ����H";
		mes "^0000FF�Ύ� 20�A�A���R�[�� 2�A";
		mes "�}�b�` 1�A�R���Ă���S��";
		mes "10��^000000���B";
		next;
		mes "[�A���E�S�E]";
		mes "�ޗ���S�������ė��Ă��ꂽ��A";
		mes "��ǂ�i�߂悤�B";
		set NAME_4QUE,13;
		close;
	case 13:
		mes "[�A���E�S�E]";
		mes "�ǂ����H";
		mes "�ޗ��͑��������H";
		next;
		if(countitem(7098) < 20 || countitem(970) < 2 || countitem(7035) < 1 || countitem(7097) < 10) {
			mes "[�A���E�S�E]";
			mes "�ޗ��́A�܂��Ȃ̂��H";
			mes "�����c�c�����C�ɂȂ�񂾁I";
			mes "���̈Í������ɂ́A";
			mes "�ǂ�ȓ��e��������Ă���̂�!!";
			mes "�����ޗ��������ė��Ă���I";
			next;
			mes "[�A���E�S�E]";
			mes "^0000FF�Ύ� 20�A�A���R�[�� 2�A";
			mes "�}�b�` 1�A�R���Ă���S��";
			mes "10��^000000���B";
			close;
		}
		delitem 7098,20;
		delitem 970,2;
		delitem 7035,1;
		delitem 7097,10;
		mes "[�A���E�S�E]";
		mes "�ӂށc�c";
		mes "�S���������悤���ˁI";
		mes "�ł́A��ǂ����݂邩�B";
		next;
		mes "[�A���E�S�E]";
		mes "�����I�@�����邼�I";
		mes "����́c�c�I";
		mes "���̑嗤����������Ñ�̌���ł���";
		mes "�C�P�i�C��ɈႢ�Ȃ��I";
		emotion 5;
		next;
		mes "[�A���E�S�E]";
		mes "�\�N���O�ɁA";
		mes "�v�����e���̉��{�}���قɂ���";
		mes "�u�֒f�̐_��p���v�Ō����o��������B";
		next;
		mes "[�A���E�S�E]";
		mes "�́X�A���̑嗤�ɏZ��ł���";
		mes "���Z�������̓`���𕷂�����������c�c";
		next;
		mes "[�A���E�S�E]";
		mes "���Z�������̖����Ɍ��ꂽ�C�P�i�C���";
		mes "��҂̊Ԃŋ}���ɍL����A";
		mes "���̌���ɂ܂ŐZ�����A";
		mes "����̎d�g�݂�����A";
		mes "�ނ�̕����͖ł�ł��܂����̂��I";
		next;
		mes "[�A���E�S�E]";
		mes "���̔ߌ����J��Ԃ��ʂ悤�A";
		mes "�C�P�i�C��𕕈󂵁A";
		mes "���Ƃ��Ǘ����Ă����̂��B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���́c�c";
		mes "�����͂ǂ��ł���������A";
		mes "���������̓��e�������Ă��������B";
		next;
		mes "[�A���E�S�E]";
		mes "���������Ȑl���ȁc�c";
		mes "�ӂނӂށc�c���������Ă���ȁB";
		mes "����͓ǂݐh���c�c";
		next;
		mes "[�A���E�S�E]";
		mes "^0000FF���_�g�b�[�L�J�^���R�z������";
		mes "�n���c�����X���}���W�m������";
		mes "�]���Z���A�j���C�^�C^000000";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "����͈�́c�c�H";
		mes "���������Ă�̂������ς�ł��B";
		next;
		mes "[�A���E�S�E]";
		mes "�ꐶ���Í���ǂɕ����Ă�������";
		mes "����ɂ́A����グ���ȁc�c";
		next;
		mes "[�A���E�S�E]";
		mes "�ł́A��ǂ������e�͓`�������I";
		mes "����Ŏ��̎d���͏I��肾�I";
		mes "���̌����͎�������!!";
		mes "��������ɂ͂����������c�c";
		next;
		mes "[�A���E�S�E]";
		mes "�Y��Ȃ��悤�ɁA���� 1�񋳂��悤�B";
		mes "�����ƃ}���[�x���ɓ`���Ă���I";
		next;
		mes "[�A���E�S�E]";
		mes "^0000FF���_�g�b�[�L�J�^���R�z������";
		mes "�n���c�����X���}���W�m������";
		mes "�]���Z���A�j���C�^�C^000000";
		set NAME_4QUE,14;
		close;
	case 14:
		mes "[�A���E�S�E]";
		mes "�Y��Ȃ��悤�ɁA���� 1�񋳂��悤�B";
		mes "�����ƃ}���[�x���ɓ`���Ă���I";
		next;
		mes "[�A���E�S�E]";
		mes "^0000FF���_�g�b�[�L�J�^���R�z������";
		mes "�n���c�����X���}���W�m������";
		mes "�]���Z���A�j���C�^�C^000000";
		close;
	default:
		mes "[�A���E�S�E]";
		mes "�Í��Ƃ́A�|�p�i�Ȃ̂��B";
		mes "�^���𕢂��Í��Ƃ������̕�c�c";
		next;
		mes "[�A���E�S�E]";
		mes "���͂��̕���ꖇ�������Ȃ���A";
		mes "���������炩�ɂȂ�閧��ڂɂ���B";
		mes "���̎��̉��������A�i�ʂ��I";
		close;
	}
}

//moc_fild09.gat,68,298,0	script	�s�v�c�Ȕ��	111,4,4,{
moc_fild17.gat,209,235,0	script	�s�v�c�Ȕ��	111,4,4,{
	if(NAME_4QUE < 15) {
		mes "[" +strcharinfo(0)+ "]";
		mes "����H";
		mes "���̔�΂͉����낤�H";
		mes "��΂���Ȃ��ċ@�B�c�c���ȁH";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�����ςȉ�������C�����邯�ǁc�c";
		mes "���`��A�����낤�c�c";
		close;
	}
	if(NAME_4QUE > 17) {
		mes "[" +strcharinfo(0)+ "]";
		mes " Z�c�̖{���n�c�c";
		mes "���������������ȁ`";
		mes "���́A�����̋�̓��A�����ǁc�c";
		close;
	}
	if(getvariableofnpc('lock,"#zdan_broad")) {
		mes "[�s�v�c�Ȕ��]";
		mes "�L���L���L���C�b";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "����H";
		mes "��΂���ςȉ����c�c";
		mes "�c�c�����������肻�����ȁB";
		next;
		mes "[�s�v�c�Ȕ��]";
		mes "�L���L���L���C�b";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���͂��邯�ǁc�c";
		mes "�����ڂ͕��ʂ̔�΂̂悤�Ɍ�����ȁB";
		mes "���������āc�c";
		mes "���ꂪ Z�c�̃A�W�g�ւ�";
		mes "������������肵�āc�c";
		close;
	}
	mes "[�s�v�c�Ȕ��]";
	mes "�L���L���L���C�b";
	mes "���Z�N�����E���j���E�S���A";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "��΂������Ă�!!";
	mes "�ł��A���Č����Ă�̂��c�c";
	emotion 23,"";
	next;
	mes "[�s�v�c�Ȕ��]";
	mes "�L���L���L���C�b";
	mes "���Z�N�����E���j���E�S���A";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "�c�c���̕ςȌ��t�c�c";
	mes "�����o�������邼!!";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "�������I";
	mes "�A���E�S�E�搶����ǂ��Ă��ꂽ";
	mes "�C�P�i�C�ꂾ!!";
	mes "�c�c�ł��c�c";
	mes "����ς�A�悭�킩��Ȃ��ȁc�c";
	emotion 5,"";
	next;
	setarray '@pass$,"���_�g�b�[�L�J�^���R�z������","�n���c�����X���}���W�m������","�]���Z���A�j���C�^�C";
	for(set '@i,0; '@i < 3; set '@i,'@i+1) {
		mes "[�s�v�c�Ȕ��]";
		mes "�L���L���L���C�b";
		mes "�N�����E���j���E�S���A�m�����o" +('@i == 0? "�`�C": '@i == 1? "�j": "���T");
		next;
		mes "[" +strcharinfo(0)+ "]";
		if('@i == 0) {
			mes "������������";
			mes "�����Ă���悤�Ȃ񂾂��ǁc�c";
			mes "���������΂����񂾁c�c�H";
		}
		else {
			mes "�ӂށH";
			mes "�����Ă鎖�������Ⴄ�ȁB";
			mes "���x�͉��������΂����񂾁c�c�H";
		}
		next;
		input '@str$;
		if('@str$ != '@pass$['@i]) {
			mes "[�s�v�c�Ȕ��]";
			mes "�q���[�[��";
			next;
			mes "[" +strcharinfo(0)+ "]";
			mes "����c�c�H";
			mes "��΂����񂾁c�c�H";
			mes "��������Ȃ����c�c";
			mes "���̉������Ȃ����c�c";
			mes "�c�c�ǂ����悤�B";
			close;
		}
	}
	mes "[�s�v�c�Ȕ��]";
	mes "�L���L���L���C�b";
	mes "�L���L���L���C�b";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "�����c�c�H";
	mes "���������o�����悤�ȋC��";
	mes "����񂾂��ǁc�c";
	next;
	if(getvariableofnpc('lock,"#zdan_broad")) {
		mes "[" +strcharinfo(0)+ "]";
		mes "����c�c�H";
		mes "�쓮���邩�Ǝv���΁c�c";
		mes "�~�܂��Ă��܂����c�c";
		next;
		mes "[�s�v�c�Ȕ��]";
		mes "���Z�}�L�f�E���V�n�}�C";
		mes "�X�}�V�C�K�l�I�E���V�f�g�A�N���o�V";
		next;
		mes "�q���[�[��";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�悭�킩��Ȃ����ǁA";
		mes "��ł���Ă݂悤���ȁc�c";
		close;
	}
	set getvariableofnpc('lock,"#zdan_broad"),1;
	mes "�E�B�C�[�C�[�[��";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "���킟!!";
	mes "������!!!!";
	mes "���ɂ����Ȃ���[!!";
	mes "����ȕ��ɋz�����܂�Ď��ʂȂ��";
	mes "�����[!!";
	set NAME_4QUE,16;
	close2;
	warp "z_agit.gat",98,40;
	donpcevent "#zdan_broad::OnStart";
	end;
OnTouch:
	if(NAME_4QUE == 15) {
		mes "�L���L���L���C�b";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "��c�c�H";
		mes "���������Ȃ������H";
		close;
	}
}

z_agit.gat,0,0,0	script	#zdan_broad	-1,{
OnStart:
	initnpctimer;
	hideonnpc "���C#name";
	hideonnpc "�}�[�T#name";
	hideonnpc "�L���b�g�|�C#name";
	killmonster "z_agit.gat","All";
	end;
OnTimer3000:
	announce "�L���b�g�|�C : �������������j�����I�@�N���҂���Ȃ����j�����H",9;
	end;
OnTimer5000:
	announce "���C : �}�[�T�H�@�������ė����̂��āA�}�[�T�����H",9;
	end;
OnTimer7000:
	announce "�}�[�T : ���C�c�c�����v�H�@���͂����Ƒ��ɂ������I�@�����B��Ȃ����I",9;
	end;
OnTimer9000:
	announce "���C : �}�W�H�@��������c�c�N���҂�!!�@�L���b�g�|�C!!�@�N����������J���������ɂ��Ă��́H",9;
	end;
OnTimer11000:
	announce "�L���b�g�|�C : ����Ȃ͂��Ȃ��j����!!",9;
	end;
OnTimer13000:
	announce "�}�[�T : ��l�Ƃ����邳��!!�@�N�����킩��Ȃ����ǁA Z�c�̃A�W�g�ɐN������Ȃ�āA�����x�����ˁI",9;
	end;
OnTimer15000:
	announce "���C : �L���b�g�|�C!!�@�������������o�������Ă���!!�@�ً}���Ԃ�!!",9;
	end;
OnTimer18000:
	announce "�L���b�g�|�C : �܂��������I����ăj���C�񂾂��ǁc�c�B�c�c�d���Ȃ��j�����I�@�o�����j����!!",9;
	end;
OnTimer21000:
	set 'mob,3;
	monster "z_agit.gat",97,78,"�L���b�g�|�C�̌x����",1479,1,"#zdan_broad::OnKilled";
	monster "z_agit.gat",98,79,"�L���b�g�|�C�̌x����",1479,1,"#zdan_broad::OnKilled";
	monster "z_agit.gat",96,81,"�L���b�g�|�C�̌x����",1523,1,"#zdan_broad::OnKilled";
	end;
OnTimer350000:
	//mapwarp "z_agit.gat","moc_fild09.gat",68,298;
	mapwarp "z_agit.gat","moc_fild17.gat",209,235;
	hideonnpc "���C#name";
	hideonnpc "�}�[�T#name";
	hideonnpc "�L���b�g�|�C#name";
	killmonster "z_agit.gat","All";
	stopnpctimer;
	set 'mob,0;
	set 'lock,0;
	end;
OnKilled:
	set 'mob,'mob-1;
	if('mob)
		end;
	mes "[" +strcharinfo(0)+ "]";
	mes "�ڋ��� Z�c��!!";
	mes "�����o�ė����I";
	mes "���O��̎艺�́A�S���|������!!";
	next;
	mes "[�}�[�T]";
	mes "�ǂ����悤�c�c";
	next;
	mes "[�L���b�g�|�C]";
	mes "�܂����j�����I";
	mes "��ς��j�����I";
	next;
	mes "[���C]";
	mes " Z�c�����̂܂܏I���Ǝv���Ȃ�I";
	mes "�o�ė���!!�@�䂪���B��!!";
	mes "�|�`���ƂȁI";
	next;
	mes "[�L���b�g�|�C]";
	mes "����͈Ⴄ�{�^���j����!!";
	mes "�������������c�c�j���[�I�c�c";
	mes "�����A�l�͒m��Ȃ��j����!!";
	next;
	mes "[���C]";
	mes "����c�c�H";
	mes "����͈�́c�c�H";
	set NAME_4QUE,17;
	hideoffnpc "���C#name";
	hideoffnpc "�}�[�T#name";
	hideoffnpc "�L���b�g�|�C#name";
	close;
}

z_agit.gat,97,101,3	script	���C#name	931,{
	if(NAME_4QUE != 17)
		end;
	mes "[�}�[�T]";
	mes "�L���b!!";
	mes "���c�c�ǂ������́H";
	mes "���C�H";
	next;
	mes "[���C]";
	mes "����c�c�ȁc�c���ł��H";
	mes "���́A�n�C�f�B���O���������H";
	next;
	mes "[�L���b�g�|�C]";
	mes "����́c�c";
	mes "���C���n�C�f�B���O�{�^����";
	mes " 2�x��������������炾�j�����c�c";
	next;
	mes "[�}�[�T]";
	mes "�����c�c�o�J�I";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes " Z�c�̊F�l�B";
	mes "�y����������͂����܂ŁB";
	mes "���`�̓V�����󂯂邨���Ԃł���I";
	next;
	mes "[���C]";
	mes "���c�c���́c�c�F�߂Ȃ��I";
	mes "���� Z�c������Ȃɂ��ȒP�Ɂc�c";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "�����H";
	mes "���Ⴀ�A�ǂ�����H";
	next;
	mes "[���C]";
	mes "���c�c�����Ɓc�c";
	mes "�ق�A�������͕����l�����A";
	mes "����͒u���Ęb�������āA������c�c";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "�Ӂ`��B";
	mes "���Ⴀ�A���񂾖{��Ԃ��Ă�B";
	mes "�����̃V���f�B�������H";
	next;
	mes "[�L���b�g�|�C]";
	mes "�������j�����I";
	mes "�֒f�̐_��p�����j�����I";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "�����悭����L���ˁI";
	mes "�߂܂��āA�������ɘA��čs����!!";
	next;
	mes "[�L���b�g�|�C]";
	mes "�q�B!!";
	mes "�S�����j�����I";
	next;
	mes "[�}�[�T]";
	mes "�����A���߂悤��B���C�c�c";
	mes "�c�c�I������񂾂�B";
	next;
	mes "[���C]";
	mes "���c�c����ȁc�c";
	mes "���������c�c";
	mes " Z�c�̐��E���K���n�Y�������̂ɁI";
	mes "�������`���҈�l�ɔs���Ȃ�āc�c";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "�������`���҈�l�����āH";
	mes "�悭�����Ă����ˁB";
	next;
	mes "[���C]";
	mes "�n�A�n�A�n�n�n�I";
	mes "��k�ł���`";
	mes "�����A����͒u���āc�c";
	mes "���a�I�Șb���������c�c";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "�e�Ɋp�A���񂾖{��Ԃ��I";
	mes "���O��̈����������܂ŁB";
	mes "�o�債�Ƃ���[�I";
	next;
	mes "[���C]";
	mes "�����c�c";
	mes "���ꂾ�낤�I";
	mes "�����čs����!!";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "�N�c�c";
	mes "���܂����󋵂��ǂ߂ĂȂ��悤���ˁH";
	next;
	mes "[���C]";
	mes "�����I";
	mes "���݂܂���B";
	mes "�ǂ����A���[�߂��������܂��I";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "���āc�c";
	mes "�O�ɏo��ɂ́A�ǂ�����΂����񂾁H";
	next;
	mes "[���C]";
	mes "������!!";
	mes "�N���O�ɏo���Ȃ��Ȃ�A";
	mes " Z�c�́A�܂���������ł͂Ȃ�!!";
	mes "�n�n�n!!";
	next;
	mes "[" +strcharinfo(0)+ "]";
	mes "��H";
	mes "���a�I�Șb�������́A";
	mes "���]�݂���Ȃ��̂��ȁc�c�H";
	next;
	mes "[���C]";
	mes "������!!";
	mes "�L���b�g�|�C!!�@�����Ă�!!";
	next;
	mes "[�L���b�g�|�C]";
	mes "�j�����c�c";
	mes "�]�v�Ȏ����Ȃ���΂�������j���C�B";
	next;
	mes "[�}�[�T]";
	mes "�S���c�c";
	next;
	mes "[���C]";
	mes "�L���c�c�L���b�g�|�C�A";
	mes "���̕����o���܂ňē�����";
	mes "�����グ�Ȃ����I";
	next;
	mes "[�L���b�g�|�C]";
	mes "�킩�����j�����I";
	mes "�O�ɑ���j�����I";
	close2;
	getitem 7724,1;
	set NAME_4QUE,18;
	//warp "moc_fild09.gat",68,298;
	warp "moc_fild17.gat",209,235;
	set getvariableofnpc('mob,"#zdan_broad"),0;
	set getvariableofnpc('lock,"#zdan_broad"),0;
	stopnpctimer "#zdan_broad";
	end;
OnInit:
	hideonnpc;
	end;
}
z_agit.gat,99,101,3	duplicate(���C#name)	�}�[�T#name	101
z_agit.gat,95,101,3	duplicate(���C#name)	�L���b�g�|�C#name	876

//============================================================
// �B���ꂽ���N�G�X�g
//- Registry -------------------------------------------------
// NAME_5QUE -> 0�`12
//------------------------------------------------------------
morocc.gat,143,63,3	script	�ڂ낢�j	929,{
	switch(NAME_5QUE) {
	case 0:
		mes "[�ڂ낢�j]";
		mes "���c�c";
		mes "�����A��҂�B";
		mes "�����Ă���[!!";
		next;
		mes "[�ڂ낢�j]";
		mes "����!!";
		mes "�N����A�N�I";
		mes "������Ǝv���āA";
		mes "���̗��݂𕷂��Ă���I";
		next;
		if(select("�ǂ����܂����H","��������") == 2) {
			mes "[�ڂ낢�j]";
			mes "���`��!!�@���`��!!";
			next;
			mes "[�ڂ낢�j]";
			mes "�N�A�`���҂��낤�H";
			mes "�Ȃ�΁A�o���厖�ɂ��Ȃ���!!";
			mes "�߂�Ȃ���!!";
			mes "�b�𕷂���!!";
			next;
			mes "[�ڂ낢�j]";
			mes "���`��!!�@���`��!!";
			close;
		}
		mes "[" +strcharinfo(0)+ "]";
		mes "���́c�c";
		mes "�ǂ������܂����H";
		next;
		mes "[�ڂ낢�j]";
		mes "���肪�Ƃ�!!";
		mes "�N�͗D�����ˁB";
		next;
		mes "[�ڂ낢�j]";
		mes "�N���c�c";
		mes "���̘b�𕷂��Ă���鏉�߂Ă̐l���I";
		next;
		mes "[�ڂ낢�j]";
		mes "�ӂ��c�c";
		mes "���̒����₽���Ȃ������񂾁c�c";
		next;
		mes "[�ڂ낢�j]";
		mes "���͂���Ȋi�D�����Ă��邯��";
		mes "���X�́A�����N�̔�����������";
		mes "�l�Êw�҂łˁB";
		mes "���͂́A�M������낤�H";
		next;
		menu "�͂��A����Łc�c�H",-;
		mes "[�ڂ낢�j]";
		mes "����ł��A�l�Êw�A���ł�";
		mes "�����N�̔��ɂ��Ă�";
		mes "�N�����ڂ����Ǝv���Ă����񂾁B";
		next;
		mes "[�ڂ낢�j]";
		mes "�����ɑS���Y�𒍂����݁A";
		mes "�����N�Ŕ��̔��@��Ƃ��������ǁc�c";
		mes "���́c�c����Ȃ������B";
		mes "�������B�͗�������c�c";
		mes "���́A�n�R�ɂȂ��Ă��܂����񂾂�B";
		next;
		mes "[�ڂ낢�j]";
		mes "���́c�c�����c�c";
		mes "�̋��v�����e���ɖ߂� Zeny����";
		mes "�����Ă��Ȃ��c�c";
		mes "�����̖��m���������Ђ����낤�c�c";
		emotion 28;
		next;
		mes "[�ڂ낢�j]";
		mes "����Łc�c";
		mes "������񂾂��ǁc�c";
		mes "�v�����e���ɖ߂肽���񂾁B";
		next;
		mes "[�ڂ낢�j]";
		mes "���̈���Ȋw�҂�";
		mes "���X�̗�����b��ł���Ȃ����ȁc�c�H";
		next;
		if(select("�����Ȃ���","�c�c�����Ȃ�") == 1) {
			mes "[�ڂ낢�j]";
			mes "�c�c�₽���ȁc�c";
			mes "���̖ڂ����������ȁc�c";
			next;
			mes "[�ڂ낢�j]";
			mes "�����c�c";
			mes "�܊p�A�����b�������悤�Ǝv�����̂�";
			mes "�ܑ̖����c�c���ɖܑ̖����B";
			set NAME_5QUE,1;
			close;
		}
		mes "[�ڂ낢�j]";
		mes "�{���ɁH";
		mes "���肪�Ƃ�!!";
		mes "�D�����l�ɏ�����";
		mes "���́A�Ȃ�čK�^�Ȃ�!!";
		next;
		if(Zeny < 1200) {
			mes "[�ڂ낢�j]";
			mes "���́c�c";
			mes "����Ȏ��������̂�";
			mes "�������܂�����������Ȃ��񂾂��c�c";
			next;
			mes "[�ڂ낢�j]";
			mes " Zeny�������悤�����c�c";
			mes "�ǂ����ɗ��Ƃ����̂��H";
			next;
			mes "[�ڂ낢�j]";
			mes "�ӂށc�c";
			mes "�������A1200Zeny�ł����b��";
			mes "�����Ă����悤�Ǝv�����̂Ɂc�c";
			set NAME_5QUE,1;
			close;
		}
		set Zeny,Zeny-1200;
		mes "[�ڂ낢�j]";
		mes "���肪�Ƃ��B";
		mes "����ŉƂɖ߂��c�c";
		mes "���āc�c��������Ȃ�����ˁB";
		mes "�����b��������悤�B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c�H";
		next;
		mes "[�ڂ낢�j]";
		mes "�����T���Ă��������N�̔��Ȃ񂾂��A";
		mes "�ŋ߁A���݂̍菈���킩�����炵���B";
		mes "�ǂ������H";
		mes "�����b���낤�H";
		next;
		mes "[�ڂ낢�j]";
		mes "������������A���ɑ��̘A����";
		mes "��ɓ���Ă��܂�����������Ȃ����c�c";
		mes "�b�𕷂��Ă݂Ă������񂶂�Ȃ����H";
		next;
		mes "[�ڂ낢�j]";
		mes "���݂̍菈��m���Ă���l�́A";
		mes "���̊X�̖k�ɂ��邻�����B";
		next;
		mes "[�ڂ낢�j]";
		mes "�ނށc�c!?";
		mes "���̘b�̏o�������āH";
		next;
		mes "[�ڂ낢�j]";
		mes "�����悭�s���Ă�������̎�l��";
		mes "���̐l�����̎��ɂ���";
		mes "�b���Ă���̂𕷂����ƌ�������c�c";
		mes "�܂��A�ԈႢ�Ȃ����낤�B";
		next;
		mes "[�ڂ낢�j]";
		mes "���ځA���̐l�ɘb�𕷂��Ă�";
		mes "�f���ɋ����Ă͂���Ȃ����낤���ǁA";
		mes "�����Ă݂邾���A�����Ă݂Ă�";
		mes "�����񂶂�Ȃ����H";
		next;
		mes "[�ڂ낢�j]";
		mes "������������A�ق�c�c";
		mes "�����Ă���邩���m��Ȃ���!!";
		set NAME_5QUE,2;
		close;
	case 1:
		mes "[�ڂ낢�j]";
		mes "�����I";
		mes "���̑O�b�𕷂��Ă��ꂽ�l���ˁB";
		mes "�����́A�ǂ������̂����H";
		next;
		mes "[�ڂ낢�j]";
		mes "���������āc�c";
		mes "���̎����C�ɂȂ��āc�c�H";
		mes "�t�t�t�c�c�܂��A��������ˁ`";
		next;
		mes "[�ڂ낢�j]";
		mes "�v�����e���܂ł̃��[�v��p�A";
		mes " 1200Zeny�ł�����B";
		mes "�{���ɐ������������Ă����邩��A";
		mes "�ǂ������H";
		mes "�����b����Ȃ����낤�H";
		next;
		if(select(" Zeny��������","�c�c�����Ȃ�") == 2) {
			mes "[�ڂ낢�j]";
			mes "�����������������I";
			mes "�����A������!!";
			close;
		}
		mes "[�ڂ낢�j]";
		mes "������ 1200Zeny�ŁA";
		mes "���̏��𓾂�Ȃ�ă`�����X�A";
		mes "�ő��ɍ݂���񂶂�Ȃ��I";
		mes "����Ƃ��ẮA�j�i���낤�H";
		next;
		if(Zeny < 1200) {
			mes "[�ڂ낢�j]";
			mes "�c�c�c�c�c�c�c�c";
			mes " Zeny����������Ȃ����B";
			next;
			mes "[�ڂ낢�j]";
			mes "�`�����X���ڂ̑O�ɂ����Ă�";
			mes "����𓦂��Ă��܂��l��";
			mes "���܂ɂ���񂾂�ȁ`";
			mes "���������A�A�����A�����I";
			close;
		}
		set Zeny,Zeny-1200;
		mes "[�ڂ낢�j]";
		mes "������I";
		mes "����ŉ��������䂪�̋��A";
		mes "�v�����e���֖߂�邼�I";
		next;
		mes "[�ڂ낢�j]";
		mes "���āA��������Ȃ�����ˁB";
		mes "�񑩒ʂ�A���������悤�B";
		next;
		mes "[�ڂ낢�j]";
		mes "�����T���Ă��������N�̔��Ȃ񂾂��A";
		mes "�ŋ߁A���݂̍菈���킩�����炵���B";
		mes "�ǂ������H";
		mes "�����b���낤�H";
		next;
		mes "[�ڂ낢�j]";
		mes "������������A���ɑ��̘A����";
		mes "��ɓ���Ă��܂�����������Ȃ����c�c";
		mes "�b�𕷂��Ă݂Ă������񂶂�Ȃ����H";
		next;
		mes "[�ڂ낢�j]";
		mes "���݂̍菈��m���Ă���l�́A";
		mes "���̊X�̖k�ɂ��邻�����B";
		next;
		mes "[�ڂ낢�j]";
		mes "�ނށc�c!?";
		mes "���̘b�̏o�������āH";
		next;
		mes "[�ڂ낢�j]";
		mes "�����悭�s���Ă�������̎�l��";
		mes "���̐l�����̎��ɂ���";
		mes "�b���Ă���̂𕷂����ƌ�������c�c";
		mes "�܂��A�ԈႢ�Ȃ����낤�B";
		next;
		mes "[�ڂ낢�j]";
		mes "���ځA���̐l�ɘb�𕷂��Ă�";
		mes "�f���ɋ����Ă͂���Ȃ����낤���ǁA";
		mes "�����Ă݂邾���A�����Ă݂Ă�";
		mes "�����񂶂�Ȃ����H";
		next;
		mes "[�ڂ낢�j]";
		mes "������������A�ق�c�c";
		mes "�����Ă���邩���m��Ȃ���!!";
		set NAME_5QUE,2;
		close;
	case 2:
		mes "[�ڂ낢�j]";
		mes "���̍s����ǂ����I";
		mes "���ꂪ�g���W���[�n���^�[�̉^��!!";
		mes "�u�c�u�c�u�c�u�c�u�c�u�c";
		mes "�u�c�u�c�u�c�u�c�c�c";
		next;
		mes "[�ڂ낢�j]";
		mes "��H";
		mes "�ǂ����Ė߂��Ă����񂾁H";
		next;
		mes "[�ڂ낢�j]";
		mes "�����N�̒n�����킩��Ȃ��̂��H";
		mes "�d���������A������x���������悤�B";
		next;
		mes "[�ڂ낢�j]";
		mes "�X�̖k�ɔ��݂̍菈��";
		mes "�m���Ă���l�����邻�����B";
		mes "���̐l��K�˂Ă݂�Ƃ����B";
		close;
	default:
		mes "[�ڂ낢�j]";
		mes "���T���͂ǂ����H";
		mes "�����ɍs���Ă��邩�ˁH";
		next;
		mes "[�ڂ낢�j]";
		mes "�ӂށc�c";
		mes "�܂��A�ȒP�Ɏ�ɓ����΂Ȃ��";
		mes "���̐��ɂ͑��݂��Ȃ��c�c";
		next;
		mes "[�ڂ낢�j]";
		mes "��Ɏ���Ă݂�܂ł́A";
		mes "�΂��납��΂��Ȃ�Ă킩��Ȃ����A";
		mes "�C���ɂ�鎖���ˁB";
		close;
	case 11:
	case 12:
		mes "[�ڂ낢�j]";
		mes "���H";
		mes "��󂪌��������̂��I�A";
		mes "���߂łƂ��I";
		mes "�N�Ȃ�o����Ǝv������I";
		close;
	}
}

morocc.gat,102,298,3	script	�j	98,{
	switch(NAME_5QUE) {
	case 0:
	case 1:
		mes "[�j]";
		mes "�������Ă��!!";
		mes "���́A�@���������񂾁I";
		mes "����������I";
		close;
	case 2:
		mes "[�j]";
		mes "�������Ă��!!";
		mes "���́A�@���������񂾁I";
		mes "����������I";
		next;
		menu "���̎��𕷂��ɗ��܂���",-;
		mes "[�j]";
		mes "���H";
		mes "�܂����A���O�́c�c�H";
		mes "�`�N�V���[!!";
		emotion 0;
		next;
		mes "[�j]";
		mes "���́A���̑O�Ɍ��ꂽ�H";
		mes "���́c�c���X�c�c";
		mes "�F�E���ɂ��Ă��!!";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c�H";
		mes "�����Ă鎖���c�c";
		mes "�S���킩��Ȃ��ł����ǁc�c";
		next;
		mes "[�j]";
		mes "�m��Ȃ��U��������!!";
		mes "���O�́A���̎���m���Ă��邩��A";
		mes "�����Ɍ��ꂽ�񂾂낤�H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c���̎��́c�c";
		mes "���������A�m��܂������ǁc�c";
		next;
		mes "[�j]";
		mes "���c�c�������H";
		mes "�Ȃ�΁A�l�Ⴂ���c�c";
		next;
		mes "[�j]";
		mes "�Ƃ���ŁA���̎��͂ǂ��Œm�����H";
		mes "�����m���Ă��邩��A";
		mes "���ɐ����|�����񂾂낤�H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "- �����܂ŗ����o�܂���������B -";
		next;
		mes "[�j]";
		mes "�ӂށc�c";
		mes "���̖ꂪ�T���Ă������c�c���B";
		mes "�b�𕷂�����A���̒m���Ă��镨��";
		mes "�����������m��Ȃ��ȁc�c";
		next;
		mes "[�j]";
		mes "���ĂƁc�c";
		mes "�b�͂킩�����B";
		mes "��������͏����̘b�����悤���B";
		next;
		mes "[�j]";
		mes "���́A���݂̍菈��m���Ă���B";
		mes "���O�́A���̏����W�߁A";
		mes "������@��o�����Ƃ��Ă���B";
		next;
		mes "[�j]";
		mes "�܂��A�킩���ȁH";
		mes "��񂪗~�����̂͂��O�ŁA";
		mes "�����~�����͉̂����B";
		next;
		mes "[�j]";
		mes "�ǂ����H";
		mes "���̏��𔃂�Ȃ����H";
		next;
		if(select("���́c�c�����܂���","�����ł��傤") == 2)
			break;
		mes "[�j]";
		mes "�������H";
		mes "�܂��A�D���ɂ��邪�������B";
		next;
		mes "[�j]";
		mes "���ɏo���Ȃ���������";
		mes "���O�Ȃǂɏo����Ƃ͎v���Ȃ����ȁB";
		next;
		mes "[�j]";
		mes "�����􂾁I";
		mes "�����A�����A��ȁI";
		set NAME_5QUE,3;
		close;
	case 3:
		mes "[�j]";
		mes "�����H";
		mes "�l�����ς�����̂��H";
		mes "�܂��A��������������͂Ȃ��B";
		mes "���A�����𕷂��Ă݂Ă���ł�";
		mes "�x���͖������I";
		next;
		if(select("���\�ł�","�����𕷂��܂�") == 2)
			break;
		mes "[�j]";
		mes "�������B";
		mes "��ł��ȁc�c";
		next;
		mes "[�j]";
		mes "�N���~�������̂���ɓ��邵�A";
		mes "������V���Ⴆ�邵�c�c";
		mes "���݂����͂��Ȃ��b����";
		mes "�v���񂾂��ȁB";
		next;
		mes "[�j]";
		mes "�܂��A�l�����ς������";
		mes "���ł������I";
		close;
	case 4:
		mes "[�j]";
		mes "�������I";
		mes "�҂��Ă������I";
		mes "����ŁA���񂾕���";
		mes "�S�������ė������H";
		next;
		if(countitem(722) < 2 || countitem(912) < 2 || countitem(934) < 20) {
			mes "[�j]";
			mes "�c�c����Ȃ��ȁB";
			mes "���������ė��邩�Y�ꂽ�̂��H";
			next;
			mes "[�j]";
			mes "^FF0000�^��2�A�W�����S��2�A";
			mes "���҂̈�i20��^000000�������ė����I";
			mes "�����ő҂��Ă邼!!";
			close;
		}
		mes "[�j]";
		mes "�ق��A�S�������Ă������I";
		mes "����́A��������Ƃ��Ē����B";
		delitem 722,2;
		delitem 912,2;
		delitem 934,20;
		set NAME_5QUE,5;
		next;
		mes "[�j]";
		mes "���āA����b�����B";
		mes "���݂̍菈�͌��\�߂�������";
		mes "�����܂ŋ�J�͂��Ȃ����낤�B";
		next;
		mes "[�j]";
		mes "���́c�c";
		next;
		mes "[�j]";
		mes "���̃����N�̓삾�I";
		mes "��̃Q�[�g����o�āA";
		mes "�X�ɓ�Ɉړ�����񂾁I";
		mes "�����ɂ���炵���B";
		next;
		mes "[�j]";
		mes "���m�ȏꏊ�͉����m��Ȃ��B";
		mes "���ꂭ�炢�́A�����ŒT���I";
		close;
	case 5:
		mes "[�j]";
		mes "��H";
		mes "�܂��A����ȏ��ɂ���̂��B";
		mes "��������T���ɍs���I";
		close;
	case 6:
		mes "[�j]";
		mes "��H";
		mes "�܂��A����ȏ��ɂ���̂��B";
		mes "��������T���ɍs���I";
		next;
		menu "�����s���ė��܂�����",-;
		mes "[" +strcharinfo(0)+ "]";
		mes "���̋��ꏊ�ɍs���ė��܂������ǁA";
		mes "���@���|�����Ă���̂��c�c";
		mes "�@��o�������o���܂���ł����B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�����c�c";
		mes "�B���Ă鎖������ł��傤�H";
		next;
		mes "[�j]";
		mes "�ւ��B";
		mes "�����s���ė����̂��H";
		mes "�f�l���Ǝv���Ă���A";
		mes "���\�Șr�̎�����̂悤���ȁB";
		next;
		mes "[�j]";
		mes "�K�x�Ȏ��������Ă����āA";
		mes "�����ォ��@��o�����肾�������A";
		mes "����́c�c�v�Z�O���ȁc�c";
		next;
		mes "[�j]";
		mes "�����I";
		mes "�����ɂ͖��@���|�����Ă��āA";
		mes "������撣���Ă��A�@��o���Ȃ��񂾁B";
		next;
		mes "[�j]";
		mes "�˗��l�ɕ����Ă����ꏏ�ɍ�Ƃ�����";
		mes "������l�͗��Ȃ����c�c";
		next;
		mes "[�j]";
		mes "���͖��@�̎��͒m��Ȃ����A";
		mes "�˗��l���������������邯�ǁA";
		mes "�ǂ��g���΂����̂����킩��Ȃ��c�c";
		next;
		while(1) {
			if(select("���̐l�H","�����������H") == 1) {
				mes "[�j]";
				mes "�������B";
				mes "�񑩂̏ꏊ�֍s���΁A";
				mes "������l���āA�ꏏ�ɍ�Ƃ������";
				mes "�����Ă����񂾂��c�c";
				mes "�N�Ȃ̂��͂킩��Ȃ��B";
				next;
				mes "[�j]";
				mes "�����痈��ƕ����Ă�������A";
				mes "�����A�����N�̐��̕��ɏZ��ł���";
				mes "�z�Ȃ̂����ȁB";
				next;
				set '@joho1,1;
				if('@joho1 && '@joho2)
					break;
				continue;
			}
			if(NAME_5QUE == 7 || NAME_5QUE == 8) {
				mes "[�j]";
				mes "�����B";
				mes "^FF0000" +(NAME_5QUE==7? "�J��": "OPEN")+ "^000000�Ə����ꂽ";
				mes "���������񂾂��c�c";
				next;
				continue;
			}
			mes "[�j]";
			mes "- �K�T�@�K�T -";
			next;
			mes "[�j]";
			mes "���ꂾ�B";
			mes "���Ă̒ʂ�A�j�ꂽ�����B";
			next;
			set '@rand,rand(1,2);
			mes "- �j�ꂽ���ɂ�";
			mes "�@^FF0000[" +('@rand==1? "�J��": "OPEN")+ "^000000�Ə����Ă���B -";
			next;
			set NAME_5QUE,NAME_5QUE+'@rand;
			set '@joho2,1;
			if('@joho1 && '@joho2)
				break;
			continue;
		}
		mes "[" +strcharinfo(0)+ "]";
		mes "�Ƃ���Łc�c";
		mes "���Ȃ��͈˗��l�ɉ��������";
		mes "����܂���ˁH";
		mes "���Ȃ��̓I�Ȏw�����󂯂Ă���";
		mes "�悤�Ȃ�ł����c�c";
		next;
		mes "[�j]";
		mes "����A������������͂Ȃ��B";
		mes "�����A�莆�Ŏw�����󂯂Ă���񂾁B";
		next;
		mes "[�j]";
		mes "�����Ď����Ă���̂����m��Ȃ����A";
		mes "�莆�Ŏw�����o���̂�";
		mes "�C�������������肷�邯�ǁc�c";
		mes "�ʒi�A�C�ɂ��Ă͂��Ȃ��B";
		next;
		mes "[�j]";
		mes "���́A�˗��ʂ�ɔ��������A";
		mes "�@��o���΂����������B";
		next;
		mes "[�j]";
		mes "�˗��l�́c�c";
		mes "�\�ɏo��ɂ͖�肪���邩��A";
		mes "����������i������Ă���̂��낤�B";
		mes "�悭����b���B";
		next;
		mes "[�j]";
		mes "���̎��ɂ��ĂȂ񂾂��c�c";
		mes "���́A���b�Z�[�W�������Ă���̂��A";
		mes "���́A��؂�ɂȂ��Ă���̂���";
		mes "���ɂ͂킩��Ȃ��B";
		next;
		mes "[�j]";
		mes "���̎��ɏ����Ă��錾�t���A";
		mes "���@����������ׂ̎��������m��Ȃ���";
		mes "�l���āA���x�������Ă݂����c�c";
		mes "���ǁA�����N����Ȃ������B";
		next;
		mes "[�j]";
		mes "����ŁA�m���Ă��鎖�͑S���b�����B";
		mes "�����A����ȏ�̏��͂Ȃ����B";
		next;
		mes "[�j]";
		mes "�������ȁc�c";
		mes "�˗��l�������Ă����A";
		mes "������l������������";
		mes "������񂪓����邩������Ȃ��ȁB";
		next;
		mes "[�j]";
		mes "���O���`���҂Ȃ�΁A";
		mes "�����ŕ��@��T���Ă݂ȁI";
		close;
	case 7:
	case 8:
		mes "[�j]";
		mes "�c�c�c�c";
		next;
		mes "[�j]";
		mes "�����H";
		mes "�����A�S�Ęb�������I";
		next;
		mes "[�j]";
		mes "�˗��l�������Ă���";
		mes "�����痈�������l��T���o���āA";
		mes "�b�𕷂��Ă݂���ǂ����H";
		close;
	case 9:
	case 10:
		mes "[�j]";
		mes "���������΁c�c";
		mes "�s�v�c���Ǝv��Ȃ����H";
		next;
		mes "[�j]";
		mes "�˗��l�́A��Ƃɉ���������Ȃ�";
		mes "������l�h�������B";
		mes "����́c�c���̂��H";
		mes "�������R������͂�����ȁB";
		mes "�Ⴆ�΁A��l���Ȃ��ƃ_�����Ƃ��c�c";
		next;
		mes "[�j]";
		mes "����Ƃ��A��΂����ɂ�";
		mes "��l�K�v���Ƃ��H";
		next;
		mes "[�j]";
		mes "�܂��A�����ǂ��ł������B";
		mes "���͕�΂���߂�I";
		mes "��������A�S���N�̕����I";
		close;
	default:
		mes "[�j]";
		mes "���āc�c";
		mes "�̋��ɋA�낤���c�c";
		close;
	}
	// case2,3�̑���
	mes "[�j]";
	mes "�����肪�����悤���ȁB";
	mes "�܂��A���̐��̒���";
	mes "�����̕��Ȃ�Ă���Ⴕ�Ȃ��I";
	mes "���t�ł����ł����l�������";
	mes "�l�i�Ȃ�čD���ɕt��������񂾁B";
	next;
	mes "[�j]";
	mes "�ŁA���̎��������ȁB";
	mes "�c�c���𕥂��Ė���Ĉ����񂾂��A";
	mes "���̏��A�܂��A���̎��́c�c";
	mes "�悭�킩���̂��B";
	next;
	mes "[�j]";
	mes "�܂��A���������B";
	mes "�S���킩��Ȃ����Ė󂶂�Ȃ��B";
	next;
	mes "[�j]";
	mes "���͂���l������A";
	mes "���̔����@��o���悤�ɂ�";
	mes "���܂ꂽ�����Ȃ񂾁c�c";
	next;
	mes "[�j]";
	mes "�Ƃ��낪�c�c";
	next;
	mes "[�j]";
	mes "���������@��o���Ȃ���������";
	mes "�b������ȁH";
	next;
	mes "[�j]";
	mes "���Ɏd�����˗������l���́A";
	mes "�����@��o������A";
	mes "���ȊO�̋��ɖ����Ă������́A";
	mes "�S���A���ɂ������Č������񂾁B";
	next;
	mes "[�j]";
	mes "�b�������Ă������H";
	mes "�N�������@��o���ƁA���̕�V��";
	mes "�d�����˗������l�����_���Ă�������";
	mes "�N���S�ēƂ��߂���󂾁I";
	mes "����́A�s�������낤�H";
	next;
	mes "[�j]";
	mes "������c�c";
	mes "�������������ɉ��̕�V���́A";
	mes "���ɂ���I";
	mes "���ꂪ�������I";
	next;
	mes "[�j]";
	mes "�����ȏ������Ǝv���񂾂��A�ǂ����H";
	mes "�܂��́A^FF0000�^��2�A�W�����S��2�A";
	mes "���҂̈�i20��^000000�������Ă����B";
	mes "�b�͂��ꂩ�炾�B";
	set NAME_5QUE,4;
	close;
}

comodo.gat,339,224,3	script	�B��Ă���j	881,{
	switch(NAME_5QUE) {
	default:
		mes "[�B��Ă���j]";
		mes "�����H";
		mes "���ɗp���H";
		next;
		mes "[�B��Ă���j]";
		mes "�c�c�����͌����Ȃ��ȁB";
		mes "���ɍ\��Ȃ��ł���!!";
		close;
	case 7:
	case 8:
		//if(NAME_4QUE > 12) {		//�{�I�d�l
		if(NAME_4QUE > 18) {
			mes "[�B��Ă���j]";
			mes "�����H";
			mes "���ɍ\��Ȃ��ł���!!";
			next;
			menu "���́A�B��Ă����ł����H",-;
			mes "[" +strcharinfo(0)+ "]";
			mes "��������Ȃɋ����Ă���̂ł����H";
			mes "���Ȃ����A Z�c������T����";
			mes "�˗����󂯂��l�ł��傤�H";
			next;
			mes "[�B��Ă���j]";
			mes "�������āH";
			mes " Z�c�����āH";
			next;
			mes "[�B��Ă���j]";
			mes "���� Z�c���Ă̂��A";
			mes "���Ɏd���𗊂񂾓z�̎��Ȃ̂��H";
			mes "�N�́A�z��ɉ�����̂��H";
			next;
			mes "[�B��Ă���j]";
			mes "�c�c�n�b!!";
			mes "���������āA�N�͓z��ɗ��܂��";
			mes "���̎���T���Ɂc�c";
			next;
			mes "[�B��Ă���j]";
			mes "�c�c�Ⴄ�񂾁I";
			mes "���̎��́A���܂��ܗp�����c�c";
			mes "�فA�{���Ȃ񂾁I";
			mes "�M���Ă���!!";
			next;
			mes "[" +strcharinfo(0)+ "]";
			mes "�Ⴂ�܂��I";
			mes "���̓����N�̔���T���Ă��āc�c";
			mes "���Ȃ݂� Z�c�͓|���܂�����B";
			next;
			mes "[�B��Ă���j]";
			mes "�ȁA��!?";
			mes "�z���|�������āH";
			mes "���Ⴀ�A���͂����r�N�r�N�B���";
			mes "�߂����Ȃ��Ă������񂾂ȁH";
			next;
			mes "[" +strcharinfo(0)+ "]";
			mes "�����ł��B";
			mes "���������ɗ������R�́A";
			mes "���̍s����ǂ��Ă���r���A";
			mes "���Ȃ������������Ă����";
			mes "����������Ȃ�ł���B";
			next;
			mes "[�B��Ă���j]";
			mes "�c�c�������B";
			mes "����ƌN�́A���̎����Ă���";
			mes "���Ɋ|���������@����������";
			mes "������T���Ă����ɗ����񂾂ˁH";
			next;
			mes "[�B��Ă���j]";
			mes "�����A���ꂾ��B";
			mes "���ꂪ�A�����̎c�肾�B";
			next;
			mes "[�B��Ă���j]";
			mes " Z�c��|���Ă��ꂽ�����";
			mes "���̎��͌N�ɂ����悤�B";
			next;
			mes "- �����ɂȂ������ɂ�";
			mes "�@^FF0000" +(NAME_5QUE==7? "�S�}]": "SESAMI]")+ "^000000�Ə����Ă���B -";
			set NAME_5QUE,NAME_5QUE+2;
			next;
			mes "[�B��Ă���j]";
			mes "�c�c�������B";
			mes "��C�ɂȂ鎖������񂾂��c�c";
			mes "���́A Z�c�͂��̎���";
			mes "��ɂ킯���̂��낤�H";
			next;
			mes "[�B��Ă���j]";
			mes "�z��́A���̑��ɂ�����l��";
			mes "���@��Ƃ��˗������񂾂낤�H";
			mes "���́A����Ȗʓ|�Ȏ����c�c";
			next;
			mes "[�B��Ă���j]";
			mes "������������c�c";
			mes "���̔����Ă͓̂�l����Ȃ���";
			mes "�@��o���Ȃ��悤�ɂȂ��Ă���Ƃ��H";
			mes "���`���N�`���d���Ƃ��c�c";
			next;
			mes "[�B��Ă���j]";
			mes "�����c�c";
			mes "������͂��邾�낤���ȁc�c";
			next;
			mes "[�B��Ă���j]";
			mes "�܂��A�撣����";
			mes "����T���Ă���I";
			close;
		}
		mes "[�B��Ă���j]";
		mes "�����H";
		mes "���ɗp���H";
		next;
		menu "���̌��ŗ��܂���",-;
		mes "[" +strcharinfo(0)+ "]";
		mes "���̎��𕷂����Ǝv����";
		mes "�T���Ă����̂ł����c�c";
		next;
		emotion 23;
		mes "[�B��Ă���j]";
		mes "�܂����c�c";
		mes "������s���Ă����̂��H";
		mes "�c�c����܂ł��I";
		mes "�d�����Ȃ��I�@���𔲂��I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���A�Ⴂ�܂��I";
		mes "�����ɗ����󂶂Ⴀ��܂����B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "����T���Ă�r���A���Ȃ��̎���";
		mes "�����N�ɂ���l���畷���āc�c";
		mes "����ŗ�����ł��B";
		next;
		mes "[�B��Ă���j]";
		mes "�����N�c�c�́H";
		mes "���������āA���ƈꏏ��";
		mes "���@��Ƃ�����͂��������z���H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�����ł��B";
		next;
		mes "[�B��Ă���j]";
		mes "�Ȃ�΁A��������";
		mes "���̏��𕷂��Ă���񂾂ȁc�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "- ���܂ł̌o�܂�b�����B -";
		next;
		mes "[�B��Ă���j]";
		mes "�m���ɉ��ƈꏏ��";
		mes "���@��Ƃ�����͂��������z���ȁB";
		next;
		mes "[�B��Ă���j]";
		mes "�ƁA����Ɓc�c";
		mes "�N�̒T���Ă��镨�́A";
		mes "���ꂾ�낤�H";
		next;
		mes "- �����ɂȂ������ɂ�";
		mes "�@^FF0000" +(NAME_5QUE==7? "�S�}]": "SESAMI]")+ "^000000�Ə����Ă���B -";
		set NAME_5QUE,NAME_5QUE+2;
		next;
		mes "[�B��Ă���j]";
		mes "�����A�������낤�H";
		mes "�������ǁA���ɍ\��Ȃ��ł���Ȃ����H";
		mes "�o����΁A�ڗ��������Ȃ��񂾁B";
		next;
		mes "[�B��Ă���j]";
		mes "�������ɂ��Ēm���Ă��鎖��";
		mes "���ꂾ�����B";
		next;
		mes "[�B��Ă���j]";
		mes "������c�c";
		mes "�����A���ɂ͍\��Ȃ��ł���I";
		close;
	case 9:
	case 10:
		mes "[�B��Ă���j]";
		mes "�N�́c�c";
		mes "����T���ɍs�����񂶂�H";
		next;
		mes "[�B��Ă���j]";
		mes "�܂����c�c^FF0000" +(NAME_5QUE==9? "�S�}]": "SESAMI]")+ "^000000��Y���";
		mes "�߂��Ă����c�c���Ė󂶂�Ȃ���ȁH";
		next;
		mes "[�B��Ă���j]";
		//if(NAME_4QUE > 12) {		//�{�I�d�l
		if(NAME_4QUE > 18) {
			mes " Z�c����ł����̂Ȃ�A";
			mes "�����̋��ɋA�낤���c�c";
		}
		else {
			mes "���������ɂ�����Ď���";
			mes "�N�ɂ�����Ȃ��ł���I";
			mes "�����ɂ́A�������Ȃ��ł���!!";
		}
		close;
	case 11:
	case 12:
		mes "[�B��Ă���j]";
		mes "�̋��Ɂc�c";
		mes "�A�낤���c�c";
		close;
	}
}

moc_fild18.gat,108,116,0	script	#���	844,{
	switch(NAME_5QUE) {
	case 5:
		mes "- ���������܂��Ă���̂�������B";
		mes "�@�s�v�c�ȗ͂�������B -";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c�c�c�c�c�c�c�c�c";
		mes "�c�c�c�c�c�c�c�c�c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "- �������܂��Ă���悤���B";
		mes "�@���A���̓r�N�Ƃ����Ȃ��B -";
		set NAME_5QUE,6;
		close;
	case 6:
		mes "- �ǂ����c�c";
		mes "�@���̒j���x���ꂽ�悤���B";
		mes "�@�߂��ĕ����Ă݂悤�B -";
		close;
	case 7:
	case 8:
		mes "- �����������Ă݂����A";
		mes "�@�����N����Ȃ������B -";
		next;
		mes "- ��͂����������������ɂ�";
		mes "�@������l��T���Ȃ��Ɓc�c -";
		close;
	case 9:
	case 10:
		mes "^FF0000�����󂳂ꂽ������";
		mes "�������̃A�C�e�����o�܂��B";
		mes "���A�C�e�������Ă�悤";
		mes "�������A�C�e���̎�ސ���3�󂯁A";
		mes "��Weight��225�ȏ�̗]�T��������";
		mes "���N�G�X�g��i�s���Ă��������B^000000";
		next;
		mes "- ��l�������Ă���������";
		mes "�@���킹��΁A�|�����Ă���";
		mes "�@���@�����������͂����I -";
		next;
		input '@str$;
		if(getonlinepartymember() < 2) {
			mes "- �J���Ȃ��B";
			mes "�@��������Ȃ����̂�";
			mes "�@����̂��c�c�H -";
			close;
		}
		if((NAME_5QUE == 9 && '@str$ != "�J���S�}") && (NAME_5QUE == 10 && '@str$ != "OPEN SESAMI")) {
			mes "- �����N����Ȃ������B -";
			close;
		}
		mes "- �������ɂ킯���̂�";
		mes "�@��l�ȏオ����Ȃ��ƁA";
		mes "�@���Ɋ|���������@��";
		mes "�@��������Ȃ����炩�c�c -";
		next;
		mes "- ������������ƁA�����J�����̂�";
		mes "�@���ɂ��镨�����o�����B -";
		next;
		set NAME_5QUE,(NAME_4QUE==0)? 11: 12;
		getitem 7725,1;
		getitem 604,1;
		getitem 1157,1;
		sc_start3 SC_CURSE,0,0,0,0,1000,10;
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "��c�c�H";
		mes "���̃G�������h�c�c";
		mes "�������Ȋ��������邼�c�c�H";
		close;
	case 11:
		if(NAME_4QUE) {
			mes "- �N���������ɗ����C������B";
			mes "�@���̎��ӂ����������Ղ�����B -";
			set NAME_5QUE,12;
			close;
		}
	default:
		end;
	}
}