//==============================================================================
//Ragnarok Online - EP2.5 makehat script
//==============================================================================
xmas.gat,115,297,4	script	自動販売機	111,{
	mes "[アウディ]";
	mes "- 楽しさいっぱい -";
	mes "- アイテム自動販売機 -";
	mes "- アウディを捜してくれて感謝 -";
	mes "- お望みの商品を選択して -";
	mes "- 投入口にアイテムを -";
	mes "- 入れてください -";
	next;
	switch (select("^ff3152- 注意事項（必読） -^000000","たぬき帽","スポア帽","神秘の木の実","まだら卵殻",
								"ほお紅","コック帽","ろうそく","ケーキ帽","取り消し")) {
	case 1:
		mes "[アウディ]";
		mes "注意！";
		mes "一つ大事な注意事項を";
		mes "申し上げます。";
		mes "当自動販売機は一般装備アイテムと";
		mes "お客様が特別に扱うアイテムを区別する";
		mes "システムが導入されておりません。";
		next;
		mes "[アウディ]";
		mes "したがって、";
		mes "^ff3152貴重なカードが刺さっている装備^000000";
		mes "または";
		mes "^ff3152高い精錬を施したアイテム^000000を";
		mes "^3152ff一般アイテムと見なして^000000取り扱います。";
		next;
		mes "[アウディ]";
		mes "当販売機を利用される場合は、";
		mes "貴重なアイテムをカプラ倉庫に";
		mes "保管する、または他の方に預ける";
		mes "などされてからご利用ください。";
		next;
		mes "[アウディ]";
		mes "万が一、貴重なアイテムをお持ちに";
		mes "なっていて、自動販売機のシステム";
		mes "によって失われてしまった場合、";
		mes "当販売機はそれらの損失に対して";
		mes "一切保障ができません。";
		next;
		mes "[アウディ]";
		mes "それでは良いひとときを。";
		mes "ありがとうございます。";
		close;
	case 2:
		setarray '@need,2213,1036,7012,7065;	//必要アイテムID
		setarray '@amount,1,20,200,300;		//必要個数
		set '@gain,5033;			//獲得アイテムID
		break;
	case 3:
		setarray '@need,7033,7068,1015;
		setarray '@amount,850,300,1;
		set '@gain,5029;
		break;
	case 4:
		setarray '@need,5037,7064;
		setarray '@amount,1,500;
		set '@gain,5050;
		break;
	case 5:
		setarray '@need,5015,978,7030;
		setarray '@amount,1,1,50;
		set '@gain,5039;
		break;
	case 6:
		setarray '@need,7047;
		setarray '@amount,100;
		set '@gain,5040;
		break;
	case 7:
		setarray '@need,539,982,949,1036;
		setarray '@amount,120,1,330,450;
		set '@gain,5026;
		break;
	case 8:
		setarray '@need,2279,7035,526;
		setarray '@amount,1,50,100;
		set '@gain,5028;
		break;
	case 9:
		setarray '@need,529,530,538,539,999;
		setarray '@amount,10,5,15,20,10;
		set '@gain,5024;
		break;
	case 10:
		mes "[アウディ]";
		mes "- ご利用ありがとうございました -";
		close;
	}
	for(set '@i,0; '@i<getarraysize('@need); set '@i,'@i+1) {
		if(countitem('@need['@i]) < '@amount['@i]) {	//アイテム不足時
			mes "[アウディ]";
			mes "- ビービー -";
			mes "- ゴゥンゴゥン -";
			mes "- アイテム不足です -";
			mes "- ガクガクガク -";
			mes "- 私をからかわない！ -";
			close;
		}
	}
	mes "- あなたはアイテムを -";
	mes "- 製作するのに必要な -";
	mes "- 品物を投入口に入れた -";
	next;
	for(set '@i,0; '@i<getarraysize('@need); set '@i,'@i+1) {
		delitem '@need['@i],'@amount['@i];
	}
	getitem '@gain,1;
	mes "[アウディ]";
	mes "- ピコピコピコ -";
	mes "- ガーガーガ -";
	mes "- ブゥンブゥン -";
	mes "- ジジジジジ -";
	mes "- ピョポ！ -";
	mes "- ご利用ありがとうございました -";
	close;
}

//=====================================================================
xmas.gat,117,295,4	script	自動販売機屋	704,{
	mes "[ティティークーペ]";
	mes "ふっふっふ……";
	mes "いらっしゃい、私はルティエの";
	mes "おもちゃ工場長「ティティークーペ」";
	mes "新しい事業に大挑戦！";
	next;
	switch (select("自動販売機について聞く","自動販売機商品説明","会話をやめる")) {
	case 1:
		mes "[ティティークーペ]";
		mes "私の左側の雪だるまの口を";
		mes "良く見てください。";
		mes "それはもう見事な作りでしょう？";
		next;
		mes "[ティティークーペ]";
		mes "ほら、腕でも足でも入れて";
		mes "みなさい。何でも入るから。";
		mes "ふふふ…";
		mes "まぁそれは冗談として、これが";
		mes "新しい装備アイテムを出す";
		mes "自動販売機なんですよ。";
		next;
		mes "[ティティークーペ]";
		mes "自動販売機が要求するいくつかの";
		mes "アイテムを、雪だるまの口に放り";
		mes "こむと、君が望んだ素敵なアイテム";
		mes "を手に入れることができるんです。";
		next;
		break;
	case 2:
		mes "[ティティークーペ]";
		mes "ふっふっふ……";
		mes "ん？この天才に何か質問が";
		mes "あると？";
		mes "この自動販売機の商品ですか。";
		mes "どれについて聞きたいのかな？";
		next;
		switch (select("たぬき帽","スポア帽","神秘の木の実","まだら卵殻","ほお紅","コック帽","ろうそく","ケーキ帽","会話をやめる")) {
			case 1:
				mes "[ティティークーペ]";
				mes "「たぬき帽」";
				mes "猫耳のヘアバンド 1";
				mes "ドラゴンの鱗 20";
				mes "堅い鱗の茎 200";
				mes "ラッコの毛皮 300";
				break;
			case 2:
				mes "[ティティークーペ]";
				mes "「スポア帽」";
				mes "毒キノコの胞子 850";
				mes "燃えた木 300";
				mes "長く細い舌 1";
				break;
			case 3:
				mes "[ティティークーペ]";
				mes "「神秘の木の実」";
				mes "木の実 1";
				mes "とんぼの羽 500";
				break;
			case 4:
				mes "[ティティークーペ]";
				mes "「まだら卵殻」";
				mes "装飾用卵殻 1";
				mes "青色の染料 1";
				mes "砂漠狼の爪 50";
				break;
			case 5:
				mes "[ティティークーペ]";
				mes "「ほお紅」";
				mes "君！";
				mes "なかなかわかる人だね！";
				mes "ふふ……とにかくこれだ。";
				mes "- アリスのエプロン 100 -";
				break;
			case 6:
				mes "[ティティークーペ]";
				mes "「コック帽」";
				mes "ひとくちケーキ 120";
				mes "白色の染料 1";
				mes "やわらかな毛 330";
				mes "ドラゴンの鱗 450";
				break;
			case 7:
				mes "[ティティークーペ]";
				mes "「ろうそく」";
				mes "導火線 1";
				mes "マッチ 50";
				mes "ローヤルゼリー 100";
				break;
			case 8:
				mes "[ティティークーペ]";
				mes "「ケーキ帽」";
				mes "キャンディ 10";
				mes "スティックキャンディ 5";
				mes "よく焼いたクッキー 15";
				mes "ひとくちケーキ 20";
				mes "鋼鉄 10";
				break;
			case 9:
				mes "[ティティークーペ]";
				mes "いつでもなんでも聞いてみて。";
				mes "なんでも知っている「天才」に。";
				mes "私の頭脳はこの世で一番優秀。";
				break;
		}
		next;
		mes "[ティティークーペ]";
		mes "ああ私は天才だ！";
		mes "ふっふっふっふ……";
		mes "はっはっはっは……";
		close;
	case 3:
		break;
	}
	mes "[ティティークーペ]";
	mes "私は天才だ〜";
	mes "こんな素敵なアイテムと機械を";
	mes "創り出した私の頭は最高！";
	mes "ふっふっふ……";
	next;
	mes "- おもちゃ工場長 -";
	mes "- ティティークーペは -";
	mes "- 雪だるま自動販売機を -";
	mes "- 指さしてあっちこっち -";
	mes "- 飛び回っている -";
	close;
}

//=====================================================================
alberta.gat,136,79,1	script	帽子屋お嬢さん	71,{
	mes "[テンペストラ]";
	mes "ああ〜さわやかな潮風……";
	mes "ここでこうしていると気持ちいいわ……";
	mes "しばらく店をお休みにして、";
	mes "ここで気分転換することにしたの。";
	next;
	mes "[テンペストラ]";
	mes "でも……あまりにも日差しが強くて";
	mes "お肌には悪いわ……";
	mes "のども渇いて……ああ、";
	mes "黄ポーションが飲みたいわ……";
	next;
	if(select("はい、どうぞ","自分で買っては？")==2) {
		mes "[テンペストラ]";
		mes "あら、つっけんどんな態度！";
		close;
	}
	if(countitem(503)<1) {
		mes "[テンペストラ]";
		mes "う？どこに黄ポーションが";
		mes "あるんですか？";
		close;
	}
	mes "[テンペストラ]";
	mes "ああ、ありがとう！";
	mes "こんなに良い人に会うなんて……";
	next;
	delitem 503,1;
	mes "- ゴクゴクゴク -";
	next;
	mes "[テンペストラ]";
	mes "あ〜〜";
	mes "とても美味しかったです！ありがとう！";
	next;
	if(select("本当に暑いですね〜","代わりに何かください")==1) {
		mes "[テンペストラ]";
		mes "ね〜 本当に暑いです。";
		next;
		mes "[テンペストラ]";
		mes "部屋に戻れば";
		mes "^0000ffおしゃれな帽子^000000とか";
		mes "^0000ffとんがり帽子^000000とか";
		mes "^0000ffシルクハット^000000なんかがあるけど。";
		next;
		mes "[テンペストラ]";
		mes "私、普段は帽子屋を開いているの。";
		mes "売ろうと思って持ってきた物だから";
		mes "使わないようにしてたんだけど……";
		mes "そういうわけにもいかないわね……";
		next;
		set @menu,select("おしゃれな帽子!?","とんがり帽子!?","シルクハット!?");
		mes "[テンペストラ]";
		mes "ふふ、私は帽子商人ですから。";
		mes "ってさっき言いましたね……";
		next;
		mes "[テンペストラ]";
		mes "気を取り直して……";
		switch(@menu) {
		case 1:
			mes "えっへん、おしゃれな帽子はね、";
			next;
			mes "[テンペストラ]";
			mes "^0000ff透明な布^000000 250個";
			mes "カードが刺せる ^0000ffハット^000000 1個";
			mes "カードが刺せる ^0000ffキャップ^000000 1個";
			mes "^0000ff柔らかい羽毛^000000 600 個";
			setarray '@need,1059,2221,2227,7063;
			setarray '@amount,250,1,1,600;
			set '@gain,5032;
			break;
		case 2:
			mes "えっへん、とんがり帽子はね……";
			next;
			mes "[テンペストラ]";
			mes "^0000ffウィザードハット^000000 1個";
			mes "^0000ffドラゴンの鱗^000000 400個";
			mes "^0000ffカビの粉^000000 50個";
			mes "^0000ffエルダーウィローカード^000000 1個";
			setarray '@need,2252,1036,7001,4052;
			setarray '@amount,1,400,50,1;
			set '@gain,5027;
			break;
		case 3:
			mes "えっへん、シルクハットはね……";
			next;
			mes "[テンペストラ]";
			mes "^0000ffウィザードハット^000000 1個";
			mes "^0000ff古代魚の唇^000000 450個";
			mes "^0000ffけっこうかたい皮^000000 1200個";
			setarray '@need,2252,1054,943;
			setarray '@amount,1,450,1200;
			set '@gain,5045;
			break;
		}
		mes "があれば作ることができます。";
	}
	else {
		mes "[テンペストラ]";
		mes "いくらなんでもそれは〜";
		mes "恩を売るようにしちゃだめですよー";
		next;
		mes "[テンペストラ]";
		mes "うん……冷たいポーションも頂いたし、";
		mes "何かお礼をしてあげたいんですが";
		mes "ここには材料が無くて……";
		next;
		mes "[テンペストラ]";
		mes "うん……";
		mes "^0000ff太陽神の象徴^000000 1個";
		mes "^0000ff黄金^000000 10個";
		mes "^0000ff鋼鉄^000000 40個";
		mes "^0000ff石炭^000000 50個";
		mes "^0000ffオリデオコン^000000 2個";
		next;
		mes "[テンペストラ]";
		mes "これだけあれば私が";
		mes "「太陽神の兜」という兜を";
		mes "作ってあげることができるのに……";
		setarray '@need,7086,969,999,1003,984;
		setarray '@amount,1,10,40,50,2;
		set '@gain,5022;
	}
	next;
	for(set '@i,0; '@i<getarraysize('@need); set '@i,'@i+1) {
		if(countitem('@need['@i]) < '@amount['@i]) {
			if('@gain==5022) {	//太陽神の兜のとき
				mes "[テンペストラ]";
				mes "黄ポーションのお礼ですよ〜";
				mes "手数料はいただきません。";
			}
			else {			//その他の装備品のとき
				mes "[テンペストラ]";
				mes "黄ポーションをくださったので、";
				mes "こっそり材料を教えてあげました。";
				next;
				mes "[テンペストラ]";
				mes "今度お店に遊びに来てくださいね。";
			}
			close;
		}
	}
	mes "[テンペストラ]";
	mes "あら！";
	mes "材料を全部持ってるじゃありませんか！";
	mes "あ、もし材料の中に";
	mes "^ff0000カードが刺さっていたり、";
	mes "精錬されているアイテム^000000が入っていたら";
	mes "倉庫に入れてきてくださいな。";
	next;
	mes "[テンペストラ]";
	mes "黄ポーションへのお礼と言っては";
	mes "なんですが、その材料を渡して";
	mes "くれたらすぐに作って差し上げますよ。";
	mes "どうしますか？";
	next;
	if(select("作ってください！","今回は結構です")==2) {
		//セリフ未設定
		close;
	}
	mes "[テンペストラ]";
	mes "はい、できました！";
	mes "どうですか？私の腕前は。";
	for(set '@i,0; '@i<getarraysize('@need); set '@i,'@i+1) {
		delitem '@need['@i],'@amount['@i];
	}
	getitem '@gain,1;
	close;
}

//=====================================================================
alberta.gat,120,53,1	script	おしゃれな詩人	51,{
	if(countitem(10007) >= 1 && countitem(968) >= 50) {
		setarray '@need,10007,968;
		setarray '@amount,1,50;
		set '@gain,5042;	//シニョンキャンプ
	}
	else if(countitem(5041) >= 1 && countitem(999) >= 10) {
		setarray '@need,5041,999;
		setarray '@amount,1,10;
		set '@gain,5048;	//三日月のヘアピン
	}
	else if(countitem(2271) >= 1 && countitem(975) >= 1) {
		setarray '@need,2271,975;
		setarray '@amount,1,1;
		set '@gain,5047;	//ファッションサングラス
	}
	else if(countitem(7013) >= 1200) {
		setarray '@need,7013,0;
		setarray '@amount,1200,0;
		set '@gain,5041;	//ハートのヘアピン
	}
	if('@gain) {
		mes "[ジク]";
		mes "分かりました、分かりました！";
		mes getitemname('@gain)+ "ですね……";
		mes "ちょっと待ってください";
		next;
		mes "- カチャカチャ -";
		next;
		delitem '@need[0],'@amount[0];
		delitem '@need[1],'@amount[1];
		getitem '@gain,1;
		mes "[ジク]";
		mes "はい、これです。";
		mes "丁寧に作りました。";
		mes "大事にしてくださいね。";
		close;
	}
	//アイテムがない場合
	mes "[ジク]";
	mes "うう〜ん……やっぱり海の匂いは";
	mes "良いですね〜";
	mes "うん？何か私に用でしょうか？";
	mes "実は私が商人だということを";
	mes "知っているのですね。";
	next;
	mes "[ジク]";
	mes "ふぅ……やっぱり有名な商人は";
	mes "どこに行ってもわかってしまうのか……";
	mes "休む暇もありゃしない……";
	next;
	mes "[ジク]";
	mes "おっと、何が欲しいですか？";
	mes "言ってみてください。";
	next;
	set @menu,select("シニョンキャップ","三日月のヘアピン","ファッションサングラス","ハートのヘアピン");
	mes "[ジク]";
	mes "なんだ、私が取り扱っている品物まで";
	mes "ちゃんと知ってるんじゃないですか。";
	mes "まったく誰に聞いたのやら……。";
	next;
	mes "[ジク]";
	switch(@menu) {
	case 1:
		mes "シニョンキャップは……";
		next;
		mes "[ジク]";
		mes "^0000ffシルクリボン^000000 1個に";
		mes "^0000ffオーク勇者の証^000000 50個";
		mes "があれば良いです。";
		mes "ひょっとしてこれも知っていたとか…？";
		break;
	case 2:
		mes "三日月のヘアピンは……";
		next;
		mes "[ジク]";
		mes "^0000ffハートのヘアピン^000000 1個に";
		mes "^0000ff鋼鉄^000000 10個があれば";
		mes "良いです。";
		mes "ひょっとしてこれも知っていたとか……";
		mes "？";
		break;
	case 3:
		mes "ファッションサングラスは……";
		next;
		mes "[ジク]";
		mes "^0000ff頭眼鏡^000000 1個に";
		mes "^0000ff赤色の染料^000000 1個";
		mes "があれば良いです。";
		mes "ひょっとしてこれも知っていたとか……";
		mes "？";
		break;
	case 4:
		mes "ハートのヘアピンは……";
		next;
		mes "[ジク]";
		mes "単純です。";
		mes "^0000ffサンゴ^000000 1200個があれば";
		mes "良いです。";
		mes "ひょっとしてこれも知っていたとか……";
		mes "？";
		break;
	}
	mes "ま、とにかくそれが材料です。";
	close;
}

//=====================================================================
payon_in01.gat,56,12,7	script	青年	89,{
	mes "[青年]";
	mes "何の用だ……";
	next;
	if(select("特別な品物を作ってくれるとか……","いいえ、失礼しました")==2) {
		mes "[青年]";
		mes "うむ……";
		close;
	}
	mes "[青年]";
	mes "君も大体のことは知っている";
	mes "ようだから、用件だけ言うがいい……";
	next;
	switch (select("天使の兜","子悪魔帽","後でまた来ます")) {
	case 1:
		setarray '@need,2254,2229,7036;
		setarray '@amount,1,1,5;
		set '@gain,5025;
		mes "[青年]";
		mes "スロット付きヘルム 1個";
		mes "天使のヘアバンド 1個";
		mes "ハティーの牙 5個";
		break;
	case 2:
		setarray '@need,1038,7048;
		setarray '@amount,600,40;
		set '@gain,5038;
		mes "[青年]";
		mes "子悪魔の角 600個";
		mes "グリフォンの爪 40個";
		break;
	case 3:
		close;
	}
	next;
	mes "[青年]";
	mes "注意！";
	mes "君が準備した品物が精錬されていたり、";
	mes "カードが刺さっていたとしても";
	mes "私はそれを材料として扱うから、";
	mes "それが嫌なら倉庫に入れるなりして";
	mes "材料とするものだけを私に渡せ。";
	next;
	mes "[青年]";
	mes "材料は用意したか？";
	next;
	if(select("渡す","やめる")==2) {
		mes "[青年]";
		mes "うむ……";
		close;
	}
	for(set '@i,0; '@i<getarraysize('@need); set '@i,'@i+1) {
		if(countitem('@need['@i]) < '@amount['@i]) {	//アイテム不足時
			mes "[青年]";
			mes "材料が足りない……";
			mes "しっかり確認してくるように。";
			close;
		}
	}
	mes "[青年]";
	mes "未調査";
	next;
	for(set '@i,0; '@i<getarraysize('@need); set '@i,'@i+1) {
		delitem '@need['@i],'@amount['@i];
	}
	getitem '@gain,1;
	close;
}

//=====================================================================
comodo.gat,228,159,4	script	ヘアバンドお姉さん	700,{
	mes "[ヘアバンドお姉さん]";
	mes "はい、こんにちは〜";
	mes "ヘアバンドを作りませんか？";
	mes "ガールフレンドへの贈り物なら";
	mes "やっぱりヘアバンド！";
	next;
	mes "[ヘアバンドお姉さん]";
	mes "簡単な材料さえ持って来れば";
	mes "私が素敵なヘアバンドを作って";
	mes "さしあげますよ〜";
	mes "是非一度お試しください。";
	next;
	switch (select("十字架のヘアバンド","電球のヘアバンド","縞のバンダナ","青いバンダナ")) {
	case 1:
		setarray '@need,2608,7069;
		setarray '@amount,1,500;
		set '@gain,5036;
		break;
	case 2:
		setarray '@need,2233,746;
		setarray '@amount,1,20;
		set '@gain,5034;
		break;
	case 3:
		set '@need,1099;
		set '@amount,1500;
		set '@gain,5049;
		break;
	case 4:
		setarray '@need,2211,978,7003;
		setarray '@amount,1,1,300;
		set '@gain,5052;
		break;
	}
	for(set '@i,0; '@i<getarraysize('@need); set '@i,'@i+1) {
		if(countitem('@need['@i]) < '@amount['@i]) {	//アイテム不足時
			mes "[ヘアバンドお姉さん]";
			mes "はい、" +getitemname('@gain)+ "ですね！";
			mes "材料がいくつか必要ですから、";
			mes "用意してきてくださいね。";
			next;
			mes "[ヘアバンドお姉さん]";
			switch(@menu) {
			case 1:
				mes "十字架のヘアバンドを作るためには……";
				mes "^4169E1ロザリー^000000 1個";
				mes "^4169E1壊れた鎧^000000 500個";
				break;
			case 2:
				mes "電球のヘアバンドを作るためには……";
				mes "^4169E1スロット付きサークレット^000000 1個";
				mes "^4169E1ガラス玉^000000 20個";
				break;
			case 3:
				mes "縞のバンダナを作るためには……";
				mes "^4169E1ボロボロ囚人服^000000 1500個";
				break;
			case 4:
				mes "青いバンダナを作るためには……";
				mes "^4169E1頭巾^000000 1個";
				mes "^4169E1青色の染料^000000 1個";
				break;
			}
			mes "が必要です。";
			next;
			mes "[ヘアバンドお姉さん]";
			mes "持ってきてくださったらすぐに";
			mes "作りますよ〜";
			mes "それでは！";
			close;
		}
	}
	mes "[ヘアバンドお姉さん]";
	mes "はい、" +getitemname('@gain)+ "ですね！";
	mes "材料も揃ったようですから、";
	mes "すぐにつくりましょう。";
	next;
	mes "[ヘアバンドお姉さん]";
	mes "そこで注意！";
	mes "精錬されていたり、カードが刺さって";
	mes "いたりしても、材料として見なされて";
	mes "消えてしまう場合があります。";
	next;
	mes "[ヘアバンドお姉さん]";
	mes "材料に必要なだけ持ってきてね。";
	mes "よろしければ作りましょうか。";
	next;
	if(select("いいえ","はい")==1) {
		mes "[ヘアバンドお姉さん]";
		mes "そうそう。他の物は倉庫にでも";
		mes "入れてらっしゃい〜";
		close;
	}
	mes "^4169E1ゴソゴソ…ガサゴソ…^000000";
	next;
	for(set '@i,0; '@i<getarraysize('@need); set '@i,'@i+1) {
		delitem '@need['@i],'@amount['@i];
	}
	getitem '@gain,1;
	mes "[ヘアバンドお姉さん]";
	mes "さぁ、これ！綺麗にできました！";
	mes "また利用してくださいね〜では！";
	close;
}

//=====================================================================
comodo.gat,273,137,4	script	旅人	702,{
	mes "[仮面職人]";
	mes "私は、大陸を渡り歩きながら";
	mes "さまざまな情報を仕入れています。";
	mes "たまに珍しい物などを作る方法を";
	mes "学んで来たりします。";
	next;
	mes "[仮面職人]";
	mes "そのいくつかを聞いてみませんか？";
	mes "今まで材料を集めることができなくて";
	mes "作れなかった物があるんですよ。";
	next;
	switch (select("鉱山ヘルメット","風呂敷包み","お金を失った者の心","ファントムマスク")) {
	case 1:
		mes "[仮面職人]";
		mes "鉱山ヘルメット・・・・・・これはゲフェンの";
		mes "炭鉱で聞いた話です。";
		mes "ご存知の通り、炭鉱はとても暗くて";
		mes "明かりが必要となります。";
		next;
		mes "[仮面職人]";
		mes "しかし、ランプを持って仕事をすると";
		mes "手が塞がるため、よくモンスター達の";
		mes "襲撃を受けました。";
		next;
		mes "[仮面職人]";
		mes "そんなある日、鉱夫の一人が自分の";
		mes "工事帽を改良してランプを付けたん";
		mes "です。つまり、両手が使える状態で";
		mes "前を見ることができるヘルメット・・・・・・";
		mes "それが鉱山ヘルメットです。";
		next;
		mes "[仮面職人]";
		mes "鉱山ヘルメットを作るならば、";
		mes "いくつかの材料が必要です。";
		mes "^4169E1工事帽^000000 1個";
		mes "^4169E1ろうそく^000000 1個";
		mes "^4169E1水晶鏡^000000 1個";
		mes "^4169E1鋼鉄^000000 25個";
		next;
		if(countitem(5009) >= 1 && countitem(5028) >= 1 && countitem(999) >= 25 && countitem(747) >= 1) {
			mes "[仮面職人]";
			mes "未調査";
			next;
			delitem 5009,1;
			delitem 5028,1;
			delitem 999,25;
			delitem 747,1;
			getitem 5031,1;
			close;
		}
		break;
	case 2:
		mes "[仮面職人]";
		mes "風呂敷包み・・・・・・それはアルベルタ地方で";
		mes "聞いた話です。";
		mes "商人たちはいつもカートに品物を入れて";
		mes "露店を開きますね。";
		next;
		mes "[仮面職人]";
		mes "ところで、東方の地域では物を運ぶ時";
		mes "珍しい方法を用いるといいます。";
		mes "まさにそれが風呂敷包みでしょう。";
		next;
		mes "[仮面職人]";
		mes "荷物をまとめて頭の上に載せ、";
		mes "バランスを保って進みます。";
		mes "そうすれば両手が自由になって";
		mes "作業もできますね。";
		next;
		mes "[仮面職人]";
		mes "風呂敷包みを作るなら、いくつかの";
		mes "材料が必要となります。";
		mes "^4169E1透明な布^000000 150個";
		mes "^4169E1古木の露^000000 100個";
		mes "^4169E1青色の染料^000000 1個";
		next;
		if(countitem(1059) >= 150 && countitem(907) >= 100 && countitem(978) >= 1) {
			mes "[仮面職人]";
			mes "未調査";
			next;
			delitem 1059,150;
			delitem 907,100;
			delitem 978,1;
			getitem 5023,1;
			close;
		}
		break;
	case 3:
		mes "[仮面職人]";
		mes "お金を失った者の心・・・・・・";
		mes "これはモロクに伝わる伝説的な";
		mes "商人の話です・・・・・・";
		mes "まじめに仕事しながら暮らしてきた";
		mes "その商人は、非常にあくどいギルド";
		mes "と対立するようになりました・・・・・・";
		next;
		mes "[仮面職人]";
		mes "買い占めをしていたギルドにとって";
		mes "その正直な商人はとても邪魔に";
		mes "なったんです。";
		mes "それで市場価格を操作して、その";
		mes "商人の商売を妨害するように";
		mes "なったのです・・・・・・";
		next;
		mes "[仮面職人]";
		mes "そしてその商人はほとんど全ての";
		mes "物を失い、残ったのはカートの底に";
		mes "あったいくつかのアイテムだけ・・・・・・";
		mes "彼は泣きながら自分の今の境遇を";
		mes "訴えるべく一つの品を作ったのです。";
		next;
		mes "[仮面職人]";
		mes "それがまさに「お金を失った者の心」";
		mes "なのです。それを見ていると・・・・・・";
		mes "じわじわと情け心が沸いてきて、";
		mes "つい品物を買ってあげたくなるとか・・・・・・";
		mes "まぁ、伝説は伝説ですが。";
		next;
		mes "[仮面職人]";
		mes "お金を失った者の心を作るなら、";
		mes "いくつかの材料が必要です。";
		mes "^4169E1スロット付きサークレット^000000 1個";
		mes "^4169E1黄金^000000 1個";
		mes "^4169E1鋼鉄^000000 20個";
		mes "^4169E1やわらかな毛^000000 80個";
		mes "^4169E1べとべとする液体^000000 800個";
		next;
		if(countitem(2233) >= 1 && countitem(969) >= 1 && countitem(999) >= 20 && countitem(949) >= 80 && countitem(938) >= 800) {
			mes "[仮面職人]";
			mes "未調査";
			next;
			delitem 2233,1;
			delitem 969,1;
			delitem 999,20;
			delitem 949,80;
			delitem 938,800;
			getitem 5021,1;
			close;
		}
		break;
	case 4:
		mes "[仮面職人]";
		mes "ファントムマスク・・・・・・この話は";
		mes "アルデバランで聞きました。";
		mes "純粋な恋をした一人の男の話です・・・・・・";
		next;
		mes "[仮面職人]";
		mes "オペラ座の怪人・・・・・・美しい女性歌手を";
		mes "愛した一人の男がいました・・・・・・";
		mes "しかし彼の顔は醜く、仮面をつけて";
		mes "暮らしていたんです。";
		next;
		mes "[仮面職人]";
		mes "その男はその女性歌手を愛して";
		mes "いましたが、なかなか彼女の前に";
		mes "現れることができませんでした。";
		mes "そんなある日、彼女に正体を隠した";
		mes "まま助けてあげました。";
		next;
		mes "[仮面職人]";
		mes "彼の悲しい思いがこもった仮面で、";
		mes "他のオペラ仮面と違った雰囲気が";
		mes "あります。";
		next;
		mes "[仮面職人]";
		mes "ファントムマスクを作るなら、";
		mes "いくつかの材料が必要です。";
		mes "^4169E1オペラ仮面^000000 1個";
		mes "^4169E1蛇模様の髪^000000 50個";
		next;
		if(countitem(2281) >= 1 && countitem(1048) >= 50) {
			mes "[仮面職人]";
			mes "未調査";
			next;
			delitem 2281,1;
			delitem 1048,50;
			getitem 5043,1;
			close;
		}
		break;
	}
	mes "[仮面職人]";
	mes "材料を準備してくださったら、";
	mes "私が作ってみたいと思います。";
	mes "それでは良い旅を・・・・・・";
	close;
}
