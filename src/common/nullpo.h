/*
 * Copyright (C) 2002-2020  Auriga
 *
 * This file is part of Auriga.
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street - Fifth Floor, Boston, MA 02110-1301, USA.
 *
 */

#ifndef _NULLPO_H_
#define _NULLPO_H_

#include "utils.h"

#define NULLPO_CHECK 1
		// �S�̂̃X�C�b�`��錾���Ă���w�b�_�������
		// �����Ɉړ����Ă����������

#define NLP_MARK __FILE__, __LINE__, __func__

/*----------------------------------------------------------------------------
 * Macros
 *----------------------------------------------------------------------------
 */
/*======================================
 * Null�`�F�b�N �y�� ���o�͌� return
 *�E�W�J�����if�Ƃ�return�����o��̂�
 *  ��s�P�̂Ŏg���Ă��������B
 *�Enullpo_ret(x = func());
 *  �̂悤�Ȏg�p�@���z�肵�Ă��܂��B
 *--------------------------------------
 * nullpo_ret(t)
 *   �߂�l 0�Œ�
 * [����]
 *  t       �`�F�b�N�Ώ�
 *--------------------------------------
 * nullpo_retv(t)
 *   �߂�l �Ȃ�
 * [����]
 *  t       �`�F�b�N�Ώ�
 *--------------------------------------
 * nullpo_retr(ret, t)
 *   �߂�l �w��
 * [����]
 *  ret     return(ret);
 *  t       �`�F�b�N�Ώ�
 *--------------------------------------
 * nullpo_ret_f(t, fmt, ...)
 *   �ڍ׏��o�͗p
 *   �߂�l 0
 * [����]
 *  t       �`�F�b�N�Ώ�
 *  fmt ... vprintf�ɓn�����
 *    ���l��֌W�ϐ��̏����o���Ȃǂ�
 *--------------------------------------
 * nullpo_retv_f(t, fmt, ...)
 *   �ڍ׏��o�͗p
 *   �߂�l �Ȃ�
 * [����]
 *  t       �`�F�b�N�Ώ�
 *  fmt ... vprintf�ɓn�����
 *    ���l��֌W�ϐ��̏����o���Ȃǂ�
 *--------------------------------------
 * nullpo_retr_f(ret, t, fmt, ...)
 *   �ڍ׏��o�͗p
 *   �߂�l �w��
 * [����]
 *  ret     return(ret);
 *  t       �`�F�b�N�Ώ�
 *  fmt ... vprintf�ɓn�����
 *    ���l��֌W�ϐ��̏����o���Ȃǂ�
 *--------------------------------------
 */

#if NULLPO_CHECK

#define nullpo_ret(t) if (nullpo_chk(NLP_MARK, (void *)(t))) {return(0);}

#define nullpo_retv(t) if (nullpo_chk(NLP_MARK, (void *)(t))) {return;}

#define nullpo_retr(ret, t) if (nullpo_chk(NLP_MARK, (void *)(t))) {return(ret);}


// �ψ����}�N���Ɋւ�������R���p�C��
#if __STDC_VERSION__ >= 199901L
/* C99�ɑΉ� */
#define nullpo_ret_f(t, fmt, ...) if (nullpo_chk_f(NLP_MARK, (void *)(t), (fmt), __VA_ARGS__)) {return(0);}

#define nullpo_retv_f(t, fmt, ...) if (nullpo_chk_f(NLP_MARK, (void *)(t), (fmt), __VA_ARGS__)) {return;}

#define nullpo_retr_f(ret, t, fmt, ...) if (nullpo_chk_f(NLP_MARK, (void *)(t), (fmt), __VA_ARGS__)) {return(ret);}

#elif __GNUC__ >= 2
/* GCC�p */
#define nullpo_ret_f(t, fmt, args...) if (nullpo_chk_f(NLP_MARK, (void *)(t), (fmt), ## args)) {return(0);}

#define nullpo_retv_f(t, fmt, args...) if (nullpo_chk_f(NLP_MARK, (void *)(t), (fmt), ## args)) {return;}

#define nullpo_retr_f(ret, t, fmt, args...) if (nullpo_chk_f(NLP_MARK, (void *)(t), (fmt), ## args)) {return(ret);}

#else

/* ���̑��̏ꍇ�E�E�E orz */

#endif

#else /* NULLPO_CHECK */
/* No Nullpo check */

// if((t)){;}
// �ǂ����@���v�����Ȃ������̂ŁE�E�E����̍�ł��B
// �ꉞ���[�j���O�͏o�Ȃ��͂�

#define nullpo_ret(t) if((t)){;}
#define nullpo_retv(t) if((t)){;}
#define nullpo_retr(ret, t) if((t)){;}

// �ψ����}�N���Ɋւ�������R���p�C��
#if __STDC_VERSION__ >= 199901L
/* C99�ɑΉ� */
#define nullpo_ret_f(t, fmt, ...) if((t)){;}
#define nullpo_retv_f(t, fmt, ...) if((t)){;}
#define nullpo_retr_f(ret, t, fmt, ...) if((t)){;}

#elif __GNUC__ >= 2
/* GCC�p */
#define nullpo_ret_f(t, fmt, args...) if((t)){;}
#define nullpo_retv_f(t, fmt, args...) if((t)){;}
#define nullpo_retr_f(ret, t, fmt, args...) if((t)){;}

#else
/* ���̑��̏ꍇ�E�E�E orz */
#endif

#endif /* NULLPO_CHECK */

/*----------------------------------------------------------------------------
 * Functions
 *----------------------------------------------------------------------------
 */
/*======================================
 * nullpo_chk
 *   Null�`�F�b�N �y�� ���o��
 * [����]
 *  file    __FILE__
 *  line    __LINE__
 *  func    __func__ (�֐���)
 *    �����ɂ� NLP_MARK ���g���Ƃ悢
 *  target  �`�F�b�N�Ώ�
 * [�Ԃ�l]
 *  0 OK
 *  1 NULL
 *--------------------------------------
 */
int nullpo_chk(const char *file, int line, const char *func, const void *target);


/*======================================
 * nullpo_chk_f
 *   Null�`�F�b�N �y�� �ڍׂȏ��o��
 * [����]
 *  file    __FILE__
 *  line    __LINE__
 *  func    __func__ (�֐���)
 *    �����ɂ� NLP_MARK ���g���Ƃ悢
 *  target  �`�F�b�N�Ώ�
 *  fmt ... vprintf�ɓn�����
 *    ���l��֌W�ϐ��̏����o���Ȃǂ�
 * [�Ԃ�l]
 *  0 OK
 *  1 NULL
 *--------------------------------------
 */
#if __STDC_VERSION__ >= 199901L
int nullpo_chk_f(const char *file, int line, const char *func, const void *target, const char *fmt, ...) __attribute__((format(printf,5,6)));
#else
int nullpo_chk_f(const char *file, int line, const char *func, const void *target, const char *fmt, ...);
#endif

/*======================================
 * nullpo_info
 *   nullpo���o��
 * [����]
 *  file    __FILE__
 *  line    __LINE__
 *  func    __func__ (�֐���)
 *    �����ɂ� NLP_MARK ���g���Ƃ悢
 *--------------------------------------
 */
void nullpo_info(const char *file, int line, const char *func);


/*======================================
 * nullpo_info_f
 *   nullpo�ڍ׏��o��
 * [����]
 *  file    __FILE__
 *  line    __LINE__
 *  func    __func__ (�֐���)
 *    �����ɂ� NLP_MARK ���g���Ƃ悢
 *  fmt ... vprintf�ɓn�����
 *    ���l��֌W�ϐ��̏����o���Ȃǂ�
 *--------------------------------------
 */
#if __STDC_VERSION__ >= 199901L
void nullpo_info_f(const char *file, int line, const char *func, const char *fmt, ...) __attribute__((format(printf,4,5)));
#else
void nullpo_info_f(const char *file, int line, const char *func, const char *fmt, ...);
#endif

#endif