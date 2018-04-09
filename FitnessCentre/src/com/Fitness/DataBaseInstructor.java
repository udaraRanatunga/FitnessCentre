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
public class DataBaseInstructor{

private Connection con;
private PreparedStatement pst;
private Statement st;
private ResultSet rs;


void insert(Instructor dox){
	try{
                DataBaseConnection dbcon = new DataBaseConnection();
                con=dbcon.getConnection();
		String query="insert into instructor (fname, lname, title, gender, username, password, contact, chart)values(?,?,?,?,?,?,?,?)";


		pst=con.prepareStatement(query);

		pst.setString(1,dox.getFname());
		pst.setString(2,dox.getLname());
		pst.setString(3,dox.getTitle());
		pst.setString(4,dox.getGender());
		pst.setString(5,dox.getUsername());
		pst.setString(6,dox.getPassword());
		pst.setString(7,dox.getContact());
		pst.setString(8,dox.getChart());
		pst.executeUpdate();				
		con.close();
	
	    }
catch(SQLException e){
		System.out.println("My SQL Error in insert method"+"\t"+e.getMessage());
	    }
}

void update(Instructor dox,String tempuser){
	try{
                DataBaseConnection dbcon = new DataBaseConnection();
                con=dbcon.getConnection();
		st=con.createStatement();
		st.executeUpdate("update instructor set fname='"+dox.getFname()+"', lname='"+dox.getLname()+"', title='"+dox.getTitle()+"', gender='"+dox.getGender()+"',username='"+dox.getUsername()+"',password='"+dox.getPassword()+"', contact='"+dox.getContact()+"', chart='"+dox.getChart()+"' where username='"+tempuser+"'");
				
		con.close();
	
	    }
catch(SQLException e){
		System.out.println("SQL Error in update method"+"\t"+e.getMessage());
	    }
}
void delete(String tempuser){

	try{
                DataBaseConnection dbcon = new DataBaseConnection();
                con=dbcon.getConnection();
		st=con.createStatement();
		st.executeUpdate("delete from instructor where username='"+tempuser+"'");
				
		con.close();
	
	    }
catch(SQLException e){
		System.out.println("SQL Error in delete method"+"\t"+e.getMessage());
	    }
}
Instructor search(String tempuser){
		

		Instructor dox=new Instructor();

	try{
                DataBaseConnection dbcon = new DataBaseConnection();
                con=dbcon.getConnection();
		st=con.createStatement();
		rs=st.executeQuery("select *from instructor where username='"+tempuser+"'");

			while(rs.next()){
			dox.setFname(rs.getString(1));
			dox.setLname(rs.getString(2));
			dox.setTitle(rs.getString(3));
			dox.setGender(rs.getString(4));
			dox.setUsername(rs.getString(5));
			dox.setPassword(rs.getString(6));
			dox.setContact(rs.getString(7));
			dox.setChart(rs.getString(8));

			}				
		con.close();

			
	    }
catch(SQLException e){
		System.out.println("SQL Error in search method"+"\t"+e.getMessage());
	    }
	return dox;		
	}

} 
