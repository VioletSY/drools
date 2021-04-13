package com.songyan.drools.model;

import lombok.Data;

/**
 * @author songyan
 * @date 2021/4/13 10:30
 * @desc 学生
 **/
@Data
public class Student {

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private int age;

    /**
     * 班级
     */
    private String className;

    /**
     * 构造函数
     * @param name 姓名
     * @param age 年龄
     */
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 方便打印查看属性值
     * @return 学生对象序列化
     */
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", className='" + className + '\'' +
                '}';
    }

}
