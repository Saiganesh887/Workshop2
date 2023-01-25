package com.bridgelabz.Hospitals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hospital {
        String hospitalName;
        public Hospital(){
        }
        public Hospital(String hospitalName){
            this.hospitalName = hospitalName;
        }
        List<Patient> patientList = new ArrayList<>();
        void addPatient(){
            Patient patient = new Patient();
            System.out.println("Enter patient details: ");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter name of Patient: ");
            String name = sc.next();
            System.out.println("Enter age: ");
            int age = sc.nextInt();
            System.out.println("Enter mobile number: ");
            String mobile = sc.next();
            System.out.println("Enter city: ");
            String city = sc.next();
            System.out.println("Enter state: ");
            String state = sc.next();
            System.out.println("choose department shown below: ");
            patient.getDepartment();
            String department = sc.next();
            patient.setName(name);
            patient.setAge(age);
            patient.setMobile(mobile);
            patient.setCity(city);
            patient.setState(state);
            patient.setDepartment(new String[]{department});

            patientList.add(patient);
        }

    @Override
    public String toString() {
        return "Hospital{" +
                "hospitalName='" + hospitalName + '\'' +
                ", patientList=" + patientList +
                '}';
    }
}

