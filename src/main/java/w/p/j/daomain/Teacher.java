/*
 * Copyright (c) 2015 - 7 - 21
 * -0 :47:11
 * -一个人的时候你要好好的努力，这样以后配得起相遇那一刻的怦然心动，你若盛开，清风自来。
 * -作者:吴培基
 * -QQ:757671834
 */

package w.p.j.daomain;

import java.util.List;

/******************************************************
 * ****** Created by 吴培基 on 2015/7/21.12:47
 * ****************************************************
 */
public class Teacher extends BaseDaomain {
    private List<Student> students;
    private Work work;
    private String name;
    private String address;
    private int id;

    public Teacher(List<Student> students, Work work, String name, String address,int id) {
        this.students = students;
        this.work = work;
        this.name = name;
        this.address = address;
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Teacher() {
    }

    public Work getWork() {
        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Student> getStudents() {

        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
