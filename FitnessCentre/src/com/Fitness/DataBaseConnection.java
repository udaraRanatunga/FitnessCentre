/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Fitness;

/**
 *
 *
 * */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Udara Ranatunga
 */
public class DataBaseConnection 
{
    private Connection con;
    
    public Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String dbpath="jdbc:mysql://localhost:3306/gym";
            con=DriverManager.getConnection(dbpath,"root","");
        }
    catch(ClassNotFoundException e){
		System.out.println("My SQL Error class not found"+"\t"+e.getMessage());
	    }
    catch(SQLException e){
		System.out.println("My SQL Error in  method"+"\t"+e.getMessage());
	    }
    catch(Exception e){
                System.out.println("My SQL Error in  method"+"\t"+e.getMessage());
        }
        return con;
    }
}