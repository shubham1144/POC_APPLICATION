package com.learnandpush.dao;

import com.learnandpush.model.Customer;

public interface CustomerDAO {

	public void insert(Customer customer);

	public Customer findByCustomerId(int custId);
}
