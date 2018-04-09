/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Fitness;

import java.sql.*;
/**
 *
 * 
 */
public class DataBasePayment{

private Connection con;
private PreparedStatement pst;
private ResultSet rs;


void insert(Payment dox){
	try{
                DataBaseConnection dbcon = new DataBaseConnection();
                con=dbcon.getConnection();
		String query="insert into payment (username,type,amt)values(?,?,?)";

		pst=con.prepareStatement(query);

		pst.setString(1,dox.getUserName());
		pst.setString(2,dox.getPayType());
		pst.setString(3,dox.getPayAmt());
		pst.executeUpdate();				
		con.close();
	
	    }
catch(SQLException e){
		System.out.println("My SQL Error in insert method"+"\t"+e.getMessage());
	    }
}
}
