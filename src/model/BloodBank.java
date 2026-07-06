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
public class BloodBank {
    
    private int B_ID;
    private String B_Name, B_Adress, B_Number;

    public BloodBank(int B_ID, String B_Name, String B_Adress, String B_Number) {
        this.B_ID = B_ID;
        this.B_Name = B_Name;
        this.B_Adress = B_Adress;
        this.B_Number = B_Number;
    }

    public int getB_ID() {
        return B_ID;
    }

    public void setB_ID(int B_ID) {
        this.B_ID = B_ID;
    }

    public String getB_Name() {
        return B_Name;
    }

    public void setB_Name(String B_Name) {
        this.B_Name = B_Name;
    }

    public String getB_Adress() {
        return B_Adress;
    }

    public void setB_Adress(String B_Adress) {
        this.B_Adress = B_Adress;
    }

    public String getB_Number() {
        return B_Number;
    }

    public void setB_Number(String B_Number) {
        this.B_Number = B_Number;
    }
    
    @Override
    public String toString() {
        return this.B_ID + "\t" + this.B_Name + "\t" + this.B_Adress + "\t" + this.B_Number;
    }
    
}
