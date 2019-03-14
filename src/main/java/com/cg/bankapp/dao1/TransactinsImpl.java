package com.cg.bankapp.dao1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TransactinsImpl implements Transactions{
int amt;
Scanner sc=new Scanner(System.in);
	public int withdraw(int withdrawAmt) {
		// TODO Auto-generated method stub
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","BankApp","oracle123");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from customer_details");
			while(rs.next())
			{
				if(rs.getInt(10)<withdrawAmt)
				{
					System.out.println(rs.getInt(10));
					 amt=rs.getInt(10);
					amt=amt-withdrawAmt;
					System.out.println("available balance"+amt);
				}
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return amt;
	}

	public int deposit(int depositAmt) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","BankApp","oracle123");
			PreparedStatement ps=con.prepareStatement("insert into BankApp(balance) values where account_no=?");
			System.out.println("enter the acc num");
			int accnum=sc.nextInt();
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from customer_details");
			while(rs.next())
			{
				if(rs.getInt(1)==accnum)
				{
					amt=amt+depositAmt;
					System.out.println("deposited amt is"+amt);
					ps.setInt(1, amt);
					
				}
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return amt;
	}

	public int showBanlance() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int fundTransfered() {
		// TODO Auto-generated method stub
		return 0;
	}

}
