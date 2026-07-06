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
public class Donor {
    
    private int D_ID;
    private String D_FName,D_LName;
    private int D_Age;
    private String D_Gender, D_Adress, D_Number; 

    public Donor(int D_ID, String D_FName, String D_LName, int D_Age, String D_Gender, String D_Adress, String D_Number) {
        this.D_ID = D_ID;
        this.D_FName = D_FName;
        this.D_LName = D_LName;
        this.D_Age = D_Age;
        this.D_Gender = D_Gender;
        this.D_Adress = D_Adress;
        this.D_Number = D_Number;
    }
    
    public Donor() {
        
    }

    public int getD_ID() {
        return D_ID;
    }

    public void setD_ID(int D_ID) {
        this.D_ID = D_ID;
    }

    public String getD_FName() {
        return D_FName;
    }

    public void setD_FName(String D_FName) {
        this.D_FName = D_FName;
    }

    public String getD_LName() {
        return D_LName;
    }

    public void setD_LName(String D_LName) {
        this.D_LName = D_LName;
    }

    public int getD_Age() {
        return D_Age;
    }

    public void setD_Age(int D_Age) {
        this.D_Age = D_Age;
    }

    public String getD_Gender() {
        return D_Gender;
    }

    public void setD_Gender(String D_Gender) {
        this.D_Gender = D_Gender;
    }

    public String getD_Adress() {
        return D_Adress;
    }

    public void setD_Adress(String D_Adress) {
        this.D_Adress = D_Adress;
    }

    public String getD_Number() {
        return D_Number;
    }

    public void setD_Number(String D_Number) {
        this.D_Number = D_Number;
    }
    
    @Override
    public String toString() {
        return this.D_ID + "\t" + this.D_FName + "\t" + this.D_LName + "\t" + this.D_Age + "\t" + this.D_Gender + "\t" + this.D_Adress + "\t" + this.D_Number;
    }
    
}
