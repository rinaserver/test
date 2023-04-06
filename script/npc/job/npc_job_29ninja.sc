//====================================================================
//Ragnarok Online Ninja Jobchange Script
//�@�� CHANGE_NJ -> 0�`4
//====================================================================

//==========================================
// �V���b�v
//------------------------------------------
que_ng.gat,73,26,5	shop	�u�����C	83,2117,2171,15053,7521,7522,7523,7524,6512,6513,6514,6515
que_ng.gat,72,31,3	shop	�u���W		83,13250,13251,13252,13253,13254,6493
prontera.gat,178,244,3	shop	�A�}�c�f�Տ��l	83,13250,13251,13252,13253,13254,6493,2117,2171,15053,7521,7522,7523,7524,6512,6513,6514,6515

//==========================================
// �ē���
//------------------------------------------
alberta.gat,30,65,3	script	�A�J�M	730,{
	if(Job == Job_Ninja) {
		mes "[�A�J�M]";
		mes "���C�ɂ��Ă��邩�H";
		mes "�C���͂��A�ǂ���";
		mes "�^�����邩�킩��Ȃ��B";
		mes "�C����ӂ�ȁB";
		close;
	}
	if(Job != Job_Novice || Upper != UPPER_NORMAL) {
		mes "[�A�J�M]";
		mes "���͋M�l�ɋ������Ȃ��B";
		mes "����B";
		close;
	}
	if(JobLevel < 10) {
		mes "[�A�J�M]";
		mes "�����͋M�l�̂悤��";
		mes "�̖͂������̂�";
		mes "���鏊�ł͂Ȃ��B";
		close;
	}
	mes "[�A�J�M]";
	mes "�ʁc�c";
	mes "���̂悤�ȈÂ��H�n�ɗ���Ƃ́c�c";
	mes "���炭�A�M�l�̎���";
	mes "�����������֓������̂��B";
	mes "�M�l�c�c";
	mes "�E�̓��ɐi�ދC�͂��邩�H";
	next;
	if(select("����ł�","�͂��A�s���܂�")==1) {
		mes "[�A�J�M]";
		mes "�������c�c";
		mes "�c�c�c�c";
		mes "�Ȃ�Α��Ɍ������Ƃ͖����B";
		close;
	}
	mes "[�A�J�M]";
	mes "�ǂ��낤�B";
	mes "�ł́A�M�l�𑗂��Ă�낤�B";
	close2;
	switch(rand(3)) {
	case 0:
		warp "amatsu.gat",170,229;
		end;
	case 1:
		warp "amatsu.gat",216,188;
		end;
	case 2:
		warp "amatsu.gat",178,164;
		end;
	}
}

alberta.gat,168,138,3	script	�D��	99,{
	if(Job != Job_Novice || Upper != UPPER_NORMAL || JobLevel < 10) {
		mes "[�D��]";
		mes "�c�c���ށI";
		mes "�����������I";
		mes "�D�����a�ł���ȁI";
		close;
	}
	mes "[�D��]";
	mes "�c�c���ށI";
	mes "�����������I";
	mes "�D�����a�ł���ȁI";
	next;
	menu "�������Ă�̂ł����H",-;
	mes "[�D��]";
	mes "�E�҂ɂȂ�ׂɊC��n��A";
	mes "�A�}�c�ɍs�������ƌ���";
	mes "�m�[�r�X��҂��Ă���̂ł���I";
	next;
	mes "[�D��]";
	mes "��H";
	mes "�悭����Ƃ����";
	mes "�m�[�r�X�ł���ȁH";
	next;
	mes "[�D��]";
	mes "�E�҂ɋ����͂Ȃ����ˁH";
	mes "���Ȃ�A��������200Zeny��";
	mes "�A�}�c�܂ő��낤�ł͂Ȃ����I";
	next;
	if(select("��������܂���","���肢���܂�") == 1) {
		mes "[�D��]";
		mes "�ӂށc�c";
		mes "�ł́A�C���ς������";
		mes "���ł����Ă���I";
		close;
	}
	if(Zeny < 200) {
		mes "[�D��]";
		mes "�c�c�H";
		mes "�c�O�����A����������Ȃ��悤���B";
		mes "������p�ӂ��ďo�����Ă���I";
		close;
	}
	mes "[�D��]";
	mes "�������Ȃ��ẮI";
	mes "�ł́A�������o�q�ł���I";
	close2;
	set Zeny,Zeny-200;
	warp "amatsu.gat",113,127;
	end;
}

//==========================================
// �����\��
//------------------------------------------
que_ng.gat,30,65,3	script	�N�E�K�E�J�C	730,{
	if(Job == Job_Ninja || Job == Job_Kagerou || Job == Job_Oboro) {
		mes "[�N�E�K�E�J�C]";
		mes "���C�ɂ��Ă��邩�H";
		mes "�C���͂��A�ǂ���";
		mes "�^�����邩�킩��Ȃ��B";
		mes "�C����ӂ�ȁB";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "�\�\�������ȁA�C�����s���̂�";
		mes "�����ꏊ��m���Ă���B";
		mes "�E�҂ɂȂ������ƁA";
		mes "�`���҃A�J�f�~�[��";
		mes "�Ă΂��ꏊ��";
		mes "�s�������Ƃ͂��邩�H";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "�E�҂ɂȂ�����ɁA�s�������Ƃ�";
		mes "�����Ȃ�A���̌������o������";
		mes "�`���҃A�J�f�~�[�̃T�|�[�g��";
		mes "�s���Ă���҂�����͂����B";
		mes "�����Ă��炤�Ƃ悢�B";
		close;
	}
	if(Upper == Upper_BABY) {
		mes "[�N�E�K�E�J�C]";
		mes "�ȁI";
		mes "����ȏ��Ɏq�����c�c";
		mes "�o�J�ȁc�c";
		mes "�䂪�Z�p�́A�q���Ɍ�������x��";
		mes "���x���������̂��c�c";
		close;
	}
	if(Job != Job_Novice || Upper == Upper_HIGH) {
		mes "[�N�E�K�E�J�C]";
		mes "�����M�l�I";
		mes "�ǂ����痈�����m��񂪁A";
		mes "�M�l�ɗp�͂Ȃ��B";
		mes "�͂₭���̑O���������B";
		close;
	}
	if(JobLevel < 10) {
		mes "[�N�E�K�E�J�C]";
		mes "�܂��܂��C���������I";
		mes "�o�����Ă����I";
		mes "�܂���Job���x����10�ɂ��Ă���̂��I";
		mes "������̂��A^0000FF�u��{�X�L���v��";
		mes "���x����9�@^000000�ɂ���I";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "^0000FF�u��{�X�L���v^000000�̃��x����";
		mes "^0000FF�u�X�L�����X�g�v^000000�E�B���h�E��";
		mes "�グ�邱�Ƃ��ł��邼�B";
		mes "^0000FF�u�X�L�����X�g�v^000000�E�B���h�E��";
		mes "^0000FF�u��{���v^000000�E�B���h�E����";
		mes "^0000FF�uSkill�v^000000�{�^���ŕ\�������B";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "�X�L���̃��x�����グ��ɂ́A";
		mes "�X�L���|�C���g������U������A";
		mes "^FF0000�u�m��v^000000�{�^�����K�v�ƂȂ�B";
		mes "���ӂ��K�v���B";
		close2;
		cutin "start_020_jp.bmp",4;
		end;
	}
	switch(CHANGE_NJ) {
	case 0:
		mes "[" +strcharinfo(0)+ "]";
		mes "���������H";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "�c�c�ށH";
		mes "�i�A�i�j�C�B�b�I";
		mes "�M�l�A���̂܂ɁI";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "�g�������I";
		next;
		mes "�]�j�͂����Ȃ艽���𓊂����Ă����]";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "��I";
		mes "���A���ԂȂ��I";
		mes "�������ł����I";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "�ʁc�c�H";
		mes "�ǂ���牴���E���ɗ���";
		mes "�h�q�ł͂Ȃ��悤���ȁB";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���ł�������I";
		mes "���Ⴂ�ōU�����ꂿ��";
		mes "���܂������񂶂Ⴀ��܂����I";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "�����I";
		mes "���̉i���̃��C�o���A";
		mes "��r�̓z�߁I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c�c�c�c�c";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "�������������I";
		mes "�n�b�I�@�T�C���I";
		mes "�^�����@�[�I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�]���������Ă��Ȃ��悤���]";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "�ށc�c�H";
		mes "�ʂ��I";
		mes "�M�l�A�܂������̂��I";
		mes "�e�C�b�I�@�n�b�n�b�I�@���I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�������I";
		mes "������߂Ă��������I";
		mes "����ɁA���̋Z�́c�c";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "�ʂʂʂʂʁc�c";
		mes "�Ȃ��Ȃ����ȁB";
		mes "�䂪�p��S�Ă悯��Ƃ́c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�]���Ȃ񂾂��̐l�c�c�]";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "�ށc�c�������B";
		mes "���������΋M�l�A";
		mes "���ɉ����p�ł�����̂��H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c�c�c�c�c";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���c�c���c�c";
		mes "�͂��B";
		mes "�E�҂ɓ]�E��������";
		mes "�����ɗ��܂����B";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "�قق��c�c";
		mes "�悢�S�����ł͂Ȃ����B";
		mes "�����I�@�������I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c�c�c";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "�M�l�͂܂��E�҂ɂȂ��B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c�Ȃ��ł����H";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "���͋M�l�̎�������m���B";
		mes "������M�p�ł���B";
		mes "����ɁA���̖ڂɂ���";
		mes "�E�҂Ƃ��Đ�����ɂ�";
		mes "�M�l�͌o���s�����I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c�c�c�c�c";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "�c�c�����c�c";
		mes "�E�҂ɂȂ�񂱂Ƃ��Ȃ��B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c�c�c�c�c";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "���Ă̒ʂ�A����";
		mes "�ƂĂ��Z�����g���B";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "����ɁA���̎���ɂ�";
		mes "�G�������B";
		mes "�����ȒP�ɂ͓�����B";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "�����āA���͓z�Ƃ̌����̂��߂�";
		mes "�C����ς܂Ȃ���΂Ȃ�Ȃ��B";
		mes "�^�@�����@�[�I";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "���͕K�����I";
		mes "�҂��Ă��A��r�I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "��r�H";
		mes "�r�Ɛ키��ł����H";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "���H";
		mes "�����A�n�b�n�b�n�b�n�B";
		mes "��r�̓j�b�N�l�[�����B";
		mes "����͐l�Ԃ���B";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "�����ڂ������z���B";
		mes "�����߂ɂ͎�i��";
		mes "�I�΂Ȃ��B";
		mes "�������A�z���g��";
		mes "�E�p�͖��ɋ����B";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "�����A�z������";
		mes "���傤�ǎ藠���ƃN�i�C��";
		mes "�؂�Ă��ĂȁB";
		mes "�܂Ƃ��ɐ킦�Ȃ���Ԃ��B";
		mes "�n�n�n�B";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "���������΋M�l�B";
		mes "�{���ɔE�҂ɂȂ肽���̂Ȃ�";
		mes "�C���������Ă�낤�B";
		mes "�����C��������������";
		mes "�����E�҂̋Z�p�������Ă��B";
		mes "�ǂ����H";
		next;
		if(select("��������","�f��")==2) {
			mes "[" +strcharinfo(0)+ "]";
			mes "�Z�p����������w��ł�";
			mes "���傤���Ȃ��ł��B";
			mes "���݂܂��񂪁A";
			mes "���̐l�ɗ���ł��������B";
			next;
			mes "[�N�E�K�E�J�C]";
			mes "�ʁc�c�������B";
			mes "�킩�����B";
			mes "���̖��ʍ��������悤���ȁB";
			mes "�����A�p���Ȃ��Ȃ�";
			mes "�����o�čs���񂾁B";
			close;
		}
		mes "[" +strcharinfo(0)+ "]";
		mes "���[��c�c";
		mes "�킩��܂����B";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "�������B";
		mes "�ł́A���̎莆��";
		mes "��r�Ƃ����z��";
		mes "�͂��Ă���񂾁B";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "���e���܂��Ɍ����ƁA";
		mes "���݂��ɗp�ӂ������܂ŁA";
		mes "�ꎞ�x�킵�悤�Ƃ������̂��B";
		mes "�K���Ԏ���������ė���悤�ɁB";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "���̏��ɂ��ƁA";
		mes "�z�̓A�C���u���b�N��";
		mes "�s�����炵���B";
		mes "���̂����ɍs�����̂���";
		mes "�킩��񂪁c�c";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "�z�͕ϑ�����肢�B";
		mes "�T���o���͍̂���낤�B";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "�����A��S�����肪����B";
		mes "�z�͍��������D���Ȃ񂾁B";
		mes "�����������ꏊ��";
		mes "�悭�T���Ă݂�Ƃ������낤�B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�����ł��B";
		mes "�ł́A�s���Ă��܂��I";
		set CHANGE_NJ,1;
		setquest 6015;
		close;
	case 1:
		mes "[�N�E�K�E�J�C]";
		mes "�ʁc�c";
		mes "�����}�ȔC���ł͂Ȃ����A";
		mes "�M�l�ɂƂ��Ă�";
		mes "�}�����ق����������낤�B";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "��r�����܂�";
		mes "�A�C���u���b�N�ɂ��邩��";
		mes "�킩��Ȃ�����ȁB";
		close;
	case 2:
		mes "[�N�E�K�E�J�C]";
		mes "�Ԏ���Y�ꂸ��";
		mes "�󂯎���Ă���񂾂��B";
		close;
	case 3:
		mes "[�N�E�K�E�J�C]";
		mes "�Ԏ��͂�����Ă������H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�͂��A�����ɁB";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "�悵�A���������ǂނƂ��悤�B";
		mes "�]�S�\�S�\�c�c�]";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�]���������Ă����莆��";
		mes "�ǂ�ł���]";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "�ȁA�Ȃ񂾂ƁI";
		mes "�x��͂��Ȃ�����!?";
		mes "�܂����c�c";
		mes "�����N�i�C��������̂��I";
		mes "�����c�c�������Ă͂�����B";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "������������C�����B";
		mes "�z�Ƃ̌����ɕK�v��";
		mes "��������Ȃ���΂Ȃ�Ȃ��B";
		mes "�ޗ����s�����Ă���񂾁B";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "�����ޗ����W�߂Ă�����A";
		mes "�M�l�̔\�͂�F�߂�";
		mes "�E�҂ɂ��Ă��I";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "�W�߂Ă���ޗ��́A";
		mes "�v���R��1�A�S�z��30�B";
		mes "���Ԃ���������";
		mes "�}���ł���B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c���b�I";
		mes "������āI";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "�ǂ������H";
		mes "���̖��ł�����̂��H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���̍ޗ��́A";
		mes "�����q���E����ɓn���āc�c";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "�Ȃɂ�!?";
		mes "�ł́A�M�l�͂����̎�`����";
		mes "�����Ƃ����̂��I";
		mes "���A������������";
		mes "���̂�������ҁI";
		mes "���فI�@�܂ʂ��I";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "�c�c����c�c";
		mes "����͂����L�b�J�P���c�c";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "�Ƃɂ����A�z����`�����ȏ�A";
		mes "���O�ɂ͐�΂ɉ��̎�`����";
		mes "���Ă��炤����ȁI";
		mes "�����A�͂₭�s���񂾁I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���c�c���c�c�͂��I";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�]�v���R��1�ƓS�z��30��";
		mes "�T���Ă��悤�]";
		set CHANGE_NJ,4;
		chgquest 6017,6018;
		close;
	case 4:
		if(countitem(1010) < 1 || countitem(1002) < 30) {
			mes "[�N�E�K�E�J�C]";
			mes "�v���R��1�ƓS�z��30��";
			mes "�����Ă���悤�ɁB";
			mes "�}���ł���B";
			close;
		}
		if(getskilllv(1) < 9) {
			mes "[�N�E�K�E�J�C]";
			mes "��{�ƂȂ�X�L����";
			mes "�S�Ċo���Ă����B";
			mes "^0000FF�u��{�X�L���v�̃��x����9�@^000000��";
			mes "����K�v������̂��B";
			next;
			mes "[�N�E�K�E�J�C]";
			mes "^0000FF�u��{�X�L���v^000000�̃��x����";
			mes "^0000FF�u�X�L�����X�g�v^000000�E�B���h�E��";
			mes "�グ�邱�Ƃ��ł��邼�B";
			mes "^0000FF�u�X�L�����X�g�v^000000�E�B���h�E��";
			mes "^0000FF�u��{���v^000000�E�B���h�E����";
			mes "^0000FF�uSkill�v^000000�{�^���ŕ\�������B";
			next;
			mes "[�N�E�K�E�J�C]";
			mes "�X�L���̃��x�����グ��ɂ́A";
			mes "�X�L���|�C���g������U������A";
			mes "^FF0000�u�m��v^000000�{�^�����K�v�ƂȂ�B";
			mes "���ӂ��K�v���B";
			close2;
			cutin "start_020_jp.bmp",4;
			end;
		}
		mes "[�N�E�K�E�J�C]";
		mes "��ɓ���Ă������I";
		mes "�ӊO�Ƒ��������ȁB";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "�c�c�悵�B";
		mes "�ǂ���猈���ɂ͊Ԃɍ����������B";
		mes "�v�������M�l�͗L�\���ȁB";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "�ǂ����낤�B";
		mes "�񑩒ʂ�A�M�l�𐳎���";
		mes "�E�҂֓]�E�����Ă��B";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "�܂��́A�����ɖ���낤�B";
		mes "���̖��̓J�C�B";
		mes "�����E�ƂȂ��������́A";
		mes "�J�Y�}�l��T���{����������";
		mes "�C��^�����Ă���B";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "���͍��A���E�҂�";
		mes "��������͕��G�ɂȂ��Ă���B";
		mes "���̂��߁A�V�l�̋M�l�́A";
		mes "�ǂ̕����ɂ��z������Ȃ��B";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "�����A��r�̎莆�ɂ́A";
		mes "�M�l�������]�����Ă��镶������B";
		mes "������̔C�����悭���Ȃ����Ǝv���B";
		mes "���͋M�l�Ɋ��҂��Ă���̂��B";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "�E�҂͌ǓƂȐE�Ƃ��B";
		mes "�C������ԂƏd�v�����邪�A";
		mes "�����Ċ���������Ă͂����Ȃ��B";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "����Ȃ��O�ɁA";
		mes "���ꂩ��͑����̍���P�����낤�B";
		mes "�����A���E�҂͑����̎҂�";
		mes "�����̐��̂��B���čs�����Ă���B";
		mes "�l�ɗ����Ă͂Ȃ�Ȃ��B";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "�����āA�E�҂̕����";
		mes "���Ɋ댯���B";
		mes "�����͋C��t����悤�ɁB";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "�ł́A�M�l�𐳎���";
		mes "���E�҂̈���ƔF�߂�B";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "���̂悤�ɑ����I";
		mes "���̂悤�ɕ����I";
		mes "���̐g�͌y���A���Ă���I";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "�g�D�A�b�I";
		next;
		getitem 13010,1;
		delitem 1010,1;
		delitem 1002,30;
		unequip;
		jobchange Job_Ninja;
		set CHANGE_NJ,0;
		chgquest 6018,50495;
		getitem 11046,1;
		mes "[�N�E�K�E�J�C]";
		mes "�����āA������󂯎�邪�����B";
		mes "���C���Ƃ������ƔE�҂̏����B";
		mes "�E�҂̏���";
		mes "�E�҂̏C�s���@�ɂ���";
		mes "�����ꂽ�w�쏑���B";
		mes "�����ǂ�ŏC�s����̂��B";
		close;
	}
OnInit:
	waitingroom "�]�E",0;
	end;
}

//==========================================
// �]�E����
//------------------------------------------
einbroch.gat,184,194,3	script	�N	881,{
	if(Job == Job_Ninja || Job == Job_Kagerou || Job == Job_Oboro) {
		mes "[�q���E]";
		mes "�E�҂ɂȂ�܂����ˁB";
		mes "���ꂩ��A�����̍��";
		mes "���Ȃ��ɏP���|����܂��B";
		mes "�C����ӂ�Ȃ��ł��������B";
		close;
	}
	switch(CHANGE_NJ) {
	case 0:
		mes "[�N]";
		mes "�킟�c�c";
		mes "�����͂ƂĂ������ł��ˁB";
		mes "�F��ȍ������Ă��܂������A";
		mes "����Ȃɍ������͏��߂Ăł��B";
		next;
		mes "[�N]";
		mes "�ł��A����Ȃɍ����Ă��A";
		mes "�����i�F�͔��������R";
		mes "����Ȃ��Ƃ����̂�";
		mes "�{���Ɏc�O�ł��B";
		close;
	case 1:
		mes "[�N]";
		mes "�ӂ��`�����͖{���ɍ����ł��ˁB";
		mes "���͐F�X�ȍ��𗷍s���ė��܂������A";
		mes "����Ȃɍ��������͏��߂Ăł��B";
		mes "�c�c�ł��A��������";
		mes "���̌̋��̕����_���g�c�ł��B";
		next;
		mes "[�N]";
		mes "�����Z�񂾏��́A";
		mes "�Â��ŁA��C�����ꂢ�ŁA";
		mes "�C���ƂĂ����������ł��B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���������āA�A�}�c�H";
		next;
		mes "[�N]";
		mes "�c�c�����B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "����H";
		mes "�c�c���Ⴀ�c�c";
		mes "�C�Y���[�h�ł����H";
		next;
		mes "[�N]";
		mes "�����ł��B";
		mes "���̓C�Y���[�h�o�g�ł��B";
		next;
		mes "[�N]";
		mes "������������āA";
		mes "�z���������������Ƃ���";
		mes "���̍��ɗ�����ł��B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�����Ȃ�ł����c�c";
		mes "���A��r�Ƃ����l��";
		mes "�m��܂��񂩁H";
		mes "�A�}�c���痈���E�҂ŁA";
		mes "�T���Ă����ł��B";
		next;
		mes "[�N]";
		mes "�����A����Ȗ��O�͏����ł��B";
		mes "�ł��A�ǂ����Ă�";
		mes "���̐l�ɉ��Ȃ���΂Ȃ�Ȃ�";
		mes "���R������݂����ł��ˁB";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�͂��B";
		mes "���̐l�ɂ��̎莆��n���āA";
		mes "�Ԏ����󂯎���Ă���B";
		mes "���ꂪ�A�����E�҂�";
		mes "�Ȃ������ɂȂ��ł��B";
		next;
		mes "[�N]";
		mes "���[��c�c";
		mes "�c�c���������΁c�c";
		mes "���s�q�݂����ȕ����������l��";
		mes "�����Ō����C�����܂��B";
		next;
		mes "[�N]";
		mes "�悩�����炨��`�����܂��傤���H";
		mes "�����A���������ɂ͎d����";
		mes "���Ă���̂ŁA�܂���";
		mes "�����炪�挈�ł����B";
		next;
		mes "[�N]";
		mes "�������̎d����";
		mes "��`���Ă��ꂽ��A";
		mes "���Ȃ��̐l�T����";
		mes "����`�����܂����H";
		next;
		if(select("�����A��l�ŒT���Ă݂܂�","�͂��A����`�������Ă�������")==1) {
			mes "[�N]";
			mes "�����ł����B";
			mes "����΂��Ă��������B";
			mes "�����A���̏������K�v�ɂȂ�����";
			mes "���ł����������Ă��������B";
			close;
		}
		mes "[�N]";
		mes "���肪�Ƃ��������܂��B";
		mes "�ł́A�܂����̎d������";
		mes "���肢���܂��B";
		next;
		mes "[�N]";
		mes "���͂���z����T����";
		mes "�����ɗ��܂����B";
		mes "�S�z��30�A�v���R��1�B";
		mes "����炪�������";
		mes "���肪�����ł��B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�]�v���R��1��";
		mes "�S�z��30��T���Ă��悤�]";
		set CHANGE_NJ,2;
		chgquest 6015,6016;
		close;
	case 2:
		if(countitem(1010) < 1 || countitem(1002) < 30) {
			mes "[�N]";
			mes "�v���R��1�ƓS�z��30�ł��B";
			mes "�}���ł��܂��񂩂�A";
			mes "���m�Ȑ��������Ă��Ă��������B";
			close;
		}
		mes "[�N]";
		mes "�����Ă��Ă��������܂������B";
		mes "���肪�Ƃ��������܂��B";
		mes "���x�͎������Ȃ���";
		mes "����`��������Ԃł��ˁB";
		next;
		mes "[�N]";
		mes "�ł́A���̎莆�����ɂ��������B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�H";
		next;
		mes "[�N]";
		mes "�ǂ����܂����H";
		mes "�J�C����n���悤��";
		mes "�����Ă���̂ł��傤�H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c���I";
		mes "���������āA���Ȃ���";
		mes "��r����!?";
		next;
		mes "[�N]";
		mes "�c�c�����B";
		mes "���͖�r�ł͂Ȃ��A�q���E�B";
		mes "��r�Ƃ́A�J�C�������";
		mes "�Ă�ł��邾���ł��B";
		mes "�n�n�n�B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c�c�c�c�c";
		next;
		mes "[�q���E]";
		mes "�_���ł���B";
		mes "�E�҂ɂȂ肽���Ȃ�A";
		mes "�ڂɌ����邱�Ƃ�����";
		mes "�M���Ă��Ă͂����܂���B";
		next;
		mes "[�q���E]";
		mes "�{�ɍڂ��Ă���悤�ȕ��������Ă���";
		mes "�E�҂͂����������܂���B";
		next;
		mes "[�q���E]";
		mes "�Y��Ȃ��ł��������B";
		mes "�E�҂͎����̐��̂�";
		mes "����ɒm��ꂽ�u�ԁA";
		mes "�����̖��������Ă��܂���ł��B";
		next;
		mes "[�q���E]";
		mes "���̎��̎p��̋��A";
		mes "�����Ă��������O�B";
		mes "���̑S�Ă�";
		mes "�R�����m��Ȃ��̂ł��B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c�͂��B";
		mes "�c�c�c�c�c�c";
		next;
		mes "[�q���E]";
		mes "�킩�����悤�ł��ˁB";
		mes "�ł́A�莆�𒸂��܂��傤���H";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "���A�͂��B";
		mes "����ł��B";
		next;
		mes "[�q���E]";
		mes "�ǂ�ǂ�c�c";
		mes "�c�c�J�C�̂�B";
		mes "����󂩂Ǝv������";
		mes "���킪�Ȃ�����";
		mes "�ꎞ�x�킵�悤����";
		mes "�����Ă���܂��B";
		next;
		mes "[�q���E]";
		mes "�n�n�n�B";
		mes "�c�O�Ȃ���A";
		mes "���̓N�i�C�̍ޗ���";
		mes "�S�ďW�߂Ă���܂���B";
		next;
		mes "[�q���E]";
		mes "�ꉞ�A�Ԏ��������܂��ˁB";
		mes "���̎�`�����ł��邮�炢�Ȃ�A";
		mes "����������Ɗ��o��b���邾����";
		mes "���Ȃ��͗��h��";
		mes "�E�҂ɂȂ��ł��傤�B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�c�c�c�c�c�c";
		next;
		mes "[�q���E]";
		mes "���X���҂����������A";
		mes "���A�Ԏ��������Ă��܂�����c�c";
		mes "�]�T���T���T���T���]";
		next;
		mes "[�q���E]";
		mes "�͂��A�ǂ����B";
		mes "������J�C�ɓn����";
		mes "�����ł���B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�]�莆���󂯎�����]";
		next;
		mes "[�q���E]";
		mes "�ł́A�����ɍs���ĉ������B";
		mes "�E�҂͂����Ȃ鎞��";
		mes "���Ԃ�ɂ��܂Ȃ���΂Ȃ�܂���B";
		next;
		mes "[�q���E]";
		mes "���Ȃ����E�҂ɂȂ��΁A";
		mes "���Ɖ�@���������ł��傤�B";
		mes "���҂��Ă��܂���B";
		next;
		mes "[" +strcharinfo(0)+ "]";
		mes "�͂��c�c";
		mes "�ł́A���͂���Łc�c";
		next;
		mes "[�q���E]";
		mes "���c�c";
		mes "�A�}�c�ɍs���Ȃ�";
		mes "�����Ă����܂���B";
		mes "�ł́A�s���Ă�����Ⴂ�B";
		set CHANGE_NJ,3;
		chgquest 6016,6017;
		delitem 1010,1;
		delitem 1002,30;
		close2;
		warp "amatsu.gat",113,127;
		end;
	case 3:
		mes "[�q���E]";
		mes "��H�@�ǂ����܂������H";
		mes "�܂��J�C�ɉ���Ă��Ȃ��悤�ł��ˁB";
		next;
		mes "[�q���E]";
		mes "���]�݂ł�����A";
		mes "�A�}�c�ɑ����Ă����܂����H";
		next;
		if(select("�����A���\�ł�","�͂��A���肢���܂�")==1) {
			mes "[�q���E]";
			mes "�킩��܂����B";
			mes "�ł́A����΂��Ă��������B";
			close;
		}
		mes "[�q���E]";
		mes "�킩��܂����B";
		mes "�ł́A�s���Ă�����Ⴂ�B";
		close2;
		warp "amatsu.gat",113,127;
		end;
	case 4:
		mes "[�q���E]";
		mes "�J�C�����Ȏ���";
		mes "�����o�����݂����ł��ˁB";
		mes "����΂��Ă��������B";
		close;
	}
}

//==========================================
// �ꖳ����
//------------------------------------------
-	script	�J�V��#ng	83,{
	if(strnpcinfo(2) == "que") {
		mes "[�J�V��]";
		mes "���̓J�V���B";
		mes "�ꖳ���K�v�Ȃ�";
		mes "���ł����Ă��������B";
	}
	else {
		mes "[�J�V��]";
		mes "�ŋ߂�������������";
		mes "�ꖳ�����߂�l��������";
		mes "�ƂĂ��Z�����ł��ˁB";
	}
	next;
	mes "[�J�V��]";
	mes "�����K�v�ł����H";
	mes "�I��ł݂Ă��������B";
	next;
	switch(select("����̋ꖳ�F20��","�ғł̋ꖳ�F10��","�X���̋ꖳ�F10��","�����̋ꖳ�F10��","���y�̋ꖳ�F10��","��΂̋ꖳ�F10��","������")) {
	case 1:	//����̋ꖳ - �s�n�̎藠��20,���F�Ζ�1
		mes "�s�n�̎藠��20�ƍ��F�Ζ�1�ŁA";
		mes "����̋ꖳ20��1���Ƃ���";
		mes "�������Ă��܂��B";
		next;
		mes "[�J�V��]";
		mes "��x��100���܂Ō����ł��܂��B";
		mes "�������~�߂�Ȃ�";
		mes "0����͂��Ă��������B";
		next;
		input '@num;
		if('@num <= 0 || '@num > 100) {
			mes "[�J�V��]";
			mes "�������~�ł��B";
			mes "���x�܂����Ă��������B";
			close;
		}
		if(countitem(13253) < 20*'@num || countitem(6213) < '@num) {
			mes "[�J�V��]";
			mes "��������A�C�e����";
			mes "����Ȃ��݂����ł���H";
			close;
		}
		delitem 13253,20*'@num;
		delitem 6213,'@num;
		getitem 13294,20*'@num;
		mes "[�J�V��]";
		mes "�m�F���܂����B";
		mes "�ł́A�ǂ����B";
		close;
	case 2:	//�ғł̋ꖳ - �藠��20,�e���1
		set '@itemid,13259;
		setarray '@need,13250,7524;
		setarray '@amount,20,1;
		break;
	case 3:	//�X���̋ꖳ - �J�_�̎藠��8,�X�M��2
		set '@itemid,13255;
		setarray '@need,13251,7522;
		setarray '@amount,8,2;
		break;
	case 4:	//�����̋ꖳ - �M���̎藠��4,�����2
		set '@itemid,13257;
		setarray '@need,13252,7523;
		setarray '@amount,4,2;
		break;
	case 5:	//���y�̋ꖳ - �s�n�̎藠��2,�e���1
		set '@itemid,13256;
		setarray '@need,13253,7524;
		setarray '@amount,2,1;
		break;
	case 6:	//��΂̋ꖳ - �h�j�̎藠��1,��ΐ�2
		set '@itemid,13258;
		setarray '@need,13254,7521;
		setarray '@amount,1,2;
		break;
	case 7:
		mes "[�J�V��]";
		mes "�킩��܂����B";
		mes "�܂����ł����Ă��������B";
		close;
	}
	mes "[�J�V��]";
	mes getitemname('@need[0])+'@amount[0]+"��" +getitemname('@need[1])+'@amount[1]+ "�ŁA";
	mes getitemname('@itemid)+ "10��1���Ƃ���";
	mes "�������Ă��܂��B";
	next;
	mes "[�J�V��]";
	mes "��x��500���܂Ō����ł��܂��B";
	mes "�������~�߂�Ȃ�";
	mes "0����͂��Ă��������B";
	next;
	input '@num;
	if('@num <= 0 || '@num > 500) {
		mes "[�J�V��]";
		mes "�������~�ł��B";
		mes "���x�܂����Ă��������B";
		close;
	}
	if(countitem('@need[0]) < '@amount[0]*'@num || countitem('@need[1]) < '@amount[1]*'@num) {
		mes "[�J�V��]";
		mes "��������A�C�e����";
		mes "����Ȃ��݂����ł���H";
		close;
	}
	delitem '@need[0],'@amount[0]*'@num;
	delitem '@need[1],'@amount[1]*'@num;
	getitem '@itemid,10*'@num;
	mes "[�J�V��]";
	mes "�m�F���܂����B";
	mes "�ł́A�ǂ����B";
	close;
}

prontera.gat,178,240,3	duplicate(�J�V��#ng)	�J�V��#prt	83
que_ng.gat,72,29,3		duplicate(�J�V��#ng)	�J�V��#que	83

//==========================================
// �E�ғ�����
//------------------------------------------
-	script	�J�C�o��#ng	847,{
	if(strnpcinfo(2) == "que") {
		mes "[�J�C�o��]";
		mes "���V�͔E�҂̕����";
		mes "��鎖���ł���J�C�o���Ƃ����B";
		mes "�����~�����������邩�H";
	}
	else {
		mes "[�J�C�o��]";
		mes "���V��K�˂Ă���l�������Ă���";
		mes "�ŋ߂����ƃA�}�c���������邱�Ƃ�";
		mes "�����Ȃ����̂���B";
		mes "�����~�����������邩�H";
	}
	next;
	switch(select("����","�\��","���C��[3]","���J","���n","��߂�")) {
	case 1:	//���� - �h���S���̗�400,�I���f�I�R��5,�h���S���̔�30,20��z
		mes "[�J�C�o��]";
		mes "�ӂށA^FF0000����^000000��I�񂾂��B";
		mes "���؂͂��̂قƂ�ǂ�";
		mes "�h���S���̗؂ŏo���Ă���B";
		next;
		mes "[�J�C�o��]";
		mes "�ޗ��̓h���S���̗�400�A";
		mes "�I���f�I�R��5�A";
		mes "�h���S���̗�30�A";
		mes "20��Zeny���K�v����B";
		mes "���V�ɐ�����˗����邩�H";
		set '@itemid,13006;
		setarray '@need,1036,984,7123;
		setarray '@amount,400,5,30;
		set '@zeny,200000;
		break;
	case 2:	//�\�� - �|�S30,�Â���1,2��z
		mes "[�J�C�o��]";
		mes "�ӂށA^FF0000�\��^000000��I�񂾂��B";
		mes "�\��ɂ́A�g���Ύg���ق�";
		mes "�����Ȃ�Ƃ����`��������B";
		next;
		mes "[�J�C�o��]";
		mes "�ޗ���";
		mes "�|�S30�A�Â���1�A";
		mes "2��Zeny���K�v����B";
		mes "���V�ɐ�����˗����邩�H";
		set '@itemid,13007;
		setarray '@need,999,7022;
		setarray '@amount,30,1;
		set '@zeny,20000;
		break;
	case 3:	//���C��[3] - �|�S25,�Â������w5,3��2��z
		mes "[�J�C�o��]";
		mes "�ӂށA^FF0000���C��[3]^000000��I�񂾂��B";
		mes "���C��[3]����邽�߂ɂ�";
		mes "�|�S25�A�Â������w5�A";
		mes "3��2��Zeny���K�v����B";
		mes "���V�ɐ�����˗����邩�H";
		set '@itemid,13011;
		setarray '@need,999,7099;
		setarray '@amount,25,5;
		set '@zeny,32000;
		break;
	case 4:	//���J - �|�S30,�A�N�A�}����10,4��8��z
		mes "[�J�C�o��]";
		mes "�ӂށA^FF0000���J^000000��I�񂾂��B";
		mes "���J�����ɂ�";
		mes "�|�S30�A�A�N�A�}����10�A";
		mes "4��8��Zeny���K�v����B";
		mes "���V�ɐ�����˗����邩�H";
		set '@itemid,13012;
		setarray '@need,999,720;
		setarray '@amount,30,10;
		set '@zeny,48000;
		break;
	case 5:	//���n - �X�P���{�[��500,�^��5,�q�[��Lv3 10,12��z
		mes "[�J�C�o��]";
		mes "�ӂށA^FF0000���n^000000��I�񂾂��B";
		mes "���n�����ɂ�";
		mes "�X�P���{�[��500�A�^��5�A";
		mes "�q�[��Lv3��10�A";
		mes "12��Zeny���K�v����B";
		mes "���V�ɐ�����˗����邩�H";
		set '@itemid,13014;
		setarray '@need,932,722,12001;
		setarray '@amount,500,5,10;
		set '@zeny,120000;
		break;
	case 6:
		mes "[�J�C�o��]";
		mes "���ށB";
		mes "�C����������";
		mes "�܂����邪�悢�B";
		close;
	}
	next;
	if(select("��߂Ă����܂�","�͂��I")==1) {
		mes "[�J�C�o��]";
		mes "���ށc�c";
		mes "�����ȒP�ɂ͏W�߂��Ȃ�";
		mes "�ޗ����Ⴕ�̂��c�c";
		mes "�����ޗ����W�܂�悤�Ȃ�";
		mes "���ł��܂����Ȃ���B";
		close;
	}
	for(set '@i,0; '@i < getarraysize('@need); set '@i,'@i+1) {
		if(countitem('@need['@i]) < '@amount['@i]) {
			mes "[�J�C�o��]";
			mes "���V��" +getitemname('@itemid)+('@itemid ==13011? "[3]": "")+ "�����ɂ�";
			mes "�ޗ�������Ȃ��悤���Ⴜ�B";
			next;
			break;
		}
	}
	if('@i == getarraysize('@need) && Zeny < '@zeny) {
		mes "[�J�C�o��]";
		mes "���[�ށc�c";
		mes "�ޗ��͏\�����Ⴊ�A";
		mes "����������Ȃ��̂��B";
		next;
	}
	if('@i < getarraysize('@need) || Zeny < '@zeny) {
		mes "[�J�C�o��]";
		mes getitemname('@itemid)+('@itemid ==13011? "[3]": "")+ "�̍ޗ��́A";
		switch('@itemid) {
		case 13006:
			mes "^FF0000�h���S���̗�400��^000000�A";
			mes "^FF0000�I���f�I�R��5��^000000�A";
			mes "^FF0000�h���S���̗�30��^000000�A";
			mes "^FF000020��Zeny^000000���K�v����B";
			break;
		case 13007:
			mes "^FF0000�|�S30��^000000�A^FF0000�Â���1��^000000�A";
			mes "^FF00002��Zeny^000000���K�v����B";
			break;
		case 13011:
			mes "^FF0000�|�S25��^000000�A^FF0000�Â������w5��^000000�A";
			mes "^FF00003��2��Zeny^000000���K�v����B";
			break;
		case 13012:
			mes "^FF0000�|�S30��^000000�A^FF0000�A�N�A�}����10��^000000�A";
			mes "^FF00004��8��Zeny^000000���K�v����B";
			break;
		case 13014:
			mes "^FF0000�X�P���{�[��500��^000000�A^FF0000�^��5��^000000�A";
			mes "^FF0000�q�[��Lv3��10��^000000�A";
			mes "^FF000012��Zeny^000000���K�v����B";
			break;
		}
		mes "�����Ɗm�F���Ă���񂶂Ⴜ�B";
		close;
	}
	if(checkweight('@itemid,1) == 0) {
		mes "[�J�C�o��]";
		mes "�ǂ����ו��ł����ς��̂悤���Ⴜ�B";
		mes "�����]�T���������Ă���Ƃ悢�B";
		close;
	}
	for(set '@i,0; '@i < getarraysize('@need); set '@i,'@i+1)
		delitem '@need['@i],'@amount['@i];
	set Zeny,Zeny-'@zeny;
	getitem '@itemid,1;
	mes "[�J�C�o��]";
	mes "���ށB";
	mes "�ޗ��Ƃ�������������̂��B";
	mes "�ł́A" +getitemname('@itemid)+('@itemid ==13011? "[3]": "")+ "��";
	mes "�󂯎�邪�悢�B";
	close;
}

payon.gat,210,44,3	duplicate(�J�C�o��#ng)	�J�C�o��#pay	847
que_ng.gat,72,34,3	duplicate(�J�C�o��#ng)	�J�C�o��#que	847

//==========================================
// �����藠������
//------------------------------------------
-	script	�e�c#ng	709,{
	mes "[�e�c]";
	mes "���̖��̓e�c�B";
	mes "�����藠���������Ă���B";
	next;
	mes "[�e�c]";
	mes "��̃M�����u����";
	mes "�����������Ȃ��Ăȁc�c";
	mes "���߂Ă������퐻����";
	mes "�ĊJ�����񂾁B";
	next;
	mes "[�e�c]";
	mes "���������Ă������֘A�̕����";
	mes "�������E�ꂾ�I";
	mes "���S���Đ�����C���ȁI";
	next;
	switch(select("�����藠���E����","�����藠���E��ԗ�[3]","�����藠���E��ԗ�[4]","�����藠���E���","��߂�")) {
	case 1:	//�����藠���E���� - �|�S50,�n�[�s�[�̉H20,�I���f�I�R��5,9��z
		mes "[�e�c]";
		mes "^FF0000�����藠���E����^000000��I�񂾂��B";
		mes "�����藠���E���������ɂ�";
		mes "�|�S50�A�n�[�s�[�̉H20�A";
		mes "�I���f�I�R��5�A";
		mes "9��Zeny���K�v���B";
		mes "������˗����邩�H";
		set '@itemid,13300;
		setarray '@need,999,7115,984;
		setarray '@amount,50,20,5;
		set '@zeny,90000;
		break;
	case 2:	//�����藠���E��ԗ�[3] - �|�S30,���̕R100,�I���f�I�R��2,4��z
		mes "[�e�c]";
		mes "^FF0000�����藠���E��ԗ�[3]^000000��I�񂾂��B";
		mes "�����藠���E����[3]�����ɂ�";
		mes "�|�S30�A���̕R100�A";
		mes "�I���f�I�R��2�A";
		mes "4��Zeny���K�v���B";
		mes "������˗����邩�H";
		set '@itemid,13301;
		setarray '@need,999,7301,984;
		setarray '@amount,30,100,2;
		set '@zeny,40000;
		break;
	case 3:	//�����藠���E��ԗ�[4] - ���������_�C�������h20,�����藠���E��ԗ�[3],�I���f�I�R��3,4��z
		mes "[�e�c]";
		mes "^FF0000�����藠���E��ԗ�[4]^000000��I�񂾂��B";
		mes "�����藠���E��ԗ�[4]�����ɂ́A";
		mes "���������_�C�������h20�A";
		mes "�����藠���E��ԗ�[3]1�A";
		mes "�I���f�I�R��3�A4��Zeny���K�v���B";
		mes "������˗����邩�H";
		next;
		mes "[�e�c]";
		mes "�����Ă������A";
		mes "�����藠���E��ԗ�[3]�̃J�[�h��";
		mes "���B�l�͖����Ȃ邩��ȁB";
		mes "�T�d�ɍl���āA���߂Ă���B";
		set '@itemid,13302;
		setarray '@need,733,13301,984;
		setarray '@amount,20,1,3;
		set '@zeny,40000;
		break;
	case 4:	//�����藠���E��� - �|�S50,�Ύ�100,�R���Ă���S��100,��ΐ�50,7��8��z
		mes "[�e�c]";
		mes "^FF0000�����藠���E���^000000��I�񂾂��B";
		mes "�����藠���E��΂����ɂ́A";
		mes "�|�S50�A�Ύ�100�A";
		mes "�R���Ă���S��100�A��ΐ�50�A";
		mes "7��8��Zeny���K�v���B";
		mes "������˗����邩�H";
		set '@itemid,13303;
		setarray '@need,999,7098,7097,7521;
		setarray '@amount,50,100,100,50;
		set '@zeny,78000;
		break;
	case 5:
		mes "[�J�C�o��]";
		mes "�c�O���B";
		mes "�����S�������ō���������";
		mes "�����Ă�肽�������񂾂��c�c";
		mes "�C���ς������܂����Ă���B";
		close;
	}
	next;
	if(select("��߂Ă����܂�","�͂��I")==1) {
		mes "[�e�c]";
		mes "���[��c�c";
		mes "�܁A�����ޗ�����Ȃ���ȁB";
		mes "�ł��ޗ�����������";
		mes "���ł����Ă����B";
		close;
	}
	for(set '@i,0; '@i < getarraysize('@need); set '@i,'@i+1) {
		if(countitem('@need['@i]) < '@amount['@i]) {
			mes "[�e�c]";
			mes getitemname('@itemid)+('@itemid ==13301? "[3]": ('@itemid ==13302? "[4]": ""))+ "�����";
			mes "�ޗ�������Ȃ��悤�����B";
			next;
			break;
		}
	}
	if('@i == getarraysize('@need) && Zeny < '@zeny) {
		mes "[�e�c]";
		mes "�ޗ��͏\�������ǁA";
		mes "��������Ȃ����B";
		next;
	}
	if('@i < getarraysize('@need) || Zeny < '@zeny) {
		mes "[�e�c]";
		mes getitemname('@itemid)+('@itemid ==13301? "[3]": ('@itemid ==13302? "[4]": ""))+ "�����ɂ́A";
		switch('@itemid) {
		case 13300:
			mes "^FF0000�|�S50��^000000�A^FF0000�n�[�s�[�̉H20��^000000�A";
			mes "^FF0000�I���f�I�R��5��^000000�A";
			mes "^FF00009��Zeny^000000���K�v���B";
			break;
		case 13301:
			mes "^FF0000�|�S30��^000000�A^FF0000���̕R100��^000000�A";
			mes "^FF0000�I���f�I�R��2��^000000�A";
			mes "^FF00004��Zeny^000000���K�v���B";
			break;
		case 13302:
			mes "^FF0000���������_�C�������h20��^000000�A";
			mes "^FF0000�����藠���E��ԗ�[3]1��^000000�A";
			mes "^FF0000�I���f�I�R��3��^000000�A^FF00004��Zeny^000000���K�v���B";
			break;
		case 13303:
			mes "^FF0000�|�S50��^000000�A^FF0000�Ύ�100��^000000�A";
			mes "^FF0000�R���Ă���S��100��^000000�A^FF0000��ΐ�50��^000000�A";
			mes "^FF00007��8��Zeny^000000���K�v���B";
			break;
		}
		mes "�����Ɗm�F���Ă����B";
		close;
	}
	if(checkweight('@itemid,1) == 0) {
		mes "[�e�c]";
		mes "���O�A���Ă����ɂȂ�����Ȃ����B";
		mes "���������]�T�������Ă���";
		mes "���Ă����B";
		close;
	}
	for(set '@i,0; '@i < getarraysize('@need); set '@i,'@i+1)
		delitem '@need['@i],'@amount['@i];
	set Zeny,Zeny-'@zeny;
	getitem '@itemid,1;
	mes "[�e�c]";
	mes "�悵�A�ޗ�����������ȁB";
	mes "�ق�A���ꂪ" +getitemname('@itemid)+('@itemid ==13301? "[3]": ('@itemid ==13302? "[4]": ""))+ "���B";
	close;
}

geffen.gat,63,70,3	duplicate(�e�c#ng)	�e�c#gef	709
que_ng.gat,22,62,3	duplicate(�e�c#ng)	�e�c#que	709

//==========================================
// ��b[1]����
//------------------------------------------
que_ng.gat,28,50,3	script	�{�V��	709,{
	if(BaseLevel < 20) {
		mes "[�{�V��]";
		mes "���͔E�҂̎�ҒB��";
		mes "�ō��̖h�������Ă����Ă���B";
		next;
		mes "[�{�V��]";
		mes "�����A�N�͎��̍����";
		mes "�h��𑕔�����ɂ́A�܂��܂�";
		mes "���x�����Ⴂ�悤���ˁB";
		close;
	}
	if(countitem(2102) < 1 && ARMGARD_1QUE < 3) {
		mes "[�{�V��]";
		mes "���̓{�V���B";
		mes "3�l����E�҂̖h��E�l��";
		mes "��Ԃƌ����Ă���B";
		next;
		mes "[�{�V��]";
		mes "3�l�ƌ����Ă��A";
		mes "�c���2�l�͍��\���R�I";
		mes "����肢���h�������̂�";
		mes "���̐��ɑ��݂��Ȃ��B";
		next;
		mes "[�{�V��]";
		mes "�Ȃ��Ȃ�A����";
		mes "�����̑S�Ă̊Z���͂��߁A";
		mes "������h��̐��@��";
		mes "�m���Ă��邩�炾�B";
		next;
		mes "[�{�V��]";
		mes "�������A����������Z��";
		mes "�h��͂��������āA";
		mes "���̊Z�𒅂����̓��m�������Ă�";
		mes "���������Ȃ��̂���肾�����B";
		next;
		mes "[�{�V��]";
		mes "�E�҂��h��ɗ���]��A";
		mes "�Z�p��ቺ�����Ȃ����߂ɁA";
		mes "���͖h������̂��~�߂Ă���B";
		mes "���͎�ɁA�h���";
		mes "���W���������Ă���B";
		next;
		mes "[�{�V��]";
		mes "�����A�������ɂ��ƁA";
		mes "���̍L�����E�ɂ͂܂��A";
		mes "���̒m��Ȃ��h�";
		mes "����݂����Ȃ񂾁B";
		mes "�Ȃ񂾂������ȁc�c";
		next;
		mes "[�{�V��]";
		mes "^FF0000�K�[�h[1]^000000���������ȁH";
		mes "�m������Ȃ񂾂����B";
		mes "���Ј�x�A���������Ă݂����B";
		next;
		mes "[�{�V��]";
		mes "�ǂ�������������Z�ɔ�ׂ��";
		mes "�n��ȕ����Ƃ͎v�����c�c";
		next;
		mes "[�{�V��]";
		mes "�������̗��݂𕷂��Ă��ꂽ��A";
		mes "�N�ɓ��ʂȕ�������Ă����悤�B";
		mes "�ǂ����H";
		next;
		if(select("���܂�C���̂�Ȃ��ł�","�����ł���")==1) {
			mes "[�{�V��]";
			mes "����A�c�O���B";
			mes "���̍�����h���ɓ���";
			mes "�܂��ƂȂ��`�����X�Ȃ̂ɂȁB";
			close;
		}
		mes "[�{�V��]";
		mes "���k�������Ă���ȁB";
		mes "���Ⴀ�A^FF0000�K�[�h[1]^000000�ƌĂ΂��";
		mes "�h�����ɓ���Ă��Ă���B";
		set ARMGARD_1QUE,1;
		close;
	}
	if(ARMGARD_1QUE == 1) {
		mes "[�{�V��]";
		mes "���A�����Ă��Ă��ꂽ�̂��H";
		mes "��x�����Ă���c�c";
		mes "�ӂނӂށc�c";
		next;
		mes "[�{�V��]";
		mes "�����I�@���ꂾ�I";
		mes "���ׂĂ̖h��ɃX���b�g��t�����";
		mes "���ǂ����\�������o�������ł���I";
		next;
		mes "[�{�V��]";
		mes "�悵�A��������p����";
		mes "���̖h��ɃX���b�g��";
		mes "�t���悤�B";
		next;
		mes "[�{�V��]";
		mes "�����悩������A";
		mes "��b1�A�K�[�h[1]1�A";
		mes "������1��Zeny��";
		mes "��b[1]������Ă����悤�B";
		mes "�ǂ�����H";
		next;
		if(select("����","�͂�")==1) {
			mes "[�{�V��]";
			mes "���[��A�������B";
			mes "�Ƃɂ����A�������h���";
			mes "�����Ă��ꂽ���Ƃ����ł�";
			mes "���ӂ��Ă����B";
			mes "�킴�킴���肪�Ƃ��B";
			set ARMGARD_1QUE,0;
			close;
		}
		mes "[�{�V��]";
		mes "�킩�����B";
		mes "������x�������A�ޗ���";
		mes "��b1�A�K�[�h[1]1�A";
		mes "������1��Zeny���B";
		mes "�������ł�����܂����Ă���B";
		set ARMGARD_1QUE,2;
		close;
	}
	if(ARMGARD_1QUE == 2) {
		callsub L_Routine;
		close;
	}
	if(ARMGARD_1QUE == 3) {
		mes "[�{�V��]";
		mes "�₟�B";
		mes "�܂���b[1]��";
		mes "�K�v�ɂȂ����̂��H";
		next;
		if(select("����","�͂�")==1) {
			mes "[�{�V��]";
			mes "�������B";
			mes "�K�v�ɂȂ�����";
			mes "�܂����Ă����B";
			close;
		}
		callsub L_Routine;
		close;
	}
	mes "[�{�V��]";
	mes "���A�N�I";
	mes "���������āA�����";
	mes "�K�[�h�Ƃ����h���Ȃ����H";
	mes "������ƌ����Ă���I";
	next;
	mes "[�{�V��]";
	mes "�����I�@���ꂾ�I";
	mes "���ׂĂ̖h��ɃX���b�g��t�����";
	mes "���ǂ����\�������o�������ł���I";
	mes "�Ȃ񂾂���ȊȒP�Ȃ��Ƃ�";
	mes "�C�Â��Ȃ������񂾁I";
	next;
	mes "[�{�V��]";
	mes "���A���̖��̓{�V���B";
	mes "�����ɂ���O�l��";
	mes "�E�җp�h��E�l�̒���";
	mes "��Ԃƌ����Ă���B";
	mes "���͓����̑S�Ă̖h��̐��@��";
	mes "�m���Ă���񂾁B";
	next;
	mes "[�{�V��]";
	mes "�������A����������Z��";
	mes "���܂�ɂ��d�����߁A";
	mes "����𑕔������ғ��m����������";
	mes "���������Ȃ��񂾁B";
	next;
	mes "[�{�V��]";
	mes "���͔E�҂��h��ɗ���A";
	mes "�Z�p�������Ă����̂�h�����߁A";
	mes "�h������̂���߂��B";
	mes "���͖h��̎��W�Ƃ����Ă���B";
	next;
	mes "[�{�V��]";
	mes "�����A�N�������Ă���";
	mes "���̖h������āA";
	mes "���̍��ɉ΂������I";
	next;
	mes "[�{�V��]";
	mes "�����悩������A";
	mes "��b1�A�K�[�h[1]1�A";
	mes "������1��Zeny��";
	mes "��b[1]������Ă����悤�B";
	mes "�ǂ�����H";
	next;
	if(select("�������A���\�ł�","�͂��I�@���肢���܂��I")==1) {
		mes "[�{�V��]";
		mes "�������c�c";
		mes "���[��A�c�O���B";
		mes "�����C���ς������";
		mes "���ł����Ă���B";
		close;
	}
	callsub L_Routine;
	close;
L_Routine:
	if(countitem(2102) < 1 || countitem(2117) < 1) {
		mes "[�{�V��]";
		mes "�ޗ����������";
		mes "����Ȃ��悤���ȁB";
		next;
		mes "[�{�V��]";
		mes "��b[1]�����ɂ�";
		mes "��b1�A�K�[�h[1]1�A";
		mes "������1��Zeny���K�v���B";
		mes "�����Ɗm�F���Ă���";
		mes "�܂����Ă���B";
		close;
	}
	if(Zeny < 10000) {
		mes "[�{�V��]";
		mes "�ޗ��͑���Ă��邪�A";
		mes "���͑���Ȃ��悤���ȁB";
		next;
		mes "[�{�V��]";
		mes "��b[1]�����ɂ�";
		mes "��b1�A�K�[�h[1]1�A";
		mes "������1��Zeny���K�v���B";
		mes "�����Ɗm�F���Ă���";
		mes "�܂����Ă���B";
		close;
	}
	mes "[�{�V��]";
	mes "�ޗ��̏�����";
	mes "�ł��Ă���݂������ȁB";
	mes "�Ō�ɂ�����x�������A";
	mes "��b[1]������Ă������̂��H";
	next;
	if(select("����","�͂�")==1) {
		mes "[�{�V��]";
		mes "�킩�����B";
		mes "�����C���ς������";
		mes "���ł����Ă���B";
		close;
	}
	mes "[�{�V��]";
	mes "�悵�I";
	mes "������Ƒ҂��Ă���B";
	mes "-�J���J���J��-";
	next;
	mes "[�{�V��]";
	mes "�悵�A�ł����I";
	mes "���ꂪ��b[1]���B";
	mes "�܂��~�����Ȃ�����";
	mes "���ł����Ă���B";
	delitem 2102,1;
	delitem 2117,1;
	set Zeny,Zeny-10000;
	set ARMGARD_1QUE,3;
	getitem 2118,1;
	return;
}

//==========================================
// ��b������
//------------------------------------------
que_ng.gat,28,45,3	script	�o�b�V��	86,{
	if(BaseLevel < 50) {
		mes "[�o�b�V��]";
		mes "���͔E�җp�h�������Ă���";
		mes "�o�b�V���ƌ����܂��B";
		next;
		mes "[�o�b�V��]";
		mes "�������A���̐��삵���h���";
		mes "��������ɂ͏���������̂ł��B";
		mes "���������������Ă���A";
		mes "�܂����Ă��������B";
		close;
	}
	if(countitem(2107) < 1 && ARMGARD_2QUE < 3) {
		mes "[�o�b�V��]";
		mes "����3�l�̔E�җp�h��E�l�̈�l�A";
		mes "�o�b�V���Ƃ����܂��B";
		mes "���Ȃ݂ɁA�c��̓�l��";
		mes "���̌Z���񂽂��ł��B";
		next;
		mes "[�o�b�V��]";
		mes "���͌Z���񂽂��̌�������";
		mes "�h��E�l�Ƃ���";
		mes "���܂芈���ł��܂��񂪁A";
		mes "�����̕������̖h���";
		mes "�]�����Ă���Ă��܂��B";
		next;
		mes "[�o�b�V��]";
		mes "���͖h��Ɩ��@�ɂ���";
		mes "�������Ă��܂��B";
		next;
		mes "[�o�b�V��]";
		mes "�����łł����A�C�̔ޕ��̍��ɂ�";
		mes "�~���[�V�[���h�Ƃ����h�";
		mes "����炵���ł��ˁH";
		mes "�������ɓ���邱�Ƃ�";
		mes "�ł��܂��񂩁H";
		next;
		mes "[�o�b�V��]";
		mes "�����~���[�V�[���h��";
		mes "���ׂ邱�Ƃ��ł���΁A";
		mes "�������ƂĂ��i�݂܂��B";
		mes "���̊肢�𕷂��Ă��炦�܂����H";
		next;
		if(select("�f��","�����ł���")==1) {
			mes "[�o�b�V��]";
			mes "��`";
			mes "����ς薳���ȗ��݂ł������B";
			mes "�\���󂠂�܂���B";
			mes "�����~���[�V�[���h����ɓ����āA";
			mes "�����ɂł����������́A";
			mes "���ł����̏��ɂ��Ă��������B";
			close;
		}
		mes "[�o�b�V��]";
		mes "���肪�Ƃ��������܂��B";
		mes "���A�X���b�g�͖������̂�";
		mes "���肢���܂��ˁB";
		mes "����ł͂��҂����Ă��܂��B";
		set ARMGARD_2QUE,1;
		close;
	}
	if(ARMGARD_2QUE == 1) {
		mes "[�o�b�V��]";
		mes "���A��ɓ���Ă�����ł����H";
		mes "��x�����Ă��������c�c";
		mes "�c�c�ӂނӂށc�c";
		next;
		mes "[�o�b�V��]";
		mes "����ς�I";
		mes "���̖h��݂�����";
		mes "���@�ɑ΂���h��͂�";
		mes "�t��������΁I";
		next;
		mes "[�o�b�V��]";
		mes "���肪�Ƃ��������܂��B";
		mes "���Ȃ��������Ă��ꂽ";
		mes "���̃~���[�V�[���h�̂�������";
		mes "�����Ă����n��ӗ~��";
		mes "��������܂����B";
		next;
		mes "[�o�b�V��]";
		mes "�����悩������";
		mes "��b1�A�~���[�V�[���h1�B";
		mes "������2��Zeny�Ŏ�b����";
		mes "����č����グ�܂����B";
		mes "�ǂ����܂����H";
		next;
		if(select("�������Ă����܂�","���肢���܂�")==1) {
			mes "[�o�b�V��]";
			mes "���[��A�����ł����B";
			mes "�c�O�ł��B";
			mes "�����C���ς������";
			mes "���ł����Ă��������B";
			set ARMGARD_2QUE,0;
			close;
		}
		mes "[�o�b�V��]";
		mes "�킩��܂����B";
		mes "�����h�L�h�L���܂��c�c";
		next;
		mes "[�o�b�V��]";
		mes "�ł́A�p�ӂ��ł�����";
		mes "�܂����Ă��������B";
		set ARMGARD_2QUE,2;
		close;
	}
	if(ARMGARD_2QUE == 2) {
		callsub L_Routine;
		close;
	}
	if(ARMGARD_2QUE == 3) {
		mes "[�o�b�V��]";
		mes "��������Ⴂ�܂��B";
		mes "��b�����K�v��";
		mes "��������������ł����H";
		next;
		if(select("����","�͂�")==1) {
			mes "[�o�b�V��]";
			mes "���[��A�����ł����B";
			mes "�c�O�ł��B";
			mes "�����C���ς������";
			mes "���ł����Ă��������B";
			close;
		}
		callsub L_Routine;
		close;
	}
	mes "[�o�b�V��]";
	mes "���A������������";
	mes "����̓~���[�V�[���h�Ƃ���";
	mes "�h��Ⴀ��܂��񂩁H";
	next;
	mes "[�o�b�V��]";
	mes "�\���󂠂�܂��񂪁A";
	mes "��x�����Ă��������c�c";
	next;
	mes "[�o�b�V��]";
	mes "����ς�I";
	mes "���̖h��݂�����";
	mes "���@�ɑ΂���h��͂�";
	mes "�t��������΁I";
	next;
	mes "[�o�b�V��]";
	mes "�����c�c";
	mes "����w�A�ǂ����\��";
	mes "�����o�������ł��I";
	mes "�ǂ����Ă���ȊȒP�Ȏ���";
	mes "�C�Â��Ȃ�������ł��傤�I";
	next;
	mes "[�o�b�V��]";
	mes "���́A����3�l��";
	mes "�E�җp�h��E�l�̈�l�A";
	mes "�o�b�V���Ƃ����܂��B";
	mes "���Ȃ݂ɁA�c��̓�l��";
	mes "���̌Z���񂽂��ł��B";
	next;
	mes "[�o�b�V��]";
	mes "���͌Z���񂽂��̌�������";
	mes "�h��E�l�Ƃ���";
	mes "���܂芈���ł��܂��񂪁A";
	mes "�����̕������̖h���";
	mes "�]�����Ă���Ă��܂��B";
	next;
	mes "[�o�b�V��]";
	mes "���͖h��Ɩ��@�ɂ���";
	mes "�������Ă��܂��B";
	next;
	mes "[�o�b�V��]";
	mes "�����ŁA�C�̔ޕ��̍��ɂ���";
	mes "�~���[�V�[���h�Ƃ����h���";
	mes "�A�C�f�A���o�����Ƃ��Ă��܂������A";
	mes "�Ȃ��Ȃ���ɓ���Ȃ���";
	mes "����ʂĂĂ��܂����B";
	next;
	mes "[�o�b�V��]";
	mes "�������A�^�ǂ�";
	mes "���Ȃ��������Ă��ꂽ";
	mes "���̃~���[�V�[���h�̂�������";
	mes "�����Ă����n��ӗ~��";
	mes "��������܂����B";
	next;
	mes "[�o�b�V��]";
	mes "�����悩������";
	mes "��b1�A�~���[�V�[���h1�B";
	mes "������2��Zeny�Ŏ�b����";
	mes "����č����グ�܂����B";
	mes "�ǂ����܂����H";
	next;
	if(select("�������Ă����܂�","���肢���܂�")==1) {
		mes "[�o�b�V��]";
		mes "���[��A�����ł����B";
		mes "�c�O�ł��B";
		mes "�����C���ς������";
		mes "���ł����Ă��������B";
		close;
	}
	callsub L_Routine;
	close;
L_Routine:
	if(countitem(2107) < 1 || countitem(2117) < 1) {
		mes "[�o�b�V��]";
		mes "�ޗ����������";
		mes "����Ȃ��悤�ł��ˁB";
		mes "��b�������Ȃ�A";
		mes "��b1�A�~���[�V�[���h1�B";
		mes "������2��Zeny���K�v�ł��B";
		mes "�m�F��A�܂����Ă��������B";
		close;
	}
	if(Zeny < 20000) {
		mes "[�o�b�V��]";
		mes "�ޗ��͏\���ł����A";
		mes "����������Ȃ��悤�ł��B";
		mes "��b�������Ȃ�A";
		mes "��b1�A�~���[�V�[���h1�B";
		mes "������2��Zeny���K�v�ł��B";
		mes "�m�F��A�܂����Ă��������B";
		close;
	}
	mes "[�o�b�V��]";
	mes "�ޗ��͂���";
	mes "������Ă�݂����ł��ˁB";
	mes "�ł́A�Ō�ɂ�����x�����܂��B";
	next;
	mes "[�o�b�V��]";
	mes "��b���͖��@�ɑ΂���";
	mes "�h��͂��オ�����ɁA";
	mes "�����I�Ȗh��͂͑���";
	mes "�����Ă��܂��܂��B";
	next;
	mes "[�o�b�V��]";
	mes "����ł��A�����ė����ޗ���";
	mes "��b�������܂����H";
	next;
	if(select("������","�͂�")==1) {
		mes "[�o�b�V��]";
		mes "�킩��܂����B";
		mes "�ł́A�l�����ς������";
		mes "�܂����Ă��������B";
		close;
	}
	mes "[�o�b�V��]";
	mes "�͂��A�ł�";
	mes "�n�߂܂��傤���B";
	mes "-�g���g���g��-";
	mes "-�J���J���J���J��-";
	next;
	mes "[�o�b�V��]";
	mes "�ǂ����A���ꂪ��b���ł��B";
	mes "�܂����ꂪ�K�v�ɂȂ�����";
	mes "���ł����Ă��������B";
	delitem 2107,1;
	delitem 2117,1;
	set Zeny,Zeny-20000;
	set ARMGARD_2QUE,3;
	getitem 2119,1;
	return;
}

//==========================================
// ��b��[1]����
//------------------------------------------
que_ng.gat,27,18,3	script	�g�V��	709,{
	mes "[�g�V��]";
	mes "�����C���ȁH";
	mes "�Ⴋ�F��B";
	mes "���͔E�җp�h���";
	mes "����Ă���3�Z��̈�l�B";
	mes "�g�V���ƌ����B";
	next;
	mes "[�g�V��]";
	mes "�C�̌�������";
	mes "�h��ɃX���b�g��t����";
	mes "�Z�p���w��ł����̂ŁA";
	mes "���͂��̋Z�p���ő����";
	mes "�����������B";
	next;
	mes "[�g�V��]";
	mes "������]����Ȃ�A";
	mes "��b��1�A�o�b�N���[[1]��1�B";
	mes "������4��Zeny�������Ă���΁A";
	mes "��b���ɃX���b�g��";
	mes "�t���Ă����悤�B";
	next;
	mes "[�g�V��]";
	mes "�����A���̋Z�p�͔��ɑ@�ׁB";
	mes "���s����\������������B";
	mes "���̎����悭�l���ė~�����B";
	mes "����ł��X���b�g��t���Ă݂邩�H";
	next;
	if(select("������","�͂�")==1) {
		mes "[�g�V��]";
		mes "�������ȁB";
		mes "�T�d�Ȃق��������B";
		mes "�������S��������";
		mes "�܂�����Ƃ����B";
		close;
	}
	if(countitem(2104) < 1 || countitem(2119) < 1) {
		mes "[�g�V��]";
		mes "�ޗ�������Ȃ��悤���B";
		mes "�ޗ��̓o�b�N���[[1]��1�A";
		mes "��b��1�A������";
		mes "4��Zeny���B";
		mes "���ʂƋ��z�͐��m�ɁB";
		close;
	}
	if(Zeny < 40000) {
		mes "[�g�V��]";
		mes "�ޗ��͏\�������A";
		mes "����������Ȃ��ȁB";
		next;
		mes "[�g�V��]";
		mes "�ޗ��̓o�b�N���[[1]��1�A";
		mes "��b��1�A������";
		mes "4��Zeny���B";
		mes "���ʂƋ��z�͐��m�ɁB";
		close;
	}
	mes "[�g�V��]";
	mes "����B";
	mes "�S�������Ă���B";
	mes "�ł́A����ɓ���B";
	next;
	mes "[�g�V��]";
	mes "������x�������A";
	mes "���s����\��������B";
	mes "����ł����邩�H";
	next;
	if(select("����ς��߂Ă����܂�","����ł����킵�܂�")==1) {
		mes "[�g�V��]";
		mes "�������ȁB";
		mes "�T�d�Ȃق��������B";
		mes "�������S��������";
		mes "�܂�����Ƃ����B";
		close;
	}
	mes "[�g�V��]";
	mes "�悵�A�킩�����B";
	mes "�����҂��Ă���B";
	mes "-�g���g���g�g���g��-";
	mes "-�K�S���K�S��-";
	next;
	delitem 2104,1;
	delitem 2119,1;
	set Zeny,Zeny-40000;
	if(rand(5) < 2) {
		mes "[�g�V��]";
		mes "���c�c";
		mes "���߂��c�c���s�����B";
		mes "�c�c���܂Ȃ��B";
		mes "���l�тƂ����Ă͂Ȃ񂾂��A";
		mes "����ł��H�ׂ�";
		mes "���C���o���Ă���B";
		getitem 12043,1;
		close;
	}
	mes "[�g�V��]";
	mes "�悵�A���������B";
	mes "���s���邩�S�z���������A";
	mes "���v�������ȁB";
	mes "�ł́A�܂��K�v�ɂȂ�����";
	mes "���ł����Ă���B";
	getitem 2120,1;
	close;
}