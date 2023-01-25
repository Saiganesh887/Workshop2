package com.bridgelabz.Companies;

import java.util.HashMap;
import java.util.Scanner;

public class CompanyMain {
// Group-3  -> Create multiple Companies
//		    -> Create Employees with details(name, age, phoneNumber,city,state, department)
//		    -> Add multiple employees in each Company
//		    -> Also Maintain a dictionary of Company through a Map(key->companyName , value->Company-Object)
//          ->  Create 3 classes - Company , Employee   and   CompanyMain

   static HashMap<String,Company> companyList = new HashMap<>();
   static Scanner sc = new Scanner(System.in);
   static void createCompany(){
       System.out.println("Enter Company Name: ");
       String companyName = sc.next();
       companyList.put(companyName,new Company(companyName));
   }

   static void addEmployeeDetails(String companyName) {
       System.out.println("Enter Number of Employees: ");
       int num = sc.nextInt();
       for (int i = 0; i < num; i++) {
           companyList.get(companyName).addEmployeeDetails();
       }
   }

    static void companyForEmployee(){
        System.out.println("Name of company that Employee want to join:");
        String companyName = sc.next();
        if(companyList.containsKey(companyName)){
            addEmployeeDetails(companyName);
        }else{
            System.out.println("Please choose the company from list: "+companyList.keySet());
            companyForEmployee();
        }
    }
    public static void main(String[] args) {
        System.out.println("Number of companies to create: ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            createCompany();
        }
        System.out.println("Available Companies List: ");
        System.out.println(companyList.keySet());
        companyForEmployee();
        System.out.println(companyList);
    }
}
