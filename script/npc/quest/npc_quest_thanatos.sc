//= Auriga Script ==============================================================
// Ragnarok Online Thanatos Tower Script	by refis
//==============================================================================
//�Ԃ̃J�M
tha_t03.gat,67,70,0	script	�@�B�̑��u#tt1	111,{
	if(checkitemblank() == 0) {
		mes "�]�����A�C�e���̎�ސ�����������";
		mes "�A�C�e�����󂯂Ƃ邱�Ƃ��ł��܂���]";
		mes "�]�����A�C�e�������炵�Ă���A�ēx";
		mes "�b�������Ă��������]";
		close;
	}
	if(countitem(7421) || countitem(7426)) {
		mes "�]�������͗l�̋@�B�̑��u���A";
		mes "�����ȉ����o���Ȃ��瓮���Ă�]";
		close;
	}
	mes "�]�����͂��@�B�̑��u�𕢂��Ă���]";
	next;
	if(select("�����͂���菜��","��������")==2) {
		mes "�]�������@���Ȃ����A";
		mes "�l���Ă݂邱�Ƃɂ����]";
		close;
	}
	if(getequipweaponlv(4) < 4) {
		mes "�]�����Ă��镐���";
		mes "�@�B�̑��u�Ɍ������āA";
		mes "�v��������U�艺�낵���]";
		mes "�]�������A���؂鉹�����������ŁA";
		mes "�@�B�̑��u�𕢂��Ă���͂�";
		mes "��菜�����Ƃ͂ł��Ȃ������]";
		next;
		mes "�]�����Ƌ��͂ȕ��킪�K�v�Ȃ悤���]";
		close;
	}
	mes "�]�����Ă���͂Ɍ������āA";
	mes "^nItemID^" +getequipid(4);
	mes "���v��������U�艺�낵���]";
	next;
	mes "�]����ƁA^nItemID^" +getequipid(4);
	mes "�ƕ����Ă����͂��Ԃ���A";
	mes "�o�V�b!!���Ƃ������Ƌ���";
	mes "�����������]";
	next;
	if(select("�@�B�̑��u�𒲂ׂ�","��������")==2) {
		mes "�]���ɒ�������K�v�͂Ȃ��������]";
		close;
	}
	mes "�]�@�B�̑��u�𒲂ׂĂ���ƁA";
	mes "�s�[�[�b!!���Ƃ������Ƌ��ɁA";
	mes "��ʂ�����ꂽ�]";
	mes "�]���炭�A������������";
	mes "�G��Ă��܂����������낤�]";
	next;
	if(select("��ʂ�����","��ʂ𖳎�����")==2) {
		mes "�]��ʂ𖳎����A";
		mes "�@�B�̑��u�𒲂ׂĂ݂�ƁA";
		mes "�[�̕��ɂ��܂��Ă���";
		mes "���̂悤�ȕ����������]";
		mes "�]�c�c�P�Ȃ錮�ł͂Ȃ��������]";
		getitem 7421,1;
		close;
	}
	mes "�Q�[�g�̕���Z�p�����ɂ����";
	mes "�J�����ꂽ�Z�p�𗘗p���A";
	mes "���͐΂��ʂ̏ꏊ�ɕ��󂵂��B";
	next;
	mes "����ŃQ�[�g�Ɩ��͐΂𕕈󂵂��B";
	mes "�����A�����͒N���ɁA���̕���";
	mes "������Ă��܂���������Ȃ��B";
	next;
	mes "���ɁA�ނ�ɂƂ��ẮA";
	mes "����Ȃɓ�����ł�";
	mes "�Ȃ���������Ȃ��B";
	mes "�����ŁA�Q�[�g�𕕈󂷂钼�O�ɁA";
	mes "�Q�[�g�Ɍq������W��ύX�����B";
	next;
	mes "�ǂ��֌q���������́A";
	mes "���m�ɂ͊m�F�ł��Ȃ������B";
	mes "�������A�������痬��o���C�́A";
	mes "���E�̂��̂Ƃ͈قȂ�A";
	mes "���邢�����������̂ŁA";
	mes "���ɐS�z����K�v�͂Ȃ��������B";
	next;
	mes "�]��ʂɕ\������Ă�����e�͈ȏゾ�]";
	mes "�]������������A";
	mes "���̑O��̕��͂����݂���Ǝv����]";
	next;
	if(select("�����������ׂĂ݂�","���ׂ�̂���߂�")==2)
		close;
	mes "�]�@�B�̑��u�����X�܂Œ��ׂĂ݂�ƁA";
	mes "�[�̕��ɂ��܂��Ă���";
	mes "���̂悤�ȕ����������]";
	mes "�]�c�c�P�Ȃ錮�ł͂Ȃ��������]";
	getitem 7421,1;
	close;
}

//���̃J�M
tha_t04.gat,195,195,0	script	�@�B�̑��u#tt2	111,{
	if(checkitemblank() == 0) {
		mes "�]�����A�C�e���̎�ސ�����������";
		mes "�A�C�e�����󂯂Ƃ邱�Ƃ��ł��܂���]";
		mes "�]�����A�C�e�������炵�Ă���A�ēx";
		mes "�b�������Ă��������]";
		close;
	}
	if(countitem(7422) || countitem(7427)) {
		mes "�]�@�B�̑��u�́A���̉���������";
		mes "��~���Ă���]";
		close;
	}
	mes "�]�@�B�̑��u���悭����ƁA";
	mes "������Ƃ����傫����";
	mes "��ʂ̉��ɐ���������]";
	mes "�]���̐����ɐG��Ă݂�ƁA";
	mes "�s�[�[�b!!���Ƃ������Ƌ���";
	mes "��ʂɕ���������ꂽ�]";
	next;
	mes "[���]";
	mes "�O���̐�������͂��Ă��������B";
	mes "�u0�v��d�����鐔����";
	mes "�g�p�ł��܂���B";
	mes "�܂��A���͔͈͂�";
	mes "�����Ȃ��悤�ɂ��Ă��������B";
	next;
	setarray '@list,1,2,3,4,5,6,7,8,9;
	for(set '@i,0; '@i < 3; set '@i,'@i+1) {
		set '@r,rand(getarraysize('@list));
		set '@ans['@i],'@list['@r];
		deletearray '@list['@r],1;
	}
	for(set '@cnt,0; '@cnt < 10; set '@cnt,'@cnt+1) {
		input '@temp;
		if('@temp < 100 || '@temp > 999) {
			mes "[���]";
			mes "���͔͈͒���!!";
			close;
		}
		setarray '@num,'@temp/100,'@temp%100/10,'@temp%100%10;
		if('@num[0] == 0 || '@num[1] == 0 || '@num[2] == 0 || '@num[0] == '@num[1] || '@num[1] == '@num[2] || '@num[0] == '@num[2]) {
			mes "[���]";
			mes "���͒l�Ɂu0�v�܂��͏d����������!!";
			continue;
		}
		mes "[���]";
		mes "���͐����F^0000ff" +'@num[0]+ "^000000,^0000ff" +'@num[1]+ "^000000,^0000ff" +'@num[2]+ "^000000";
		mes "�c�c�ƍ����c�c�B";
		next;
		if('@num[0] == '@ans[0])
			set '@match,'@match+1;
		if('@num[0] == '@ans[1] || '@num[0] == '@ans[2])
			set '@shift,'@shift+1;
		if('@num[1] == '@ans[1])
			set '@match,'@match+1;
		if('@num[1] == '@ans[0] || '@num[1] == '@ans[2])
			set '@shift,'@shift+1;
		if('@num[2] == '@ans[2])
			set '@match,'@match+1;
		if('@num[2] == '@ans[0] || '@num[2] == '@ans[1])
			set '@shift,'@shift+1;
		if('@match == 3)
			break;
		mes "[���]";
		mes "�s�B�[�[�b!!";
		mes "�Ԉ���Ă��܂�!!";
		next;
		mes "[���]";
		mes "�����̐�������v���Ă���̂́A^ff0000"+ '@match +"^000000�A";
		mes "����������v���Ă���̂́A^ff0000"+ '@shift +"^000000�ł��B";
		next;
		set '@match,0;
		set '@shift,0;
		continue;
	}
	if('@cnt == 10) {
		mes "[���]";
		mes "���F�ԍ��F^ff0000" +'@ans[0]+ "^000000,^ff0000" +'@ans[1]+ "^000000,^ff0000" +'@ans[2]+ "^000000";
		mes "���F�ԍ���ύX���܂��B";
		close;
	}
	mes "[���]";
	mes "���F����܂����B";
	mes "�ڑ��������܂��B";
	next;
	mes "�]���̕��͂��\������ď�������Ɓc�c";
	mes "�܂��A�V���ȕ��͂��\�����ꂽ�]";
	mes "�]��ʂ̉��ɂ����������������A";
	mes "�����ɋ󓴂��ł����]";
	next;
	switch(select("��ʂ̕��͂�ǂ�","�󓴂̒����̂����Ă݂�","���ɉ������Ȃ�")) {
	case 1:
		mes "�܂�A�ޏ���������֗����̂ɂ́A";
		mes "����ړI���������B���̖ړI�Ƃ́A";
		mes "�܂��ɁA���������N�ł���B";
		next;
		mes "���ꂩ��A������ő�K�͂�";
		mes "�����̐Ղ��������B";
		mes "���̐Ղ́A����Ȉ�̌̂�";
		mes "�l�Ԃ̑傫���̑����̌̂�";
		mes "�킢�ɂ����̂��Ǝv����B";
		next;
		mes "�����́A���������N��";
		mes "�ޏ��̒��ԒB�Ɛ��肳�ꂽ�B";
		mes "�퓬�̌��ʁA���炭�A���������N��";
		mes "�[���ȑŌ����󂯁A��������P�ނ��A";
		mes "��։������悤�������B";
		next;
		mes "�����āA�����N�Ƒ�����";
		mes "�ޏ��̒��ԒB���A�����N��";
		mes "�ǂ������Ă������Ղ��c���Ă����B";
		next;
		mes "�������A�ޏ��̐Ղ́A";
		mes "����ɑ����Ă��Ȃ������B";
		next;
		mes "���S�N�o�������Ȃ��A";
		mes "���̐Ղ͎c���Ă���ɂ�������炸�A";
		mes "�ޏ��̐Ղ��������Ă���Ƃ����_�ɁA";
		mes "�^�₪�c�����c�c�B";
		mes "�����A���ǁA";
		mes "����ȏ�̂��Ƃ͔���Ȃ������B";
		next;
		mes "�]���̌�ɂȂ��镶�͂͂Ȃ��]";
		next;
		if(select("��ʂ̉��̋󓴂̒����̂����Ă݂�","���ɉ������Ȃ�")==2)
			close;
	case 2:
		break;
	case 3:
		close;
	}
	mes "�]�����̂����Ă݂�ƁA";
	mes "���̖T��ɋP�����̂��������]";
	mes "�]���̕��̂����o���Ă݂�ƁA";
	mes "���̂悤�Ȍ`�����Ă����]";
	mes "�]�c�c�P�Ȃ錮�ł͂Ȃ��������]";
	getitem 7422,1;
	close;
}

//�̃J�M
tha_t05.gat,101,37,0	script	�@�B�̑��u#tt3	111,{
	if(checkitemblank() == 0) {
		mes "�]�����A�C�e���̎�ސ�����������";
		mes "�A�C�e�����󂯂Ƃ邱�Ƃ��ł��܂���]";
		mes "�]�����A�C�e�������炵�Ă���A�ēx";
		mes "�b�������Ă��������]";
		close;
	}
	if(countitem(7423) || countitem(7428)) {
		mes "�]��̕��ɏ����͗l������ȊO�́A";
		mes "���ɕς�����Ƃ���͂Ȃ��]";
		close;
	}
	mes "�]�@�B�̑��u���ӂɁA";
	mes "���ȋ�C���������]";
	mes "�]�@�B�̑��u���悭���Ă݂����A";
	mes "�X�C�b�`�Ȃǂ͈�،�������Ȃ��]";
	next;
	mes "�]�������A���u�̐^�񒆂�";
	mes "�����\������Ă��Ȃ�";
	mes "�ΐF�̉�ʂ�����]";
	switch(getareausers("tha_t05.gat",101,37,106,42)) {
	case 0:
		mes "�]����ȊO�ɂ́A";
		mes "���ɕς�����_�͂Ȃ��]";
		close;
	case 1:
		mes "�]����ȊO�ɂ́A";
		mes "���ɕς�����_�͂Ȃ��]";
		next;
		mes "�]�ӂƁA������Ă݂�ƁA";
		mes "������Ƃ����͗l���������]";
		close;
	case 2:
		next;
		mes "�]���̎��ӂ��悭���Ă݂�ƁA";
		mes "���u�̒�̕�����A";
		mes "�����Ă���l�Ɍ�������";
		mes "�����Ȍ����o�Ă���]";
		close;
	default:
		break;
	}
	mes "�]�@�B�̑��u�ɋߕt���ƁA";
	mes "���u�̒�̂����肩��";
	mes "�����Ȍ����o�n�߂��]";
	mes "�]����ƁA�s�[�[�b�Ƃ������Ƌ���";
	mes "���u�̑O�ʂɂ����ʂ�";
	mes "�������\�����ꂽ�]";
	next;
	mes "�]�����āA���̉���";
	mes "�󓴂�����ꂽ�]";
	next;
	switch(select("��ʂ�����","�󓴂𒲂ׂ�","�������Ȃ�")) {
	case 1:
		mes "���̌�A������𔭂Ƃ��Ǝv�������A";
		mes "�����Ō������Q�[�g�̑��݂�";
		mes "�C������ł������B";
		mes "�����N�����A���ƃQ�[�g�������A";
		mes "��������p������A";
		mes "�嗤�ɐr��Ȕ�Q�������炷���炾�B";
		next;
		mes "�����Ŏ��́A�Q�[�g�Ɠ���";
		mes "���󂷂邱�Ƃɂ����B";
		next;
		mes "�ނ�ɋC�Â���Ȃ��悤��";
		mes "��Ƃ����Ȃ���΂Ȃ�Ȃ������̂ŁA";
		mes "���̐i�s���x�͂��Ȃ�x�������B";
		mes "���ׁ̈A�Q�[�g�̕����Ƃ�";
		mes "���Ȃ�̔N����v�����B";
		next;
		mes "�����Ƃ��n�߂�O�ɁA";
		mes "�܂��A�Q�[�g�̒����������B";
		mes "���̉ߒ��ŁA�����͂�����";
		mes "���͐΂��������������ꂽ�B";
		next;
		mes "�����̌��ʁA";
		mes "�����̓Q�[�g���ێ�����";
		mes "�͂̌��ł��邱�Ƃ��������B";
		mes "�����ŁA���͐΂�ʂ̏ꏊ��";
		mes "���󂷂邱�Ƃɂ����B";
		next;
		mes "�]���̌�ɂȂ��镶�͂͂Ȃ��]";
		close;
	case 2:
		mes "�]�󓴂̓������悭���Ă݂�ƁA";
		mes "���̓����ɋP�����̂��������]";
		mes "�]��������o���Ă݂�ƁA";
		mes "���̂悤�Ȍ`�����Ă����]";
		getitem 7423,1;
		close;
	case 3:
		close;
	}
}

//�΂̃J�M
tha_t06.gat,43,152,0	script	�@�B�̑��u#tt4	111,{
	if(checkitemblank() == 0) {
		mes "�]�����A�C�e���̎�ސ�����������";
		mes "�A�C�e�����󂯂Ƃ邱�Ƃ��ł��܂���]";
		mes "�]�����A�C�e�������炵�Ă���A�ēx";
		mes "�b�������Ă��������]";
		close;
	}
	if(countitem(7424) || countitem(7429)) {
		mes "�]�傫�Ȏ��Ԃ���~���Ă���]";
		close;
	}
	mes "�]�傫�Ȏ��Ԃ������Ă���";
	mes "�@�B�̑��u������]";
	mes "�]�@�B�̈�ʂɂ́A";
	mes "�����\������Ă��Ȃ�";
	mes "��ʂ�����]";
	next;
	if(select("�����������ׂ�","�C�ɂ��Ȃ����Ƃɂ���")==2) {
		mes "�]�����̑��u�̂悤�����A";
		mes "�C�ɂ���悤�Ȃ��Ƃ͂Ȃ��������]";
		close;
	}
	if(countitem(7421) <= 0 && countitem(7422) <= 0 && countitem(7423) <= 0) {
		mes "�]���Ԃ������Ȍ��𔭂��Ă��邪�A";
		mes "�P�ɓ����Ă��邾���ŁA";
		mes "����ȊO�͉��̕ϓN���Ȃ��]";
		close;
	}
	mes "�]���Ԃ𒲂ׂĂ݂�Ɓc�c";
	mes "�����Ă����J�M�Ǝ��Ԃ��A";
	mes "�����Ȍ��ƂƂ���";
	mes "�����o���n�߂��]";
	mes "�]���΂炭����ƁA�����~�񂾁]";
	next;
	switch(select("�@�B�̖{�̂𒲂ׂ�","���Ԃ𒲂ׂ�","�C�ɂ��Ȃ����Ƃɂ���")) {
	case 1:
		mes "�]�@�B�̖{�̂ɂ́A�����������Ȃ��]";
		mes "�]��ʂɂ��A�����������Ȃ��]";
		close;
	case 2:
		mes "�]���Ԃ𒲂ׂ邽�߁A";
		mes "���ԂɐG��Ă݂��Ƃ���A";
		mes "���Ԃ������������邱�Ƃ��������]";
		next;
		mes "�]���Ԃ������������ׂĂ݂��]";
		next;
		mes "�]���̌��ʁA";
		mes "����������2�Ƒ傫������3��";
		mes "�v5�̎��Ԃ𓮂����邱�Ƃ��������]";
		next;
		mes "�]���������Ԃ́A�㉺�֓��������Ƃ�";
		mes "�������Ƃ��ł���悤���]";
		mes "�]�傫�����Ԃ́A�㉺�Ɛ�����";
		mes "���������Ƃ��ł���悤���]";
		next;
		while(1) {
			mes "�]���Ԃ𓮂����Ă݂悤�]";
			switch(select("��ԏ���������","��Ԗڂɏ���������","��ԑ傫������","��Ԗڂɑ傫������","�O�Ԗڂɑ傫������","���݂̏�Ԃ�����","�S�Č��ʂ�ɂ���")) {
			case 1:
				switch(select("��֏グ��","���։�����","����")) {
				case 1:
					set '@wheels[0],2;
					if('@wheels[0] == 2 && '@wheels[1] == 2 && '@wheels[2] == 2 && '@wheels[3] == 2 && '@wheels[4] == 2)
						break;
					continue;
				case 2:
					set '@wheels[0],1;
					if('@wheels[0] == 1 && '@wheels[1] == 1 && '@wheels[2] == 1 && '@wheels[3] == 1 && '@wheels[4] == 1)
						break;
					continue;
				case 3:
					set '@wheels[0],3;
					if('@wheels[0] == 3 && '@wheels[1] == 3 && '@wheels[2] == 3 && '@wheels[3] == 3 && '@wheels[4] == 3)
						break;
					continue;
				}
				break;
			case 2:
				switch(select("��֏グ��","���։�����","����")) {
				case 1:
					set '@wheels[1],3;
					if('@wheels[0] == 3 && '@wheels[1] == 3 && '@wheels[2] == 3 && '@wheels[3] == 3 && '@wheels[4] == 3)
						break;
					continue;
				case 2:
					set '@wheels[1],2;
					if('@wheels[0] == 2 && '@wheels[1] == 2 && '@wheels[2] == 2 && '@wheels[3] == 2 && '@wheels[4] == 2)
						break;
					continue;
				case 3:
					set '@wheels[1],1;
					if('@wheels[0] == 1 && '@wheels[1] == 1 && '@wheels[2] == 1 && '@wheels[3] == 1 && '@wheels[4] == 1)
						break;
					continue;
				}
				break;
			case 3:
				switch(select("��֏グ��","���։�����","�����ɓ�����")) {
				case 1:
					set '@wheels[2],1;
					if('@wheels[0] == 1 && '@wheels[1] == 1 && '@wheels[2] == 1 && '@wheels[3] == 1 && '@wheels[4] == 1)
						break;
					continue;
				case 2:
					set '@wheels[2],3;
					if('@wheels[0] == 3 && '@wheels[1] == 3 && '@wheels[2] == 3 && '@wheels[3] == 3 && '@wheels[4] == 3)
						break;
					continue;
				case 3:
					set '@wheels[2],2;
					if('@wheels[0] == 2 && '@wheels[1] == 2 && '@wheels[2] == 2 && '@wheels[3] == 2 && '@wheels[4] == 2)
						break;
					continue;
				}
				break;
			case 4:
				switch(select("��֏グ��","���։�����","�����ɓ�����")) {
				case 1:
					set '@wheels[3],2;
					if('@wheels[0] == 2 && '@wheels[1] == 2 && '@wheels[2] == 2 && '@wheels[3] == 2 && '@wheels[4] == 2)
						break;
					continue;
				case 2:
					set '@wheels[3],3;
					if('@wheels[0] == 3 && '@wheels[1] == 3 && '@wheels[2] == 3 && '@wheels[3] == 3 && '@wheels[4] == 3)
						break;
					continue;
				case 3:
					set '@wheels[3],1;
					if('@wheels[0] == 1 && '@wheels[1] == 1 && '@wheels[2] == 1 && '@wheels[3] == 1 && '@wheels[4] == 1)
						break;
					continue;
				}
				break;
			case 5:
				switch(select("��֏グ��","���։�����","�����ɓ�����")) {
				case 1:
					set '@wheels[4],2;
					if('@wheels[0] == 2 && '@wheels[1] == 2 && '@wheels[2] == 2 && '@wheels[3] == 2 && '@wheels[4] == 2)
						break;
					continue;
				case 2:
					set '@wheels[4],1;
					if('@wheels[0] == 1 && '@wheels[1] == 1 && '@wheels[2] == 1 && '@wheels[3] == 1 && '@wheels[4] == 1)
						break;
					continue;
				case 3:
					set '@wheels[4],3;
					if('@wheels[0] == 3 && '@wheels[1] == 3 && '@wheels[2] == 3 && '@wheels[3] == 3 && '@wheels[4] == 3)
						break;
					continue;
				}
				break;
			case 6:
				if('@wheels[0] == 0)      mes "��ԏ��������ԁF���̂܂�";
				else if('@wheels[0] == 1) mes "��ԏ��������ԁF����";
				else if('@wheels[0] == 2) mes "��ԏ��������ԁF���";
				else if('@wheels[0] == 3) mes "��ԏ��������ԁF����";

				if('@wheels[1] == 0)      mes "��Ԗڂɏ��������ԁF���̂܂�";
				else if('@wheels[1] == 1) mes "��Ԗڂɏ��������ԁF����";
				else if('@wheels[1] == 2) mes "��Ԗڂɏ��������ԁF����";
				else if('@wheels[1] == 3) mes "��Ԗڂɏ��������ԁF���";

				if('@wheels[2] == 0)      mes "��ԑ傫�����ԁF���̂܂�";
				else if('@wheels[2] == 1) mes "��ԑ傫�����ԁF���";
				else if('@wheels[2] == 2) mes "��ԑ傫�����ԁF������";
				else if('@wheels[2] == 3) mes "��ԑ傫�����ԁF����";

				if('@wheels[3] == 0)      mes "��Ԗڂɑ傫�����ԁF���̂܂�";
				else if('@wheels[3] == 1) mes "��Ԗڂɑ傫�����ԁF������";
				else if('@wheels[3] == 2) mes "��Ԗڂɑ傫�����ԁF���";
				else if('@wheels[3] == 3) mes "��Ԗڂɑ傫�����ԁF����";

				if('@wheels[4] == 0)      mes "�O�Ԗڂɑ傫�����ԁF���̂܂�";
				else if('@wheels[4] == 1) mes "�O�Ԗڂɑ傫�����ԁF����";
				else if('@wheels[4] == 2) mes "�O�Ԗڂɑ傫�����ԁF���";
				else if('@wheels[4] == 3) mes "�O�Ԗڂɑ傫�����ԁF������";
				continue;
			case 7:
				cleararray '@wheels,0,5;
				continue;
			}
			break;
		};
		break;
	case 3:
		mes "�]�c�c�c�c�]";
		mes "�]�C�ɂ��Ȃ������悳�������]";
		close;
	}
	mes "�]�����Ă������Ԃ��A�M�B�B�`�b!!";
	mes "�Ƃ������Ƌ��Ɏ~�܂����]";
	mes "�]�����āA�@�B�̖{�̂ɂ���";
	mes "��ʂɕ����������A";
	mes "���̉��ɋ󓴂�����ꂽ�]";
	next;
	switch(select("��ʂ��悭����","���̋󓴂��悭����","���ɋC�ɂ��Ȃ�")) {
	case 1:
		mes "���̓������Ă����݂́A";
		mes "�l�Ԃ�_�X�ł͂Ȃ��c�c";
		mes "�����ł������B";
		next;
		mes "���̓_�ɋ�������������́A";
		mes "�������ǂ̂悤�ȖړI�ŁA";
		mes "���̓������Ă��̂���";
		mes "���炩�ɂ��邽�߁A�������n�߂��B";
		next;
		mes "�������Č����𑱂��钆�A";
		mes "��̋����[�������𔭌������B";
		next;
		mes "��́A���̓�����N�O�̐푈���A";
		mes "�������Ăяo���Q�[�g�̖�����";
		mes "���Ă����Ƃ������ƁB";
		next;
		mes "��߂́A���B���悭�m��";
		mes "���������N���A���̃Q�[�g��ʂ�A";
		mes "���E���炱�̃~�b�h�K���h�嗤��";
		mes "����ė����Ƃ������ƁB";
		next;
		mes "�����āA���������N�ɂ�";
		mes "����������悤�ɂȂ����B";
		mes "���̗��R�́A���������N��";
		mes "�o�����������Ɣޏ����������";
		mes "����ė��������́A";
		mes "�قڈ�v���Ă������炾�B";
		next;
		mes "�]���̌�ɂȂ��镶�͂͂Ȃ��]";
		close;
	case 2:
		mes "�]�󓴂̓������悭���Ă݂�ƁA";
		mes "���̓����ɋP�����̂��������]";
		mes "�]��������o���Ă݂�ƁA";
		mes "���̂悤�Ȍ`�����Ă����]";
		getitem 7424,1;
		close;
	case 3:
		mes "�]���ɋC�ɂ���K�v�͂Ȃ��������]";
		close;
	}
}

//���̃J�M
tha_t09.gat,19,158,0	script	�@�B�̑��u#tt5	111,{
	if(checkitemblank() == 0) {
		mes "�]�����A�C�e���̎�ސ�����������";
		mes "�A�C�e�����󂯂Ƃ邱�Ƃ��ł��܂���]";
		mes "�]�����A�C�e�������炵�Ă���A�ēx";
		mes "�b�������Ă��������]";
		close;
	}
	if(countitem(7425) || countitem(7430)) {
		mes "�]�ғ����Ă��Ȃ��@�B������]";
		close;
	}
	mes "�]�����ȉ��ƌ��𔭂���@�B������]";
	mes "�]�@�B�̑O�ʂɂ͂�����Ƃ���";
	mes "�傫���̉�ʂ�����A";
	mes "���̉��ɂ́A������u�����Ƃ�";
	mes "�ł������ȋ�Ԃ�����]";
	next;
	mes "�]�������A���ꂼ��̏ꏊ�̐F�́A";
	mes "�قȂ��Ă���]";
	if(!((countitem(7421)) || (countitem(7426))) && ((countitem(7422)) || (countitem(7427))) && ((countitem(7423)) || (countitem(7428))) && ((countitem(7424)) || (countitem(7429)))) close;
	next;
	input '@word$;
	if('@word$ != "�Ԃ̃J�M" && '@word$ != "���̃J�M" && '@word$ != "�̃J�M" && '@word$ != "�΂̃J�M") {
		mes "�]"+'@word$+"��";
		mes "�g���Ă݂����A���������͂Ȃ������]";
		close;
	}
	mes "�]�e�F�ɊY������J�M�Ɩ��͐΂�";
	mes "�u���ƁA���ꂼ��̏ꏊ��";
	mes "���𔭂��n�߂��]";
	mes "�]��ʂɕ������\������A";
	mes "���̉��ɋ󓴂�����ꂽ�]";
	next;
	switch(select("���͂�ǂ�","���̋󓴂𒲂ׂ�","�C�ɂ��Ȃ�")) {
	case 1:
		mes "�ޏ��̐Ղ͖k�̕��ɑ����Ă����̂ŁA";
		mes "���̐Ղ�ǂ��Ėk�̕��֌��������B";
		mes "�����A����ɂ��̐Ղ�ǂ����Ƃ�";
		mes "����ɂȂ��Ă����B";
		next;
		mes "����Ȓ��A������������ŁA";
		mes "�l���񂹕t���Ȃ����̘b�𕷂����B";
		next;
		mes "���̓��̘b�𕷂����u�ԁA";
		mes "�ޏ��̐Ղ͂��̓��Ɍ������Ă������Ƃ�";
		mes "�����I�Ɍ�����B";
		next;
		mes "���ɓ����������́A���̓���";
		mes "����Ȏp�ɑ傫�ȏՌ����󂯂��B";
		mes "�l�Ԃ��n���������z�l�����A";
		mes "���̂悤�Ȍ`�Ԃ̌�����";
		mes "���݂��Ȃ��������炾�B";
		next;
		mes "����ɁA����̋Z�p�������Ă��Ă��A";
		mes "���̂悤�ȓ������݂��邱�Ƃ�";
		mes "����̋Ƃł��邩�炾�B";
		mes "�����āA�����𒲍����邤����";
		mes "�����[�������𔭌������B";
		next;
		mes "�]���̌�ɂȂ��镶�͂͂Ȃ��]";
		close;
	case 2:
		mes "�]���̋󓴂𒲂ׂ�ƁA";
		mes "���̂悤�ȕ����������]";
		mes "�]������������ƁA";
		mes "�@�B���甭���Ă��������������]";
		mes "�]�u�������͐΂ƃJ�M��S�ĉ�������]";
		getitem 7425,1;
		close;
	case 3:
		mes "�]�u�������͐΂ƃJ�M��S�ĉ�������]";
		close;
	}
}

//�Ԗ��͐�
tha_t05.gat,218,116,0	script	����#tt2	111,{
	if(checkitemblank() == 0) {
		mes "�]�����A�C�e���̎�ސ�����������";
		mes "�A�C�e�����󂯂Ƃ邱�Ƃ��ł��܂���]";
		mes "�]�����A�C�e�������炵�Ă���A�ēx";
		mes "�b�������Ă��������]";
		close;
	}
	if(!countitem(7421)) {
		mes "�]��𕕈�ɋߕt���悤�Ƃ�����A";
		mes "�o�V���b!!�Ƃ������Ƌ��ɁA";
		mes "�肪�e����A�������ɂ��񂾁]";
		percentheal -10,0;
		close;
	}
	mes "�]�_��I�ȗ͂ɕ����Ă���]";
	mes "�]��𕕈�ɋߕt���悤�Ƃ�����A";
	mes "�o�V���b!!�Ƃ������Ƌ��ɒe���ꂽ�]";
	next;
	if(select("�����������ׂĂ݂�","���ɂ��邱�Ƃ͂Ȃ�������")==2) {
		mes "�]���̏ꂩ�痣�ꂽ�]";
		close;
	}
	input '@word$;
	if('@word$ != "�Ԃ̃J�M") {
		mes "�]���ǁA����������Ȃ������]";
		close;
	}
	mes "�]�����Ă����Ԃ̃J�M��˂������ƁA";
	mes "�W�B�B�[�b!!�Ƃ������Ƌ���";
	mes "�����Ă����͂��������]";
	next;
	mes "�]�@�B���悭����ƁA";
	mes "�����������߂����ȏ����Ȍ�������]";
	mes "�]�����������ނƁA";
	mes "���󂪐_��I�Ȍ��𔭂��n�߂��]";
	next;
	mes "�]�����āA���̌��͏��X�ɏ��������A";
	mes "����ɁA�_��I�Ȍ������";
	mes "���̂��u����Ă����]";
	next;
	mes "�]�����ɂ��������͐΂����񂾏u�ԁA";
	mes "���̒��ɒN���̋L���������Ă����]";
	next;
	mes "�c�c�����ŁA";
	mes "�A�T�V���N���X�B�𑗂肱�݁A";
	mes "������ނ�����肾�B";
	next;
	mes "���Z�́H";
	mes "�@";
	mes "�c�c1���c�c�B";
	mes "�@";
	mes "�c�c�S���Ȃ��킯�ł͂Ȃ����B";
	mes "�@";
	mes "�܂��A���肪����������ˁB";
	next;
	mes "�]�c�c�c�c�]";
	mes "�]��u�A�f���������āA�������]";
	delitem 7421,1;
	getitem 7426,1;
	close;
}

//�����͐�
tha_t07.gat,113,129,0	script	����#tt4	111,{
	if(checkitemblank() == 0) {
		mes "�]�����A�C�e���̎�ސ�����������";
		mes "�A�C�e�����󂯂Ƃ邱�Ƃ��ł��܂���]";
		mes "�]�����A�C�e�������炵�Ă���A�ēx";
		mes "�b�������Ă��������]";
		close;
	}
	if(!countitem(7422)) {
		mes "�]��𕕈�ɋߕt���悤�Ƃ�����A";
		mes "�o�V���b!!�Ƃ������Ƌ��ɁA";
		mes "�肪�e����A�������ɂ��񂾁]";
		percentheal -10,0;
		close;
	}
	mes "�]�_��I�ȗ͂ɕ����Ă���]";
	mes "�]��𕕈�ɋߕt���悤�Ƃ�����A";
	mes "�o�V���b!!�Ƃ������Ƌ��ɒe���ꂽ�]";
	next;
	if(select("�����������ׂĂ݂�","���ɂ��邱�Ƃ͂Ȃ�������")==2) {
		mes "�]���̏ꂩ�痣�ꂽ�]";
		close;
	}
	input '@word$;
	if('@word$ != "���̃J�M") {
		mes "�]���ǁA����������Ȃ������]";
		close;
	}
	mes "�]�����Ă������̃J�M��˂������ƁA";
	mes "�W�B�B�[�b!!�Ƃ������Ƌ���";
	mes "�����Ă����͂��������]";
	next;
	mes "�]�@�B���悭����ƁA";
	mes "�����������߂����ȏ����Ȍ�������]";
	mes "�]�����������ނƁA";
	mes "���󂪐_��I�Ȍ��𔭂��n�߂��]";
	next;
	mes "�]�����āA���̌��͏��X�ɏ��������A";
	mes "����ɁA�_��I�Ȍ������";
	mes "���̂��u����Ă����]";
	next;
	mes "�]�����ɂ��������͐΂����񂾏u�ԁA";
	mes "���̒��ɒN���̋L���������Ă����]";
	next;
	mes "���V���ł��B";
	mes "�����������̔C���ł����̂ŁA";
	mes "�x��܂����B";
	mes "�^�i�g�X���c�c�c�c";
	mes "�c�c�c�c";
	next;
	mes "�i�ޏ������Ă���ƁA";
	mes "�����ςȊ���������B";
	mes "�܂�Łc�c���̈ꕔ�̂悤�ȁc�c�j";
	next;
	mes "�]�c�c�c�c�]";
	mes "�]��u�A�f���������āA�������]";
	delitem 7422,1;
	getitem 7427,1;
	close;
}

//���͐�
tha_t04.gat,150,44,0	script	����#tt1	111,{
	if(checkitemblank() == 0) {
		mes "�]�����A�C�e���̎�ސ�����������";
		mes "�A�C�e�����󂯂Ƃ邱�Ƃ��ł��܂���]";
		mes "�]�����A�C�e�������炵�Ă���A�ēx";
		mes "�b�������Ă��������]";
		close;
	}
	if(!countitem(7423)) {
		mes "�]��𕕈�ɋߕt���悤�Ƃ�����A";
		mes "�o�V���b!!�Ƃ������Ƌ��ɁA";
		mes "�肪�e����A�������ɂ��񂾁]";
		percentheal -10,0;
		close;
	}
	mes "�]�_��I�ȗ͂ɕ����Ă���]";
	mes "�]��𕕈�ɋߕt���悤�Ƃ�����A";
	mes "�o�V���b!!�Ƃ������Ƌ��ɒe���ꂽ�]";
	next;
	if(select("�����������ׂĂ݂�","���ɂ��邱�Ƃ͂Ȃ�������")==2) {
		mes "�]���̏ꂩ�痣�ꂽ�]";
		close;
	}
	input '@word$;
	if('@word$ != "�̃J�M") {
		mes "�]���ǁA����������Ȃ������]";
		close;
	}
	mes "�]�����Ă����̃J�M��˂������ƁA";
	mes "�W�B�B�[�b!!�Ƃ������Ƌ���";
	mes "�����Ă����͂��������]";
	next;
	mes "�]�@�B���悭����ƁA";
	mes "�����������߂����ȏ����Ȍ�������]";
	mes "�]�����������ނƁA";
	mes "���󂪐_��I�Ȍ��𔭂��n�߂��]";
	next;
	mes "�]�����āA���̌��͏��X�ɏ��������A";
	mes "����ɁA�_��I�Ȍ������";
	mes "���̂��u����Ă����]";
	next;
	mes "�]�����ɂ��������͐΂����񂾏u�ԁA";
	mes "���̒��ɒN���̋L���������Ă����]";
	next;
	mes "�^�i�g�X!!";
	mes "�M���h����A�������܂����I";
	mes "�����ɔC����S�Ē��~���A������";
	mes "�M���h�֖߂�悤�ɂƂ̂��Ƃł��I";
	mes "�@";
	mes "�c�c���������B";
	next;
	mes "�]�c�c�c�c�]";
	mes "�]��u�A�f���������āA�������]";
	delitem 7423,1;
	getitem 7428,1;
	close;
}

//�Ζ��͐�
tha_t10.gat,129,159,0	script	����#tt5	111,{
	if(checkitemblank() == 0) {
		mes "�]�����A�C�e���̎�ސ�����������";
		mes "�A�C�e�����󂯂Ƃ邱�Ƃ��ł��܂���]";
		mes "�]�����A�C�e�������炵�Ă���A�ēx";
		mes "�b�������Ă��������]";
		close;
	}
	if(!countitem(7424)) {
		mes "�]��𕕈�ɋߕt���悤�Ƃ�����A";
		mes "�o�V���b!!�Ƃ������Ƌ��ɁA";
		mes "�肪�e����A�������ɂ��񂾁]";
		percentheal -10,0;
		close;
	}
	mes "�]�_��I�ȗ͂ɕ����Ă���]";
	mes "�]��𕕈�ɋߕt���悤�Ƃ�����A";
	mes "�o�V���b!!�Ƃ������Ƌ��ɒe���ꂽ�]";
	next;
	if(select("�����������ׂĂ݂�","���ɂ��邱�Ƃ͂Ȃ�������")==2) {
		mes "�]���̏ꂩ�痣�ꂽ�]";
		close;
	}
	input '@word$;
	if('@word$ != "�΂̃J�M") {
		mes "�]���ǁA����������Ȃ������]";
		close;
	}
	mes "�]�����Ă����΂̃J�M��˂������ƁA";
	mes "�W�B�B�[�b!!�Ƃ������Ƌ���";
	mes "�����Ă����͂��������]";
	next;
	mes "�]�@�B���悭����ƁA";
	mes "�����������߂����ȏ����Ȍ�������]";
	mes "�]�����������ނƁA";
	mes "���󂪐_��I�Ȍ��𔭂��n�߂��]";
	next;
	mes "�]�����āA���̌��͏��X�ɏ��������A";
	mes "����ɁA�_��I�Ȍ������";
	mes "���̂��u����Ă����]";
	next;
	mes "�]�����ɂ��������͐΂����񂾏u�ԁA";
	mes "���̒��ɒN���̋L���������Ă����]";
	next;
	mes "�c�c�Ƃ��Ƃ������������c�����ȁc�c�B";
	mes "�����A����ŏI��肾�c�c�B";
	mes "�c�c�c�c�O�b!!";
	mes "��͂�A���������Ȃ��Ƃ͂���ȁc�c�B";
	mes "�O�n�b�c�c�B";
	next;
	mes "���A����́c�c�c�c";
	mes "�c�c�c�c�c�c�c�c";
	mes "�c�c�c�c�c�c";
	mes "�c�c�O�A�@�@�@�@�b!!!!";
	mes "�ȁA�䂪�c�c���̐g���c�c";
	mes "�l�Ԃǂ��Ȃ񂩂Ɂc�c!!!!";
	next;
	mes "�]�c�c�c�c�]";
	mes "�]��u�A�f���������āA�������]";
	delitem 7424,1;
	getitem 7429,1;
	close;
}

//�����͐�
tha_t06.gat,226,230,0	script	����#tt3	111,{
	if(checkitemblank() == 0) {
		mes "�]�����A�C�e���̎�ސ�����������";
		mes "�A�C�e�����󂯂Ƃ邱�Ƃ��ł��܂���]";
		mes "�]�����A�C�e�������炵�Ă���A�ēx";
		mes "�b�������Ă��������]";
		close;
	}
	if(!countitem(7425)) {
		mes "�]��𕕈�ɋߕt���悤�Ƃ�����A";
		mes "�o�V���b!!�Ƃ������Ƌ��ɁA";
		mes "�肪�e����A�������ɂ��񂾁]";
		percentheal -10,0;
		close;
	}
	mes "�]�_��I�ȗ͂ɕ����Ă���]";
	mes "�]��𕕈�ɋߕt���悤�Ƃ�����A";
	mes "�o�V���b!!�Ƃ������Ƌ��ɒe���ꂽ�]";
	next;
	if(select("�����������ׂĂ݂�","���ɂ��邱�Ƃ͂Ȃ�������")==2) {
		mes "�]���̏ꂩ�痣�ꂽ�]";
		close;
	}
	input '@word$;
	if('@word$ != "���̃J�M") {
		mes "�]���ǁA����������Ȃ������]";
		close;
	}
	mes "�]�����Ă������̃J�M��˂������ƁA";
	mes "�W�B�B�[�b!!�Ƃ������Ƌ���";
	mes "�����Ă����͂��������]";
	next;
	mes "�]�@�B���悭����ƁA";
	mes "�����������߂����ȏ����Ȍ�������]";
	mes "�]�����������ނƁA";
	mes "���󂪐_��I�Ȍ��𔭂��n�߂��]";
	next;
	mes "�]�����āA���̌��͏��X�ɏ��������A";
	mes "����ɁA�_��I�Ȍ������";
	mes "���̂��u����Ă����]";
	next;
	mes "�]�����ɂ��������͐΂����񂾏u�ԁA";
	mes "���̒��ɒN���̋L���������Ă����]";
	next;
	mes "�����c�c���ꂪ�c�c";
	mes "���������N���A";
	mes "�艺���W�߂Ă���Ƃ��������c�c�B";
	mes "�q���`�c�c��k����Ȃ��B";
	mes "��̂ǂꂭ�炢�W�܂��Ă���񂾂낤�B";
	mes "�c�c��A�O��͂���悤���ȁB";
	next;
	mes "�]�c�c�c�c�]";
	mes "�]��u�A�f���������āA�������]";
	delitem 7425,1;
	getitem 7430,1;
	close;
}

//�Ԃ̐Α�
tha_t12.gat,96,58,0	script	�Α�#tt1	111,{
	if($@THA_1SEAL == 12) {
		mes "�]�Α����A�����ł��Ȃ����A";
		mes "����Ȍ�������Ă����A";
		mes "���G��邱�Ƃ��ł��Ȃ����A";
		mes "�M��ттĂ���]";
		close;
	}
	if($@THA_1SEAL != 0) {
		mes "�]�Α����_��I�Ȍ��𔭂��Ă���]";
		mes "�]�c�c�s�v�c�ȗ͂̂�����";
		mes "�߂Â����Ƃ��ł��Ȃ��]";
		close;
	}
	mes "�]���}�ȐΑ�������]";
	mes "�]�����ɂ́A���������邱�Ƃ�";
	mes "�ł������Ȍ�������]";
	if(countitem(7426) < 1)
		close;
	next;
	mes "�]�Α��ɋߕt���ƁA";
	mes "�����Ă������͐΂�";
	mes "���𔭂��n�߂��]";
	mes "�]�����āA�Α�����";
	mes "�Ԃ����������Ă����]";
	next;
	if(select("���ɖ��͐΂�����","���̂܂܂ɂ��Ă���")==2) {
		mes "�]���������l�q�����邱�Ƃɂ����]";
		close;
	}
	mes "�]�Α��̌��ɖ��͐΂�����ƁA";
	mes "�Α����_��I�Ȍ��ɕ�܂ꂽ�]";
	delitem 7426,1;
	misceffect 55;
	donpcevent "tteffect2::OnGlow";
	set $@THA_1SEAL,1;
	close;
}

//���̐Α�
tha_t12.gat,161,58,0	script	�Α�#tt4	111,{
	if($@THA_1SEAL == 12) {
		mes "�]�Α����A�����ł��Ȃ����A";
		mes "����Ȍ�������Ă����A";
		mes "���G��邱�Ƃ��ł��Ȃ����A";
		mes "�M��ттĂ���]";
		close;
	}
	if($@THA_1SEAL != 1) {
		mes "�]�Α����_��I�Ȍ��𔭂��Ă���]";
		mes "�]�c�c�s�v�c�ȗ͂̂�����";
		mes "�߂Â����Ƃ��ł��Ȃ��]";
		close;
	}
	mes "�]���}�ȐΑ�������]";
	mes "�]�����ɂ́A���������邱�Ƃ�";
	mes "�ł������Ȍ�������]";
	if(countitem(7427) < 1)
		close;
	next;
	mes "�]�Α��ɋߕt���ƁA";
	mes "�����Ă��������͐΂�";
	mes "���𔭂��n�߂��]";
	next;
	if(select("���ɖ��͐΂�����","���̂܂܂ɂ��Ă���")==2) {
		mes "�]���������l�q�����邱�Ƃɂ����]";
		close;
	}
	mes "�]�Α��̌��ɖ��͐΂�����ƁA";
	mes "�Α����_��I�Ȍ��ɕ�܂ꂽ�]";
	delitem 7427,1;
	misceffect 57;
	donpcevent "tteffect3::OnGlow";
	set $@THA_1SEAL,2;
	close;
}

//�̐Α�
tha_t12.gat,104,18,0	script	�Α�#tt2	111,{
	if($@THA_1SEAL == 12) {
		mes "�]�Α����A�����ł��Ȃ����A";
		mes "����Ȍ�������Ă����A";
		mes "���G��邱�Ƃ��ł��Ȃ����A";
		mes "�M��ттĂ���]";
		close;
	}
	if($@THA_1SEAL != 2) {
		mes "�]�Α����_��I�Ȍ��𔭂��Ă���]";
		mes "�]�c�c�s�v�c�ȗ͂̂�����";
		mes "�߂Â����Ƃ��ł��Ȃ��]";
		close;
	}
	mes "�]���}�ȐΑ�������]";
	mes "�]�����ɂ́A���������邱�Ƃ�";
	mes "�ł������Ȍ�������]";
	if(countitem(7428) < 1)
		close;
	next;
	mes "�]�Α��ɋߕt���ƁA";
	mes "�����Ă������͐΂�";
	mes "���𔭂��n�߂��]";
	next;
	if(select("���ɖ��͐΂�����","���̂܂܂ɂ��Ă���")==2) {
		mes "�]���������l�q�����邱�Ƃɂ����]";
		close;
	}
	mes "�]�Α��̌��ɖ��͐΂�����ƁA";
	mes "�Α����_��I�Ȍ��ɕ�܂ꂽ�]";
	delitem 7428,1;
	misceffect 54;
	donpcevent "tteffect5::OnGlow";
	set $@THA_1SEAL,3;
	close;
}

//���̐Α�
tha_t12.gat,128,86,0	script	�Α�#tt3	111,{
	if($@THA_1SEAL == 12) {
		mes "�]�Α����A�����ł��Ȃ����A";
		mes "����Ȍ�������Ă����A";
		mes "���G��邱�Ƃ��ł��Ȃ����A";
		mes "�M��ттĂ���]";
		close;
	}
	if($@THA_1SEAL != 3) {
		mes "�]�Α����_��I�Ȍ��𔭂��Ă���]";
		mes "�]�c�c�s�v�c�ȗ͂̂�����";
		mes "�߂Â����Ƃ��ł��Ȃ��]";
		close;
	}
	mes "�]���}�ȐΑ�������]";
	mes "�]�����ɂ́A���������邱�Ƃ�";
	mes "�ł������Ȍ�������]";
	if(countitem(7430) < 1)
		close;
	next;
	mes "�]�Α��ɋߕt���ƁA";
	mes "�����Ă��������͐΂�";
	mes "���𔭂��n�߂��]";
	next;
	if(select("���ɖ��͐΂�����","���̂܂܂ɂ��Ă���")==2) {
		mes "�]���������l�q�����邱�Ƃɂ����]";
		close;
	}
	mes "�]�Α��̌��ɖ��͐΂�����ƁA";
	mes "�Α����_��I�Ȍ��ɕ�܂ꂽ�]";
	delitem 7430,1;
	misceffect 59;
	donpcevent "tteffect1::OnGlow";
	set $@THA_1SEAL,4;
	close;
}

//�΂̐Α�
tha_t12.gat,154,18,0	script	�Α�#tt5	111,{
	if($@THA_1SEAL == 12) {
		mes "�]�Α����A�����ł��Ȃ����A";
		mes "����Ȍ�������Ă����A";
		mes "���G��邱�Ƃ��ł��Ȃ����A";
		mes "�M��ттĂ���]";
		close;
	}
	if($@THA_1SEAL != 4) {
		mes "�]�Α����_��I�Ȍ��𔭂��Ă���]";
		mes "�]�c�c�s�v�c�ȗ͂̂�����";
		mes "�߂Â����Ƃ��ł��Ȃ��]";
		close;
	}
	mes "�]���}�ȐΑ�������]";
	mes "�]�����ɂ́A���������邱�Ƃ�";
	mes "�ł������Ȍ�������]";
	if(countitem(7429) < 1)
		close;
	next;
	mes "�]�Α��ɋߕt���ƁA";
	mes "�����Ă����Ζ��͐΂�";
	mes "���𔭂��n�߂��]";
	next;
	if(select("���ɖ��͐΂�����","���̂܂܂ɂ��Ă���")==2) {
		mes "�]���������l�q�����邱�Ƃɂ����]";
		close;
	}
	mes "�]�Α��̌��ɖ��͐΂�����ƁA";
	mes "�Α����_��I�Ȍ��ɕ�܂ꂽ�]";
	misceffect 56;
	next;
	mes "�]�܂̐Α��S�Ă����ɕ�܂�A";
	mes "�Α������̒��S�ɂ���͗l��";
	mes "��ȕ��Ƌ��ɋ����C�𔭂��n�߂��]";
	delitem 7429,1;
	donpcevent "tteffect4::OnGlow";
	donpcevent "WarpThana::OnStart";
	set $@THA_1SEAL,5;
	close;
}

tha_t12.gat,129,56,0	script	tteffect1	139,{
	end;
OnGlow:
	initnpctimer;
	end;
OnTimer500:
OnTimer1000:
OnTimer1500:
OnTimer2000:
OnTimer2500:
	misceffect 59;
	end;
OnTimer3000:
	misceffect 59;
	stopnpctimer;
	if($@THA_1SEAL >= 6)	end;
	initnpctimer;
	end;
OnStop:
	stopnpctimer;
	end;
}

tha_t12.gat,125,52,0	script	tteffect2	139,{
	end;
OnGlow:
	initnpctimer;
	end;
OnTimer500:
OnTimer1000:
OnTimer1500:
OnTimer2000:
OnTimer2500:
	misceffect 55;
	end;
OnTimer3000:
	misceffect 55;
	stopnpctimer;
	if($@THA_1SEAL >= 6)	end;
	initnpctimer;
	end;
OnStop:
	stopnpctimer;
	end;
}

tha_t12.gat,134,52,0	script	tteffect3	139,{
	end;
OnGlow:
	initnpctimer;
	end;
OnTimer500:
OnTimer1000:
OnTimer1500:
OnTimer2000:
OnTimer2500:
	misceffect 57;
	end;
OnTimer3000:
	misceffect 57;
	stopnpctimer;
	if($@THA_1SEAL >= 6)	end;
	initnpctimer;
	end;
OnStop:
	stopnpctimer;
	end;
}

tha_t12.gat,132,47,0	script	tteffect4	139,{
	end;
OnGlow:
	initnpctimer;
	end;
OnTimer500:
OnTimer1000:
OnTimer1500:
OnTimer2000:
OnTimer2500:
	misceffect 56;
	end;
OnTimer3000:
	misceffect 56;
	stopnpctimer;
	if($@THA_1SEAL >= 6)	end;
	initnpctimer;
	end;
OnStop:
	stopnpctimer;
	end;
}

tha_t12.gat,127,47,0	script	tteffect5	139,{
	end;
OnGlow:
	initnpctimer;
	end;
OnTimer500:
OnTimer1000:
OnTimer1500:
OnTimer2000:
OnTimer2500:
	misceffect 54;
	end;
OnTimer3000:
	misceffect 54;
	stopnpctimer;
	if($@THA_1SEAL >= 6)	end;
	initnpctimer;
	end;
OnStop:
	stopnpctimer;
	end;
}

tha_t12.gat,130,52,0	script	WarpThana	45,1,1,{
	end;
OnInit:
	disablenpc "WarpThana";
	end;
OnTouch:
	warp "thana_boss.gat",136,116;
	end;
OnStart:
	initnpctimer;
	enablenpc "WarpThana";
	end;
OnTimer10000:
	if($@THA_1SEAL >= 5 && $@THA_1SEAL <= 11) {
		initnpctimer;
	}
	else {
		stopnpctimer;
		donpcevent "tteffect1::OnStop";
		donpcevent "tteffect2::OnStop";
		donpcevent "tteffect3::OnStop";
		donpcevent "tteffect4::OnStop";
		donpcevent "tteffect5::OnStop";
		disablenpc "WarpThana";
		end;
	}
}

//��Y�̕���
thana_boss.gat,202,75,0	script	�͗l#tt2	111,3,3,{
	end;
OnTouch:
	if($@THA_2SEAL&0x1)
		end;
	mes "�]�ΐF�̖͗l�����G�ɕ`����Ă���]";
	mes "�]���̒��ɂ́A���������邱�Ƃ�";
	mes "�ł������Ȍ�������]";
	if(countitem(7436) < 1)
		close;
	next;
	input '@word$;
	if('@word$ != "��Y�̌���") {
		mes "�]����ȕ��͎����Ă��Ȃ��]";
		close;
	}
	if($@THA_2SEAL&0x1) {
		mes "�]�����N����Ȃ��]";
		close;
	}
	mes "�]��Y�̌��Ђ�";
	mes "���̖͗l�ɂ͂߂��]";
	mes "�]����ƁA�͗l��";
	mes "���邢���𔭂��n�߂��]";
	set $@THA_2SEAL,$@THA_2SEAL|0x01;
	delitem 7436,1;
	monster "thana_boss.gat",202,75,"��Y",1712,1,"#ttDeath::OnKilled1";
	close;
}

//�߂��݂̕���
thana_boss.gat,217,167,0	script	�͗l#tt1	111,3,3,{
	end;
OnTouch:
	if($@THA_2SEAL&0x2)
		end;
	mes "�]���F�̖͗l�����G�ɕ`����Ă���]";
	mes "�]���̒��ɂ́A���������邱�Ƃ�";
	mes "�ł������Ȍ�������]";
	if(countitem(7437) < 1)
		close;
	next;
	input '@word$;
	if('@word$ != "�߂��݂̌���") {
		mes "�]����ȕ��͎����Ă��Ȃ��]";
		close;
	}
	if($@THA_2SEAL&0x2) {
		mes "�]�����N����Ȃ��]";
		close;
	}
	mes "�]�߂��݂̌��Ђ�";
	mes "���̖͗l�ɂ͂߂��]";
	mes "�]����ƁA�͗l��";
	mes "���邢���𔭂��n�߂��]";
	set $@THA_2SEAL,$@THA_2SEAL|0x02;
	delitem 7437,1;
	monster "thana_boss.gat",217,167,"�߂���",1711,1,"#ttDeath::OnKilled1";
	close;
}

//��]�̕���
thana_boss.gat,62,171,0	script	�͗l#tt4	111,3,3,{
	end;
OnTouch:
	if($@THA_2SEAL&0x4)
		end;
	mes "�]�ԐF�̖͗l�����G�ɕ`����Ă���]";
	mes "�]���̒��ɂ́A���������邱�Ƃ�";
	mes "�ł������Ȍ�������]";
	if(countitem(7439) < 1)
		close;
	next;
	input '@word$;
	if('@word$ != "��]�̌���") {
		mes "�]����ȕ��͎����Ă��Ȃ��]";
		close;
	}
	if($@THA_2SEAL&0x4) {
		mes "�]�����N����Ȃ��]";
		close;
	}
	mes "�]��]�̌��Ђ�";
	mes "���̖͗l�ɂ͂߂��]";
	mes "�]����ƁA�͗l��";
	mes "���邢���𔭂��n�߂��]";
	set $@THA_2SEAL,$@THA_2SEAL|0x04;
	delitem 7439,1;
	monster "thana_boss.gat",62,171,"��]",1710,1,"#ttDeath::OnKilled1";
	close;
}

//�����̕���
thana_boss.gat,80,76,0	script	�͗l#tt3	111,3,3,{
	end;
OnTouch:
	if($@THA_2SEAL&0x8)
		end;
	mes "�]�F�̖͗l�����G�ɕ`����Ă���]";
	mes "�]���̒��ɂ́A���������邱�Ƃ�";
	mes "�ł������Ȍ�������]";
	if(countitem(7438) < 1)
		close;
	next;
	input '@word$;
	if('@word$ != "�����̌���") {
		mes "�]����ȕ��͎����Ă��Ȃ��]";
		close;
	}
	if($@THA_2SEAL&0x8) {
		mes "�]�����N����Ȃ��]";
		close;
	}
	mes "�]�����̌��Ђ�";
	mes "���̖͗l�ɂ͂߂��]";
	mes "�]����ƁA�͗l��";
	mes "���邢���𔭂��n�߂��]";
	set $@THA_2SEAL,$@THA_2SEAL|0x08;
	delitem 7438,1;
	monster "thana_boss.gat",80,76,"����",1709,1,"#ttDeath::OnKilled1";
	close;
}

//�^�i�g�X�̕���
thana_boss.gat,141,218,0	script	�͗l#tt5	111,3,3,{
	end;
OnTouch:
	if($@THA_1SEAL > 9)
		end;
	mes "�]���F�̖͗l�����G�ɕ`����Ă���]";
	mes "�]�͗l���狭���͂�������]";
	if($@THA_1SEAL < 9)
		close;
	mes "�]�߂��ɍs���āA";
	mes "�͗l���ώ@���Ă݂�Ɓc�c";
	mes "�_��I�Ȍ����͗l���ݎn�߂��]";
	mes "�]�����āA�͗l������Ȍ���������]";
	set $@THA_1SEAL,10;
	monster "thana_boss.gat",139,215,"����",1709,1,"#ttDeath::OnKilled2";
	monster "thana_boss.gat",139,220,"��]",1710,1,"#ttDeath::OnKilled2";
	monster "thana_boss.gat",144,220,"�߂���",1711,1,"#ttDeath::OnKilled2";
	monster "thana_boss.gat",144,215,"��Y",1712,1,"#ttDeath::OnKilled2";
	close;
}

thana_boss.gat,1,1,0	script	#ttDeath	-1,{
	end;
OnKilled1:
	set $@THA_1SEAL,$@THA_1SEAL+1;
	end;
OnKilled2:
	set '@mob,getmapmobs("thana_boss.gat","#ttDeath::OnKilled2");
	if('@mob < 1) {
		set $@THA_1SEAL,11;
		monster "thana_boss.gat",135,129,"�����m�^�i�g�X�̎v�O��",1708,1,"#ttDeath::OnThanaKilled";
	}
	end;
OnThanaKilled:
	initnpctimer;
	set $@THA_1SEAL,12;
	announce "�O���@�@�@�@�@�[�[�[�b!!!!",0x9,0xff0000;
	end;
OnTimer2000:
	announce "�O�E�D�D�[�[�[�[�b!!",0x9,0xff0000;
	end;
OnTimer4000:
	announce "�O�n�b�c�c�O�n�b�c�c�c�c",0x9,0xff0000;
	end;
OnTimer6000:
	announce "�E�E�D�D�[�b�c�c�n�@�n�@�b�c�c",0x9,0xff0000;
	end;
OnTimer8000:
	announce "�o�V�b�c�c�o�V�b�c�c�B",0x9,0xff0000;
	end;
OnTimer60000:
	areawarp "thana_boss.gat",0,0,280,280,"tha_t12.gat",130,48;
	set $@THA_2SEAL,0;
	end;
OnTimer1800000:
	areawarp "thana_boss.gat",0,0,280,280,"tha_t12.gat",130,48;
	killmonsterall "thana_boss.gat";
	set $@THA_1SEAL,0;
	stopnpctimer;
	end;
}