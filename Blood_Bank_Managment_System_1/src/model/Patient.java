/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Azzam
 */
public class Patient {
    
private int P_ID;
private String P_Fname, P_Lname, P_Gender, P_Adress;
private int P_Age, P_BloodQuantity;
private String P_Number, P_BloodType_request;

    public Patient(int P_ID, String P_Fname, String P_Lname, String P_Gender, String P_Adress, int P_Age, int P_BloodQuantity, String P_Number, String P_BloodType_request) {
        this.P_ID = P_ID;
        this.P_Fname = P_Fname;
        this.P_Lname = P_Lname;
        this.P_Gender = P_Gender;
        this.P_Adress = P_Adress;
        this.P_Age = P_Age;
        this.P_BloodQuantity = P_BloodQuantity;
        this.P_Number = P_Number;
        this.P_BloodType_request = P_BloodType_request;
    }

    public Patient() {
        
    }
    
    public int getP_ID() {
        return P_ID;
    }

    public void setP_ID(int P_ID) {
        this.P_ID = P_ID;
    }

    public String getP_Fname() {
        return P_Fname;
    }

    public void setP_Fname(String P_Fname) {
        this.P_Fname = P_Fname;
    }

    public String getP_Lname() {
        return P_Lname;
    }

    public void setP_Lname(String P_Lname) {
        this.P_Lname = P_Lname;
    }

    public String getP_Gender() {
        return P_Gender;
    }

    public void setP_Gender(String P_Gender) {
        this.P_Gender = P_Gender;
    }

    public String getP_Adress() {
        return P_Adress;
    }

    public void setP_Adress(String P_Adress) {
        this.P_Adress = P_Adress;
    }

    public int getP_Age() {
        return P_Age;
    }

    public void setP_Age(int P_Age) {
        this.P_Age = P_Age;
    }

    public int getP_BloodQuantity() {
        return P_BloodQuantity;
    }

    public void setP_BloodQuantity(int P_BloodQuantity) {
        this.P_BloodQuantity = P_BloodQuantity;
    }

    public String getP_Number() {
        return P_Number;
    }

    public void setP_Number(String P_Number) {
        this.P_Number = P_Number;
    }

    public String getP_BloodType_request() {
        return P_BloodType_request;
    }

    public void setP_BloodType_request(String P_BloodType_request) {
        this.P_BloodType_request = P_BloodType_request;
    }

    @Override
    public String toString() {
        return P_ID + "\t" + P_Fname + "\t" + P_Lname + "\t" + P_Gender + "\t" + P_Adress + "\t" + P_Age + "\t" + P_BloodQuantity + "\t" + P_Number + "\t" + P_BloodType_request;
    }

     

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
}
