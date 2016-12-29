/*
* Copyright (c) 2014 Javaranger.com. All Rights Reserved.
*/
package com.feizi.bean;

import java.io.Serializable;

/**
 * @Desc Person实体JavaBean
 * @Author feizi
 * @Date 2016/12/29 13:54
 * @Package_name com.feizi.bean
 */
public class Person implements Serializable{

    private static final long serialVersionUID = 5924398251724579624L;
    private String name;
    private Integer age;

    public Person() {
        super();
    }

    public Person(String name, Integer age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}
