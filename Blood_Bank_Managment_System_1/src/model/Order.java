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
public class Order {
    
    int B_ID, H_ID;

    public Order(int B_ID, int H_ID) {
        this.B_ID = B_ID;
        this.H_ID = H_ID;
    }

    public int getB_ID() {
        return B_ID;
    }

    public void setB_ID(int B_ID) {
        this.B_ID = B_ID;
    }

    public int getH_ID() {
        return H_ID;
    }

    public void setH_ID(int H_ID) {
        this.H_ID = H_ID;
    }
    
    
    
}
