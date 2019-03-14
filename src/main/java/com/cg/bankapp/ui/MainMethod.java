package com.cg.bankapp.ui;

import java.util.Scanner;

import com.cg.bankapp.dao.RegisterNLogin;
import com.cg.bankapp.dao.RegisterNLoginImpl;
import com.cg.bankapp.dao1.TransactinsImpl;
import com.cg.bankapp.dao1.Transactions;
import com.cg.bankapp.model.Customer_details;
import com.cg.bankapp.service.RegisterNLoginService;
import com.cg.bankapp.service.RegisterNLoginServiceImpl;

public class MainMethod {
	static Customer_details customer_details =new Customer_details();
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
RegisterNLogin r= new RegisterNLoginImpl();
RegisterNLoginService rs = new RegisterNLoginServiceImpl();
Transactions t= new TransactinsImpl();
do
{
System.out.println("1.register\n 2.login");
System.out.println("enter the operation that u need to perform");
int ch=sc.nextInt();
switch(ch)
{
case 1: customer_details = setInfo();
	      rs.register(customer_details);
break;

case 2: System.out.println("enter account number");
int accno=sc.nextInt();
System.out.println("enter password");
String psw=sc.next();
	     boolean a= r.login(accno,psw);
	     if(a)
	     {
	    	 do
				{
					System.out.println("enter 1.withdraw \n 2.deposit \n 3.show balance \n 4.fund Transfer");
					System.out.println("enter the option");
					int ch1=sc.nextInt();
					switch(ch1)
					{
					case 1:System.out.println("enter the amount to be withdrawn");
				int	withdrawAmt=sc.nextInt();
						t.withdraw(withdrawAmt);
					break;
					case 2:System.out.println("enter the amount to be deposited");
					int	depositAmt=sc.nextInt();
              t.deposit(depositAmt);
					break;
				/*	case 3:showBalance();
					break;
					case 4:fundTransfer();
					break;
						*/
					}
					
				}while(true);
	     }
//break;
case 3:System.exit(0);

}
}while(true);


	}
	
	public static Customer_details setInfo()
	{
		System.out.println("enter first name");
		customer_details.setFirst_name(sc.next());
		System.out.println("enter last name");
		customer_details.setLast_name(sc.next());
		System.out.println("enter email adress");
		customer_details.setEmail_id(sc.next());
		System.out.println("enter password");
		customer_details.setPassword(sc.next());
		System.out.println("enter pan card num");
		customer_details.setPancard_no(sc.nextInt());
		System.out.println("enter adhar card num");
		customer_details.setAdhar_no(sc.nextInt());
		System.out.println("enter adress");
		customer_details.setAdress(sc.next());
		System.out.println("enter mobile num");
		customer_details.setMobile_no(sc.nextInt());
	
		return customer_details;
	}

}
