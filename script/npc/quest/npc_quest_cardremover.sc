//= Auriga Script ==============================================================
// Ragnarok Online Card Remover NPC Script	by refis
//==============================================================================

izlude.gat,116,129,4	script	ツーニャ#01	555,{
	function PowerOfDHA {
		for(set '@i,0; '@i<20; set '@i,'@i+1){
			if('@i < 10)
				set '@progress1$,'@progress1$+ (DHA_POWER > '@i? "■": "□");
			else
				set '@progress2$,'@progress2$+ (DHA_POWER > '@i? "■": "□");
		}
		mes "DHAパワー:(" +DHA_POWER+ " / 20)";
		mes '@progress1$;
		mes '@progress2$;
	}

	if(@talk == 0 && DHA_POWER == 0) {
		emotion 16;
		mes "[ツーニャ]";
		mes "お腹すいたニャ……";
		mes "冒険者のお役に立ちたいのに";
		mes "力が出ないニャ……";
		next;
		mes "[ツーニャ]";
		mes "でもグルメなネコは";
		mes "カリカリなんか食べないニャ……";
		mes "はぁ……^FF0000特選ネコ缶(マグロ)^000000";
		mes "あれは美味しかったニャ〜。";
		next;
		if(select("声をかける","立ち去る") == 2) {
			emotion 28;
			mes "[ツーニャ]";
			mes "お腹が空き過ぎて";
			mes "野生も目覚めないニャ……";
			close;
		}
		mes "[ツーニャ]";
		mes "はっ、冒険者さんニャ！";
		mes "お役に立つニャ!!";
		next;
		menu "何が出来るの？",-;
		mes "[ツーニャ]";
		mes "武器や防具に装着したカードを分離して";
		mes "お手元に戻すことができるニャ！";
		mes "もちろん、武器や防具はそのまま";
		mes "残るニャ!!";
		next;
		mes "[ツーニャ]";
		mes "ただ、カードを分離するには";
		mes "特別な力……「^FF0000DHAパワー^000000」が";
		mes "必要ニャ。";
		next;
		mes "[ツーニャ]";
		mes "それが豊富に含まれている";
		mes "「^FF0000特選ネコ缶(マグロ)^000000」";
		mes "これをくれれば、お役に立てるニャ！";
		mes "持っていたら食べさせて欲しいニャ。";
		set @talk,1;
		next;
	}
	mes "[ツーニャ]";
	mes "何をするニャ？";
	PowerOfDHA;
	next;
	switch(select("特選ネコ缶(マグロ)をあげる","カード分離","何が出来るの？","立ち去る")) {
	case 1:
		mes "^FF0000‐インフォメーション‐";
		mes "・DHAパワーは最大20まで貯められます。";
		mes "・貯めたDHAパワーは現在ログイン中の";
		mes "　キャラクター専用です。";
		mes "　他のキャラクターで使用する事は";
		mes "　できません。";
		mes "・DHAパワーを使いたいキャラクターで";
		mes "　特選ネコ缶(マグロ)を";
		mes "　与えて下さい。";
		next;
		if(countitem(25308) < 1) {
			mes "[ツーニャ]";
			mes "やったニャ！　くれるのニャ？";
			mes "って持ってないニャ？";
			mes "……い、イジワルするのは";
			mes "やめるのニャ〜〜！";
			close;
		}
		emotion 37;
		mes "[ツーニャ]";
		mes "本当にくれるのニャ？";
		next;
		if(select("いいえ","はい") == 1) {
			emotion 28;
			mes "[ツーニャ]";
			mes "おあずけかニャー！";
			close;
		}
		if(DHA_POWER >= 20) {	// 未調査
			emotion 28;
			mes "[ツーニャ]";
			mes "今はちょっとおなか一杯ニャ";
			mes "DHAパワー満タンニャ〜！";
			close;
		}
		if(countitem(25308) < 1) {
			mes "[ツーニャ]";
			mes "やったニャ！　くれるのニャ？";
			mes "って持ってないニャ？";
			mes "……い、イジワルするのは";
			mes "やめるのニャ〜〜！";
			close;
		}
		delitem 25308,1;
		set DHA_POWER,DHA_POWER + 1;
		emotion 38;
		mes "[ツーニャ]";
		mes "いっただっきミャ〜〜す！";
		mes "おいしいニャ！";
		mes "幸せだニャ〜！";
		next;
		mes "[ツーニャ]";
		mes "DHAパワーが充填されていくニャ！";
		PowerOfDHA;
		next;
		emotion 32;
		mes "[ツーニャ]";
		mes "ご馳走様ニャ。";
		mes "カード分離をするなら";
		mes "いつでも言ってニャ！";
		close;
	case 2:
		mes "[ツーニャ]";
		mes "装備しているアイテムの中で";
		mes "カードを分離したいものを";
		mes "選ぶニャ！";
		next;
		set '@part,select(
				getequipid(1)? "^nItemID^"+getequipid(1): "",
				getequipid(2)? "^nItemID^"+getequipid(2): "",
				getequipid(3)? "^nItemID^"+getequipid(3): "",
				getequipid(4)? "^nItemID^"+getequipid(4): "",
				getequipid(5)? "^nItemID^"+getequipid(5): "",
				getequipid(6)? "^nItemID^"+getequipid(6): "",
				getequipid(7)? "^nItemID^"+getequipid(7): "",
				getequipid(8)? "^nItemID^"+getequipid(8): "",
				getequipid(9)? "^nItemID^"+getequipid(9): "",
				getequipid(10)? "^nItemID^"+getequipid(10): "",
				"やっぱりやめる");
		if('@part == 11) {
			mes "[ツーニャ]";
			mes "また来るニャ。";
			close;
		}
		set '@max,getiteminfo(getequipid('@part),10);
		if('@max == 0) {
			emotion 1;
			mes "[ツーニャ]";
			mes "そのアイテムに";
			mes "スロットは無いニャよ？";
			close;
		}
		set '@slot,0;
		if('@max > 1) {
			set '@slot,select(
				"止める",
				'@max>=1? "スロット1": "",
				'@max>=2? "スロット2": "",
				'@max>=3? "スロット3": "",
				'@max>=4? "スロット4": "")-2;
			if('@slot < 0) {
				mes "[ツーニャ]";
				mes "また来るニャ。";
				close;
			}
		}
		set '@cardid,getequipcardid('@part,'@slot);
		if('@cardid == 0) {
			emotion 1;
			mes "[ツーニャ]";
			mes "そこにカードは無いニャよ？";
			next;
			mes "[ツーニャ]";
			mes "また来るニャ。";
			close;
		}
		set '@cost,1;
		// ボスカード定義
		setarray '@special1,4121,4123,4128,4131,4132,4134,4135,4137,4142,4143,
							4144,4145,4146,4147,4148,4168,4236,4263,4276,4302,
							4305,4318,4324,4330,4342,4352,4357,4359,4361,4363,
							4365,4367,4372,4374,4376,4386,4399,4403,4407,4408,
							4419,4425,4430,4441,4451,4456,4457,4507,4509,4520,
							4525,4526,4527,4528,4529,4534,4556,4560,4561,4562,
							4563,4564,4565,4566,4578,4580,4590,4591,4592,4601,
							4603,4625,4652;
		setarray '@special2,27007,27008,27009,27031,27032,27035,27039,27040,27055,27056,
							27057,27058,27059,27060,27061,27062,27063,27064,27065,27066,
							27067,27081,27087,27088,27089,27092,27104,27105,27113,27127,
							27128,27141,27143,27146,27228,27237,27242,27247,27248,27301,
							27321,27326,27327,27344,27345,27369,27376,27380,31003,31005;
		for(set '@i,0; '@i<getarraysize('@special1); set '@i,'@i+1) {
			if('@cardid == '@special1['@i]) {
				set '@cost,5;
				break;
			}
		}
		for(set '@i,0; '@i<getarraysize('@special2); set '@i,'@i+1) {
			if('@cardid == '@special2['@i]) {
				set '@cost,5;
				break;
			}
		}
		mes "[ツーニャ]";
		mes "そのカードニャら……";
		mes "DHAパワー[^FF0000" +'@cost+ "^000000]で分離できるニャ！";
		mes "やるかニャ？";
		PowerOfDHA;
		next;
		if(select("止める","分離する") == 1) {
			mes "[ツーニャ]";
			mes "また来るニャ。";
			close;
		}
		if(DHA_POWER < '@cost) {
			emotion 17;
			mes "[ツーニャ]";
			mes "DHAパワーが足りないニャ……";
			mes "今のままではカードを分離できないニャ。";
			mes "ごめんなさいだニャ……";
			close;
		}
		emotion 52;
		mes "[ツーニャ]";
		mes "まかせるニャ！";
		next;
		set DHA_POWER,DHA_POWER-'@cost;
		successremovecards '@part,'@slot+1;
		misceffect 567,"";
		mes "[ツーニャ]";
		mes "ふぃ〜";
		mes "いい仕事したニャ！";
		close;
	case 3:
		mes "[ツーニャ]";
		mes "DHAパワーを消費して";
		mes "装備品に装着したカードを";
		mes "分離してあげるニャ！";
		next;
		switch(select("DHAパワー？","装備品？","カード？","立ち去る")) {
		case 1:
			mes "[ツーニャ]";
			mes "お魚の栄養がたっぷり詰まった";
			mes "猫の活力源ニャ。";
			mes "ガッチリくっついている";
			mes "カードを分離するのに";
			mes "欠かせないパワーニャ。";
			next;
			mes "[ツーニャ]";
			mes "^FF0000特選ネコ缶(マグロ)^0000001個で";
			mes "^0000FFDHAパワー^000000が[1]溜まるニャ！";
			mes "そして、溜まった^0000FFDHAパワー^000000を";
			mes "消費して、カードを分離するニャ！";
			next;
			mes "^FF0000‐インフォメーション‐";
			mes "・DHAパワーは最大20まで貯められます。";
			mes "・貯めたDHAパワーは現在ログイン中の";
			mes "　キャラクター専用です。";
			mes "　他のキャラクターで使用する事は";
			mes "　できません。";
			mes "・DHAパワーを使いたいキャラクターで";
			mes "　特選ネコ缶(マグロ)を";
			mes "　与えて下さい。";
			close;
		case 2:
			mes "[ツーニャ]";
			mes "今、装備している装備品で";
			mes "カードが装着してある装備品なら";
			mes "武器でも防具でもアクセサリーでも";
			mes "OKニャ！";
			next;
			mes "[ツーニャ]";
			mes "分離したカードと一緒に、";
			mes "カードを分離した装備品は";
			mes "傷一つ付けずにお返しするニャよ！";
			mes "ただ……取り扱えない装備品も";
			mes "あるニャ………";
			next;
			mes "^FF0000‐インフォメーション‐";
			mes "・ツーニャに話しかけた時に";
			mes "　装備している装備品が";
			mes "　対象となります。";
			mes "・スロットの表記がない装備品は";
			mes "　対象外となります。";
			mes "・装備品の精錬値、";
			mes "　他のスロットのカード、";
			mes "　エンチャント、ランダムオプションは";
			mes "　元の状態が保持されます。";
			close;
		case 3:
			switch(select("説明を聞く","必要DHAパワーを見る","立ち去る")) {
			case 1:
				mes "[ツーニャ]";
				mes "DHAパワーを消費して";
				mes "今、装備している装備品から";
				mes "カードを分離するニャ！";
				mes "分離したカードは装備品と一緒に";
				mes "お返しするニャよ！";
				next;
				mes "[ツーニャ]";
				mes "ただ……大概のカードは";
				mes "DHAパワー[1]消費で";
				mes "分離できるニャけど";
				mes "中には粘着力が強くて";
				mes "DHAパワーを沢山消費する";
				mes "カードもあるニャ……";
				next;
				mes "^FF0000‐インフォメーション‐";
				mes "・ツーニャに話しかけた時に";
				mes "　装備している装備品に";
				mes "　装着されているカードが";
				mes "　対象となります。";
				mes "・分離できるのは[カード]のみとなり";
				mes "　[エンチャント]は分離できません。";
				mes "　アイテムの詳細の中で";
				mes "　[系列]がカードと記載されている";
				mes "　アイテムは分離の対象となります。";
				mes "・[カード]によって、消費する";
				mes "　DHAパワーの量が異なります。";
				close;
			case 2:
				mes "‐必要DHAパワー‐";
				mes "『消費[^FF00005^000000]リスト』";
				mes "・RSX-0806カード";
				mes "・S・J・アーネストウルフカード";
				mes "・T W Oカード";
				mes "・アークビショップマーガレッタ(MVP)カード";
				mes "・アトロスカード";
				mes "・アムダライスカード";
				mes "・アメンホテプカード";
				mes "・アモンラーカード";
				mes "・アルフォシオ=バジル（MVP）カード";
				mes "・イグニゼム=セニア（MVP）カード";
				mes "・イフリートカード";
				mes "・ヴェスパーカード";
				mes "・ヴェルゼブブカード";
				mes "・ウォーロックカトリーヌ(MVP)カード";
				mes "・エドガカード";
				mes "・エミュール=プラメール（MVP）カード";
				mes "・エレメス=ガイル（MVP）カード";
				mes "・エントヴァイエンカード";
				mes "・オークヒーローカード";
				mes "・オークロードカード";
				mes "・オシリスカード";
				mes "・ガーティー=ウー（MVP）カード";
				mes "・カトリーヌ=ケイロン（MVP）カード";
				mes "・キエル-D-01カード";
				mes "・ギロチンクロスエレメス(MVP)カード";
				mes "・クトルラナックスカード";
				mes "・クラーケンカード";
				mes "・グルームアンダーナイトカード";
				mes "・ジェネティックエミュール(MVP)カード";
				mes "・シャドウチェイサーガーティー(MVP)カード";
				mes "・ストームナイトカード";
				mes "・セイレン=ウィンザー（MVP）カード";
				mes "・セシル=ディモン（MVP）カード";
				mes "・セリア=アルデ（MVP）カード";
				mes "・セリーヌ・キミカード";
				mes "・ソーサラーセリア(MVP)カード";
				mes "・ダークロードカード";
				mes "・タートルジェネラルカード";
				mes "・タイムホルダーカード";
				mes "・タオグンカカード";
				mes "・チェン=リウ（MVP）カード";
				mes "・チャールストン3号カード";
				mes "・データルザウルスカード";
				mes "・ドッペルゲンガーカード";
				mes "・ドラキュラカード";
				mes "・ドレイクカード";
				mes "・トレンティーニ（MVP）カード";
				mes "・ナハトズィーガーカード";
				mes "・ニーズヘッグの影カード";
				mes "・バコナワカード";
				mes "・ハティーカード";
				mes "・バフォメットカード";
				mes "・ハワード=アルトアイゼン（MVP）カード";
				mes "・ビジョウカード";
				mes "・ビョンウンゴカード";
				mes "・ファラオカード";
				mes "・フェンリルカード";
				mes "・フリオニカード";
				mes "・ブワヤカード";
				mes "・ペクソジンカード";
				mes "・マーガレッタ=ソリン（MVP）カード";
				mes "・マヤーカード";
				mes "・ミストレスカード";
				mes "・ミンストレルアルフォシオ(MVP)カード";
				mes "・メカニックハワード(MVP)カード";
				mes "・ランデル=ロレンス（MVP）カード";
				mes "・ランドグリスカード";
				mes "・ルーンナイトセイレン(MVP)カード";
				mes "・レディータニーカード";
				mes "・レヤックカード";
				mes "・レンジャーセシル(MVP)カード";
				mes "・ロイヤルガードランデル(MVP)カード";
				mes "・ロードオブデスカード";
				mes "・ワンダラートレンティーニ(MVP)カード";
				mes "・暗黒のシーラカンスカード";
				mes "・異形のシーラカンスカード";
				mes "・月夜花カード";
				mes "・黄金蟲カード";
				mes "・堕ちた大神官ヒバムカード";
				mes "・怨霊武士カード";
				mes "・狂信者ヒュリエルカード";
				mes "・黒蛇王カード";
				mes "・誘いの魔眼カード";
				mes "・殺戮の魔眼カード";
				mes "・修羅チェン(MVP)カード";
				mes "・将軍デヒョンカード";
				mes "・女王スカラバカード";
				mes "・女帝スカラバカード";
				mes "・頭領タコカード";
				mes "・変異のシーラカンスカード";
				mes "・暴虐のシーラカンスカード";
				mes "・魔眼のアムダライスカード";
				mes "・魔剣士タナトスの思念体カード";
				mes "・無慈悲なジオイアカード";
				mes "・迷宮のドラキュラカード";
				mes "・迷宮のバフォメットカード";
				mes "・亡者の守護者カデスカード";
				mes "・古王グローザカード";
				mes "・深層の古王グローザカード";
				mes "・イーブルカード";
				mes "・CUTIEカード";
				mes "・ヴェノムキメラカード";
				mes "・女王フェイスワームカード";
				mes "・fff・ジターバグカード";
				mes "・サラの幻影カード";
				mes "・ビッグエッグリンカード";
				mes "・迷宮のドッペルゲンガーカード";
				mes "・覚醒クトルラナックスカード";
				mes "・怒りの月夜花カード";
				mes "・怒りのドラキュラカード";
				mes "・ボミカード";
				mes "・不吉なタートルGカード";
				mes "・魔女ジラントカード";
				mes "・古龍ジラントカード";
				mes "・絶望の神モロクカード";
				mes "・モルス・ネクロマンサーカード";
				mes "・死神アンクカード";
				mes "・輝くベアドールカード";
				mes "・古のタオグンカカード";
				mes "・古のウータンガードカード";
				mes "・R48-85-ベスティアカード";
				mes "・ミグエルカード";
				mes "・EL-A17Tカード";
				next;
				mes "『消費[1]リスト』";
				mes "・その他のカード";
				close;
			case 3:
				mes "[ツーニャ]";
				mes "もう行っちゃうのかニャ……";
				mes "ま、また来るといいニャ！";
				close;
			}
		case 4:
			mes "[ツーニャ]";
			mes "もう行っちゃうのかニャ……";
			mes "ま、また来るといいニャ！";
			close;
		}
	case 4:
		mes "[ツーニャ]";
		mes "もう行っちゃうのかニャ……";
		mes "ま、また来るといいニャ！";
		close;
	}
}
