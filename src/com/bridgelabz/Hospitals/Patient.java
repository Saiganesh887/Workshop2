package com.bridgelabz.Hospitals;

import java.lang.invoke.StringConcatException;
import java.util.Arrays;

enum Department {ONCOLOGY,
                    NEUROLOGY ,
                    CARDIOLOGY ,
                    GYNOCOLOGY };
public class Patient {
    String name;
    int age;
    String mobile;
    String city;
    String state;

    String[] department = {"ONCOLOGY", "NEUROLOGY" , "CARDIOLOGY" , "GYNOCOLOGY"}

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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void getDepartment() {
        //return department;
        for(int i = 0; i < department.length; i++){
            System.out.println(department[i]);
        }
    }

    public void setDepartment(String[] department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mobile='" + mobile + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", department=" + Arrays.toString(department) +
                '}';
    }
}
