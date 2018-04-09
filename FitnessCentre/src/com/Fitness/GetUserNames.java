/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Fitness;

import java.sql.*;
import java.util.*;
import java.sql.Connection;
/**
 *
 * 
 */
public class GetUserNames{

private List <String> userNameList;
private Connection con;
	
	

public List getUserNames(){
		

userNameList = new ArrayList<String>();
		
userNameList.add("Select Your UserName");
		
try{
				
                DataBaseConnection dbcon = new DataBaseConnection();
                con=dbcon.getConnection();			
				
Statement st = con.createStatement();
				
ResultSet rs = st.executeQuery("select username from user");
				

while(rs.next()){
														
userNameList.add(rs.getString(1));
				
}
				
con.close();
		
}
		

catch(Exception e){
				
e.printStackTrace();
		
}
		
return userNameList;
	
}

public List getInstructorUserNames(){
		

userNameList = new ArrayList<String>();
		
userNameList.add("Select Your UserName");
		
try{
				
                DataBaseConnection dbcon = new DataBaseConnection();
                con=dbcon.getConnection();			
				
Statement st = con.createStatement();
				
ResultSet rs = st.executeQuery("select username from instructor");
				

while(rs.next()){
														
userNameList.add(rs.getString(1));
				
}
				
con.close();
		
}
		

catch(Exception e){
				
e.printStackTrace();
		
}
		
return userNameList;
	
}


}
