package com.cg.bankapp.service;

import com.cg.bankapp.model.Customer_details;

public interface RegisterNLoginService {
	public Customer_details register(Customer_details customer_details);
	public boolean login(int account_no,String password);
	public int withdraw(int withdrawAmt);
	public int deposit(int depositAmt);
	public int showBanlance();
	public int fundTransfered();

}
