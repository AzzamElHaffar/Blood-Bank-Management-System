/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Blood;
import model.Donor;
import model.Employee;
import model.Patient;


/**
 *
 * @author Azzam
 */
public class Controller {
    
    Connection connection;
    Statement statement;
    
    private void connect() throws SQLException {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/blood bank system","root","");
        statement = connection.createStatement();
    }
    
    private void disconnect() throws SQLException{
        statement.close();
        connection.close();
    }
    
    public void addDonor(int D_ID, String D_FName, String D_LName, int D_Age, String D_Gender, String D_Adress, String D_Number) {
        //Insert donor into data base

        String query = "insert into donor values('"
                + D_ID + "','" + D_FName + "','" 
                + D_LName + "','"  + D_Gender + "','" + D_Adress + "','" + D_Number + "','" + D_Age + "');";
        
        try {
            connect();
            statement.executeUpdate(query);
            disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void addPatient(int P_ID, String P_Fname, String P_Lname, String P_Gender, String P_Address, int P_Age, int P_BloodQuantity, String P_Number, String P_BloodType_request) {
        //Insert patient into data base
        String query = "insert into patient values('"
                + P_ID + "','" + P_Fname + "','" 
                + P_Lname + "','" + P_Gender + "','" + P_Address + "','" + P_Age + "','" + P_Number + "','" + P_BloodType_request + "','" + P_BloodQuantity + "');";

        try {
            connect();
            statement.executeUpdate(query);
            disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void addEmployee(int E_ID, String E_FName, String E_LName, String E_Adress, String E_Number, String E_position, int E_Age, int E_Salary, int B_ID) {
        //Insert Employee into data base
        String query = "insert into employee values('"
                + E_FName + "','" 
                + E_LName + "','" + E_Adress + "','" + E_Age + "','" + E_ID + "','" + E_position + "','" + B_ID + "','" + E_Salary + "');";

        try {
            connect();
            statement.executeUpdate(query);
            disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void addDelivers(int P_ID, int H_ID) {
      
        String query = "insert into deliver values('" + P_ID + "','" + H_ID + "');";
        
        try {
            connect();
            statement.executeUpdate(query);
            disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public Employee getMaxSalary() {
        Employee employee = null;
        String query = "select E_FName,E_LName,Max(E_Salary) from employee;";
        
        try {
            connect();
            ResultSet resultSet = statement.executeQuery(query);
            if(resultSet.next()){
                employee = new Employee();
                employee.setE_FName(resultSet.getString("E_Fname"));
                employee.setE_LName(resultSet.getString("E_Lname"));
                employee.setE_Salary(resultSet.getInt("Max(E_Salary)"));
            }
            disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return employee;
    }
    
    public ArrayList getSameBloodType() {
       ArrayList sameblood = new ArrayList<>();
       String query = "select D_ID,Blood_Type,P_Fname,P_Lname,P_BloodType_Request from blood,patient where Blood_Type = P_bloodtype_request;";
       
       try {
            connect();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                sameblood.add(resultSet.getInt("D_ID") + "\t" + resultSet.getString("Blood_Type") + "\t" + resultSet.getString("P_Fname") + "\t" + resultSet.getString("P_Lname") + "\t" + resultSet.getString("P_BloodType_Request"));   
            }        
            disconnect();

        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sameblood;
   }
    
    public ArrayList<Integer> getAllP_ID() {

        ArrayList<Integer> allP_ID = new ArrayList<>();
        String query = "select * from patient;";

        try {
            connect();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                allP_ID.add(resultSet.getInt("P_ID"));
            }        
            disconnect();

        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return allP_ID;
    }
    
    public ArrayList<Integer> getAllE_ID() {

        ArrayList<Integer> allE_ID = new ArrayList<>();
        String query = "select * from employee;";

        try {
            connect();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                allE_ID.add(resultSet.getInt("E_ID"));
            }        
            disconnect();

        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return allE_ID;
    }
    
    public Patient getPatientByP_ID(int P_ID) {
        Patient patient = null;
        String query = "Select * from patient where P_ID ="+P_ID;
        
        try {
            connect();
            ResultSet resultSet = statement.executeQuery(query);
            if(resultSet.next()){
                patient = new Patient();
                patient.setP_ID(resultSet.getInt("P_ID"));
                patient.setP_Fname(resultSet.getString("P_Fname"));
                patient.setP_Lname(resultSet.getString("P_Lname"));
                patient.setP_Gender(resultSet.getString("P_Gender"));
                patient.setP_Adress(resultSet.getString("P_Address"));
                patient.setP_Age(resultSet.getInt("P_Age"));
                patient.setP_Number(resultSet.getString("P_Number"));
                patient.setP_BloodType_request(resultSet.getString("P_BloodType_Request"));
                patient.setP_BloodQuantity(resultSet.getInt("P_BloodQuantity"));
            }
            disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return patient;
    }
    
    public void UpdatePatientAdress(int P_ID,String Address) {
        String query = "update patient set P_Address = '" + Address + "'where P_ID = "+P_ID;
        
        try {
            connect();
            statement.executeUpdate(query);
            disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Integer> getAllD_ID() {

        ArrayList<Integer> allD_ID = new ArrayList<>();
        String query = "select * from donor;";

        try {
            connect();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                allD_ID.add(resultSet.getInt("D_ID"));
            }        
            disconnect();

        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return allD_ID;
    }

    public Donor getDonorByD_ID(int D_ID) {
        Donor donor = null;
        String query = "Select * from donor where D_ID=" + D_ID;
        
        try {
            connect();
            ResultSet resultSet = statement.executeQuery(query);
            if(resultSet.next()){
                donor = new Donor();
                donor.setD_ID(resultSet.getInt("D_ID"));
                donor.setD_FName(resultSet.getString("D_Fname"));
                donor.setD_LName(resultSet.getString("D_Lname"));
                
                donor.setD_Gender(resultSet.getString("D_Gender"));
                donor.setD_Adress(resultSet.getString("D_Address"));
                donor.setD_Number(resultSet.getString("D_Number"));
                donor.setD_Age(resultSet.getInt("D_Age"));
            }
            disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return donor;
    }

    public void deleteDonorByD_ID(int D_ID) {
        String query = "delete from donor where D_ID="+D_ID;
        
        try {
            connect();
            statement.executeUpdate(query);
            disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   public Blood getBloodQuantity(String Blood_Type) {
        Blood blood = null;
        String query = "select Blood_Type,sum(Blood_Quantity) from blood where Blood_Type='" + Blood_Type +"';";
        
        try {
            connect();
            ResultSet resultSet = statement.executeQuery(query);
            if(resultSet.next()){
                blood = new Blood();
                blood.setBlood_Type(resultSet.getString("Blood_Type"));
                blood.setBlood_Quantity(resultSet.getInt("sum(Blood_Quantity)"));
            }
            disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return blood;
    }
    
   public ArrayList<Integer> getHospitalCount() {
       ArrayList<Integer> hospitalcount = new ArrayList<>();
       String query = "Select count(*) AS Number_Available From hospital;";
       
       try {
            connect();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                hospitalcount.add(resultSet.getInt("Number_Available"));
            }        
            disconnect();

        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hospitalcount;
   }
   
   public ArrayList getSameBloodTypeOfDonor(String bloodtype) {
       ArrayList sameblood = new ArrayList<>();
       String query = "SELECT D_Fname,D_Lname,Blood_Type FROM `donor` NATURAL JOIN `blood` WHERE Blood_Type = '" + bloodtype + "';";
       
       try {
            connect();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                sameblood.add(resultSet.getString("D_Fname") + "\t" + resultSet.getString("D_Lname") + "\t" + resultSet.getString("Blood_Type"));
            }        
            disconnect();

        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sameblood;
   }
   
   //Select P_Fname from patient WHERE P_ID IN (SELECT P_ID FROM deliver WHERE H_ID IN (SELECT H_ID FROM hospital WHERE H_Name = 'AUB Hospital'));
   
   public ArrayList getPatientInHospital(String h_name) {
       ArrayList hospitalname = new ArrayList<>();
       String query = "Select P_Fname,P_Lname from patient WHERE P_ID IN (SELECT P_ID FROM deliver WHERE H_ID IN (SELECT H_ID FROM hospital WHERE H_Name = '" + h_name + "'));";
       
       try {
            connect();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                hospitalname.add(resultSet.getString("P_Fname") + "\t" + resultSet.getString("P_Lname"));
            }        
            disconnect();

        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hospitalname;
   }
   
   public ArrayList<String> getAllH_Name() {

        ArrayList<String> allH_Name = new ArrayList<>();
        String query = "select * from hospital;";

        try {
            connect();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                allH_Name.add(resultSet.getString("H_Name"));
            }        
            disconnect();

        } catch (SQLException ex) {
            Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return allH_Name;
    }
}
