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
public class Employee {
    
    private int E_ID;
    private String E_FName, E_LName, E_Adress, E_Number, E_position;
    private int E_Age, E_Salary, B_ID;

    public Employee(int E_ID, String E_FName, String E_LName, String E_Adress, String E_Number, String E_position, int E_Age, int E_Salary, int B_ID) {
        this.E_ID = E_ID;
        this.E_FName = E_FName;
        this.E_LName = E_LName;
        this.E_Adress = E_Adress;
        this.E_Number = E_Number;
        this.E_position = E_position;
        this.E_Age = E_Age;
        this.E_Salary = E_Salary;
        this.B_ID = B_ID;
    }

    public Employee() {
    }
    
    public int getE_ID() {
        return E_ID;
    }

    public void setE_ID(int E_ID) {
        this.E_ID = E_ID;
    }

    public String getE_FName() {
        return E_FName;
    }

    public void setE_FName(String E_FName) {
        this.E_FName = E_FName;
    }

    public String getE_LName() {
        return E_LName;
    }

    public void setE_LName(String E_LName) {
        this.E_LName = E_LName;
    }

    public String getE_Adress() {
        return E_Adress;
    }

    public void setE_Adress(String E_Adress) {
        this.E_Adress = E_Adress;
    }

    public String getE_Number() {
        return E_Number;
    }

    public void setE_Number(String E_Number) {
        this.E_Number = E_Number;
    }

    public String getE_position() {
        return E_position;
    }

    public void setE_position(String E_position) {
        this.E_position = E_position;
    }

    public int getE_Age() {
        return E_Age;
    }

    public void setE_Age(int E_Age) {
        this.E_Age = E_Age;
    }

    public int getE_Salary() {
        return E_Salary;
    }

    public void setE_Salary(int E_Salary) {
        this.E_Salary = E_Salary;
    }

    public int getB_ID() {
        return B_ID;
    }

    public void setB_ID(int B_ID) {
        this.B_ID = B_ID;
    }
    
    @Override
    public String toString() {
        return this.E_ID + "\t" + this.E_FName + "\t" + this.E_LName + "\t" + this.E_Adress + "\t" + this.E_Number + "\t" + this.E_position + "\t" + this.E_Age + "\t" + this.E_Salary + "\t" + B_ID;
    }
    
}
