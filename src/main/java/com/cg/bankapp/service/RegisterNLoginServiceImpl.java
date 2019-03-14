package com.cg.bankapp.service;

import com.cg.bankapp.dao.RegisterNLogin;
import com.cg.bankapp.dao.RegisterNLoginImpl;
import com.cg.bankapp.dao1.TransactinsImpl;
import com.cg.bankapp.dao1.Transactions;
import com.cg.bankapp.model.Customer_details;

public class RegisterNLoginServiceImpl implements RegisterNLoginService {
	RegisterNLogin r= new RegisterNLoginImpl();
	Transactions t =new TransactinsImpl();
	public Customer_details register(Customer_details customer_details) {
		// TODO Auto-generated method stub
		return r.register(customer_details);
	}

	public boolean login(int account_no, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	public int withdraw(int withdrawAmt) {
		// TODO Auto-generated method stub
		return t.withdraw(withdrawAmt);
	}

	public int deposit(int depositAmt) {
		// TODO Auto-generated method stub
		return t.deposit(depositAmt);
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
