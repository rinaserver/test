//====================================================================
//Ragnarok Online - Kagerou Oboro Jobchange Script	by refis
//
//�@�� CHANGE_KO -> 0�`11
//====================================================================

que_ng.gat,28,156,0	script	�͂���#ko	139,1,1,{
	if(Job == Job_Ninja && BaseLevel >= 99 && JobLevel >= 70 && CHANGE_KO == 0) {
		mes "�]�ǂ����ŕ��������Ƃ̂���";
		mes "�@�����������Ă���]";
		next;
		mes "[��̐�A]";
		mes "�₠�A�v���Ԃ�ł��ˁB";
		mes "���������𗣂�Ă���";
		mes "�ꑰ�ɉ��������ҒB�̗l�q��";
		mes "�ǂ��ł����H";
		next;
		mes "[��̐�B]";
		mes "���ށB�Ȃ��Ȃ������̂���z�炪";
		mes "���������Ă��ꂽ�B";
		mes "���O�̐l������ڂ�";
		mes "�܂��܂��̂Ă����̂���Ȃ��ȁc�c�B";
		next;
		mes "[��̐�A]";
		mes "�N�ɂ��������Ă��炦��Ƃ�";
		mes "���h�ł��ˁB";
		mes "�����ł�����C�̈����ꏊ�ɔ�΂���";
		mes "�������������Ȃ��Ă��܂������c�c";
		next;
		mes "[��̐�A]";
		mes "�ǂ��ł��A���낻���サ�܂��񂩁H";
		next;
		mes "[��̐�B]";
		mes "�������̂Ă���Ă��Ȃ��悤���ȁB";
		mes "���̕����������ɂȂ��";
		mes "�v���Ă���̂��H";
		next;
		mes "[��̐�A]";
		mes "��k�ł���B";
		mes "�Ƃ���ŁA�V�l�B�̒���";
		mes "^BD0408���̏ꏊ^000000��";
		mes "�������q�͂���̂ł����H";
		next;
		mes "[��̐�B]";
		mes "����A�B���ꂽ�ꏊ��T���̂��܂�";
		mes "�����̂ЂƂc�c";
		next;
		mes "[��̐�A]";
		mes "���ς�炸�Z�ʂ������܂���ˁB";
		mes "����ȏꏊ�A�����̕ǁc�c";
		next;
		mes "[��̐�B]";
		mes "�c�c�܂āA�N���ɕ�����Ă���I";
		mes "���O�͍������C�n�ɕ��A����I";
		next;
		mes "�]�b�������������Ȃ��Ȃ����B";
		mes "�@�B���ꂽ�ꏊ�A�ǁA�����c�c";
		mes "�@�����������̎����낤���H�]";
		setquest 5131;
		set CHANGE_KO,1;
		close;
	}
	end;
}

que_ng.gat,21,76,0	script	�G���������Ă����#ko	844,{
	if(Job == Job_Kagerou || Job == Job_Oboro) {
		mes "�]���������ɂ͗p�͂Ȃ��]";
		close;
	}
	if(CHANGE_KO == 1) {
		mes "�]�B���ꂽ�ꏊ��";
		mes "�@�v����Ƃ�����������]";
		next;
		mes "�]�ȑO���̕����ɗ�������";
		mes "�@�C�Â��Ȃ������͉̂��̂��낤�]";
		next;
		mes "�]�Ƃ������A���ɓ��邽�߂ɂ́c�c�]";
		next;
		if(select("�G������������","�G�Ɏ��������") == 1) {
			mes "�]���l�̂��̂������";
			mes "�@������킯�ɂ͂����Ȃ��]";
			close;
		}
		mes "�]�G�̑O�Ɏ����������";
		mes "�@�����ɋ����Ђ��ς��銴���������]";
		close2;
		warp "job_ko.gat",26,111;
		end;
	}
	if(CHANGE_KO >= 2) {
		mes "�]^25C18D�E�҉��~^000000�̉B�������ւ̓�������]";
		next;
		if(select("����","����Ȃ�") == 2) {
			mes "�]���Ȃ��͕ǂ��痣�ꂽ�]";
			close;
		}
		mes "�]�G�̑O�Ɏ����������";
		mes "�@�����ɋ����Ђ��ς��銴���������]";
		close2;
		warp "job_ko.gat",26,111;
		end;
	}
	mes "�]���ꂢ�ȊG���������Ă���ǂ��]";
	close;
}

job_ko.gat,25,115,4	script	��̘V�l#ko	588,{
	switch(CHANGE_KO) {
	case 1:
		cutin "job_ko03",2;
		mes "�]^1A95E6�V�l���Â����ґz�����Ă���^000000�]";
		next;
		if(select("��������","�b��������") == 1) {
			cutin "job_ko03",255;
			mes "�]���Ȃ��́A�����Ƃ��̏�𗣂ꂽ�]";
			close;
		}
		mes "�]^1A95E6�V�l�ɘb�����������������Ȃ��c�c";
		mes "�@���Ȃ��͗������낤�Ƃ���^000000�]";
		next;
		mes "[��̘V�l]";
		mes "���ɒH������҂����ꂽ���B";
		mes "�ӂށc�c�������l�Ԃ�";
		mes "�Ђ������Ԃ肶��B";
		next;
		menu "�����͂��������c�c�H",-;
		mes "�]^1A95E6�V�l�͂��Ȃ��̂��Ƃ𖳎�����";
		mes "�@�b�𑱂���^000000�]";
		next;
		mes "[��̘V�l]";
		mes "�́A�A�}�c�ɂ͖�����";
		mes "���j�̉e�ɐ�����ꑰ�������c�c";
		next;
		mes "[��̘V�l]";
		mes "�e�̒��ɐ��݂Ȃ����";
		mes "�q�}�����̂悤�Ɂc�c";
		mes "�����A�z�̌������ꏊ��]�񂾈ꑰ�c�c";
		next;
		mes "[��̘V�l]";
		mes "������l�̎�ɒ����𐾂����ꑰ�c�c";
		next;
		mes "[��̘V�l]";
		mes "���������c�c";
		next;
		mes "[��̘V�l]";
		mes "���`�ɂ��ӂ�c�c";
		next;
		mes "[��̘V�l]";
		mes "�����ċ����c�c";
		next;
		menu "���̈ꑰ�͂ǂ��Ȃ�܂������H ",-;
		mes "�]^1A95E6�V�l�͎₵�����Ȗڂ�";
		mes "�@���Ȃ��Ɍ�����^000000�]";
		next;
		mes "[��̘V�l]";
		mes "��Ɏ̂Ă��A";
		mes "���j������̂Ă�ꂽ�ꑰ�� ";
		mes "���́A�m�肽����H ";
		next;
		if(select("�c�c�E�҂�����ł�","�����̍D��S") == 2) {
			mes "[��̘V�l]";
			mes "�c�c�������B";
			mes "���܂񂪁A�A���Ă���B";
			close2;
			warp "amatsu.gat",147,136;
			end;
		}
		cutin "job_ko02",2;
		mes "[��̘V�l]";
		mes "�E�ҁI";
		mes "�������ɁA�ꑰ���E�҂�";
		mes "�Ă΂ꂽ�������������c�c�B";
		next;
		set CHANGE_KO,2;
		chgquest 5131,5132;
		mes "[��̘V�l]";
		mes "���Ȃ��ɐ̂���`���b��b�����B";
		mes "�Y���ꂽ�ꑰ�̘b���c�c�B";
		close2;
		cutin "job_ko03",255;
		end;
	case 2:
		cutin "job_ko01",2;
		mes "�]^1A95E6��̘V�l�͑��ɐ̘b�𕷂�����悤��";
		mes "�@�Â��Ȑ��Ō��n�߂�^000000�]";
		next;
		mes "[��̘V�l]";
		mes "���܂�ɂ������Ԍ���Ȃ���������";
		mes "���̃A�}�c�ɏZ�܂����̂�";
		mes "�N���o���Ă��Ȃ�����낤�B";
		next;
		mes "[��̘V�l]";
		mes "���̉e�ƂȂ��ē���";
		mes "���̂��߂ɐ����邱�Ƃ�I��";
		mes "�ꑰ���������̂���B";
		next;
		mes "[��̘V�l]";
		mes "��̂��߂Ȃ��";
		mes "�ǂ�ȍ���Ȃ��Ƃł��Ȃ��Ƃ���";
		mes "�����Ȃ�ꑰ�c�c�B";
		next;
		mes "[��̘V�l]";
		mes "�E�҂�ł̈ꑰ�Ƃ��Ă΂�Ă�����";
		mes "�����Ĉꑰ���]���";
		mes "�Ă΂�Ă����킯�ł͂Ȃ������B";
		next;
		mes "[��̘V�l]";
		mes "�ނ�͏��̎葫�Ƃ�";
		mes "�����ׂ����݂�������";
		mes "���̔\�͂̍����̂�";
		mes "��肪�������Ă��܂����B";
		next;
		menu "���Ƃ́H",-;
		mes "[��̘V�l]";
		mes "�傽����ł����S�̑���͂߂Ȃ�";
		mes "�O�ꂵ���閧�g�D�B";
		next;
		mes "[��̘V�l]";
		mes "�ꑰ�̑��݂ɋC�Â����҂�����";
		mes "���X�ɒ��ׂ����A";
		mes "���𓾂邱�Ƃ͂ł��Ȃ������B";
		next;
		mes "[��̘V�l]";
		mes "�₪�āA��ł�����ɂ�";
		mes "�������悤�ɂȂ�";
		mes "�������ɉ��������Ă��܂����c�c�B";
		next;
		mes "[��̘V�l]";
		mes "���̑��𗣂�邱�ƂɂȂ��Ă�";
		mes "�ꑰ�͎�𗠐؂邱�Ƃ͂Ȃ������c�c�B";
		next;
		menu "���`�Ɍ����ꑰ�������̂ł���",-;
		cutin "job_ko03",2;
		mes "[��̘V�l]";
		mes "�����A���`�����߂���";
		mes "���炢��������c�c�B";
		next;
		set CHANGE_KO,3;
		chgquest 5132,5133;
		mes "�]^1A95E6�V�l�͂����������т�������";
		mes "�@�\��ɂȂ��Ă��܂����B^000000";
		mes "�@���������A�b�������悤�]";
		close2;
		cutin "job_ko02",255;
		end;
	case 3:
		cutin "job_ko03",2;
		mes "[��̘V�l]";
		mes "�ꑰ�͂��܂�ɂ���������";
		mes "�e�ɉB��Ă��܂��Ă����B";
		mes "���̏��͈ꑰ�̂��Ƃ�";
		mes "�m������Ȃ�����낤�B";
		next;
		menu "�c�c�c�c",-;
		cutin "job_ko01",2;
		mes "[��̘V�l]";
		mes "�킵�͔E�ҁA";
		mes "�܂��͈ł̈ꑰ�ƌĂ΂ꂽ�ꑰ��";
		mes "�Ō�̓�����A�M�I���Ƃ������̂���B";
		next;
		if(select("�����x�݂Ȃ���","����Ȃ�ɂ݂ɒB�������ł�") == 1) {
			cutin "job_ko04",2;
			mes "[������ �M�I��]";
			mes "�c�c���̘V���ڂ�̖���~����";
			mes "�ÎE�҂������̂��H";
			next;
			mes "[������ �M�I��]";
			mes "����ňꑰ�Ɋ֐S���������̂��c�c";
			mes "���Ⴊ�A�ȒP�ɂ���Ă���ɂ�";
			mes "�����ʂȁB";
			next;
			mes "[������ �M�I��]";
			mes "���܂Ŏ�����͂Ȃ����c�c";
			next;
			mes "�]^1A95E6�傫�ȏՌ�����";
			mes "�@�ӎ������̂��Ă䂭�c�c^000000�]";
			close2;
			percentheal -99,0;
			warp "amatsu.gat",147,136;
			end;
		}
		cutin "job_ko02",2;
		mes "[������ �M�I��]";
		mes "�ɂ݁c�c���B";
		mes "�v���Ԃ�Ɏ��ɂ������t����B";
		next;
		mes "[������ �M�I��]";
		mes "���Ȃ��������Ɍ��ꂽ�̂�";
		mes "�����̓�����������ʁc�c�B";
		next;
		mes "[������ �M�I��]";
		mes "���Ⴊ�A���܂Ȃ����Ƃ�";
		mes "�킵���������邱�Ƃ͉����Ȃ��B";
		next;
		mes "[������ �M�I��]";
		mes "���������Ȃ������ނׂ�";
		mes "^33CC71" +(Sex? "�e�T": "�O")+ "�ւ̓�^000000�ɓ�����������B";
		next;
		mes "�]^1A95E6�ӎ������̂�";
		mes "�@�M�I���̐����������畷�����Ă���^000000�]";
		next;
		set CHANGE_KO,4;
		chgquest 5133,5134;
		mes "[������ �M�I��]";
		mes "������ł���킵�Ƌ���";
		mes (Sex? "�e�T": "�O")+ "�ւ̓�����ޏ������ł����Ȃ�";
		mes "�܂���ɗ��邪�悢�B";
		close2;
		warp "amatsu.gat",147,136;
		end;
	case 4:
		cutin "job_ko02",2;
		mes "[������ �M�I��]";
		mes "�ӂށc�c�������Ⴊ";
		mes "^33CC71" +(Sex? "�e�T": "�O")+ "�ւ̓�^000000�ɋ�����Ȃ�";
		mes "���Ȃ��̂ł͂Ȃ����Ǝv�������c�c";
		mes "����ʐS�z�������悤����B";
		next;
		mes "[������ �M�I��]";
		mes "����Ȃ�ɂ݂ɕ��݂������߂ɂ�";
		mes "�U�f�ɕ����Ȃ��������S��";
		mes "���m�̐��E�ɂ����낽���Ȃ�";
		mes "�������_���K�v����B";
		next;
		mes "[������ �M�I��]";
		mes "�ꑰ�̐�c��4��̎����ɂ����";
		mes "���̐��_����ɓ��ꂽ�B";
		next;
		menu "4��̎����H",-;
		cutin "job_ko01",2;
		mes "[������ �M�I��]";
		mes "��������A";
		mes "��c��^087FF8�m���A�����A����A�퓬^000000��";
		mes "4��̎����ɒ���";
		mes "�������S�Ɛ��_��{�����B";
		next;
		mes "[������ �M�I��]";
		mes "�������ǂ�Ȃ��̂�";
		mes "�m�肽���悤����ȁB";
		mes "�������Ă���Ă��悢���B";
		while(1) {
			next;
			switch(select("�m���̎���","�����̎���","����̎���","�퓬�̎���")) {
			case 1:
				mes "[������ �M�I��]";
				mes "���̕⍲���Ƃ߂邽�߂ɂ�";
				mes "�������̒m�����K�v����B";
				mes "���̂��߂̎�������B";
				next;
				mes "[������ �M�I��]";
				mes "10��̖��ɓ���";
				mes "9��ȏ㐳�������";
				mes "���������z������̂���B";
				next;
				mes "[������ �M�I��]";
				mes "���i����m����ςݏd�˂��҂Ȃ�";
				mes "���Ȃ�����낤�B";
				set '@flag,'@flag|1;
				if('@flag == 15)
					break;
				mes "���͂ǂ̎����ɂ��Ęb�������̂��H";
				continue;
			case 2:
				mes "[������ �M�I��]";
				mes "�C������Ɉ��S�Ƃ͌���Ȃ��̂łȁB";
				mes "�����͏d�v�Ȃ̂���B";
				next;
				mes "[������ �M�I��]";
				mes "���̎������c��";
				mes "�X�S���N�ƌĂ�ł������B";
				mes "�T�C�R���ŏo���ڂ̐�����";
				mes "�i�ގ�������B";
				next;
				mes "[������ �M�I��]";
				mes "�܂��A�X�S���N�ƌ��������_��";
				mes "�����ɑz������������낤�B";
				next;
				mes "[������ �M�I��]";
				mes "���Ⴊ�A�����ƌĂ΂�邭�炢����B";
				mes "�P�Ȃ��y�Ƃ͂ЂƖ��Ⴄ���B";
				next;
				mes "[������ �M�I��]";
				mes "���Ȃ���������}�X�������";
				mes "�ז�������}�X�����邶��낤�B";
				next;
				mes "[������ �M�I��]";
				mes "�����Ή������";
				mes "���z�����邶��낤�B";
				set '@flag,'@flag|2;
				if('@flag == 15)
					break;
				mes "���͂ǂ̎����ɂ��Ęb�������̂��H";
				continue;
			case 3:
				mes "[������ �M�I��]";
				mes "�ꑰ�͓Ɠ��̕�����g���Ă����̂���B";
				mes "���̂قƂ�ǂ͎���������";
				mes "��������̂�������B";
				next;
				mes "[������ �M�I��]";
				mes "���������̕�������o�����҂�";
				mes "�j�����ꂵ�҂ƌĂ΂�Ă�����������B";
				next;
				mes "[������ �M�I��]";
				mes "�������g����������";
				mes "���̕�����������邱�Ƃ�";
				mes "���̎����̖ڕW����B";
				next;
				mes "[������ �M�I��]";
				mes "���Ȃ����j�����ꂵ�҂�";
				mes "�Ă΂�邱�Ƃ��F�낤�B";
				set '@flag,'@flag|4;
				if('@flag == 15)
					break;
				mes "���͂ǂ̎����ɂ��Ęb�������̂��H";
				continue;
			case 4:
				mes "[������ �M�I��]";
				mes "�C���͈�l�����ɗ^������Ƃ�";
				mes "����Ȃ��B";
				mes "��̔C�������l���Ő��s���邱�Ƃ�";
				mes "������O�̂悤�ɂ���B";
				next;
				mes "[������ �M�I��]";
				mes "�퓬�̎����͒m���A�����A����̎�����";
				mes "�S�ď��z�����҂���������ł���B";
				mes "�܂�Ō�̎����Ƃ������Ƃ���c�c�B";
				next;
				mes "[������ �M�I��]";
				mes "���̎����Ƃ͈Ⴂ";
				mes "���l�Ƌ������Ƃ��v�������c�c�B";
				next;
				mes "[������ �M�I��]";
				mes "�ڕW�͂����ЂƂI";
				mes "�ł������ڕW��|������l������";
				mes "���������z������킯����B";
				next;
				mes "[������ �M�I��]";
				mes "�܂��A���Ȃ����������󂯂鎞��";
				mes "�����҂����Ȃ����";
				mes "������܂����Ȃ��̉^����B";
				set '@flag,'@flag|8;
				if('@flag == 15)
					break;
				mes "���͂ǂ̎����ɂ��Ęb�������̂��H";
				continue;
			}
			break;
		}
		next;
		cutin "job_ko02",2;
		mes "[������ �M�I��]";
		mes "�S���͈ꌩ�ɂ������A�Ƃ��������ȁB";
		mes "���ڕ����̂���Ԍ��ʓI����낤�B";
		next;
		set CHANGE_KO,5;
		chgquest 5134,5135;
		mes "[������ �M�I��]";
		mes "�������󂯂鏀�����ł����Ȃ�";
		mes "������x���������邪�悢�B";
		close2;
		cutin "job_ko02",255;
		end;
	case 5:
		cutin "job_ko03",2;
		mes "[������ �M�I��]";
		mes "�{���ɋv���Ԃ肶��c�c";
		mes "���̂悤�ɐS�����̂́B";
		next;
		mes "[������ �M�I��]";
		mes "�V�������ɐi�ݍs����҂̂�������";
		mes "�N�b����Ȃ��������Ă���킢�B";
		next;
		mes "[������ �M�I��]";
		mes "�����ɂ��ẮA���łɐ��������ȁB";
		mes "�ł́A�ꑰ�̂��Ƃ����������悤�B";
		next;
		cutin "job_ko01",2;
		mes "[������ �M�I��]";
		mes "�ꑰ�͓�l�̐�m����";
		mes "�n�܂����̂���c�c�B";
		next;
		mes "[������ �M�I��]";
		mes "���z�ɂ��Ƃ���ꂵ";
		mes "�e�ɐ��ޘT�̂��Ƃ���m";
		mes "�e�T�c�c�B";
		next;
		mes "[������ �M�I��]";
		mes "���ɂ��Ƃ���ꂵ";
		mes "�W�������̂��Ƃ���m";
		mes "�O�c�c�B";
		next;
		mes "[������ �M�I��]";
		mes "���z�ƌ�";
		mes "�ǂ�������E���Ƃ炷���̂���";
		mes "��l�̐�m�͎��ĈقȂ鑶�݂�������B";
		next;
		mes "[������ �M�I��]";
		mes "�݂��ɔ��ڂ��Ă����������������B";
		next;
		mes "[������ �M�I��]";
		mes "���������ꑰ�ɂȂ�܂łɂ�";
		mes "����قǒ����̎��Ԃ�";
		mes "�K�v�Ƃ��Ă��Ȃ������̂���B";
		next;
		menu "�������������������̂ł����H",-;
		cutin "job_ko02",2;
		mes "[������ �M�I��]";
		mes "�ӂ��ӂ��ӂ��B";
		mes "�b��������������������ꂽ�킢�B";
		mes "���������z���Ă�����";
		mes "�����𕷂����悤�B";
		next;
		mes "[������ �M�I��]";
		mes "�n�߂ɑI�Ԏ����͂ǂꂶ��H";
		next;
		switch(select("�m���̎���","�����̎���","����̎���")) {
		case 1:
			mes "[������ �M�I��]";
			mes "^339CCC�m���̎���^000000����n�߂�̂��H";
			mes "�ӂ��ӂ��ӂ��B";
			mes "���Ȃ������̓���I�񂾂��Ƃ�";
			mes "������m�������̊炪";
			mes "�y���݂���́B";
			next;
			menu "����H",-;
			set CHANGE_KO,6;
			setquest 5136;
			mes "[������ �M�I��]";
			mes "�ӂ��ӂ��ӂ��B";
			mes "����Ă���̂��y���݂���B";
			mes "�m���̎����͂���������B";
			close2;
			warp "job_ko.gat",72,128;
			end;
		case 2:
			mes "[������ �M�I��]";
			mes "^339CCC�����̎���^000000����n�߂�̂��H";
			mes "�ǓƂȎ����ƂȂ邩���m��ʂ��c�c�B";
			next;
			set CHANGE_KO,6;
			setquest 5137;
			mes "[������ �M�I��]";
			mes "���Ȃ��Ȃ炢��ʐS�z����낤�B";
			mes "�����̎����͂���������B";
			close2;
			warp "job_ko.gat",62,16;
			end;
		case 3:
			mes "[������ �M�I��]";
			mes "^339CCC����̎���^000000����n�߂�̂��H";
			mes "�ł͎����̑O�Ɂc�c�B";
			next;
			set CHANGE_KO,6;
			setquest 5138;
			getitem 1002,5;
			getitem 1010,1;
			mes "�]�S�z�΂�5��";
			mes "�@�v���R����1�󂯎��܂����]";
			next;
			mes "[������ �M�I��]";
			mes "���ꂪ�K�v�ɂȂ邶��낤�B";
			mes "����̎����͂���������B";
			close2;
			warp "job_ko.gat",121,129;
			end;
		}
	case 6:
		set '@test1,checkquest(5136);
		set '@test2,checkquest(5137);
		set '@test3,checkquest(5138);
		if('@test1) {
			set '@test$,"�m��";
			if('@test1 & 0x1) {
				set '@x,72;
				set '@y,128;
			}
		}
		else if('@test2) {
			set '@test$,"����";
			if('@test2 & 0x1) {
				set '@x,62;
				set '@y,16;
			}
		}
		else if('@test3) {
			set '@test$,"����";
			if('@test3 & 0x1) {
				set '@x,121;
				set '@y,129;
			}
		}
		if('@x && '@y) {
			cutin "job_ko04",2;
			mes "[������ �M�I��]";
			mes "^339CCC" +'@test$+ "�̎���^000000���󂯂Ă���̂��B";
			mes "�Ăю����Ɍ��������ˁH";
			next;
			switch(select("�����̏�֌�����","�X�ɖ߂�܂�")) {
			case 1:
				mes "[������ �M�I��]";
				mes '@test$+ "�̎����͂���������B";
				close2;
				warp "job_ko.gat",'@x,'@y;
				end;
			case 2:
				mes "[������ �M�I��]";
				mes "�X�܂ő��낤�B";
				close2;
				warp "amatsu.gat",147,136;
				end;
			}
		}
		cutin "job_ko01",2;
		mes "[������ �M�I��]";
		mes "^339CCC" +'@test$+ "�̎���^000000�����z���ė������B";
		next;
		mes "[������ �M�I��]";
		mes "2�l�Ƃ������ł���悤��";
		mes "���ʂ�����ꂽ���ȁH";
		next;
		menu "�b�̑������c�c",-;
		cutin "job_ko02",2;
		mes "[������ �M�I��]";
		mes "�����}�����Ȃ��Ă��o���Ă���B";
		mes "�c�c�ǂ��܂Řb���������̂��B";
		mes "�c�c�����A������������ȁB";
		next;
		mes "[������ �M�I��]";
		mes "���z�ɂ��Ƃ���ꂵ";
		mes "�e�ɐ��ޘT�̂��Ƃ���m";
		mes "�e�T�c�c�B";
		next;
		mes "[������ �M�I��]";
		mes "���ɂ��Ƃ���ꂵ";
		mes "�W�������̂��Ƃ���m";
		mes "�O�c�c�B";
		next;
		mes "[������ �M�I��]";
		mes "���Ƃ��Ɠ�l�̒��͗ǂ��Ȃ������B";
		mes "���i���l�������A���ׂĂ�";
		mes "�����΂�������c�c�B";
		next;
		mes "[������ �M�I��]";
		mes "��l���ŏ��ɏo������̂�";
		mes "��ꂶ������c�c�B";
		mes "������G���m�Ƃ��đ��܂݂����̂���B";
		next;
		mes "[������ �M�I��]";
		mes "���̂悤�ȏ󋵂ł�";
		mes "�݂��ɏ��������A";
		mes "���݂��������Ȃ������̂���c�c�B";
		next;
		mes "[������ �M�I��]";
		mes "���Ⴊ�A���ꂪ�푈�Ƃ������̂���B";
		next;
		mes "[������ �M�I��]";
		mes "����܂łׂ͗ŏ΂��Ă������Ԃ�";
		mes "�����͂������Ȃ��c�c�B";
		mes "���������ꏊ����B";
		next;
		mes "[������ �M�I��]";
		mes "�܂��Ă�G���m�B";
		mes "���Ԃ�D�������̂ɑ΂��鑞����";
		mes "�����Ă䂭�΂��肶��c�c�B";
		next;
		mes "[������ �M�I��]";
		mes "������ꂽ�B";
		mes "�����͂����������";
		mes "���z������ɂł��b�����B";
		next;
		mes "[������ �M�I��]";
		mes "��ڂ͂ǂ̎������ˁH ";
		if(!'@test1)
			set '@str1$,"�m���̎���";
		if(!'@test2)
			set '@str2$,"�����̎���";
		if(!'@test3)
			set '@str3$,"����̎���";
		next;
		switch(select('@str1$,'@str2$,'@str3$)) {
		case 1:
			mes "[������ �M�I��]";
			mes "^339CCC�m���̎���^000000���B";
			mes "�ӂ��ӂ��ӂ��B";
			mes "���Ȃ������̓���I�񂾂��Ƃ�";
			mes "������m�������̊炪";
			mes "�y���݂���́B";
			next;
			menu "����H",-;
			set CHANGE_KO,7;
			setquest 5136;
			mes "[������ �M�I��]";
			mes "�ӂ��ӂ��ӂ��B";
			mes "����Ă���̂��y���݂���B";
			mes "�m���̎����͂���������B";
			close2;
			warp "job_ko.gat",72,128;
			end;
		case 2:
			mes "[������ �M�I��]";
			mes "^339CCC�����̎���^000000���B";
			mes "�ǓƂȎ����ƂȂ邩���m��ʂ��c�c�B";
			next;
			set CHANGE_KO,7;
			setquest 5137;
			mes "[������ �M�I��]";
			mes "���Ȃ��Ȃ炢��ʐS�z����낤�B";
			mes "�����̎����͂���������B";
			close2;
			warp "job_ko.gat",62,16;
			end;
		case 3:
			mes "[������ �M�I��]";
			mes "^339CCC����̎���^000000���B";
			mes "�ł͎����̑O�Ɂc�c�B";
			next;
			set CHANGE_KO,7;
			setquest 5138;
			getitem 1002,5;
			getitem 1010,1;
			mes "�]�S�z�΂�5��";
			mes "�@�v���R����1�󂯎��܂����]";
			next;
			mes "[������ �M�I��]";
			mes "���ꂪ�K�v�ɂȂ邶��낤�B";
			mes "����̎����͂���������B";
			close2;
			warp "job_ko.gat",121,129;
			end;
		}
	case 7:
		set '@test1,checkquest(5136);
		set '@test2,checkquest(5137);
		set '@test3,checkquest(5138);
		if('@test1 & 0x1) {
			set '@test$,"�m��";
			set '@x,72;
			set '@y,128;
		}
		else if('@test2 & 0x1) {
			set '@test$,"����";
			set '@x,62;
			set '@y,16;
		}
		else if('@test3 & 0x1) {
			set '@test$,"����";
			set '@x,121;
			set '@y,129;
		}
		if('@x && '@y) {
			cutin "job_ko04",2;
			mes "[������ �M�I��]";
			mes "^339CCC" +'@test$+ "�̎���^000000���󂯂Ă���̂��B";
			mes "�Ăю����Ɍ��������ˁH";
			next;
			switch(select("�����̏�֌�����","�X�ɖ߂�܂�")) {
			case 1:
				mes "[������ �M�I��]";
				mes '@test$+ "�̎����͂���������B";
				close2;
				warp "job_ko.gat",'@x,'@y;
				end;
			case 2:
				mes "[������ �M�I��]";
				mes "�X�܂ő��낤�B";
				close2;
				warp "amatsu.gat",147,136;
				end;
			}
		}
		if('@test1 & 0x8 && '@test2 & 0x8) {
			set '@type,3;
			set '@str$,"�m���A�����̎���";
		}
		else if('@test1 & 0x8 && '@test3 & 0x8) {
			set '@type,2;
			set '@str$,"�m���A����̎���";
		}
		else if('@test2 & 0x8 && '@test3 & 0x8) {
			set '@type,1;
			set '@str$,"�����A����̎���";
		}
		cutin "job_ko04",2;
		mes "[������ �M�I��]";
		mes "^339CCC" +'@str$+ "^000000�����z�������B";
		next;
		mes "[������ �M�I��]";
		mes "����œ�c�c�B";
		mes "�������瓾����̂����������ȁH";
		next;
		cutin "job_ko01",2;
		mes "[������ �M�I��]";
		mes "�ł́A������b�����B";
		next;
		mes "[������ �M�I��]";
		mes "���z�ɂ��Ƃ���ꂵ";
		mes "�e�ɐ��ޘT�̂��Ƃ���m";
		mes "�e�T�c�c�B";
		next;
		mes "[������ �M�I��]";
		mes "���ɂ��Ƃ���ꂵ";
		mes "�W�������̂��Ƃ���m";
		mes "�O�c�c�B";
		next;
		mes "[������ �M�I��]";
		mes "��l�̐�m�����œG�Ƃ���";
		mes "�o������Ƃ���܂ł͘b�����ȁB";
		next;
		mes "[������ �M�I��]";
		mes "�����ɓn��푈���A���ɏI��鎞�������B";
		mes "���a���K�ꂽ�킯���Ⴊ";
		mes "�����c�����҂�����";
		mes "�������ʂĂĂ����c�c�B";
		next;
		mes "[������ �M�I��]";
		mes "��l�̐�m���܂��A�킢���~�߂��B";
		mes "���݂��ɖ���_�����Ƃ��Ȃ��Ȃ�����";
		mes "���̓�l�ɂ������̎��Ԃ��K�v�������B";
		next;
		mes "[������ �M�I��]";
		mes "����ȓ�l�̑O�Ɉ�l�̒j�����ꂽ�B";
		mes "�ڂ������Ƃ͓`�����Ă��Ȃ���";
		mes "��l�̐�m�̒����𓾂��̂�";
		mes "���̒j�������ƌ����Ă���B";
		next;
		menu "���̒j�Ƃ́H",-;
		mes "[������ �M�I��]";
		mes "���̒j�Ɋւ��ē`����Ă��邱�Ƃ�";
		mes "�قƂ�ǂȂ��̂���B";
		mes "������l�̒����𓾂��Ƃ���";
		mes "�L�^�ɂ͎c���Ă���B";
		next;
		mes "[������ �M�I��]";
		mes "�����炭�A���̃A�}�c����";
		mes "��c�ł͂Ȃ�����";
		mes "���V�͍l���Ă���B";
		next;
		mes "[������ �M�I��]";
		mes "�ꑰ�Ɋւ���b��";
		mes "�c�菭�Ȃ��Ȃ��Ă����̂��B";
		mes "�O�ڂ̎��������z�����Ȃ�";
		mes "�܂�������b�����B";
		next;
		switch('@type) {
		case 1:
			mes "[������ �M�I��]";
			mes "^339CCC�m���̎���^000000���B";
			mes "�ӂ��ӂ��ӂ��B";
			mes "���Ȃ������̓���I�񂾂��Ƃ�";
			mes "������m�������̊炪";
			mes "�y���݂���́B";
			next;
			menu "����H",-;
			set CHANGE_KO,8;
			setquest 5136;
			mes "[������ �M�I��]";
			mes "�ӂ��ӂ��ӂ��B";
			mes "����Ă���̂��y���݂���B";
			mes "�m���̎����͂���������B";
			close2;
			warp "job_ko.gat",72,128;
			end;
		case 2:
			mes "[������ �M�I��]";
			mes "^339CCC�����̎���^000000���B";
			mes "�ǓƂȎ����ƂȂ邩���m��ʂ��c�c�B";
			next;
			set CHANGE_KO,8;
			setquest 5137;
			mes "[������ �M�I��]";
			mes "���Ȃ��Ȃ炢��ʐS�z����낤�B";
			mes "�����̎����͂���������B";
			close2;
			warp "job_ko.gat",62,16;
			end;
		case 3:
			mes "[������ �M�I��]";
			mes "^339CCC����̎���^000000���B";
			mes "�ł͎����̑O�Ɂc�c�B";
			next;
			set CHANGE_KO,8;
			setquest 5138;
			getitem 1002,5;
			getitem 1010,1;
			mes "�]�S�z�΂�5��";
			mes "�@�v���R����1�󂯎��܂����]";
			next;
			mes "[������ �M�I��]";
			mes "���ꂪ�K�v�ɂȂ邶��낤�B";
			mes "����̎����͂���������B";
			close2;
			warp "job_ko.gat",121,129;
			end;
		}
	case 8:
		set '@test1,checkquest(5136);
		set '@test2,checkquest(5137);
		set '@test3,checkquest(5138);
		if('@test1 & 0x1) {
			set '@test$,"�m��";
			set '@x,72;
			set '@y,128;
		}
		else if('@test2 & 0x1) {
			set '@test$,"����";
			set '@x,62;
			set '@y,16;
		}
		else if('@test3 & 0x1) {
			set '@test$,"����";
			set '@x,121;
			set '@y,129;
		}
		if('@x && '@y) {
			cutin "job_ko04",2;
			mes "[������ �M�I��]";
			mes "^339CCC" +'@test$+ "�̎���^000000���󂯂Ă���̂��B";
			mes "�Ăю����Ɍ��������ˁH";
			next;
			switch(select("�����̏�֌�����","�X�ɖ߂�܂�")) {
			case 1:
				mes "[������ �M�I��]";
				mes '@test$+ "�̎����͂���������B";
				close2;
				warp "job_ko.gat",'@x,'@y;
				end;
			case 2:
				mes "[������ �M�I��]";
				mes "�X�܂ő��낤�B";
				close2;
				warp "amatsu.gat",147,136;
				end;
			}
		}
		cutin "job_ko01",2;
		mes "[������ �M�I��]";
		mes "�c�鎎�����ЂƂ����ƂȂ������B";
		next;
		mes "[������ �M�I��]";
		mes "���̎����Ƃ͈Ⴂ";
		mes "���l�Ƌ������Ƃ��v�������c�c";
		mes "����Ȏ�������B";
		next;
		menu "���́c�c�b�̑����́H",-;
		cutin "job_ko02",2;
		mes "[������ �M�I��]";
		mes "�ӂ��ӂ��ӂ��A�o���Ă������B";
		mes "�ł͑�����b�����B";
		next;
		mes "[������ �M�I��]";
		mes "���z�ɂ��Ƃ���ꂵ";
		mes "�e�ɐ��ޘT�̂��Ƃ���m";
		mes "�e�T�c�c�B";
		next;
		mes "[������ �M�I��]";
		mes "���ɂ��Ƃ���ꂵ";
		mes "�W�������̂��Ƃ���m";
		mes "�O�c�c�B";
		next;
		mes "[������ �M�I��]";
		mes "���̓�l�̐�m�̒����𓾂��j��";
		mes "�����ς�������i��������";
		mes "�`�����Ă���B";
		next;
		mes "[������ �M�I��]";
		mes "�������͘b��������D�悵";
		mes "��k����D����";
		mes "���D����������";
		mes "�`�����Ă���̂���B";
		next;
		mes "[������ �M�I��]";
		mes "�ӂ��ӂ��c�c";
		mes "�Ȃ�����ȏ����Ȃ��Ƃ�";
		mes "�`�����Ă���̂��킩��ʂ��c�c�B";
		next;
		mes "[������ �M�I��]";
		mes "�j�͓�l�̐�m�̒�����莝���Ƃ�";
		mes "�]�񂾂悤����B";
		mes "�����푈�œ�l�������ȒP�ɂ�";
		mes "�ł��������Ȃ��������������m��ʁB";
		next;
		mes "[������ �M�I��]";
		mes "��l�̐�m��C���őg�܂�����";
		mes "�����ɕ����߂����";
		mes "��l����ɂ�������������B";
		next;
		menu "�������y���񂾂����ł́c�c",-;
		mes "[������ �M�I��]";
		mes "�ӂ��ӂ��ӂ��A���������m���̂��B";
		mes "�܂��A�������œ�l�̐�m��";
		mes "����Č��΂�邱�ƂƂȂ����B";
		next;
		mes "[������ �M�I��]";
		mes "�ꑰ�̎n�܂�A�Ƃ����킯����ȁB";
		next;
		menu "���ꂩ��ǂ��Ȃ�܂������H ",-;
		mes "[������ �M�I��]";
		mes "�ɂ������Ƃɂ��̌�̂��Ƃ�";
		mes "���҂��ɂ���ĈӐ}�I��";
		mes "�`�����Ă��Ȃ��悤�Ȃ̂���B";
		next;
		mes "[������ �M�I��]";
		mes "�ߋ��ɂ��΂��邱�ƂȂ�";
		mes "�����ւƐi��ŗ~������������";
		mes "�ƁA�킵�͍l���Ă���c�c�B";
		next;
		mes "[������ �M�I��]";
		mes "�����A���낻��Ō�̎�����";
		mes "�n�߂悤���́H";
		next;
		set CHANGE_KO,9;
		chgquest 5135,72900;
		mes "[������ �M�I��]";
		mes "���Ă���悤�Ȃ�";
		mes "���΂��x�ނ̂��ǂ����������B";
		mes "�������ł�����";
		mes "����������̂���B";
		close2;
		cutin "job_ko01",255;
		end;
	case 9:
		cutin "job_ko01",2;
		mes "[������ �M�I��]";
		mes "���������x��ł��Ă�";
		mes "�ǂ������̂����B";
		mes "����Ƃ��A�}���̗p�ł�����̂��H";
		next;
		input '@str$;
		cutin "job_ko03",2;
		mes "[������ �M�I��]";
		mes "^B24E59" +'@str$+ "^000000���H";
		next;
		mes "[������ �M�I��]";
		mes "��҂̐S��͗������Â炢�ȁB";
		next;
		mes "[������ �M�I��]";
		mes "�܂��A�����܂ł���Ă������Ȃ��Ȃ�";
		mes "�Ō�̎��������z�����邶��낤�B";
		next;
		cutin "job_ko01",2;
		mes "[������ �M�I��]";
		mes "���āI";
		mes "�퓬�̎����ɂ��Đ������悤�B";
		next;
		mes "[������ �M�I��]";
		mes "�퓬�̎����̖ڕW��";
		mes "^FF0000�ꑰ�̉ߋ�^000000�ƌĂ΂�郂���X�^�[����B";
		next;
		mes "[������ �M�I��]";
		mes "�����̏�ɂ͎��Ă���p�A";
		mes "���Ă��閼�O�̃����X�^�[������B";
		mes "���ӂ��Đ키�̂���B";
		next;
		mes "[������ �M�I��]";
		mes "������������A�����ڕW��_���҂�";
		mes "���邩���m���B";
		mes "�ڕW��|�����҂݂̂�";
		mes "���������z������̂���B";
		next;
		mes "[������ �M�I��]";
		mes "���Ȃ���" +(Sex? "�e�T": "�O")+ "�l��";
		mes "�����삪����񂱂Ƃ��c�c�B";
		next;
		set CHANGE_KO,10;
		chgquest 72900,5146;
		mes "[������ �M�I��]";
		mes "�ł͐퓬�̎����̏�Ɍ������Ƃ��悤�B";
		close2;
		switch(rand(3)){
		case 0: warp "job_ko.gat",142,20; break;
		case 1: warp "job_ko.gat",141,80; break;
		}
		end;
	case 10:
	case 11:
		cutin "job_ko03",2;
		mes "[������ �M�I��]";
		mes "�ނ�?!";
		mes "���Ȃ���^339CCC�퓬�̎���^000000��";
		mes "�󂯂Ă����͂��ł́H ";
		next;
		switch(select("�����̏�ɑ����Ă��炤","�X�ɖ߂�܂�")) {
		case 1:
			mes "[������ �M�I��]";
			mes "�����̏�͂���������B";
			close2;
			warp "job_ko.gat",141,80;
			end;
		case 2:
			mes "[������ �M�I��]";
			mes "�X�܂ő��낤�B";
			close2;
			warp "amatsu.gat",147,136;
			end;
		}
	}
}

job_ko.gat,81,124,4	script	�N�E�K�E�J�C#ko	730,{
	if(checkquest(5136)) {
		if(checkquest(5136) & 0x8) {
			mes "[�N�E�K�E�J�C]";
			mes "�����A�O�ɏo���Ă�낤�B";
			mes "�M�I���l�Ɍ��ʂ�񍐂���悤�ɁB";
			close2;
			warp "job_ko.gat",16,113;
			end;
		}
		if(!checkquest(5139)) {
			mes "[�N�E�K�E�J�C]";
			mes "�v���Ԃ肾�ȁI";
			next;
			menu "���Ȃ��́c�c",-;
			mes "[�N�E�K�E�J�C]";
			mes "�E�҂ւ̓������߂�";
			mes "���̂Ƃ���ւ���ė����̂�";
			mes "������̂��ƂƎv���Ă������c�c�B";
			next;
			mes "[�N�E�K�E�J�C]";
			mes "���łɂ����܂Ő������Ă���Ƃ́I";
			next;
			mes "[�N�E�K�E�J�C]";
			mes "�n�b�n�b�n�b�n�b�I";
			mes "�����񂾒ʂ荪��������ȁB";
			mes "�C�ɓ������I";
			next;
			mes "[�N�E�K�E�J�C]";
			mes "�����ł�^339CCC�m���̎���^000000��";
			mes "�󂯂邱�Ƃ��ł��邼�B";
			next;
			mes "[�N�E�K�E�J�C]";
			mes "���������Ȃ��������łȂ�";
			mes "�m�����g�ɂ��Ă��邾�낤�ȁH";
			next;
			if(select("�������ł�","�������c�c") == 2) {
				setquest 5139;
				mes "[�N�E�K�E�J�C]";
				mes "���������ł͏��z�����ʂ��B";
				mes "�������ł�����";
				mes "�܂��b�������Ă���B";
				close;
			}
			setquest 5139;
		}
		mes "[�N�E�K�E�J�C]";
		mes "�����ɒ��ޏ����͂������H";
		next;
		switch(select("�͂�","������","�O�ɏo����")) {
		case 1:
			break;
		case 2:
			mes "[�N�E�K�E�J�C]";
			mes "�d���Ȃ��ȁB";
			mes "���������҂��Ă�낤�B";
			close;
		case 3:
			mes "[�N�E�K�E�J�C]";
			mes "�Ȃ񂾂ƁH";
			mes "������O�ɂ��Ĉ����Ԃ��Ȃ�";
			mes "���ꓹ�f�I";
			next;
			mes "[�N�E�K�E�J�C]";
			mes "�j�傳��Ă�����͌����ʂƂ��낾��";
			mes "�c�c�܂��A���񂾂��͋������B";
			mes "���S�̏��������āA�܂����邪�����B";
			close2;
			warp "job_ko.gat",16,113;
			end;
		}
		mes "[�N�E�K�E�J�C]";
		mes "�m���̎����̂����͕����Ă��邩�H";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "�����o�����𕷂�";
		mes "�����Ǝv�����̂�I�ׂ΂����B";
		mes "���[�Ȑ��𐔂ł�";
		mes "�����͓˔j�ł��񂼁B";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "�ł͎������͂��߂邼�I";
		next;
		for(set '@i,0; '@i<=47; set '@i,'@i+1)
			set '@list['@i],'@i;
		for(set '@i,1; '@i<=10; set '@i,'@i+1) {
			set '@r,rand(getarraysize('@list));
			set '@test,'@list['@r];
			deletearray '@list['@r],1;
			mes "[�N�E�K�E�J�C]";
			if('@i<10)
				mes "��" +'@i+ "��";
			else
				mes "�ŏI���";
			switch('@test) {
			case 0:
				mes "��M�X�L���̍U���͂����߂邽�߂�";
				mes "�ł��e���̂���X�e�[�^�X�𓚂���B";
				next;
				if(select("Vit","MaxHP","Int","MaxSP")==2)
					set '@m,'@m+1;
				break;
			case 1:
				mes "��M�X�L���̍U���͂����߂邽��";
				mes "�C�ɑ}���J�[�h�Ƃ���";
				mes "���̂����ł����ʓI�ȃJ�[�h��I�ׁB";
				next;
				if(select("�S�[���h�I�V�h�X�J�[�h","�}�[�^�[�J�[�h","�^�i�g�X�̑����J�[�h","�G�h�K�J�[�h")==2)
					set '@m,'@m+1;
				break;
			case 2:
				mes "��M���K�����邽�߂ɕK�v��";
				mes "�����C���̃��x���͂������H";
				next;
				if(select("5","7","6","8")==2)
					set '@m,'@m+1;
				break;
			case 3:
				mes "���X�L���̍ő僌�x���𓚂���B";
				next;
				if(select("5","3","1","4")==1)
					set '@m,'@m+1;
				break;
			case 4:
				mes "�Ή��w�X�L�������x��10�̂Ƃ��A";
				mes "�ő�U���񐔂́H";
				next;
				if(select("7","8","9","10")==3)
					set '@m,'@m+1;
				break;
			case 5:
				mes "�Ή��w�X�L�����g�p���邽�߂ɕK�v��";
				mes "�G�}�𓚂���B";
				next;
				if(select("�X�M��","��ΐ�","�����","�e���")==2)
					set '@m,'@m+1;
				break;
			case 6:
				mes "�e����Lv5�̍ő�ړ������͉��������H";
				next;
				if(select("9��","11��","13��","15��")==1)
					set '@m,'@m+1;
				break;
			case 7:
				mes "�e���g���x��10�̉���񐔂�";
				mes "�������Ԃ����������̂͂ǂꂾ�H";
				next;
				if(select("7��]200�b","5��]220�b","6��]240�b","5��]240�b")==4)
					set '@m,'@m+1;
				break;
			case 8:
				mes "���a��X�L�������x��4�̂Ƃ���";
				mes "�U���͂𓚂���B";
				next;
				if(select("140%","150%","160%","170%")==1)
					set '@m,'@m+1;
				break;
			case 9:
				mes "�ꖳ�����g�p��";
				mes "�Ō��񐔂𓚂���B";
				next;
				if(select("2","3","4","5")==2)
					set '@m,'@m+1;
				break;
			case 10:
				mes "���̒�����A�񕗃��x��4�̂Ƃ�";
				mes "Matk����ю˒�������";
				mes "���������̂�I�ׁB";
				next;
				if(select("Matk400�]8��","Matk500�]7��","Matk500�]8��","Matk400�]7��")==3)
					set '@m,'@m+1;
				break;
			case 11:
				mes "�藠�������̊�{�U�������͉��������H";
				next;
				if(select("7��","8��","9��","10��")==3)
					set '@m,'@m+1;
				break;
			case 12:
				mes "���كX�L�������x��7�̂Ƃ���";
				mes "�������Ԃ𓚂���B";
				next;
				if(select("40�b","45�b","50�b","55�b")==2)
					set '@m,'@m+1;
				break;
			case 13:
				mes "���كX�L���̌��ʂłȂ����̂�";
				mes "���̒�����I�ׁB";
				next;
				if(select("�ړ����x����","�E�H�[�^�[�{�[���g�p�\","�A�N�A�x�l�f�B�N�^�g�p�\","Vit����")==4)
					set '@m,'@m+1;
				break;
			case 14:
				mes "�K�����X�L�����K�����邽�߂ɕK�v��";
				mes "�����C�����x���𓚂���B";
				next;
				if(select("4","6","8","10")==4)
					set '@m,'@m+1;
				break;
			case 15:
				mes "�K���������x��6�̂Ƃ�";
				mes "�X�L���g�p���ɏ������z�𓚂���B";
				next;
				if(select("2000�`8000Zeny","1000�`6000Zeny","3000�`8000Zeny","3000�`6000Zeny")==4)
					set '@m,'@m+1;
				break;
			case 16:
				mes "�K�����X�L�����}�X�^�[���邽�߂�";
				mes "�K�v�ȑ��X�L���|�C���g���𓚂���B";
				next;
				if(select("25","30","35","37")==3)
					set '@m,'@m+1;
				break;
			case 17:
				mes "���Ԃ��X�L�����}�X�^�[�����Ƃ�";
				mes "������܂ōU���ł��邩������B";
				next;
				if(select("5","7","3","1")==3)
					set '@m,'@m+1;
				break;
			case 18:
				mes "���̂��������C���X�L����";
				mes "���x��7�̂Ƃ�";
				mes "�K���ł��Ȃ��X�L����I�ׁB";
				next;
				if(select("�ꖳ����","�����藠������","��M","�K����")==4)
					set '@m,'@m+1;
				break;
			case 19:
				mes "�����C�������x��7�̂Ƃ�";
				mes "�藠�������ɒǉ������";
				mes "�U���͂𓚂���B";
				next;
				if(select("18","21","27","30")==2)
					set '@m,'@m+1;
				break;
			case 20:
				mes "�O�X�L�����x��5���g�p�����Ƃ�";
				mes "�㏸����Str�����Int��";
				mes "���l�𓚂���B";
				next;
				if(select("4","5","6","7")==2)
					set '@m,'@m+1;
				break;
			case 21:
				mes "�����ӂ̑����Ő��������̂́H";
				next;
				if(select("��","��","�n","��")==4)
					set '@m,'@m+1;
				break;
			case 22:
				mes "�����w�̍U���͈͂𓚂���B";
				next;
				if(select("3��3","4��4","5��5","6��6")==3)
					set '@m,'@m+1;
				break;
			case 23:
				mes "�����w���K�����邽�߂ɕK�v��";
				mes "�E�@�C���̃X�L�����x���𓚂���B";
				next;
				if(select("10","9","8","1")==1)
					set '@m,'@m+1;
				break;
			case 24:
				mes "���̂����G�}��K�v�Ƃ��Ȃ�";
				mes "�E�҃X�L���𓚂���B";
				next;
				if(select("�Ή��w","����","�g����","�X������")==3)
					set '@m,'@m+1;
				break;
			case 25:
				mes "���̂����n�����̃����X�^�[��";
				mes "�����Ƃ����ʓI�ȃX�L����I�ׁB";
				next;
				if(select("��","�����w","�X������","���n")==2)
					set '@m,'@m+1;
				break;
			case 26:
				mes "���̂����A�X�L���Ƒ����̑g�ݍ��킹��";
				mes "�������Ȃ����̂�I�ׁB";
				next;
				if(select("�g���؁A��","�X�������A��","�X�M���A�n","�����ӁA��")==3)
					set '@m,'@m+1;
				break;
			case 27:
				mes "�����X�^�[�|���Z���I�ɑ΂���";
				mes "�����Ƃ��傫�ȃ_���[�W��^������";
				mes "�ꖳ�����̒�����I�ׁB";
				next;
				if(select("��΂̋ꖳ","�X���̋ꖳ","�ғł̋ꖳ","�����̋ꖳ")==1)
					set '@m,'@m+1;
				break;
			case 28:
				mes "�I�[�N�E�H���A�[�Ɛ키�ۂ�";
				mes "��Ԍ��ʓI�ȋꖳ��";
				mes "���̒�����I�ׁB";
				next;
				if(select("��΂̋ꖳ","�X���̋ꖳ","�ғł̋ꖳ","�����̋ꖳ")==1)
					set '@m,'@m+1;
				break;
			case 29:
				mes "���J�ɏh��͂Ő��������̂́H ";
				next;
				if(select("�l�Ԍ`�����X�^�[�ɍU����+10%","�l�Ԍ`�����X�^�[��Cri+10","�����`�����X�^�[�ɍU����+10%","�����`�����X�^�[��Cri+10")==2)
					set '@m,'@m+1;
				break;
			case 30:
				mes "���̂����A�����藠���E��΂�";
				mes "�h��͂�I�ׁB";
				next;
				if(select("�t�@�C�A�[�{�[��Lv5,Dex-2","�t�@�C�A�[�{�[��Lv5,Dex-3","�t�@�C�A�[�{�[��Lv3,Dex-2","�t�@�C�A�[�{�[��Lv3,Dex-3")==1)
					set '@m,'@m+1;
				break;
			case 31:
				mes "�X���̋ꖳ10�����Ƃ���";
				mes "�K�v�ȍޗ��𓚂���B";
				next;
				if(select("�J�_�̎藠��4�A�X�M��2��","�J�_�̎藠��8�A�X�M��2��","�J�_�̎藠��2�A�X�M��1��","�J�_�̎藠��1�A�X�M��2��")==2)
					set '@m,'@m+1;
				break;
			case 32:
				mes "���̂����AStr�Ƀ|�C���g��";
				mes "����U�����Ƃ�";
				mes "���ʂ𓾂��Ȃ����̂�I�ׁB";
				next;
				if(select("�ߐڍU���͏㏸","�����\�d�ʏ㏸","���@�U���͏㏸","����U���͏㏸")==3)
					set '@m,'@m+1;
				break;
			case 33:
				mes "���̂����AAgi�Ƀ|�C���g��";
				mes "����U�����Ƃ�";
				mes "���ʂ𓾂��Ȃ����̂�I�ׁB";
				next;
				if(select("�������̏㏸","��𗦂̏㏸","�U�����x�̏㏸","�U����f�B���C�̌���")==1)
					set '@m,'@m+1;
				break;
			case 34:
				mes "���̂����AVit�Ƀ|�C���g��";
				mes "����U�����Ƃ�";
				mes "���ʂ𓾂��Ȃ����̂�I�ׁB";
				next;
				if(select("�����h��͂̏㏸","MaxHP�̑���","���@�h��͂̏㏸","���@�U���͂̏㏸")==4)
					set '@m,'@m+1;
				break;
			case 35:
				mes "���̂����AInt�Ƀ|�C���g��";
				mes "����U�����Ƃ�";
				mes "���ʂ𓾂��Ȃ����̂�I�ׁB";
				next;
				if(select("MaxSP�̏㏸","Matk�̏㏸","SP�񕜗ʂ̏㏸","��̍U���͏㏸")==4)
					set '@m,'@m+1;
				break;
			case 36:
				mes "���̂����ADex�Ƀ|�C���g��";
				mes "����U�����Ƃ�";
				mes "���ʂ𓾂��Ȃ����̂�I�ׁB";
				next;
				if(select("�r�����Ԃ̌���","��𗦂̏㏸","�������̏㏸","�������U���͏㏸")==2)
					set '@m,'@m+1;
				break;
			case 37:
				mes "���̂����ALuk�Ƀ|�C���g��";
				mes "����U�����Ƃ�";
				mes "���ʂ𓾂��Ȃ����̂�I�ׁB";
				next;
				if(select("�������̏㏸","���S��𗦂̏㏸","���@�U���͂̌���","�N���e�B�J���������̏㏸")==1)
					set '@m,'@m+1;
				break;
			case 38:
				mes "���̂����A��^�����X�^�[�ɑ΂���";
				mes "�����U�����s�����Ƃ�";
				mes "�����Ƃ����ʓI�ȕ���p�J�[�h��I�ׁB";
				next;
				if(select("���i�e�B�b�N�J�[�h","�~�m�^�E���X�J�[�h","�X�P�����[�J�[�J�[�h","�f�U�[�g�E���t�J�[�h")==2)
					set '@m,'@m+1;
				break;
			case 39:
				mes "���̂����A���^�����X�^�[�ɑ΂���";
				mes "�����U�����s�����Ƃ�";
				mes "�����Ƃ����ʓI�ȕ���p�J�[�h��I�ׁB";
				next;
				if(select("���i�e�B�b�N�J�[�h","�~�m�^�E���X�J�[�h","�X�P�����[�J�[�J�[�h","�f�U�[�g�E���t�J�[�h")==3)
					set '@m,'@m+1;
				break;
			case 40:
				mes "���̂����A���^�����X�^�[�ɑ΂���";
				mes "�����U�����s�����Ƃ�";
				mes "�����Ƃ����ʓI�ȕ���p�J�[�h��I�ׁB";
				next;
				if(select("���i�e�B�b�N�J�[�h","�~�m�^�E���X�J�[�h","�X�P�����[�J�[�J�[�h","�f�U�[�g�E���t�J�[�h")==4)
					set '@m,'@m+1;
				break;
			case 41:
				mes "�J�C�o�������Ȃ������";
				mes "���̒�����I�ׁB";
				next;
				if(select("����","���J","���n","�����藠���E����")==4)
					set '@m,'@m+1;
				break;
			case 42:
				mes "���̂����A�E�Ґ�p�̃A�C�e����";
				mes "����Ă���鏠�̖��O�ł͂Ȃ�";
				mes "���̂�I�ׁB";
				next;
				if(select("�J�C�o��","�A�C�N�D","�e�c","�g�V��")==2)
					set '@m,'@m+1;
				break;
			case 43:
				mes "�E�҂̍ő�JobLv�͂������H";
				next;
				if(select("70","50","99","100")==1)
					set '@m,'@m+1;
				break;
			case 44:
				mes "�E�҉��~������X�̖��O�𓚂���B";
				next;
				if(select("���e�B�G","�A�}�c","�f���^","�R���h")==2)
					set '@m,'@m+1;
				break;
			case 45:
				mes "�E�ғ]�E�̂Ƃ���";
				mes "�����莆���o���������";
				mes "���O�𓚂���B";
				next;
				if(select("��ǌ�","��ǔL","��r","�R�r")==3)
					set '@m,'@m+1;
				break;
			case 46:
				mes "���߂ĉ��ɉ�����Ƃ�";
				mes "���ׂ̗ɒu���Ă��������̂𓚂���B";
				next;
				if(select("���z�c","�|����","�A�ؔ�","�Δ�")==4)
					set '@m,'@m+1;
				break;
			case 47:
				mes "�E�҂��]�������鎞��";
				mes "��K�v������l����";
				mes "���̒�����I�ׁB";
				next;
				if(select("���@���L���[","�����h�O���X","����","�q���E")==3)
					set '@m,'@m+1;
				break;
			case 48:
				mes "���̂����A�]����S�����Ă���";
				mes "NPC�̖��O�Ő��������̂�I�ׁB";
				next;
				if(select("���@���L���[","�o���L���[","�n���L���[","�N�E�K�E�J�C")==1)
					set '@m,'@m+1;
				break;
			case 49:
				mes "�E��JobLv70�̎���";
				mes "���Z���ꂽDex��Luk�̍��v�l�𓚂���B";
				next;
				if(select("8","10","12","14")==2)
					set '@m,'@m+1;
				break;
			}
		}
		mes "[�N�E�K�E�J�C]";
		mes "����őS��I�����B";
		mes "�̓_����̂ł��΂��҂āB";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "�c�c�c�c�B";
		next;
		if('@m < 9) {
			mes "[�N�E�K�E�J�C]";
			mes "�ӂށc�c";
			mes "���҂��Ă����قǂł͂Ȃ��ȁB";
			next;
			mes "[�N�E�K�E�J�C]";
			mes "����Ȃ�ɂ݂ɐi�ނɂ�";
			mes "�܂��܂����Ƃ������Ƃ��B";
			next;
			mes "[�N�E�K�E�J�C]";
			mes "������x�@���^���Ă��I";
			mes "�o�����Ă����I";
			close;
		}
		mes "[�N�E�K�E�J�C]";
		mes '@m+ "0�_���c�c�B";
		mes "�͂΂����g�ɂ����킯�ł͂Ȃ����B";
		mes "���������ȁB";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "�����A���̒��x�̎�����";
		mes "���z�������炢�ł��ʂڂ��Ȃ�B";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "�܂��܂��M�l�����z����ׂ�";
		mes "�����͎c���Ă��邼�B";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "�M�l�̗͂Ŏ��������z�����邩";
		mes "����点�Ă��炤�B";
		next;
		compquest 5136;
		delquest 5139;
		mes "[�N�E�K�E�J�C]";
		mes "�����A�O�ɏo���Ă�낤�B";
		mes "�M�I���l�Ɍ��ʂ�񍐂���悤�ɁB";
		close2;
		warp "job_ko.gat",16,113;
		end;
	}
}

function	script	jobchenge_ko_func	{
	set '@cost,getarg(0);
	set '@heal,getarg(1);
	setarray '@to_x,63,
				54,46,38,30,22,17,17,17,17,17,
				17,25,33,41,49,57,62,62,62,62,
				62,54,46,38,30,25,25,25,25,33,
				41,49,54,54,54,47,38,33,33,41;
	setarray '@to_y,16,
				16,16,16,16,16,19,27,35,43,51,
				60,60,60,60,60,60,56,48,40,32,
				23,23,23,23,23,28,35,43,52,52,
				52,52,48,40,31,31,31,35,44,44;
	mes "�@�ۗLLP�F" +CHANGE_KO_LP;
	mes "�@�T�C�R����U���" +'@cost+ "^FD0260LP^000000������܂��]";
	next;
	menu "�T�C�R����U��",-;
	set '@rand,rand(1,6);
	emotion 57+'@rand,"";
	mes "�]" +'@rand+ "���o�܂����B";
	mes "�@" +'@rand+ "�}�X�i�݂܂��]";
	close2;
	set CHANGE_KO_LP,CHANGE_KO_LP - '@cost + '@heal;
	if(CHANGE_KO_LP > 100)
		set CHANGE_KO_LP,100;
	set CHANGE_KO_NOW,CHANGE_KO_NOW + '@rand;
	warp "job_ko.gat",'@to_x[CHANGE_KO_NOW],'@to_y[CHANGE_KO_NOW];
	end;
}

job_ko.gat,57,16,4	script	���W#ko_00	858,1,1,{
	mes "�]�X�^�[�g�n�_";
	mes "�@^1A95E6���̕����͏������Č����Ȃ��B";
	mes "�@�����Ƌ߂Â��Ă݂悤^000000�]";
	close;
OnTouch:
	set CHANGE_KO_LP,100;
	set CHANGE_KO_NOW,0;
	if(!checkquest(5140)) {
		mes "�]�����������������Ă���]";
		while(1) {
			next;
			if(select("������ǂ�","�������n�߂�") == 1) {
				mes "�]�����̎����̓X�S���N�`����";
				mes "�@�i�s���܂��B";
				mes "�@�J�n����100�|�C���g��";
				mes "�@^FD0260�����̎����|�C���g(LP)^000000���^�����";
				mes "�@1��T�C�R����U��̂�";
				mes "�@1LP������܂��]";
				next;
				mes "�]�S�[���܂�40�}�X����";
				mes "�@�r���̃R�}��^FD0260LP^000000����������";
				mes "�@�C�x���g���������܂��]";
				next;
				mes "�]^FD0260LP^000000��0�ɂȂ�܂ł�";
				mes "�@�S�[���ɓ��B���Ă��������]";
				next;
				mes "�]�Ȃ��A�S�[�������Ɠ�����";
				mes "�@^FD0260LP^000000��0�ɂȂ����ꍇ��";
				mes "�@�S�[����F�߂܂��]";
				next;
				mes "�]�����̎����̐����͈ȏ�ł��]";
				continue;
			}
			break;
		}
		setquest 5140;
		mes "�]�����̎����|�C���g(LP)��";
		mes "�@100�l�����܂����]";
		next;
		mes "�]�ʒu�F�X�^�[�g�n�_";
		callfunc "jobchenge_ko_func",1,0;
		end;
	}
	mes "�]�X�^�[�g�n�_�ɖ߂��Ă��܂����B";
	mes "�@LP���񕜂��܂����]";
	while(1) {
		next;
		if(select("������ǂ�","�������n�߂�") == 1) {
			mes "�]�����̎����̓X�S���N�`����";
			mes "�@�i�s���܂��B";
			mes "�@�J�n����100�|�C���g��";
			mes "�@^FD0260�����̎����|�C���g(LP)^000000���^�����";
			mes "�@1��T�C�R����U��̂�";
			mes "�@1LP������܂��]";
			next;
			mes "�]�S�[���܂�40�}�X����";
			mes "�@�r���̃R�}��^FD0260LP^000000����������";
			mes "�@�C�x���g���������܂��]";
			next;
			mes "�]^FD0260LP^000000��0�ɂȂ�܂ł�";
			mes "�@�S�[���ɓ��B���Ă��������]";
			next;
			mes "�]�Ȃ��A�S�[�������Ɠ�����";
			mes "�@^FD0260LP^000000��0�ɂȂ����ꍇ��";
			mes "�@�S�[����F�߂܂��]";
			next;
			mes "�]�����̎����̐����͈ȏ�ł��]";
			continue;
		}
		break;
	}
	mes "�]�ʒu�F�X�^�[�g�n�_";
	callfunc "jobchenge_ko_func",1,0;
	end;
}

job_ko.gat,49,16,4	script	���W#ko_01	858,1,1,{
	mes "�]1�ԃ}�X";
	mes "�@^1A95E6���̕����͏������Č����Ȃ��B";
	mes "�@�����Ƌ߂Â��Ă݂悤^000000�]";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "�]^FD0260LP^000000������܂���B";
		mes "�@�X�^�[�g�n�_�ɖ߂�܂��]";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "�]�����������������Ă���]";
	next;
	mes "�]�ŏ�����1���o��Ƃ�";
	mes "�@�^������܂���ˁB";
	mes "�@�����ł�10^FD0260LP^000000���x�������Ƃ�";
	mes "�@9�Ԃ̃}�X�ɐi�ނ��Ƃ��ł��܂��]";
	next;
	if(select("10LP���x������9�Ԃɐi��","�x����Ȃ�")==1) {
		mes "�]10LP�x�����܂����B";
		mes "�@9�Ԃɐi�݂܂��]";
		close2;
		set CHANGE_KO_LP,CHANGE_KO_LP - 10;
		set CHANGE_KO_NOW,9;
		warp "job_ko.gat",17,43;
		end;
	}
	mes "�]�ʒu�F1�ԃ}�X";
	callfunc "jobchenge_ko_func",1,0;
	end;
}

job_ko.gat,41,16,4	script	���W#ko_02	858,1,1,{
	mes "�]2�ԃ}�X";
	mes "�@^1A95E6���̕����͏������Č����Ȃ��B";
	mes "�@�����Ƌ߂Â��Ă݂悤^000000�]";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "�]^FD0260LP^000000������܂���B";
		mes "�@�X�^�[�g�n�_�ɖ߂�܂��]";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "�]�����������������Ă���]";
	next;
	mes "�]�g���b�v���������܂���!!";
	mes "�@�X�^�[�g�n�_�ɖ߂�܂��]";
	close2;
	warp "job_ko.gat",63,16;
	end;
}

job_ko.gat,33,16,4	script	���W#ko_03	858,1,1,{
	mes "�]3�ԃ}�X";
	mes "�@^1A95E6���̕����͏������Č����Ȃ��B";
	mes "�@�����Ƌ߂Â��Ă݂悤^000000�]";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "�]^FD0260LP^000000������܂���B";
		mes "�@�X�^�[�g�n�_�ɖ߂�܂��]";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "�]�����������������Ă���]";
	next;
	mes "�]��c�̎􂢂ɂ��������B";
	mes "�@5^FD0260LP^000000���x������";
	mes "�@��c�̎􂢂��͂炤�K�v������܂��]";
	next;
	menu "5LP���x����",-;
	mes "�]5LP�x������";
	mes "�@�T�C�R����U�邱�Ƃ��ł��܂��]";
	set CHANGE_KO_LP,CHANGE_KO_LP - 5;
	next;
	mes "�]�ʒu�F3�ԃ}�X";
	callfunc "jobchenge_ko_func",1,0;
	end;
}

job_ko.gat,25,16,4	script	���W#ko_04	858,1,1,{
	mes "�]4�ԃ}�X";
	mes "�@^1A95E6���̕����͏������Č����Ȃ��B";
	mes "�@�����Ƌ߂Â��Ă݂悤^000000�]";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "�]^FD0260LP^000000������܂���B";
		mes "�@�X�^�[�g�n�_�ɖ߂�܂��]";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "�]���������N�K�L�������Ă���]";
	next;
	mes "�]^0000FF" +'name$+ "^000000";
	mes "�@�����̎����ɒ��ށ]";
	next;
	mes "�]�����ɒ��ދL�O��";
	mes "�@���O���c���܂����H�]";
	next;
	if(select("5LP�x�����Ė��O���c��","�x����Ȃ�") == 1) {
		mes "�]5LP�x�������]";
		set CHANGE_KO_LP,CHANGE_KO_LP - 5;
		set 'name$,strcharinfo(0);
		next;
		mes "�]" +strcharinfo(0);
		mes "�@�����̎����ɒ��ށB";
		mes "�@���O���c���܂����B";
		mes "�@�T�C�R����U�邱�Ƃ��ł��܂��]";
		next;
	}
	mes "�]�ʒu�F4�ԃ}�X";
	callfunc "jobchenge_ko_func",1,0;
	end;
}

job_ko.gat,17,16,4	script	���W#ko_05	858,1,1,{
	mes "�]5�ԃ}�X";
	mes "�@^1A95E6���̕����͏������Č����Ȃ��B";
	mes "�@�����Ƌ߂Â��Ă݂悤^000000�]";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "�]^FD0260LP^000000������܂���B";
		mes "�@�X�^�[�g�n�_�ɖ߂�܂��]";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	if(checkquest(5141)) {
		if(!(checkquest(5141) & 0x2)) {
			mes "�]�􂢂̂��߁A�T�C�R����";
			mes "�@�U�邱�Ƃ��ł��܂���]";
			close;
		}
		mes "�]2�����o�߂��A�􂢂������܂����B";
		mes "�@�T�C�R����U�邱�Ƃ��ł��܂��]";
		next;
		delquest 5141;
		mes "�]�ʒu�F5�ԃ}�X";
		callfunc "jobchenge_ko_func",1,0;
		end;
	}
	mes "�]�����������������Ă���]";
	next;
	mes "�]5^FD0260LP^000000���x����Ȃ����";
	mes "�@2���ԃT�C�R����U�邱�Ƃ��ł��Ȃ�";
	mes "�@�􂢂ɂ�����܂��]";
	next;
	if(select("5LP�x����","�x����Ȃ�") == 2) {
		setquest 5141;
		mes "�]2���ԃT�C�R����U�邱�Ƃ��ł��Ȃ�";
		mes "�@�􂢂ɂ�����܂����]";
		close;
	}
	mes "�]5LP�x�����܂����B";
	mes "�@�T�C�R����U�邱�Ƃ��ł��܂��]";
	set CHANGE_KO_LP,CHANGE_KO_LP - 5;
	next;
	mes "�]�ʒu�F5�ԃ}�X";
	callfunc "jobchenge_ko_func",1,0;
	end;
}

job_ko.gat,17,24,4	script	���W#ko_06	858,1,1,{
	mes "�]6�ԃ}�X";
	mes "�@^1A95E6���̕����͏������Č����Ȃ��B";
	mes "�@�����Ƌ߂Â��Ă݂悤^000000�]";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "�]^FD0260LP^000000������܂���B";
		mes "�@�X�^�[�g�n�_�ɖ߂�܂��]";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "�]�����������������Ă���]";
	next;
	mes "�]���b�L�[�I";
	mes "�@���̃}�X�Ɉړ�������";
	mes "�@�����̎����|�C���g��7^FD0260LP^000000�񕜁B";
	mes "�@100^FD0260LP^000000�𒴂������͉񕜂��܂���]";
	next;
	mes "�]�ʒu�F6�ԃ}�X";
	callfunc "jobchenge_ko_func",1,7;
	end;
}

job_ko.gat,17,32,4	script	���W#ko_07	858,1,1,{
	mes "�]7�ԃ}�X";
	mes "�@^1A95E6���̕����͏������Č����Ȃ��B";
	mes "�@�����Ƌ߂Â��Ă݂悤^000000�]";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "�]^FD0260LP^000000������܂���B";
		mes "�@�X�^�[�g�n�_�ɖ߂�܂��]";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "�]�����������������Ă���]";
	next;
	mes "�]�g���b�v���������܂���!!";
	mes "�@5�Ԃɖ߂�܂��]";
	close2;
	set CHANGE_KO_NOW,5;
	warp "job_ko.gat",22,16;
	end;
}

job_ko.gat,17,40,4	script	���W#ko_08	858,1,1,{
	mes "�]8�ԃ}�X";
	mes "�@^1A95E6���̕����͏������Č����Ȃ��B";
	mes "�@�����Ƌ߂Â��Ă݂悤^000000�]";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "�]^FD0260LP^000000������܂���B";
		mes "�@�X�^�[�g�n�_�ɖ߂�܂��]";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "�]�����������������Ă���]";
	next;
	mes "�]�W�����P���}�V��";
	mes "�@���Ȃ������Ă�14�Ԃֈړ����܂��B";
	mes "�@������������T�C�R����U��܂��B";
	mes "�@������΃X�^�[�g�n�_�֖߂�܂��]";
	next;
	mes "�W�����I�@�P���I�@�|���I ";
	next;
	set '@own,select("�`���L���o��","�O�[���o��","�p�[���o��")-1;
	set '@enemy,rand(3);
	mes "�\�\���ʕ\���\�\";
	mes "�}�V���F" +(('@enemy==0)? "�`���L": (('@enemy==1)? "�O�[": "�p�["));
	mes "���Ȃ��F" +(('@own==0)? "�`���L": (('@own==1)? "�O�[": "�p�["));
	next;
	if('@own == '@enemy) {
		mes "�]Draw";
		mes "�@���������ł��]";
		next;
		mes "�]�ʒu�F8�ԃ}�X";
		callfunc "jobchenge_ko_func",1,0;
		end;
	}
	if('@own != ('@enemy+1)%3) {
		mes "�]You Lose�c�c";
		mes "�@�X�^�[�g�n�_�ɖ߂�܂��]";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "�]You Win !";
	mes "�@14�Ԃɐi�݂܂��]";
	close2;
	set CHANGE_KO_NOW,14;
	warp "job_ko.gat",41,60;
	end;
}

job_ko.gat,17,48,4	script	���W#ko_09	858,1,1,{
	mes "�]9�ԃ}�X";
	mes "�@^1A95E6���̕����͏������Č����Ȃ��B";
	mes "�@�����Ƌ߂Â��Ă݂悤^000000�]";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "�]^FD0260LP^000000������܂���B";
		mes "�@�X�^�[�g�n�_�ɖ߂�܂��]";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "�]�����������������Ă���]";
	next;
	mes "�]����ɐi��ł��������]";
	next;
	mes "�]�ʒu�F9�ԃ}�X";
	callfunc "jobchenge_ko_func",1,0;
	end;
}

job_ko.gat,17,56,4	script	���W#ko_10	858,1,1,{
	mes "�]10�ԃ}�X";
	mes "�@^1A95E6���̕����͏������Č����Ȃ��B";
	mes "�@�����Ƌ߂Â��Ă݂悤^000000�]";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "�]^FD0260LP^000000������܂���B";
		mes "�@�X�^�[�g�n�_�ɖ߂�܂��]";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "�]�����������������Ă���]";
	next;
	mes "�]�����O�ɂ��]";
	next;
	if('trap) {
		mes "�]�ݒu����Ă����g���b�v��";
		mes "�@�������܂����I";
		mes "�@�X�^�[�g�ɖ߂�܂��]";
		close2;
		set 'trap,0;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "�]���݃g���b�v�͐ݒu����Ă��܂���]";
	next;
	mes "�]10^FD0260LP^000000�x�������Ƃ� ";
	mes "�@�X�^�[�g�ɖ߂�";
	mes "�@�g���b�v��ݒu�ł��܂��]";
	next;
	if(select("�g���b�v��ݒu����","�ݒu�����T�C�R����U��") == 1) {
		mes "�]10LP�x�����܂����B";
		mes "�@�g���b�v��ݒu���܂����]";
		set 'trap,1;
		set CHANGE_KO_LP,CHANGE_KO_LP - 10;
		next;
	}
	mes "�]�ʒu�F10�ԃ}�X";
	callfunc "jobchenge_ko_func",1,0;
	end;
}

job_ko.gat,22,60,4	script	���W#ko_11	858,1,1,{
	mes "�]11�ԃ}�X";
	mes "�@^1A95E6���̕����͏������Č����Ȃ��B";
	mes "�@�����Ƌ߂Â��Ă݂悤^000000�]";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "�]^FD0260LP^000000������܂���B";
		mes "�@�X�^�[�g�n�_�ɖ߂�܂��]";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "�]�����������������Ă���]";
	next;
	mes "�]�g���b�v���ݒu����Ă��܂��I ";
	mes "�@9�Ԃɖ߂�܂��]";
	close2;
	set CHANGE_KO_NOW,9;
	warp "job_ko.gat",17,43;
	end;
}

job_ko.gat,30,60,4	script	���W#ko_12	858,1,1,{
	mes "�]12�ԃ}�X";
	mes "�@^1A95E6���̕����͏������Č����Ȃ��B";
	mes "�@�����Ƌ߂Â��Ă݂悤^000000�]";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "�]^FD0260LP^000000������܂���B";
		mes "�@�X�^�[�g�n�_�ɖ߂�܂��]";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "�]�����������������Ă���]";
	next;
	mes "�]�W�����P���}�V��";
	mes "�@���Ȃ������Ă�20�Ԃֈړ����܂��B";
	mes "�@������������T�C�R����U��܂��B";
	mes "�@�������9�Ԃ֖߂�܂��]";
	next;
	mes "�W�����I�@�P���I�@�|���I";
	next;
	set '@own,select("�`���L���o��","�O�[���o��","�p�[���o��")-1;
	set '@enemy,rand(3);
	mes "�\�\���ʕ\���\�\";
	mes "�}�V���F" +(('@enemy==0)? "�`���L": (('@enemy==1)? "�O�[": "�p�["));
	mes "���Ȃ��F" +(('@own==0)? "�`���L": (('@own==1)? "�O�[": "�p�["));
	next;
	if('@own == '@enemy) {
		mes "�]Draw";
		mes "�@���������ł��]";
		next;
		mes "�]�ʒu�F12�ԃ}�X";
		callfunc "jobchenge_ko_func",1,0;
		end;
	}
	if('@own != ('@enemy+1)%3) {
		mes "�]You Lose�c�c";
		mes "�@9�Ԃɖ߂�܂��]";
		close2;
		set CHANGE_KO_NOW,9;
		warp "job_ko.gat",17,43;
		end;
	}
	mes "�]You Win !";
	mes "�@20�Ԃɐi�݂܂��]";
	close2;
	set CHANGE_KO_NOW,20;
	warp "job_ko.gat",62,32;
	end;
}

job_ko.gat,38,60,4	script	���W#ko_13	858,1,1,{
	mes "�]13�ԃ}�X";
	mes "�@^1A95E6���̕����͏������Č����Ȃ��B";
	mes "�@�����Ƌ߂Â��Ă݂悤^000000�]";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "�]^FD0260LP^000000������܂���B";
		mes "�@�X�^�[�g�n�_�ɖ߂�܂��]";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "�]�����������������Ă���]";
	next;
	mes "�]���b�L�[�I";
	mes "�@���̃}�X�Ɉړ�������";
	mes "�@�����̎����|�C���g��7^FD0260LP^000000�񕜁B";
	mes "�@100^FD0260LP^000000�𒴂������͉񕜂��܂���]";
	next;
	mes "�]�ʒu�F13�ԃ}�X";
	callfunc "jobchenge_ko_func",1,7;
	end;
}

job_ko.gat,46,60,4	script	���W#ko_14	858,1,1,{
	mes "�]14�ԃ}�X";
	mes "�@^1A95E6���̕����͏������Č����Ȃ��B";
	mes "�@�����Ƌ߂Â��Ă݂悤^000000�]";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "�]^FD0260LP^000000������܂���B";
		mes "�@�X�^�[�g�n�_�ɖ߂�܂��]";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	if(checkquest(5141)) {
		if(!(checkquest(5141) & 0x2)) {
			mes "�]�􂢂̂��߁A�T�C�R����";
			mes "�@�U�邱�Ƃ��ł��܂���]";
			close;
		}
		mes "�]2�����o�߂��A�􂢂������܂����B";
		mes "�@�T�C�R����U�邱�Ƃ��ł��܂��]";
		next;
		delquest 5141;
		mes "�]�ʒu�F14�ԃ}�X";
		callfunc "jobchenge_ko_func",1,0;
		end;
	}
	mes "�]�����������������Ă���]";
	next;
	mes "�]5^FD0260LP^000000���x����Ȃ����";
	mes "�@2���ԃT�C�R����U�邱�Ƃ��ł��Ȃ�";
	mes "�@�􂢂ɂ�����܂��]";
	next;
	if(select("5LP�x����","�x����Ȃ�") == 2) {
		setquest 5141;
		mes "�]2���ԃT�C�R����U�邱�Ƃ��ł��Ȃ�";
		mes "�@�􂢂ɂ�����܂����]";
		close;
	}
	mes "�]5LP�x�����܂����B";
	mes "�@�T�C�R����U�邱�Ƃ��ł��܂��]";
	set CHANGE_KO_LP,CHANGE_KO_LP - 5;
	next;
	mes "�]�ʒu�F14�ԃ}�X";
	callfunc "jobchenge_ko_func",1,0;
	end;
}

job_ko.gat,54,60,4	script	���W#ko_15	858,1,1,{
	mes "�]15�ԃ}�X";
	mes "�@^1A95E6���̕����͏������Č����Ȃ��B";
	mes "�@�����Ƌ߂Â��Ă݂悤^000000�]";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "�]^FD0260LP^000000������܂���B";
		mes "�@�X�^�[�g�n�_�ɖ߂�܂��]";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	if(checkquest(5141)) {
		if(!(checkquest(5141) & 0x2)) {
			mes "�]�􂢂̂��ߐi�߂܂���]";
			close;
		}
		mes "�]2�����o�߂��A�􂢂������܂����B";
		mes "�@�T�C�R����U�邱�Ƃ��ł��܂��]";
		next;
		delquest 5141;
		mes "�]�ʒu�F15�ԃ}�X";
		callfunc "jobchenge_ko_func",1,0;
		end;
	}
	mes "�]�����������������Ă���]";
	next;
	mes "�]���͂Ȏ􂢂ɂ�����";
	mes "�@2���Ԑi�߂Ȃ���Ԃ�";
	mes "�@�Ȃ�܂����]";
	setquest 5141;
	close;
}

job_ko.gat,62,60,4	script	���W#ko_16	858,1,1,{
	mes "�]16�ԃ}�X";
	mes "�@^1A95E6���̕����͏������Č����Ȃ��B";
	mes "�@�����Ƌ߂Â��Ă݂悤^000000�]";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "�]^FD0260LP^000000������܂���B";
		mes "�@�X�^�[�g�n�_�ɖ߂�܂��]";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "�]�����������������Ă���]";
	next;
	mes "�]2^FD0260LP^000000������T�C�R����2��U��]";
	next;
	mes "�]�����ڂ��o����19�Ԃ֐i�ށB";
	mes "�@�����ڂ��o�Ȃ��ꍇ�ɂ́A";
	mes "�@�����ڂ��o��܂�2^FD0260LP^000000�����";
	mes "�@�T�C�R����2��U�葱����]";
	while(1) {
		next;
		mes "�]�ʒu�F16�ԃ}�X";
		mes "�@�ۗLLP�F" +CHANGE_KO_LP;
		mes "�@�T�C�R����U���2^FD0260LP^000000������܂��]";
		next;
		menu "1�ڂ̃T�C�R����U��",-;
		mes "�]2LP��������]";
		set CHANGE_KO_LP,CHANGE_KO_LP - 2;
		next;
		set '@dice1,rand(1,6);
		emotion 57+'@dice1,"";
		mes "�]" +'@dice1+ "���o�܂����B";
		mes "�@2�ڂ̃T�C�R����U���Ă��������]";
		next;
		menu "2�ڂ̃T�C�R����U��",-;
		set '@dice2,rand(1,6);
		emotion 57+'@dice2,"";
		mes "�]" +'@dice2+ "���o�܂����B";
		if('@dice1 == '@dice2) {
			mes "�@�����ڂ��o������19�Ԃɐi�݂܂��]";
			close2;
			set CHANGE_KO_NOW,19;
			warp "job_ko.gat",62,40;
			end;
		}
		else {
			// ������
			mes "�@�����ڂ��o�Ȃ���������";
			mes "�@�ēx�T�C�R����U��܂��]";
			continue;
		}
	}
}

job_ko.gat,62,51,4	script	���W#ko_17	858,1,1,{
	mes "�]17�ԃ}�X";
	mes "�@^1A95E6���̕����͏������Č����Ȃ��B";
	mes "�@�����Ƌ߂Â��Ă݂悤^000000�]";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "�]^FD0260LP^000000������܂���B";
		mes "�@�X�^�[�g�n�_�ɖ߂�܂��]";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "�]�����������������Ă���]";
	next;
	mes "�]�􂢂ɂ������ĂȂ񂾂��̂��d���B";
	mes "�@�T�C�R����U�邽�߂�10^FD0260LP^000000����܂��]";
	next;
	mes "�]�ʒu�F17�ԃ}�X";
	callfunc "jobchenge_ko_func",10,0;
	end;
}

job_ko.gat,62,43,4	script	���W#ko_18	858,1,1,{
	mes "�]18�ԃ}�X";
	mes "�@^1A95E6���̕����͏������Č����Ȃ��B";
	mes "�@�����Ƌ߂Â��Ă݂悤^000000�]";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "�]^FD0260LP^000000������܂���B";
		mes "�@�X�^�[�g�n�_�ɖ߂�܂��]";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "�]�����������������Ă���]";
	next;
	mes "�]2^FD0260LP^000000������T�C�R����2��U��]";
	next;
	mes "�]2��̍��v��5�����Ȃ��24�Ԃ֐i�ށB";
	mes "�@5�ȏ�Ȃ��19�Ԃɐi�ށ]";
	next;
	mes "�]�ʒu�F18�ԃ}�X";
	mes "�@�ۗLLP�F" +CHANGE_KO_LP;
	mes "�@�T�C�R����U���2^FD0260LP^000000������܂��]";
	next;
	menu "1�ڂ̃T�C�R����U��",-;
	mes "�]2LP��������]";
	set CHANGE_KO_LP,CHANGE_KO_LP - 2;
	next;
	set '@dice1,rand(1,6);
	emotion 57+'@dice1,"";
	mes "�]" +'@dice1+ "���o�܂����B";
	mes "�@2�ڂ̃T�C�R����U���Ă��������]";
	next;
	menu "2�ڂ̃T�C�R����U��",-;
	set '@dice2,rand(1,6);
	emotion 57+'@dice2,"";
	mes "�]" +'@dice2+ "���o�܂����B";
	next;
	if(('@dice1+'@dice2) >= 5) {
		mes '@dice1+ " + " +'@dice2+ " = " +('@dice1+'@dice2);
		mes "�]2�̍��v��5�ȏ�ł����B";
		mes "�@19�Ԃɐi�݂܂��]";
		close2;
		set CHANGE_KO_NOW,19;
		warp "job_ko.gat",62,40;
		end;
	}
	else {
		// ������
		mes "�]2�̍��v��5�����ł����B";
		mes "�@24�Ԃɐi�݂܂��]";
		close2;
		set CHANGE_KO_NOW,24;
		warp "job_ko.gat",38,23;
		end;
	}
}

job_ko.gat,62,35,4	script	���W#ko_19	858,1,1,{
	mes "�]19�ԃ}�X";
	mes "�@^1A95E6���̕����͏������Č����Ȃ��B";
	mes "�@�����Ƌ߂Â��Ă݂悤^000000�]";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "�]^FD0260LP^000000������܂���B";
		mes "�@�X�^�[�g�n�_�ɖ߂�܂��]";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "�]�����������������Ă���]";
	next;
	mes "�]����ɐi��ł��������]";
	next;
	mes "�]�ʒu�F19�ԃ}�X";
	callfunc "jobchenge_ko_func",1,0;
	end;
}

job_ko.gat,62,27,4	script	���W#ko_20	858,1,1,{
	mes "�]20�ԃ}�X";
	mes "�@^1A95E6���̕����͏������Č����Ȃ��B";
	mes "�@�����Ƌ߂Â��Ă݂悤^000000�]";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "�]^FD0260LP^000000������܂���B";
		mes "�@�X�^�[�g�n�_�ɖ߂�܂��]";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "�]�����������������Ă���]";
	next;
	mes "�]���b�L�[�I";
	mes "�@���̃}�X�Ɉړ�������";
	mes "�@�����̎����|�C���g��7^FD0260LP^000000�񕜁B";
	mes "�@100^FD0260LP^000000�𒴂������͉񕜂��܂���]";
	next;
	mes "�]�ʒu�F20�ԃ}�X";
	callfunc "jobchenge_ko_func",1,7;
	end;
}

job_ko.gat,57,23,4	script	���W#ko_21	858,1,1,{
	mes "�]21�ԃ}�X";
	mes "�@^1A95E6���̕����͏������Č����Ȃ��B";
	mes "�@�����Ƌ߂Â��Ă݂悤^000000�]";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "�]^FD0260LP^000000������܂���B";
		mes "�@�X�^�[�g�n�_�ɖ߂�܂��]";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "�]�����������������Ă���]";
	next;
	mes "�]�􂢂ɂ������ĂȂ񂾂��̂��d���B";
	mes "�@�T�C�R����U�邽�߂�10^FD0260LP^000000����܂��]";
	next;
	mes "�]�ʒu�F21�ԃ}�X";
	callfunc "jobchenge_ko_func",10,0;
	end;
}

job_ko.gat,49,23,4	script	���W#ko_22	858,1,1,{
	mes "�]22�ԃ}�X";
	mes "�@^1A95E6���̕����͏������Č����Ȃ��B";
	mes "�@�����Ƌ߂Â��Ă݂悤^000000�]";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "�]^FD0260LP^000000������܂���B";
		mes "�@�X�^�[�g�n�_�ɖ߂�܂��]";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "�]�����������������Ă���]";
	next;
	mes "�]�c���^FD0260LP^000000��S�Ċ�t��";
	mes "�@�X�^�[�g�n�_�ɖ߂��";
	mes "�@���ɂ����𓥂ގ҂͋~���邾�낤�]";
	next;
	if('trap) {
		mes "�]�e�؂ȒN����������^FD0260LP^000000��";
		mes "�@��t���Ă��܂����B";
		mes "�@�S�[���n�_�܂Ői�݂܂��]";
		close2;
		set 'trap,0;
		warp "job_ko.gat",41,44;
		end;
	}
	mes "�]^FD0260LP^000000��S�Ċ�t�����";
	mes "�@���ɂ����Ɏ~�܂����l��";
	mes "�@�S�[���n�_�֐i�߂܂��B";
	mes "�@^FD0260LP^000000��S�Ċ�t���܂����H�]";
	next;
	if(select("LP��S�Ċ�t����","��t���Ȃ�") == 1) {
		mes "�]�c���^FD0260LP^000000��S�Ċ�t���܂����B";
		mes "�@�X�^�[�g�n�_�ɖ߂�܂��]";
		close2;
		set 'trap,1;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "�]�ʒu�F22�ԃ}�X";
	callfunc "jobchenge_ko_func",1,0;
	end;
}

job_ko.gat,41,23,4	script	���W#ko_23	858,1,1,{
	mes "�]23�ԃ}�X";
	mes "�@^1A95E6���̕����͏������Č����Ȃ��B";
	mes "�@�����Ƌ߂Â��Ă݂悤^000000�]";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "�]^FD0260LP^000000������܂���B";
		mes "�@�X�^�[�g�n�_�ɖ߂�܂��]";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "�]�����������������Ă���]";
	next;
	mes "�]�g���b�v���������܂���!!";
	mes "�@17�Ԃɖ߂�܂��]";
	close2;
	set CHANGE_KO_NOW,17;
	warp "job_ko.gat",62,55;
	end;
}

job_ko.gat,33,23,4	script	���W#ko_24	858,1,1,{
	mes "�]24�ԃ}�X";
	mes "�@^1A95E6���̕����͏������Č����Ȃ��B";
	mes "�@�����Ƌ߂Â��Ă݂悤^000000�]";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "�]^FD0260LP^000000������܂���B";
		mes "�@�X�^�[�g�n�_�ɖ߂�܂��]";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "�]�����������������Ă���]";
	next;
	mes "�]2^FD0260LP^000000������T�C�R����2��U��]";
	next;
	mes "�]2��̍��v��9�ȏ�Ȃ��";
	mes "�@25�ԁ`30�Ԃ̍D���ȏꏊ�ɐi�ށB";
	mes "�@8�ȉ��Ȃ��19�Ԃɖ߂�]";
	next;
	mes "�]�ʒu�F24�ԃ}�X";
	mes "�@�ۗLLP�F" +CHANGE_KO_LP;
	mes "�@�T�C�R����U���2^FD0260LP^000000������܂��]";
	next;
	menu "1�ڂ̃T�C�R����U��",-;
	mes "�]2LP��������]";
	set CHANGE_KO_LP,CHANGE_KO_LP - 2;
	next;
	set '@dice1,rand(1,6);
	emotion 57+'@dice1,"";
	mes "�]" +'@dice1+ "���o�܂����B";
	mes "�@2�ڂ̃T�C�R����U���Ă��������]";
	next;
	menu "2�ڂ̃T�C�R����U��",-;
	set '@dice2,rand(1,6);
	emotion 57+'@dice2,"";
	mes "�]" +'@dice2+ "���o�܂����B";
	next;
	if(('@dice1+'@dice2) >= 9) {
		mes '@dice1+ " + " +'@dice2+ " = " +('@dice1+'@dice2);
		mes "�]2�̍��v��9�ȏ�ł����B";
		mes "�@25�ԁ`30�Ԃ̍D���ȏꏊ�ɐi�݂܂��]";
		next;
		switch(select("25�Ԃ�","26�Ԃ�","27�Ԃ�","28�Ԃ�","29�Ԃ�","30�Ԃ�")) {
		case 1: set CHANGE_KO_NOW,25; warp "job_ko.gat",30,23; break;
		case 2: set CHANGE_KO_NOW,26; warp "job_ko.gat",25,28; break;
		case 3: set CHANGE_KO_NOW,27; warp "job_ko.gat",25,35; break;
		case 4: set CHANGE_KO_NOW,28; warp "job_ko.gat",25,43; break;
		case 5: set CHANGE_KO_NOW,29; warp "job_ko.gat",25,52; break;
		case 6: set CHANGE_KO_NOW,30; warp "job_ko.gat",33,52; break;
		}
		end;
	}
	else {
		mes "�]2�̍��v��8�ȉ��ł����B";
		mes "�@19�Ԃɖ߂�܂��]";
		close2;
		set CHANGE_KO_NOW,19;
		warp "job_ko.gat",62,40;
		end;
	}
}

job_ko.gat,25,23,4	script	���W#ko_25	858,1,1,{
	mes "�]25�ԃ}�X";
	mes "�@^1A95E6���̕����͏������Č����Ȃ��B";
	mes "�@�����Ƌ߂Â��Ă݂悤^000000�]";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "�]^FD0260LP^000000������܂���B";
		mes "�@�X�^�[�g�n�_�ɖ߂�܂��]";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	if(checkquest(5141)) {
		if(!(checkquest(5141) & 0x2)) {
			mes "�]�􂢂̂��ߐi�߂܂���]";
			close;
		}
		mes "�]2�����o�߂��A�􂢂������܂����B";
		mes "�@�T�C�R����U�邱�Ƃ��ł��܂��]";
		next;
		delquest 5141;
		mes "�]�ʒu�F25�ԃ}�X";
		callfunc "jobchenge_ko_func",1,0;
		end;
	}
	mes "�]�����������������Ă���]";
	next;
	mes "�]�����ł͊��c�c";
	mes "�@������������Ă悭�����Ȃ��B";
	mes "�@�ǂ����悤���H�]";
	next;
	if(select("�����|������","�������Ȃ�") == 1) {
		// �X�L���ł͂Ȃ������W���[�N�𔭌����邾��
		mes "�]�v�����e���ŗ��s���Ă���";
		mes "�@�����W���[�N��������I�]";
		next;
		setquest 5141;
		mes "�]2���Ԑi�߂Ȃ�";
		mes "�@�􂢂ɂ������Ă��܂����c�c�]";
		close;
	}
	if(rand(6)) {
		mes "�]�����N����Ȃ��c�c";
		mes "�@�|�ł�����ׂ����낤���H�]";
		close;
	}
	mes "�]�������Ȃ������̂�";
	mes "�@�������I���������悤���]";
	next;
	mes "�]�ʒu�F25�ԃ}�X";
	callfunc "jobchenge_ko_func",1,0;
	end;
}

job_ko.gat,25,32,4	script	���W#ko_26	858,1,1,{
	mes "�]26�ԃ}�X";
	mes "�@^1A95E6���̕����͏������Č����Ȃ��B";
	mes "�@�����Ƌ߂Â��Ă݂悤^000000�]";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "�]^FD0260LP^000000������܂���B";
		mes "�@�X�^�[�g�n�_�ɖ߂�܂��]";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "�]�����������������Ă���]";
	next;
	mes "�]�g���b�v���������܂���!!";
	mes "�@20�Ԃɖ߂�܂��]";
	close2;
	set CHANGE_KO_NOW,20;
	warp "job_ko.gat",62,32;
	end;
}

job_ko.gat,25,40,4	script	���W#ko_27	858,1,1,{
	mes "�]27�ԃ}�X";
	mes "�@^1A95E6���̕����͏������Č����Ȃ��B";
	mes "�@�����Ƌ߂Â��Ă݂悤^000000�]";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "�]^FD0260LP^000000������܂���B";
		mes "�@�X�^�[�g�n�_�ɖ߂�܂��]";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "�]�����������������Ă���]";
	next;
	mes "�]���b�L�[�I";
	mes "�@���̃}�X�Ɉړ�������";
	mes "�@�����̎����|�C���g��7^FD0260LP^000000�񕜁B";
	mes "�@100^FD0260LP^000000�𒴂������͉񕜂��܂���]";
	next;
	mes "�]�ʒu�F27�ԃ}�X";
	callfunc "jobchenge_ko_func",1,7;
	end;
}

job_ko.gat,25,48,4	script	���W#ko_28	858,1,1,{
	mes "�]28�ԃ}�X";
	mes "�@^1A95E6���̕����͏������Č����Ȃ��B";
	mes "�@�����Ƌ߂Â��Ă݂悤^000000�]";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "�]^FD0260LP^000000������܂���B";
		mes "�@�X�^�[�g�n�_�ɖ߂�܂��]";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "�]�����������������Ă���]";
	next;
	mes "�]�����O�ɂ��]";
	next;
	if('trap) {
		mes "�]�ݒu����Ă����g���b�v��";
		mes "�@�������܂����I";
		mes "�@�X�^�[�g�ɖ߂�܂��]";
		close2;
		set 'trap,0;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "�]���݃g���b�v�͐ݒu����Ă��܂���]";
	next;
	mes "�]10^FD0260LP^000000�x�������Ƃ� ";
	mes "�@�X�^�[�g�ɖ߂�";
	mes "�@�g���b�v��ݒu�ł��܂��]";
	next;
	if(select("�g���b�v��ݒu����","�ݒu�����T�C�R����U��") == 1) {
		mes "�]10LP�x�����܂����B";
		mes "�@�g���b�v��ݒu���܂����]";
		set 'trap,1;
		set CHANGE_KO_LP,CHANGE_KO_LP - 10;
		next;
	}
	mes "�]�ʒu�F28�ԃ}�X";
	callfunc "jobchenge_ko_func",1,0;
	end;
}

job_ko.gat,30,52,4	script	���W#ko_29	858,1,1,{
	mes "�]29�ԃ}�X";
	mes "�@^1A95E6���̕����͏������Č����Ȃ��B";
	mes "�@�����Ƌ߂Â��Ă݂悤^000000�]";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "�]^FD0260LP^000000������܂���B";
		mes "�@�X�^�[�g�n�_�ɖ߂�܂��]";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "�]�����������������Ă���]";
	next;
	mes "�]�c��11�}�X�B";
	mes "�@�O�i����]";
	next;
	mes "�]�ʒu�F29�ԃ}�X";
	callfunc "jobchenge_ko_func",1,0;
	end;
}

job_ko.gat,38,52,4	script	���W#ko_30	858,1,1,{
	mes "�]30�ԃ}�X";
	mes "�@^1A95E6���̕����͏������Č����Ȃ��B";
	mes "�@�����Ƌ߂Â��Ă݂悤^000000�]";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "�]^FD0260LP^000000������܂���B";
		mes "�@�X�^�[�g�n�_�ɖ߂�܂��]";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "�]�����������������Ă���]";
	next;
	mes "�]�g���b�v���������܂���!!";
	mes "�@9�Ԃɖ߂�܂��]";
	close2;
	set CHANGE_KO_NOW,9;
	warp "job_ko.gat",17,43;
	end;
}

job_ko.gat,46,52,4	script	���W#ko_31	858,1,1,{
	mes "�]31�ԃ}�X";
	mes "�@^1A95E6���̕����͏������Č����Ȃ��B";
	mes "�@�����Ƌ߂Â��Ă݂悤^000000�]";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "�]^FD0260LP^000000������܂���B";
		mes "�@�X�^�[�g�n�_�ɖ߂�܂��]";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	if(checkquest(5141)) {
		if(!(checkquest(5141) & 0x2)) {
			mes "�]�􂢂̂��߁A�T�C�R����";
			mes "�@�U�邱�Ƃ��ł��܂���]";
			close;
		}
		mes "�]2�����o�߂��A�􂢂������܂����B";
		mes "�@�T�C�R����U�邱�Ƃ��ł��܂��]";
		next;
		delquest 5141;
		mes "�]�ʒu�F31�ԃ}�X";
		callfunc "jobchenge_ko_func",1,0;
		end;
	}
	mes "�]�����������������Ă���]";
	next;
	mes "�]5^FD0260LP^000000���x����Ȃ����";
	mes "�@2���ԃT�C�R����U�邱�Ƃ��ł��Ȃ�";
	mes "�@�􂢂ɂ�����܂��]";
	next;
	if(select("5LP�x����","�x����Ȃ�") == 2) {
		setquest 5141;
		mes "�]2���ԃT�C�R����U�邱�Ƃ��ł��Ȃ�";
		mes "�@�􂢂ɂ�����܂����]";
		close;
	}
	mes "�]5LP�x�����܂����B";
	mes "�@�T�C�R����U�邱�Ƃ��ł��܂��]";
	set CHANGE_KO_LP,CHANGE_KO_LP - 5;
	next;
	mes "�]�ʒu�F31�ԃ}�X";
	callfunc "jobchenge_ko_func",1,0;
	end;
}

job_ko.gat,54,52,4	script	���W#ko_32	858,1,1,{
	mes "�]32�ԃ}�X";
	mes "�@^1A95E6���̕����͏������Č����Ȃ��B";
	mes "�@�����Ƌ߂Â��Ă݂悤^000000�]";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "�]^FD0260LP^000000������܂���B";
		mes "�@�X�^�[�g�n�_�ɖ߂�܂��]";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "�]�����������������Ă���]";
	next;
	mes "�]�W�����P���}�V��";
	mes "�@���Ȃ������Ă�33�ԁ`38�Ԃ�";
	mes "�@�D���ȏꏊ�ɐi�ށB";
	mes "�@�����܂��͈��������̏ꍇ";
	mes "�@�X�^�[�g�n�_�֖߂�܂��]";
	next;
	mes "�W�����I�@�P���I�@�|���I";
	next;
	set '@own,select("�`���L���o��","�O�[���o��","�p�[���o��")-1;
	set '@enemy,rand(3);
	mes "�\�\���ʕ\���\�\";
	mes "�}�V���F" +(('@enemy==0)? "�`���L": (('@enemy==1)? "�O�[": "�p�["));
	mes "���Ȃ��F" +(('@own==0)? "�`���L": (('@own==1)? "�O�[": "�p�["));
	next;
	if('@own == '@enemy) {
		// ������
		mes "�]Draw";
		mes "�@���������ł�";
		mes "�@�X�^�[�g�n�_�ɖ߂�܂��]";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	if('@own != ('@enemy+1)%3) {
		// ������
		mes "�]You Lose�c�c";
		mes "�@�X�^�[�g�n�_�ɖ߂�܂��]";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "�]You Win !";
	mes "�@33�`38�̐i�݂����}�X��";
	mes "�@�I��ł��������]";
	next;
	switch(select("33�Ԃ�","34�Ԃ�","35�Ԃ�","36�Ԃ�","37�Ԃ�","38�Ԃ�")) {
	case 1: set CHANGE_KO_NOW,33; warp "job_ko.gat",54,48; break;
	case 2: set CHANGE_KO_NOW,34; warp "job_ko.gat",54,40; break;
	case 3: set CHANGE_KO_NOW,35; warp "job_ko.gat",54,31; break;
	case 4: set CHANGE_KO_NOW,36; warp "job_ko.gat",47,31; break;
	case 5: set CHANGE_KO_NOW,37; warp "job_ko.gat",38,31; break;
	case 6: set CHANGE_KO_NOW,38; warp "job_ko.gat",33,35; break;
	}
	end;
}

job_ko.gat,54,43,4	script	���W#ko_33	858,1,1,{
	mes "�]33�ԃ}�X";
	mes "�@^1A95E6���̕����͏������Č����Ȃ��B";
	mes "�@�����Ƌ߂Â��Ă݂悤^000000�]";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "�]^FD0260LP^000000������܂���B";
		mes "�@�X�^�[�g�n�_�ɖ߂�܂��]";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "�]�����������������Ă���]";
	next;
	mes "�]�Ō�̃T�C�R����U�邽�߂�";
	mes "�@1^FD0260LP^000000�������|�C���g��";
	mes "�@�S�Ďx������39�Ԃɐi�߂܂��]";
	next;
	if(select("�x����","�x����Ȃ�") == 1) {
		mes "�]" +(CHANGE_KO_LP-1)+ "LP�x������";
		mes "�@39�Ԃɐi�݂܂��]";
		close2;
		set CHANGE_KO_LP,1;
		set CHANGE_KO_NOW,39;
		warp "job_ko.gat",33,44;
		end;
	}
	mes "�]�T�C�R����U���Ă��������]";
	next;
	mes "�]�ʒu�F33�ԃ}�X";
	callfunc "jobchenge_ko_func",1,0;
	end;
}

job_ko.gat,54,35,4	script	���W#ko_34	858,1,1,{
	mes "�]34�ԃ}�X";
	mes "�@^1A95E6���̕����͏������Č����Ȃ��B";
	mes "�@�����Ƌ߂Â��Ă݂悤^000000�]";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "�]^FD0260LP^000000������܂���B";
		mes "�@�X�^�[�g�n�_�ɖ߂�܂��]";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "�]�����������������Ă���]";
	next;
	mes "�]���b�L�[�I";
	mes "�@���̃}�X�Ɉړ�������";
	mes "�@�����̎����|�C���g��7^FD0260LP^000000�񕜁B";
	mes "�@100^FD0260LP^000000�𒴂������͉񕜂��܂���]";
	next;
	mes "�]�ʒu�F34�ԃ}�X";
	callfunc "jobchenge_ko_func",1,7;
	end;
}

job_ko.gat,49,31,4	script	���W#ko_35	858,1,1,{
	mes "�]35�ԃ}�X";
	mes "�@^1A95E6���̕����͏������Č����Ȃ��B";
	mes "�@�����Ƌ߂Â��Ă݂悤^000000�]";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "�]^FD0260LP^000000������܂���B";
		mes "�@�X�^�[�g�n�_�ɖ߂�܂��]";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "�]�����������������Ă���]";
	next;
	mes "�]�ݒu����Ă����g���b�v��";
	mes "�@�������܂����I";
	mes "�@29�Ԃɖ߂�܂��]";
	close2;
	set CHANGE_KO_NOW,29;
	warp "job_ko.gat",25,52;
	end;
}

job_ko.gat,41,31,4	script	���W#ko_36	858,1,1,{
	mes "�]36�ԃ}�X";
	mes "�@^1A95E6���̕����͏������Č����Ȃ��B";
	mes "�@�����Ƌ߂Â��Ă݂悤^000000�]";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "�]^FD0260LP^000000������܂���B";
		mes "�@�X�^�[�g�n�_�ɖ߂�܂��]";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "�]�����������������Ă���]";
	next;
	mes "�]�c��4�}�X�]";
	next;
	mes "�]4�ȏ�̖ڂ��o��΃S�[���n�_��";
	mes "�@���ǂ蒅���邪";
	mes "�@�����ЂƂ̃��[����I��ł��悢�]";
	next;
	mes "�]�����ЂƂ̃��[����";
	mes "�@1,2,3���o��΃S�[���n�_�ɐi��";
	mes "�@4,5,6���o���29�Ԃɖ߂�B";
	mes "�@���̃��[�����g�p����";
	mes "�@���ʂɃT�C�R����U���Ă��悢�]";
	next;
	if(select("�����ЂƂ̃��[�����g�p����","���ʂɃT�C�R����U��") == 1) {
		mes "�]�ʒu�F36�ԃ}�X";
		mes "�@�ۗLLP�F" +CHANGE_KO_LP;
		mes "�@�T�C�R����U���1^FD0260LP^000000������܂��]";
		next;
		menu "�T�C�R����U��",-;
		set '@dice,rand(1,6);
		emotion 57+'@dice,"";
		set CHANGE_KO_LP,CHANGE_KO_LP - 1;
		mes "�]" +'@dice+ "���o�܂����B";
		if('@dice <= 3) {
			mes "�@�S�[���n�_�ɐi�݂܂��]";
			close2;
			warp "job_ko.gat",41,44;
			end;
		}
		else {
			mes "�@29�Ԃɖ߂�܂��]";
			close2;
			set CHANGE_KO_NOW,29;
			warp "job_ko.gat",25,52;
			end;
		}
	}
	mes "�]�ʒu�F36�ԃ}�X";
	callfunc "jobchenge_ko_func",1,0;
	end;
}

job_ko.gat,33,31,4	script	���W#ko_37	858,1,1,{
	mes "�]37�ԃ}�X";
	mes "�@^1A95E6���̕����͏������Č����Ȃ��B";
	mes "�@�����Ƌ߂Â��Ă݂悤^000000�]";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "�]^FD0260LP^000000������܂���B";
		mes "�@�X�^�[�g�n�_�ɖ߂�܂��]";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "�]�����������������Ă���]";
	next;
	mes "�]�c��3�}�X�]";
	next;
	mes "�]����o��΃S�[���n�_�ɐi�ށB";
	mes "�@�������A�������o���";
	mes "�@�X�^�[�g�n�_�ɖ߂�]";
	next;
	mes "�]�ʒu�F37�}�X";
	mes "�@�ۗLLP�F" +CHANGE_KO_LP;
	mes "�@�T�C�R����U���1^FD0260LP^000000������܂��]";
	next;
	menu "�T�C�R����U��",-;
	set '@dice,rand(1,6);
	emotion 57+'@dice,"";
	set CHANGE_KO_LP,CHANGE_KO_LP - 1;
	mes "�]" +'@dice+ "���o�܂����B";
	if('@dice%2) {
		mes "�@�S�[���n�_�ɐi�݂܂��]";
		close2;
		warp "job_ko.gat",41,44;
		end;
	}
	else {
		mes "�@�X�^�[�g�n�_�ɖ߂�܂��]";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
}

job_ko.gat,33,40,4	script	���W#ko_38	858,1,1,{
	mes "�]38�ԃ}�X";
	mes "�@^1A95E6���̕����͏������Č����Ȃ��B";
	mes "�@�����Ƌ߂Â��Ă݂悤^000000�]";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "�]^FD0260LP^000000������܂���B";
		mes "�@�X�^�[�g�n�_�ɖ߂�܂��]";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "�]�����������������Ă���]";
	next;
	mes "�]1^FD0260LP^000000���c���A�S�Ă�^FD0260LP^000000���x�������Ƃ�";
	mes "�@�X�^�[�g�ɖ߂�";
	mes "�@�g���b�v��ݒu�ł��܂��]";
	next;
	if('trap) {
		mes "�]�ݒu����Ă����g���b�v��";
		mes "�@�������܂����I";
		mes "�@�X�^�[�g�ɖ߂�܂��]";
		close2;
		set 'trap,0;
		warp "job_ko.gat",63,16;
		end;
	}
	if(select("�g���b�v��ݒu����","�ݒu�����T�C�R����U��") == 1) {
		mes "�]" +(CHANGE_KO_LP-1)+ "LP�x�����܂����B";
		mes "�@�g���b�v��ݒu���܂����]";
		set 'trap,1;
		set CHANGE_KO_LP,1;
		next;
	}
	mes "�]�ʒu�F38�ԃ}�X";
	callfunc "jobchenge_ko_func",1,0;
	end;
}

job_ko.gat,38,44,4	script	���W#ko_39	858,1,1,{
	mes "�]39�ԃ}�X";
	mes "�@^1A95E6���̕����͏������Č����Ȃ��B";
	mes "�@�����Ƌ߂Â��Ă݂悤^000000�]";
	close;
OnTouch:
	if(CHANGE_KO_LP <= 0) {
		mes "�]^FD0260LP^000000������܂���B";
		mes "�@�X�^�[�g�n�_�ɖ߂�܂��]";
		close2;
		warp "job_ko.gat",63,16;
		end;
	}
	mes "�]�����������������Ă���]";
	next;
	mes "�]�c��1�}�X�B";
	mes "�@�������̂肾�������Ƃ��낤�]";
	next;
	mes "�]�����ȒP�ɒʂ���ɂ͂����Ȃ��B";
	mes "�@3���o����3�Ԃɖ߂��Ă��炤�]";
	next;
	mes "�]�ʒu�F39�ԃ}�X";
	mes "�@�ۗLLP�F" +CHANGE_KO_LP;
	mes "�@�T�C�R����U���1^FD0260LP^000000������܂��]";
	next;
	menu "�T�C�R����U��",-;
	set '@dice,rand(1,6);
	emotion 57+'@dice,"";
	set CHANGE_KO_LP,CHANGE_KO_LP - 1;
	mes "�]" +'@dice+ "���o�܂����B";
	if('@dice == 3) {
		mes "�@3�Ԃɖ߂�܂��]";
		close2;
		set CHANGE_KO_NOW,3;
		warp "job_ko.gat",38,16;
		end;
	}
	else {
		mes "�@�S�[���n�_�ɐi�݂܂��]";
		close2;
		warp "job_ko.gat",41,44;
		end;
	}
}

job_ko.gat,46,41,4	script	���W#ko_40	858,1,1,{
	mes "�]�S�[��";
	mes "�@^1A95E6���̕����͏������Č����Ȃ��B";
	mes "�@�����Ƌ߂Â��Ă݂悤^000000�]";
	close;
OnTouch:
	mes "�]�����������������Ă���]";
	next;
	mes "�]����Ȃ�ɂ݂֕��ނ��̂�";
	mes "�@�E�C����n�܂�̕��݂𓥂ݏo����";
	mes "�@����ɏj�����I�]";
	next;
	compquest 5137;
	delquest 5140;
	mes "�]�����̎�����B�������]";
	close2;
	warp "job_ko.gat",35,113;
	end;
}

job_ko.gat,127,125,4	script	�q���E#ko	730,{
	if(checkquest(5138)) {
		if(checkquest(5138) & 0x8) {
			mes "[�q���E]";
			mes "��������";
			mes "�M�I���l�ɕ񍐂���̂�";
			mes "�Y��Ȃ��ł��������ˁB";
			close2;
			warp "job_ko.gat",26,104;
			end;
		}
		if(!checkquest(5142)) {
			mes "[�q���E]";
			mes "�v���Ԃ�ł��ˁB";
			next;
			menu "���v���Ԃ�ł�",-;
			mes "[�q���E]";
			mes "��������Y���ꂽ���Ǝv���܂�����";
			mes "���̗l�q�ł́A";
			mes "�����Ă��Ă��ꂽ�悤�ł��ˁB";
			next;
			mes "[�q���E]";
			mes "���āA�ς���b������܂����c�c";
			mes "���͂��̂悤�ȗI���Ȃ��Ƃ�";
			mes "�b���Ă���ꍇ�ł́A";
			mes "����܂���ł����ˁB";
			next;
			mes "[�q���E]";
			mes "�ł́A���炽�߂āI";
			mes strcharinfo(0);
			mes "�ꑰ�̕���H�[�ւ悤�����I";
			next;
			mes "[�q���E]";
			mes "�̂��玄�����̈ꑰ��";
			mes "�B���Ƃ��ĔC���𐋍s���邽�߂�";
			mes "���������Ǝ��̕��������Ă��܂����B";
			next;
			menu "����ŃA�C���u���b�N�ɁH",-;
			mes "[�q���E]";
			mes "�c�c�ق��A�܂������Ă��܂������B";
			next;
			mes "[�q���E]";
			mes "���̒ʂ�ł��B";
			mes "�|�S�̓s�s�A�C���u���b�N��";
			mes "�r�����̏�����������";
			mes "�V�����Z�p���p�ɂɐ��܂�܂��B";
			next;
			mes "[�q���E]";
			mes "���̔C����";
			mes "�����������V�����Z�p���K���A���͂���";
			mes "�ꑰ�ɕ񍐂����邱�Ƃł����B";
			next;
			mes "[�q���E]";
			mes "�����Ɓc�c";
			mes "������������܂����B";
			next;
			mes "[�q���E]";
			mes "����͂��Ă���";
			mes "^6848B7�S�z�΁A�S�A�|�S�A�v���R���A";
			mes "�G���x���^�R���A�I���f�I�R�����΁A";
			mes "�G���j�E������^000000��";
			mes "�\�������Ă��܂����H";
			next;
			mes "[�q���E]";
			mes "���������V���������";
			mes "����i������Ă݂܂��傤�B";
			next;
			misceffect 191,"���쓹��#ko_01";
			mes "[�q���E]";
			mes "���쓹��͂����Ɓc�c";
			next;
			misceffect 191,"���쓹��#ko_02";
			mes "[�q���E]";
			mes "�����c�c";
			next;
			misceffect 191,"���쓹��#ko_03";
			setquest 5142;
			mes "[�q���E]";
			mes "���ꂩ��A�������ɂ�����̂�";
			mes "���R�Ɏg���Ă��������B";
			next;
			mes "[�q���E]";
			mes "����̍����ɂ���";
			mes "�����𕷂������ꍇ�ɂ�";
			mes "������x�A���ɘb�������Ă��������B";
			mes "����ł́A�n�߂Ă��������B";
			close;
		}
		if(checkquest(5145)) {
			mes "[�q���E]";
			mes "�����ł��鐬�ʂ͓����܂������H";
			next;
			switch(select("�܂��ł�","�ł��܂���","���Ă��܂���")) {
			case 1:
				mes "[�q���E]";
				mes "�����ł��鐬�ʂ�";
				mes "�ȒP�ɂ͓����܂��񂩂�ˁB";
				close;
			case 2:
				mes "[�q���E]";
				mes "�������ʂ�����ꂽ�݂����ł��ˁB";
				next;
				if(getequipid(4) != 13074 && getequipid(4) != 13312) {
					mes "[�q���E]";
					mes "����c�c�B";
					next;
					mes "[�q���E]";
					mes "���݂܂���B";
					mes "���Ȃ����b���������";
					mes "�������Ă��������܂����B";
					mes "�m�F���܂��̂ŁB";
					close;
				}
				mes "[�q���E]";
				mes "�ł͊m�F�����Ă��炢�܂��傤�B";
				next;
				mes "�]�q���E�͕������Ɏ����";
				mes "�@�ώ@���Ă���]";
				next;
				set '@ref,getequiprefinerycnt(4);
				if('@ref < 7) {
					mes "[�q���E]";
					mes "�Ȃ�قǁB";
					mes "�ǂ������ł����A";
					mes "���������A�b����K�v������܂��ˁB";
					mes "����΂��Ă��������B";
					close;
				}
				else if('@ref < 9) {
					mes "[�q���E]";
					mes "�Ȃ��Ȃ����܂��ˁB";
					mes "����Ȃ獇�i���o�������ł��B";
					mes "�Ƃ͂����A�܂������\�ł���";
					mes "����Ŋ����ł悢�ł����H";
					next;
					if(select("�͂�","������") == 2) {
						mes "[�q���E]";
						mes "�ł́A�����ł��錋�ʂ�����ꂽ��";
						mes "�܂����Ă��������B";
						close;
					}
				}
				else if('@ref == 9) {
					mes "[�q���E]";
					mes "�f���炵���c�c�B";
					mes "����Ȃ��̍��i�ł���B";
					mes "�����܂ł̏o���Ȃ�";
					mes "�ō����ڎw���Ă�����������";
					mes "����ȗ~���o�Ă������ł��B";
					next;
					mes "[�q���E]";
					mes "�ǂ��ł��傤�H";
					mes "���Ȃ����悢�̂ł�����";
					mes "����A�ō����ڎw����";
					mes "����΂��Ă������������̂ł����B";
					next;
					if(select("���ꂭ�炢�ɂ��܂�","�܂��܂������ł��܂���") == 2) {
						mes "[�q���E]";
						mes "���Ȃ��̘r�O��";
						mes "���҂����Ă��炢�܂���B";
						close;
					}
				}
				else if('@ref >= 10) {
					// ������
					mes "[�q���E]";
					mes "�f���炵���I";
					mes "����Ȃ��̍��i�ł��I";
					next;
				}
				mes "[�q���E]";
				mes "���Ȃ��̘r�O�Ɋւ��Ă͏\��";
				mes "�m�F�ł��܂����B";
				mes "���̕���̎d�グ�͎������܂��傤�B";
				mes "��������a����܂���B";
				next;
				delequip 4;
				delquest 5145;
				compquest 5138;
				delquest 5142;
				if(checkquest(5143))
					compquest 5143;
				if(checkquest(5144))
					compquest 5144;
				mes "[�q���E]";
				mes strcharinfo(0)+ "��";
				mes "����̎������I�����܂��I";
				close;
			case 3:
				mes "[�q���E]";
				mes "���������͂��ł����c�c";
				next;
				mes "[�q���E]";
				mes "�d��������܂���ˁB";
				mes "�����m�F�����Ă��炢�܂���B";
				next;
				mes "�]�������S�ĊO�ꂽ�I";
				mes "�@�q���E�������������̂��낤���H�]";
				next;
				unequip;
				if(countitem(13074) > 0 || countitem(13312) > 0) {
					mes "[�q���E]";
					mes "����c�c�H";
					mes "����i�������Ă��邶�Ⴀ��܂��񂩁B";
					close;
				}
				mes "[�q���E]";
				mes "�ӂށc�c";
				mes "�{���ɂȂ����Ă��܂����悤�ł��ˁB";
				next;
				setquest 5142;
				delquest 5143;
				delquest 5144;
				delquest 5145;
				mes "[�q���E]";
				mes "����������܂���B";
				mes "������x�A����i�������Ă��������B";
				close;
			}
		}
		mes "[�q���E]";
		mes "�V��������̎���i��";
		mes "�������܂������H";
		if(checkquest(5143) || checkquest(5144))
			set '@str$,"�͂��A�������܂���";
		next;
		switch(select("���쓹��ɂ��ĕ���","�ޗ�������Ȃ�","�����𕷂�",'@str$)) {
		case 1:
			misceffect 191,"���쓹��#ko_01";
			mes "[�q���E]";
			mes "���ꂩ�玦���ꏊ��";
			mes "���쓹�����܂��B";
			mes "�܂��͂ЂƂځB";
			next;
			misceffect 191,"���쓹��#ko_02";
			mes "[�q���E]";
			mes "�ӂ��ځB";
			next;
			misceffect 191,"���쓹��#ko_03";
			mes "[�q���E]";
			mes "�Ō�ɂ݂��ځB";
			mes "�D���ȂƂ�����g���Ă��������B";
			close;
		case 2:
			mes "[�q���E]";
			mes "�ޗ�������Ȃ��̂ł����H";
			next;
			misceffect 191,"�^���X#ko";
			mes "[�q���E]";
			mes "�X�ɖ߂�K�v������݂����ł��ˁB";
			mes "�����̃^���X�𒲂ׂĂ݂Ă��������B";
			close;
		case 3:
			mes "[�q���E]";
			mes "�ӂށA��͂�������K�v�ł����ˁH";
			next;
			mes "[�q���E]";
			mes "�܂��͍z�΂�n�����܂��B";
			mes "���x��������������邽�߂ɂ�";
			mes "������ނ̍z�΂��g���Ƃ����ł��傤�B";
			mes "�r���ōz�΂�����Ȃ��Ȃ��";
			mes "��蒼���ɂȂ��Ă��܂��̂�";
			mes "�\���Ȑ��̍z�΂�p�ӂ��Ă��������B";
			next;
			mes "[�q���E]";
			mes "�܂��A�󏭐��̍����z�΂ق�";
			mes "���Ȃ����ŏ��x�̍���������";
			mes "��邱�Ƃ��ł��܂��B";
			next;
			mes "[�q���E]";
			mes "�����ł��ˁc�c";
			mes "�����z�΂�n�����������ꍇ�A";
			mes "�S�z�΂�v���R���Ȃ�^FF000050^000000��";
			mes "�S��G���x���^�R���Ȃ�^FF000025^000000��";
			mes "�|�S��I���f�I�R�����΂Ȃ�^FF000017^000000��";
			mes "����Ώ\���ł��傤�B";
			next;
			mes "[�q���E]";
			mes "�ł����A�����̌���";
			mes "�����܂Ŗڈ��ł��B";
			mes "�n�����z�΂̑g�ݍ��킹�����";
			mes "�K�v�ɂȂ���͕ς��܂�����";
			mes "���ӂ��Ă��������ˁB";
			next;
			mes "[�q���E]";
			mes "�܂��A�z�΂̐����ɂ��Ă�";
			mes "���ӂ��Ă��������B";
			mes "���Ƃ��ΓS�z�΁A�S�A�|�S��";
			mes "���������Ă��邽��";
			mes "�������킹�ėn�����Ă�";
			mes "���x�̍����������ł���ł��傤�B";
			next;
			mes "[�q���E]";
			mes "�v���R���A�G���x���^�R��";
			mes "�I���f�I�R�����΂�";
			mes "���ꂼ�ꐫ�������Ă��܂��̂�";
			mes "�������Ƃ������܂��B";
			next;
			mes "[�q���E]";
			mes "�������I";
			mes "�����̐����͑�������̂�";
			mes "^FF0000�قȂ鐫���̍z�΂�n������";
			mes "���߂����x�������Ă��܂��܂�^000000�B";
			next;
			mes "[�q���E]";
			mes "�Ȃ��A�G���j�E�����΂�";
			mes "����Ȑ����������Ă���";
			mes "�ǂ���̐����̋����ɗn�����Ă�";
			mes "�킸���Ȃ��珃�x��";
			mes "���߂邱�Ƃ��ł��܂��B";
			next;
			mes "[�q���E]";
			mes "���x�̍���������p�ӂł�����";
			mes "���^�ɗ�������ł��������B";
			next;
			mes "[�q���E]";
			mes "�����āA�����Əē����";
			mes "�J��Ԃ��ċ�����������";
			mes "�Ō�Ɏd�グ�����Ă��������B";
			next;
			mes "[�q���E]";
			mes "�������s�\������";
			mes "����i�����₷���Ȃ�܂��B";
			mes "�����Əē�����\���ɍs���Ă���";
			mes "�d�グ�Ɉڂ��Ă��������B";
			next;
			mes "[�q���E]";
			mes "�Q�l�܂łɁA�����Əē����";
			mes "���݂ɍ�Ƃ���̂�";
			mes "�ǂ���������œK�ȕ��@�ł��B";
			next;
			mes "[�q���E]";
			mes "�����܂Ő�������Ώ\���ł��ˁH";
			mes "�����A����i������Ă݂܂��傤�I";
			close;
		case 4:
			if(checkquest(5143)) {
				mes "[�q���E]";
				mes "�ق��c�c";
				mes "�ꖳ���܂˂��Z���̗ނł����H";
				next;
				mes "[�q���E]";
				mes "�ʔ������z�ł��ˁB";
			}
			else if(checkquest(5144)) {
				mes "[�q���E]";
				mes "����͕����藠���c�c�H";
				mes "���₢��c�c";
				next;
				mes "[�q���E]";
				mes "���}�ȕ����藠���ł͂���܂���ˁI";
			}
			mes "�����b�������Ȃ���";
			mes "����Ƃ��Ďg���̂͌������ł���";
			mes "��������ɂȂ�\���������܂��ˁB";
			next;
			mes "[�q���E]";
			mes "�悵�A����Ȃ獇�i�_���o���܂��ˁB";
			next;
			mes "[�q���E]";
			mes "���ɁA����̋����ł��ˁB";
			mes "���̉��̕��ɐ��B���u������܂��B";
			mes "^0000FF���B�l��+7^000000�ɂȂ�����";
			mes "�����Ă��Ă��������B";
			next;
			mes "[�q���E]";
			mes "����ȏ㐸�B���Ă��\���܂���";
			mes "^FF0000���ʂȕ�V�Ȃǂ͂���܂���^000000����";
			mes "���ӂ��Ă��������ˁB";
			next;
			mes "[�q���E]";
			mes "���������A���B�͕K��";
			mes "^FF0000���̕����̐��B���u��";
			mes "�s�Ȃ��ĉ������B^000000";
			next;
			mes "[�q���E]";
			mes "�Ȃ��A�����ɂ��鐸�B���u�ł���";
			mes "�|�S�̓s�s�A�C���u���b�N��";
			mes "�r�����̏��ɂ��";
			mes "���삳�ꂽ���B���u�ł��̂�";
			next;
			mes "[�q���E]";
			mes "���̏ꏊ�Ő��B�����ꍇ��";
			mes "���B�̐�������";
			mes "�قȂ��Ă���悤�ł��B";
			mes "���ӂ��Ă��������B";
			next;
			mes "[�q���E]";
			mes "�܂��A^0000FF���̕����̐��B���u��";
			mes "���B�Ɏ��s���Ă�";
			mes "����͉��܂���^000000�B";
			next;
			mes "[�q���E]";
			mes "�ł����A���̐l�ɗ��񂾂�";
			mes "�����ł͂Ȃ��ꏊ�Ő��B�Ɏ��s����";
			mes "^FF0000����i���󂷂Ƃ�蒼��^000000�ɂȂ�̂�";
			mes "��Ή󂳂Ȃ��悤�ɂˁB";
			setquest 5145;
			close;
		}
	}
}

job_ko.gat,117,128,0	script	�^���X#ko	844,{
	mes "�]�����Ƃ���";
	mes "�@���ʂ̃^���X�̂悤�����c�c�]";
	next;
	if(select("�����Ƃ��Ă���","�����o�����J����") == 1) {
		mes "�]���Ȃ��́A���̏�𗣂ꂽ�]";
		close;
	}
	mes "�]�ǂ����ŋ@�B��������������c�c�]";
	close2;
	warp "amatsu.gat",147,136;
	end;
}

job_ko.gat,131,124,0	script	���쓹��#ko_01	844,{
	if(!(checkquest(5142) & 0x1)) {
		mes "�]���쓹��B";
		mes "�@���͎g���K�v���Ȃ��]";
		close;
	}
	mes "�]����𐻍삷�邽�߂̓���]";
	next;
	mes "�]�܂��͕��퐻��Ɏg��������";
	mes "�@�n�����K�v������悤���]";
	setarray '@point,20,40,60,20,40,60,20;
	while(1) {
		next;
		set '@sel,select("�S�z�΂�n����","�S��n����","�|�S��n����","�v���R����n����","�G���x���^�R����n����","�I���f�I�R�����΂�n����","�G���j�E�����΂�n����","��߂�") - 1;
		switch('@sel) {
		case 0:	set '@itemid,1002;	break;
		case 1:	set '@itemid,998;	break;
		case 2:	set '@itemid,999;	break;
		case 3:	set '@itemid,1010;	break;
		case 4:	set '@itemid,1011;	break;
		case 5:	set '@itemid,756;	break;
		case 6:	set '@itemid,757;	break;
		case 7:
			mes "�]���Ȃ��́A���̏�𗣂ꂽ�]";
			close;
		}
		if(countitem('@itemid) < '@iron['@sel]+1) {
			mes "�]������" +getitemname('@itemid)+ "�������Ă��Ȃ��]";
		}
		else {
			if('@cnt == 0)
				misceffect 302;
			mes "�]���M��^��";
			mes "�@" +getitemname('@itemid)+ "��";
			mes "�@�n�������]";
			set '@cnt,'@cnt + '@point['@sel];
			set '@iron['@sel],'@iron['@sel] + 1;
			next;
			if('@cnt < 200) {
				mes "�]�܂��܂���͒��������]";
			}
			else if('@cnt < 400) {
				mes "�]���̒��q�ŗn�����Ă������]";
			}
			else if('@cnt < 600) {
				mes "�]���낻�딼�����炢���낤���]";
			}
			else if('@cnt < 800) {
				mes "�]�����ԏ��x�������Ȃ����C������]";
			}
			else if('@cnt < 1000) {
				mes "�]���������ŏo���オ�肻�����]";
			}
			else {
				mes "�]�������邽�߂ɏ\���ȗʂ�";
				mes "�@�n���������̗p�ӂ��ł����]";
				break;
			}
		}
		next;
		mes "�]���݁A�n�������z�΂̌���";
		mes "�@�ȉ��̒ʂ�ł��]";
		next;
		mes "�]�S�z�΁F^FF0000" +'@iron[0]+ "^000000��";
		mes "�@�S�F^FF0000" +'@iron[1]+ "^000000��";
		mes "�@�|�S�F^FF0000" +'@iron[2]+ "^000000��";
		mes "�@�v���R���F^FF0000" +'@iron[3]+ "^000000��";
		mes "�@�G���x���^�R���F^FF0000" +'@iron[4]+ "^000000��";
		mes "�@�I���f�I�R�����΁F^FF0000" +'@iron[5]+ "^000000��";
		mes "�@�G���j�E�����΁F^FF0000" +'@iron[6]+ "^000000�]";
		next;
		mes "�]���͂ǂ̋�����n���������H�]";
		continue;
	}
	next;
	mes "�]���͒��^�ɗn�������������悤�B";
	mes "�@�ǂ̒��^���g�������H�]";
	next;
	switch(select("�Z���p�̒��^","�����藠���p�̒��^")) {
	case 1:
		mes "�]�Z���p�̒��^��";
		mes "�@�n���������𗬂����񂾁]";
		set '@type,1;
		break;
	case 2:
		mes "�]�����藠���p�̒��^��";
		mes "�@�n���������𗬂����񂾁]";
		set '@type,2;
		break;
	}
	next;
	misceffect 101;
	mes "�]������x�`�͐������悤���B";
	mes "�@���͂ǂ�ȍ�Ƃ����悤���H�]";
	next;
	switch(select("������Ƃ�����","�ē����Ƃ�����")) {
	case 1:
		misceffect 21,"";
		set '@cnt,1;
		mes "�]������Ƃ��s�����]";
		next;
		mes "�]�܂��܂���͒��������B";
		mes "�@���͏Ă������Ƃ����悤�]";
		break;
	case 2:
		misceffect 101,"";
		set '@cnt,2;
		mes "�]�ē����Ƃ��s�����]";
		next;
		mes "�]�܂��܂���͒��������B";
		mes "�@���͏Ă������Ƃ����悤�]";
		break;
	}
	while(1) {
		next;
		mes "�]���͂ǂ�ȍ�Ƃ����悤���H�]";
		next;
		switch(select("������Ƃ�����","�ē����Ƃ�����","�d�グ��Ƃ�����")) {
		case 1:
			misceffect 21,"";
			if('@cnt == 2) {
				set '@cnt2,'@cnt2 + 1;
			}
			set '@cnt,1;
			mes "�]������Ƃ��s�����]";
			next;
			if('@cnt2 < 3)
				mes "�]�܂��܂���͒��������B";
			else if('@cnt2 < 6)
				mes "�]�����ƒb����K�v�����肻�����B";
			else if('@cnt2 < 9)
				mes "�]���̒��q�Œb���Ă������B";
			else if('@cnt2 < 12)
				mes "�]�����Ԓb�����Ă����B";
			else if('@cnt2 < 15)
				mes "�]���������ŏo���オ�肻�����B";
			else {
				mes "�]���낻��d�グ��Ƃ����悤�]";
				continue;
			}
			mes "�@���͏Ă������Ƃ����悤�]";
			continue;
		case 2:
			misceffect 101,"";
			if('@cnt == 1) {
				set '@cnt2,'@cnt2 + 1;
			}
			set '@cnt,2;
			mes "�]�ē����Ƃ��s�����]";
			next;
			if('@cnt2 < 3)
				mes "�]�܂��܂���͒��������B";
			else if('@cnt2 < 6)
				mes "�]�����ƒb����K�v�����肻�����B";
			else if('@cnt2 < 9)
				mes "�]���̒��q�Œb���Ă������B";
			else if('@cnt2 < 12)
				mes "�]�����Ԓb�����Ă����B";
			else if('@cnt2 < 15)
				mes "�]���������ŏo���オ�肻�����B";
			else {
				mes "�]���낻��d�グ��Ƃ����悤�]";
				continue;
			}
			mes "�@���͌�����Ƃ����悤�]";
			continue;
		case 3:
			mes "�]�d�グ��ƂƂ���";
			mes "�@����̂�������s�����]";
			next;
			misceffect 101;
			delitem 1002,'@iron[0];
			delitem 998,'@iron[1];
			delitem 999,'@iron[2];
			delitem 1010,'@iron[3];
			delitem 1011,'@iron[4];
			delitem 756,'@iron[5];
			delitem 757,'@iron[6];
			if('@cnt2 < 15) {
				misceffect 183,"";
				mes "�]�d�グ��Ƃ̓r����";
				mes "�@����i�����Ă��܂����]";
				next;
				mes "�]����ߒ��ɖ�肪";
				mes "�@�������̂�������Ȃ��c�c�B";
				mes "�@�ŏ������蒼�����]";
				close;
			}
			misceffect 103,"";
			if('@type == 1) {
				compquest 5142;
				setquest 5143;
				getitem 13074,1;
			}
			else {
				compquest 5142;
				setquest 5144;
				getitem 13312,1;
			}
			mes "�]����i�����������]";
			next;
			mes "�]�q���E�Ɋ����i�������悤�]";
			close;
		}
	}
}

job_ko.gat,129,129,0	duplicate(���쓹��#ko_01)	���쓹��#ko_02	844
job_ko.gat,116,124,0	duplicate(���쓹��#ko_01)	���쓹��#ko_03	844

job_ko.gat,121,121,0	script	���B���u#ko_01	844,{
	if(!checkquest(5143) && !checkquest(5144)) {
		mes "�]���B�������ōs���Ă���鑕�u���B";
		mes "�@���������͎g���K�v���Ȃ����낤�]";
		close;
	}
	mes "�]���B���u�ɓd������ꂽ�B";
	mes "�@�Â��ȉ��ƂƂ��ɑ��u�������o�����]";
	next;
	mes "�]���u�̉���";
	mes "�@�I���f�I�R�����������q�ɂ�����";
	mes "�@�����ɐ��B���ł��������]";
	next;
	if(select("���B����","���B���Ȃ�") == 2) {
		mes "�]���u�̓d����؂����]";
		close;
	}
	if(getequipisequiped(4)==0) {
		mes "�]�s�[�s�[�s�[";
		mes "�@���u����x��������������]";
		next;
		mes "[�q���E]";
		mes "���B���������̂Ȃ�";
		mes "����𑕔����Ă��������ˁB";
		close;
	}
	if(getequipid(4) != 13074 && getequipid(4) != 13312) {
		mes "[�q���E]";
		mes "����H";
		mes "�����ō��������ł͂���܂���ˁB";
		next;
		mes "[�q���E]";
		mes "����������������̂Ȃ�";
		mes "�X�̒b�艮�ɂł�����ł��������B";
		close;
	}
	mes "�]����𕪐͂��Ă��܂��]";
	next;
	if(getequiprefinerycnt(4) >= 10) {
		// ������
		mes "�]���̕���͂���ȏ㐸�B�ł��܂���]";
		close;
	}
	if(getequippercentrefinery(4) < 100) {
		mes "�]���̕���͉��x�����B����Ă��邽��";
		mes "�@���B�Ɏ��s�����";
		mes "�@���B�l���ЂƂ�����܂��]";
		next;
		if(select("���B����","���B���Ȃ�") == 2) {
			mes "�]���u�̓d����؂����]";
			close;
		}
	}
	else {
		mes "�]���B���n�߂܂��]";
		next;
	}
	if(getequippercentrefinery(4) > rand(100)) {
		successrefitem 4;
		mes "�]���B�ɐ������܂����]";
		close;
	}
	else {
		downrefitem 4;
		mes "�]���B�Ɏ��s���܂����B";
		mes "�@���B�l���ЂƂ�����܂����]";
		close;
	}
}

job_ko.gat,127,121,0	duplicate(���B���u#ko_01)	���B���u#ko_02	844

job_ko.gat,148,46,4	script	������ �M�I��#ko	588,{
	switch(CHANGE_KO) {
	case 10:
		cutin "job_ko01",2;
		mes "[������ �M�I��]";
		mes "�܂��ڕW��|���Ă��Ȃ��悤����ȁB";
		next;
		mes "[������ �M�I��]";
		mes "�ڕW�̖���^FF0000�ꑰ�̉ߋ�^000000����B";
		next;
		mes "[������ �M�I��]";
		mes "���܂��d���߂���";
		mes "�܂��b�������Ă���B";
		mes "����Ƃ��A�O�ɏo�����̂��H";
		next;
		if(select("�o�Ȃ�","�O�ɏo��") == 1) {
			mes "[������ �M�I��]";
			mes "�����悤�Ȗ��O�̓G��������";
			mes "���Ȃ��Ȃ�d���߂��邶��낤�B";
			close2;
			cutin "job_ko01",255;
			end;
		}
		mes "[������ �M�I��]";
		mes "�{���Ȃ玎���̍Œ���";
		mes "�����o���Ȃǋ�����ʎ����Ⴊ�c�c";
		mes "���񂾂����Ⴜ�B";
		close2;
		cutin "job_ko01",255;
		warp "amatsu.gat",147,136;
		end;
	case 11:
		cutin "job_ko02",2;
		mes "[������ �M�I��]";
		mes "���܂��ڕW���d���߂��悤����ȁB";
		next;
		if(Weight) {
			mes "[������ �M�I��]";
			mes "�V���ȓ��̑�����";
			mes "�]�v�Ȃ��͕̂s�v����낤�B";
			mes "�����i��a�����Ă�邩��A";
			mes "���ׂėa���Ă���܂��b�����Ă���B";
			next;
			switch(select("^0000FF�q��^000000���J��","��߂�")) {
			case 1:
				mes "[������ �M�I��]";
				mes "�q�ɂ��J�����B";
				close2;
				openstorage;
				cutin "job_ko02",255;
				end;
			case 2:
				mes "[������ �M�I��]";
				mes "�Ȃ񂶂�A�܂��Ȃɂ�����̂��H";
				close2;
				cutin "job_ko02",255;
				end;
			}
		}
		cutin "job_ko04",2;
		mapannounce "job_ko.gat","������ �M�I�� : �ꑰ" +strcharinfo(0)+ "��" +(Sex? "�e�T": "�O")+ "�̓���i�ނ��ƂƂȂ����B���̎҂ɏj������I",0;
		mes "[������ �M�I��]";
		mes "�ꑰ" +strcharinfo(0)+ "��";
		mes (Sex? "�e�T": "�O")+ "�̓���i�ނ��ƂƂȂ����B";
		mes "���̎҂ɏj������I";
		next;
		cutin "job_ko02",2;
		mes "[������ �M�I��]";
		mes "�X�Ȃ�ɂ݂����߂��҂�";
		mes "���ꂽ���Ƃ����}���悤�B";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "�M�I���l�A���΂����҂����B";
		next;
		cutin "job_ko04",2;
		mes "[������ �M�I��]";
		mes "���܂�A���܂�B";
		mes "���Ȃ���̂��Ƃ�Y��Ă������B";
		mes "����" +strcharinfo(0)+ "��";
		mes "�`���邱�Ƃł����邩�́H";
		next;
		cutin "job_ko01",255;
		mes "[�N�E�K�E�J�C]";
		mes "����ł́c�c";
		next;
		mes "[�N�E�K�E�J�C]";
		mes strcharinfo(0);
		mes "���O�͌ւ�ׂ��䓙���ꑰ�̒��Ԃ��B";
		mes "�����Ȃ鎞�����X�Ƌ��𒣂��Đ�����B";
		next;
		mes "[�N�E�K�E�J�C]";
		mes "�c�c���߂ĉ�����Ƃ�";
		mes "�����Ȃ�U�����Ĉ��������c�c";
		next;
		mes "[�q���E]";
		mes "�ӂӁc�c";
		mes "�J�C�̂�͌��t�����ł����B";
		mes "���͔ނ���";
		mes "�𗧂��̂𑡂�܂��傤�B";
		next;
		mes "[�q���E]";
		mes "�N�����������i��";
		mes "���������Ă����܂����B";
		next;
		mes "[�q���E]";
		if(checkquest(5143) & 0x8) {
			// ������
			mes "����̖��́u�g�v�B";
			mes "���������Ă��邤����";
			mes "�S�C���������܂��悤�ȕ���ɂȂ�܂����B";
			set '@gain,13075;
		}
		else if(checkquest(5144) & 0x8) {
			mes "[�q���E]";
			mes "����̖��́u�e�v�B";
			mes "���������Ă��邤����";
			mes "�Èłɗn�����ނ悤�ȕ���ɂȂ�܂����B";
			set '@gain,13311;
		}
		next;
		mes "[�q���E]";
		mes "�����ƋC�ɓ����Ă��炦���";
		mes "�v���܂���B";
		next;
		mes "[�q���E]";
		mes "�ł̓M�I���l�A�������c�c";
		next;
		cutin "job_ko01",2;
		mes "[������ �M�I��]";
		mes "�ӂ��ӂ��ӂ��c�c";
		mes "��l�ɑ䎌������Ă��܂����ȁB";
		mes "�킵����b�����Ƃ͉����Ȃ��B";
		next;
		mes "[������ �M�I��]";
		mes "�����A���Ȃ��̂悤�Ȏ�҂�";
		mes "�����Ɨǂ�����";
		mes "����Ă��Ȃ������̂��S�c�肶��B";
		next;
		mes "[������ �M�I��]";
		mes "���ꂩ����O�����ɕ���ł���B";
		mes "�����āc�c";
		next;
		if(sc_ison(SC_ALL_RIDING)) {
			// ������
			mes "[������ �M�I��]";
			mes "�ށA�V���ȗ������̏�����";
			mes "�ł��Ă��Ȃ��悤����ȁB";
			mes "�R�搶����";
			mes "�~��ė���̂���B";
			close2;
			cutin "job_ko01",255;
			end;
		}
		if(SkillPoint) {
			mes "[������ �M�I��]";
			mes "�ށA�V���ȗ������̏�����";
			mes "�ł��Ă��Ȃ��悤����ȁB";
			mes "�X�L���|�C���g��";
			mes "�S�ĐU���ė���̂���B";
			close2;
			cutin "job_ko01",255;
			end;
		}
		resetstatus;
		resetskill;
		jobchange (Sex? Job_Kagerou: Job_Oboro);
		set CHANGE_KO,0;
		delquest 5136;
		delquest 5137;
		delquest 5138;
		delquest 5143;
		delquest 5144;
		delquest 72905;
		setquest 201655;
		getitem '@gain,1;
		mes "[������ �M�I��]";
		mes "���Ȃ��̍s�����";
		mes "�e�T�l�ƞO�l�̏j��������񂱂Ƃ��I";
		close2;
		warp "que_ng.gat",22,69;
		end;
	default:
		mes "[������ �M�I��]";
		mes "���Ȃ��̍s�����";
		mes "�e�T�l�ƞO�l�̏j��������񂱂Ƃ��I";
		close2;
		warp "que_ng.gat",22,69;
		end;
	}
}

job_ko.gat,151,47,4	script	�N�E�K�E�J�C#ko2	730,{
	mes "[�N�E�K�E�J�C]";
	mes "�M�l�������܂ŗ������c�c";
	close;
}

job_ko.gat,145,47,6	script	�q���E#ko2	730,{
	mes "[�q���E]";
	mes "�₠�A���悢��ł��ˁB";
	close;
}

job_ko.gat,0,0,0	script	ko_test_mon	139,{
OnTimer300000:
	initnpctimer;
	killmonster "job_ko.gat","ko_test_mon::OnKilled1";
	set '@r,rand(getarraysize('mobid));
	areamonster "job_ko.gat",128,26,168,66,"�ꑰ�̉ߋ�",'mobid['@r],1,"ko_test_mon::OnKilled1";
	end;
OnInit:
	setarray 'mobid,1002,1010,1031,1049,1050,1063,1113;
	setarray 'mobname$,
		"�ꑰ�̃n�Y��","�ꑰ�̉e�T","�ꑰ�̞O","�ꑰ�̉���","�ꑰ�̈�Y",
		"�ꑰ�̉���","�ꑰ�̉ߌ�","�ꑰ�̍����j","�ꑰ�̎n�c",
		"�e�T�̋L��","�e�T�̉ߋ�","�e�T�̑z���o","�e�T�̗��j",
		"�O�̋L��","�O�̉ߋ�","�O�̑z���o","�O�̗��j",
		"�ߌ�̈ꑰ","�E�҂̈ꑰ","���̃o�J","�e���̈�Y","�e���̉ߋ�";

	set '@r,rand(getarraysize('mobid));
	areamonster "job_ko.gat",128,26,168,66,"�ꑰ�̉ߋ�",'mobid['@r],1,"ko_test_mon::OnKilled1";

	for(set '@i,110; '@i<=171; set '@i,'@i+1) {
		set '@r1,rand(getarraysize('mobid));
		set '@r2,rand(getarraysize('mobname$));
		monster "job_ko.gat",'@i,50,'mobname$['@r2],'mobid['@r1],1,"ko_test_mon::OnKilled2";
	}
	for(set '@i,31; '@i<=81; set '@i,'@i+1) {
		set '@r1,rand(getarraysize('mobid));
		set '@r2,rand(getarraysize('mobname$));
		monster "job_ko.gat",140,'@i,'mobname$['@r2],'mobid['@r1],1,"ko_test_mon::OnKilled2";
	}
	initnpctimer;
	end;
OnKilled1:
	if(CHANGE_KO == 10)
		set CHANGE_KO,11;
	end;
OnKilled2:
	if(rand(2)) {
		set '@x,rand(110,171);
		set '@y,50;
	}
	else {
		set '@x,140;
		set '@y,rand(31,81);
	}
	set '@r1,rand(getarraysize('mobid));
	set '@r2,rand(getarraysize('mobname$));
	monster "job_ko.gat",'@x,'@y,'mobname$['@r2],'mobid['@r1],1,"ko_test_mon::OnKilled2";
	if(!rand(3))
		warp "job_ko.gat",16,113;
	end;
}

que_ng.gat,75,23,3	script	�b��t �e�[�l#ko	762,{
	mes "[�b��t �e�[�l]";
	mes "���@���킵�イ�������܂��B";
	mes "�b��t�ł����Ƃ���V��������";
	mes "�����Ă���e�[�l�ł������܂��B";
	next;
	mes "[�b��t �e�[�l]";
	mes "�����͂������������܂��傤���B";
	next;
	switch(select("�ǂ�Ȏd�����ł��܂����H","�\�͂�ǉ����Ă�������","�\�͂��폜���Ă�������")) {
	case 1:
		mes "[�b��t �e�[�l]";
		mes "�����ƁI";
		mes "���߂̎��ȏЉ�ɕs��������܂����ˁB";
		mes "�\���󂲂����܂���B";
		next;
		mes "[�b��t �e�[�l]";
		mes "���͈ꕔ�̑����i��";
		mes "�\�͂�ǉ����邱�Ƃ��ł��܂��B";
		mes "���̍ۂɂ͑����̎萔����";
		mes "�����������ƂɂȂ��Ă���܂��B";
		next;
		mes "[�b��t �e�[�l]";
		mes "�Ȃ��A�����i�̐��B�l�ɂ���āA";
		mes "�t�^�����\�͕͂ω��������܂��B";
		mes "�܂��A^FF0000�\�͂̕t�^��";
		mes "���s���邱�Ƃ͂���܂���B^000000";
		next;
		mes "[�b��t �e�[�l]";
		mes "��舵���Ă��鑕���i�̃��X�g��";
		mes "�����ɂȂ�܂����H";
		next;
		switch(select("����̃��X�g������","�h��̃��X�g������")) {
		case 1:
			mes "[�b��t �e�[�l]";
			mes "����̃��X�g�͂�����ł��B";
			next;
			mes "[�b��t �e�[�l]";
			mes "������舵���Ă��镐���^FD3302";
			mes "������";
			mes "�O����";
			mes "�����藠���E����";
			mes "�����藠���E����";
			mes "�����藠���E���J^000000�ł��B";
			next;
			mes "[�b��t �e�[�l]";
			mes "�ȏ�ł��B";
			mes "����ɑ����̕������舵���ɂ�";
			mes "�܂��܂������C�s��";
			mes "�d�˂Ȃ��Ă͂����܂���B";
			next;
			mes "[�b��t �e�[�l]";
			mes "���]�݂ł����";
			mes "3�Ԃ�4�Ԃ̃X���b�g��";
			mes "�\�͂�ǉ��������܂��B";
			close;
		case 2:
			mes "[�b��t �e�[�l]";
			mes "�h��̃��X�g�͂�����ł��B";
			next;
			mes "[�b��t �e�[�l]";
			mes "������舵���Ă���h���^FD3302";
			mes "�T��l�̎�b";
			mes "�O������l�̎�b";
			mes "�~�؂̊Z";
			mes "�����ŉe";
			mes "����E�҃X�[�c[1]^000000�ł��B";
			next;
			mes "[�b��t �e�[�l]";
			mes "�ȏ�ł��B";
			mes "����ɑ����̕������舵���ɂ�";
			mes "�܂��܂������C�s��";
			mes "�d�˂Ȃ��Ă͂����܂���B";
			next;
			mes "[�b��t �e�[�l]";
			mes "���]�݂ł����";
			mes "3�Ԃ�4�Ԃ̃X���b�g��";
			mes "�\�͂�ǉ��������܂��B";
			close;
		}
	case 2:
		mes "[�b��t �e�[�l]";
		mes "�\�͂̒ǉ��ł������܂��ˁB";
		mes "�����Ȃ����Ă��镐���";
		mes "4�ԃX���b�g�A3�ԃX���b�g�̏���";
		mes "�\�͂�t�^�������܂��B";
		next;
		mes "[�b��t �e�[�l]";
		mes "���̓Ƒn�I�ȋZ�p�ɂ��";
		mes "^FF0000���B�l^000000�₷�łɑ}���Ă���^FF0000�J�[�h^000000��";
		mes "�����邱�Ƃ͂������܂���B";
		mes "�܂��A^FF0000�\�͂̕t�^��";
		mes "���s���邱�Ƃ�����܂���B^000000";
		next;
		mes "[�b��t �e�[�l]";
		mes "�����ޗ��̒l�i������܂��̂�";
		mes "������^5565AA�萔��^000000�����������Ă���܂��B";
		next;
		mes "[�b��t �e�[�l]";
		mes "�����ƁA�����������Ȃ��Ă��܂�";
		mes "�\���󂲂����܂���B";
		mes "�ǂ̑����ɔ\�͂�t�^���܂����H";
		next;
		switch(select("����","�h��")) {
		case 1:
			mes "[�b��t �e�[�l]";
			mes "����ւ̔\�͕t�^�����]�݂ł��ˁB";
			mes "����ɔ\�͂�t�^����^E14A1E�萔����";
			mes "1��100,000Zeny^000000�ƂȂ��Ă���܂��B";
			next;
			mes "[�b��t �e�[�l]";
			mes "����ƁA���炩����^FF0000�Ў蕐��͉E���";
			mes "��������^000000���������܂����B";
			mes "�����͂����肢�������܂��B";
			next;
			mes "[�b��t �e�[�l]";
			mes "�ǂ̕���ɔ\�͂�t�^�������܂����H";
			next;
			switch(select("�܂����x","������","�O����","�����藠���E����","�����藠���E����","�����藠���E���J")) {
			case 1:
				mes "[�b��t �e�[�l]";
				mes "���l�������̎��Ԃ��K�v�ł��傤���H";
				mes "�܂����ł����炵�Ă��������B";
				close;
			case 2: set '@itemid,13076; set '@menu,4; break;
			case 3: set '@itemid,13078; set '@menu,4; break;
			case 4: set '@itemid,13313; set '@menu,4; break;
			case 5: set '@itemid,13314; set '@menu,4; break;
			case 6: set '@itemid,13315; set '@menu,4; break;
			}
			break;
		case 2:
			mes "[�b��t �e�[�l]";
			mes "�h��ւ̔\�͕t�^�����]�݂ł��ˁB";
			mes "�h��ɔ\�͂�t�^����^E14A1E�萔����";
			mes "1��100,000Zeny^000000�ƂȂ��Ă���܂��B";
			next;
			mes "[�b��t �e�[�l]";
			mes "�ǂ̖h��ɔ\�͂�t�^���܂����H";
			next;
			switch(select("�܂����x","�T��l�̎�b","�O������l�̎�b","�~�؂̊Z","�����ŉe","����E�҃X�[�c[1]")) {
			case 1:
				mes "[�b��t �e�[�l]";
				mes "���l�������̎��Ԃ��K�v�ł��傤���H";
				mes "�܂����ł����炵�Ă��������B";
				close;
			case 2: set '@itemid,2172; set '@menu,3; break;
			case 3: set '@itemid,2173; set '@menu,3; break;
			case 4: set '@itemid,15054; set '@menu,2; break;
			case 5: set '@itemid,15055; set '@menu,2; break;
			case 6: set '@itemid,15056; set '@menu,2; break;
			}
			break;
		}
		break;
	case 3:
		mes "[�b��t �e�[�l]";
		mes "���łɕt�^���ꂽ�\�͂�";
		mes "�폜�����]�݂ł����H";
		mes "�t�^���ꂽ�\�͂�";
		mes "���C�ɏ����Ȃ������悤�ł��ˁB";
		next;
		mes "[�b��t �e�[�l]";
		mes "����ł́A���т��э����萔����";
		mes "�����������ƂƂȂ�";
		mes "�\���킯����܂��񂪁c�c";
		next;
		mes "[�b��t �e�[�l]";
		mes "^E14A1E�\�͍폜�萔����100,000Zeny^000000�ł��B";
		mes "�ǂ̑����̔\�͂��폜���܂����H ";
		next;
		switch(select("�܂����x","������","�O����","�����藠���E����","�����藠���E����","�����藠���E���J","�T��l�̎�b","�O������l�̎�b","�~�؂̊Z","�����ŉe","����E�҃X�[�c�m1�n")) {
		case 1:
			mes "[�b��t �e�[�l]";
			mes "��͂�萔�����S���傫���̂ł��ˁH";
			mes "�萔��������������������悤";
			mes "�����Ɠw�͂��d�˂܂��B";
			close;
		case 2: set '@itemid,13076; set '@menu,4; break;
		case 3: set '@itemid,13078; set '@menu,4; break;
		case 4: set '@itemid,13313; set '@menu,4; break;
		case 5: set '@itemid,13314; set '@menu,4; break;
		case 6: set '@itemid,13315; set '@menu,4; break;
		case 7: set '@itemid,2172; set '@menu,3; break;
		case 8: set '@itemid,2173; set '@menu,3; break;
		case 9: set '@itemid,15054; set '@menu,2; break;
		case 10:set '@itemid,15055; set '@menu,2; break;
		case 11:set '@itemid,15056; set '@menu,2; break;
		}
		mes "[�b��t �e�[�l]";
		mes "^44B7BC" +getitemname('@itemid)+ "^000000��";
		mes "�\�͏����������]�݂ł����H";
		next;
		mes "[�b��t �e�[�l]";
		mes "�萔���͂��̂܂܂ŁA4�ԃX���b�g��";
		mes "�\�͂��c���A3�ԃX���b�g�̔\�݂͂̂�";
		mes "�폜����T�[�r�X���s���Ă���܂��B";
		mes "�Ȃ��A4�ԃX���b�g�̔\�݂͂̂�";
		mes "�폜���邱�Ƃ͂ł��܂���B";
		next;
		switch(select("3�ԃX���b�g�̂ݏ���������","��������������")) {
		case 1:
			mes "[�b��t �e�[�l]";
			mes "���m�������܂����B";
			mes "3�ԃX���b�g�̂ݏ������������܂��B";
			set '@type,1;
			break;
		case 2:
			mes "[�b��t �e�[�l]";
			mes "���m�������܂����B";
			mes "�����̃X���b�g���������������܂��B";
			set '@type,2;
			break;
		}
		next;
		if(getequipid('@menu) != '@itemid) {
			mes "[�b��t �e�[�l]";
			mes "��Ƃ���]�̑����i��";
			mes "��������Ă��Ȃ��悤�ł��B";
			next;
			mes "[�b��t �e�[�l]";
			mes "����]�̑����i�𑕔�������Ԃ�";
			mes "�����p�����肢�������܂��B";
			close;
		}
		if(Zeny < 100000) {
			mes "[�b��t �e�[�l]";
			mes "��ϐ\���󂲂����܂���";
			mes "�萔��������Ȃ��悤�ł��B";
			next;
			mes "[�b��t �e�[�l]";
			mes "���ޗ����ƂĂ������Ȃ���";
			mes "�K�v�Œ���̎萔����";
			mes "�����������ƂɂȂ��Ă���܂��B";
			close;
		}
		set '@refine,getequiprefinerycnt('@menu);
		set '@card1,getequipcardid('@menu,0);
		set '@card2,getequipcardid('@menu,1);
		set '@card3,getequipcardid('@menu,2);
		set '@card4,getequipcardid('@menu,3);
		if('@type == 1) {
			if('@card3 == 0) {
				mes "[�b��t �e�[�l]";
				mes "3�Ԃɂ͔\�͂�����܂���B";
				mes "���m�F�����肢�������܂��B";
				close;
			}
			set '@card3,0;
		}
		else if('@type == 2) {
			if('@card3 == 0 && '@card4 == 0) {
				mes "[�b��t �e�[�l]";
				mes "�\�͂��t�^����Ă��Ȃ������ł��B";
				mes "���m�F�����肢�������܂��B";
				close;
			}
			set '@card3,0;
			set '@card4,0;
		}
		set Zeny,Zeny-100000;
		delequip '@menu;
		getitem2 '@itemid,1,1,'@refine,0,'@card1,'@card2,'@card3,'@card4;
		mes "[�b��t �e�[�l]";
		mes "�����������������������܂����B";
		close;
	}
	// �\�͕t�^����
	if(getequipid('@menu) != '@itemid) {
		mes "[�b��t �e�[�l]";
		mes "��Ƃ���]�̑����i��";
		mes "��������Ă��Ȃ��悤�ł��B";
		next;
		mes "[�b��t �e�[�l]";
		mes "����]�̑����i�𑕔�������Ԃ�";
		mes "�����p�����肢�������܂��B";
		close;
	}
	if(Zeny < 100000) {
		mes "[�b��t �e�[�l]";
		mes "��ϐ\���󂲂����܂���";
		mes "�萔��������Ȃ��悤�ł��B";
		next;
		mes "[�b��t �e�[�l]";
		mes "���ޗ����ƂĂ������Ȃ���";
		mes "�K�v�Œ���̎萔����";
		mes "�����������ƂɂȂ��Ă���܂��B";
		close;
	}
	set '@refine,getequiprefinerycnt('@menu);
	set '@card1,getequipcardid('@menu,0);
	set '@card[1],'@card1;
	set '@card2,getequipcardid('@menu,1);
	set '@card[2],'@card2;
	set '@card3,getequipcardid('@menu,2);
	set '@card[3],'@card3;
	set '@card4,getequipcardid('@menu,3);
	set '@card[4],'@card4;
	if('@card4 == 0) {
		mes "[�b��t �e�[�l]";
		mes "�\�͂��t�^����ĂȂ������ł��B";
		mes "4�ԃX���b�g��";
		mes "�\�͂�t�^�������܂����H";
		set '@slot,4;
	}
	else if('@card3 == 0) {
		mes "[�b��t �e�[�l]";
		mes "���ł�4�ԃX���b�g��";
		mes "�\�͂��t�^���ꂽ�����i�ł��B";
		mes "3�ԃX���b�g�ɂ�";
		mes "�\�͂�t�^�������܂����H";
		set '@slot,3;
	}
	else {
		mes "[�b��t �e�[�l]";
		mes "���̗͂ł͂���ȏ��";
		mes "�\�͕t�^�͓���ł��B";
		next;
		mes "[�b��t �e�[�l]";
		mes "�����t�^���ꂽ�\�͂�";
		mes "���C�ɏ����Ȃ��̂ł�����";
		mes "���������s���Ă݂Ă͂������ł��傤�H";
		close;
	}
	next;
	if(select("�܂����x�ɂ���","�t�^����") == 1) {
		mes "[�b��t �e�[�l]";
		mes "���m�������܂����B";
		mes "�܂����炵�Ă��������B";
		close;
	}
	mes "[�b��t �e�[�l]";
	mes "����ł́A" +'@slot+ "�ԃX���b�g�ւ�";
	mes "�\�͕t�^��Ƃ��s���܂��B";
	next;
	misceffect 154;
	set Zeny,Zeny-100000;
	delequip '@menu;
	if('@refine <= 4) {
		set '@rand,rand(1,26);
		setarray '@rate[1],20,16,14,13,7,3,1,0;
		setarray '@tbl_enchant[1],4786,4787,4788,4789,4791,4792,4793,4794;
	}
	else if('@refine <= 7) {
		set '@rand,rand(1,44);
		setarray '@rate[1],41,38,35,32,29,26,20,16,14,13,7,3,1,0;
		setarray '@tbl_enchant[1],4700,4710,4720,4730,4740,4750,4786,4787,4788,4789,4791,4792,4793,4794;
	}
	else if('@refine <= 9) {
		set '@rand,rand(1,36);
		setarray '@rate[1],32,28,24,20,16,12,10,8,6,4,2,0;
		setarray '@tbl_enchant[1],4700,4701,4710,4711,4720,4721,4730,4731,4740,4741,4750,4751;
	}
	else {
		set '@rand,rand(1,46);
		setarray '@rate[1],42,38,36,35,33,32,28,24,20,16,12,10,8,6,4,2,0;
		setarray '@tbl_enchant[1],4795,4796,4797,4800,4801,4700,4701,4710,4711,4720,4721,4730,4731,4740,4741,4750,4751;
	}
	for(set '@j,1; '@j <= getarraysize('@rate); set '@j,'@j+1) {
		if ('@rand > '@rate['@j]) {
			set '@card['@slot],'@tbl_enchant['@j];
			break;
		}
	}
	getitem2 '@itemid,1,1,'@refine,0,'@card[1],'@card[2],'@card[3],'@card[4];
	mes "[�b��t �e�[�l]";
	mes "^44B7BC" +getitemname('@itemid)+ "^000000";
	mes "�ɔ\�͂�t�^�������܂����B";
	close;
}

que_ng.gat,21,72,6	script	�h��E�l �M��#kaboro	934,{
	mes "[�M��]";
	mes "�����Ƃ͉����ƍl���Ă���H";
	mes "�G��|�����c�c";
	mes "�m���ɂ��̒ʂ肾�B";
	mes "�����A������d�v�Ȏ�������B";
	mes "����́A";
	mes "�����ē|��Ȃ����Ƃ��I";
	next;
	mes "[�M��]";
	mes "���ׂ̈ɂ͐g�����K�v������B";
	mes "�u���g�v�����Ȃ��҂�";
	mes "�u���l�v����鎖�Ȃǂł��Ȃ��B";
	next;
	if(select("�h����쐬����","��b���I����") == 2) {
		mes "[�M��]";
		mes "�T�d�ɂȂ邱�Ƃ�";
		mes "�퓬�łƂĂ��d�v�ȗv�f���B";
		close;
	}
	switch(select("�T��l�̎�b[1]","�O������l�̎�b[1]","�~�؂̊Z[1]","�����ŉe[1]","��߂�")) {
	case 1:
		mes "[�M��]";
		mes "�T��l�̎�b[1]���B";
		mes "�쐫�I�Ȃ��̂�I�񂾂ȁB";
		while(1) {
			next;
			switch(select("�ޗ�������","���\������","�쐬����","��߂�")) {
			case 1:
				mes "[�M��]";
				mes "^ff0000�T��l�̎�b[1]��";
				mes "�L�c�l��l�̎�b[1]1��";
				mes "�T�̌�10��^000000";
				mes "���K�v���B";
				mes "�������邾��H";
				mes "�M���R���オ���Ă���T�̌����B";
				continue;
			case 2:
				mes "[�T��l�̎�b[1]]";
				mes "�����U���������A���m����";
				mes "5�b�ԁAAtk + 100";
				mes "Flee - 50";
				next;
				mes "[�T��l�̎�b[1]]";
				mes "[�~�؂̊Z]";
				mes "�Ƌ��ɑ������A�ǉ���";
				mes "Str + 2";
				mes "�����U���ŗ^����_���[�W + 10%";
				next;
				mes "[�T��l�̎�b[1]]";
				mes "�n�� : ��";
				mes "�h�� : 70";
				mes "�d�� : 25";
				mes "�v�����x�� : 100";
				mes "���� : �e�T �O";
				continue;
			case 3:
				set '@gain,2172;
				setarray '@need,2171,6252;
				setarray '@amount,1,10;
				break;
			case 4:
				mes "[�M��]";
				mes "�悭�A�l����Ƃ����B";
				close;
			}
			break;
		}
		break;
	case 2:
		mes "[�M��]";
		mes "�O������l�̎�b[1]���B";
		mes "�������A�����ǂ����������";
		mes "�㓙�Ȉ�i���B";
		while(1) {
			next;
			switch(select("�ޗ�������","���\������","�쐬����","��߂�")) {
			case 1:
				mes "[�M��]";
				mes "^ff0000�O������l�̎�b[1]��";
				mes "�L�c�l��l�̎�b[1]1��";
				mes "�����̂�����100��^000000";
				mes "���K�v�ɂȂ�B";
				mes "����ɂ��A�����̂悤�ɓ�����";
				mes "�������O���������ނ��ƂɂȂ�B";
				continue;
			case 2:
				mes "[�O������l�̎�b[1]]";
				mes "���B�l��1�オ��x�ɁA";
				mes "�X�L���f�B���C - 2%";
				mes "[�����ŉe]";
				mes "�Ƌ��ɑ������A�ǉ���";
				mes "Flee + 10";
				mes "���S��� + 10";
				next;
				mes "[�O������l�̎�b[1]]";
				mes "�n�� : ��";
				mes "�h�� : 45";
				mes "�d�� : 25";
				mes "�v�����x�� : 100";
				mes "���� : �e�T �O";
				continue;
			case 3:
				set '@gain,2173;
				setarray '@need,2171,7321;
				setarray '@amount,1,100;
				break;
			case 4:
				mes "[�M��]";
				mes "�悭�A�l����Ƃ����B";
				close;
			}
			break;
		}
		break;
	case 3:
		mes "[�M��]";
		mes "�~�؂̊Z[1]���B";
		mes "����͂��ē`���ƂȂ��Ă���";
		mes "�E�҂��g�ɒ����Ă������̂炵���B";
		while(1) {
			next;
			switch(select("�ޗ�������","���\������","�쐬����","��߂�")) {
			case 1:
				mes "[�M��]";
				mes "^ff0000�~�؂̊Z[1]��";
				mes "�Η��̗�30�A";
				mes "�X�̗�30�A";
				mes "�N���̗�30��^000000";
				mes "���K�v�ɂȂ�B";
				continue;
			case 2:
				mes "[�~�؂̗�[1]]";
				mes "MaxHP + 15%";
				mes "MaxSP - 30%";
				next;
				mes "[�~�؂̗�[1]]";
				mes "[�T�͗l�̎�b]";
				mes "�Ƌ��ɑ������A�ǉ���";
				mes "Str + 2";
				mes "�����U���ŗ^����_���[�W + 10%";
				next;
				mes "[�~�؂̗�[1]]";
				mes "�n�� : �Z";
				mes "�h�� : 90";
				mes "�d�� : 180";
				mes "�v�����x�� : 100";
				mes "���� : �e�T �O";
				continue;
			case 3:
				set '@gain,15054;
				setarray '@need,7451,7562,6091;
				setarray '@amount,30,30,30;
				break;
			case 4:
				mes "[�M��]";
				mes "�悭�A�l����Ƃ����B";
				close;
			}
			break;
		}
		break;
	case 4:
		mes "[�M��]";
		mes "�����ŉe[1]���c�c�B";
		mes "����͖��ɉB��łɕ���A";
		mes "�g�����ׂɍ��ꂽ�����B";
		while(1) {
			next;
			switch(select("�ޗ�������","���\������","�쐬����","��߂�")) {
			case 1:
				mes "[�M��]";
				mes "^ff0000�����ŉe[1]�ɂ�";
				mes "����E�҃X�[�c[1]";
				mes "�Èł̔j��10��^000000";
				mes "���K�v�ɂȂ�B";
				continue;
			case 2:
				mes "[�����ŉe[1]]";
				mes "Agi + 1";
				mes "�����U�����󂯂����A";
				mes "���m���Ŏ����ɃI�[�g�X�y��";
				mes "[���p-�e����-]Lv1����";
				next;
				mes "[�����ŉe[1]]";
				mes "[�O�����͗l�̎�b]";
				mes "�Ƌ��ɑ������A�ǉ���";
				mes "���S��� + 10";
				mes "Flee + 10";
				next;
				mes "[�����ŉe[1]]";
				mes "�n�� : �Z";
				mes "�h�� : 60";
				mes "�d�� : 150";
				mes "�v�����x�� : 100";
				mes "���� : �e�T �O";
				continue;
			case 3:
				set '@gain,15055;
				setarray '@need,15056,6089;
				setarray '@amount,1,10;
				break;
			case 4:
				mes "[�M��]";
				mes "�悭�A�l����Ƃ����B";
				close;
			}
			break;
		}
		break;
	}
	mes "[�M��]";
	mes "�쐬�̍ۂɂ͒��ӓ_������B";
	mes "�쐬�Ɏg�p����ޗ�������";
	mes "�����������Ă���ꍇ�A";
	mes "^ff0000�ǂ���ޗ��ɂ��邩�͎w��ł��Ȃ��B^000000";
	mes "�ޗ��Ɏg�p������̂�������������Ԃ�";
	mes "����悤�ɋC��t���Ă���B";
	next;
	mes "[�M��]";
	mes "��Ō�����Ă�����Ȃ�����ȁB";
	mes "�ł́A�쐬���邪�������H";
	next;
	if(select("�쐬����","��߂�") == 2) {
		mes "[�M��]";
		mes "�悭�A�l����Ƃ����B";
		close;
	}
	for(set '@i,0; '@amount['@i]!=0; set '@i,'@i+1) {
		if(countitem('@need['@i]) < '@amount['@i]) {
			mes "[�M��]";
			mes "�c�c�B";
			mes "�ޗ����s�����Ă���悤���ȁB";
			switch('@gain) {
			case 2172:
				mes "^ff0000�T��l�̎�b[1]��";
				mes "�L�c�l��l�̎�b[1]1��";
				mes "�T�̌�10��^000000";
				break;
			case 2173:
				mes "^ff0000�O������l�̎�b[1]��";
				mes "�L�c�l��l�̎�b[1]1��";
				mes "�����̂�����100��^000000";
				break;
			case 15054:
				mes "^ff0000�~�؂̊Z[1]��";
				mes "�Η��̗�30�A�X�̗�30�A";
				mes "�N���̗�30��^000000";
				break;
			case 15055:
				mes "^ff0000�����ŉe[1]�ɂ�";
				mes "����E�҃X�[�c[1]";
				mes "�Èł̔j��10��^000000";
				break;
			}
			mes "���K�v���B";
			mes "�悭�T���Č��Ă���B";
			close;
		}
	}
	if(checkitemblank() == 0) {
		mes "[�M��]";
		mes "�ו�����������悤���B";
		mes "�ׂ����炵�Ă���";
		mes "�܂����Ă���B";
		close;
	}
	if(checkweight('@gain,1) == 0) {
		mes "[�M��]";
		mes "�ו����d������悤���B";
		mes getitemid('@gain)+ "[1]�͏d��" +(getiteminfo('@gain,6)/10)+ "���B";
		mes "�ׂ��y�����Ă���";
		mes "�܂����Ă���B";
		close;
	}
	for(set '@i,0; '@amount['@i]!=0; set '@i,'@i+1)
		delitem '@need['@i],'@amount['@i];
	getitem '@gain,1;
	mes "[�M��]";
	mes "���ށB�o�������B";
	mes "�������c�c�B";
	close;
}

que_ng.gat,23,70,3	script	����E�l �L�[#kaboro	939,{
	mes "[�L�[]";
	mes "�U���͍ő�̖h��";
	mes "�Ƃ������t������B";
	mes "���͂ȕ��킱���A";
	mes "��������Ă����B";
	next;
	mes "[�L�[]";
	mes "�K�v�ȍޗ�������΁A";
	mes "���ʂȕi��񋟂��悤�B";
	next;
	if(select("������쐬����","��b���I����") == 2) {
		mes "[�L�[]";
		mes "�T�d�߂���̂���肾�B";
		close;
	}
	switch(select("������[1]","�O����[1]","�����藠���E����[2]","��߂�")) {
	case 1:
		mes "[�L�[]";
		mes "������[1]��";
		mes "������x�C����ς񂾎҂���";
		mes "�����Ȃ�������킾�B";
		while(1) {
			next;
			switch(select("�ޗ����݂�","���\���݂�","�쐬����","��߂�")) {
			case 1:
				mes "[�L�[]";
				mes "^ff0000�������͑��J[2]1��";
				mes "�K�[�l�b�g1��^000000";
				mes "���K�v�ɂȂ�B";
				mes "�K�[�l�b�g�����������L�̔������F��";
				mes "���o���Ă����B";
				continue;
			case 2:
				mes "[������[1]]";
				mes "Int + 3";
				mes "Matk + 100";
				next;
				mes "[������[1]]";
				mes "�n�� : �Z��";
				mes "�U�� : 120";
				mes "�d�� : 60";
				mes "���탌�x�� : 3";
				mes "�v�����x�� : 110";
				mes "���� : �e�T �O";
				continue;
			case 3:
				set '@gain,13076;
				setarray '@need,13013,718;
				setarray '@amount,1,1;
				break;
			case 4:
				mes "[�L�[]";
				mes "�悭�A�l���Ă݂鎖���B";
				close;
			}
			break;
		}
		break;
	case 2:
		mes "[�L�[]";
		mes "�O����[1]���c�c�B";
		mes "�O�����̂悤�ɋȂ���������Ȑ��B";
		mes "���̎d�オ����o����҂�";
		mes "�ő��ɂ��Ȃ���i���B";
		while(1) {
			next;
			switch(select("�ޗ����݂�","���\���݂�","�쐬����","��߂�")) {
			case 1:
				mes "[�L�[]";
				mes "^ff0000�O����[1]�͔��n[1]1��";
				mes "�I�p�[��1��^000000";
				mes "���K�v�ɂȂ�B";
				mes "�I�p�[�����O�����̌���";
				mes "����ɋP������B";
				continue;
			case 2:
				mes "[�O����[1]]";
				mes "Matk + 120�A";
				mes "�X�L���g�p��";
				mes "����SP - 5%";
				mes "�X�L���g�p��";
				mes "�r������ - 5%";
				next;
				mes "[�O����[1]]";
				mes "�n�� : �Z��";
				mes "�U�� : 50";
				mes "�d�� : 60";
				mes "���탌�x�� : 4";
				mes "�v�����x�� : 100";
				mes "���� : �e�T �O";
				continue;
			case 3:
				set '@gain,13078;
				setarray '@need,13015,727;
				setarray '@amount,1,1;
				break;
			case 4:
				mes "[�L�[]";
				mes "�悭�A�l���Ă݂鎖���B";
				close;
			}
			break;
		}
		break;
	case 3:
		mes "[�L�[]";
		mes "�����藠���E����[2]���B";
		mes "������{���ɔ������B";
		mes "�N�͉Ԃт炪�����p��";
		mes "�������Ƃ����邩�H";
		while(1) {
			next;
			switch(select("�ޗ����݂�","���\���݂�","�쐬����","��߂�")) {
			case 1:
				mes "[�L�[]";
				mes "^ff0000�����藠���E����[2]��";
				mes "�����藠���E����[2]1��";
				mes "��ꂽ�藠��100��^000000";
				mes "���K�v�ɂȂ�B";
				mes "�藠�����������߂ɕK�v�����A";
				mes "�������������߂��B";
				continue;
			case 2:
				mes "[�����藠���E����[2]]";
				mes "Matk + 50";
				mes "�X�L�� [�����藠��-����-]";
				mes "�ŗ^����_���[�W + 20%";
				next;
				mes "�n�� : �����藠��";
				mes "�U�� : 150";
				mes "�d�� : 150";
				mes "���탌�x�� : 3";
				mes "�v�����x�� : 110";
				mes "���� : �e�T �O";
				continue;
			case 3:
				set '@gain,13313;
				setarray '@need,13304,7156;
				setarray '@amount,1,100;
				break;
			case 4:
				mes "[�L�[]";
				mes "�悭�A�l���Ă݂鎖���B";
				close;
			}
			break;
		}
		break;
	case 4:
		mes "[�L�[]";
		mes "�悭�A�l���Ă݂鎖���B";
		close;
	}
	mes "[�L�[]";
	mes "�쐬�̍ۂɂ͒��ӓ_������B";
	mes "�쐬�Ɏg�p����ޗ�������";
	mes "�����������Ă���ꍇ�A";
	mes "^ff0000�ǂ���ޗ��ɂ��邩�͎w��ł��Ȃ��B^000000";
	mes "�ޗ��Ɏg�p������̂�������������Ԃ�";
	mes "����悤�ɋC��t���Ă���B";
	next;
	mes "[�L�[]";
	mes "��Ō�����Ă�����Ȃ�����ȁB";
	mes "�ł́A�쐬���邪�������H";
	next;
	if(select("�쐬����","��߂�") == 2) {
		mes "[�L�[]";
		mes "�悭�A�l���Ă݂鎖���B";
		close;
	}
	for(set '@i,0; '@amount['@i]!=0; set '@i,'@i+1) {
		if(countitem('@need['@i]) < '@amount['@i]) {
			mes "[�L�[]";
			mes "�ʖڂ��B�ޗ�������Ȃ��B";
			switch('@gain) {
			case 13076:
				mes "������[1]�ɕK�v�ȍޗ���";
				mes "^ff0000�������͑��J[2]1��";
				mes "�K�[�l�b�g1��^000000";
				break;
			case 13078:
				mes "�O����[1]�ɕK�v�ȍޗ���";
				mes "^ff0000���n[1]1��";
				mes "�I�p�[��1��^000000";
				break;
			case 13313:
				mes "�����藠���E����[2]�ɕK�v�ȍޗ���";
				mes "^ff0000�����藠���E����[2]1��";
				mes "��ꂽ�藠��100��^000000";
				break;
			}
			mes "�ȏゾ�B";
			mes "�ޗ��𑕔����Ă��Ă͑ʖڂ����B";
			close;
		}
	}
	if(checkitemblank() == 0) {
		mes "[�L�[]";
		mes "�ו�����������悤���B";
		mes "�ׂ����炵�Ă���";
		mes "�܂����Ă���B";
		close;
	}
	if(checkweight('@gain,1) == 0) {
		mes "[�L�[]";
		mes "�ו����d������悤���B";
		mes getitemid('@gain)+ "[" +getiteminfo('@gain,10)+ "]�͏d��" +(getiteminfo('@gain,6)/10)+ "���B";
		mes "�ׂ��y�����Ă���";
		mes "�܂����Ă���B";
		close;
	}
	for(set '@i,0; '@amount['@i]!=0; set '@i,'@i+1)
		delitem '@need['@i],'@amount['@i];
	getitem '@gain,1;
	mes "[�L�[]";
	mes "���ށB�o�������B";
	mes "�������c�c�B";
	close;
}