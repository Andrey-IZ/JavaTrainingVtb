package com.geekbrains.homework;

@Table(title = "student")
public class Student {
    @Column(title = "", index = 1)
    private String name;
    @Column(title = "last_name")
    private String lastname;
    @Column(title = "group_name")
    private String groupName;
    @Column
    private final int age;
    @Column
    private int score = 0;

    public Student(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    public String getGroupName() {
        return groupName;
    }

    public String getLastname() {
        return lastname;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Integer getAge() {
        return age;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}
