package com.qf.pojo;

public class TabUser {

    private Integer id;
    private String name;
    private Integer age;
    private TabUserInfo tabUserInfo;

    public TabUserInfo getTabUserInfo() {
        return tabUserInfo;
    }

    public void setTabUserInfo(TabUserInfo tabUserInfo) {
        this.tabUserInfo = tabUserInfo;
    }

    public TabUser() {
    }

    public TabUser(Integer id, String name, Integer age, TabUserInfo tabUserInfo) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.tabUserInfo = tabUserInfo;
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

    @Override
    public String toString() {
        return "TabUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", tabUserInfo=" + tabUserInfo +
                '}';
    }
}
