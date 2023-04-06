//= Athena Script ==============================================================
// Ragnarok Online Blacksmith Jobchange Script	by Blaze
//= Registry ===================================================================
// CHANGE_BS -> 0〜17
//==============================================================================

//============================================================
// 案内員
//------------------------------------------------------------
geffen_in.gat,109,170,2	script	ギルド関係者	726,{
	mes "[ブラックスミスギルド関係者]";
	mes "こんにちは、";
	mes "ブラックスミスギルドを";
	mes "尋ねて来たのですか？";
	next;
	mes "[ブラックスミスギルド関係者]";
	mes "申し訳ありませんが、";
	mes "ブラックスミスギルドは";
	mes "^3131FFシュバルツバルド共和国の";
	mes "「鋼鉄の都市　アインブロック」^000000";
	mes "に移動しました。";
	next;
	mes "[ブラックスミスギルド関係者]";
	mes "シュバルツバルド共和国には";
	mes "飛行船を利用して移動できます。";
	next;
	mes "[ブラックスミスギルド関係者]";
	mes "よろしければ、";
	mes "空港が設置されているイズルードまで、";
	mes "600Zenyで空間移動ができますが。";
	mes "空間移動を利用しますか？";
	next;
	switch(select("アインブロックへの詳しい行き方","イズルードへ！","利用しない")) {
	case 1:
		mes "[ブラックスミスギルド関係者]";
		mes "わかりました。ご説明します。";
		next;
		mes "[ブラックスミスギルド関係者]";
		mes "シュバルツバルド共和国は";
		mes "空間移動サービスの代わりに";
		mes "「飛行船」を利用しています。";
		next;
		mes "[ブラックスミスギルド関係者]";
		mes "^3131FF「イズルード」^000000では";
		mes "^3131FF「イズルード-ジュノー」^000000間を";
		mes "繰り返し移動している";
		mes "^3131FF国外用飛行船^000000が運行中です。";
		next;
		mes "[ブラックスミスギルド関係者]";
		mes "国外用飛行船でジュノーまで行き、";
		mes "シュバルツバルド国内を運行する";
		mes "^3131FF国内用飛行船^000000に乗り換えれば";
		mes "アインブロックに到着できます。";
		next;
		mes "[ブラックスミスギルド関係者]";
		mes "飛行船を乗り換える時は、";
		mes "^3131FF空港の外に出ないように^000000";
		mes "気を付けてください。";
		next;
		mes "[ブラックスミスギルド関係者]";
		mes "話だけを聞くと難しいですが、";
		mes "慣れれば簡単です。";
		mes "飛行船に乗っているだけですから。";
		mes "それでは、アインブロックにいる";
		mes "ブラックスミス仲間に";
		mes "よろしくお伝えください。";
		close;
	case 2:
		if(Zeny < 600) {
			mes "[ブラックスミスギルド関係者]";
			mes "お金が不足しているようです。";
			close;
		}
		warp "izlude.gat",94,103;
		end;
	case 3:
		mes "[ブラックスミスギルド関係者]";
		mes "それでは、楽しい一日を。";
		close;
	}
}

//============================================================
// 受付および転職
//------------------------------------------------------------
//geffen_in.gat,110,169,2	script	ギルド員	731,{
ein_in01.gat,18,28,4	script	ギルド員	731,{
	if(Upper == UPPER_HIGH) {
		mes "[アルトアイゼン]";
		mes "君、君、";
		mes "ここがどこなのかわかって";
		mes "いるのかい？";
		next;
		mes "[アルトアイゼン]";
		mes "それとも……どこかで会ったか？";
		mes "う〜ん……";
		mes "うう〜ん…………";
		next;
		mes "[アルトアイゼン]";
		mes "我らの作った武器でも持ち逃げした";
		mes "奴だったか……";
		mes "それとも武器を作ってくれと頼みに来て";
		mes "結局諦めて帰った奴だったかな……";
		mes "う〜ん……";
		next;
		mes "[アルトアイゼン]";
		mes "……";
		mes "わからん！思い出せん……";
		mes "はっ……これがデジャビュってやつか!";
		mes "?";
		next;
		mes "[アルトアイゼン]";
		mes "さっぱり思い出せん……";
		mes "何か普通じゃない気配もするが……";
		mes "ま、とにかく！";
		mes "楽しい一日を過ごせよな。";
		close;
	}
	mes "[アルトアイゼン]";
	mes "ようこそ！我らは鉄を扱う";
	mes "ブラックスミスギルドである！";
	mes "そして鉄へ熱い情熱を燃やす";
	mes "者達である！";
	next;
	mes "[アルトアイゼン]";
	mes "金属を溶かして新しい武器を作る";
	mes "技術は、まさに一つの芸術！";
	next;
	if(Job == Job_Priest) {
		mes "[アルトアイゼン]";
		mes "おや、神様の御使いですか！";
		mes "よく来てくれました！";
		mes "ぜひこの私に祝福のお祈りを";
		mes "お願いします。";
		close;
	}
	if(Job == Job_Blacksmith) {
		mes "[アルトアイゼン]";
		mes "お！久しぶりだな！";
		mes "クリストファーに何か用かい？";
		mes "私は近頃こんな事務仕事ばっかでさ…";
		mes "そろそろハンマーでも振りたくなって";
		mes "きたよ…ははは…";
		close;
	}
	if(Job != Job_Merchant) {
		mes "[アルトアイゼン]";
		mes "ふむ、いい目をしている" +(Sex? "男": "娘")+ "だな！";
		mes "ブラックスミスになりたいかい？";
		mes "しかし、我らは商人からのみ転職";
		mes "できる。今は諦めな。";
		close;
	}
	if(SkillPoint) {
		mes "[アルトアイゼン]";
		mes "おっと、スキルポイントが";
		mes "残っていると転職できないぞ。";
		mes "全部振ってからまた来てくれ。";
		close;
	}
	switch(CHANGE_BS) {
	case 0:
		mes "[アルトアイゼン]";
		mes "君も商人であることに満足して";
		mes "いないで、我らと炎の芸術に身を";
		mes "投じてみないかい？";
		mes "そこの転職申込書にお名前と";
		mes "JobLvを書いてくれ。ふふふ。";
		next;
		switch(select("転職申し込みをする","転職条件は？","また今度…")) {
			case 1:
				break;
			case 2:
				mes "[アルトアイゼン]";
				mes "転職条件のことかい？";
				mes "まず、商人JobLvを40以上に。";
				mes "そして、テストに合格する事。";
				mes "この二つだ。まあ、テストがちょっと";
				mes "難しいけれど、ある程度の知識を";
				mes "持つ商人なら問題はないはずだ。";
				next;
				mes "[アルトアイゼン]";
				mes "テストは商品の配達をして、各地域の";
				mes "特産品を把握する実地テストと、";
				mes "ブラックスミスになるための知識を問う";
				mes "筆記テストがある。";
				close;
			case 3:
				mes "[アルトアイゼン]";
				mes "うむ、また今度な。";
				close;
		}
		if(JobLevel < 40) {
			mes "[アルトアイゼン]";
			mes "ふむ…君はまだ商人としての";
			mes "JobLVが足りていないようだ。";
			mes "転職は商人JobLv40以上から";
			mes "可能となる。";
			mes "せっかく来てくれたのに残念だが、";
			mes "もうちょっと鍛えてから来てくれ。";
			close;
		}
		mes "[アルトアイゼン]";
		mes "うむ…";
		mes "一応JobLvは大丈夫みたいだな。";
		next;
		mes "[アルトアイゼン]";
		mes "よし、基本は出来ているが、";
		mes "それだけでブラックスミスに";
		mes "なれるわけじゃない。";
		mes "少なくとも、君の商人としての";
		mes "誠実性とブラックスミスへの";
		mes "情熱を見せてもらわないとな。";
		next;
		mes "- 何かの書類を出した -";
		next;
		mes "[アルトアイゼン]";
		//mes "ふむ…今アルベルタに出張中の";
		//mes "ふむ…今アインベフに出張中の";
		mes "ギルド員「ゲッシュ」が忙しくて";
		mes "困っている様子だから、彼の仕事を";
		mes "ちょっと手伝ってやって欲しい。";
		mes "これが君への最初の試験だ。";
		next;
		mes "[アルトアイゼン]";
		mes "それじゃ、気を付けて行って";
		mes "来てな。";
		set CHANGE_BS,1;
		close;
	case 1:
		mes "[アルトアイゼン]";
		mes "おう、まだ出発していなかったのか。";
		//mes "アルベルタにいる「ゲッシュ」を";
		mes "アインベフにいる「ゲッシュ」を";
		mes "訪ねてみてな。";
		mes "それじゃ、また。";
		close;
	default:
		mes "[アルトアイゼン]";
		mes "ゲッシュに頼まれた仕事はどうなって";
		mes "いるかな？";
		mes "彼はちょっと頑固でね…";
		mes "最後まで頑張ってくれ。";
		close;
	case 15:
		mes "[アルトアイゼン]";
		mes "お疲れ様！";
		mes "一つクリアだな。";
		next;
		mes "[アルトアイゼン]";
		mes "うん？ ははは…";
		mes "これで試験が終わったわけじゃないぞ。";
		//mes "よし、モロクに行ってくれ。";
		//mes "あそこに次の担当者が居る。";
		mes "よし、近くに次の担当者がいるから";
		mes "話をしてきてくれ。";
		next;
		if(select("トホホ……行きます……","……もう嫌だ！")==2) {
			mes "[アルトアイゼン]";
			mes "なに？転職をあきらめると？";
			mes "この根性無しが！これは我が";
			mes "ギルドに対する侮辱だ！";
			mes "帰れ！二度と来るんじゃない！";
			next;
			mes "[アルトアイゼン]";
			mes "テストを途中で投げ出して、";
			mes "ブラックスミスになれると";
			mes "思ったのか！";
			close;
		}
		mes "[アルトアイゼン]";
		mes "すまんが…仕方ないんだ。";
		mes "君も知っているかな？";
		mes "以前は誰でもテスト無しに転職";
		mes "させていたから…詐欺とノーマナー";
		mes "行為で多くの被害者が出てしまった。";
		next;
		mes "[アルトアイゼン]";
		mes "ふぅ…";
		//mes "とりあえずモロクに行き、次の";
		//mes "テストも頑張ってほしい。";
		mes "とりあえず次のテストも";
		mes "頑張ってほしい。";
		set CHANGE_BS,16;
		close;
	case 16:
		mes "[アルトアイゼン]";
		//mes "ん？モロクに行ってなかったのかい？";
		//mes "早く向かってくれ！";
		mes "ん？";
		mes "早く会ってくれ！";
		close;
	case 17:
		if(countitem(1005)==0)
			close;
		mes "[アルトアイゼン]";
		mes "おお、見事合格したか！";
		mes "では君にも炎の芸術を受け継ぐ";
		mes "能力を与えよう。";
		next;
		mes "[アルトアイゼン]";
		mes "しかし忘れてはならない。";
		mes "我々は、鉄に命を吹き込む者達。";
		mes "己の欲のために仕事をしては";
		mes "ならないぞ。";
		set '@amount,(JobLevel >= 50)? 30: 5;
		unequip;
		set CHANGE_BS,0;
		jobchange Job_Blacksmith;
		next;
		mes "[アルトアイゼン]";
		mes "そしてこれは転職祝いだ。";
		mes "では良い鍛冶屋になれよ！";
		delitem 1005,1;
		getitem 999,'@amount;
		close;
	}
}

//============================================================
// 一次試験（筆記および武器製造）
//------------------------------------------------------------
//alberta_in.gat,174,22,4	script	ブラックスミスギルド員	63,{
ein_in01.gat,201,27,4	script	ブラックスミスギルド員	63,{
	mes "[ゲッシュ]";
	mes "熱血!!俺は熱血ブラックスミス";
	mes "ゲッシュだ！よろしく！";
	next;
	if(Job != Job_Merchant) {
		mes "[ゲッシュ]";
		mes "ブラックスミスは本当に充実感の";
		mes "ある職業だよ！";
		mes "そう思いませんか？ハッハッハー";
		close;
	}
	mes "[ゲッシュ]";
	mes "おおお!? 商人か。よく来くれた！";
	mes "人手に困っていてねー！";
	next;
	switch(CHANGE_BS) {
	case 0:
		mes "[ゲッシュ]";
		mes "しかし！";
		mes "忙しい人間に迷惑をかけては";
		mes "ならない！";
		next;
		mes "[ゲッシュ]";
		mes "それじゃ！";
		mes "良い旅をしてくれ！";
		close;
	case 1:
		mes "[ゲッシュ]";
		mes "ブラックスミスギルドから話を";
		mes "聞いて来た人だな？";
		mes "いや〜最近注文が多くて、人手が";
		mes "足りないところだったんだよ。";
		next;
		mes "[ゲッシュ]";
		mes "ふむ、仕事を手伝いに来てくれたなら";
		mes "少しいくつかの質問に答えてくれ。";
		next;
		mes "[ゲッシュ]";
		mes "この間来た奴は、基本的なことも";
		mes "知らなくて、間違った物を持ってきて";
		mes "しまったからな…";
		mes "大事な金を無駄にしてしまったんだよ。";
		mes "じゃ、質問する！用意はいいか？";
		next;
		if(select("は〜い","ちょっと待ってください")==2) {
			mes "[ゲッシュ]";
			mes "そうか。なら準備をしてから";
			mes "またおいで。";
			mes "たまには慎重になるのも大事だね。";
			close;
		}
		break;
	case 2:
		mes "[ゲッシュ]";
		mes "ふむ…よし、勉強してきたか！";
		mes "今度は一回くらい間違っても";
		mes "許してやる！";
		mes "さあ、用意はいいな？";
		next;
		break;
	case 3:
		mes "[ゲッシュ]";
		mes "ちょっと待って…確かに";
		mes "注文依頼書はここに…";
		next;
		mes "[ゲッシュ]";
		mes "ああ！あった、あった！";
		mes "一番急いでいるやつが…";
		mes "ええーと…";
		next;
		mes "[ゲッシュ]";
		mes "まず、材料が必要だな。";
		next;
		set CHANGE_BS,rand(4,8);
		switch(CHANGE_BS) {
		case 4:	//ヒュッケ
			setarray '@need,1001,932,912,1219;
			setarray '@amount,2,1,1,1;
			break;
		case 5:	//バイス
			setarray '@need,999,930,717,1610;
			setarray '@amount,2,1,2,1;
			break;
		case 6:	//グロン
			setarray '@need,1003,935,990,1119;
			setarray '@amount,2,2,2,1;
			break;
		case 7:	//ビスマルク
			setarray '@need,998,511,919,1122;
			setarray '@amount,8,20,2,1;
			break;
		case 8:	//テルピツ
			setarray '@need,1002,2212,717,1713;
			setarray '@amount,8,1,2,1;
			break;
		}
		mes "[ゲッシュ]";
		for(set '@i,0; '@i < 3; set '@i,'@i+1)
			mes getitemname('@need['@i])+ " " +'@amount['@i]+ "個";
		mes "そして…商店で売ってる";
		mes "「" +getitemname('@need[3])+ "」を1つ頼む。";
		next;
		mes "[ゲッシュ]";
		mes "いや、俺に金が無くて頼むわけ";
		mes "じゃない。これはテストなんだ。";
		next;
		mes "[ゲッシュ]";
		mes "もう一度言うからよく聞いてな。";
		for(set '@i,0; '@i < 3; set '@i,'@i+1)
			mes getitemname('@need['@i])+ " " +'@amount['@i]+ "個";
		mes "商店で売ってる" +getitemname('@need[3])+ "を1つ。";
		next;
		mes "[ゲッシュ]";
		mes "じゃ、お願い。早く持ってきてね！";
		close;
	case 4:
	case 5:
	case 6:
	case 7:
	case 8:
		switch(CHANGE_BS) {
		case 4:	//ヒュッケ
			setarray '@need,1001,932,912,1219;
			setarray '@amount,2,1,1,1;
			break;
		case 5:	//バイス
			setarray '@need,999,930,717,1610;
			setarray '@amount,2,1,2,1;
			break;
		case 6:	//グロン
			setarray '@need,1003,935,990,1119;
			setarray '@amount,2,2,2,1;
			break;
		case 7:	//ビスマルク
			setarray '@need,998,511,919,1122;
			setarray '@amount,8,20,2,1;
			break;
		case 8:	//テルピツ
			setarray '@need,1002,2212,717,1713;
			setarray '@amount,8,1,2,1;
			break;
		}
		mes "[ゲッシュ]";
		mes "うん？頼んだ物を揃えてきたか？";
		next;
		for(set '@i,0; '@i<4; set '@i,'@i+1) {
			if(countitem('@need['@i]) < '@amount['@i]) {
				mes "[ゲッシュ]";
				mes "……まだ材料がそろってない…。";
				mes "…何回言わせるんだ!?";
				for(set '@i,0; '@i<3; set '@i,'@i+1)
					mes getitemname('@need['@i])+ " " +'@amount['@i]+ "個";
				mes "商店で売ってる" +getitemname('@need[3])+ "1つ。";
				next;
				mes "[ゲッシュ]";
				mes "しっかりしてくれ、これはテストだぞ！";
				mes "買い物も出来ない奴が";
				mes "ブラックスミスになれると思うのか？";
				close;
			}
		}
		mes "[ゲッシュ]";
		switch(CHANGE_BS) {
			case 4:
				mes "星の粉… 3個じゃなかったか？";
				next;
				mes "[ゲッシュ]";
				mes "あ、2個であってる。他のは…";
				break;
			case 5:
				mes "鋼鉄… 3個じゃなかったか？";
				next;
				mes "[ゲッシュ]";
				mes "あ、2個であってる。他のは…";
				break;
			case 6:
				mes "石炭… 3個じゃなかったか？";
				next;
				mes "[ゲッシュ]";
				mes "あ、2個であってる。他のは…";
				break;
			case 7:
				mes "鉄… 40個じゃなかったか？";
				next;
				mes "[ゲッシュ]";
				mes "あ、8個であってる。他のは…";
				break;
			case 8:
				mes "鉄鉱石… 30個じゃなかったか？";
				next;
				mes "[ゲッシュ]";
				mes "あ、8個であってる。他のは…";
				break;
		}
		mes "よし！完璧だな。";
		mes "ふむ…これから準備するから";
		mes "ちょっと待ってな。";
		next;
		mes "[ゲッシュ]";
		mes "あ、そうだ… 君、所持品の中に";
		mes "^FF0000他の" +getitemname('@need[3])+ "^000000が入って";
		mes "いないか？";
		next;
		if(select("あ、ちょっと待ってください","転職試験用のだけ持っています")==1) {
			mes "[ゲッシュ]";
			mes "うむ、転職試験用以外のは";
			mes "倉庫にでも入れて置くといい。";
			close;
		}
		mes "[ゲッシュ]";
		mes "オーケー！";
		next;
		mes "[ゲッシュ]";
		mes "えいっ……。";
		next;
		mes "[ゲッシュ]";
		mes "よこらしょっと……";
		next;
		for(set '@i,0; '@i<4; set '@i,'@i+1)
			delitem '@need['@i],'@amount['@i];
		set CHANGE_BS,CHANGE_BS+5;
		getitem '@need[3],1;	//武器が渡される
		mes "[ゲッシュ]";
		mes "はあ。";
		mes "出来たな…";
		switch(CHANGE_BS) {
			case  9: mes "さあ、これをモロクの「ヒュッケ」に"; 	break;
			case 10: mes "さあ、これをゲフェンの「バイス」に"; 	break;
			//case 11: mes "さあ、これをイズルードの「グロン」に"; 	break;
			case 11: mes "さあ、これをリヒタルゼンの「グロン」に"; 	break;
			//case 12: mes "さあ、これをコモドの「ビスマルク」に"; 	break;
			case 12: mes "さあ、これをフィゲルの「ビスマルク」に"; 	break;
			case 13: mes "さあ、これをフェイヨンの「テルピツ」に"; 	break;
		}
		mes "渡して、俺に領収証を持って来れば";
		mes "オーケーだ。";
		next;
		switch(CHANGE_BS) {
		case 9:
			mes "[ゲッシュ]";
			mes "うん？普通のグラディウスと";
			mes "どこが違うかって!?";
			mes "…。そこの刃の部分をよーく見ろ。";
			mes "飾りのエンブレムが入ってる！";
			mes "ウルトラ グラディウス";
			mes "ゲッシュMk2 Version!!!";
			next;
			mes "[ゲッシュ]";
			mes "……";
			mes "見るだけで惚れてしまいそうだろう？";
			next;
			mes "[ゲッシュ]";
			mes "とにかくモロクの「ヒュッケ」に";
			mes "渡して、領収証をもらって来い！";
			close;
		case 10:
			mes "[ゲッシュ]";
			mes "うん？普通のアークワンドと";
			mes "どこが違うかって!?";
			mes "…。そこの取っ手部分をよーく見ろ。";
			mes "グリップ感がたまらない！";
			mes "スーパー アークワンド";
			mes "ゲッシュMk2 Version!!!";
			next;
			mes "[ゲッシュ]";
			mes "……";
			mes "振る時の感触が違うんだよ！";
			mes "感触が！";
			next;
			mes "[ゲッシュ]";
			mes "とにかくゲフェンの「バイス」に渡して";
			mes "領収証をもらって来い！";
			close;
		case 11:
			mes "[ゲッシュ]";
			mes "うん？普通のツルギとどこが";
			mes "違うかって!?";
			mes "…。そこの刃の部分をよーく見ろ。";
			mes "飾りのエンブレムが入ってる!!!";
			mes "二文字斬り ツルギ";
			mes "ゲッシュMk2 Version!!!";
			next;
			mes "[ゲッシュ]";
			mes "……";
			mes "見るだけで惚れてしまいそうだろう？";
			next;
			mes "[ゲッシュ]";
			//mes "とにかくイズルードの「グロン」に";
			mes "とにかくリヒタルゼンの「グロン」に";
			mes "渡して、領収証をもらって来い！";
			close;
		case 12:
			mes "[ゲッシュ]";
			mes "うん？普通の環頭太刀と";
			mes "どこが違うかって!?";
			mes "…。そこの刃の部分をよーく見ろ。";
			mes "緑ハーブ液が含まれている！";
			mes "緑ハーブ液噴射環頭太刀";
			mes "ゲッシュMk2 Version!!!";
			next;
			mes "[ゲッシュ]";
			mes "…。毒にやられた時、これで刺せば";
			mes "すぐ治るんだよ！";
			mes "怪我はもっと酷くなるけど…";
			mes "毒は治療できる!!";
			next;
			mes "[ゲッシュ]";
			//mes "とにかくコモドの「ビスマルク」に";
			mes "とにかくフィゲルの「ビスマルク」に";
			mes "渡して、領収証をもらって来い！";
			close;
		case 13:
			mes "[ゲッシュ]";
			mes "うん？普通のアーバレストと";
			mes "どこが違うかって!?";
			mes "…。そこの身の部分をよーく見ろ!";
			mes "眼帯収納場所が付いてる!!!";
			mes "名品袋ネズミ(仮称)";
			mes "ゲッシュMk2 Version!!!";
			next;
			mes "[ゲッシュ]";
			mes "…。眼帯の携帯性が高くなるんだよ！";
			next;
			mes "[ゲッシュ]";
			mes "とにかくフェイヨンの「テルピツ」に";
			mes "渡して、領収証をもらって来い！";
			close;
		}
	case 9:
	case 10:
	case 11:
	case 12:
	case 13:
		mes "[ゲッシュ]";
		mes "うん？早く行ってこい。";
		mes "えっ？届け先を忘れたって？";
		next;
		mes "[ゲッシュ]";
		switch(CHANGE_BS) {
		case 9:
			mes "モロク ソードメイス商人近くの";
			mes "「ヒュッケ」に渡して、領収証を";
			mes "持ってくること。";
			close;
		case 10:
			mes "ゲフェン 11時方向の「バイス」";
			mes "に渡して、領収証を持ってくること。";
			close;
		case 11:
			//mes "イズルード 11時方向 銅像近くの";
			//mes "「グロン」に渡して、領収証を";
			//mes "持ってくること。";
			mes "リヒタルゼン 6時方向、";
			mes "武器屋近くの「グロン」に渡して";
			mes "領収書を持ってくること。";
			close;
		case 12:
			//mes "コモド 12時方向の「ビスマルク」";
			//mes "に渡して、領収証を持ってくること。";
			mes "フィゲル 1時方向、";
			mes "飛行船近くの「ビスマルク」に渡して";
			mes "領収証を持ってくること。";
			close;
		case 13:
			mes "フェイヨン 5時方向の「テルピツ」";
			mes "に渡して、領収証を持ってくること。";
			close;
		}
	case 14:
		mes "[ゲッシュ]";
		mes "おー お帰り！";
		mes "うむ、領収証は？";
		next;
		if(select("はい、これです。","あ、すみません！")==2) {
			mes "[ゲッシュ]";
			mes "わかった。 領収証が見つかったら";
			mes "言ってな。";
			mes "貰うのを忘れたとか…まさかそんな";
			mes "はずはないよな？ハハハハハ！";
			close;
		}
		if(countitem(1073) < 1) {
			mes "[ゲッシュ]";
			mes "……領収証を忘れたと？";
			mes "……そんな馬鹿な……";
			next;
			mes "[ゲッシュ]";
			mes "それはないんじゃないかい？";
			mes "どうしたらそれを無くすことが出来る!?";
			next;
			mes "[ゲッシュ]";
			mes "領収証は商人の命！鍛冶屋の誇り！";
			mes "それを忘れることは許されない！";
			mes "初めから出直せ！";
			set CHANGE_BS,3;	//材料調達からやり直し
			close;
		}
		mes "[ゲッシュ]";
		mes "おお！ よし…。確かに。";
		mes "完璧!! 本当にしっかり者だな!!";
		mes "いいだろう！";
		//mes "ゲフェンの「アルトアイゼン」の";
		mes "アインブロックの「アルトアイゼン」の";
		mes "元に戻れ。そう、転職受付のな。";
		mes "お疲れさん、君には充分資質がある！";
		delitem 1073,1;
		set CHANGE_BS,15;
		close;
	case 15:
		mes "[ゲッシュ]";
		mes "うむ、ごくろうだった。";
		//mes "早くゲフェンの「アルトアイゼン」";
		//mes "のところに戻りなさい。";
		mes "早くアインブロックの";
		mes "「アルトアイゼン」のところに";
		mes "戻りなさい。";
		close;
	case 16:
	case 17:
		mes "[ゲッシュ]";
		mes "うん？ここにはもう用は無い";
		mes "はずだけど？";
		//mes "モロクやゲフェンの方に";
		mes "アインブロックの方に";
		mes "行くんじゃなかったのか？";
		close;
	}
	//1,2のとき試験開始
	if(rand(2)) {
		mes "[ゲッシュ]";
		mes "1. 次の中で、地域と特産品が";
		mes "合っていない物はどれか。";
		next;
		if(select("モロク - シーフクロース","アルベルタ - ツーハンドアックス","コモド - バーサークポーション","アルベルタ - ソードメイス")==4)
			set '@point,'@point+10;
		mes "[ゲッシュ]";
		mes "2. 次の中でブラックスミスのスキル";
		mes "「八ンマーフォール」の効果は？";
		next;
		if(select("スタン","暗闇","沈黙","睡眠")==1)
			set '@point,'@point+10;
		mes "[ゲッシュ]";
		mes "3. 次の中で商人が出来ない事は？";
		next;
		if(select("露店を開く","商品を安く買える","商品を高く売れる","早く走れる")==4)
			set '@point,'@point+10;
		mes "[ゲッシュ]";
		mes "4. ブルージェムストーンを";
		mes "売っている商店はどこにある？";
		next;
		if(select("アルベルタ","モロク","ゲフェン","プロンテラ")==3)
			set '@point,'@point+10;
		mes "[ゲッシュ]";
		mes "5. それじゃ、ゲフェンの道具屋は";
		mes "どこにあるか？";
		next;
		if(select("ゲフェンタワーから 8時方向","ゲフェンタワーから 11時方向","ゲフェンタワーから 6時方向","ゲフェンタワーから 5時方向")==1)
			set '@point,'@point+10;
		mes "[ゲッシュ]";
		mes "6. 次の中で商人が使えない武器は？";
		next;
		if(select("スティレット","環頭太刀","チェイン","バイブル")==4)
			set '@point,'@point+10;
		mes "[ゲッシュ]";
		mes "7. 次の防御具の中で防御力が";
		mes "一番高いのは？";
		next;
		if(select("ブリーフ","ミンクのコート","ウドゥンメイル","シルクローブ")==2)
			set '@point,'@point+10;
		mes "[ゲッシュ]";
		mes "8. レベル3武器を精錬する時、";
		mes "どこまで安全に精錬できるか。";
		next;
		if(select("+3 まで","+4 まで","+5 まで","+6 まで")==3)
			set '@point,'@point+10;
		mes "[ゲッシュ]";
		mes "9. 「木屑」から作れるアイテムは？";
		next;
		if(select("笠","亡者のヘアバンド","マジェスティックゴート","鹿の角")==1)
			set '@point,'@point+10;
		mes "[ゲッシュ]";
		mes "10. 商人として一番大切なものは？";
		next;
		if(select("信用","誠意","お金","話術"))		//どれも正解
			set '@point,'@point+10;
	}
	else {
		mes "[ゲッシュ]";
		mes "1. 次の中で、地域と特産品が";
		mes "合っていない物はどれか。";
		next;
		if(select("アルデバラン - イグドラシルの葉","アルベルタ - ハンマー","コモド - 狂気のポーション","アルデバラン - ハンマー")==4)
			set '@point,'@point+10;
		mes "[ゲッシュ]";
		mes "2. ゼロピーの値段は？";
		next;
		if(select("1 Zeny","2 Zeny","3 Zeny","4 Zeny")==3)
			set '@point,'@point+10;
		mes "[ゲッシュ]";
		mes "3. 露店を開くために必要な条件は？";
		next;
		if(select("カートを装備していること","商品を手に持っていること","武器を装備していること","鎧を装備していること")==1)
			set '@point,'@point+10;
		mes "[ゲッシュ]";
		mes "4. 次の中で商人転職所がある街は？";
		next;
		if(select("アルベルタ","モロク","ゲフェン","プロンテラ")==1)
			set '@point,'@point+10;
		mes "[ゲッシュ]";
		mes "5. モロクの武器屋はどこにある？";
		next;
		if(select("中央から 7時の方向","中央から 11時の方向","中央から 3時の方向","中央から 5時の方向")==4)
			set '@point,'@point+10;
		mes "[ゲッシュ]";
		mes "6. 次で商人が使えない武器は？";
		next;
		if(select("マインゴーシュ","クレイモア","チェイン","ツーハンドアックス")==2)
			set '@point,'@point+10;
		mes "[ゲッシュ]";
		mes "7. 次の防具の中で、防御力が一番";
		mes "高いのは？";
		next;
		if(select("ブリーフ","ミンクのコート","ウドゥンメイル","シルクローブ")==2)
			set '@point,'@point+10;
		mes "[ゲッシュ]";
		mes "8. レベル3武器を精錬する時、";
		mes "どこまで安全に精錬できるか。";
		next;
		if(select("+3 まで","+4 まで","+5 まで","+6 まで")==3)
			set '@point,'@point+10;
		mes "[ゲッシュ]";
		mes "9. 鉄鉱石を落とさない";
		mes "モンスターは？";
		next;
		if(select("チョンチョン","スチールチョンチョン","ゼロム","アノリアン")==4)
			set '@point,'@point+10;
		mes "[ゲッシュ]";
		mes "10. 商人にとって";
		mes "一番大切なことは!!?";
		next;
		if(select("話術","信用","お金","人間関係"))		//どれも正解
			set '@point,'@point+10;
	}
	mes "[ゲッシュ]";
	mes "うむ、よし！お疲れさん！";
	next;
	mes "[ゲッシュ]";
	mes "どれどれ…点数は…";
	mes '@point+ "点！";
	if( (CHANGE_BS == 1 && '@point < 90) || (CHANGE_BS == 2 && '@point < 80) ) {
		mes "………";
		next;
		mes "[ゲッシュ]";
		mes "う〜む、悪いがこの程度の問題";
		mes "楽々クリアしてもらわないと";
		mes "仕事を頼むのは無理だな。";
		mes "勉強して出直してくれ。";
		set CHANGE_BS,2;
		close;
	}
	mes "おお！これなら問題なし！";
	mes "ならば…";
	next;
	mes "[ゲッシュ]";
	mes "では、仕事を手伝ってもらおう。";
	mes "ちょっと準備をするから";
	mes "少ししてからまた話しかけてくれ。";
	set CHANGE_BS,3;
	close;
}

//============================================================
// 二次試験（配達）
//------------------------------------------------------------
morocc.gat,27,112,4	script	ヒュッケ	725,{
	switch(CHANGE_BS) {
	case 9:
		if(countitem(1219)) {
			cutin "job_black_hucke01",2;
			mes "[ヒュッケ]";
			mes "……届いたか！";
			mes "よこせ！";
			next;
			mes "[ヒュッケ]";
			mes "この私が注文した物だろうな？";
			mes "お前が使っていた物などは";
			mes "いらんぞ？";
			next;
			if(select("うっ、これは…私の…","問題ありません。新品です")==1) {
				cutin "job_black_hucke03",2;
				mes "[ヒュッケ]";
				mes "…クワッ！";
				next;
				mes "- 怒っているようだ -";
				break;
			}
			cutin "job_black_hucke02",2;
			mes "[ヒュッケ]";
			mes "うはははは！";
			next;
			mes "- 本当に嬉しそうだ -";
			next;
			cutin "job_black_hucke01",2;
			mes "[ヒュッケ]";
			//mes "ゲフェンのブラックスミスギルドと";
			mes "アインブロックの";
			mes "ブラックスミスギルドと";
			mes "お前の先生、ゲッシュに伝えろ！";
			next;
			cutin "job_black_hucke03",2;
			mes "[ヒュッケ]";
			mes "遅い。";
			mes "待つのは嫌いだ。";
			next;
			cutin "job_black_hucke02",2;
			mes "[ヒュッケ]";
			mes "しかし、品質は良い。満足した。と。";
			next;
			mes "(何かを書いている。)";
			next;
			mes "[ヒュッケ]";
			mes "領収書だ。 お前にも礼を言う。";
			delitem 1219,1;
			getitem 1073,1;
			set CHANGE_BS,14;
			break;
		}
		//fall through
	default:
		cutin "job_black_hucke03",2;
		mes "[ヒュッケ]";
		mes "………。";
		mes "……注文した物…いつ来るんだ？";
		next;
		mes "[ヒュッケ]";
		//mes "ゲフェンのブラックスミスギルド…";
		mes "アインブロックの";
		mes "ブラックスミスギルド…";
		mes "ゲッシュ…遅すぎる！";
		next;
		mes "[ヒュッケ]";
		mes "私は、怒った！";
		break;
	case 14:
		cutin "job_black_hucke02",2;
		mes "[ヒュッケ]";
		mes "ありがとう。";
		break;
	}
	close2;
	cutin "dummy",255;
	end;
}

geffen.gat,46,164,4	script	バイス	69,{
	switch(CHANGE_BS) {
	case 10:
		if(countitem(1610)) {
			mes "[バイス]";
			mes "あらまぁ…やっと届いたのね！";
			mes "ありがとう〜本当に待ってたのよ。";
			next;
			mes "[バイス]";
			mes "あたしが注文した物ですよね？";
			mes "あなたが使っていたカードが入って";
			mes "いたりする中古品じゃないわよね？";
			next;
			if(select("あ、これは私の…","問題ありません。新品です")==1) {
				mes "[バイス]";
				mes "…しっかりしなさい。";
				close;
			}
			mes "[バイス]";
			mes "そうよね、ふふふ…";
			next;
			mes "[バイス]";
			//mes "ゲフェンのブラックスミスギルドに";
			//mes "依頼したら、アルベルタに腕の良い";
			mes "アインブロックの";
			mes "ブラックスミスギルドに";
			mes "依頼したら、アインベフに腕の良い";
			mes "人が居るって聞いたからお願いしたの。";
			next;
			mes "[バイス]";
			mes "こんな遠い所までわざわざ来てくれて";
			mes "本当にありがとうございます。";
			mes "あのゲッシュの奴、一発殴ってやって";
			mes "くださいな。本当に待ったんだから。";
			next;
			mes "[バイス]";
			mes "あ、待ってね〜領収書を渡しますから。";
			next;
			mes "-何かを書いた-";
			next;
			mes "[バイス]";
			mes "はい、これです。それじゃ、";
			mes "お疲れ様でした。本当にありがとう〜";
			delitem 1610,1;
			getitem 1073,1;
			set CHANGE_BS,14;
			close;
		}
		//fall through
	default:
		mes "[バイス]";
		//mes "困ったわ…。アルベルタは遠いから";
		mes "困ったわ…。アインベフは遠いから";
		mes "注文した品物がなかなか来なくて…";
		next;
		mes "[バイス]";
		//mes "ゲフェンのブラックスミスギルドに";
		//mes "依頼したら、アルベルタに腕の良い";
		mes "アインブロックの";
		mes "ブラックスミスギルドに";
		mes "依頼したら、アインベフに腕の良い";
		mes "人が居るって聞いたからお願いしたの。";
		next;
		mes "[バイス]";
		mes "あたしの";
		mes "「ちょっとイイ感じのアークワンド」";
		mes "はいつになったら来るのかしら…";
		close;
	case 14:
		mes "[バイス]";
		mes "ありがとうございました。";
		close;
	}
}

//izlude.gat,69,181,4	script	グロン	734,{
lighthalzen.gat,209,80,4	script	グロン	734,{
	switch(CHANGE_BS) {
	case 11:
		if(countitem(1119)) {
			mes "[グロン]";
			mes "おお…届きましたね？";
			mes "いいね…ちょっと見てみましょう。";
			next;
			mes "[グロン]";
			mes "私が注文した物ですよね？";
			mes "あなたが使った物でしたら遠慮します。";
			next;
			if(select("うっ、これは…私の…","問題ありません。新品です")==1) {
				mes "[グロン]";
				mes "まともな物をください！";
				mes "カードが入っていたり精錬された";
				mes "物は要りません！";
				next;
				mes "- 怒っているようだ -";
				close;
			}
			mes "[グロン]";
			mes "確認しましたか？";
			mes "じゃ…いただきます。";
			next;
			mes "[グロン]";
			mes "ほお…。これなら…";
			mes "注文仕様より良い物ですね。";
			next;
			mes "[グロン]";
			mes "このツルギなら…私の必殺技…";
			mes "2文字斬りを完成することが";
			mes "出来るでしょう！";
			mes "気に入りました!!";
			next;
			mes "[グロン]";
			mes "それじゃ…領収書を。";
			next;
			mes "- 何かを書いている -";
			next;
			mes "[グロン]";
			mes "領収書です…お疲れ様でした！";
			delitem 1119,1;
			getitem 1073,1;
			set CHANGE_BS,14;
			close;
		}
		//fall through
	default:
		mes "[グロン]";
		mes "………。";
		mes "……注文した物はいつ来るのかな。";
		next;
		mes "[グロン]";
		mes "2文字斬りを完成する為には…";
		mes "そのツルギしかないのに… ああ…";
		next;
		mes "[グロン]";
		mes "ああああ……。";
		close;
	case 14:
		mes "[グロン]";
		mes "ありがとうございました。";
		close;
	}
}

//comodo.gat,158,342,4	script	ビスマルク	118,{
hugel.gat,168,183,4	script	ビスマルク	118,{
	switch(CHANGE_BS) {
	case 12:
		if(countitem(1122)) {
			mes "[ビスマルク]";
			mes "ごほごほ……";
			mes "はあ…はあ…。こ…こっちに渡して…";
			next;
			mes "[ビスマルク]";
			mes "私が注文した…物ですか…？";
			mes "違う物なら、私は助からなくなります…";
			next;
			if(select("うっ、これは…私の…","問題ありません。新品です")==1) {
				mes "[ビスマルク]";
				mes "…じ…時間が…早く…";
				mes "ごほ…毒が…ど…毒が…";
				next;
				mes "- 弱っていく -";
				close;
			}
			mes "[ビスマルク]";
			mes "そ…それを…私…に…";
			next;
			mes "[ビスマルク]";
			mes "くう…。";
			mes "グリーンハーブ処理…";
			mes "ちゃんと出来てますよね…";
			next;
			mes "[ビスマルク]";
			mes "手伝って…。一人では動かない…";
			mes "ぐふ…";
			next;
			mes "- 自分の手で自分を傷つけた -";
			next;
			mes "[ビスマルク]";
			mes "うっ…";
			next;
			mes "[ビスマルク]";
			mes "ふぅ… 解毒効果が効いている";
			mes "ようだ…";
			next;
			mes "[ビスマルク]";
			mes "これ…領収書です。助かりました…";
			delitem 1122,1;
			getitem 1073,1;
			set CHANGE_BS,14;
			close;
		}
		//fall through
	default:
		mes "[ビスマルク]";
		mes "……はあ…はあ…。";
		mes "……注文した物はなぜ来ないのか…";
		next;
		mes "[ビスマルク]";
		mes "…。もう限界だ…毒が体全体に…";
		mes "う… ぐふ…";
		next;
		mes "[ビスマルク]";
		mes "早く…解毒剤…解毒…を…";
		close;
	case 14:
		mes "[ビスマルク]";
		mes "ありがとうございました…";
		mes "おかげで助かりました…";
		close;
	}
}

payon.gat,214,79,2	script	テルピツ	59,{
	switch(CHANGE_BS) {
	case 13:
		if(countitem(1713)) {
			mes "[テルピツ]";
			mes "……。おお。 ついに!!!";
			mes "きましたかー!!!";
			mes "見せて!! 早く!!";
			next;
			mes "[テルピツ]";
			mes "これは僕が注文した物ですよね？";
			mes "あなたが使い古した物は要りません。";
			next;
			if(select("うっ、これは…私の…","問題ありません。新品です")==1) {
				mes "[テルピツ]";
				mes "では、まともな物をください！";
				mes "カードが入っていたり、精錬された";
				mes "物は結構です！";
				next;
				mes "- 本当に怒っているようだ -";
				close;
			}
			mes "[テルピツ]";
			mes "良いですね。新品ですね！";
			next;
			mes "[テルピツ]";
			mes "はあはあはあ…。";
			mes "素晴らしい出来です！";
			next;
			mes "[テルピツ]";
			mes "こ…この眼帯袋！ 名品です!!";
			mes "この仕上げ方も最高!!";
			mes "本当に、本当に気に入りました！";
			next;
			mes "[テルピツ]";
			mes "ありがとう、ありがとう…";
			next;
			mes "-何かを書いている-";
			next;
			mes "[テルピツ]";
			mes "これ、領収書です。";
			mes "本当にありがとうございましたー！";
			delitem 1713,1;
			getitem 1073,1;
			set CHANGE_BS,14;
			close;
		}
		//fall through
	default:
		mes "[テルピツ]";
		mes "ああ……。";
		mes "……注文した物はいつになったら";
		mes "完成するのかな…";
		next;
		mes "[テルピツ]";
		mes "僕の眼帯を入れる袋がない…";
		mes "ああ…こんな袋を作ってくれる人は";
		mes "「あの方」しかいないのに…はあ…";
		next;
		mes "[テルピツ]";
		mes "ああ…いつ来るんだろう…。";
		close;
	case 14:
		mes "[テルピツ]";
		mes "見れば見るほど名品……";
		close;
	}
}

//============================================================
// 三次試験（最終試問）
//------------------------------------------------------------
//morocc.gat,95,133,4	script	ブラックスミスギルド員	726,{
ein_in01.gat,24,41,4	script	ブラックスミスギルド員	726,{
	switch(CHANGE_BS) {
	default:
		//mes "[ミットマイヤ]";
		//mes "はぁ… モロクはいつも";
		//mes "あっついわねぇ〜〜";
		//mes "……";
		//next;
		//mes "[ミットマイヤ]";
		//mes "ま、私達ブラックスミスは";
		//mes "いつも火の近くの暑いところで";
		//mes "仕事してるから暑いのには";
		//mes "慣れてるけどネ。";
		//next;
		//mes "[ミットマイヤ]";
		//mes "でも…肌が黒くなるのはいや…";
		//close;
		mes "[ミットマイヤ]";
		mes "はぁ… モロクは暑かったけど";
		mes "ここは煙が辛いわね。";
		mes "……";
		next;
		mes "[ミットマイヤ]";
		mes "でも、私たちブラックスミスは";
		mes "ブラックスミスギルドと";
		mes "自分の名誉をかけて";
		mes "最高の武器製作のためにいつも";
		mes "最善をつくすの。";
		next;
		mes "[ミットマイヤ]";
		mes "そう、忍耐力なら";
		mes "誰にも負けない自身があるわ！";
		close;
	case 16:
		mes "[ミットマイヤ]";
		mes "ようこそ。 ふふ、ブラックスミスに";
		mes "なりたい？";
		mes "いいでしょう…";
		mes "でも、試験はもう一つ";
		mes "残っているわ。";
		next;
		mes "[ミットマイヤ]";
		mes "私からは、鉱石の知識や";
		mes "ブラックスミスのスキルについて";
		mes "色々質問させていただきます。";
		mes "じゃ、はじめましょうか…";
		next;
		if(select("はい","いいえ")==2) {
			mes "[ミットマイヤ]";
			mes "そう、いつも準備万端。";
			mes "ブラックスミス心得の基本ですね。";
			close;
		}
		mes "[ミットマイヤ]";
		mes "よろしい…問題を出します…";
		mes "ある程度間違えたら";
		mes "合格にはなりません。";
		next;
		mes "[ミットマイヤ]";
		mes "問題は全部で5問です。";
		mes "慎重に選んでください。";
		next;
		mes "[ミットマイヤ]";
		mes "…行きます！";
		next;
		break;
	case 17:
		mes "[ミットマイヤ]";
		mes "はい？合格ですよ！";
		next;
		mes "[ミットマイヤ]";
		//mes "ゲフェンに戻ってくださいね。";
		mes "アインブロックに戻ってくださいね。";
		next;
		mes "[ミットマイヤ]";
		mes "鍛冶屋の金槌…忘れないでね！";
		next;
		mes "[ミットマイヤ]";
		mes "そうそう、転職する前に";
		mes "スキルポイントを全部振ることを";
		mes "忘れないでね。";
		close;
	}
	//最終試問ここから
	switch(rand(3)) {
	case 0:
		mes "[ミットマイヤ]";
		mes "1. 次で鋼鉄を落とすモンスターは？";
		next;
		set @menu,select("ゼロム","スチールチョンチョン","スケルワーカー","レクイエム");	//2と3が正解
		if(@menu == 2 || @menu == 3)
			set '@point,'@point+20;
		mes "[ミットマイヤ]";
		mes "2. 次でレッドブラッドから";
		mes "作れる属性石は？";
		next;
		if(select("フレイムハート","ラフウィンド","グレイトネイチャ","ミスティックフローズン")==1)
			set '@point,'@point+20;
		mes "[ミットマイヤ]";
		mes "3. 自分の倉庫の中で";
		mes "一番多い属性原石は？";
		next;
		if(select("ウィンドオブヴェルデュール","レッドブラッド","イエローライブ","クリスタルブルー"))	//どれも正解
			set '@point,'@point+20;
		mes "[ミットマイヤ]";
		mes "4. 一般的に考えて、風属性武器で";
		mes "攻撃すると一番効果の高い属性は？";
		next;
		if(select("火属性","水属性","地属性","風属性")==2)
			set '@point,'@point+20;
		mes "[ミットマイヤ]";
		mes "5. 鋼鉄を作るには鉄が何個必要？";
		next;
		if(select("5個","4個","3個","10個")==1)
			set '@point,'@point+20;
		break;
	case 1:
		mes "[ミットマイヤ]";
		mes "1. 誰かに助けを求められた";
		mes "時はどうしますか？";
		next;
		if(select("何が必要か聞く","しばらく話を聞く","無視する","アイテムをあげてその場から去る")<3)	//１と２が正解
			set '@point,'@point+20;
		mes "[ミットマイヤ]";
		mes "2. ラウドボイス及びチェンジカート";
		mes "を学ぶことができる街はどこか。";
		next;
		if(select("アルデバラン","アルベルタ","モロク","イズルード")==2)
			set '@point,'@point+20;
		mes "[ミットマイヤ]";
		//mes "3. ゲフェン塔を基準として、";
		mes "3. 見晴台を基準として、";
		mes "ブラックスミスギルドの位置は？";
		next;
		if(select("11時方向","5時方向","7時方向","12時方向")==2)
			set '@point,'@point+20;
		mes "[ミットマイヤ]";
		mes "4. ブラックスミスが";
		mes "一番多く居る街は？";
		next;
		//if(select("プロンテラ","モロク","アルベルタ","ゲフェン")==4)
		if(select("プロンテラ","モロク","アルベルタ","アインブロック")==4)
			set '@point,'@point+20;
		mes "[ミットマイヤ]";
		mes "5. 製造に影響を及ぼす";
		mes "ステータスは？";
		next;
		if(select("STR (力)","DEX (器用さ)","AGI (素早さ)","VIT (体力)")==2)
			set '@point,'@point+20;
		break;
	case 2:
		mes "[ミットマイヤ]";
		mes "1. ディスカウントを習得するため、";
		mes "必要な過程は？";
		next;
		if(select("プッシュカート Lv3","アイテム鑑定","メマーナイト Lv10","所持限界量増加 Lv3")==4)
			set '@point,'@point+20;
		mes "[ミットマイヤ]";
		mes "2. ハンマーフォールが対象に";
		mes "ヒットした時あらわれる追加効果は？";
		next;
		if(select("スタン","暗闇","混乱","沈黙")==1)
			set '@point,'@point+20;
		mes "[ミットマイヤ]";
		mes "3. メマーナイト Lv10発動時、";
		mes "消費されるZenyはいくら？";
		next;
		if(select("900 Zeny","1000 Zeny","2000 Zeny","10万 Zeny")==2)
			set '@point,'@point+20;
		mes "[ミットマイヤ]";
		mes "4. ディスカウント Lv10の";
		mes "割引率はいくら？";
		next;
		if(select("21 %","22 %","23 %","24 %")==4)
			set '@point,'@point+20;
		mes "[ミットマイヤ]";
		mes "5. オーバーチャージ Lv10の時に";
		mes "何%まで高く売れるか。";
		next;
		if(select("21 %","22 %","23 %","24 %")==4)
			set '@point,'@point+20;
	}
	mes "[ミットマイヤ]";
	mes "お疲れ様でした…";
	next;
	mes "[ミットマイヤ]";
	mes "ふむふむ…点数は " +'@point+ "点！";
	if('@point < 80) {
		mes "残念… もっと勉強してください！";
		next;
		mes "[ミットマイヤ]";
		mes "これでは… 絶対無理です…";
		mes "鍛冶屋になっても怪我しちゃいます。";
		close;
	}
	mes "ふふ… すばらしい…！";
	mes "おめでとう。 合格です！";
	next;
	mes "[ミットマイヤ]";
	mes "でも、これで気を抜いてはだめですよ。";
	mes "ブラックスミスになってからが本当の";
	mes "試練の始まりです。";
	mes "はい、これは合格の証、";
	mes "鍛冶屋の金槌〜";
	getitem 1005,1;
	set CHANGE_BS,17;
	next;
	mes "[ミットマイヤ]";
	//mes "これを持って、ゲフェンの";
	mes "これを持って、アインブロックの";
	mes "ブラックスミスギルドに";
	mes "戻ってください。";
	next;
	mes "[ミットマイヤ]";
	mes "それじゃ、幸運を祈ります!!!";
	close;
}

//============================================================
// 精錬用品販売員
//------------------------------------------------------------
ein_in.gat,38,29,4	script	ポールスパナ	63,{
	if((MaxWeight - Weight) < 2000) {
		mes "-所持アイテムの重量が多いため";
		mes "アイテムを受けとることができません-";
		mes "-所持アイテムを減らしてから、再度";
		mes "話しかけてください-";
		close;
	}
	mes "[ポールスパナ]";
	mes "よくきたな。";
	mes "ここは精錬に関わる";
	mes "全てのアイテムを扱っている。";
	mes "何が欲しいのか言ってみな。";
	next;
	switch(select("金敷の購入","精錬品の購入","金属の購入","原石の精製","やめる")) {
	case 1:
		mes "[ポールスパナ]";
		mes "金敷は精錬の基本アイテムだ。";
		mes "思い切って良いやつを";
		mes "選んでみたらどうだ？";
		next;
		switch(select("金敷-30000Zeny","オリデオコンの金敷-120000Zeny","黄金の金敷-300000Zeny","もっと堅い金敷","取り引きをやめる")) {
		case 1:
			set '@itemid,986;
			set '@price,30000;
			break;
		case 2:
			set '@itemid,987;
			set '@price,120000;
			break;
		case 3:
			set '@itemid,988;
			set '@price,300000;
			break;
		case 4:
			mes "[ポールスパナ]";
			mes "黄金の金敷より堅いのはないな。";
			mes "これ以上堅い金属となると";
			mes "他の店にも置いてないだろう。";
			mes "……伝説の金敷製作者である";
			mes "「リンゲル」なら…………";
			close;
		case 5:
			mes "[ポールスパナ]";
			mes "何か必要になったら";
			mes "またくるといい。";
			close;
		}
		if(Zeny < '@price) {
			mes "[ポールスパナ]";
			mes "金が足りないな。";
			mes "悪いがこれも商売なんでね。";
			close;
		}
		set Zeny,Zeny-'@price;
		getitem '@itemid,1;
		switch(@menu) {
		case 1:
			mes "[ポールスパナ]";
			mes "値段は安いがいいやつだろう。";
			break;
		case 2:
			mes "[ポールスパナ]";
			mes "なかなかいい目をしているな。";
			mes "鍛冶屋としてこの位の金敷は";
			mes "必需品だろうな。";
			break;
		case 3:
			mes "[ポールスパナ]";
			mes "黄金の金敷を選択しただけで";
			mes "お前には立派な鍛冶の心得が";
			mes "あるというのがわかる！";
			mes "この最高の金敷で";
			mes "立派な武器を作りな。";
			close;
		}
		break;
	case 2:
		mes "[ポールスパナ]";
		mes "鉱物を精錬し、";
		mes "武器を製造するには多くの材料がいる。";
		mes "お前に必要なアイテムは";
		mes "全てここにある。";
		mes "好きなやつを選んでみろ。";
		next;
		switch(select("携帯用溶鉱炉-150Zeny","鋼鉄の金槌-1000Zeny","黄金の金槌3000 Zeny","オリデオコンの金槌 - 5000 Zeny","取り引きをやめる")) {
		case 1:
			mes "[ポールスパナ]";
			mes "金属精製にはこいつが必須だ!!";
			next;
			set '@itemid,612;
			set '@price,150;
			break;
		case 2:
			set '@itemid,613;
			set '@price,1000;
			break;
		case 3:
			set '@itemid,614;
			set '@price,3000;
			break;
		case 4:
			set '@itemid,615;
			set '@price,5000;
			break;
		case 5:
			mes "[ポールスパナ]";
			mes "何か必要になったら";
			mes "またくるといい。";
			close;
		}
		mes "[ポールスパナ]";
		mes "さぁ、いくつ欲しいんだ？";
		mes "取り引きを中止したければ";
		mes "「0」と入力するんだ。";
		while(1) {
			next;
			input '@num;
			if('@num < 0 || '@num > 500) {
				mes "[ポールスパナ]";
				mes "500個以下で決めるんだ。";
				continue;
			}
			break;
		}
		if('@num == 0) {
			mes "[ポールスパナ]";
			mes "取り引きを中止した。";
			mes "何か必要になったら";
			mes "またくるといい。";
			close;
		}
		if(Zeny < '@price*'@num) {
			mes "[ポールスパナ]";
			mes "金が足りないな。";
			mes "悪いがこれも商売なんでね。";
			close;
		}
		if(checkweight('@itemid,'@num)==0) {
			mes "[ポールスパナ]";
			mes "そんなに持てないだろ？";
			mes "まずは荷物を整理したらどうだ。";
			close;
		}
		set Zeny,Zeny-'@price*'@num;
		getitem '@itemid,'@num;
		mes "[ポールスパナ]";
		break;
	case 3:
		mes "[ポールスパナ]";
		mes "純度の高い物だけ選んであるぞ。";
		mes "レベル1の武器製錬に使える";
		mes "^007373プラコン^000000 と";
		mes "レベル2の武器製錬に使える";
		mes "^007373エンベルタコン^000000 があるぞ。";
		mes "どの金属を購入するんだ？";
		next;
		if(checkweight(1010,10)==0 || checkweight(1011,10)==0) {
			mes "[ポールスパナ]";
			mes "荷物が多いな。";
			mes "持ち物を整理してから";
			mes "またおいで。";
			close;
		}
		switch(select("プラコン購入","エンベルタコン購入","取り引きをやめる")) {
		case 1:
			set '@itemid,1010;
			set '@price,200;
			break;
		case 2:
			set '@itemid,1011;
			set '@price,1000;
			break;
		case 3:
			mes "[ポールスパナ]";
			mes "何か必要になったら";
			mes "またくるといい。";
			close;
		}
		mes "[ポールスパナ]";
		mes "さぁ、いくつ欲しいんだ？";
		mes "取り引きを中止したければ";
		mes "「0」と入力するんだ。";
		while(1) {
			next;
			input '@num;
			if('@num < 0 || '@num > 500) {
				mes "[ポールスパナ]";
				mes "500個以下で決めるんだ。";
				continue;
			}
			break;
		}
		if('@num == 0) {
			mes "[ポールスパナ]";
			mes "取り引きを中止した。";
			mes "何か必要になったら";
			mes "またくるといい。";
			close;
		}
		if(Zeny < '@price*'@num) {
			mes "[ポールスパナ]";
			mes "金が足りないな。";
			mes "悪いがこれも商売なんでね。";
			close;
		}
		if(checkweight('@itemid,'@num)==0) {
			mes "[ポールスパナ]";
			mes "そんなに持てないだろ？";
			mes "まずは荷物を整理したらどうだ。";
			close;
		}
		set Zeny,Zeny-'@price*'@num;
		getitem '@itemid,'@num;
		mes "[ポールスパナ]";
		break;
	case 4:
		mes "[ポールスパナ]";
		mes "精製できる金属は";
		mes "オリデオコンとエルニウムだ。";
		mes "それぞれ5つの原石を精製して、";
		mes "純度の高い金属を作る。";
		mes "さあ……どの金属にするんだ？";
		next;
		switch(select("オリデオコンを作る","エルニウムを作る","やめる")) {
		case 1:
			set '@itemid,756;
			set '@gain,984;
			break;
		case 2:
			set '@itemid,757;
			set '@gain,985;
			break;
		case 3:
			mes "[ポールスパナ]";
			mes "何か必要になったら";
			mes "またくるといい。";
			close;
		}
		if(countitem('@itemid)<5) {
			mes "[ポールスパナ]";
			mes getitemname('@itemid)+ "が5つなければ、";
			mes getitemname('@gain)+ "は作れないと";
			mes "言わなかったか？";
			close;
		}
		delitem '@itemid,5;
		getitem '@gain,1;
		mes "[ポールスパナ]";
		mes "さあ、" +getitemname('@gain)+ "だ。";
		mes "また必要になったらくるといい。";
		close;
	case 5:
		mes "[ポールスパナ]";
		mes "何か必要になったら";
		mes "またくるといい。";
		close;
	}
	mes "ありがとよ。";
	mes "何か必要になったら";
	mes "またくるといい。";
	close;
}
