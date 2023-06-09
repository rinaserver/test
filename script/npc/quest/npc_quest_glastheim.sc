//= Auriga Script ==============================================================
// Ragnarok Online Old Glastheim Quest Script	by refis
//==============================================================================

//============================================================
// エンチャントNPC
//------------------------------------------------------------
glast_01.gat,212,273,4	script	魔法職人	66,{
	mes "[魔法職人]";
	mes "時空ブーツのエンチャントですか？";
	mes "スロットを追加したブーツは";
	mes "エンチャントの対象ではないので";
	mes "注意してください。";
	mes "なお、装備中のブーツのみ";
	mes "エンチャントが可能です。";
	next;
	switch(select("エンチャントの説明を聞く","時空ブーツのエンチャントを依頼する")) {
	case 1:
		mes "[魔法職人]";
		mes "時間旅行をしていると";
		mes "^0000ff凝固された魔力^000000を得ることができます。";
		next;
		mes "[魔法職人]";
		mes "それを持ってくれば";
		mes "あなたが持つ時空ブーツシリーズに";
		mes "エンチャントをいたします。";
		mes "^0000ffただし、基本型のブーツは含まれません^000000";
		mes "6種の強化ブーツのみ適用可能です。";
		next;
		mes "[魔法職人]";
		mes "また、^0000ffスロットを追加済みのブーツは";
		mes "耐久力が弱くなっているため";
		mes "エンチャントすることができません。^000000";
		next;
		mes "[魔法職人]";
		mes "私は4番目のスロットに";
		mes "お望みの能力を付与します。";
		mes "最初は弱い能力ですが、";
		mes "エンチャントを繰り返し、";
		mes "能力を強くすることが可能です。";
		next;
		mes "[魔法職人]";
		mes "4番目のスロットのエンチャントは、";
		mes "最高で4回行うことができます。";
		mes "能力を最高まで強化する頃には";
		mes "必要になる凝固された魔力も";
		mes "多くなりますが、";
		mes "それに見合う強さが得られるはずです。";
		next;
		mes "[魔法職人]";
		mes "さらに、4番目のスロットに";
		mes "4回のエンチャントを行った後には、";
		mes "^FF00003番目のスロットにランダム^000000で能力を";
		mes "付与することができます。";
		mes "もちろん、それなりの交換品は";
		mes "いただきますが。";
		next;
		mes "[魔法職人]";
		mes "なお、エンチャントで使用する";
		mes "凝固された魔力の個数は";
		mes "行うエンチャントの回数によって";
		mes "異なります。";
		next;
		mes "[魔法職人]";
		mes "1回目のエンチャントには^0000ff5^000000個";
		mes "2回目のエンチャントには^0000ff15^000000個";
		mes "3回目のエンチャントには^0000ff45^000000個";
		mes "4回目のエンチャントには^0000ff135^000000個";
		next;
		mes "[魔法職人]";
		mes "そして、3番目のスロットに";
		mes "行うエンチャントには";
		mes "^0000ff10^000000個の凝固された魔力が必要です。";
		next;
		mes "[魔法職人]";
		mes "4番目のスロットのエンチャントは";
		mes "失敗することがあります。";
		mes "^ff0000失敗すると、使用した装備は";
		mes "破壊され、材料として用意した";
		mes "アイテムも失われます。^000000";
		next;
		mes "[魔法職人]";
		mes "またエンチャントの回数を増すごとに";
		mes "^ff0000失敗しやすくなる^000000ので";
		mes "注意してください。";
		mes "^0000ff3番目のスロットのエンチャントは";
		mes "効果はランダムになりますが、";
		mes "必ず成功します。^000000";
		next;
		mes "[魔法職人]";
		mes "ちなみに^ff0000一度行ったエンチャントを";
		mes "初期化することはできません。^000000";
		mes "違う効果のエンチャントを付与したく";
		mes "なった場合は、新たに時空ブーツを";
		mes "用意してください。";
		next;
		mes "[魔法職人]";
		mes "……ふう。";
		mes "立て続けに説明したので";
		mes "喉がカラカラになってしまいました。";
		mes "基本的な説明はこれで終わりです。";
		mes "あとは、実際にやってみれば";
		mes "わかるでしょう。";
		close;
	case 2:
		break;
	}
	set '@itemid,getequipid(6);
	switch('@itemid) {
	case 22000:
		set '@str$,"力";
		break;
	case 22001:
		set '@str$,"知力";
		break;
	case 22002:
		set '@str$,"俊敏";
		break;
	case 22003:
		set '@str$,"体力";
		break;
	case 22004:
		set '@str$,"技巧";
		break;
	case 22005:
		set '@str$,"幸運";
		break;
	case 0:
		mes "[魔法職人]";
		mes "おや……？";
		mes "ブーツを装備していませんね。";
		close;
	default:
		mes "[魔法職人]";
		mes "おや……？";
		mes "私が強化できない装備ですね。";
		mes "時空ブーツシリーズを強化したいなら";
		mes "装備してから話しかけてください。";
		close;
	}
	if(getequipcardid(6,2)!=0){
		mes "[魔法職人]";
		mes "もう限界まで強化済みですね";
		close;
	}
	set '@card4,getequipcardid(6,3);
	set '@refine,getequiprefinerycnt(6);
	setarray '@cost[1],5,15,45,135;
	if('@card4) {
		switch('@card4) {
		case 4701: set '@card,4702; set '@level,2; set '@rate,60; break;		// 闘士2
		case 4702: set '@card,4821; set '@level,3; set '@rate,50; break;		// 闘士3
		case 4821: set '@card,4822; set '@level,4; set '@rate,10; break;		// 闘士4
		case 4721: set '@card,4722; set '@level,2; set '@rate,60; break;		// 名弓2
		case 4722: set '@card,4834; set '@level,3; set '@rate,50; break;		// 名弓3
		case 4834: set '@card,4835; set '@level,4; set '@rate,10; break;		// 名弓4
		case 4711: set '@card,4712; set '@level,2; set '@rate,60; break;		// 魔力2
		case 4712: set '@card,4813; set '@level,3; set '@rate,50; break;		// 魔力3
		case 4813: set '@card,4812; set '@level,4; set '@rate,10; break;		// 魔力4
		case 4741: set '@card,4742; set '@level,2; set '@rate,60; break;		// 体力2
		case 4742: set '@card,4861; set '@level,3; set '@rate,50; break;		// 体力3
		case 4861: set '@card,4862; set '@level,4; set '@rate,10; break;		// 体力4
		case 4731: set '@card,4732; set '@level,2; set '@rate,60; break;		// 速度2
		case 4732: set '@card,4873; set '@level,3; set '@rate,50; break;		// 速度3
		case 4873: set '@card,4881; set '@level,4; set '@rate,10; break;		// 速度4
		case 4752: set '@card,4753; set '@level,2; set '@rate,60; break;		// 幸運2
		case 4753: set '@card,4754; set '@level,3; set '@rate,50; break;		// 幸運3
		case 4754: set '@card,4755; set '@level,4; set '@rate,10; break;		// 幸運4

		case 4822:		// 闘士4
		case 4835:		// 名弓4
		case 4812:		// 魔力4
		case 4862:		// 体力4
		case 4881:		// 速度4
		case 4755:		// 幸運4
			mes "[魔法職人]";
			mes "4番目のスロットは";
			mes "すでに最高まで強化されています。";
			mes "凝固された魔力^0000ff10^000000個で";
			mes "3番目のスロットに能力を";
			mes "付与することができます。";
			next;
			mes "[魔法職人]";
			mes "エンチャントは必ず成功しますが、";
			mes "付与する能力は選べません。";
			mes "好みのエンチャントが付かなくても";
			mes "やり直しはできませんので、";
			mes "ご注意ください。";
			next;
			if(select("やめる","3番目のスロットに効果付与！") == 1) {
				mes "[魔法職人]";
				mes "そうですか。";
				mes "またいらしてください。";
				close;
			}
			mes "[魔法職人]";
			mes "それでは^0000ff" +getitemname('@itemid)+ "^000000の";
			mes "3番目のスロットに";
			mes "エンチャントをします。";
			mes "繰り返しますが、付与する能力は";
			mes "選べませんし、やり直しもできません。";
			mes "よろしいですね？";
			next;
			if(select("やっぱりやめる","エンチャントする") == 1) {
				mes "[魔法職人]";
				mes "そうですか。";
				mes "またいらしてください。";
				close;
			}
			if(countitem(6608) < 10) {
				mes "[魔法職人]";
				mes "ふむ……凝固された魔力が";
				mes "10個不足しています。";
				mes "もっと集めてきてください。";
				close;
			}
			setarray '@card,4875,4876,4877,4878,4879,4880;	// 熊の力、暴走した魔力、光速、鋼鎧、大鷲の眼光、幸運な日
			set '@enchant,'@card[rand(getarraysize('@card))];
			misceffect 101,"";
			mes "[魔法職人]";
			mes "それでは、3番目のスロットに";
			mes "能力を付与します。";
			delitem 6608,10;
			delequip 6;
			getitem2 '@itemid,1,1,'@refine,0,0,0,'@enchant,'@card4;
			close;
		default:
			// 未調査
			close;
		}
		mes "[魔法職人]";
		mes "^0000ff" +getitemname('@itemid)+ "^000000の";
		mes "4番目のスロットのエンチャントを";
		mes "^0000ff" +'@level+ " ^000000段階に強化します。";
		mes "凝固された魔力が^0000ff" +'@cost['@level]+ "^000000個必要です。";
		next;
		mes "[魔法職人]";
		mes "なお、エンチャントは失敗する";
		mes "可能性があります。";
		mes "^ff0000失敗すると、装備は消滅します。";
		mes "また、エンチャントに使用した";
		mes "凝固された魔力も、失われます。^000000";
		next;
		if(select("やめる","強化！") == 1) {
			mes "[魔法職人]";
			mes "そうですか。";
			mes "またいらしてください。";
			close;
		}
		mes "[魔法職人]";
		mes "それでは^0000ff" +getitemname('@itemid)+ "^000000に";
		mes '@level+ "段階目のエンチャントをします。";
		mes "繰り返しますが、^ff0000失敗した場合、";
		mes "使用した装備と凝固された魔力は";
		mes "失われます。";
		mes "よろしいですね？";
		next;
		if(select("やっぱりやめる","エンチャントする") == 1) {
			mes "[魔法職人]";
			mes "そうですか。";
			mes "またいらしてください。";
			close;
		}
		if(countitem(6608) < '@cost['@level]) {
			mes "[魔法職人]";
			mes "ふむ……凝固された魔力が";
			mes '@cost['@level]+ "個不足しています。";
			mes "もっと集めてきてください。";
			close;
		}
		if(rand(100) < '@rate) {
			misceffect 101,"";
			mes "[魔法職人]";
			mes "おめでとうございます。";
			mes "エンチャントの^990000" +'@level+ "回目^000000の強化が";
			mes "成功しました。";
			delitem 6608, '@cost['@level];
			delequip 6;
			getitem2 '@itemid,1,1,'@refine,0,0,0,0,'@card;
			close;
		}
		else {
			mes "[魔法職人]";
			mes "申し訳ありません……。";
			mes "エンチャントに失敗しました。";
			mes "使用した装備と凝固された魔力は";
			mes "失われてしまいました。";
			delitem 6608, '@cost['@level];
			delequip 6;
			close;
		}
	}
	mes "[魔法職人]";
	mes "^0000ff" +getitemname('@itemid)+ "^000000に能力を";
	mes "エンチャントしますか？";
	mes "最初のエンチャントには";
	mes "凝固された魔力^0000ff5^000000個が必要です。";
	next;
	mes "[魔法職人]";
	mes "なお、エンチャントは失敗する";
	mes "可能性があります。";
	mes "^ff0000失敗すると、装備は消滅します。";
	mes "また、エンチャントに使用した";
	mes "凝固された魔力も、失われます。^000000";
	next;
	switch(select("やめる","闘士を付与する","名弓を付与する","魔力を付与する","体力を付与する","速度を付与する","幸運を付与する")) {
	case 1:
		mes "[魔法職人]";
		mes "そうですか。";
		mes "またいらしてください。";
		close;
	case 2:
		set '@card,4701;
		set '@str$,"闘士";
		break;
	case 3:
		set '@card,4721;
		set '@str$,"名弓";
		break;
	case 4:
		set '@card,4711;
		set '@str$,"魔力";
		break;
	case 5:
		set '@card,4741;
		set '@str$,"体力";
		break;
	case 6:
		set '@card,4731;
		set '@str$,"速度";
		break;
	case 7:
		set '@card,4752;
		set '@str$,"幸運";
		break;
	}
	mes "[魔法職人]";
	mes "それでは^0000ff" +getitemname('@itemid)+ "^000000に";
	mes "^0000ff" +'@str$+ "^000000をエンチャントします。";
	mes "繰り返しますが、^ff0000失敗した場合、";
	mes "使用した装備と凝固された魔力は";
	mes "失われます。^000000";
	mes "よろしいですね？";
	next;
	if(select("やっぱりやめる","エンチャントする") == 1) {
		mes "[魔法職人]";
		mes "そうですか。";
		mes "またいらしてください。";
		close;
	}
	if(countitem(6608) < 5) {
		mes "[魔法職人]";
		mes "ふむ……凝固された魔力が";
		mes "5個不足しています。";
		mes "もっと集めてきてください。";
		close;
	}
	if(rand(100) < 70) {
		misceffect 101,"";
		mes "[魔法職人]";
		mes "おめでとうございます。";
		mes "エンチャントの^9900001回目^000000の強化が";
		mes "成功しました。";
		delitem 6608, 5;
		delequip 6;
		getitem2 '@itemid,1,1,'@refine,0,0,0,0,'@card;
		close;
	}
	else {
		mes "[魔法職人]";
		mes "申し訳ありません……。";
		mes "エンチャントに失敗しました。";
		mes "使用した装備と凝固された魔力は";
		mes "失われてしまいました。";
		delitem 6608, 5;
		delequip 6;
		close;
	}
}

//============================================================
// 交換NPC
//------------------------------------------------------------
glast_01.gat,210,273,5	script	フギンの執事	69,{
	mes "[フギンの執事]";
	mes "時間の結晶1個と時空ブーツを";
	mes "交換しております。";
	mes "上位の時空ブーツとの交換は";
	mes "時間の結晶5個と精錬値が7以上の";
	mes "時空ブーツが必要です。";
	mes "交換をお望みですか？";
	next;
	switch(select("やめる","時空ブーツ購入(時間の結晶1個)","上位の時空ブーツと交換(時間の結晶5個)","上位の時空ブーツの性能について")) {
	case 1:
		mes "[フギンの執事]";
		mes "またいつでもいらしてください。";
		close;
	case 2:
		if(countitem(6607) < 1) {
			mes "[フギンの執事]";
			mes "時間の結晶が不足しています。";
			mes "古のグラストヘイムで";
			mes "たまに入手できますので";
			mes "もし手に入れたら";
			mes "私のところにお持ちください。";
			close;
		}
		mes "[フギンの執事]";
		mes "あなたがお持ちの時間の結晶を、";
		mes "時空ブーツと交換いたします。";
		mes "よろしいですか？";
		next;
		if(select("交換する","やっぱりやめる") == 2) {
			mes "[フギンの執事]";
			mes "そうですか。";
			mes "ではまた来てください。";
			close;
		}
		mes "[フギンの執事]";
		mes "時空ブーツをお渡しします。";
		mes "精錬値が7以上の時空ブーツと";
		mes "時間の結晶5個を用意していただければ";
		mes "上位のブーツと交換いたします。";
		delitem 6607,1;
		getitem 2499,1;
		close;
	case 3:
		if(getequipid(6) != 2499) {
			mes "[フギンの執事]";
			mes "装備している靴は";
			mes "時空ブーツではありません。";
			mes "時空ブーツを装備してから";
			mes "話しかけてください。";
			close;
		}
		if(getequiprefinerycnt(6) < 7) {
			mes "[フギンの執事]";
			mes "装備している時空ブーツは";
			mes "精錬値が足りません。";
			mes "交換するためには、";
			mes "^0000ff精錬値が7以上必要^000000です。";
			close;
		}
		if(countitem(6607) < 5) {
			mes "[フギンの執事]";
			mes "時間の結晶が足りません。";
			mes "時間の結晶5個を持ってきてください。";
			close;
		}
		mes "[フギンの執事]";
		mes "^0000ff装備中の時空ブーツ1個と";
		mes "時間の結晶5個^000000を";
		mes "6つのブーツのうち一つと交換できます。";
		next;
		mes "[フギンの執事]";
		mes "なお、時空ブーツの^ff0000精錬値は";
		mes "引き継がれません^000000。";
		mes "また、上位のブーツは";
		mes "^ff00003次職の方のみ装備することが";
		mes "できます^000000。";
		next;
		switch(select("やめる","力の時空ブーツ","知力の時空ブーツ","俊敏の時空ブーツ","体力の時空ブーツ","技巧の時空ブーツ","幸運の時空ブーツ")) {
		case 1:
			mes "[フギンの執事]";
			mes "そうですか。";
			mes "ではまた来てください。";
			close;
		case 2:
			set '@gain,22000;
			set '@str$,"力";
			break;
		case 3:
			set '@gain,22001;
			set '@str$,"知力";
			break;
		case 4:
			set '@gain,22002;
			set '@str$,"俊敏";
			break;
		case 5:
			set '@gain,22003;
			set '@str$,"体力";
			break;
		case 6:
			set '@gain,22004;
			set '@str$,"技巧";
			break;
		case 7:
			set '@gain,22005;
			set '@str$,"幸運";
			break;
		}
		mes "[フギンの執事]";
		mes "^ff0000" +'@str$+ "^000000の時空ブーツに交換しますか？";
		mes "繰り返しますが、";
		mes "精錬値は引き継がれません。";
		mes "3次職の方だけしか";
		mes "装備できませんし";
		mes "返品もできませんよ？";
		next;
		if(select("考え直す","交換する") == 1) {
			mes "[フギンの執事]";
			mes "そうですか。";
			mes "ではまた来てください。";
			close;
		}
		mes "[フギンの執事]";
		mes "ご希望のブーツと交換しました。";
		delequip 6;
		delitem 6607,5;
		getitem '@gain,1;
		close;
	case 4:
		mes "[フギンの執事]";
		mes "どの時空ブーツについて";
		mes "知りたいですか？";
		while(1) {
			next;
			switch(select("力の時空ブーツ","知力の時空ブーツ","俊敏の時空ブーツ","体力の時空ブーツ","技巧の時空ブーツ","幸運の時空ブーツ","やめる")) {
			case 1:
				mes "[フギンの執事]";
				mes "^3131FF力の時空ブーツ[0]^000000、";
				mes "ですね。";
				mes "性能は以下です。";
				next;
				mes "[装備詳細]";
				mes "^3131FFMaxHP + 300 , MaxSP + 30^000000";
				mes "^3131FF精錬値が3上がる度に、追加で^000000";
				mes "^3131FFMaxHP + 100 , MaxSP + 10 , Atk + 7^000000";
				mes "^3131FF純粋なStrが120の時、追加で^000000";
				mes "^3131FFAtk + 50^000000";
				mes "^3131FF^000000";
				next;
				mes "[装備詳細]";
				mes "^3131FFスロット数 : 0^000000";
				mes "^3131FF系列 : 靴^000000";
				mes "^3131FF防御 : 25^000000";
				mes "^3131FF重量 : 60^000000";
				mes "^3131FF要求レベル : 99^000000";
				mes "^3131FF装備 : 3次職^000000";
				break;
			case 2:
				mes "[フギンの執事]";
				mes "^3131FF知力の時空ブーツ[0]^000000、";
				mes "ですね。";
				mes "性能は以下です。";
				next;
				mes "[装備詳細]";
				mes "^3131FFMaxHP + 300 , MaxSP + 30^000000";
				mes "^3131FFMdef + 5^000000";
				mes "^3131FF精錬値が3上がる度に、追加で^000000";
				mes "^3131FFMaxHP + 100 , MaxSP + 10 , Matk + 10^000000";
				mes "^3131FF純粋なIntが120の時、追加で^000000";
				mes "^3131FFMatk + 60^000000";
				next;
				mes "[装備詳細]";
				mes "^3131FFスロット数 : 0^000000";
				mes "^3131FF系列 : 靴^000000";
				mes "^3131FF防御 : 20^000000";
				mes "^3131FF重量 : 60^000000";
				mes "^3131FF要求レベル : 99^000000";
				mes "^3131FF装備 : 3次職^000000";
				break;
			case 3:
				mes "[フギンの執事]";
				mes "^3131FF俊敏の時空ブーツ[0]^000000、";
				mes "ですね。";
				mes "性能は以下です。";
				next;
				mes "[装備詳細]";
				mes "^3131FFMaxHP + 300 , MaxSP + 30^000000";
				mes "^3131FF精錬値が3上がる度に、追加で^000000";
				mes "^3131FFMaxHP + 100 , MaxSP + 10^000000";
				mes "^3131FF攻撃速度 + 3%^000000";
				mes "^3131FF純粋なAgiが120の時、追加で^000000";
				mes "^3131FFAspd + 1^000000";
				next;
				mes "[装備詳細]";
				mes "^3131FFスロット数 : 0^000000";
				mes "^3131FF系列 : 靴^000000";
				mes "^3131FF防御 : 25^000000";
				mes "^3131FF重量 : 60^000000";
				mes "^3131FF要求レベル : 99^000000";
				mes "^3131FF装備 : 3次職^000000";
				break;
			case 4:
				mes "[フギンの執事]";
				mes "^3131FF体力の時空ブーツ[0]^000000、";
				mes "ですね。";
				mes "性能は以下です。";
				next;
				mes "[装備詳細]";
				mes "^3131FFMaxHP + 300 , MaxSP + 30^000000";
				mes "^3131FF精錬値が3上がる度に、追加で^000000";
				mes "^3131FFMaxHP + 300 , MaxSP + 10^000000";
				mes "^3131FF純粋なVitが120の時、追加で^000000";
				mes "^3131FFMaxHP + 8%^000000";
				mes "^3131FF^000000";
				next;
				mes "[装備詳細]";
				mes "^3131FFスロット数 : 0^000000";
				mes "^3131FF系列 : 靴^000000";
				mes "^3131FF防御 : 25^000000";
				mes "^3131FF重量 : 60^000000";
				mes "^3131FF要求レベル : 99^000000";
				mes "^3131FF装備 : 3次職^000000";
				break;
			case 5:
				mes "[フギンの執事]";
				mes "^3131FF技巧の時空ブーツ[0]^000000、";
				mes "ですね。";
				mes "性能は以下です。";
				next;
				mes "[装備詳細]";
				mes "^3131FFMaxHP + 300 , MaxSP + 30^000000";
				mes "^3131FF精錬値が3上がる度に、追加で^000000";
				mes "^3131FFMaxHP + 100 , MaxSP + 10 , Dex + 3^000000";
				mes "^3131FF純粋なDexが120の時、追加で^000000";
				mes "^3131FF遠距離物理攻撃で^000000";
				mes "^3131FF与えるダメージ + 5%^000000";
				next;
				mes "[装備詳細]";
				mes "^3131FFスロット数 : 0^000000";
				mes "^3131FF系列 : 靴^000000";
				mes "^3131FF防御 : 25^000000";
				mes "^3131FF重量 : 60^000000";
				mes "^3131FF要求レベル : 99^000000";
				mes "^3131FF装備 : 3次職^000000";
				break;
			case 6:
				mes "[フギンの執事]";
				mes "^3131FF幸運の時空ブーツ[0]^000000、";
				mes "ですね。";
				mes "性能は以下です。";
				next;
				mes "[装備詳細]";
				mes "^3131FFMaxHP + 300 , MaxSP + 30^000000";
				mes "^3131FFMdef + 5^000000";
				mes "^3131FF精錬値が3上がる度に、追加で^000000";
				mes "^3131FFMaxHP + 100 , MaxSP + 10^000000";
				mes "^3131FFクリティカル攻撃で^000000";
				mes "^3131FF与えるダメージ + 2%^000000";
				next;
				mes "[装備詳細]";
				mes "^3131FF純粋なLukが120の時、追加で^000000";
				mes "^3131FFクリティカル攻撃で^000000";
				mes "^3131FF与えるダメージ + 30%^000000";
				next;
				mes "[装備詳細]";
				mes "^3131FFスロット数 : 0^000000";
				mes "^3131FF系列 : 靴^000000";
				mes "^3131FF防御 : 20^000000";
				mes "^3131FF重量 : 60^000000";
				mes "^3131FF要求レベル : 99^000000";
				mes "^3131FF装備 : 3次職^000000";
				break;
			case 7:
				mes "[フギンの執事]";
				mes "ご入用の際には";
				mes "いつでもいらしてください。";
				close;
			}
			next;
			mes "[フギンの執事]";
			mes "ほかに知りたいことは";
			mes "ありますか？";
			continue;
		}
	}
}

//============================================================
// スロットエンチャントNPC
//------------------------------------------------------------
glast_01.gat,210,270,8	script	細工職人	726,{
	mes "[細工職人]";
	mes "そこの魔法職人は";
	mes "ただ強化すればそれで良いと";
	mes "考えているようだが私は違う。";
	next;
	mes "[細工職人]";
	mes "やはりカードを挿せないようじゃ";
	mes "装備として不足だろ？";
	mes "だから私はスロットを追加する。";
	mes "ただ、失敗することもあるけどな。";
	next;
	mes "[細工職人]";
	mes "^0000ff時間の結晶5個^000000と引き換えに";
	mes "おまえさんが装備している";
	mes "上位の時空ブーツに";
	mes "スロットを追加することができる。";
	mes "ただ^ff0000失敗確率はそれなりに高い。^000000";
	next;
	mes "[細工職人]";
	mes "それから、スロットを追加すると";
	mes "エンチャントや精錬値は";
	mes "全部吹き飛ぶからな。";
	mes "あと、魔法職人の強化はできなくなる。";
	mes "それでも構わないか？";
	next;
	if(select("スロットを追加する","やめる") == 2) {
		mes "[細工職人]";
		mes "まあ気が変わったらまた来な。";
		close;
	}
	switch(getequipid(6)) {
	case 22000: set '@gain,22006; break;
	case 22001: set '@gain,22009; break;
	case 22002: set '@gain,22010; break;
	case 22003: set '@gain,22007; break;
	case 22004: set '@gain,22008; break;
	case 22005: set '@gain,22011; break;
	case 0:
		mes "[細工職人]";
		mes "ブーツを装備していないんじゃないか？";
		mes "装備してから、また来てくれ。";
		close;
	default:
		mes "[細工職人]";
		mes "その装備じゃないよ。";
		mes "^0000ff上位の時空ブーツ^000000を装備してきな。";
		mes "^0000ff効果は付いてるけど";
		mes "スロットがないやつ^000000だ！";
		close;
	}
	mes "[細工職人]";
	mes "確認だが^ff0000エンチャントおよび精錬値は";
	mes "全部吹き飛ぶからな。^000000";
	mes "それでもやるんだろ？";
	next;
	if(select("スロットを追加する","やめる") == 2) {
		mes "[細工職人]";
		mes "まあ気が変わったらまた来な。";
		close;
	}
	mes "[細工職人]";
	mes "しつこいようだが^ff0000スロット付きは";
	mes "魔法職人の強化はできないぜ。^000000";
	mes "それでもやるんだろ？";
	next;
	if(select("スロットを追加する","やめる") == 2) {
		mes "[細工職人]";
		mes "まあ気が変わったらまた来な。";
		close;
	}
	if(countitem(6607) < 5) {
		mes "[細工職人]";
		mes "^0000ff時間の結晶5個^000000を持ってないようだね。";
		mes "ただでは引き受けられないよ。";
		close;
	}
	if(rand(100) < 30) {
		delitem 6607,5;
		delequip 6;
		getitem '@gain,1;
		misceffect 104,"";
		mes "[細工職人]";
		mes "おっしゃ！　成功だ。";
		mes "ほら、受け取りな。";
		close;
	}
	else {
		delitem 6607,5;
		delequip 6;
		misceffect 306,"";
		mes "[細工職人]";
		mes "うおっと！　失敗しちまった。";
		mes "まあ、気を取り直して";
		mes "また来てくれよ。";
		close;
	}
}

//============================================================
// 転送NPC
//------------------------------------------------------------
glast_01.gat,195,273,5	script	フギンの従者#1	123,{
	mes "[フギンの従者]";
	mes "フギン師匠のように、";
	mes "次元と時間の狭間を";
	mes "自由に移動させることは";
	mes "できませんが、";
	mes "僕にも真似事はできるんです。";
	next;
	mes "[フギンの従者]";
	mes "グラストヘイムの闇の力が";
	mes "さらに強くなったら";
	mes "どうなると思います？";
	next;
	if(select("興味があるから続きを","私とは関係ない話だ") == 2) {
		mes "[フギンの従者]";
		mes "そうですか。";
		mes "興味がなければ仕方ないですね。";
		close;
	}
	mes "[フギンの従者]";
	mes "僕はフギン師匠の真似をしているうちに";
	mes "闇の力に染まった";
	mes "グラストヘイムの一部に通じる道を";
	mes "見つけたんです。";
	next;
	mes "[フギンの従者]";
	mes "どうです？";
	mes "力試しに訪れてみますか？";
	next;
	if(select("行く","やめておく") == 2) {
		mes "[フギンの従者]";
		mes "そうですか。";
		mes "興味がなければ仕方ないですね。";
		close;
	}
	mes "[フギンの従者]";
	mes "わかりました。";
	mes "た・だ・し！";
	mes "無料というわけにはいきません。";
	mes "このための実験で";
	mes "随分お金を使ってしまって……。";
	next;
	mes "[フギンの従者]";
	mes "僕が道を開けられるのは";
	mes "この二箇所です。";
	next;
	mes "[フギンの従者]";
	mes "ただし、それぞれの道は";
	mes "決められた職業の方しか";
	mes "通ることができません。";
	mes "それ以外の職業の方は";
	mes "入場できませんので、";
	mes "注意してください。";
	next;
	mes "[フギンの従者]";
	mes "悪夢のグラストヘイムカタコンベは";
	mes "3次職の方と限界を突破した";
	mes "スーパーノービス、";
	mes "影狼、朧、リベリオン、";
	mes "ドラム族は";
	mes "^FF0000入場することができません。^000000";
	next;
	mes "[フギンの従者]";
	mes "悪夢のグラストヘイム古城2Fは";
	mes "3次職の方と限界を突破した";
	mes "スーパーノービス、";
	mes "影狼、朧、リベリオン、";
	mes "BaseLv90以上のドラム族のみが";
	mes "^0000FF入場することができます。^000000";
	next;
	mes "[フギンの従者]";
	mes "どうです？　挑戦しますか？";
	next;
	switch(select("悪夢のグラストヘイムカタコンベ-5,000Zeny","悪夢のグラストヘイム古城2F-10,000Zeny","やめる")) {
	case 1:
		if(Job >= Job_RuneKnight) {
			mes "[フギンの従者]";
			mes "おや、あなたはもう十分強いようですね。";
			mes "申し訳ありませんが";
			mes "あなたは道を通る事ができません。";
			next;
			mes "[フギンの従者]";
			mes "悪夢のグラストヘイムカタコンベは";
			mes "3次職の方と限界を突破した";
			mes "スーパーノービス、";
			mes "影狼、朧、リベリオン、";
			mes "ドラム族は";
			mes "^FF0000入場することができません。^000000";
			close;
		}
		mes "[フギンの従者]";
		mes "では、悪夢のグラストヘイムカタコンベ";
		mes "まで送ります。";
		close2;
		if(Zeny < 5000) {
			mes "[フギンの従者]";
			mes "あれ？　お金が足りませんよ。";
			close;
		}
		set Zeny,Zeny-5000;
		warp "gl_chyard_.gat",148,144;
		end;
	case 2:
		if(Job < Job_RuneKnight || (Job == Job_Summoner && BaseLevel < 90)) {
			mes "[フギンの従者]";
			mes "おや、あなたがこの道を通るのは";
			mes "まだ危険みたいですね。";
			next;
			mes "[フギンの従者]";
			mes "悪夢のグラストヘイム古城2Fは";
			mes "3次職の方と限界を突破した";
			mes "スーパーノービス、";
			mes "影狼、朧、リベリオン、";
			mes "BaseLv90以上のドラム族のみが";
			mes "^0000FF入場することができます。^000000";
			close;
		}
		mes "[フギンの従者]";
		mes "入り口を選んでください。";
		next;
		switch(select("北口","南口")) {
		case 1:
			mes "[フギンの従者]";
			mes "では、悪夢のグラストヘイム古城2F";
			mes "北口まで送ります。";
			close2;
			if(Zeny < 10000) {
				mes "[フギンの従者]";
				mes "あれ？　お金が足りませんよ。";
				close;
			}
			set Zeny,Zeny-10000;
			warp "gl_cas02_.gat",105,190;
			end;
		case 2:
			mes "[フギンの従者]";
			mes "では、悪夢のグラストヘイム古城2F";
			mes "南口まで送ります。";
			close2;
			if(Zeny < 10000) {
				mes "[フギンの従者]";
				mes "あれ？　お金が足りませんよ。";
				close;
			}
			set Zeny,Zeny-10000;
			warp "gl_cas02_.gat",104,31;
			end;
		}
	case 3:
		mes "[フギンの従者]";
		mes "気が変わったら来てください。";
		mes "僕と話す機会は";
		mes "これからも多いでしょうし。";
		mes "……ふふふ。";
		close;
	}
}

gl_chyard_.gat,148,149,3	script	フギンの従者#2	123,{
	mes "[フギンの従者]";
	mes "帰りますか？";
	next;
	if(select("帰る","帰らない") == 2) {
		mes "[フギンの従者]";
		mes "外に出たいときには";
		mes "声をかけてください。";
		close;
	}
	mes "[フギンの従者]";
	mes "では、お送りします。";
	close2;
	warp "glast_01.gat",195,266;
	end;
}

gl_cas02_.gat,104,36,3	script	フギンの従者#3	123,{
	mes "[フギンの従者]";
	mes "帰りますか？";
	next;
	if(select("帰る","帰らない") == 2) {
		mes "[フギンの従者]";
		mes "外に出たいときには";
		mes "声をかけてください。";
		close;
	}
	mes "[フギンの従者]";
	mes "では、お送りします。";
	close2;
	warp "glast_01.gat",195,266;
	end;
}

gl_cas02_.gat,105,193,0	script	nightmare_gl_cas02	45,1,1,{
	mes "‐外に出ますか？‐";
	next;
	if(select("出る","出ない") == 2) {
		close;
	}
	warp "glast_01.gat",195,266;
	end;
}
