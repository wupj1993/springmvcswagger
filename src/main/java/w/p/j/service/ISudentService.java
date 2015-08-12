/*
 * Copyright (c) 2015 / 8 / 9 9 :30 :24
 * BY:wupeiji
 * QQ:757671834
 *
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
    public boolean updateStudent(int id, Student student);
    boolean deleteStudentById(int id);
}
