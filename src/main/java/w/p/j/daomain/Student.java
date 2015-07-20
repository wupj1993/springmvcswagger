/*
 * Copyright (c) 2015 - 7 - 20
 * -7 :26:14
 * -一个人的时候你要好好的努力，这样以后配得起相遇那一刻的怦然心动，你若盛开，清风自来。
 * -作者:吴培基
 * -QQ:757671834
 */

package w.p.j.daomain;

import java.io.Serializable;

/******************************************************
 * ****** Created by 吴培基 on 2015/7/20.19:26
 * ****************************************************
 */
public class Student implements Serializable{
    private int id;

    private String name;

    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
