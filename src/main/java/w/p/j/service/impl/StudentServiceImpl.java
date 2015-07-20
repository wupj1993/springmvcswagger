/*
 * Copyright (c) 2015 - 7 - 20
 * -7 :31:43
 * -一个人的时候你要好好的努力，这样以后配得起相遇那一刻的怦然心动，你若盛开，清风自来。
 * -作者:吴培基
 * -QQ:757671834
 */

package w.p.j.service.impl;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;
import w.p.j.daomain.Student;
import w.p.j.service.ISudentService;

/******************************************************
 * ****** Created by 吴培基 on 2015/7/20.19:31
 * ****************************************************
 */
@Service
public class StudentServiceImpl implements ISudentService {
    private static final Log LOGGER = LogFactory.getLog(StudentServiceImpl.class);
    public boolean addStudent(Student student) {
        LOGGER.debug(String.format("add function"));
        return false;
    }

    public Student getStudentById(int id) {
        LOGGER.debug(String.format("getStudentById function"));
        return new Student(id,"吴培基",23);
    }

    public boolean updateStudent(int id, Student student) {
        LOGGER.debug(String.format("updateStudent function"));
        return true;
    }

    public boolean deleteStudentById(int id) {
        LOGGER.debug(String.format("delete function"));
        return true;
    }
}
