//==============================================================================
// Field Warp Point Script   2005-06-28(��3 mod by kia)
//==============================================================================

//-------------------------------------------
// warp0xxx 	MAP�̋�؂�  	
// warp01xx 	�X��         	
// warp02xx 	GvG���[����  	
// warp03xx 	�Ԃ�         	
// warp04xx 	�_���W������ 	
// warp05xx 	�t�B�[���h�� 	
// warp06xx 	JOB�X�e�[�W��	
// warp07xx 	PvP�X�e�[�W��	
// warp1xxx 	�X           	(�g��Ȃ�)
// warp2xxx 	GvG���[��    	(�g��Ȃ�)
// warp3xxx 	GvG ��       	(�g��Ȃ�)
// warp31xx 	GvG �ԂP     	
// warp32xx 	GvG �ԂQ     	
// warp33xx 	GvG �ԂR     	
// warp34xx 	GvG �ԂS     	
// warp35xx 	GvG �ԂT     	
// warp4xxx 	�_���W����   	(�g��Ȃ�)
// warp5xxx 	�t�B�[���h   	
// warp6xxx 	JOB�X�e�[�W  	(�g��Ȃ�)
// warp7xxx 	PvP�X�e�[�W  	(�g��Ȃ�)
// warp71xxx	PvP�X�e�[�W�P	
// warp72xxx	PvP�X�e�[�W�Q	
// warp73xxx	PvP�X�e�[�W�R	
// warp74xxx	PvP�X�e�[�W�S	
// warp75xxx	PvP�X�e�[�W�T	
// warp76xxx	PvP�X�e�[�W�U	
// warp77xxx	PvP�X�e�[�W�V	
// warp78xxx	PvP�X�e�[�W�W	
//-------------------------------------------
// #        	script warp	
//-------------------------------------------
// TAB :    	8
//-------------------------------------------


//==============================================================
// ----- Xmas ���e�B�G -----
// mas_fild01.gat	���e�B�G�t�B�[���h
// -----
// xmas.gat 		��̊X���e�B�G
// aldebaran.gat	�����s�s�A���f�o����
//==============================================================
xmas_fild01.gat,69,252,0	warp	xmaswarp0101		18,2,xmas.gat,149,44
xmas_fild01.gat,90,252,0	warp	xmaswarp0102		18,2,xmas.gat,149,44
xmas_fild01.gat,84,51,0		warp	xmaswarp0103		10,2,aldebaran.gat,140,234



//==============================================================
// ----- Mjolnir �~�����j�[���R�� -----
// mjolnir_01.gat	�~�����j�[���R�� 01 �` 12
// -----
// aldebaran.gat	�����s�s�A���f�o����
// mjo_dun01.gat	�~�����j�[���p�B B1F
// gef_fild00.gat	�Q�t�F���t�B�[���h 00 �` 11
// prt_maze01.gat	���{�̐X
//==============================================================
mjolnir_12.gat,199,378,0	warp	mjolnirwarp0101		2,2,aldebaran.gat,138,37
mjolnir_02.gat,79,365,0		warp	mjolnirwarp0401		2,1,mjo_dun01.gat,52,17

// mjolnir
mjolnir_01.gat,284,18,0		warp	mjolnirwarp0501		4,2,gef_fild04.gat,261,359
mjolnir_06.gat,18,331,0		warp	mjolnirwarp0502		2,4,gef_fild04.gat,359,322
mjolnir_06.gat,265,29,0		warp	mjolnirwarp0503		2,2,gef_fild00.gat,267,379
mjolnir_07.gat,156,16,0		warp	mjolnirwarp0504		4,2,prt_fild00.gat,159,380
mjolnir_09.gat,106,28,0		warp	mjolnirwarp0505		4,2,prt_fild05.gat,105,378
mjolnir_09.gat,30,249,0		warp	mjolnirwarp0506		2,4,prt_fild00.gat,380,249
mjolnir_09.gat,300,28,0		warp	mjolnirwarp0507		4,2,prt_fild05.gat,292,382
mjolnir_10.gat,265,13,0		warp	mjolnirwarp0508		3,2,prt_fild01.gat,261,370
mjolnir_10.gat,66,15,0		warp	mjolnirwarp0509		4,2,prt_fild01.gat,66,370
mjolnir_11.gat,174,20,0		warp	mjolnirwarp0510		4,2,prt_fild02.gat,173,379
mjolnir_09.gat,373,288,0	warp	mjolnirwarp0511		2,2,prt_fild01.gat,23,292
//prt maze Entrance(Prt,Ald)
mjolnir_12.gat,44,17,0		warp	mjolnirwarp0512		1,1,prt_maze01.gat,17,111	/*To No.1-11*/

mjolnir_01.gat,378,256,0	warp	mjolnirwarp5001		1,2,mjolnir_02.gat,30,258
mjolnir_02.gat,28,258,0		warp	mjolnirwarp5002		2,2,mjolnir_01.gat,376,256
mjolnir_02.gat,326,289,0	warp	mjolnirwarp5003		1,1,mjolnir_03.gat,24,258
mjolnir_03.gat,21,258,0		warp	mjolnirwarp5004		2,2,mjolnir_02.gat,323,289
mjolnir_02.gat,361,18,0		warp	mjolnirwarp5005		4,2,mjolnir_06.gat,366,380
mjolnir_06.gat,366,383,0	warp	mjolnirwarp5006		4,2,mjolnir_02.gat,361,21
mjolnir_03.gat,212,17,0		warp	mjolnirwarp5007		4,2,mjolnir_07.gat,214,380
mjolnir_07.gat,214,383,0	warp	mjolnirwarp5008		4,2,mjolnir_03.gat,212,20
mjolnir_03.gat,242,204,0	warp	mjolnirwarp5009		1,1,mjolnir_04.gat,125,208
mjolnir_04.gat,122,208,0	warp	mjolnirwarp5010		1,1,mjolnir_03.gat,239,204
mjolnir_04.gat,160,46,0		warp	mjolnirwarp5011		4,2,mjolnir_08.gat,159,370
mjolnir_08.gat,159,373,0	warp	mjolnirwarp5012		1,1,mjolnir_04.gat,160,49
mjolnir_04.gat,387,174,0	warp	mjolnirwarp5013		2,2,mjolnir_05.gat,19,171
mjolnir_05.gat,16,171,0		warp	mjolnirwarp5014		2,2,mjolnir_04.gat,384,174
mjolnir_05.gat,220,382,0	warp	mjolnirwarp5015		4,2,mjolnir_12.gat,220,29
mjolnir_12.gat,220,26,0		warp	mjolnirwarp5016		3,2,mjolnir_05.gat,220,379
mjolnir_05.gat,235,16,0		warp	mjolnirwarp5017		4,2,mjolnir_10.gat,235,378
mjolnir_10.gat,235,381,0	warp	mjolnirwarp5018		4,2,mjolnir_05.gat,235,19
mjolnir_06.gat,382,377,0	warp	mjolnirwarp5019		2,4,mjolnir_07.gat,19,377
mjolnir_07.gat,16,377,0		warp	mjolnirwarp5020		2,4,mjolnir_06.gat,379,377
mjolnir_06.gat,383,74,0		warp	mjolnirwarp5021		2,4,mjolnir_07.gat,20,77
mjolnir_07.gat,17,77,0		warp	mjolnirwarp5022		2,4,mjolnir_06.gat,380,74
mjolnir_07.gat,383,233,0	warp	mjolnirwarp5023		2,4,mjolnir_08.gat,33,234
mjolnir_08.gat,30,234,0		warp	mjolnirwarp5024		2,4,mjolnir_07.gat,380,233
mjolnir_07.gat,383,362,0	warp	mjolnirwarp5025		2,4,mjolnir_08.gat,32,346
mjolnir_08.gat,29,346,0		warp	mjolnirwarp5026		2,4,mjolnir_07.gat,380,362
mjolnir_08.gat,185,28,0		warp	mjolnirwarp5027		17,2,mjolnir_09.gat,196,364
mjolnir_09.gat,194,367,0	warp	mjolnirwarp5028		8,2,mjolnir_08.gat,185,31
mjolnir_08.gat,369,257,0	warp	mjolnirwarp5029		2,4,mjolnir_10.gat,18,258
mjolnir_10.gat,15,258,0		warp	mjolnirwarp5030		2,4,mjolnir_08.gat,366,257
mjolnir_10.gat,384,220,0	warp	mjolnirwarp5031		2,4,mjolnir_11.gat,23,220
mjolnir_11.gat,20,220,0		warp	mjolnirwarp5032		2,4,mjolnir_10.gat,381,220



//==============================================================
// ----- Prontera �v�����e�� -----
// prt_fild00.gat	�v�����e���t�B�[���h 00 �` 11
// -----
// prontera.gat		���[���~�b�h�K�b�c�����̎�s�v�����e��
// izlude.gat		�q���s�s�C�Y���[�h
// gef_fild00.gat	�Q�t�F���t�B�[���h 00 �` 11
// mjolnir_01.gat	�~�����j�[���R�� 01 �` 12
// moc_fild01.gat	�\�N���h���� 01 �` 19
// moc_fild20.gat	�����̋��� 01
// prt_maze01.gat	���{�̐X
// prt_monk.gat		���J�s�g�[���i�C���@
//==============================================================
prt_fild05.gat,373,205,0	warp	pronterawarp0101	3,3,prontera.gat,26,203
prt_fild06.gat,23,193,0		warp	pronterawarp0102	2,3,prontera.gat,285,203
prt_fild08.gat,170,378,0	warp	pronterawarp0103	3,2,prontera.gat,156,26
prt_fild08.gat,371,212,0	warp	pronterawarp0104	3,3,izlude.gat,35,78
//prt_fild01.gat,199,24,0	warp	pronterawarp0105	3,2,prt_castle.gat,102,178
prt_fild01.gat,199,24,0		warp	pronterawarp0201	3,2,prt_gld.gat,159,295

prt_fild00.gat,18,129,0		warp	pronterawarp0501	2,6,gef_fild00.gat,376,140
prt_fild04.gat,17,114,0		warp	pronterawarp0502	2,10,gef_fild01.gat,375,111
prt_fild07.gat,13,64,0		warp	pronterawarp0503	3,8,gef_fild02.gat,376,69
prt_fild07.gat,14,289,0		warp	pronterawarp0504	3,10,gef_fild02.gat,375,292
prt_fild07.gat,17,145,0		warp	pronterawarp0505	3,12,gef_fild02.gat,376,156
prt_fild10.gat,227,299,0	warp	pronterawarp0506	5,2,gef_fild02.gat,266,21
prt_fild11.gat,17,281,0		warp	pronterawarp0507	2,4,gef_fild11.gat,374,293
prt_fild11.gat,302,301,0	warp	pronterawarp0508	5,2,gef_fild03.gat,312,19
prt_fild00.gat,159,383,0	warp	pronterawarp0509	4,2,mjolnir_07.gat,156,19
prt_fild00.gat,383,249,0	warp	pronterawarp0510	2,4,mjolnir_09.gat,33,248
prt_fild01.gat,20,292,0		warp	pronterawarp0511	2,3,mjolnir_09.gat,370,288
prt_fild01.gat,261,373,0	warp	pronterawarp0512	6,2,mjolnir_10.gat,265,16
prt_fild01.gat,66,373,0		warp	pronterawarp0513	2,2,mjolnir_10.gat,66,18
prt_fild02.gat,173,382,0	warp	pronterawarp0514	4,2,mjolnir_11.gat,174,23
prt_fild05.gat,105,381,0	warp	pronterawarp0515	5,2,mjolnir_09.gat,106,34
prt_fild05.gat,292,385,0	warp	pronterawarp0516	4,2,mjolnir_09.gat,305,33
prt_fild08.gat,233,16,0		warp	pronterawarp0517	12,1,moc_fild01.gat,238,378
prt_fild08.gat,55,21,0		warp	pronterawarp0518	4,2,moc_fild01.gat,56,380
//prt_fild09.gat,246,16,0	warp	pronterawarp0519	7,2,moc_fild04.gat,92,378
prt_fild09.gat,246,17,0		warp	pronterawarp0519	1,1,moc_fild20.gat,209,333
prt_fild09.gat,383,223,0	warp	pronterawarp0520	2,15,moc_fild01.gat,25,242
prt_fild09.gat,383,251,0	warp	pronterawarp0521	2,15,moc_fild01.gat,25,242
//prt_fild09.gat,95,16,0	warp	pronterawarp0522	7,2,moc_fild05.gat,325,379
prt_fild09.gat,95,19,0		warp	pronterawarp0522	1,1,moc_fild20.gat,209,333
//prt_fild10.gat,263,20,0	warp	pronterawarp0523	6,2,moc_fild05.gat,144,372
prt_fild10.gat,263,23,0		warp	pronterawarp0523	1,1,moc_fild20.gat,209,333
prt_fild01.gat,136,373,0	warp	pronterawarp0524	1,1,prt_maze01.gat,99,31	/*To No.1-23*/
//prt_fild01.gat,136,373,0	warp	pronterawarp0525	2,2,prt_maze01.gat,176,7

prt_fild03.gat,371,256,0	warp	pronterawarp0601	2,2,prt_monk.gat,25,248

prt_fild00.gat,165,18,0		warp	pronterawarp5001	9,3,prt_fild04.gat,158,384
prt_fild04.gat,160,387,0	warp	pronterawarp5001	10,2,prt_fild00.gat,164,24
prt_fild00.gat,317,18,0		warp	pronterawarp5002	8,2,prt_fild04.gat,323,384
prt_fild04.gat,323,387,0	warp	pronterawarp5002	7,2,prt_fild00.gat,315,21
prt_fild01.gat,380,243,0	warp	pronterawarp5003	2,5,prt_fild02.gat,20,242
prt_fild02.gat,17,242,0		warp	pronterawarp5003	2,5,prt_fild01.gat,377,243
prt_fild01.gat,382,304,0	warp	pronterawarp5004	2,10,prt_fild02.gat,20,305
prt_fild02.gat,17,305,0		warp	pronterawarp5004	2,5,prt_fild01.gat,379,302
prt_fild01.gat,382,351,0	warp	pronterawarp5005	2,8,prt_fild02.gat,20,350
prt_fild02.gat,17,350,0		warp	pronterawarp5005	2,7,prt_fild01.gat,379,351
prt_fild02.gat,305,17,0		warp	pronterawarp5006	10,2,prt_fild06.gat,277,315
prt_fild06.gat,277,320,0	warp	pronterawarp5006	10,2,prt_fild02.gat,305,22
prt_fild02.gat,380,347,0	warp	pronterawarp5007	2,10,prt_fild03.gat,23,249
prt_fild03.gat,16,249,0		warp	pronterawarp5007	2,10,prt_fild02.gat,373,353
prt_fild04.gat,378,72,0		warp	pronterawarp5008	2,6,prt_fild05.gat,17,59
prt_fild05.gat,13,63,0		warp	pronterawarp5008	2,15,prt_fild04.gat,374,73
prt_fild04.gat,384,155,0	warp	pronterawarp5009	2,7,prt_fild05.gat,20,134
prt_fild05.gat,14,141,0		warp	pronterawarp5009	2,18,prt_fild04.gat,380,158
prt_fild04.gat,384,334,0	warp	pronterawarp5010	2,6,prt_fild05.gat,20,333
prt_fild05.gat,15,333,0		warp	pronterawarp5010	2,8,prt_fild04.gat,380,332
prt_fild05.gat,134,14,0		warp	pronterawarp5011	14,3,prt_fild07.gat,129,374
prt_fild07.gat,132,381,0	warp	pronterawarp5011	9,3,prt_fild05.gat,142,18
prt_fild05.gat,255,14,0		warp	pronterawarp5012	12,2,prt_fild07.gat,248,369
prt_fild07.gat,248,376,0	warp	pronterawarp5012	8,2,prt_fild05.gat,257,18
prt_fild07.gat,206,12,0		warp	pronterawarp5013	4,2,prt_fild09.gat,224,377
prt_fild09.gat,224,380,0	warp	pronterawarp5013	4,2,prt_fild07.gat,206,15
prt_fild07.gat,383,239,0	warp	pronterawarp5014	3,20,prt_fild08.gat,20,239
prt_fild08.gat,16,239,0		warp	pronterawarp5014	3,15,prt_fild07.gat,379,239
prt_fild07.gat,385,186,0	warp	pronterawarp5015	3,20,prt_fild08.gat,20,186
prt_fild08.gat,16,187,0		warp	pronterawarp5015	3,17,prt_fild07.gat,380,186
prt_fild07.gat,84,13,0		warp	pronterawarp5016	4,2,prt_fild09.gat,87,377
prt_fild09.gat,87,380,0		warp	pronterawarp5016	5,2,prt_fild07.gat,84,16
prt_fild09.gat,14,124,0		warp	pronterawarp5017	2,6,prt_fild10.gat,336,126
prt_fild09.gat,14,139,0		warp	pronterawarp5017	2,8,prt_fild10.gat,336,126
prt_fild10.gat,339,126,0	warp	pronterawarp0000	2,8,prt_fild09.gat,17,133
prt_fild10.gat,20,122,0		warp	pronterawarp5019	2,4,prt_fild11.gat,359,111
prt_fild11.gat,362,111,0	warp	pronterawarp5019	2,6,prt_fild10.gat,23,122
prt_fild10.gat,20,196,0		warp	pronterawarp5020	2,4,prt_fild11.gat,358,184
prt_fild11.gat,361,184,0	warp	pronterawarp5020	2,5,prt_fild10.gat,23,196



//==============================================================
// ----- Geffen �Q�t�F�� -----
// gef_fild00.gat	�Q�t�F���t�B�[���h 00 �` 11
// gef_fild12.gat	�R�[�h�̐X
// gef_fild13.gat	�u���g�j�A
// gef_fild14.gat	�I�[�N���̑�
// -----
// geffen.gat		���@�̓s�s�Q�t�F��
// in_orcs01.gat	�I�[�N���̎���
// gefg_cas01.gat	�u���g�j�A�� 1 �` 5
// glast_01.gat		�O���X�g�w�C���Ï�
// mjolnir_01.gat	�~�����j�[���R�� 01 �` 12
// prt_fild00.gat	�v�����e���t�B�[���h 00 �` 11
//==============================================================
gef_fild00.gat,40,199,0		warp	geffenwarp0101		2,7,geffen.gat,213,119
gef_fild04.gat,187,39,0		warp	geffenwarp0102		4,2,geffen.gat,119,210
gef_fild07.gat,339,187,0	warp	geffenwarp0103		2,4,geffen.gat,29,119
gef_fild10.gat,136,331,0	warp	geffenwarp0104		1,1,in_orcs01.gat,122,171
gef_fild10.gat,138,284,0	warp	geffenwarp0105		1,1,in_orcs01.gat,29,114
gef_fild10.gat,215,51,0		warp	geffenwarp0106		1,1,in_orcs01.gat,162,53
gef_fild10.gat,223,205,0	warp	geffenwarp0107		1,1,in_orcs01.gat,108,89
gef_fild10.gat,63,337,0		warp	geffenwarp0108		1,1,in_orcs01.gat,30,157

// geffen guild
gef_fild13.gat,150,54,0		warp	geffenwarp0301		1,1,gefg_cas01.gat,34,140
gef_fild13.gat,210,75,0		warp	geffenwarp0302		1,1,gefg_cas01.gat,95,178
gef_fild13.gat,308,244,0	warp	geffenwarp0303		1,1,gefg_cas02.gat,70,143
gef_fild13.gat,77,284,0		warp	geffenwarp0304		1,1,gefg_cas03.gat,60,286
gef_fild13.gat,112,269,0	warp	geffenwarp0305		1,1,gefg_cas03.gat,100,280
gef_fild13.gat,139,240,0	warp	geffenwarp0306		1,1,gefg_cas03.gat,125,250
gef_fild13.gat,83,185,0		warp	geffenwarp0307		1,1,gefg_cas03.gat,89,159
gef_fild13.gat,196,281,0	warp	geffenwarp0308		1,1,gefg_cas04.gat,24,149
gef_fild13.gat,256,57,0		warp	geffenwarp0309		1,1,gefg_cas05.gat,11,134
gef_fild13.gat,305,83,0		warp	geffenwarp0309		1,1,gefg_cas05.gat,99,200

gef_fild06.gat,18,304,0		warp	geffenwarp0401		3,3,glast_01.gat,376,304

//geffen field
gef_fild00.gat,267,382,0	warp	geffenwarp0501		4,2,mjolnir_06.gat,265,32
gef_fild00.gat,381,137,0	warp	geffenwarp0502		3,9,prt_fild00.gat,24,125
gef_fild01.gat,382,111,0	warp	geffenwarp0503		2,9,prt_fild04.gat,20,114
gef_fild02.gat,266,18,0		warp	geffenwarp0504		5,2,prt_fild10.gat,227,296
gef_fild02.gat,380,156,0	warp	geffenwarp0505		3,7,prt_fild07.gat,21,143
gef_fild02.gat,380,289,0	warp	geffenwarp0506		3,12,prt_fild07.gat,18,289
gef_fild02.gat,380,68,0		warp	geffenwarp0507		3,10,prt_fild07.gat,17,64
gef_fild03.gat,312,16,0		warp	geffenwarp0508		5,2,prt_fild11.gat,302,298
gef_fild04.gat,261,362,0	warp	geffenwarp0509		4,2,mjolnir_01.gat,284,21
gef_fild04.gat,362,322,0	warp	geffenwarp0510		2,4,mjolnir_06.gat,21,331
gef_fild11.gat,377,293,0	warp	geffenwarp0511		2,4,prt_fild11.gat,20,281

gef_fild01.gat,16,102,0		warp	geffenwarp5001		2,4,gef_fild09.gat,368,92
gef_fild09.gat,368,95,0		warp	geffenwarp5002		4,2,gef_fild01.gat,19,102
gef_fild01.gat,69,17,0		warp	geffenwarp5003		4,2,gef_fild03.gat,66,379
gef_fild03.gat,66,382,0		warp	geffenwarp5004		4,2,gef_fild01.gat,69,20
gef_fild02.gat,14,78,0		warp	geffenwarp5005		2,4,gef_fild03.gat,379,77
gef_fild03.gat,382,77,0		warp	geffenwarp5006		2,4,gef_fild02.gat,17,78
gef_fild02.gat,16,275,0		warp	geffenwarp5007		2,4,gef_fild03.gat,379,277
gef_fild03.gat,382,277,0	warp	geffenwarp5008		2,4,gef_fild02.gat,19,275
gef_fild03.gat,18,52,0		warp	geffenwarp5009		2,4,gef_fild10.gat,367,56
gef_fild10.gat,370,56,0		warp	geffenwarp5010		2,5,gef_fild03.gat,21,52
gef_fild04.gat,16,309,0		warp	geffenwarp5011		2,6,gef_fild05.gat,361,309
gef_fild05.gat,364,309,0	warp	geffenwarp5012		2,8,gef_fild04.gat,19,309
gef_fild05.gat,15,201,0		warp	geffenwarp5013		2,4,gef_fild06.gat,379,211
gef_fild06.gat,382,211,0	warp	geffenwarp5014		2,4,gef_fild05.gat,18,201
gef_fild05.gat,64,15,0		warp	geffenwarp5015		4,2,gef_fild07.gat,64,360
gef_fild07.gat,64,363,0		warp	geffenwarp5016		4,2,gef_fild05.gat,64,18
gef_fild06.gat,218,17,0		warp	geffenwarp5017		4,2,gef_fild08.gat,200,352
gef_fild08.gat,200,355,0	warp	geffenwarp5018		4,2,gef_fild06.gat,218,20
gef_fild07.gat,18,191,0		warp	geffenwarp5019		2,4,gef_fild08.gat,357,187
gef_fild08.gat,360,187,0	warp	geffenwarp5020		2,4,gef_fild07.gat,21,191
gef_fild07.gat,40,19,0		warp	geffenwarp5021		1,1,gef_fild13.gat,41,369
gef_fild13.gat,41,373,0		warp	geffenwarp5022		1,1,gef_fild07.gat,40,23
gef_fild08.gat,215,18,0		warp	geffenwarp5023		1,1,gef_fild12.gat,221,369
gef_fild12.gat,221,374,0	warp	geffenwarp5024		1,1,gef_fild08.gat,215,25
gef_fild09.gat,225,25,0		warp	geffenwarp5025		3,2,gef_fild10.gat,251,368
gef_fild10.gat,251,371,0	warp	geffenwarp5026		5,2,gef_fild09.gat,225,28
gef_fild09.gat,23,56,0		warp	geffenwarp5027		1,1,gef_fild13.gat,376,56
gef_fild13.gat,380,56,0		warp	geffenwarp5028		1,1,gef_fild09.gat,27,56
gef_fild10.gat,104,21,0		warp	geffenwarp5029		5,2,gef_fild11.gat,114,360
gef_fild11.gat,111,364,0	warp	geffenwarp5030		6,3,gef_fild10.gat,104,24
gef_fild10.gat,27,219,0		warp	geffenwarp5031		1,1,gef_fild14.gat,367,219
gef_fild14.gat,371,219,0	warp	geffenwarp5032		1,1,gef_fild10.gat,31,219
gef_fild12.gat,368,180,0	warp	geffenwarp5033		1,1,gef_fild13.gat,29,202
gef_fild13.gat,25,202,0		warp	geffenwarp5034		1,1,gef_fild12.gat,364,180
gef_fild12.gat,372,50,0		warp	geffenwarp5035		1,1,gef_fild13.gat,29,59
gef_fild13.gat,26,59,0		warp	geffenwarp5036		1,1,gef_fild12.gat,370,50
gef_fild13.gat,200,25,0		warp	geffenwarp5037		1,1,gef_fild14.gat,180,357
gef_fild14.gat,180,360,0	warp	geffenwarp5038		1,1,gef_fild13.gat,200,29



//==============================================================
// ----- Morocc �����N -----
// moc_fild01.gat	�\�N���h���� 01 �` 19
// moc_fild20.gat	�����̋��� 01 �` 03
// -----
// morocc.gat		�����̓s�s�����N
// moc_ruins.gat	�����N - �s���~�b�h����
// pay_gld.gat		�`�F��������
// anthell01.gat	�a�n���_���W���� B1F
// in_sphinx1.gat	�X�t�B���N�X�_���W���� B1F
// pay_fild01.gat	�t�F�C���������̐X 01 �` 11
// prt_fild00.gat	�v�����e���t�B�[���h 00 �` 11
// cmd_fild08.gat	�T���_���}���v�� ��
// cmd_fild09.gat	�T���_���}���v�� ��
// in_moc_16.gat	�A�T�V���M���h
//==============================================================
moc_fild07.gat,198,21,0		warp	moroccwarp0101		2,2,morocc.gat,160,294
moc_fild10.gat,19,207,0		warp	moroccwarp0102		2,2,morocc.gat,299,207
moc_fild12.gat,159,381,0	warp	moroccwarp0103		2,2,morocc.gat,160,20
moc_fild19.gat,169,107,0	warp	moroccwarp0104		1,4,morocc.gat,27,164
moc_fild19.gat,71,170,0		warp	moroccwarp0105		8,2,moc_ruins.gat,71,19
moc_fild20.gat,35,173,0		warp	moroccwarp0106		1,1,morocc.gat,293,207

moc_fild02.gat,378,272,0	warp	moroccwarp0201		1,1,pay_gld.gat,20,276

//moc_fild04.gat,219,327,0	warp	moroccwarp0401		3,4,anthell01.gat,35,262
//moc_fild15.gat,258,253,0	warp	moroccwarp0402		3,3,anthell01.gat,35,262
//moc_fild20.gat,156,143,0	warp	moroccwarp0401		1,1,anthell01.gat,35,263
//moc_fild20.gat,337,315,0	warp	moroccwarp0402		1,1,anthell02.gat,168,170

moc_fild04.gat,219,327,0	script	#moroccwarp0401		45,3,4,{
	set ANTHELL_FLAG,0;
	warp "anthell01.gat",35,262;
	end;
}
moc_fild15.gat,258,253,0	script	#moroccwarp0402		45,3,3,{
	set ANTHELL_FLAG,1;
	warp "anthell01.gat",35,262;
	end;
}

moc_fild19.gat,98,99,0		warp	moroccwarp0403		1,1,in_sphinx1.gat,288,9

moc_fild01.gat,379,162,0	warp	moroccwarp0501		2,12,pay_fild04.gat,20,165
moc_fild02.gat,350,339,0	warp	moroccwarp0502		6,2,pay_fild04.gat,194,20
moc_fild03.gat,179,16,0		warp	moroccwarp0503		4,2,pay_fild11.gat,38,327
moc_fild03.gat,303,170,0	warp	moroccwarp0504		2,7,pay_fild01.gat,17,152
moc_fild01.gat,22,242,0		warp	moroccwarp0505		2,2,prt_fild09.gat,380,237
moc_fild01.gat,239,382,0	warp	moroccwarp0506		12,1,prt_fild08.gat,233,20
moc_fild01.gat,56,384,0		warp	moroccwarp0507		3,2,prt_fild08.gat,54,24
moc_fild04.gat,92,381,0		warp	moroccwarp0508		9,2,prt_fild09.gat,246,19
moc_fild05.gat,144,375,0	warp	moroccwarp0509		11,2,prt_fild10.gat,263,23
moc_fild05.gat,325,382,0	warp	moroccwarp0510		6,2,prt_fild09.gat,95,19

// other point
//moc_fild12.gat,35,303,0	warp	moroccwarp0511		3,3,cmd_fild08.gat,331,319
moc_fild18.gat,51,170,0		warp	moroccwarp0512		1,3,cmd_fild09.gat,363,164
moc_fild20.gat,356,179,0	warp	moroccwarp0513		1,1,moc_fild13.gat,38,172
moc_fild20.gat,195,15,0		warp	moroccwarp0514		1,1,moc_fild16.gat,333,375
moc_fild20.gat,209,342,0	warp	moroccwarp0515		1,1,moc_fild01.gat,84,26

moc_fild16.gat,205,296,0	warp	moroccwarp0601		1,1,in_moc_16.gat,18,11

//moc_fild01.gat,68,16,0	warp	moroccwarp5001		15,3,moc_fild04.gat,317,376
//moc_fild01.gat,101,16,0	warp	moroccwarp5002		15,3,moc_fild04.gat,317,376
moc_fild01.gat,84,19,0		warp	moroccwarp5001		1,1,moc_fild20.gat,209,333
moc_fild04.gat,292,381,0	warp	moroccwarp5003		10,1,moc_fild01.gat,76,25
moc_fild04.gat,314,381,0	warp	moroccwarp5004		10,1,moc_fild01.gat,76,25
moc_fild04.gat,336,381,0	warp	moroccwarp5005		10,1,moc_fild01.gat,76,25
moc_fild01.gat,301,16,0		warp	moroccwarp5006		10,1,moc_fild02.gat,77,338
moc_fild01.gat,321,16,0		warp	moroccwarp5007		10,1,moc_fild02.gat,77,338
moc_fild01.gat,341,16,0		warp	moroccwarp5008		10,1,moc_fild02.gat,77,338
moc_fild02.gat,67,342,0		warp	moroccwarp5009		11,3,moc_fild01.gat,315,25
moc_fild02.gat,92,342,0		warp	moroccwarp5010		11,3,moc_fild01.gat,315,25
moc_fild02.gat,228,29,0		warp	moroccwarp5011		4,2,moc_fild13.gat,298,367
moc_fild13.gat,298,370,0	warp	moroccwarp5012		4,2,moc_fild02.gat,228,32
moc_fild02.gat,332,19,0		warp	moroccwarp5013		5,3,moc_fild03.gat,70,336
moc_fild03.gat,70,341,0		warp	moroccwarp5014		5,2,moc_fild02.gat,332,23
moc_fild02.gat,71,18,0		warp	moroccwarp5015		4,2,moc_fild13.gat,146,365
moc_fild13.gat,146,368,0	warp	moroccwarp5016		5,2,moc_fild02.gat,71,21
moc_fild03.gat,17,37,0		warp	moroccwarp5017		2,4,moc_fild13.gat,305,49
moc_fild13.gat,308,49,0		warp	moroccwarp5018		2,4,moc_fild03.gat,20,37
moc_fild04.gat,14,98,0		warp	moroccwarp5019		1,11,moc_fild05.gat,378,119
moc_fild04.gat,14,122,0		warp	moroccwarp5020		1,11,moc_fild05.gat,378,119
moc_fild04.gat,14,146,0		warp	moroccwarp5021		1,11,moc_fild05.gat,378,119
moc_fild05.gat,384,108,0	warp	moroccwarp5022		1,8,moc_fild04.gat,22,123
moc_fild05.gat,384,126,0	warp	moroccwarp5023		1,8,moc_fild04.gat,22,123
moc_fild05.gat,384,144,0	warp	moroccwarp5024		1,8,moc_fild04.gat,22,123
moc_fild04.gat,175,18,0		warp	moroccwarp5025		3,2,moc_fild08.gat,170,380
moc_fild08.gat,170,383,0	warp	moroccwarp5026		3,2,moc_fild04.gat,175,21
moc_fild04.gat,19,206,0		warp	moroccwarp5027		3,15,moc_fild05.gat,373,208
moc_fild05.gat,378,208,0	warp	moroccwarp5028		3,14,moc_fild04.gat,26,206
moc_fild05.gat,18,136,0		warp	moroccwarp5029		1,8,moc_fild06.gat,367,317
moc_fild05.gat,18,154,0		warp	moroccwarp5030		1,8,moc_fild06.gat,367,317
moc_fild05.gat,18,172,0		warp	moroccwarp5031		1,8,moc_fild06.gat,367,317
moc_fild06.gat,377,316,0	warp	moroccwarp5032		1,15,moc_fild05.gat,24,153
moc_fild05.gat,268,18,0		warp	moroccwarp5033		4,2,moc_fild09.gat,267,368
moc_fild09.gat,267,371,0	warp	moroccwarp5034		4,2,moc_fild05.gat,268,21
moc_fild05.gat,82,16,0		warp	moroccwarp5035		5,2,moc_fild09.gat,80,366
moc_fild09.gat,80,369,0		warp	moroccwarp5036		7,2,moc_fild05.gat,82,19
moc_fild06.gat,18,198,0		warp	moroccwarp5037		1,18,moc_fild07.gat,378,201
//moc_fild07.gat,381,201,0	warp	moroccwarp5038		2,16,moc_fild06.gat,28,201
moc_fild07.gat,380,202,0	warp	moroccwarp5038		1,1,moc_fild20.gat,36,177
moc_fild06.gat,207,18,0		warp	moroccwarp5039		11,2,moc_fild10.gat,208,295
moc_fild10.gat,208,298,0	warp	moroccwarp5040		10,2,moc_fild06.gat,207,21
moc_fild08.gat,16,207,0		warp	moroccwarp5041		2,4,moc_fild09.gat,371,195
moc_fild09.gat,374,195,0	warp	moroccwarp5042		2,8,moc_fild08.gat,19,207
moc_fild08.gat,204,16,0		warp	moroccwarp5043		4,2,moc_fild14.gat,196,379
moc_fild14.gat,196,382,0	warp	moroccwarp5044		4,2,moc_fild08.gat,204,19
moc_fild08.gat,383,211,0	warp	moroccwarp5045		2,4,moc_fild13.gat,32,171
//moc_fild13.gat,29,171,0	warp	moroccwarp5046		2,4,moc_fild08.gat,380,211
moc_fild13.gat,32,171,0		warp	moroccwarp5046		1,1,moc_fild20.gat,349,179
moc_fild09.gat,126,20,0		warp	moroccwarp5047		4,2,moc_fild15.gat,158,360
moc_fild15.gat,158,363,0	warp	moroccwarp5048		6,2,moc_fild09.gat,126,23
moc_fild09.gat,30,162,0		warp	moroccwarp5049		2,3,moc_fild10.gat,381,258
moc_fild10.gat,384,258,0	warp	moroccwarp5050		2,3,moc_fild09.gat,33,162
moc_fild10.gat,189,23,0		warp	moroccwarp5051		3,2,moc_fild11.gat,189,360
//moc_fild11.gat,189,363,0	warp	moroccwarp5052		3,2,moc_fild10.gat,189,26
moc_fild11.gat,189,360,0	warp	moroccwarp5052		1,1,moc_fild20.gat,197,24
moc_fild11.gat,212,29,0		warp	moroccwarp5053		4,2,moc_fild17.gat,218,366
moc_fild17.gat,218,369,0	warp	moroccwarp5054		5,2,moc_fild11.gat,212,32
moc_fild11.gat,26,161,0		warp	moroccwarp5055		2,10,moc_fild12.gat,286,168
moc_fild12.gat,289,168,0	warp	moroccwarp5056		2,3,moc_fild11.gat,29,161
//moc_fild11.gat,379,197,0	warp	moroccwarp5057		2,6,moc_fild15.gat,41,105
moc_fild11.gat,377,197,0	warp	moroccwarp5057		1,1,moc_fild20.gat,36,177
moc_fild15.gat,38,105,0		warp	moroccwarp5058		2,4,moc_fild11.gat,376,197
moc_fild12.gat,118,30,0		warp	moroccwarp5059		4,2,moc_fild18.gat,158,379
moc_fild18.gat,158,382,0	warp	moroccwarp5060		4,2,moc_fild12.gat,118,33
moc_fild14.gat,16,278,0		warp	moroccwarp5061		2,6,moc_fild15.gat,364,276
moc_fild15.gat,367,276,0	warp	moroccwarp5062		2,4,moc_fild14.gat,19,278
moc_fild15.gat,104,16,0		warp	moroccwarp5063		9,2,moc_fild16.gat,125,380
//moc_fild16.gat,125,383,0	warp	moroccwarp5064		5,2,moc_fild15.gat,104,19
moc_fild16.gat,124,381,0	warp	moroccwarp5064		1,1,moc_fild20.gat,197,24
moc_fild15.gat,348,18,0		warp	moroccwarp5065		5,2,moc_fild16.gat,334,379
//moc_fild16.gat,334,382,0	warp	moroccwarp5066		4,2,moc_fild15.gat,348,21
moc_fild16.gat,333,380,0	warp	moroccwarp5066		1,1,moc_fild20.gat,197,24
moc_fild16.gat,16,179,0		warp	moroccwarp5067		2,6,moc_fild17.gat,366,272
moc_fild17.gat,369,272,0	warp	moroccwarp5068		2,3,moc_fild16.gat,19,179
moc_fild17.gat,30,300,0		warp	moroccwarp5069		2,5,moc_fild18.gat,379,305
moc_fild18.gat,382,305,0	warp	moroccwarp5070		2,4,moc_fild17.gat,33,300
moc_fild21.gat,26,196,0		warp	moroccwarp5071		1,1,moc_fild20.gat,349,179
moc_fild22.gat,32,196,0		warp	moroccwarp5072		1,1,moc_fild20.gat,349,179



//==============================================================
// ----- Payon �t�F�C���� -----
// pay_fild01.gat	�t�F�C���������̐X 01 �` 11
// -----
// payon.gat		�R�x�̓s�s�t�F�C����
// alberta.gat		�`�̓s�s�A���x���^
// moc_fild01.gat	�\�N���h���� 01 �` 19
//==============================================================
pay_fild01.gat,333,360,0	warp	payonwarp0101		5,3,payon.gat,122,31
pay_fild08.gat,17,75,0		warp	payonwarp0102		2,4,payon.gat,265,92
pay_fild03.gat,392,63,0		warp	payonwarp0103		2,7,alberta.gat,19,233

// payon field
pay_fild01.gat,13,152,0		warp	payonwarp0501		2,7,moc_fild03.gat,299,170
pay_fild04.gat,17,165,0		warp	payonwarp0502		2,8,moc_fild01.gat,376,162
pay_fild04.gat,194,17,0		warp	payonwarp0503		7,2,moc_fild02.gat,350,336
pay_fild11.gat,38,330,0		warp	payonwarp0504		4,2,moc_fild03.gat,179,19

pay_fild01.gat,278,14,0		warp	payonwarp5001		13,2,pay_fild02.gat,83,382
pay_fild02.gat,83,386,0		warp	payonwarp5002		13,2,pay_fild01.gat,278,18
pay_fild01.gat,353,14,0		warp	payonwarp5003		20,3,pay_fild02.gat,160,381
pay_fild02.gat,167,390,0	warp	payonwarp5004		20,3,pay_fild01.gat,354,18
pay_fild01.gat,379,201,0	warp	payonwarp5005		2,6,pay_fild07.gat,23,207
pay_fild07.gat,16,200,0		warp	payonwarp5006		3,3,pay_fild01.gat,371,205
pay_fild02.gat,134,16,0		warp	payonwarp5007		5,2,pay_fild05.gat,127,375
pay_fild05.gat,127,378,0	warp	payonwarp5008		4,2,pay_fild02.gat,134,19
pay_fild02.gat,16,175,0		warp	payonwarp5009		2,4,pay_fild11.gat,294,135
pay_fild11.gat,297,135,0	warp	payonwarp5010		2,4,pay_fild02.gat,19,175
pay_fild02.gat,284,108,0	warp	payonwarp5011		2,7,pay_fild03.gat,20,110
pay_fild03.gat,15,110,0		warp	payonwarp5012		2,10,pay_fild02.gat,280,108
pay_fild03.gat,172,281,0	warp	payonwarp5013		5,2,pay_fild07.gat,167,20
pay_fild07.gat,163,17,0		warp	payonwarp5014		5,2,pay_fild03.gat,177,275
pay_fild03.gat,313,16,0		warp	payonwarp5015		4,2,pay_fild06.gat,305,372
pay_fild06.gat,305,375,0	warp	payonwarp5016		6,2,pay_fild03.gat,313,19
pay_fild05.gat,271,284,0	warp	payonwarp5017		2,4,pay_fild06.gat,31,288
pay_fild06.gat,28,288,0		warp	payonwarp5018		2,2,pay_fild05.gat,268,284
pay_fild07.gat,280,382,0	warp	payonwarp5019		4,2,pay_fild08.gat,160,19
pay_fild08.gat,160,16,0		warp	payonwarp5020		4,2,pay_fild07.gat,280,379
pay_fild07.gat,382,290,0	warp	payonwarp5021		2,5,pay_fild10.gat,19,290
pay_fild10.gat,16,290,0		warp	payonwarp5022		2,5,pay_fild07.gat,379,290
pay_fild08.gat,262,91,0		warp	payonwarp5023		2,4,pay_fild09.gat,19,91
pay_fild09.gat,16,91,0		warp	payonwarp5024		2,4,pay_fild08.gat,259,91
pay_fild09.gat,112,16,0		warp	payonwarp5025		4,2,pay_fild10.gat,112,379
pay_fild10.gat,112,382,0	warp	payonwarp5026		3,2,pay_fild09.gat,112,19



//==============================================================
// prt_maze01.gat	���{�̐X
// prt_maze02.gat	���{�̐X
// prt_maze03.gat	���{�̐X
// -----
// mjolnir_12.gat	(1st Floor No.16)�~�����j�[���R�� 12
// prt_fild01.gat	(1st Floor No.20)�v�����e���t�B�[���h 01
//==============================================================
// ----- (1st Floor No.03)(1st Floor No.16)(1st Floor No.20)
// 1st Floor No.01 -------------------------------------------------------------
prt_maze01.gat,22,194,0		warp	mazewarp5101		1,1,prt_maze01.gat,16,31	/*To No.1-21*/
prt_maze01.gat,5,186,0		warp	mazewarp5102		1,1,prt_maze01.gat,182,88	/*To No.1-15*/
// 1st Floor No.02
prt_maze01.gat,58,194,0		warp	mazewarp5103		1,1,prt_maze01.gat,23,128	/*To No.1-6*/
// 1st Floor No.03
prt_maze01.gat,102,165,0	warp	mazewarp5104		1,1,prt_maze01.gat,99,31	/*To No.1-23*/
prt_maze01.gat,85,174,0		warp	mazewarp5105		1,1,prt_maze02.gat,93,20
// 1st Floor No.04
prt_maze01.gat,154,181,0	warp	mazewarp5106		1,1,prt_maze01.gat,191,175	/*To No.1-5*/
prt_maze01.gat,125,171,0	warp	mazewarp5107		1,1,prt_maze01.gat,8,186	/*To No.1-1*/
// 1st Floor No.05
prt_maze01.gat,175,165,0	warp	mazewarp5108		1,1,prt_maze01.gat,48,104	/*To No.1-12*/
prt_maze01.gat,194,175,0	warp	mazewarp5109		1,1,prt_maze01.gat,23,128	/*To No.1-6*/
// 1st Floor No.06
prt_maze01.gat,18,154,0		warp	mazewarp5110		1,1,prt_maze01.gat,177,71	/*To No.1-20*/
prt_maze01.gat,23,125,0		warp	mazewarp5111		1,1,prt_maze01.gat,151,22	/*To No.1-24*/
prt_maze01.gat,5,140,0		warp	mazewarp5112		1,1,prt_maze01.gat,58,48	/*To No.1-17*/
// 1st Floor No.07
prt_maze01.gat,54,154,0		warp	mazewarp5113		1,1,prt_maze01.gat,191,175	/*To No.1-5*/
prt_maze01.gat,63,125,0		warp	mazewarp5114		1,1,prt_maze01.gat,182,88	/*To No.1-15*/
// 1st Floor No.08
prt_maze01.gat,98,154,0		warp	mazewarp5115		1,1,prt_maze01.gat,102,168	/*To No.1-3*/
prt_maze01.gat,114,145,0	warp	mazewarp5116		1,1,prt_maze01.gat,23,128	/*To No.1-6*/
prt_maze01.gat,85,146,0		warp	mazewarp5117		1,1,prt_maze01.gat,142,111	/*To No.1-14*/
// 1st Floor No.09
prt_maze01.gat,137,125,0	warp	mazewarp5118		1,1,prt_maze01.gat,191,139	/*To No.1-10*/
prt_maze01.gat,154,134,0	warp	mazewarp5119		1,1,prt_maze01.gat,58,191	/*To No.1-2*/
// 1st Floor No.10
prt_maze01.gat,194,139,0	warp	mazewarp5120		1,1,prt_maze01.gat,22,88	/*To No.1-11*/
prt_maze01.gat,166,139,0	warp	mazewarp5121		1,1,prt_maze01.gat,128,173	/*To No.1-4*/
// 1st Floor No.11
prt_maze01.gat,17,114,0		warp	mazewarp5122		1,1,prt_maze01.gat,8,186	/*To No.1-1*/
prt_maze01.gat,22,85,0		warp	mazewarp5123		1,1,prt_maze01.gat,137,128	/*To No.1-9*/
// 1st Floor No.12
prt_maze01.gat,63,114,0		warp	mazewarp5124		1,1,prt_maze01.gat,111,56	/*To No.1-18*/
prt_maze01.gat,63,85,0		warp	mazewarp5125		1,1,prt_maze01.gat,151,22	/*To No.1-24*/
prt_maze01.gat,74,97,0		warp	mazewarp5126		1,1,prt_maze01.gat,71,11	/*To No.1-22*/
prt_maze01.gat,45,104,0		warp	mazewarp5127		1,1,prt_maze01.gat,63,128	/*To No.1-7*/
// 1st Floor No.13
prt_maze01.gat,105,114,0	warp	mazewarp5128		1,1,prt_maze01.gat,111,145	/*To No.1-8*/
prt_maze01.gat,114,95,0		warp	mazewarp5129		1,1,prt_maze01.gat,14,48	/*To No.1-16*/
prt_maze01.gat,85,97,0		warp	mazewarp5130		1,1,prt_maze01.gat,63,128	/*To No.1-7*/
// 1st Floor No.14
prt_maze01.gat,142,114,0	warp	mazewarp5131		1,1,prt_maze01.gat,23,128	/*To No.1-6*/
prt_maze01.gat,125,105,0	warp	mazewarp5132		1,1,prt_maze01.gat,14,48	/*To No.1-16*/
// 1st Floor No.15
prt_maze01.gat,182,85,0		warp	mazewarp5133		1,1,prt_maze01.gat,58,48	/*To No.1-17*/
prt_maze01.gat,194,94,0		warp	mazewarp5134		1,1,prt_maze01.gat,58,191	/*To No.1-2*/
prt_maze01.gat,168,94,0		warp	mazewarp5135		1,1,prt_maze01.gat,191,139	/*To No.1-10*/
// 1st Floor No.16
prt_maze01.gat,14,74,0		warp	mazewarp5136		1,1,prt_maze01.gat,151,22	/*To No.1-24*/
prt_maze01.gat,14,45,0		warp	mazewarp5137		1,1,mjolnir_12.gat,44,20
prt_maze01.gat,5,58,0		warp	mazewarp5138		1,1,prt_maze01.gat,48,104	/*To No.1-12*/
// 1st Floor No.17
prt_maze01.gat,74,74,0		warp	mazewarp5139		1,1,prt_maze01.gat,58,191	/*To No.1-2*/
prt_maze01.gat,52,45,0		warp	mazewarp5140		1,1,prt_maze01.gat,139,48	/*To No.1-19*/
// 1st Floor No.18
prt_maze01.gat,104,74,0		warp	mazewarp5141		1,1,prt_maze01.gat,14,48	/*To No.1-16*/
prt_maze01.gat,96,45,0		warp	mazewarp5142		1,1,prt_maze01.gat,63,128	/*To No.1-7*/
prt_maze01.gat,114,56,0		warp	mazewarp5143		1,1,prt_maze01.gat,176,8	/*To No.1-25*/
prt_maze01.gat,85,56,0		warp	mazewarp5144		1,1,prt_maze01.gat,105,111	/*To No.1-13*/
// 1st Floor No.19
prt_maze01.gat,137,74,0		warp	mazewarp5145		1,1,prt_maze01.gat,182,88	/*To No.1-15*/
prt_maze01.gat,139,45,0		warp	mazewarp5146		1,1,prt_maze01.gat,71,11	/*To No.1-22*/
// 1st Floor No.20
prt_maze01.gat,177,74,0		warp	mazewarp5147		1,1,prt_fild01.gat,136,368
prt_maze01.gat,175,45,0		warp	mazewarp5148		1,1,prt_maze01.gat,58,48	/*To No.1-17*/
prt_maze01.gat,194,54,0		warp	mazewarp5149		1,1,prt_maze01.gat,99,31	/*To No.1-23*/
// 1st Floor No.21
prt_maze01.gat,16,34,0		warp	mazewarp5150		1,1,prt_maze01.gat,128,173	/*To No.1-4*/
prt_maze01.gat,23,5,0		warp	mazewarp5151		1,1,prt_maze01.gat,176,8	/*To No.1-25*/
// 1st Floor No.22
prt_maze01.gat,54,5,0		warp	mazewarp5152		1,1,prt_maze01.gat,128,173	/*To No.1-4*/
prt_maze01.gat,74,12,0		warp	mazewarp5153		1,1,prt_maze01.gat,58,48	/*To No.1-17*/
prt_maze01.gat,45,21,0		warp	mazewarp5154		1,1,prt_maze01.gat,142,111	/*To No.1-14*/
// 1st Floor No.23
prt_maze01.gat,99,34,0		warp	mazewarp5155		1,1,prt_maze01.gat,137,128	/*To No.1-9*/
prt_maze01.gat,114,22,0		warp	mazewarp5156		1,1,prt_maze01.gat,177,71	/*To No.1-20*/
prt_maze01.gat,85,13,0		warp	mazewarp5157		1,1,prt_maze01.gat,22,88	/*To No.1-11*/
//1st Floor No.24
prt_maze01.gat,154,22,0		warp	mazewarp5158		1,1,prt_maze01.gat,139,48	/*To No.1-19*/
// 1st Floor No.25
prt_maze01.gat,176,34,0		warp	mazewarp5159		1,1,prt_maze01.gat,8,186	/*To No.1-1*/
prt_maze01.gat,176,5,0		warp	mazewarp5160		1,1,prt_maze01.gat,137,128	/*To No.1-9*/
prt_maze01.gat,194,15,0		warp	mazewarp5161		1,1,prt_maze01.gat,52,48	/*To No.1-17*/
prt_maze01.gat,165,22,0		warp	mazewarp5162		1,1,prt_maze01.gat,63,128	/*To No.1-7*/
// 2nd Floor -------------------------------------------------------------------
prt_maze02.gat,93,16,0		warp	mazewarp5201		1,1,prt_maze01.gat,102,168	/*To No.1-3*/
prt_maze02.gat,100,182,0	warp	mazewarp5202		1,1,prt_maze03.gat,182,88	/*To No.3-15*/
// 3rd Floor No.01 -------------------------------------------------------------
prt_maze03.gat,22,194,0		warp	mazewarp5301		1,1,prt_maze03.gat,175,48	/*To No.3-20*/
prt_maze03.gat,5,186,0		warp	mazewarp5302		1,1,prt_maze03.gat,151,134	/*To No.3-9*/
//3rd Floor No.02
prt_maze03.gat,58,194,0		script	#mazewarp5303		45,1,1,{
	switch(rand(4)) {
		case 0:	warp "prt_maze03.gat",98,151;  end;	/*To No.3-8*/
		case 1:	warp "prt_maze03.gat",137,128; end;	/*To No.3-9*/
		case 2:	warp "prt_maze03.gat",14,71;   end;	/*To No.3-16*/
		case 3:	warp "prt_maze03.gat",54,8;    end;	/*To No.3-22*/
	}
}
// 3rd Floor No.03
prt_maze03.gat,102,165,0	warp	mazewarp5304		1,1,prt_maze03.gat,137,71	/*To No.3-19*/
prt_maze03.gat,85,174,0		warp	mazewarp5305		1,1,prt_maze03.gat,14,47	/*To No.3-16*/
// 3rd Floor No.04
prt_maze03.gat,154,181,0	warp	mazewarp5306		1,1,prt_maze03.gat,139,48	/*To No.3-19*/
prt_maze03.gat,125,171,0	warp	mazewarp5307		1,1,prt_maze03.gat,105,111	/*To No.3-13*/
// 3rd Floor No.05
prt_maze03.gat,175,165,0	warp	mazewarp5308		1,1,prt_maze03.gat,71,12	/*To No.3-22*/
prt_maze03.gat,194,175,0	warp	mazewarp5309		1,1,prt_maze03.gat,191,139	/*To No.3-10*/
// 3rd Floor No.06
prt_maze03.gat,18,154,0		warp	mazewarp5310		1,1,prt_maze03.gat,48,21	/*To No.3-22*/
prt_maze03.gat,23,125,0		warp	mazewarp5311		1,1,prt_maze03.gat,177,71	/*To No.3-20*/
prt_maze03.gat,5,140,0		warp	mazewarp5312		1,1,prt_maze03.gat,111,56	/*To No.3-18*/
// 3rd Floor No.07
prt_maze03.gat,54,154,0		warp	mazewarp5313		1,1,prt_maze03.gat,142,111	/*To No.3-14*/
prt_maze03.gat,63,125,0		warp	mazewarp5314		1,1,prt_maze03.gat,88,97	/*To No.3-13*/
// 3rd Floor No.08
prt_maze03.gat,98,154,0		warp	mazewarp5315		1,1,prt_maze03.gat,99,31	/*To No.3-23*/
prt_maze03.gat,114,145,0	warp	mazewarp5316		1,1,prt_maze03.gat,168,22	/*To No.3-25*/
prt_maze03.gat,85,146,0		warp	mazewarp5317		1,1,prt_maze03.gat,22,88	/*To No.3-11*/
// 3rd Floor No.09
prt_maze03.gat,137,125,0	warp	mazewarp5318		1,1,prt_maze03.gat,71,71	/*To No.3-17*/
prt_maze03.gat,154,134,0	warp	mazewarp5319		1,1,prt_maze03.gat,8,186	/*To No.3-1*/
// 3rd Floor No.10
prt_maze03.gat,194,139,0	warp	mazewarp5320		1,1,prt_maze03.gat,191,175	/*To No.3-5*/
prt_maze03.gat,166,139,0	warp	mazewarp5321		1,1,prt_maze03.gat,63,88	/*To No.3-12*/
// 3rd Floor No.11
prt_maze03.gat,17,114,0		warp	mazewarp5322		1,1,prt_maze03.gat,128,105	/*To No.3-14*/
prt_maze03.gat,22,85,0		warp	mazewarp5323		1,1,prt_maze03.gat,88,146	/*To No.3-8*/
// 3rd Floor No.12
prt_maze03.gat,63,114,0		warp	mazewarp5324		1,1,prt_maze03.gat,14,71	/*To No.3-16*/
prt_maze03.gat,63,85,0		warp	mazewarp5325		1,1,prt_maze03.gat,169,139	/*To No.3-10*/
prt_maze03.gat,74,97,0		warp	mazewarp5326		1,1,prt_maze03.gat,54,8		/*To No.3-22*/
prt_maze03.gat,45,104,0		warp	mazewarp5327		1,1,prt_maze03.gat,96,48	/*To No.3-18*/
// 3rd Floor No.13
prt_maze03.gat,105,114,0	warp	mazewarp5328		1,1,prt_maze03.gat,128,171	/*To No.3-4*/
prt_maze03.gat,114,95,0		warp	mazewarp5329		1,1,prt_maze03.gat,176,8	/*To No.3-25*/
prt_maze03.gat,85,97,0		warp	mazewarp5330		1,1,prt_maze03.gat,63,128	/*To No.3-7*/
// 3rd Floor No.14
prt_maze03.gat,142,114,0	warp	mazewarp5331		1,1,prt_maze03.gat,54,151	/*To No.3-7*/
prt_maze03.gat,125,105,0	warp	mazewarp5332		1,1,prt_maze03.gat,58,191	/*To No.3-2*/
// 3rd Floor No.15
prt_maze03.gat,182,85,0		warp	mazewarp5333		1,1,prt_maze02.gat,100,179
prt_maze03.gat,194,94,0		warp	mazewarp5334		1,1,prt_maze03.gat,151,22	/*To No.3-24*/
prt_maze03.gat,168,94,0		warp	mazewarp5335		1,1,prt_maze03.gat,191,54	/*To No.3-20*/
// 3rd Floor No.16
prt_maze03.gat,14,74,0		warp	mazewarp5336		1,1,prt_maze03.gat,63,111	/*To No.3-12*/
prt_maze03.gat,14,45,0		warp	mazewarp5337		1,1,prt_maze03.gat,88,174	/*To No.3-3*/
prt_maze03.gat,5,58,0		warp	mazewarp5338		1,1,prt_maze03.gat,191,15	/*To No.3-25*/
// 3rd Floor No.17
prt_maze03.gat,74,74,0		script	#mazewarp5339		45,1,1,{
	switch(rand(4)) {
		case 0:	warp "prt_maze03.gat",98,151;  end;	/*To No.3-8*/
		case 1:	warp "prt_maze03.gat",137,128; end;	/*To No.3-9*/
		case 2:	warp "prt_maze03.gat",14,71;   end;	/*To No.3-16*/
		case 3:	warp "prt_maze03.gat",54,8;    end;	/*To No.3-22*/
	}
}
prt_maze03.gat,52,45,0		warp	mazewarp5340		1,1,prt_maze03.gat,16,31	/*To No.3-21*/
// 3rd Floor No.18
prt_maze03.gat,104,74,0		warp	mazewarp5341		1,1,prt_maze03.gat,111,22	/*To No.3-23*/
prt_maze03.gat,96,45,0		warp	mazewarp5342		1,1,prt_maze03.gat,48,104	/*To No.3-12*/
prt_maze03.gat,114,56,0		warp	mazewarp5343		1,1,prt_maze03.gat,8,140	/*To No.3-6*/
prt_maze03.gat,85,56,0		warp	mazewarp5344		1,1,prt_maze03.gat,176,31	/*To No.3-25*/
// 3rd Floor No.19
prt_maze03.gat,137,74,0		warp	mazewarp5345		1,1,prt_maze03.gat,102,168	/*To No.3-3*/

prt_maze03.gat,139,45,0		script	#mazewarp5346		45,1,1,{
	switch(rand(4)) {
		case 0:	warp "prt_maze03.gat",98,151;  end;	/*To No.3-8*/
		case 1:	warp "prt_maze03.gat",137,128; end;	/*To No.3-9*/
		case 2:	warp "prt_maze03.gat",14,71;   end;	/*To No.3-16*/
		case 3:	warp "prt_maze03.gat",54,8;    end;	/*To No.3-22*/
	}
}
// 3rd Floor No.20
prt_maze03.gat,177,74,0		warp	mazewarp5347		1,1,prt_maze03.gat,23,128	/*To No.3-6*/
prt_maze03.gat,175,45,0		warp	mazewarp5348		1,1,prt_maze03.gat,22,191	/*To No.3-1*/
prt_maze03.gat,194,54,0		warp	mazewarp5349		1,1,prt_maze03.gat,171,94	/*To No.3-15*/
// 3rd Floor No.21
prt_maze03.gat,16,34,0		warp	mazewarp5350		1,1,prt_maze03.gat,52,48	/*To No.3-17*/
prt_maze03.gat,23,5,0		warp	mazewarp5351		1,1,prt_maze03.gat,88,13	/*To No.3-23*/
// 3rd Floor No.22
prt_maze03.gat,54,5,0		warp	mazewarp5352		1,1,prt_maze03.gat,71,97	/*To No.3-12*/
prt_maze03.gat,74,12,0		warp	mazewarp5353		1,1,prt_maze03.gat,175,168	/*To No.3-5*/
prt_maze03.gat,45,21,0		warp	mazewarp5354		1,1,prt_maze03.gat,18,151	/*To No.3-6*/
// 3rd Floor No.23
prt_maze03.gat,99,34,0		warp	mazewarp5355		1,1,prt_maze03.gat,98,151	/*To No.3-8*/
prt_maze03.gat,114,22,0		warp	mazewarp5356		1,1,prt_maze03.gat,104,71	/*To No.3-18*/
prt_maze03.gat,85,13,0		warp	mazewarp5357		1,1,prt_maze03.gat,23,8		/*To No.3-21*/
// 3rd Floor No.24
prt_maze03.gat,154,22,0		script	#mazewarp5358		45,1,1,{
	switch(rand(4)) {
		case 0:	warp "prt_maze03.gat",98,151;  end;	/*To No.3-8*/
		case 1:	warp "prt_maze03.gat",137,128; end;	/*To No.3-9*/
		case 2:	warp "prt_maze03.gat",14,71;   end;	/*To No.3-16*/
		case 3:	warp "prt_maze03.gat",54,8;    end;	/*To No.3-22*/
	}
}
// 3rd Floor No.25
prt_maze03.gat,176,34,0		warp	mazewarp5359		1,1,prt_maze03.gat,88,56	/*To No.3-18*/
prt_maze03.gat,176,5,0		warp	mazewarp5360		1,1,prt_maze03.gat,111,95	/*To No.3-13*/
prt_maze03.gat,194,15,0		warp	mazewarp5361		1,1,prt_maze03.gat,8,58		/*To No.3-16*/
prt_maze03.gat,165,22,0		warp	mazewarp5362		1,1,prt_maze03.gat,111,145	/*To No.3-8*/



//==============================================================
// ----- Alberta �A���x���^ -----
// alb2trea.gat		���v�D�t�߂̓�
// -----
// treasure01.gat	���v�D�P�w
//==============================================================
alb2trea.gat,88,111,0		warp	albertawarp0401		1,1,treasure01.gat,69,24



//---JP2.0 �ǉ��}�b�v---


//==============================================================
// ----- Comodo �R���h -----
// cmd_fild01.gat	�p�v�`�J�X
// cmd_fild02.gat	�R�R���r�[�`
// cmd_fild03.gat	�W�i�C��
// cmd_fild04.gat	�R�R���r�[�`
// cmd_fild05.gat	�p�v�`�J�X��
// cmd_fild06.gat	�T���_���}���v�� ��
// cmd_fild07.gat	�t�@���X���䓇
// cmd_fild08.gat	�T���_���}���v�� ��
// cmd_fild09.gat	�T���_���}���v�� ��
// -----
// beach_dun3.gat	�����A �}�I
// um_fild03.gat	�J������
// moc_fild01.gat	�\�N���h���� 01 �` 19
// in_rogue.gat		���[�O�M���h
//==============================================================
// �����A �}�I
cmd_fild01.gat,26,318,0		warp	comodowarp0401		1,1,beach_dun3.gat,281,56
// �J������
cmd_fild01.gat,178,370,0	warp	comodowarp0501		1,1,um_fild03.gat,243,29
cmd_fild01.gat,77,366,0		warp	comodowarp0502		1,1,um_fild03.gat,114,53
// other point
cmd_fild08.gat,354,324,0	warp	comodowarp0503		1,1,moc_fild12.gat,26,305
cmd_fild09.gat,369,164,0	warp	comodowarp0504		2,2,moc_fild18.gat,55,170
// Rogue
cmd_fild07.gat,193,117,0	warp	comodowarp0601		0,0,in_rogue.gat,379,46

cmd_fild01.gat,222,24,0		warp	comodowarp5001		1,1,cmd_fild02.gat,222,372
cmd_fild02.gat,222,376,0	warp	comodowarp5002		1,1,cmd_fild01.gat,222,30
cmd_fild01.gat,362,73,0		warp	comodowarp5003		1,1,cmd_fild03.gat,27,68
cmd_fild03.gat,23,68,0		warp	comodowarp5004		1,1,cmd_fild01.gat,359,76
cmd_fild01.gat,362,263,0	warp	comodowarp5005		1,1,cmd_fild03.gat,27,269
cmd_fild03.gat,23,269,0		warp	comodowarp5006		1,1,cmd_fild01.gat,359,260
cmd_fild02.gat,358,95,0		warp	comodowarp5007		1,1,cmd_fild04.gat,35,94
cmd_fild04.gat,31,92,0		warp	comodowarp5008		1,1,cmd_fild02.gat,351,92
cmd_fild02.gat,382,269,0	warp	comodowarp5009		1,1,cmd_fild04.gat,25,275
cmd_fild04.gat,21,275,0		warp	comodowarp5010		1,1,cmd_fild02.gat,378,264
cmd_fild03.gat,181,17,0		warp	comodowarp5011		1,1,cmd_fild04.gat,181,367
cmd_fild04.gat,180,372,0	warp	comodowarp5012		1,1,cmd_fild03.gat,183,23
cmd_fild03.gat,384,165,0	warp	comodowarp5013		1,1,cmd_fild05.gat,26,161
cmd_fild05.gat,21,163,0		warp	comodowarp5014		1,1,cmd_fild03.gat,377,167
cmd_fild04.gat,376,287,0	warp	comodowarp5015		1,1,cmd_fild06.gat,26,288
cmd_fild06.gat,21,285,0		warp	comodowarp5016		1,1,cmd_fild04.gat,371,288
cmd_fild05.gat,148,19,0		warp	comodowarp5017		1,1,cmd_fild06.gat,150,374
cmd_fild06.gat,150,380,0	warp	comodowarp5018		1,1,cmd_fild05.gat,146,27
cmd_fild06.gat,151,27,0		warp	comodowarp5019		1,1,cmd_fild07.gat,147,370
cmd_fild07.gat,149,379,0	warp	comodowarp5020		10,1,cmd_fild06.gat,147,36
cmd_fild06.gat,368,96,0		warp	comodowarp5021		1,1,cmd_fild08.gat,25,102
cmd_fild08.gat,15,102,0		warp	comodowarp5022		1,1,cmd_fild06.gat,361,96
cmd_fild06.gat,372,359,0	warp	comodowarp5023		1,1,cmd_fild08.gat,31,359
cmd_fild08.gat,25,355,0		warp	comodowarp5024		1,1,cmd_fild06.gat,369,359
cmd_fild06.gat,379,174,0	warp	comodowarp5025		1,1,cmd_fild08.gat,28,166
cmd_fild08.gat,25,170,0		warp	comodowarp5026		1,1,cmd_fild06.gat,374,167
cmd_fild07.gat,389,186,0	warp	comodowarp5027		1,3,cmd_fild09.gat,18,170
cmd_fild09.gat,12,170,0		warp	comodowarp5028		1,4,cmd_fild07.gat,382,184
cmd_fild08.gat,76,31,0		warp	comodowarp5029		2,1,cmd_fild09.gat,76,375
cmd_fild09.gat,75,382,0		warp	comodowarp5030		2,1,cmd_fild08.gat,75,42
cmd_fild08.gat,309,48,0		warp	comodowarp5031		2,1,cmd_fild09.gat,307,374
cmd_fild09.gat,309,381,0	warp	comodowarp5032		2,1,cmd_fild08.gat,309,60
cmd_fild08.gat,335,355,0	warp	comodowarp5033		1,1,anthell01.gat,35,263
cmd_fild08.gat,348,82,0		warp	comodowarp5034		1,1,anthell02.gat,168,170



//---JP2.5 �ǉ��}�b�v---


//---JP3.0 �ǉ��}�b�v---


//==============================================================
// ----- Yuno �W���m�[ -----
// yuno_fild01.gat	�������⏊
// yuno_fild02.gat	�L���n�C���̕ʑ�
// yuno_fild03.gat	�G�����X�v���[�g
// yuno_fild04.gat	�G�����X�v���[�g
// -----
// aldebaran.gat	�����s�s�A���f�o����
// yuno.gat 		�V���o���c�o���h���a���̎�s�W���m�[
// mag_dun01.gat	�m�[�O���[�h 1�w
//==============================================================
yuno_fild01.gat,208,18,0	warp	yunowarp0101		1,1,aldebaran.gat,140,239
yuno_fild04.gat,231,288,0	warp	yunowarp0102		1,1,yuno.gat,158,16

yuno_fild03.gat,32,139,0	warp	yunowarp0401		1,1,mag_dun01.gat,126,69

//YunoFild01��YunoFild02
//yuno_fild01.gat,70,378,0	warp	yunowarp5001		1,1,yuno_fild02.gat,70,27
//yuno_fild02.gat,70,23,0	warp	yunowarp5002		1,1,yuno_fild01.gat,70,375
//yuno_fild01.gat,286,368,0	warp	yunowarp5003		1,1,yuno_fild02.gat,294,28
//yuno_fild02.gat,294,24,0	warp	yunowarp5004		1,1,yuno_fild01.gat,286,365
//YunoFild02��YunoFild03
yuno_fild02.gat,18,337,0	warp	yunowarp5005		1,1,yuno_fild03.gat,379,331
yuno_fild03.gat,383,331,0	warp	yunowarp5006		1,1,yuno_fild02.gat,22,337
//YunoFild03��YunoFild04
yuno_fild03.gat,21,162,0	warp	yunowarp5007		1,1,yuno_fild04.gat,371,147
yuno_fild04.gat,374,149,0	warp	yunowarp5008		1,1,yuno_fild03.gat,25,162
yuno_fild03.gat,20,79,0		warp	yunowarp5009		1,1,yuno_fild04.gat,370,81
yuno_fild04.gat,374,82,0	warp	yunowarp5010		1,1,yuno_fild03.gat,24,79



//---�A�}�c�ǉ��}�b�v---


//==============================================================
// ----- Amatsu �A�}�c -----
// ama_fild01.gat	�A�}�c�t�B�[���h
// -----
// amatsu.gat		�򐅂̍��A�}�c
// ama_in01.gat		�A�}�c ����
//==============================================================
ama_fild01.gat,75,30,0		warp	amatsuwarp0101		1,1,amatsu.gat,248,289
ama_fild01.gat,174,331,0	warp	amatsuwarp0102		1,1,ama_in01.gat,175,174
ama_fild01.gat,330,141,0	warp	amatsuwarp0103		1,1,ama_in01.gat,174,124



//---�R�������ǉ��}�b�v---


//==============================================================
// ----- Gonryun �R������ -----
// gon_fild01.gat	�R�������t�B�[���h
// -----
// gonryun.gat		�_��̓��R������
//==============================================================
gon_fild01.gat,192,266,0	warp	gonryunwarp0101		1,1,gonryun.gat,161,11



//---�E���o���ǉ��}�b�v


//==============================================================
// ----- Umbala �E���o�� -----
// um_fild01.gat	�����J�X
// um_fild02.gat	�t���K�X
// um_fild03.gat	�J������
// um_fild04.gat	�t���K�W�����O��
// -----
// umbala.gat		�E�[�^�����̑��E���o��
// beach_dun2.gat	�k���A �������_
// cmd_fild01.gat	�p�v�`�J�X
//==============================================================
um_fild04.gat,215,339,0		warp	umbalawarp0101		1,1,umbala.gat,130,82

um_fild01.gat,31,274,0		warp	umbalawarp0401		1,1,beach_dun2.gat,255,244

um_fild03.gat,243,26,0		warp	umbalawarp0501		1,1,cmd_fild01.gat,176,367
um_fild03.gat,114,50,0		warp	umbalawarp0502		1,1,cmd_fild01.gat,74,363

//�����J�X �� �t���K�X
um_fild01.gat,369,277,0		warp	umbalawarp5001		1,1,um_fild02.gat,25,272
um_fild02.gat,22,272,0		warp	umbalawarp5002		1,1,um_fild01.gat,366,277
//�J������ �� �t���K�X(��)
um_fild03.gat,19,334,0		warp	umbalawarp5003		1,1,um_fild02.gat,370,329
um_fild02.gat,373,329,0		warp	umbalawarp5004		1,1,um_fild03.gat,23,334
//�J������ �� �t���K�X(��)
um_fild03.gat,32,145,0		warp	umbalawarp5005		1,1,um_fild02.gat,370,148
um_fild02.gat,373,148,0		warp	umbalawarp5006		1,1,um_fild03.gat,36,145
//�t���K�X �� �t���K�W�����O��
um_fild02.gat,188,374,0		warp	umbalawarp5007		1,1,um_fild04.gat,182,16
um_fild04.gat,182,13,0		warp	umbalawarp5008		1,1,um_fild02.gat,190,371



//---�j�u���w�C���ǉ��}�b�v


//==============================================================
// ----- �t�x���Q���~���̐� -----
// yggdrasil01.gat	�t�x���Q���~���̐�(�C�O�h���V���̊�)
// -----
// um_dun02.gat		�[���̖���
// nif_fild01.gat	�鋫�̑�
//==============================================================
//yggdrasil01.gat,36,63,0	warp	yggdrasiwarp0401	1,1,um_dun02.gat,126,147
yggdrasil01.gat,248,259,0	warp	yggdrasiwarp0501	1,1,nif_fild01.gat,315,67

//yggdrasil01
yggdrasil01.gat,270,52,0	warp	yggdrasiwarp5001	1,1,yggdrasil01.gat,30,196
yggdrasil01.gat,27,195,0	warp	yggdrasiwarp5002	1,1,yggdrasil01.gat,267,56



//==============================================================
// ----- Niflheimg �j�u���w�C�� -----
// nif_fild01.gat	�鋫�̑�
// nif_fild02.gat	�M�����k�J
// -----
// niflheim.gat		���҂̊X�j�u���w�C��
// yggdrasil01.gat	�t�x���Q���~���̐�(�C�O�h���V���̊�)
//==============================================================
nif_fild02.gat,378,235,0	warp	niflheimwarp0101	1,1,niflheim.gat,23,154
//nif_fild01.gat,315,63,0	warp	niflheimwarp0501	1,1,yggdrasil01.gat,245,259

nif_fild01.gat,344,322,0	warp	niflheimwarp5001	1,1,nif_fild02.gat,26,311
nif_fild02.gat,22,311,0		warp	niflheimwarp5002	1,1,nif_fild01.gat,340,322



//---���V��ǉ��}�b�v


//==============================================================
// ----- Louyang ���V�� -----
// lou_fild01.gat	���V��t�B�[���h
// -----
// louyang.gat		�Ós ���V��
//==============================================================
lou_fild01.gat,233,356,0	warp	louyangwarp0101		2,1,louyang.gat,218,22



//---�_��N�G�X�g�ǉ��}�b�v


//---�A���^���ǉ��}�b�v


//==============================================================
// ----- Ayothaya �A���^�� -----
// ayo_fild01.gat	�A���^���t�B�[���h
// ayo_fild02.gat	�A���^���t�B�[���h
// -----
//==============================================================
ayo_fild01.gat,32,240,0		warp	ayothayawarp0101	1,1,ayothaya.gat,273,176

ayo_fild02.gat,285,150,0	warp	ayothayawarp0501	1,1,ayo_dun01.gat,275,18




//---�A���f�o�����^�[�{�g���b�N�ǉ��}�b�v


//---�|�S�̓s�s�A�C���u���b�N�ǉ��}�b�v


//==============================================================
// ----- Einbroch �A�C���u���b�N -----
// -- �W���m�[�t�B�[���h�ǉ��}�b�v --
// yuno_fild05.gat	�G�����X�v���[�g
// yuno_fild07.gat	�G�����X���J �[���̒J��
// yuno_fild08.gat	�L���n�C���w�Z
// yuno_fild09.gat	�V���o���c�o���h�x������c�n
// yuno_fild11.gat	�W���m�[�t�B�[���h
// yuno_fild12.gat	�������⏊
// ein_fild06.gat	�A�C���u���b�N�t�B�[���h
// ein_fild07.gat	�A�C���u���b�N�t�B�[���h
// ein_fild08.gat	�A�C���u���b�N�t�B�[���h
// ein_fild09.gat	�A�C���u���b�N�t�B�[���h
// ein_fild10.gat	�A�C���u���b�N�t�B�[���h
// -----
// einbroch.gat		�|�S�̓s�s�A�C���u���b�N
// einbech.gat		�̍z�̑��A�C���x�t
// yuno_fild04.gat	�G�����X�v���[�g
//==============================================================
ein_fild08.gat,164,380,0	warp	einbrochwarp0101	2,2,einbroch.gat,150,28
ein_fild09.gat,71,352,0		warp	einbrochwarp0102	2,2,einbech.gat,62,32

//YunoFild01��YunoFild09
yuno_fild01.gat,70,377,0	warp	einbrochwarp5001	1,1,yuno_fild09.gat,70,21
yuno_fild09.gat,70,18,0		warp	einbrochwarp5002	1,1,yuno_fild01.gat,70,374
yuno_fild01.gat,287,367,0	warp	einbrochwarp5003	1,1,yuno_fild09.gat,280,32
yuno_fild09.gat,280,29,0	warp	einbrochwarp5004	1,1,yuno_fild01.gat,287,364
//YunoFild01��YunoFild12
yuno_fild01.gat,26,246,0	warp	einbrochwarp5005	1,1,yuno_fild12.gat,366,244
yuno_fild12.gat,369,244,0	warp	einbrochwarp5006	1,1,yuno_fild01.gat,31,248
//YunoFild02��YunoFild08
yuno_fild02.gat,69,22,0		warp	einbrochwarp5007	1,1,yuno_fild08.gat,75,372
yuno_fild08.gat,75,375,0	warp	einbrochwarp5008	1,1,yuno_fild02.gat,69,25
yuno_fild02.gat,287,16,0	warp	einbrochwarp5009	1,1,yuno_fild08.gat,285,382
yuno_fild08.gat,285,385,0	warp	einbrochwarp5010	1,1,yuno_fild02.gat,290,20
//YunoFild03��YunoFild07
yuno_fild03.gat,178,15,0	warp	einbrochwarp5011	1,1,yuno_fild07.gat,179,351
yuno_fild07.gat,179,354,0	warp	einbrochwarp5012	1,1,yuno_fild03.gat,178,18
//YunoFild04��YunoFild05
yuno_fild04.gat,42,370,0	warp	einbrochwarp5013	1,1,yuno_fild05.gat,61,33
yuno_fild05.gat,61,29,0		warp	einbrochwarp5014	1,1,yuno_fild04.gat,42,366
//YunoFild07��YunoFild08
yuno_fild07.gat,360,72,0	warp	einbrochwarp5015	1,1,yuno_fild08.gat,35,61
yuno_fild08.gat,31,58,0		warp	einbrochwarp5016	1,1,yuno_fild07.gat,357,75
yuno_fild07.gat,352,292,0	warp	einbrochwarp5017	1,1,yuno_fild08.gat,27,275
yuno_fild08.gat,24,275,0	warp	einbrochwarp5018	1,1,yuno_fild07.gat,348,288
//YunoFild07��YunoFild11
yuno_fild07.gat,92,28,0		warp	einbrochwarp5019	1,1,yuno_fild11.gat,91,369
yuno_fild11.gat,91,372,0	warp	einbrochwarp5020	1,1,yuno_fild07.gat,92,31
//YunoFild08��YunoFild09
yuno_fild08.gat,375,194,0	warp	einbrochwarp5021	1,1,yuno_fild09.gat,23,193
yuno_fild09.gat,20,193,0	warp	einbrochwarp5022	1,1,yuno_fild08.gat,372,194
//YunoFild08��YunoFild12
yuno_fild08.gat,134,29,0	warp	einbrochwarp5023	1,1,yuno_fild12.gat,197,371
yuno_fild12.gat,193,372,0	warp	einbrochwarp5024	1,1,yuno_fild08.gat,134,33
//YunoFild11��YunoFild12
yuno_fild11.gat,364,218,0	warp	einbrochwarp5025	1,1,yuno_fild12.gat,26,230
yuno_fild12.gat,23,226,0	warp	einbrochwarp5026	1,1,yuno_fild11.gat,361,218
yuno_fild11.gat,368,361,0	warp	einbrochwarp5027	1,1,yuno_fild12.gat,27,336
yuno_fild12.gat,23,339,0	warp	einbrochwarp5028	1,1,yuno_fild11.gat,364,356
//EinFild06��YunoFild04
ein_fild06.gat,251,365,0	warp	einbrochwarp5029	1,1,yuno_fild04.gat,249,25
yuno_fild04.gat,249,22,0	warp	einbrochwarp5030	1,1,ein_fild06.gat,251,362
//EinFild06��YunoFild07
ein_fild06.gat,355,95,0		warp	einbrochwarp5031	1,1,yuno_fild07.gat,60,79
yuno_fild07.gat,57,79,0		warp	einbrochwarp5032	1,1,ein_fild06.gat,352,95
ein_fild06.gat,335,176,0	warp	einbrochwarp5033	1,1,yuno_fild07.gat,76,220
yuno_fild07.gat,73,220,0	warp	einbrochwarp5034	1,1,ein_fild06.gat,332,176
//EinFild06��EinFild07
ein_fild06.gat,135,36,0		warp	einbrochwarp5035	1,1,ein_fild07.gat,147,359
ein_fild07.gat,144,362,0	warp	einbrochwarp5036	1,1,ein_fild06.gat,135,39
//EinFild07��YunoFild11
ein_fild07.gat,381,264,0	warp	einbrochwarp5037	1,1,yuno_fild11.gat,31,266
yuno_fild11.gat,28,266,0	warp	einbrochwarp5038	1,1,ein_fild07.gat,378,264
//EinFild07��EinFild10
ein_fild07.gat,183,43,0		warp	einbrochwarp5039	1,1,ein_fild10.gat,196,368
ein_fild10.gat,196,371,0	warp	einbrochwarp5040	1,1,ein_fild07.gat,179,46
//EinFild08��EinFild09
ein_fild08.gat,361,129,0	warp	einbrochwarp5041	1,1,ein_fild09.gat,37,135
ein_fild09.gat,34,135,0		warp	einbrochwarp5042	1,1,ein_fild08.gat,358,130
//EinFild09��EinFild10
ein_fild09.gat,328,344,0	warp	einbrochwarp5043	1,1,ein_fild10.gat,28,330
ein_fild10.gat,25,330,0		warp	einbrochwarp5044	1,1,ein_fild09.gat,325,344



//---��Ɠs�s���q�^���[���ǉ��}�b�v


//==============================================================
// -----  ���q�^���[�� -----
// ein_fild03.gat	�A�C���u���b�N�t�B�[���h
// ein_fild04.gat	�A�C���u���b�N�t�B�[���h
// lhz_fild01.gat	���q�^���[���t�B�[���h
// lhz_fild02.gat	���q�^���[���t�B�[���h(���_�̌k�J)
// lhz_fild03.gat	���q�^���[���t�B�[���h
// -----
// lighthalzen.gat	��Ɠs�s���q�^���[��
// ein_fild08.gat	�A�C���u���b�N�t�B�[���h
//==============================================================
//�A�C���u���b�N�t�B�[���h04�˃A�C���u���b�N
ein_fild04.gat,184,26,0		warp	lighthalzenwarp0101	1,1,einbroch.gat,157,327
//���q�^���[���t�B�[���h01�ˊ�Ɠs�s���q�^���[��
lhz_fild01.gat,210,18,0		warp	lighthalzenwarp0102	1,1,lighthalzen.gat,214,327

//�A�C���u���b�N�t�B�[���h03�˃A�C���u���b�N�t�B�[���h04
ein_fild03.gat,361,204,0	warp	lighthalzenwarp5003	1,1,ein_fild04.gat,19,205
ein_fild04.gat,14,205,0		warp	lighthalzenwarp5004	1,1,ein_fild03.gat,355,204
ein_fild03.gat,361,219,0	warp	lighthalzenwarp5005	1,1,ein_fild04.gat,19,215
ein_fild04.gat,14,215,0		warp	lighthalzenwarp5006	1,1,ein_fild03.gat,355,219
ein_fild03.gat,363,257,0	warp	lighthalzenwarp5007	1,1,ein_fild04.gat,26,251
ein_fild04.gat,22,250,0		warp	lighthalzenwarp5008	1,1,ein_fild03.gat,357,261
//�A�C���u���b�N�t�B�[���h03�˃��q�^���[���t�B�[���h02(���_�̌k�J)
ein_fild03.gat,142,32,0		warp	lighthalzenwarp5009	1,1,lhz_fild02.gat,163,360
lhz_fild02.gat,166,366,0	warp	lighthalzenwarp5010	1,1,ein_fild03.gat,142,40
//�A�C���u���b�N�t�B�[���h08��L���q�^���[���t�B�[���h03
ein_fild08.gat,23,275,0		warp	lighthalzenwarp5011	1,1,lhz_fild03.gat,357,284
lhz_fild03.gat,364,282,0	warp	lighthalzenwarp5012	1,1,ein_fild08.gat,29,276
//���q�^���[���t�B�[���h01�˃��q�^���[���t�B�[���h02(���_�̌k�J)
lhz_fild01.gat,367,222,0	warp	lighthalzenwarp5013	1,1,lhz_fild02.gat,36,221
lhz_fild02.gat,29,219,0		warp	lighthalzenwarp5014	1,1,lhz_fild01.gat,361,222
//���q�^���[���t�B�[���h02(���_�̌k�J)�˃��q�^���[���t�B�[���h03
lhz_fild02.gat,164,37,0		warp	lighthalzenwarp5015	1,1,lhz_fild03.gat,158,343
lhz_fild03.gat,158,350,0	warp	lighthalzenwarp5016	1,1,lhz_fild02.gat,164,44



//---�m�[�O�n���g�ǉ��}�b�v


//==============================================================
// -----  �m�[�O�n���g -----
// yuno_fild06.gat	�G�����X�v���[�g
// hu_fild01.gat	�^�i�g�X�^���[
// hu_fild04.gat	�t�B�Q���t�B�[���h
// hu_fild05.gat	�A�r�X���C�N
// hu_fild07.gat	�t�B�Q���t�B�[���h
// -----
// yuno_fild02.gat	�G�����X�v���[�g
// yuno_fild03.gat	�G�����X�v���[�g
// yuno_fild05.gat	�G�����X�v���[�g
// yuno_fild09.gat	�V���o���c�o���h�x������c�n
//==============================================================
//�W���m�[�t�B�[���h06�̃W���m�[�t�B�[���h05
yuno_fild06.gat,41,319,0	warp	noghaltwarp5001	1,1,yuno_fild05.gat,366,319
yuno_fild05.gat,370,321,0	warp	noghaltwarp5002	1,1,yuno_fild06.gat,48,322
//�W���m�[�t�B�[���h06�̃W���m�[�t�B�[���h03
yuno_fild06.gat,214,27,0	warp	noghaltwarp5003	1,1,yuno_fild03.gat,215,375
yuno_fild03.gat,215,382,0	warp	noghaltwarp5004	1,1,yuno_fild06.gat,218,33
//�t�B�Q���t�B�[���h01�̃W���m�[�t�B�[���h06
hu_fild01.gat,141,36,0		warp	noghaltwarp5005	1,1,yuno_fild06.gat,156,368
yuno_fild06.gat,151,370,0	warp	noghaltwarp5006	1,1,hu_fild01.gat,135,42
//�t�B�Q���t�B�[���h04�̃W���m�[�t�B�[���h06
hu_fild04.gat,27,126,0		warp	noghaltwarp5007	1,1,yuno_fild06.gat,362,132
yuno_fild06.gat,369,132,0	warp	noghaltwarp5008	1,1,hu_fild04.gat,34,126
//�t�B�Q���t�B�[���h04�̃W���m�[�t�B�[���h02
hu_fild04.gat,122,27,0		warp	noghaltwarp5009	1,1,yuno_fild02.gat,114,370
yuno_fild02.gat,117,375,0	warp	noghaltwarp5010	1,1,hu_fild04.gat,122,35
//�t�B�Q���t�B�[���h04�̃t�B�Q���t�B�[���h05
hu_fild04.gat,380,183,0		warp	noghaltwarp5011	1,1,hu_fild05.gat,39,206
hu_fild05.gat,33,198,0		warp	noghaltwarp5012	1,1,hu_fild04.gat,373,181
//�t�B�Q���t�B�[���h05�̃t�B�Q���t�B�[���h07
hu_fild05.gat,89,43,0		warp	noghaltwarp5013	1,1,hu_fild07.gat,80,365
hu_fild07.gat,81,370,0		warp	noghaltwarp5014	1,1,hu_fild05.gat,89,50
//�t�B�Q���t�B�[���h07�̃W���m�[�t�B�[���h02
hu_fild07.gat,36,352,0		warp	noghaltwarp5015	1,1,yuno_fild02.gat,378,336
yuno_fild02.gat,383,339,0	warp	noghaltwarp5016	1,1,hu_fild07.gat,42,351
//�t�B�Q���t�B�[���h07�̃W���m�[�t�B�[���h09
hu_fild07.gat,57,37,0		warp	noghaltwarp5017	1,1,yuno_fild09.gat,48,370
yuno_fild09.gat,48,376,0	warp	noghaltwarp5018	1,1,hu_fild07.gat,58,42
hu_fild07.gat,226,38,0		warp	noghaltwarp5019	1,1,yuno_fild09.gat,220,368
yuno_fild09.gat,220,373,0	warp	noghaltwarp5020	1,1,hu_fild07.gat,224,43



//---�c���s�s�t�B�Q���ǉ��}�b�v


//==============================================================
// -----  �t�B�Q�� -----
// hu_fild01.gat	�t�B�Q���t�B�[���h01
// hu_fild02.gat	�t�B�Q���t�B�[���h02
// hu_fild03.gat	�t�B�Q���t�B�[���h03
// hu_fild04.gat	�t�B�Q���t�B�[���h04
// hu_fild05.gat	�t�B�Q���t�B�[���h05
// hu_fild06.gat	�t�B�Q���t�B�[���h06
// hu_fild07.gat	�t�B�Q���t�B�[���h07
// -----
// odin_tem01.gat	�I�[�f�B���_�a
// odin_tem02.gat	�I�[�f�B���_�a
// odin_tem03.gat	�I�[�f�B���_�a
// -----
// ein_fild01.gat	�A�C���u���b�N�t�B�[���h01
// ein_fild02.gat	�A�C���u���b�N�t�B�[���h02
// ein_fild05.gat	�A�C���u���b�N�t�B�[���h05
// -----
// yuno_fild06.gat	�W���m�[�t�B�[���h06
//==============================================================
hu_fild06.gat,200,372,0		warp	hugelwarp0101	1,1,hugel.gat,95,37

//�t�B�Q���t�B�[���h01�̃t�B�Q���t�B�[���h02
hu_fild01.gat,366,185,0		warp	hugelwarp5001	1,1,hu_fild02.gat,22,168
hu_fild02.gat,17,168,0		warp	hugelwarp5002	1,1,hu_fild01.gat,361,189
//�t�B�Q���t�B�[���h02�̃t�B�Q���t�B�[���h03
hu_fild02.gat,378,162,0		warp	hugelwarp5003	1,1,hu_fild03.gat,30,163
hu_fild03.gat,25,163,0		warp	hugelwarp5004	1,1,hu_fild02.gat,373,160
hu_fild02.gat,374,339,0		warp	hugelwarp5005	1,1,hu_fild03.gat,24,337
hu_fild03.gat,20,338,0		warp	hugelwarp5006	1,1,hu_fild02.gat,370,339
//�t�B�Q���t�B�[���h02�̃t�B�Q���t�B�[���h04
hu_fild02.gat,40,22,0		warp	hugelwarp5007	1,1,hu_fild04.gat,48,368
hu_fild04.gat,47,372,0		warp	hugelwarp5008	1,1,hu_fild02.gat,40,27
hu_fild02.gat,283,28,0		warp	hugelwarp5009	1,1,hu_fild04.gat,289,376
hu_fild04.gat,294,379,0		warp	hugelwarp5010	1,1,hu_fild02.gat,280,31
//�t�B�Q���t�B�[���h03�̃t�B�Q���t�B�[���h05
hu_fild03.gat,288,19,0		warp	hugelwarp5011	1,1,hu_fild05.gat,276,346
hu_fild05.gat,284,356,0		warp	hugelwarp5012	1,1,hu_fild03.gat,288,26
//�t�B�Q���t�B�[���h05�̃t�B�Q���t�B�[���h06
hu_fild05.gat,353,126,0		warp	hugelwarp5013	1,1,hu_fild06.gat,34,119
hu_fild06.gat,28,119,0		warp	hugelwarp5014	1,1,hu_fild05.gat,347,130

//�W���m�[�t�B�[���h04�̃A�C���u���b�N�t�B�[���h02
yuno_fild04.gat,33,279,0	warp	hugelwarp5015	1,1,ein_fild02.gat,350,250
ein_fild02.gat,357,251,0	warp	hugelwarp5016	1,1,yuno_fild04.gat,38,280
//�W���m�[�t�B�[���h05�̃A�C���u���b�N�t�B�[���h01
yuno_fild05.gat,41,350,0	warp	hugelwarp5017	1,1,ein_fild01.gat,345,367
ein_fild01.gat,349,369,0	warp	hugelwarp5018	1,1,yuno_fild05.gat,43,346
//�W���m�[�t�B�[���h09�̃W���m�[�t�B�[���h10
yuno_fild09.gat,377,184,0	warp	hugelwarp5019	1,1,yuno_fild10.gat,44,183
yuno_fild10.gat,39,183,0	warp	hugelwarp5020	1,1,yuno_fild09.gat,371,184

//�A�C���u���b�N�t�B�[���h01�̃A�C���u���b�N�t�B�[���h02
ein_fild01.gat,106,34,0		warp	hugelwarp5021	1,1,ein_fild02.gat,109,358
ein_fild02.gat,108,364,0	warp	hugelwarp5022	1,1,ein_fild01.gat,106,40
ein_fild01.gat,234,34,0		warp	hugelwarp5023	1,1,ein_fild02.gat,258,343
ein_fild02.gat,257,350,0	warp	hugelwarp5024	1,1,ein_fild01.gat,231,40
//�A�C���u���b�N�t�B�[���h02�̃A�C���u���b�N�t�B�[���h05
ein_fild02.gat,170,29,0		warp	hugelwarp5025	1,1,ein_fild05.gat,172,366
ein_fild05.gat,172,371,0	warp	hugelwarp5026	1,1,ein_fild02.gat,170,37
//�A�C���u���b�N�t�B�[���h04�̃A�C���u���b�N�t�B�[���h05
ein_fild04.gat,343,293,0	warp	hugelwarp5027	1,1,ein_fild05.gat,80,294
ein_fild05.gat,76,294,0		warp	hugelwarp5028	1,1,ein_fild04.gat,336,292
//�A�C���u���b�N�t�B�[���h05�̃A�C���u���b�N�t�B�[���h06
ein_fild05.gat,376,183,0	warp	hugelwarp5029	1,1,ein_fild06.gat,47,166
ein_fild06.gat,42,171,0		warp	hugelwarp5030	1,1,ein_fild05.gat,371,183
//�A�C���u���b�N�t�B�[���h01�̃A�C���u���b�N�t�B�[���h05
ein_fild01.gat,106,34,0		warp	hugelwarp5031	1,1,ein_fild05.gat,172,366
ein_fild05.gat,172,371,0	warp	hugelwarp5032	1,1,ein_fild01.gat,106,40

//==============================================================
//�I�[�f�B���_�a01�̃I�[�f�B���_�a02
odin_tem01.gat,377,182,0	warp	odinwarp5001	1,1,odin_tem02.gat,28,180
odin_tem02.gat,21,180,0		warp	odinwarp5002	1,1,odin_tem01.gat,373,182
odin_tem01.gat,383,334,0	warp	odinwarp5003	1,1,odin_tem02.gat,27,334
odin_tem02.gat,21,334,0		warp	odinwarp5004	1,1,odin_tem01.gat,379,334
//�I�[�f�B���_�a02�̃I�[�f�B���_�a03
odin_tem02.gat,153,349,0	warp	odinwarp5005	1,1,odin_tem03.gat,120,54
odin_tem03.gat,121,49,0		warp	odinwarp5006	1,1,odin_tem02.gat,154,345
odin_tem02.gat,261,377,0	warp	odinwarp5007	1,1,odin_tem03.gat,247,40
odin_tem03.gat,247,34,0		warp	odinwarp5008	1,1,odin_tem02.gat,263,372



//---���w���ǉ��}�b�v


//==============================================================
// -----  ���w�� -----
// rachel.gat		�A���i�x���c������s ���w��
// ra_fild01.gat	�A�E�h��������
// ra_fild02.gat	�I�Y���J
// ra_fild03.gat	�C�_����
// ra_fild04.gat	�A�E�h��������
// ra_fild05.gat	�A�E�h��������
// ra_fild06.gat	�|���g���i
// ra_fild07.gat	�I�Y���J
// ra_fild08.gat	�C�_����
// ra_fild09.gat	�A�E�h��������
// ra_fild10.gat	�I�Y���J
// ra_fild11.gat	�C�_����
// ra_fild12.gat	�C�_����
// ra_fild13.gat	�܂̊C��
// lhz_fild01.gat	���q�^���[���t�B�[���h
// -----
// ice_dun01.gat	�X�̓��A
//==============================================================
//���w���t�B�[���h 11�˃A���i�x���c������s ���w��
ra_fild11.gat,360,226,0		warp	rachelwarp0101	1,1,rachel.gat,30,125
//���w���t�B�[���h 12�˃A���i�x���c������s ���w��
ra_fild12.gat,36,225,0		warp	rachelwarp0102	1,1,rachel.gat,270,125

//���w���t�B�[���h 01�˕X�̓��A 01
ra_fild01.gat,233,333,0		warp	rachelwarp0401	1,1,ice_dun01.gat,157,15

//���w���t�B�[���h 01�̃��w���t�B�[���h 04
ra_fild01.gat,306,38,0		warp	rachelwarp5001	1,1,ra_fild04.gat,322,371
ra_fild04.gat,322,378,0		warp	rachelwarp5002	1,1,ra_fild01.gat,306,43
//���w���t�B�[���h 02�̃��w���t�B�[���h 03
ra_fild02.gat,373,275,0		warp	rachelwarp5003	1,1,ra_fild03.gat,28,294
ra_fild03.gat,23,294,0		warp	rachelwarp5004	1,1,ra_fild02.gat,367,270
//���w���t�B�[���h 02�̃��w���t�B�[���h 07
ra_fild02.gat,168,36,0		warp	rachelwarp5005	1,1,ra_fild07.gat,168,349
ra_fild07.gat,168,353,0		warp	rachelwarp5006	1,1,ra_fild02.gat,171,45
//���w���t�B�[���h 03�̃��w���t�B�[���h 04
ra_fild03.gat,374,168,0		warp	rachelwarp5007	1,1,ra_fild04.gat,29,176
ra_fild04.gat,23,176,0		warp	rachelwarp5008	1,1,ra_fild03.gat,370,172
//���w���t�B�[���h 04�̃��w���t�B�[���h 05
ra_fild04.gat,362,351,0		warp	rachelwarp5009	1,1,ra_fild05.gat,39,353
ra_fild05.gat,33,353,0		warp	rachelwarp5010	1,1,ra_fild04.gat,356,351
//���w���t�B�[���h 04�̃��w���t�B�[���h 08
ra_fild04.gat,263,54,0		warp	rachelwarp5011	1,1,ra_fild08.gat,287,365
ra_fild08.gat,287,370,0		warp	rachelwarp5012	1,1,ra_fild04.gat,263,60
//���w���t�B�[���h 05�̃��w���t�B�[���h 06
ra_fild05.gat,348,274,0		warp	rachelwarp5013	1,1,ra_fild06.gat,24,277
ra_fild06.gat,19,277,0		warp	rachelwarp5014	1,1,ra_fild05.gat,341,273
//���w���t�B�[���h 05�̃��w���t�B�[���h 09
ra_fild05.gat,27,13,0		warp	rachelwarp5015	1,1,ra_fild09.gat,30,337
ra_fild09.gat,29,343,0		warp	rachelwarp5016	1,1,ra_fild05.gat,31,17
//���w���t�B�[���h 06�̃��q�^���[���t�B�[���h 01
ra_fild06.gat,294,21,0		warp	rachelwarp5017	1,1,lhz_fild01.gat,296,376
lhz_fild01.gat,296,382,0	warp	rachelwarp5018	1,1,ra_fild06.gat,298,25
//���w���t�B�[���h 07�̃��w���t�B�[���h 11
ra_fild07.gat,215,27,0		warp	rachelwarp5019	1,1,ra_fild11.gat,201,329
ra_fild11.gat,202,335,0		warp	rachelwarp5020	1,1,ra_fild07.gat,215,32
//���w���t�B�[���h 08�̃��w���t�B�[���h 09
ra_fild08.gat,368,234,0		warp	rachelwarp5021	1,1,ra_fild09.gat,35,238
ra_fild09.gat,27,238,0		warp	rachelwarp5022	1,1,ra_fild08.gat,360,234
//���w���t�B�[���h 08�̃��w���t�B�[���h 12
ra_fild08.gat,165,29,0		warp	rachelwarp5023	1,1,ra_fild12.gat,149,369
ra_fild12.gat,149,374,0		warp	rachelwarp5024	1,1,ra_fild08.gat,165,36
//���w���t�B�[���h 10�̃��w���t�B�[���h 11
ra_fild10.gat,384,287,0		warp	rachelwarp5025	1,1,ra_fild11.gat,28,290
ra_fild11.gat,21,290,0		warp	rachelwarp5026	1,1,ra_fild10.gat,379,283
//���w���t�B�[���h 12�̃��w���t�B�[���h 13
ra_fild12.gat,303,27,0		warp	rachelwarp5027	1,1,ra_fild13.gat,295,341
ra_fild13.gat,295,346,0		warp	rachelwarp5028	1,1,ra_fild12.gat,303,33



//---�x�C���X�ǉ��}�b�v


//==============================================================
// -----  �x�C���X -----
// ve_fild01.gat	�x�C���X�t�B�[���h 01
// ve_fild02.gat	�x�C���X�t�B�[���h 02
// ve_fild03.gat	�x�C���X�t�B�[���h 03
// ve_fild04.gat	�x�C���X�t�B�[���h 04
// ve_fild05.gat	�x�C���X�t�B�[���h 05
// ve_fild06.gat	�x�C���X�t�B�[���h 06
// ve_fild07.gat	�x�C���X�t�B�[���h 07
// -----
// veins.gat		���J�s�s�x�C���X
// rachel.gat		�A���i�x���c������s ���w��
// ra_fild11.gat	�C�_����
// ra_fild13.gat	�܂̊C��
// thor_v01.gat		�g�[���ΎR�_���W���� 01
//==============================================================
//�x�C���X�t�B�[���h 06�ˋ��J�s�s�x�C���X
ve_fild06.gat,153,220,0		warp	veinswarp0101	1,1,veins.gat,218,355
//�x�C���X�t�B�[���h 07�ˋ��J�s�s�x�C���X
ve_fild07.gat,147,371,0		warp	veinswarp0102	1,1,veins.gat,146,28
//�x�C���X�t�B�[���h 02�˃A���i�x���c������s ���w��
ve_fild02.gat,195,382,0		warp	veinswarp0103	1,1,rachel.gat,130,25

//�x�C���X�t�B�[���h 03�˃g�[���ΎR�_���W���� 01
ve_fild03.gat,168,240,0		warp	veinswarp0401	1,1,thor_v01.gat,21,229

//�x�C���X�t�B�[���h 01�̃��w���t�B�[���h 11
ve_fild01.gat,243,368,0		warp	veinswarp5001	1,1,ra_fild11.gat,232,32
ra_fild11.gat,233,27,0		warp	veinswarp5002	1,1,ve_fild01.gat,243,363
//�x�C���X�t�B�[���h 01�̃x�C���X�t�B�[���h 02
ve_fild01.gat,366,267,0		warp	veinswarp5003	1,1,ve_fild02.gat,36,263
ve_fild02.gat,31,263,0		warp	veinswarp5004	1,1,ve_fild01.gat,361,267
ve_fild01.gat,350,92,0		warp	veinswarp5005	1,1,ve_fild02.gat,78,133
ve_fild02.gat,73,133,0		warp	veinswarp5006	1,1,ve_fild01.gat,345,92
//�x�C���X�t�B�[���h 01�̃x�C���X�t�B�[���h 04
ve_fild01.gat,184,20,0		warp	veinswarp5007	1,1,ve_fild04.gat,174,334
ve_fild04.gat,174,339,0		warp	veinswarp5008	1,1,ve_fild01.gat,184,25
//�x�C���X�t�B�[���h 02�̃��w���t�B�[���h 13
ve_fild02.gat,385,308,0		warp	veinswarp5009	1,1,ra_fild13.gat,34,308
ra_fild13.gat,29,308,0		warp	veinswarp5010	1,1,ve_fild02.gat,184,25
//�x�C���X�t�B�[���h 03�̃x�C���X�t�B�[���h 04
ve_fild03.gat,355,223,0		warp	veinswarp5011	1,1,ve_fild04.gat,49,249
ve_fild04.gat,44,249,0		warp	veinswarp5012	1,1,ve_fild03.gat,350,220
//�x�C���X�t�B�[���h 03�̃x�C���X�t�B�[���h 05
ve_fild03.gat,222,43,0		warp	veinswarp5013	1,1,ve_fild05.gat,200,325
ve_fild05.gat,200,330,0		warp	veinswarp5014	1,1,ve_fild03.gat,222,48
//�x�C���X�t�B�[���h 04�˃x�C���X�t�B�[���h 06
ve_fild04.gat,115,50,0		warp	veinswarp5015	1,1,ve_fild06.gat,80,183
//�x�C���X�t�B�[���h 05�˃x�C���X�t�B�[���h 06
ve_fild05.gat,359,192,0		warp	veinswarp5016	1,1,ve_fild06.gat,80,183
//�x�C���X�t�B�[���h 06�˃x�C���X�t�B�[���h 04�E05
ve_fild06.gat,81,177,0		script	#veinswarp5017	45,1,1,{
	if(rand(2)) warp "ve_fild04.gat",115,55;
	else warp "ve_fild05.gat",354,191;
	end;
}



//---���X�R�r�A�ǉ��}�b�v


//==============================================================
// -----  ���X�R�r�A -----
// mosk_fild02.gat	���X�R�r�A�t�B�[���h
// -----
// mosk_dun01.gat	�X
//==============================================================
//���X�R�r�A�t�B�[���h�ːX
mosk_fild02.gat,190,257,0	warp	moscoviawarp0401	1,1,mosk_dun01.gat,189,45



//---���������N�ǉ��}�b�v


//==============================================================
// -----  ���A�̑� -----
// ein_fild01.gat	�A�C���u���b�N�t�B�[���h01
// -----
// cave.gat		���A�̑�
//==============================================================
//�A�C���u���b�N�t�B�[���h01�˓��A�̑�
ein_fild01.gat,28,261,0	warp	cavewarp0101	1,1,cave.gat,97,24



//---�A�b�V���E�o�L���[���ǉ��}�b�v


//==============================================================
// -----  �z�R�̊X �}�k�N  -----
// man_fild01.gat	�}�k�N�t�B�[���h 01
// man_fild02.gat	�}�k�N�t�B�[���h 02
// man_fild03.gat	�}�k�N�t�B�[���h 03
// -----
// mid_camp.gat		�~�b�h�K���h�A���R���Ԓn
// manuk.gat		�z�R�̊X �}�k�N
//==============================================================
//�}�k�N�t�B�[���h 01�˃~�b�h�K���h�A���R���Ԓn
man_fild01.gat,35,232,0		warp	manukwarp0101	1,1,mid_camp.gat,341,176
//�}�k�N�t�B�[���h 02�ˍz�R�̊X �}�k�N
man_fild02.gat,139,41,0		warp	manukwarp0102	1,1,manuk.gat,112,356

//�}�k�N�t�B�[���h 01�̃}�k�N�t�B�[���h 03
man_fild01.gat,103,55,0		warp	manukwarp5001	1,1,man_fild03.gat,84,366
man_fild03.gat,84,369,0		warp	manukwarp5002	1,1,man_fild01.gat,103,58
//�}�k�N�t�B�[���h 01�̃}�k�N�t�B�[���h 02
man_fild01.gat,372,230,0	warp	manukwarp5003	1,1,man_fild02.gat,34,261
man_fild02.gat,32,261,0		warp	manukwarp5004	1,1,man_fild01.gat,369,230


//==============================================================
// -----  �O����n �X�v�����f�B�b�h  -----
// spl_fild01.gat	�X�v�����f�B�b�h�t�B�[���h 01
// spl_fild02.gat	�X�v�����f�B�b�h�t�B�[���h 02
// spl_fild03.gat	�X�v�����f�B�b�h�t�B�[���h 03
// -----
// mid_camp.gat		�~�b�h�K���h�A���R���Ԓn
// splendide.gat	�O����n �X�v�����f�B�b�h
//==============================================================
//�X�v�����f�B�b�h�t�B�[���h 02�˃~�b�h�K���h�A���R���Ԓn
spl_fild02.gat,382,143,0	warp	splendidewarp0101	1,1,mid_camp.gat,16,143
spl_fild02.gat,383,216,0	warp	splendidewarp0102	1,1,mid_camp.gat,12,215
//�X�v�����f�B�b�h�t�B�[���h 02�ˑO����n �X�v�����f�B�b�h
spl_fild02.gat,6,241,0		warp	splendidewarp0103	1,1,splendide.gat,386,251

//�X�v�����f�B�b�h�t�B�[���h 02�̃X�v�����f�B�b�h�t�B�[���h 03
spl_fild02.gat,310,10,0		warp	splendidewarp5001	1,1,spl_fild03.gat,306,376
spl_fild03.gat,306,379,0	warp	splendidewarp5002	1,1,spl_fild02.gat,311,12
spl_fild02.gat,103,30,0		warp	splendidewarp5003	1,1,spl_fild03.gat,99,370
spl_fild03.gat,99,373,0		warp	splendidewarp5004	1,1,spl_fild02.gat,102,32
//�X�v�����f�B�b�h�t�B�[���h 01�̃X�v�����f�B�b�h�t�B�[���h 02
spl_fild01.gat,289,28,0		warp	splendidewarp5005	1,1,spl_fild02.gat,292,377
spl_fild02.gat,293,379,0	warp	splendidewarp5006	1,1,spl_fild01.gat,289,30



//---�u���W���X�ǉ��}�b�v


//==============================================================
// -----  �u���W���X  -----
// bra_fild01.gat	�u���W���X�t�B�[���h 01
// -----
// brasilis.gat		�u���W���X
//==============================================================
//�u���W���X�t�B�[���h 01�˃u���W���X
bra_fild01.gat,72,34,0		warp	brasiliswarp0101	1,1,brasilis.gat,309,334



//---�G���f�B�J�X�e�B�X�ǉ��}�b�v


//==============================================================
// -----  �G���f�B�J�X�e�B�X -----
// dic_fild01.gat	�J�~�_���R�[ 01
// dic_fild02.gat	�J�~�_���R�[ 02
// -----
// dic_dun01.gat	�J�~�_���g���l��
//==============================================================
//�J�~�_���R�[ 01�˃J�~�_���g���l��
dic_fild01.gat,24,79,0		warp	dicasteswarp0401	1,1,dic_dun01.gat,366,45

//�J�~�_���R�[ 01�̃J�~�_���R�[ 02
dic_fild01.gat,69,23,0		warp	dicasteswarp5001	1,1,dic_fild02.gat,70,373
dic_fild02.gat,71,375,0		warp	dicasteswarp5002	1,1,dic_fild01.gat,69,25



//---�f���^�ǉ��}�b�v


//==============================================================
// -----  �f���^ -----
// dew_fild01.gat	�f���^�t�B�[���h 01
// -----
// dewata.gat		�f���^
// dew_in01.gat		�f���^ ����
// dew_dun02.gat	�C�X�^�i���A
//==============================================================
//�f���^�t�B�[���h 01�˃f���^
dew_fild01.gat,375,212,0	warp	dewatawarp0101	1,1,dewata.gat,46,251
//�f���^�t�B�[���h 01�˃f���^ ����
dew_fild01.gat,57,273,0		warp	dewatawarp0102	1,1,dew_in01.gat,15,33

//�f���^�t�B�[���h 01�˃C�X�^�i���A
dew_fild01.gat,48,65,0		warp	dewatawarp0401	1,1,dew_dun02.gat,302,30



//---�r�t���X�g�ǉ��}�b�v


//==============================================================
// -----  �r�t���X�g -----
// bif_fild01.gat	�r�t���X�g�t�B�[���h 01
// bif_fild02.gat	�r�t���X�g�t�B�[���h 02
// -----
// splendide.gat	�O����n �X�v�����f�B�b�h
// ecl_fild01.gat	�Ԃ��炫�n�߂���n
//==============================================================
//�r�t���X�g�t�B�[���h 01�ˑO����n �X�v�����f�B�b�h
bif_fild01.gat,318,48,0		warp	bifrostwarp0101	1,1,splendide.gat,270,378

//�r�t���X�g�t�B�[���h 02�ˉԂ��炫�n�߂���n
bif_fild02.gat,292,351,0	warp	bifrostwarp0501	1,1,ecl_fild01.gat,205,76



//---�|�[�g�}�����ǉ��}�b�v


//==============================================================
// -----  �|�[�g�}���� -----
// ma_fild01.gat	�o���I�E�}�q���K
// ma_fild02.gat	�o���I�E�t�H���X�g
// -----
// malaya.gat		�|�[�g�}����
// ma_in01.gat		�|�[�g�}���� ����
// ma_in01_jp.gat	�|�[�g�}���� ����
// ma_scene01.gat	�o�R�i����
// ma_c_jp.gat		�u�����̓��A
//==============================================================
//�o���I�E�}�q���K�˃|�[�g�}����
ma_fild01.gat,37,272,0		warp	malayawarp0101	1,1,malaya.gat,367,277
//�o���I�E�}�q���K�˃|�[�g�}���� ����
ma_fild01.gat,251,190,0		warp	malayawarp0102	1,1,ma_in01.gat,108,160
ma_fild01.gat,160,219,0		warp	malayawarp0103	1,1,ma_in01_jp.gat,83,17
ma_fild01.gat,262,212,0		warp	malayawarp0104	1,1,ma_in01_jp.gat,36,152

//�o���I�E�}�q���K�˃o�R�i����
ma_fild01.gat,288,52,0		warp	malayawarp0401	1,1,ma_scene01.gat,142,78
//�o���I�E�t�H���X�g�˃u�����̓��A
ma_fild02.gat,315,323,0		warp	malayawarp0402	1,1,ma_c_jp.gat,31,56

//�o���I�E�}�q���K�̃o���I�E�t�H���X�g
ma_fild01.gat,266,359,0		warp	malayawarp5001	1,1,ma_fild02.gat,248,36
ma_fild02.gat,248,33,0		warp	malayawarp5002	1,1,ma_fild01.gat,266,356



//---�G�N���[�W���ǉ��}�b�v


//==============================================================
// -----  �G�N���[�W�� -----
// ecl_fild01.gat	�Ԃ��炫�n�߂���n
// -----
// ecl_tdun01.gat		�r�t���X�g�^���[ 1�K
// bif_fild02.gat		�r�t���X�g�t�B�[���h 02
//==============================================================
//�Ԃ��炫�n�߂���n�˃r�t���X�g�^���[ 1�K
ecl_fild01.gat,182,82,0	warp	eclagewarp0401	1,1,ecl_tdun01.gat,60,13

//�Ԃ��炫�n�߂���n�˃r�t���X�g�t�B�[���h 02
ecl_fild01.gat,207,72,0	warp	eclagewarp0501	1,1,bif_fild02.gat,294,350



//---���U�[�j���ǉ��}�b�v


//==============================================================
// -----  ���U�[�j�� -----
// lasa_fild01.gat	���r�I������ 01
// lasa_fild02.gat	���r�I���X 01
// -----
// lasagna.gat		�`�����U�[�j��
// lasa_dun01.gat	���̑� 01
//==============================================================
//���r�I������ 01�ˍ`�����U�[�j��
lasa_fild01.gat,134,381,0	warp	lasagnawarp0101	2,2,lasagna.gat,153,58
lasa_fild01.gat,341,375,0	warp	lasagnawarp0102	2,2,lasagna.gat,327,56
//���r�I���X 01�ˍ`�����U�[�j��
lasa_fild02.gat,16,98,0		warp	lasagnawarp0103	2,2,lasagna.gat,355,92

//���r�I���X 01�˗��̑� 01
lasa_fild02.gat,348,244,0	warp	lasagnawarp0401	2,2,lasa_dun01.gat,24,143



//---���b�N���b�W�ǉ��}�b�v


//==============================================================
// -----  ���b�N���b�W -----
// rockrdg1.gat	�L�������� 01
// rockrdg2.gat	�L�������� 02
// -----
// harboro1.gat	���b�N���b�W
//==============================================================
//�L�������� 01�˃��b�N���b�W
rockrdg1.gat,33,246,0	warp	rockwarp0101	1,1,harboro1.gat,358,206

//�L�������� 01�̃L�������� 01
rockrdg1.gat,371,206,0	warp	rockwarp5001	1,1,rockrdg2.gat,31,207
rockrdg2.gat,27,207,0	warp	rockwarp5002	1,1,rockrdg1.gat,367,206