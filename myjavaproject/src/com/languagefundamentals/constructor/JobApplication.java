package com.languagefundamentals.constructor;

public class JobApplication {
    String applicantName;
    String jobRole;
    String company;
    String skills;
    int experienceYears;

    JobApplication(String applicantName, String jobRole, String company, String skills, int experienceYears) {
        System.out.println("JobApplication Constructor called!");
        this.applicantName = applicantName;
        this.jobRole = jobRole;
        this.company = company;
        this.skills = skills;
        this.experienceYears = experienceYears;
    }

   
    public static void main(String[] args) {
        JobApplication ja1 = new JobApplication("Nandhuuuu", "Java Developer", "TCS", "Java, SQL, Spring Boot", 3);
        ja1.applicationInfo();
    }
    void applicationInfo() {
        System.out.println("Applicant Name     : " + applicantName);
        System.out.println("Job Role           : " + jobRole);
        System.out.println("Company            : " + company);
        System.out.println("Skills             : " + skills);
        System.out.println("Experience (Years) : " + experienceYears);
    }

}