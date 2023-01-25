package com.bridgelabz.Companies;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Company {
    String companyName;
    List<EmployeeDetails> employeeDetailsList = new ArrayList<>();
    public Company(){
    }
    public Company(String companyName){
        this.companyName = companyName;
    }
    void addEmployeeDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name of Employee: ");
        String name = sc.next();
        System.out.println("Enter age of Employee: ");
        String age = sc.next();
        System.out.println("Enter Mobile Number: ");
        String phoneNumber = sc.next();
        System.out.println("Enter city: ");
        String city = sc.next();
        System.out.println("Enter State: ");
        String state = sc.next();
        System.out.println("Enter Department of Employee: ");
        String department = sc.next();
        EmployeeDetails employeeDetails = new EmployeeDetails();
        employeeDetails.setName(name);
        employeeDetails.setAge(age);
        employeeDetails.setPhoneNumber(phoneNumber);
        employeeDetails.setCity(city);
        employeeDetails.setState(state);
        employeeDetails.setDepartment(department);

        employeeDetailsList.add(employeeDetails);
        System.out.println(employeeDetailsList);
    }
}
