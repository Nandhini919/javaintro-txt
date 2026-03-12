package com.languagefundamentals.constructor;

public class HospitalPatient {
    String patientName;
    int age;
    String disease;
    String doctorName;
    String hospitalName;
    double treatmentCost;

    HospitalPatient() {
        System.out.println("No-arg constructor called");
    }

    HospitalPatient(String patientName, int age) {
        System.out.println("Parametrized-1 constructor called");
        this.patientName = patientName;
        this.age = age;
    }

    HospitalPatient(HospitalPatient p, String disease, String doctorName) {
        System.out.println("Parametrized-2 constructor called");
        this.patientName = p.patientName;
        this.age = p.age;
        this.disease = disease;
        this.doctorName = doctorName;
    }

    HospitalPatient(HospitalPatient p, String hospitalName, double treatmentCost) {
        System.out.println("Parametrized-3 constructor called");
        this.patientName = p.patientName;
        this.age = p.age;
        this.disease = p.disease;
        this.doctorName = p.doctorName;
        this.hospitalName = hospitalName;
        this.treatmentCost = treatmentCost;
    }


    public static void main(String[] args) {
    	HospitalPatient p1 = new HospitalPatient("Suresh", 45);
        p1.showDetails();

        HospitalPatient p2 = new HospitalPatient(p1, "Diabetes", "Dr. Mehta");
        p2.showDetails();

        HospitalPatient p3 = new HospitalPatient(p2, "Apollo Hospital", 150000.0);
        p3.showDetails();
    }

    void showDetails() {
        System.out.println("Patient Name    : " + patientName);
        System.out.println("Age             : " + age);
        System.out.println("Disease         : " + disease);
        System.out.println("Doctor          : " + doctorName);
        System.out.println("Hospital        : " + hospitalName);
        System.out.println("Treatment Cost  : " + treatmentCost);
        System.out.println("*************************************");
    }
}
