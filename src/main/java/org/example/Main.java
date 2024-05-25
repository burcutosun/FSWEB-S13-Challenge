package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {

        String[] developers = new String[3];
        developers[0] = "John";
        developers[1] = "Emily";
        developers[2] = "Michael";
        Company company = new Company(1, "Example Inc.", 10000.0, developers);


        String[] healthplans = new String[2];
        healthplans[0] = "Dental";
        healthplans[1] = "Vision";
        Employee employee = new Employee(101, "Alice", "alice@example.com", "password123", healthplans);


        Healthplan healthplan = new Healthplan(1, "Standard", Plan.BASIC);


        System.out.println("Company: " + company.toString());
        System.out.println("Employee: " + employee.toString());
        System.out.println("Healthplan: " + healthplan.toString());


        performOperations();
    }

    public static void performOperations() {

        String[] developers = new String[3];
        developers[0] = "Adam";
        developers[1] = "Eve";
        developers[2] = "David";
        Company company = new Company(2, "New Example Inc.", 15000.0, developers);


        String[] healthplans = new String[2];
        healthplans[0] = "Medical";
        healthplans[1] = "Life Insurance";
        Employee employee = new Employee(102, "Bob", "bob@example.com", "pass123", healthplans);


        Healthplan healthplan = new Healthplan(2, "Premium", Plan.PREMIUM);


        System.out.println("Company: " + company.toString());
        System.out.println("Employee: " + employee.toString());
        System.out.println("Healthplan: " + healthplan.toString());
    }
}
