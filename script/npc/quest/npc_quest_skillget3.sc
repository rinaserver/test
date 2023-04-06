//-----------------------------------------------
//==== 買取露店開設 - ALL_BUYING_STORE
//-----------------------------------------------
-	script	買取担当組合員#buy	59,{
	if(checkitemblank()==0) {
		mes "‐所持アイテムの種類数が多い為";
		mes "　アイテムを受けとることが";
		mes "　できません。";
		mes "　所持アイテムを減らしてから、";
		mes "　再度話しかけてください‐";
		close;
	}
	if(checkweight(6377,50)==0) {
		mes "‐所持アイテムの重量が多い為";
		mes "　アイテムを受けとることが";
		mes "　できません。";
		mes "　所持アイテムを減らしてから、";
		mes "　再度話しかけてください‐";
		close;
	}
	if(getskilllv(2535)>0) {
		mes "[買取担当組合員]";
		mes "やあ、こんにちは。";
		mes "買取露店ライセンスが必要かな？";
		next;
		if(select("買取露店ライセンスを購入する","必要ない")==2) {
			mes "[買取担当組合員]";
			mes "買取露店を開設するために必要な";
			mes "ライセンスが必要になったら";
			mes "いつでも来てくれよ。";
			close;
		}
		mes "[買取担当組合員]";
		mes "買取露店ライセンスは^0000FF1枚";
		mes "200zeny^000000だ。";
		mes "一度に最大50枚まで発行できるよ。";
		mes "何枚購入するんだい？";
		while(1){
			next;
			input '@num;
			if('@num > 0 && '@num <= 50)
				break;
			if('@num == 0) {
				mes "[買取担当組合員]";
				mes "ん？";
				mes "いらないのかい？";
				mes "それじゃあ、また必要になったら";
				mes "声をかけてくれよ。";
				close;
			}
			mes "[買取担当組合員]";
			mes "50枚以内でお願いできるかな？";
		}
		set '@price,200 * '@num;
		if(Zeny < '@price) {
			mes "[買取担当組合員]";
			mes "ライセンス"+ '@num +"枚だと、"+ '@price +"zenyだけど……";
			mes "お金が足りないんじゃないかな。";
			close;
		}
		mes "[買取担当組合員]";
		mes "ライセンス"+ '@num +"枚で、"+ '@price +"zenyだね。";
		mes "確かにいただいたよ！";
		set Zeny,Zeny-'@price;
		getitem 6377,'@num;
		close;
	}
	if(getskilllv(41)==0) {
		mes "[買取担当組合員]";
		mes "アルベルタ商人組合の。";
		mes "買取担当だ。";
		mes "ちょっと今忙しくてね……";
		next;
		mes "[買取担当組合員]";
		mes "君は……";
		mes "うーん、^FF0000露店開設^000000が";
		mes "出来る人だったら話したいことも";
		mes "あるんだけど……";
		mes "ああ、忙しい忙しい。";
		close;
	}
	mes "[買取担当組合員]";
	mes "アルベルタ商人組合の買取担当だ。";
	mes "君は……";
	next;
	mes "[買取担当組合員]";
	mes "今回、商人組合で";
	mes "個人での買取の許可が";
	mes "下りたのを知っているかい？";
	next;
	if(select("知らない","そんな許可がなくても買取していた")==1) {
		mes "[買取担当組合員]";
		mes "だよね。";
		mes "今までも勿論、直接人に掛け合って";
		mes "個人的に物品の買取は出来たと思うけど";
		mes "大量に買取したり、いちいち欲しい物を";
	} else {
		mes "[買取担当組合員]";
		mes "まあ、そうだよね！";
		mes "でも、大量に買取したり、";
		mes "いちいち欲しい物を";
	}
	mes "持っている人を探すのは";
	mes "大変だったと思うんだ。";
	next;
	mes "[買取担当組合員]";
	mes "物品の大量流通は商人にとって";
	mes "重要事項！";
	mes "そこで、組合員歴10年の俺が";
	mes "画期的な企画を提案したんだよ。";
	next;
	mes "[買取担当組合員]";
	mes "その名も";
	mes "『買取が出来る露店の";
	mes "　開設方法とその提案』だ！";
	mes "この提案の内容というのは……";
	next;
	mes "^006200-買取担当組合員は、提案内容を";
	mes " 語り始めた……-^000000";
	next;
	mes "[買取担当組合員]";
	mes "……で、ここの仕組みが……";
	next;
	menu "あの、長いので結論だけお願いします",-;
	mes "[買取担当組合員]";
	mes "……え？";
	mes "ああ、そうかい、要約すると";
	mes "^0000FF一部のアイテムに限り、専用の";
	mes "露店で買取が可能になる^000000ってこと。";
	next;
	mes "[買取担当組合員]";
	mes "ただし、買取露店を開設するには";
	mes "商人組合が発行するライセンスが";
	mes "必要なんだ。";
	mes "1回開設するたびに1枚ライセンスを";
	mes "必要とするよ。";
	next;
	mes "[買取担当組合員]";
	mes "このライセンス収入で、";
	mes "少しは商人組合も持ち直せるかな……";
	next;
	menu "…………",-;
	mes "[買取担当組合員]";
	mes "と、いうわけで、";
	mes "露店開設が出来る人に、";
	mes "ライセンスを発行してあげようと";
	mes "いうわけさ。";
	next;
	mes "[買取担当組合員]";
	mes "まず、初回登録費用として";
	mes "^FF000010,000zeny^000000が必要！";
	mes "あとは、買取露店開設のたびに";
	mes "^0000FF買取露店ライセンス^000000が必要！";
	next;
	mes "[買取担当組合員]";
	mes "どうする、登録するかい？";
	mes "登録してくれれば、買取露店開設の";
	mes "方法から伝授するよ。";
	next;
	if(Upper == 0) {
		mes "[買取担当組合員]";
		mes "あ、ちなみに……";
		mes "転生してしまうと登録は";
		mes "解除されるからね。";
		mes "転生したら、また登録してもらうよ。";
		next;
	}
	if(select("登録して買取露店開設を学ぶ","やめておく")==2) {
		mes "[買取担当組合員]";
		mes "おや、そうかい？";
		mes "結構便利だと思うんだけど……";
		mes "まあ、また気が変わったら";
		mes "来てくれよ！";
		close;
	}
	if(Zeny < 10000) {
		mes "[買取担当組合員]";
		mes "10,000zeny……";
		mes "持っていないみたいだね。";
		mes "是非、準備してから頼むよ！";
		close;
	}
	mes "[買取担当組合員]";
	mes "そうこなくちゃ！";
	mes "えーと……名前は……";
	mes strcharinfo(0)+ "。";
	mes "買取露店開設、認可完了だよ。";
	set Zeny,Zeny-10000;
	getitem 6377,5;
	skill 2535,2,0;		//Lv2を習得する
	next;
	mes "[買取担当組合員]";
	mes "さて、では注意事項を説明するよ。";
	mes "買取可能なアイテムは";
	mes "装備品や一部のポーション類、";
	mes "個人が作成した物を除いた";
	mes "消耗品や収集品に限定されている。";
	next;
	mes "[買取担当組合員]";
	mes "他にも、商人組合が許諾していない";
	mes "アイテムは買取不可能だ。";
	mes "買取可能なアイテムリストに";
	mes "表示されなければ、そのアイテムは";
	mes "買取できない。";
	next;
	mes "[買取担当組合員]";
	mes "物によっては組合の判断で";
	mes "今後買取可能になるかもしれないけど";
	mes "とりあえず^FF0000消耗品や";
	mes "収集品でも物によっては";
	mes "買い取れない^000000ことを";
	mes "了承してほしい。";
	next;
	mes "[買取担当組合員]";
	mes "あと、これも重要だけど";
	mes "買取しようとしているアイテムは";
	mes "最低でも自分で1つは所持している";
	mes "必要があるんだ。";
	mes "自分のアイテムをサンプルとして";
	mes "提示しておくわけさ。";
	next;
	mes "[買取担当組合員]";
	mes "まあ、そんなところかな。";
	mes "初回登録時のおまけとして";
	mes "買取露店開設ライセンスを";
	mes "5枚プレゼントだ。";
	mes "うまく活用してくれよ。";
	close;
}
prt_in.gat,126,65,4	duplicate(買取担当組合員#buy)	買取担当組合員#Prt	59
alberta_in.gat,58,52,4	duplicate(買取担当組合員#buy)	買取担当組合員#Alb	59

que_job01.gat,68,84,0	script	闇商人	881,{
	if(checkitemblank()==0) {
		mes "‐所持アイテムの種類数が多い為";
		mes "　アイテムを受けとることが";
		mes "　できません。";
		mes "　所持アイテムを減らしてから、";
		mes "　再度話しかけてください‐";
		close;
	}
	if(checkweight(12548,10)==0) {
		mes "‐所持アイテムの重量が多い為";
		mes "　アイテムを受けとることが";
		mes "　できません。";
		mes "　所持アイテムを減らしてから、";
		mes "　再度話しかけてください‐";
		close;
	}
	if(getskilllv(2535)>0) {
		mes "[闇商人]";
		mes "……ん……、";
		mes "お前、商人組合のヤツに";
		mes "関わってやがるな？";
		mes "……なら、用は無いな。";
		close;
	}
	mes "[闇商人]";
	mes "……こんなところまで";
	mes "よく来たな。";
	mes "何が必要なんだ？";
	next;
	switch(select("偽造買取露店ライセンス","あなたは何者？","何も必要ない")) {
	case 1:
		mes "[闇商人]";
		mes "ふふ……";
		mes "お前がそれを求めるなら、";
		mes "精巧なライセンスを作ってやるぜ。";
		mes "いくつ欲しいんだ？";
		next;
		mes "[闇商人]";
		mes "一度にそんなには作れないからな、";
		mes "最大10枚までだ。";
		mes "手数料は1枚あたり^0000FF500zeny^000000貰うぜ。";
		mes "あとな、目を付けられないように";
		mes "買取露店自体は正規のものより";
		mes "小さい規模でやるのがルールだ。";
		while(1){
			next;
			input '@num;
			if('@num > 0 && '@num <= 10)
				break;
			if('@num == 0) {
				mes "[闇商人]";
				mes "ん？";
				mes "いらないのか……";
				close;
			}
			mes "[闇商人]";
			mes "一度に作れるのは10枚までだと";
			mes "言っただろう……";
		}
		set '@price,500 * '@num;
		if(Zeny < '@price) {
			mes "[闇商人]";
			mes "手数料は合計"+ '@price +"zenyだ。";
			mes "金が足りないな。";
			close;
		}
		mes "[闇商人]";
		mes "手数料は合計"+ '@price +"zenyだ。";
		mes "うん、確かに……";
		mes "くくく、お前も同じ穴のムジナ……";
		mes "せいぜいうまくやるんだな……";
		set Zeny,Zeny-'@price;
		getitem 12548,'@num;
		close;
	case 2:
		mes "[闇商人]";
		mes "俺はもう故郷のアルベルタを";
		mes "離れて久しい……";
		mes "そんな質問は俺には無意味だ。";
		mes "俺に残ったのは、ただ憎悪だけ……";
		next;
		mes "[闇商人]";
		mes "……ただしい道とは何か……";
		mes "もう堕落した俺には何が残ったのか……";
		mes "ただ、商人組合のヤツに";
		mes "一泡吹かせて";
		mes "やることが出来れば……";
		next;
		mes "[闇商人]";
		mes "……喋りすぎたようだな。";
		mes "忘れてくれ。";
		close;
	case 3:
		mes "[闇商人]";
		mes "……そうか。";
		close;
	}
}

//-----------------------------------------------
//==== フルスロットル - EVT_FULL_THROTTLE
//-----------------------------------------------
nif_in.gat,73,30,4	script	超級魔術師#FTHROTTLE	735,{
	if(checkquest(202050)) {
		mes "[超級魔術師]";
		mes "やぁ調子はどうだい？";
		mes "フルスロットルを使って";
		mes "エンジョイしているかい？";
		close;
	}
	mes "[超級魔術師]";
	mes "そこの君！";
	mes "　";
	mes "もしかしたらこの力……";
	mes "君なら使いこなせるかもしれない！";
	next;
	mes "[超級魔術師]";
	mes "その力は";
	mes "体内の魔力を瞬間的に高め";
	mes "身体の限界を超えた力を";
	mes "短時間だけど引き出せる…";
	next;
	mes "[超級魔術師]";
	mes "私が生涯をかけて開発したスキル";
	mes "その名も…「フルスロットル」！";
	next;
	mes "[超級魔術師]";
	mes "すごく強力なスキルなんだけど";
	mes "ちょっとだけリスクがあってね。";
	mes "　";
	mes "いやいや、大したことじゃないんだ。";
	mes "習得者の力がたりないと痛みがちょっとね。";
	next;
	mes "[超級魔術師]";
	mes "…………";
	mes "最悪…………";
	mes "…………";
	mes "身体が爆発四散するんだ。";
	mes "……";
	next;
	mes "[超級魔術師]";
	mes "大丈夫！君は強そうだし！";
	mes "　";
	mes "私も失敗して死んじゃったし";
	mes "今まで成功した人はいないけど…";
	mes "君なら大丈夫。心配ないさ！";
	next;
	mes "[超級魔術師]";
	mes "どうだい？";
	mes "習得にチャレンジしてみないかい？";
	next;
	if(select("チャレンジする","チャレンジしない") == 2) {
		mes "[超級魔術師]";
		mes "チャレンジしたくなったら";
		mes "いつでも声をかけてくれよ。";
		close;
	}
	mes "[超級魔術師]";
	mes "ナイスチャレンジ！";
	mes "ではこれから儀式を始めるから";
	mes "精神を集中してくれ";
	next;
	mes "[超級魔術師]";
	mes "ゾイヨツ…ゾイゴス…";
	mes "フルスロゾイゴス…";
	mes "この者に力を与えたまえ…";
	mes "クトウシュオルキス！";
	next;
	if(BaseLevel < 175) {
		misceffect 17,"";
		misceffect 106,"";
		misceffect 8,"";
		percentheal -99,0;
		mes "[超級魔術師]";
		mes "……";
		mes "大丈夫かい？危うく死ぬ所だったね。";
		mes "…………";
		mes "まぁ失敗は成功のもとって言うしね。";
		mes "気にしたら駄目だよね。";
		close;
	}
	else {
		misceffect 30,"";
		misceffect 8,"";
		setquest 202050;
		skill 5071,1,0;
		//setquest 122365;
		//compquest 122365;
		mes "[超級魔術師]";
		mes "無事習得出来たようだね…";
		mes "私の目に狂いは無かった！";
		mes "　";
		mes "この力は今日から君の物だ。";
		mes "存分に使ってくれ。";
		close;
	}
}
