package com.languagefundamentals.constructor;

public class GymMembership {
    String memberName;
    int age;
    String membershipType;
    String trainerName;
    String gymName;
    double monthlyFee;
    String startDate;

    GymMembership() {
        System.out.println("No-arg constructor called");
    }

    GymMembership(String memberName, int age) {
        System.out.println("Parametrized-1 constructor called");
        this.memberName = memberName;
        this.age = age;
    }

    GymMembership(GymMembership gm, String membershipType, String trainerName) {
        System.out.println("Parametrized-2 constructor called");
        this.memberName = gm.memberName;
        this.age = gm.age;
        this.membershipType = membershipType;
        this.trainerName = trainerName;
    }

    GymMembership(GymMembership gm, String gymName, double monthlyFee, String startDate) {
        System.out.println("Parametrized-3 constructor called");
        this.memberName = gm.memberName;
        this.age = gm.age;
        this.membershipType = gm.membershipType;
        this.trainerName = gm.trainerName;
        this.gymName = gymName;
        this.monthlyFee = monthlyFee;
        this.startDate = startDate;
    }

    

    public static void main(String[] args) {
        GymMembership gm1 = new GymMembership("Nandhuu", 21);
        gm1.showDetails();

        GymMembership gm2 = new GymMembership(gm1, "Premium", "Coach Ramesh");
        gm2.showDetails();

        GymMembership gm3 = new GymMembership(gm2, "Gold's Gym Hyderabad", 2500.0, "March 11, 2026");
        gm3.showDetails();
    }
    void showDetails() {
        System.out.println("Member Name     : " + memberName);
        System.out.println("Age             : " + age);
        System.out.println("Membership Type : " + membershipType);
        System.out.println("Trainer Name    : " + trainerName);
        System.out.println("Gym Name        : " + gymName);
        System.out.println("Monthly Fee     : " + monthlyFee);
        System.out.println("Start Date      : " + startDate);
        System.out.println("*************************************");
    }
}
