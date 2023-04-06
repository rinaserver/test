-- ID,MOB_ID,{Slot,OptID,{OptVal_min[,OptVal_max[,OptVal_plus]]},Rate}

ItemRandoptTBL = 
{
	{--守護のエッセンス (23815)
		ID = 1,
		MOB_ID = 1,
		Option = {
			{1,VAR_ATTPOWER,{20,100,20},10000},
			{2,VAR_ATTMPOWER,{20,100,20},10000},
			{3,VAR_HITSUCCESSVALUE,{10,50,10},5000},{3,VAR_AVOIDSUCCESSVALUE,{10,50,10},5000},
			{4,DEC_SPELL_DELAY_TIME,{2,10,2},3500},{4,DEC_SPELL_CAST_TIME,{2,10,2},3500},{4,VAR_PLUSASPDPERCENT,{2,10,2},3000},
			{5,ATTR_TOLERACE_WATER,15,2500},{5,ATTR_TOLERACE_GROUND,15,2500},{5,ATTR_TOLERACE_FIRE,15,2500},{5,ATTR_TOLERACE_WIND,15,2500},
		},
	},

	{--闘気のエッセンス (100348)
		ID = 2,
		MOB_ID = 1,
		Option = {
			{1,VAR_ATTPOWER,{10,50,10},10000},
			{2,VAR_ATTMPOWER,{10,50,10},10000},
			{3,CLASS_IGNORE_DEF_PERCENT_BOSS,{10,50,10},5000},{3,CLASS_IGNORE_MDEF_PERCENT_BOSS,{10,50,10},5000},
			{4,DEC_SPELL_DELAY_TIME,{4,20,4},5000},{4,VAR_PLUSASPDPERCENT,{4,20,4},5000},
			{5,DEC_SPELL_CAST_TIME,{6,10},10000},
		},
	},

	{--猛気のエッセンス (100349)
		ID = 3,
		MOB_ID = 1,
		Option = {
			{1,VAR_ATTPOWER,{20,100,20},10000},
			{2,VAR_ATTMPOWER,{20,100,20},10000},
			{3,CLASS_IGNORE_DEF_PERCENT_NORMAL,{10,50,10},2500},{3,CLASS_IGNORE_DEF_PERCENT_BOSS,{10,50,10},2500},{3,CLASS_IGNORE_MDEF_PERCENT_NORMAL,{10,50,10},2500},{3,CLASS_IGNORE_MDEF_PERCENT_BOSS,{10,50,10},2500},
			{4,DEC_SPELL_DELAY_TIME,{3,15,3},5000},{4,VAR_PLUSASPDPERCENT,{3,15,3},5000},
			{5,DEC_SP_CONSUMPTION,{12,20,2},10000},
		},
	},

	{--ハロウィンジャック => カボチャヘッド
		ID = 19175,
		MOB_ID = 1722,
		Option = {{1,CLASS_DAMAGE_BOSS_TARGET,{7,35},5000},{1,CLASS_MDAMAGE_BOSS,{1,13},5000},{2,DEC_SPELL_CAST_TIME,{1,10},10000},},
	},
};

function ItemRandoptInit()
	for k, v in pairs(ItemRandoptTBL) do
		result = InsertRandopt(v.ID,v.MOB_ID,v.Option)
		if not result == true then
			return false
		end
	end

	return true;
end

return ItemRandoptInit()
