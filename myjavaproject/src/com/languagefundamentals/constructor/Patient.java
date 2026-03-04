package com.languagefundamentals.constructor;

public class Patient {
    String patientName;
    String patientId;
    String disease;
    int age;

    Patient(String patientName, String patientId, String disease, int age) {
        System.out.println("Patient Constructor called!");
        this.patientName = patientName;
        this.patientId = patientId;
        this.disease = disease;
        this.age = age;
    }

    

    public static void main(String[] args) {
        Patient p1 = new Patient("Sneha", "PAT001", "Fever", 35);
        p1.patientInfo();
    }
    void patientInfo() {
        System.out.println("Patient Name : " + patientName);
        System.out.println("Patient ID   : " + patientId);
        System.out.println("Disease      : " + disease);
        System.out.println("Age          : " + age);
    }
}
