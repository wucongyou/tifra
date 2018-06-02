package com.wucongyou.tifra.ioc.examples.model;

import java.io.Serializable;

/**
 * @author congyou.wu
 * @since 2018-06-02 17:00
 */
public class User implements Serializable {

    private Integer id;

    private String name;

    private Integer age;

    @Override
    public String toString() {
        return "User{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", age=" + age +
            '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
}
