/*
 * Copyright (c) 2015 - 7 - 21
 * -0 :50:15
 * -一个人的时候你要好好的努力，这样以后配得起相遇那一刻的怦然心动，你若盛开，清风自来。
 * -作者:吴培基
 * -QQ:757671834
 */

package w.p.j.service;

import w.p.j.daomain.Teacher;

/******************************************************
 * ****** Created by 吴培基 on 2015/7/21.12:50
 * ****************************************************
 */
public interface ITeacherService {
    Teacher getTeacherInfoById(int  id);
    Teacher getTeacherInfoByName(String name);
}
