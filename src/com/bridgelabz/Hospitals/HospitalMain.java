package com.bridgelabz.Hospitals;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class HospitalMain {
    static HashMap<String,Hospital> hospitalList = new HashMap<>();
    static Scanner sc = new Scanner(System.in);
    static void createHospitalList(){
        System.out.println("Enter Hospital name to create a hospital list : ");
        String hospitalName = sc.next();
        hospitalList.put(hospitalName, new Hospital(hospitalName));
    }

    static void addPatient(String hospitalName){
        System.out.println("Numbers of patients to join in "+hospitalName+" :" );
        int num = sc.nextInt();
        for(int i = 0;i < num; i++){
            hospitalList.get(hospitalName).addPatient();
        }
    }

    static void hospitalForPatient(){
        System.out.println("Name of hospital that patient want to join:");
        String hospitalName = sc.next();
        if(hospitalList.containsKey(hospitalName)){
            addPatient(hospitalName);
        }else{
            System.out.println("Please choose the hospital from list: "+hospitalList.keySet());
            hospitalForPatient();
        }
    }
    public static void main(String[] args) {
        System.out.println("Number of hospitals you need to create: ");
        int num = sc.nextInt();
        for(int i = 0;i < num; i++){
            createHospitalList();
        }
        System.out.println("Available Hospitals list: ");
        System.out.println(hospitalList.keySet());
        hospitalForPatient();
        System.out.println(hospitalList);
    }
}
