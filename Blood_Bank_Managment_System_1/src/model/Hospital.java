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
public class Hospital {
    
    private int H_ID;
    private String H_name, H_Adress, H_Number;

    public Hospital(int H_ID, String H_name, String H_Adress, String H_Number) {
        this.H_ID = H_ID;
        this.H_name = H_name;
        this.H_Adress = H_Adress;
        this.H_Number = H_Number;
    }
    
    public Hospital() {
        
    }

    public int getH_ID() {
        return H_ID;
    }

    public void setH_ID(int H_ID) {
        this.H_ID = H_ID;
    }

    public String getH_name() {
        return H_name;
    }

    public void setH_name(String H_name) {
        this.H_name = H_name;
    }

    public String getH_Adress() {
        return H_Adress;
    }

    public void setH_Adress(String H_Adress) {
        this.H_Adress = H_Adress;
    }

    public String getH_Number() {
        return H_Number;
    }

    public void setH_Number(String H_Number) {
        this.H_Number = H_Number;
    }
    
    @Override
    public String toString() {
        return this.H_ID + "\t" + this.H_name + "\t" + this.H_Adress + "\t" + this.H_Number;
    }
    
}
