package com.cg.bankapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.cg.bankapp.model.Customer_details;

public class RegisterNLoginImpl implements RegisterNLogin{

	public Customer_details register(Customer_details customer_details) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","BankApp","oracle123");
			PreparedStatement ps=con.prepareStatement("insert into Customer_details (account_no,first_name,last_name,email_id,password,pancard_no,adhar_no,adress,mobile_no)values(accno_seq.nextval,?,?,?,?,?,?,?,?)");
			//System.out.println("enter first name");
			ps.setString(1, customer_details.getFirst_name());
		//	System.out.println("enter last name");
			ps.setString(2, customer_details.getLast_name());
			ps.setString(3, customer_details.getEmail_id());
			ps.setString(4, customer_details.getPassword());
			ps.setInt(5, customer_details.getPancard_no());
			ps.setInt(6, customer_details.getAdhar_no());
			ps.setString(7, customer_details.getAdress());
			ps.setInt(8, customer_details.getMobile_no());
		
		int i=ps.executeUpdate();
		if(i==1)
		{
			System.out.println("successfully registered");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from customer_details");
			while(rs.next())
			{
			System.out.println("your account number is"+rs.getInt(1));
			}
		}
		
		else
			System.out.println("not reistered try again");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return customer_details;
	}

	public boolean login(int account_no, String password) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","BankApp","oracle123");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from customer_details");
			while(rs.next())
			{
				
				if(rs.getInt(1)==account_no)
				{
					
					System.out.println("hello "+rs.getString(2));
					System.out.println("loged in");
					
					
					
				}
				
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
	
}


