/*
 * Copyright (c) 2015 / 8 / 9 9 :30 :24
 * BY:wupeiji
 * QQ:757671834
 *
 */

package w.p.j.service;

import w.p.j.daomain.Teacher;

/******************************************************
 * ****** Created by 吴培基 on 2015/7/21.12:50
 * ****************************************************
 */
public interface ITeacherService {
    Teacher getTeacherInfoById(int id);
    Teacher getTeacherInfoByName(String name);
}
