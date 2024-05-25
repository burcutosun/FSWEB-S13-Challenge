package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthplans;

    public Employee(int id,String fullName,String email,String password,String[] healthplans){
        this.id=id;
        this.fullName=fullName;
        this.email=email;
        this.password=password;
        this.healthplans=healthplans;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String[] getHealthplans() {
        return healthplans;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setHealthplans(String[] healthplans) {
        this.healthplans = healthplans;
    }

    public String toString(){
        return "Employee{id:"+id+", fullName:"+fullName+", email:"+email+", password:"+password+", healthplans:"+ Arrays.toString(healthplans)+"}";
    }

    public void addHealthplans(int index,String name){
        if(index>=0 && index< healthplans.length){
            if(healthplans[index]==null){
                healthplans[index]=name;
            }else{
                System.out.println("Index is already in use.");
            }
        }else{
            System.out.println("Array does not have such an index value.");
        }
    }
}
