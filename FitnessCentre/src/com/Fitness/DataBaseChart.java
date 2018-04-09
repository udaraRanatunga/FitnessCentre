/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Fitness;

import java.sql.*;
/**
 *
 */
public class DataBaseChart{

private Connection con;
private PreparedStatement pst;
private Statement st;
private ResultSet rs;


void insert(Chart dox){
	try{
                DataBaseConnection dbcon = new DataBaseConnection();
                con=dbcon.getConnection();
		String query="insert into chart (chart_type, qty, day1, day2, day3, day4, day5, day6, day7)values(?,?,?,?,?,?,?,?,?)";


		pst=con.prepareStatement(query);

		pst.setString(1,dox.getChart());
		pst.setString(2,dox.getQty());
		pst.setString(3,dox.getDay1());
		pst.setString(4,dox.getDay2());
		pst.setString(5,dox.getDay3());
		pst.setString(6,dox.getDay4());
		pst.setString(7,dox.getDay5());
		pst.setString(8,dox.getDay6());
		pst.setString(9,dox.getDay7());
		pst.executeUpdate();				
		con.close();
	
	    }
catch(SQLException e){
		System.out.println("My SQL Error in insert method"+"\t"+e.getMessage());
	    }
}
void delete(String tempchart){

	try{
                DataBaseConnection dbcon = new DataBaseConnection();
                con=dbcon.getConnection();
		st=con.createStatement();
		st.executeUpdate("delete from chart where chart_type='"+tempchart+"'");
				
		con.close();
	
	    }
catch(SQLException e){
		System.out.println("SQL Error in delete method"+"\t"+e.getMessage());
	    }
}

} 
