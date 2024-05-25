package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(int id,String name,double giro,String[] developerNames){
        this.id=id;
        this.name=name;
        if(giro>=0){
            this.giro=giro;
        }else{
            System.out.println("Giro must be positive.");
        }
        this.developerNames=developerNames;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGiro() {
        return giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGiro(double giro) {
        if(giro>=0){
            this.giro=giro;
        }else{
            System.out.println("Giro must be positive.");
        }
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public String toString(){
        return "Company{id:"+id+" name:"+name+" giro:"+giro+" developerNames:"+ Arrays.toString(developerNames)+"}";
    }

    public void addEmployee(int index, String name){
        if(index>=0 && index< developerNames.length){
            if(developerNames[index]==null){
                developerNames[index]=name;
            }else{
                System.out.println("Index is already in use.");
            }
        }else{
            System.out.println("Array does not have such an index value.");
        }
    }
}
