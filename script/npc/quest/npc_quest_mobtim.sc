//----------------------------------------------------------------------
// スクリプト : Event_MobtTim v1.0
//----------------------------------------------------------------------

//----------------------------------
// モンスタージュース/歌う花/野生花
//----------------------------------

alberta_in.gat,173,76,4	script	モンスターテイマー	125,{
	mes "[イワド]";
	mes "時はいまや";
	mes "モンスターテイミングの時代！";
	mes "君もかわいいモンスターとの";
	mes "意思疎通のため、モンスターたちの";
	mes "嗜好品を集めなければならない";
	mes "必要性を感じませんか？";
	next;
	switch (select("^3355FF「モンスターテイミング」^000000に関して","^3355FF「モンスタージュース」^000000注文","^3355FF「歌う花」^000000注文","^3355FF「野生花」^000000注文","会話をやめる")) {
	case 1:
		mes "[イワド]";
		mes "好きなモンスターとの";
		mes "コミュニケーションのためなら、";
		mes "必ず用意しなければならない";
		mes "様々なモンスター嗜好品！";
		mes "我らモンスターテイマーギルドが、";
		mes "お手頃な条件でご提供します！";
		next;
		mes "[イワド]";
		mes "非常にクールなアイテムたちを";
		mes "気軽に手に入れることができる";
		mes "すてきなシステム！";
		mes "モンスタージュース！";
		mes "歌う花！";
		mes "そして野生花！";
		next;
		mes "[イワド]";
		mes "モンスタージュースは^3355FF「家畜の血」^000000";
		mes "１つと^3355FF「リンゴ」^000000２つで交換可能で、";
		mes "歌う花は^3355FF「歌う草」^000000１つ、";
		mes "そして野生花は^3355FF「装飾用花」^000000１つと";
		mes "^3355FF「クローバー」^000000１つで交換可能です。";
		mes "幻のアイテムに挑戦してみませんか？";
		close;
	case 2:
		mes "[イワド]";
		mes "人間が飲むという次元を";
		mes "はるかに超越したアイテム！";
		mes "その名も^3355FFモンスタージュース^000000!!";
		mes "酸っぱくて苦々しいこの味は、";
		mes "モンスターたちの趣向に";
		mes "ぴったり合った嗜好品……。";
		next;
		setarray '@need,702,512;
		setarray '@amount,1,2;
		set '@gain,626;
		break;
	case 3:
		mes "[イワド]";
		mes "人間が聞くという次元を";
		mes "はるかに超越したアイテム！";
		mes "その名も^3355FF歌う花^000000!!";
		mes "咲き乱れては香ばしいこの花は、";
		mes "モンスターたちの趣向に";
		mes "ぴったり合った嗜好品……";
		next;
		set '@need,707;
		set '@amount,1;
		set '@gain,629;
		break;
	case 4:
		mes "[イワド]";
		mes "人間が眺めるという次元を";
		mes "はるかに超越したアイテム！";
		mes "その名も^3355FF野生花^000000!!";
		mes "理解しがたいこのデザインは、";
		mes "モンスターたちの趣向に";
		mes "ぴったり合った嗜好品……";
		next;
		setarray '@need,2207,705;
		setarray '@amount,1,1;
		set '@gain,10009;
		break;
	case 5:
		mes "[イワド]";
		mes "どんなモンスターをそばに置くか、";
		mes "まだ決める事ができていないよう";
		mes "ですね。人生のパートナーに";
		mes "なるかもしれないので";
		mes "おろそかに決めないこと……。";
		next;
		mes "[イワド]";
		mes "ゆっくり考えてみて決心が";
		mes "ついてたら、また訪ねて";
		mes "きてください。";
		close;
	}
	if(countitem('@need[0])<'@amount[0] || countitem('@need[1])<'@amount[1]) {
		mes "[イワド]";
		switch(@menu) {
			case 2:
				mes "モンスタージュースが好きな";
				mes "モンスターを育てるあなたに……";
				mes "モンスタージュースの";
				mes "作り方をひとつ！";
				mes "^3355FF家畜の血１つ！リンゴ２つ！^000000";
				break;
			case 3:
				mes "歌う花が好きなモンスターを";
				mes "育てるあなたに……";
				mes "歌う花の作り方をひとつ！";
				mes "^3355FF歌う草を１つ！^000000";
				break;
			case 4:
				mes "野生花が好きなモンスターを";
				mes "育てるあなたに……";
				mes "野生花の作り方をひとつ！";
				mes "^3355FF装飾用花とクローバーを１つずつ！^000000";
				break;
		}
		mes "私に持ってきてくだされば、";
		next;
		mes "[イワド]";
		mes "モンスターテイマーのプライドに";
		mes "かけて！その場ですぐに作って";
		mes "差しあげます！";
		close;
	}
	mes "[イワド]";
	mes "おお！" +getitemname('@gain)+ "を作ることができる材料を";
	mes "すべて持っていらっしゃいますね。";
	mes "すばらしい！";
	mes "モンスターテイマーのプライドにかけて";
	mes "すぐに作って差し上げます。";
	next;
	mes "[イワド]";
	switch(@menu) {
		case 2:
			mes "リンゴ２つと家畜の血〜";
			next;
			mes "^3355FF- ゴリゴリ ザブザブ ガシャガシャ -^000000";
			break;
		case 3:
			mes "歌う草〜";
			next;
			mes "^3355FF- サクサク ザクザク グリグリ -^000000";
			break;
		case 4:
			mes "装飾用花クローバーこねてこねて〜";
			next;
			mes "^3355FF- ビリビリ ゴリゴリ コネコネ -^000000";
			break;
	}
	next;
	delitem '@need[0],'@amount[0];
	delitem '@need[1],'@amount[1];
	getitem '@gain,1;
	mes "[イワド]";
	mes "はい、できあがりました！";
	mes "あなたの育てるかわいいモンスターを";
	mes "大事にしてあげてください。";
	mes getitemname('@gain)+ "！";
	close;
}

//----------------------------------
// 悪魔召喚書/宛てがない手紙/組織の掟
//----------------------------------

izlude_in.gat,129,64,4	script	モンスターテイマー	125,{
	mes "[ショウゴ]";
	mes "モンスターテイミングに必要な";
	mes "嗜好品を取りそろえるのに";
	mes "専念していますかッ？";
	mes "かわいいペットモンスターたちの";
	mes "嗜好品を準備してあげましょうっ！";
	next;
	switch (select("^3355FF「モンスターテイミング」^000000に関して","^3355FF「悪魔召喚書」^000000注文","^3355FF「宛てがない手紙」^000000注文","^3355FF「組織の掟」^000000注文","会話をやめる")) {
	case 1:
		mes "[ショウゴ]";
		mes "好きなモンスターとの";
		mes "コミュニケーションのためなら、";
		mes "必ず用意しなければならない";
		mes "様々なモンスター嗜好品！";
		mes "我らモンスターテイマーギルドが";
		mes "お手頃な条件でご提供しますっ！";
		next;
		mes "[ショウゴ]";
		mes "非常にクゥールなアイテムたちをっ";
		mes "気軽に手に入れることができる";
		mes "すてきなシステムッ！";
		mes "悪魔召喚書っ！";
		mes "宛てがない手紙っ！";
		mes "組織の掟っ！";
		next;
		mes "[ショウゴ]";
		mes "悪魔召喚書は^3355FF「古い魔法書」^000000１つと";
		mes "^3355FF「亡者の牙」^000000２つで交換可能で";
		mes "宛てがない手紙は";
		mes "^3355FF「古いポートレート」^000000１つ；";
		next;
		mes "[ショウゴ]";
		mes "そして組織の掟は^3355FF「忠節の証」^000000１つと";
		mes "^3355FF「サソリの尻尾」^000000１つで交換可能です。";
		mes "幻のアイテムに";
		mes "挑戦してみませんか?!";
		close;
	case 2:
		mes "[ショウゴ]";
		mes "人間が読み解くという次元を";
		mes "はるかに超越したアイテムッ！";
		mes "その名も^3355FF悪魔召喚書^000000!!";
		mes "難しくて理解不能なモンスターたちを";
		mes "呼び出す神秘的な力を持った";
		mes "このアイテムッ！";
		next;
		if(countitem(1006)<1 || countitem(958)<2) {
			mes "[ショウゴ]";
			mes "悪魔召喚書で召喚できるモンスターを";
			mes "育てるあなたにっ……";
			mes "悪魔召喚書の作り方をひとつ！";
			mes "^3355FF古い魔法書１つと亡者の牙２つ^000000";
			mes "私に持ってきてくだされば、";
			next;
			mes "[ショウゴ]";
			mes "モンスターテイマーのプライドに";
			mes "かけてっ！その場ですぐに作って";
			mes "差し上げますねっ！";
			close;
		}
		setarray '@need,1006,958;
		setarray '@amount,1,2;
		set '@gain,642;
		break;
	case 3:
		mes "[ショウゴ]";
		mes "人間が感じるという次元を";
		mes "はるかに超越したアイテムッ……";
		mes "その名も^3355FF宛てがない手紙^000000!!";
		mes "誰が誰に送るのか";
		mes "受け取った方も送った方もわからない";
		mes "このアイテムッ。";
		next;
		if(countitem(7014)<1) {
			mes "[ショウゴ]";
			mes "宛てがない手紙が好きなモンスターを";
			mes "育てるあなたに……";
			mes "宛てがない手紙の作り方をひとつっ！";
			mes "^3355FF古いポートレート１つ！^000000";
			mes "私に持ってきてくだされば、";
			next;
			mes "[ショウゴ]";
			mes "モンスターテイマーのプライドに";
			mes "かけてっ！その場ですぐに作って";
			mes "差し上げますねっ！";
			close;
		}
		setarray '@need,7014,0;
		setarray '@amount,1,0;
		set '@gain,636;
		break;
	case 4:
		mes "[ショウゴ]";
		mes "人間が味わうという次元を";
		mes "はるかに超越したアイテムッ！";
		mes "その名も^3355FF組織の掟^000000!!";
		mes "組織を重んじるモンスターたちの";
		mes "趣向にピッタリあった嗜好品っ……。";
		next;
		if(countitem(1004)<1 || countitem(904)<1) {
			mes "[ショウゴ]";
			mes "組織の掟が好きなモンスターを";
			mes "育てるあなたに……";
			mes "組織の掟の作り方をひとつっ！";
			mes "^3355FF忠節の証っ！^000000";
			mes "^3355FFサソリの尻尾１つずつっ！^000000";
			mes "私に持ってきてくだされば、";
			next;
			mes "[ショウゴ]";
			mes "モンスターテイマーのプライドに";
			mes "かけてっ！その場ですぐに作って";
			mes "差し上げますねっ！";
			close;
		}
		setarray '@need,1004,904;
		setarray '@amount,1,1;
		set '@gain,635;
		break;
	case 5:
		mes "[ショウゴ]";
		mes "どんなモンスターをそばに置くか";
		mes "まだ決める事ができていないよう";
		mes "ですねっ。人生のパートナーに";
		mes "なるかもしれないのでおろそかに";
		mes "決めないことっ……。";
		next;
		mes "ゆっくり考えてみて";
		mes "決心がついてたら、";
		mes "また訪ねて来てくださいっ。";
		close;
	}
	mes "[ショウゴ]";
	mes "おお！" +getitemname('@gain)+ "を作ることができる材料を";
	mes "すべて持っていらっしゃいますねッ。";
	mes "すばらしいッ！";
	mes "モンスターテイマーのプライドにかけて";
	mes "すぐに作って差し上げますッ。";
	next;
	mes "[ショウゴ]";
	switch(@menu) {
		case 2:
			mes "亡者の牙２つと古い魔法書〜ッ";
			next;
			mes "^3355FF- パッパラパラッ グツグツッ -^000000";
			break;
		case 3:
			mes "古いポートレート〜";
			next;
			mes "^3355FF- コトコト ジックリジックリ -^000000";
			break;
		case 4:
			mes "サソリの尻尾……そして";
			mes "忠節の証まぜてまぜて〜ッ";
			next;
			mes "^3355FF- がらがら がらがら ぐっちゃ ぐっちゃ -^000000";
			break;
	}
	next;
	delitem '@need[0],'@amount[0];
	delitem '@need[1],'@amount[1];
	getitem '@gain,1;
	mes "[ショウゴ]";
	mes "はい、できあがりましたッ！";
	mes "あなたの育てるかわいいモンスターを";
	mes "大事にしてあげてくださいッ。";
	mes getitemname('@gain)+ "ッ！";
	close;
}

//----------------------------------
// 動物の頭蓋兜/モンスター酸素マスク/シルクリボン
// 星のヘアーピン/小さな卵殻/ロッカー眼鏡
//----------------------------------

aldeba_in.gat,168,175,4	script	モンスターテイマー	125,{
	mes "[ユウ]";
	mes "なにをお探しでしょうか！";
	mes "ミッドガルド大陸でモンスター";
	mes "嗜好品を作らせたら、並ぶものが";
	mes "いないと言われるこの私が、";
	mes "かわいいペットモンスターのために";
	mes "なんでも作って差し上げます！";
	next;
	switch (select("^3355FF「モンスターテイミング」^000000に関して","^3355FF「動物の頭蓋兜」^000000注文","^3355FF「モンスター酸素マスク」^000000注文",
				"^3355FF「シルクリボン」^000000注文","^3355FF「星のヘアーピン」^000000注文","^3355FF「小さな卵殻」^000000注文",
				"^3355FF「ロッカー眼鏡」^000000注文","会話をやめる")) {
	case 1:
		mes "[ユウ]";
		mes "好きなモンスターとの";
		mes "コミュニケーションのためなら";
		mes "必ず用意しなければならない";
		mes "様々なモンスター嗜好品！";
		mes "我らモンスターテイマーギルドが";
		mes "お手頃な条件でご提供します！";
		next;
		mes "[ユウ]";
		mes "非常にクールなアイテムたちを";
		mes "気軽に手に入れることができる";
		mes "すてきなシステム！";
		mes "動物の頭蓋兜！";
		mes "モンスター酸素マスク！";
		mes "シルクリボン！";
		next;
		mes "[ユウ]";
		mes "星のヘアーピン！";
		mes "小さな卵殻!!";
		mes "ロッカー眼鏡!!!";
		next;
		mes "[ユウ]";
		mes "動物の頭蓋兜^3355FF「ボーンヘルム」^000000１つ、";
		mes "モンスター酸素マスクは";
		mes "^3355FF「酸素マスク」^000000１つ、";
		mes "シルクリボンは^3355FF「リボン」^000000１つ、";
		next;
		mes "[ユウ]";
		mes "星のヘアーピンは^3355FF「スターダスト」^000000１つ";
		mes "小さな卵殻は^3355FF「装飾用卵殻」^000000１つ、";
		mes "ロッカー眼鏡は^3355FF「ジャルゴン」^000000２つと";
		mes "^3355FF「リボン」^000000そして^3355FF「400 Zeny」^000000";
		mes "で交換可能です。";
		next;
		mes "[ユウ]";
		mes "いっぱい手に入れて";
		mes "綺麗なペットを飼いましょう！";
		mes "気合いを入れてゴーゴーゴー!!";
		close;
	case 2:
		set '@need,5017;
		set '@gain,10001;
		mes "[ユウ]";
		mes "人間が被るという次元を";
		mes "はるかに超越したアイテム！";
		mes "その名も^3355FF動物の頭蓋兜^000000!!";
		mes "ぞっとするほど気味が悪いが、";
		next;
		mes "[ユウ]";
		mes "ある種のモンスターは、よく";
		mes "わからないまま被りたくなってしまう";
		mes "神秘的な力を持ったこのアイテム！";
		break;
	case 3:
		set '@need,5004;
		set '@gain,10002;
		mes "[ユウ]";
		mes "人間が着けるいう次元を";
		mes "はるかに超越した……";
		mes "その名も^3355FFモンスター酸素マスク^000000!!";
		mes "顔に着けているとモンスターなのか";
		mes "人間なのか、判別するのも大変な";
		mes "このアイテム！";
		break;
	case 4:
		set '@need,2208;
		set '@gain,10007;
		mes "[ユウ]";
		mes "平凡な人間が見るという次元を";
		mes "はるかに超越したアイテム！";
		mes "その名も^3355FFシルクリボン^000000!!";
		mes "理解できないデザイン！まさに";
		mes "モンスターたちの趣向にぴったり";
		mes "あった嗜好品……。";
		break;
	case 5:
		set '@need,2294;
		set '@gain,10011;
		mes "[ユウ]";
		mes "人間が頭に飾るという次元をはるかに";
		mes "超越したアイテム！その名も";
		mes "^3355FF星のヘアーピン^000000!!";
		next;
		mes "[ユウ]";
		mes "非常にとがっているが、ある種の";
		mes "モンスターは、よくわからないまま";
		mes "頭に飾りたくなってしまう";
		mes "神秘的な力を持ったこのアイテム！";
		break;
	case 6:
		set '@need,5015;
		set '@gain,10012;
		mes "[ユウ]";
		mes "人間が被るという次元を";
		mes "はるかに超越した……";
		mes "その名も^3355FF小さな卵殻^000000!!";
		mes "奇妙な香りが漂いながらも、";
		mes "なめらかな光を放つこのアイテム！";
		break;
	case 7:
		set '@gain,10014;
		mes "[ユウ]";
		mes "平凡な人間がかけるという次元を";
		mes "はるかに超越したアイテム！";
		mes "その名も^3355FFロッカー眼鏡^000000!!";
		mes "理解できないデザイン！まさに";
		mes "モンスターたちの趣向に";
		mes "ぴったりあった嗜好品……。";
		break;	//これだけ別処理する
	case 8:
		mes "[ユウ]";
		mes "どんなモンスターをそばに置くか、";
		mes "まだ決める事ができていないよう";
		mes "ですね。人生のパートナーに";
		mes "なるかもしれないので";
		mes "おろそかに決めないこと……。";
		next;
		mes "[ユウ]";
		mes "ゆっくり考えてみて";
		mes "決心がついてたら、";
		mes "また訪ねて来てください。";
		close;
	}
	next;
	if( (@menu<7 && countitem('@need)<1) || (@menu==7 && (countitem(912)<2 || countitem(2208)<1 || Zeny<400)) ) {
		mes "[ユウ]";
		mes getitemname('@gain)+ "が好きなモンスターを";
		mes "育てるあなたに……";
		mes getitemname('@gain)+ "の作り方をひとつ！";
		if(@menu<7) {
			mes "^3355FF" +getitemname('@need)+ "１つ !^000000";
		}
		else {
			mes "^3355FFジャルゴン２つ！^000000^3355FFリボン１つ！^000000";
			mes "そして、たったの ^3355FF400 Zeny！^000000";
		}
		mes "私にもってきてくだされば、";
		next;
		mes "[ユウ]";
		mes "モンスターテイマーのプライドに";
		mes "かけて！その場ですぐに作って";
		mes "差しあげます！";
		close;
	}
	mes "[ユウ]";
	mes "おお！" +getitemname('@gain)+ "を作ることができる材料を";
	mes "すべて持っていらっしゃいますね。";
	mes "すばらしい！";
	mes "モンスターテイマーのプライドにかけて";
	mes "すぐに作って差し上げます。";
	next;
	mes "[ユウ]";
	switch(@menu) {
		case 2:
			mes "ボーンヘルムもんでもんで……";
			next;
			mes "^3355FF- モニュ モニュ -^000000";
			break;
		case 3:
			mes "酸素マスク〜こっそり投げこんで〜";
			next;
			mes "^3355FF- コソコソ ドンガラガッシャーン -^000000";
			break;
		case 4:
			mes "リボン〜ほどいてほどいて〜";
			next;
			mes "^3355FF- シュルシュル ザクザク ギュッ -^000000";
			break;
		case 5:
			mes "スターダストおとして……";
			next;
			mes "^3355FF- ズンチャカ ズンチャカ -^000000";
			break;
		case 6:
			mes "装飾用卵殻とばしていれて〜";
			next;
			mes "^3355FF- ビュン ビュン ガラガラ -^000000";
			break;
		case 7:
			mes "ジャルゴンリボンこなごなにして〜";
			next;
			mes "^3355FF- ガリガリ サクサク ビシッ -^000000";
			break;
	}
	next;
	if(@menu<7)
		delitem '@need,1;
	else {
		delitem 912,2;
		delitem 2208,1;
		set Zeny,Zeny-400;
	}
	getitem '@gain,1;
	mes "[ユウ]";
	mes "はい、できあがりました！";
	mes "あなたの育てるかわいいモンスターを";
	mes "大事にしてあげてください。";
	mes getitemname('@gain)+ "！";
	close;
}

//----------------------------------
// コモド ボンゴンテイムアイテム交換
//----------------------------------
comodo.gat,112,182,0	script	お婆さん	103,{
	if(countitem(1558)<1) {
		mes "[お婆さん]";
		mes "うう……";
		mes "私の可哀想な孫娘……";
		mes "何故連れて行かねばならんのじゃ……";
		close;
	}
	mes "[お婆さん]";
	mes "もし……そこの方、";
	mes "私の可哀想な孫娘を見なかったかぇ？";
	mes "この老いた婆のかわいい孫娘を";
	mes "神霊様はなぜ連れていかれたのじゃ……";
	next;
	mes "[お婆さん]";
	mes "いつだったかさえもう覚えていないほど";
	mes "昔の話じゃが、この婆がフェイヨンに";
	mes "住んでいた頃一人の孫娘が居たんじゃ。";
	mes "お下げを結ってあげるといつも";
	mes "喜んでいたわい……";
	next;
	mes "[お婆さん]";
	mes "村長様のお屋敷で働いていても";
	mes "少しも嫌そうではなく、そればかりか";
	mes "村長様のところのお子様と";
	mes "いつも楽しく遊んでいたわ……";
	next;
	mes "[お婆さん]";
	mes "ところが、何故か神霊様の祟りを受け、";
	mes "村長様のお子様が重い病にかかって";
	mes "しまったのじゃ。";
	mes "祭祀を催して洞窟に生贄を捧げなければ";
	mes "ならなくなったのじゃが……";
	mes "なぜ私の孫娘を……";
	next;
	mes "[お婆さん]";
	mes "いつしかお子様の病は治っていった……";
	mes "でも、私はそこに居るとしきりに孫娘の";
	mes "ことが思い出されてたまらなく、";
	mes "とうとうこんな遠い村まで";
	mes "来てしまった……";
	next;
	if(select("元気出してください……","もしやこの日記帳は？")==1) {
		mes "[お婆さん]";
		mes "今も夢を見るんじゃ……";
		mes "忘れようとしてもな……";
		close;
	}
	if(countitem(901)<1) {
		mes "[お婆さん]";
		mes "なんじゃ？その日記帳は……";
		mes "婆は物忘れがひどくての……";
		mes "よう覚えとらん……";
		next;
		mes "[お婆さん]";
		mes "うう……もう一度だけお下げを";
		mes "結ってあげることができたら……";
		close;
	}
	mes "[お婆さん]";
	mes "おお……";
	mes "それは紛れも無く";
	mes "私の孫娘のもの……";
	mes "もし良かったら譲ってくれんかの…";
	next;
	mes "[お婆さん]";
	mes "孫娘が持っていた物は何も私の";
	mes "手元に残っていないのじゃ……";
	next;
	if(select("すみませんが……","差し上げます")==1) {
		mes "[お婆さん]";
		mes "今も夢を見るんじゃ……";
		mes "忘れようとしてもな……";
		close;
	}
	if(countitem(1558)<1 || countitem(901)<1) {	//少女の日記、ピッグテールリボン
		mes "[お婆さん]";
		mes "なんじゃ？……";
		mes "孫娘の持っていた物は……";
		mes "婆は物忘れがひどくての……";
		close;
	}
	if(checkweight(659,1)==0) {
		mes "[お婆さん]";
		mes "おまえさん……";
		mes "荷物が多すぎじゃ。";
		mes "少し減らしてからまた来なさい……";
		close;
	}
	delitem 1558,1;
	delitem 901,1;
	getitem 659,1;
	mes "[お婆さん]";
	mes "ありがとう……";
	mes "代わりにこれをあんたに渡そう";
	mes "ああ……";
	mes "孫娘よ…";
	close;
}
