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
public class Blood {
    
    private int D_ID,Blood_Quantity,Blood_cost;
    private String Blood_Type,Blood_Draw_Date;

    public Blood(int D_ID, int Blood_Quantity, int Blood_cost, String Blood_Type, String Blood_Draw_Date) {
        this.D_ID = D_ID;
        this.Blood_Quantity = Blood_Quantity;
        this.Blood_cost = Blood_cost;
        this.Blood_Type = Blood_Type;
        this.Blood_Draw_Date = Blood_Draw_Date;
    }
    
    public Blood() {
      
    }

    public int getD_ID() {
        return D_ID;
    }

    public void setD_ID(int D_ID) {
        this.D_ID = D_ID;
    }

    public int getBlood_Quantity() {
        return Blood_Quantity;
    }

    public void setBlood_Quantity(int Blood_Quantity) {
        this.Blood_Quantity = Blood_Quantity;
    }

    public int getBlood_cost() {
        return Blood_cost;
    }

    public void setBlood_cost(int Blood_cost) {
        this.Blood_cost = Blood_cost;
    }

    public String getBlood_Type() {
        return Blood_Type;
    }

    public void setBlood_Type(String Blood_Type) {
        this.Blood_Type = Blood_Type;
    }

    public String getBlood_Draw_Date() {
        return Blood_Draw_Date;
    }

    public void setBlood_Draw_Date(String Blood_Draw_Date) {
        this.Blood_Draw_Date = Blood_Draw_Date;
    }
    
    
    
}
