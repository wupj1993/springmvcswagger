/*
 * Copyright (c) 2015 - 7 - 21
 * -0 :51:13
 * -一个人的时候你要好好的努力，这样以后配得起相遇那一刻的怦然心动，你若盛开，清风自来。
 * -作者:吴培基
 * -QQ:757671834
 */

package w.p.j.service.impl;

import org.springframework.stereotype.Service;
import w.p.j.daomain.Student;
import w.p.j.daomain.Teacher;
import w.p.j.daomain.Work;
import w.p.j.service.ITeacherService;

import java.util.ArrayList;
import java.util.List;

/******************************************************
 * ****** Created by 吴培基 on 2015/7/21.12:51
 * ****************************************************
 */
@Service
public class TeacherServiceImpl implements ITeacherService {
    public Teacher getTeacherInfoById(int id) {
        if(id!=11){
            Teacher teacher=new Teacher();
            teacher.setAddress("泉州");
            teacher.setId(id);
            teacher.setName("吴培基");
            teacher.setWork(new Work("教师", 1));
            List<Student> lists=new ArrayList<Student>();
            lists.add(new Student(1,"小米",22));
            lists.add(new Student(2,"大米",22));
            lists.add(new Student(3,"小王",23));
            teacher.setStudents(lists);
            return teacher;
        }

      return null;
    }

    public Teacher getTeacherInfoByName(String name) {
        Teacher teacher=new Teacher();
        teacher.setAddress("泉州");
        teacher.setId(101);
        teacher.setName(name);
        teacher.setWork(new Work("教师", 1));
        List<Student> lists=new ArrayList<Student>();
        lists.add(new Student(1,"小米",22));
        lists.add(new Student(2,"大米",22));
        lists.add(new Student(3,"小王",23));
        teacher.setStudents(lists);
        return teacher;
    }
}
