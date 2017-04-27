package com.company;

/**
 * Created by Piotr on 2017-04-27.
 */

class Data {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setInfo(String name, int age) {
        setName(name);
        setAge(age);
    }
}

public class MethodThis {
    public static void main(String[] args) {

        Data data = new Data();

        data.setName("Piotr");
        data.setAge(5);

        System.out.println(data.getName() + " " + data.getAge());


    }
}
