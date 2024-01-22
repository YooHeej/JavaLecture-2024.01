package ch12_interface.sec04_dao;

import java.util.List;

// DAO(Data Access Object) - DB를 액세스하기 위한 코드
public interface DataAccessObject {

	Customer getCustomer(int cid);
	
	List<Customer> getCustomerList();
	
	void insertCustomer(Customer customer);
	
	void updateCustomer(Customer customer);
	
	void deleteCustomer(int cid);
}
