package com.cg.bankapp.dao;

import com.cg.bankapp.model.Customer_details;

public interface RegisterNLogin {
public Customer_details register(Customer_details customer_details);
public boolean login(int account_no,String password);
}
