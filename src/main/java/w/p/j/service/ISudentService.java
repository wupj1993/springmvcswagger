/*
 * Copyright (c) 2015 - 7 - 20
 * -7 :29:18
 * -一个人的时候你要好好的努力，这样以后配得起相遇那一刻的怦然心动，你若盛开，清风自来。
 * -作者:吴培基
 * -QQ:757671834
 */

package w.p.j.service;

import w.p.j.daomain.Student;

/******************************************************
 * ****** Created by 吴培基 on 2015/7/20.19:29
 * ****************************************************
 */
public interface ISudentService {
    public boolean addStudent(Student student);
    public Student getStudentById(int id);
    public boolean updateStudent(int id,Student student);
    boolean deleteStudentById(int id);
}
