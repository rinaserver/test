//====================================================================
//Ragnarok Online Magician jobchange script
//
//　■ CHANGE_MG -> 0〜1, 0〜4(Old)
//     OLD_CLASS -> 転生前の職業
//====================================================================

//==========================================
// 試験申請および転職
//------------------------------------------

geffen_in.gat,164,124,4	script	ギルド関係者#MG	123,{
	if(Upper == UPPER_HIGH && (getbaseclass(Class) == CLASS_MG)) {
		mes "[魔術師ギルド関係者]";
		mes "うん？何かご用……？";
		mes "私とお話している暇なんて";
		mes "あなたにはないでしょ。";
		close;
	}
	if(Upper == UPPER_HIGH) {
		if(Job != Job_Novice) {
			mes "[魔術師ギルド関係者]";
			mes "なぁに？";
			mes "魔術師ギルドに関心がおあり？";
			next;
			mes "[魔術師ギルド関係者]";
			mes "私もそれなりに忙しいの。";
			mes "特に用が無いのなら、";
			mes "向こうに行っててね。";
			close;
		}
		mes "[魔術師ギルド関係者]";
		mes "あら？ひさしぶりね！";
		mes "うんうん、でもすぐわかったわよ。";
		mes "何か、初めて会った頃の姿に";
		mes "よく似ていたし。";
		next;
		if(getskilllv(1) < 9 || SkillPoint) {
			mes "[魔術師ギルド関係者]";
			mes "う〜ん、以前のようにちゃんと";
			mes "基礎を学んできてからじゃないと";
			mes "転職はさせてあげられないわ。";
			next;
			mes "[魔術師ギルド関係者]";
			mes "大丈夫。";
			mes "あなたなら以前の記憶を取り戻す";
			mes "ことくらいできるはずよ。";
			mes "そうすれば、また魔法を使えるように";
			mes "なるわ。";
			close;
		}
		mes "[魔術師ギルド関係者]";
		mes "さて。";
		mes "一度合格している人にまた";
		mes "試験を受けさせるのも野暮だしね。";
		mes "一刻も早く魔法を遣いたいんでしょ？";
		next;
		unequip;
		jobchange Job_Magician,UPPER_HIGH;
		//setquest 50775;
		skill 157,1,0;
		mes "[魔術師ギルド関係者]";
		mes "うん、なつかしい格好ね。";
		mes "これからもがんばってね！";
		close;
	}
	mes "[魔術師ギルド関係者]";
	mes "はい、何の用で来ましたの？";
	next;
	switch (select("マジシャンに転職","マジシャンの転職条件を聞く","やめる")) {
	case 1:
		if(Job == Job_Magician) {
			mes "[魔術師ギルド関係者]";
			mes "えー。あなたはもうマジシャンでしょ？";
			mes "自分の事もわからないの？";
			mes "まあ、いつか素手で焚き火を";
			mes "作れる日が来たら、自ら";
			mes "マジシャンの運命というものが、";
			mes "わかってくるんじゃないの？";
			next;
			mes "[魔術師ギルド関係者]";
			mes "そうそう、マジシャンに";
			mes "なった後、冒険者アカデミーを";
			mes "訪れた事はある？";
			next;
			mes "[魔術師ギルド関係者]";
			mes "無いなら、訪れた方がいいわ。";
			mes "この建物を出ると";
			mes "冒険者アカデミーのサポートを";
			mes "行っている人がいるので、";
			mes "送ってもらうといいわ。";
			close;
		}
		if(Job != Job_Novice) {
			mes "[魔術師ギルド関係者]";
			mes "えー。あなたは、";
			mes "マジシャンに転職できないよ。";
			mes "既に他の職業に就いているでしょ？";
			close;
		}
		break;
	case 2:
		mes "[魔術師ギルド関係者]";
		mes "マジシャンになりたいって？";
		mes (Sex? "兄": "姉")+ "ちゃんみたいなタイプが、";
		mes "ギルドの一員になって";
		mes "くれるんだったら、";
		mes "当然大歓迎〜";
		next;
		mes "[魔術師ギルド関係者]";
		mes "まずは、^0000FF「基本スキル」のレベルを9^000000";
		mes "にしなければならない。";
		mes "JobLvを10にまで成長させて、";
		mes "^0000FF「基本スキル」のレベルを9^000000 に";
		mes "してきてちょうだい。";
		next;
		mes "[魔術師ギルド関係者]";
		mes "^0000FF「基本スキル」^000000のレベルは";
		mes "^0000FF「スキルリスト」^000000ウィンドウで";
		mes "上げることができるわ。";
		mes "^0000FF「スキルリスト」^000000ウィンドウは";
		mes "^0000FF「基本情報」^000000ウィンドウ内の";
		mes "^0000FF「Skill」^000000ボタンで表示されるの。";
		next;
		mes "[魔術師ギルド関係者]";
		mes "スキルのレベルを上げるには、";
		mes "スキルポイントを割り振った後、";
		mes "^FF0000「確定」^000000ボタンが必要になるから、";
		mes "注意してね。";
		close2;
		cutin "start_020_jp.bmp",4;
		end;
	case 3:
		mes "[魔術師ギルド関係者]";
		mes "うん……？何ー？";
		close;
	}
	//case1の続き
	if(CHANGE_MG==0) {
		mes "[魔術師ギルド関係者]";
		mes "マジシャンに転職したいと？";
		mes "うん……";
		next;
		mes "[魔術師ギルド関係者]";
		if(Sex == 0) {
			mes "……よく見ると姉ちゃん、可愛いわね。";
			mes "私は姉ちゃんみたいなタイプ好きよ！";
		}
		else {
			mes "……よく見たら兄ちゃん、可愛いね。";
			mes "私のタイプじゃないけど……。";
		}
		mes "まあ、それはそれとして、";
		mes "マジシャンに転職したいと言ったよね？";
		mes "だったら、ここのマジシャン";
		mes "転職申請書にサインをお願い。";
		next;
		if(select("マジシャン転職申請をする","やっぱりやめる")==2) {
			mes "[魔術師ギルド関係者]";
			mes "なによ！さっきはマジシャンに";
			mes "なりたいって言ったじゃないの！";
			mes "ぷんぷん！";
			close;
		}
		set CHANGE_MG,1;
		mes "[魔術師ギルド関係者]";
		mes "うん、そこにサインして……";
		mes "うわー字が綺麗ねー";
		mes "うん、うん、そこまで。";
		mes "名前は……";
		mes strcharinfo(0)+ "ね。";
		next;
	}
	mes "[魔術師ギルド関係者]";
	mes "それじゃ、さっそく";
	mes (Sex? "兄": "姉")+ "ちゃんに関する";
	mes "情報を調べさせてもらうわね。";
	next;
	if(getskilllv(1) < 9 || SkillPoint) {
		mes "[魔術師ギルド関係者]";
		mes "……よく見ると" +(Sex? "兄": "姉")+ "ちゃん、";
		mes "うーん、^0000FF「基本スキル」^000000のレベルが";
		mes "足りないようね。";
		mes "JobLvを10にまで成長させて、";
		mes "^0000FF「基本スキル」のレベルを9^000000 に";
		mes "してきてちょうだい。";
		next;
		mes "[魔術師ギルド関係者]";
		mes "^0000FF「基本スキル」^000000のレベルは";
		mes "^0000FF「スキルリスト」^000000ウィンドウで";
		mes "上げることができるわ。";
		mes "^0000FF「スキルリスト」^000000ウィンドウは";
		mes "^0000FF「基本情報」^000000ウィンドウ内の";
		mes "^0000FF「Skill」^000000ボタンで表示されるの。";
		next;
		mes "[魔術師ギルド関係者]";
		mes "スキルのレベルを上げるには、";
		mes "スキルポイントを割り振った後、";
		mes "^FF0000「確定」^000000ボタンが必要になるから、";
		mes "注意してね。";
		mes "まず、^0000FF「基本スキル」^000000のレベルを";
		mes "上げてから来て。";
		close2;
		cutin "start_020_jp.bmp",4;
		end;
	}
	mes "[魔術師ギルド関係者]";
	mes "…";
	next;
	mes "[魔術師ギルド関係者]";
	mes "……";
	next;
	mes "[魔術師ギルド関係者]";
	mes "………、ほうほう。";
	mes "なるほど、なるほど。";
	next;
	mes "[魔術師ギルド関係者]";
	mes "うん、……、" +(Sex? "兄": "姉")+ "ちゃんに関する";
	mes "資料を見せてもらったけど、";
	mes "マジシャンとしての資質も";
	mes "十分にあるみたいだし、";
	mes "これなら問題なさそうね。";
	next;
	mes "[魔術師ギルド関係者]";
	mes "これでマジシャン転職の申請は、完了！";
	mes "あなたが望んだマジシャンになれー！";
	next;
	set CHANGE_MG,0;
	setquest 50385;
	getitem 11037,1;
	unequip;
	jobchange Job_Magician;
	mes "[魔術師ギルド関係者]";
	mes "魔術師ギルドへようこそ！";
	mes "まあ、改めて挨拶しただけだから、";
	mes "そんなに照れなくてもいいのにー";
	mes "言ってみただけなのよ、もー";
	next;
	mes "[魔術師ギルド関係者]";
	mes "とりあえず、私達魔術師ギルドの";
	mes "一員になったね。おめでとうー！";
	mes "これからもよろしくぅー！えへへ〜";
	next;
	mes "[魔術師ギルド関係者]";
	mes "あと、あなたに渡したのは";
	mes "マジシャンの書よ。";
	mes "魔術師ギルド作成の";
	mes "初心者マジシャンへの指南書ね。";
	mes "読んでおくといいわよ。";
	close;
OnInit:
	waitingroom "転職",0;
	end;
}

//==============================================================
geffen_in.gat,164,109,2	script	魔導師	64,{
	mes "[魔導師]";
	mes "魔法の強力な力は因果律によって";
	mes "調節されているのじゃ。";
	next;
	mes "[魔導師]";
	mes "要するに、誰かに害を与えたり、";
	mes "または自然の流れに反する魔法を";
	mes "使った場合、必ずその使用者に";
	mes "反作用が戻ってくるのじゃ。";
	next;
	mes "[魔導師]";
	mes "しかし、その術者の代わりに";
	mes "その反作用を受けてくれる物があれば、";
	mes "安全に魔法が使えるのじゃ。";
	mes "それが「ジェムストーン」と呼ばれる";
	mes "神秘の鉱石なのじゃ。";
	close;
}


//==========================================
// アイテム合成
//------------------------------------------

geffen_in.gat,177,112,0	script	本棚	111,{
	mes "-本棚に注意書きの";
	mes " 張り紙が貼ってある-";
	next;
	mes "[注意]";
	mes "本棚の本は、ゲフェン魔法学校の";
	mes "財産です。";
	mes "綺麗に使って下さい。";
	close;
}


//==========================================
// 水溶液アルバイト
//------------------------------------------

-	script	水溶液アルバイト	88,{
	mes "[魔術師ギルド関係者]";
	mes "水溶液を購入しますか？";
	mes "50 Zenyと空の試験管1つ以上が";
	mes "必要です。";
	next;
	if(select("水溶液を買う","やめる")==2) {
		mes "[魔術師ギルド関係者]";
		mes "またのお越しをお待ちしてます。";
		close;
	}
	if(Zeny < 50) {
		mes "[魔術師ギルド関係者]";
		mes "お金が足りません……";
		mes "水溶液は50 Zenyです。";
		close;
	}
	if(countitem(1092) < 1) {
		mes "[魔術師ギルド関係者]";
		mes "水溶液をどうやって";
		mes "持っていきますか？";
//		mes "空の試験管を持ってき下さい。";		//本鯖仕様
		mes "空の試験管を持ってきて下さい。";
		close;
	}
	set Zeny,Zeny-50;
	delitem 1092,1;
	if(strnpcinfo(2) == "Pay")
		getitem 1089,1;
	if(strnpcinfo(2) == "Moc")
		getitem 1088,1;
	mes "[魔術師ギルド関係者]";
	mes "ありがとうございました。";
	close;
}

pay_arche.gat,120,100,0	duplicate(水溶液アルバイト)	水溶液アルバイト#Pay	88
moc_ruins.gat,91,150,0	duplicate(水溶液アルバイト)	水溶液アルバイト#Moc	93
