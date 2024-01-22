package ch12_interface.sec04_dao;

import java.util.List;

public class MainWithoutInterface {

	public static void main(String[] args) {
		// MySQL DB를 사용하려면
		CustomerDaoMySQLImpl customerDaoMySQL = new CustomerDaoMySQLImpl();
		Customer customer = customerDaoMySQL.getCustomer(34);
		List<Customer> list = customerDaoMySQL.getCustomerList();
		customerDaoMySQL.insertCustomer(customer);
		customerDaoMySQL.updateCustomer(customer);
		customerDaoMySQL.deleteCustomer(34);
		
		// Oracle DB를 사용하려면
		CustomerDaoOracleImpl customerDaoOracleImpl = new CustomerDaoOracleImpl();
		customer = customerDaoOracleImpl.getCustomer(34);
		list = customerDaoOracleImpl.getCustomerList();
		customerDaoOracleImpl.insertCustomer(customer);
		customerDaoOracleImpl.updateCustomer(customer);
		customerDaoOracleImpl.deleteCustomer(34);

	}

}
