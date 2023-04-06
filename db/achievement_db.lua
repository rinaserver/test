ACH_KILL_MOB	= 1
ACH_USE_ITEM	= 2
ACH_QUEST		= 3
ACH_LEVEL		= 4
ACH_STATUS		= 5
ACH_ACHIEVE		= 6
ACH_ACHIEVE_RANK= 7
ACH_ADVENTURE	= 8
ACH_TAMING		= 9
ACH_PET_FRIEND	= 10
ACH_ADD_FRIEND	= 11
ACH_SPEND_ZENY	= 12
ACH_GET_ZENY	= 13
ACH_JOBCHANGE	= 14

AchievementTBL = 
{
	[500000] = {
		Name = "���b�N���b�W",
		Type = ACH_QUEST,
		Content = {
			[1] = {
				ID = 202040,			--���b�N���b�W
			}
		},
		Reward = {
			Title = 2000
		},
		Score = 1,
	},
	[500001] = {
		Name = "�Z�l�����̔Y�݁`���b�N���b�W�`(1)",
		Type = ACH_QUEST,
		Content = {
			[1] = {
				ID = 1329,			--������̂̃��������
			},
			[2] = {
				ID = 1332,			--�����̕��Q
			},
			[3] = {
				ID = 16079,			--�r��̖���
			}
		},
		Reward = {},
		Score = 1,
	},
	[500002] = {
		Name = "�Z�l�����̔Y�݁`���b�N���b�W�`(2)",
		Type = ACH_QUEST,
		Content = {
			[1] = {
				ID = 12382,			--�H�ނ��Ȃ��I
			},
			[2] = {
				ID = 12411,			--�ٍ��̏��l
			},
			[3] = {
				ID = 12390,			--�����ێ������@����
			},
			[4] = {
				ID = 9461,			--���Z���̗���
			}
		},
		Reward = {},
		Score = 1,
	},
	[500003] = {
		Name = "�Z�l�����̔Y�݁`���b�N���b�W�`(3)",
		Type = ACH_QUEST,
		Content = {
			[1] = {
				ID = 1299,			--�K�X�^�[�A�����M�[
			},
			[2] = {
				ID = 14673,			--�ԉΑ��̏���
			},
			[3] = {
				ID = 12398,			--�����ێ������@�㋉
			},
			[4] = {
				ID = 12404,			--�z�ǐ������
			},
			[5] = {
				ID = 9459,			--�r���p�C�v�|��
			}
		},
		Reward = {},
		Score = 1,
	},
	[500004] = {
		Name = "�J��n�̉��ł���",
		Type = ACH_ACHIEVE,
		Content = {
			[1] = {
				ID = 500001,
			},
			[2] = {
				ID = 500002,
			},
			[3] = {
				ID = 500003,
			}
		},
		Reward = {
			Title = 2001,
			Script = "{ getitem 31141,1; }"
		},
		Score = 1,
	},
	[500005] = {
		Name = "�����c�ގ��`�����`(1)",
		Type = ACH_KILL_MOB,
		Content = {
			[1] = {
				ID = 3736,				--���E���h���C�_�[
				Count = 100
			},
			[2] = {
				ID = 3737,				--�T�C�h���C�_�[
				Count = 100
			},
			[3] = {
				ID = 3738,				--�u���[�h���C�_�[
				Count = 100
			}
		},
		Reward = {
			Title = 2002
		},
		Score = 1,
	},
	[500006] = {
		Name = "�����c�ގ��`�����`(2)",
		Type = ACH_KILL_MOB,
		Content = {
			[1] = {
				ID = 3736,				--���E���h���C�_�[
				Count = 1000
			},
			[2] = {
				ID = 3737,				--�T�C�h���C�_�[
				Count = 1000
			},
			[3] = {
				ID = 3738,				--�u���[�h���C�_�[
				Count = 1000
			}
		},
		Reward = {
			Title = 2003
		},
		Score = 1,
	},
	[500007] = {
		Name = "�����c�ގ��`�����`(3)",
		Type = ACH_KILL_MOB,
		Content = {
			[1] = {
				ID = 3736,				--���E���h���C�_�[
				Count = 10000
			},
			[2] = {
				ID = 3737,				--�T�C�h���C�_�[
				Count = 10000
			},
			[3] = {
				ID = 3738,				--�u���[�h���C�_�[
				Count = 10000
			}
		},
		Reward = {
			Title = 2004
		},
		Score = 1,
	},
	[500008] = {
		Name = "�����c�ގ��`�㋉�`(1)",
		Type = ACH_KILL_MOB,
		Content = {
			[1] = {
				ID = 3747,				--�g�b�v���E���h���C�_�[
				Count = 100
			},
			[2] = {
				ID = 3748,				--�g�b�v�T�C�h���C�_�[
				Count = 100
			},
			[3] = {
				ID = 3749,				--�g�b�v�u���[�h���C�_�[
				Count = 100
			}
		},
		Reward = {
			Title = 2005
		},
		Score = 1,
	},
	[500009] = {
		Name = "�����c�ގ��`�㋉�`(2)",
		Type = ACH_KILL_MOB,
		Content = {
			[1] = {
				ID = 3747,				--�g�b�v���E���h���C�_�[
				Count = 1000
			},
			[2] = {
				ID = 3748,				--�g�b�v�T�C�h���C�_�[
				Count = 1000
			},
			[3] = {
				ID = 3749,				--�g�b�v�u���[�h���C�_�[
				Count = 1000
			}
		},
		Reward = {
			Title = 2006
		},
		Score = 1,
	},
	[500010] = {
		Name = "�����c�ގ��`�㋉�`(3)",
		Type = ACH_KILL_MOB,
		Content = {
			[1] = {
				ID = 3747,				--�g�b�v���E���h���C�_�[
				Count = 10000
			},
			[2] = {
				ID = 3748,				--�g�b�v�T�C�h���C�_�[
				Count = 10000
			},
			[3] = {
				ID = 3749,				--�g�b�v�u���[�h���C�_�[
				Count = 10000
			}
		},
		Reward = {
			Title = 2007
		},
		Score = 1,
	},
	[500011] = {
		Name = "�n���X�̎����ێ�(1)",
		Type = ACH_KILL_MOB,
		Content = {
			[1] = {
				ID = 3787,				--�J�j�o���E�X
				Count = 100
			},
			[2] = {
				ID = 3788,				--�v���Y�}���b�g
				Count = 100
			}
		},
		Reward = {
			Title = 2008
		},
		Score = 1,
	},
	[500012] = {
		Name = "�n���X�̎����ێ�(2)",
		Type = ACH_KILL_MOB,
		Content = {
			[1] = {
				ID = 3787,				--�J�j�o���E�X
				Count = 1000
			},
			[2] = {
				ID = 3788,				--�v���Y�}���b�g
				Count = 1000
			}
		},
		Reward = {
			Title = 2009
		},
		Score = 1,
	},
	[500013] = {
		Name = "�n���X�̎����ێ�(3)",
		Type = ACH_KILL_MOB,
		Content = {
			[1] = {
				ID = 3787,				--�J�j�o���E�X
				Count = 10000
			},
			[2] = {
				ID = 3788,				--�v���Y�}���b�g
				Count = 10000
			}
		},
		Reward = {
			Title = 2010
		},
		Score = 1,
	},
	[500014] = {
		Name = "���b�N���b�W�}�X�^�[",
		Type = ACH_ACHIEVE,
		Content = {
			[1] = {
				ID = 500004				--�J��n�̉��ł���
			},
			[2] = {
				ID = 500007				--�����c�ގ��`�����`(3)
			},
			[3] = {
				ID = 500010				--�����c�ގ��`�㋉�`(3)
			},
			[4] = {
				ID = 500013				--�n���X�̎����ێ�(3)
			}
		},
		Reward = {
			Title = 2011
		},
		Score = 1,
	},
	[500015] = {
		Name = "�p���X�|",
		Type = ACH_ADVENTURE,
		Content = {
			[1] = {
				ID = 1
			}
		},
		Reward = {
			Title = 2012
		},
		Score = 1,
	},

	[500016] = {
		Name = "�V���������߂�",
		Type = ACH_ADVENTURE,
		Content = {
			[1] = {
				ID = 1
			}
		},
		Reward = {
			Title = 2013
		},
		Score = 1,
	},
	[500017] = {
		Name = "嶍������߂�",
		Type = ACH_ADVENTURE,
		Content = {
			[1] = {
				ID = 1
			}
		},
		Reward = {
			Title = 2014
		},
		Score = 1,
	},
	--Missing
	[500020] = {
		Name = "���r�������߂�",
		Type = ACH_ADVENTURE,
		Content = {
			[1] = {
				ID = 1
			}
		},
		Reward = {
			Title = 2017
		},
		Score = 1,
	},
	[500021] = {
		Name = "�R�r�������߂�",
		Type = ACH_ADVENTURE,
		Content = {
			[1] = {
				ID = 1
			}
		},
		Reward = {
			Title = 2018
		},
		Score = 1,
	},
	[500022] = {
		Name = "���������߂�",
		Type = ACH_ADVENTURE,
		Content = {
			[1] = {
				ID = 1
			}
		},
		Reward = {
			Title = 2019
		},
		Score = 1,
	},
	[500023] = {
		Name = "�T�����r�M�i�[",
		Type = ACH_USE_ITEM,
		Content = {
			[1] = {
				ID = 604,				--�Ö؂̎}
				Count = 1
			}
		},
		Reward = {
			Title = 2020
		},
		Score = 1,
	},
	[500024] = {
		Name = "�T�����}�X�^�[",
		Type = ACH_USE_ITEM,
		Content = {
			[1] = {
				ID = 604,				--�Ö؂̎}
				Count = 100
			}
		},
		Reward = {
			Title = 2021
		},
		Score = 1,
	},
	[500025] = {
		Name = "�����������߂�",
		Type = ACH_ADVENTURE,
		Content = {
			[1] = {
				ID = 1
			}
		},
		Reward = {
			Title = 2022
		},
		Score = 1,
	},
	[500026] = {
		Name = "���q�������߂�",
		Type = ACH_ADVENTURE,
		Content = {
			[1] = {
				ID = 1
			}
		},
		Reward = {
			Title = 2023
		},
		Score = 1,
	},
	[500027] = {
		Name = "�I�������߂�",
		Type = ACH_ADVENTURE,
		Content = {
			[1] = {
				ID = 1
			}
		},
		Reward = {
			Title = 2024
		},
		Score = 1,
	},
	[500028] = {
		Name = "�����������߂�",
		Type = ACH_ADVENTURE,
		Content = {
			[1] = {
				ID = 1
			}
		},
		Reward = {
			Title = 2025
		},
		Score = 1,
	},
	[500029] = {
		Name = "�o�q�������߂�",
		Type = ACH_ADVENTURE,
		Content = {
			[1] = {
				ID = 1
			}
		},
		Reward = {
			Title = 2026
		},
		Score = 1,
	},
	[500030] = {
		Name = "�ˎ�������߂�",
		Type = ACH_ADVENTURE,
		Content = {
			[1] = {
				ID = 1
			}
		},
		Reward = {
			Title = 2027
		},
		Score = 1,
	},
	[500031] = {
		Name = "�֌��������߂�",
		Type = ACH_ADVENTURE,
		Content = {
			[1] = {
				ID = 1
			}
		},
		Reward = {
			Title = 2028
		},
		Score = 1,
	},
	[500032] = {
		Name = "���r�������߂�",
		Type = ACH_ADVENTURE,
		Content = {
			[1] = {
				ID = 1
			}
		},
		Reward = {
			Title = 2029
		},
		Score = 1,
	},
	[500033] = {
		Name = "����̐�������",
		Type = ACH_ACHIEVE,
		Content = {
			[1] = {
				ID = 500020
			},
			[2] = {
				ID = 500027
			},
			[3] = {
				ID = 500016
			},
			[4] = {
				ID = 500021
			}
		},
		Reward = {
			Title = 2030
		},
		Score = 1,
	},
	[500034] = {
		Name = "���S���鐯������",
		Type = ACH_ACHIEVE,
		Content = {
			[1] = {
				ID = 500028
			},
			[2] = {
				ID = 500026
			},
			[3] = {
				ID = 500017
			},
			[4] = {
				ID = 500032
			}
		},
		Reward = {
			Title = 2031
		},
		Score = 1,
	},
	[500035] = {
		Name = "���낢����������",
		Type = ACH_ACHIEVE,
		Content = {
			[1] = {
				ID = 500029
			},
			[2] = {
				ID = 500025
			},
			[3] = {
				ID = 500030
			},
			[4] = {
				ID = 500022
			}
		},
		Reward = {
			Title = 2032
		},
		Score = 1,
	},
	[500036] = {
		Name = "The Zodiac",
		Type = ACH_ACHIEVE,
		Content = {
			[1] = {
				ID = 500033
			},
			[2] = {
				ID = 500034
			},
			[3] = {
				ID = 500035
			},
			[4] = {
				ID = 500031
			}
		},
		Reward = {
			Title = 2033
		},
		Score = 1,
	},
	[500037] = {
		Name = "�J�{�`���P�[�L��H�ׂ悤�I",
		Type = ACH_USE_ITEM,
		Content = {
			[1] = {
				ID = 11550,				--�J�{�`���P�[�L
				Count = 100
			}
		},
		Reward = {
			Title = 2034
		},
		Score = 1,
	},
	[500038] = {
		Name = "�X�e�B�b�N�L�����f�B��������!!",
		Type = ACH_USE_ITEM,
		Content = {
			[1] = {
				ID = 530,				--�X�e�B�b�N�L�����f�B
				Count = 10000
			}
		},
		Reward = {
			Title = 2035
		},
		Score = 1,
	},
	[500039] = {
		Name = "���ǂ��x�A�h�[��",
		Type = ACH_PET_FRIEND,
		Content = {
			[1] = {
				ID = 1622,				--�x�A�h�[��
				Count = 900
			}
		},
		Reward = {
			Title = 2036,
			Script = "{ getitem 31826,1; }"
		},
		Score = 1,
	},
	[500040] = {
		Name = "����`���R��H�ׂ悤�I",
		Type = ACH_USE_ITEM,
		Content = {
			[1] = {
				ID = 559,				--����`���R
				Count = 2140
			}
		},
		Reward = {
			Title = 2037
		},
		Score = 1,
	},
};

function AchievementInit()
	for achieveID, achieveInfo in pairs(AchievementTBL) do
		if nil == achieveInfo.Reward.Title then
			achieveInfo.Reward.Title = 0
		end
		if nil == achieveInfo.Reward.Script then
			achieveInfo.Reward.Script = "{}"
		end
		result = InsertAchieveInfo(achieveID, achieveInfo.Name, achieveInfo.Type, achieveInfo.Score, achieveInfo.Reward.Title, achieveInfo.Reward.Script)
		if not result == true then
			return false
		end
		for v, achieveContent in pairs(achieveInfo.Content) do
			if nil == achieveContent.ID then
				achieveContent.ID = 1
			end
			if nil == achieveContent.Count then
				achieveContent.Count = 1
			end
			result = InsertAchieveContent(achieveID, achieveContent.ID, achieveContent.Count)
			if not result == true then
				return false
			end
		end
	end

	InsertAchieveDBEnd()
	return true
end

return AchievementInit()
