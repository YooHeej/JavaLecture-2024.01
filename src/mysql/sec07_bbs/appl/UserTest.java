package mysql.sec07_bbs.appl;


import java.util.List;

import mysql.sec07_bbs.entity.User;
import mysql.sec07_bbs.service.UserService;
import mysql.sec07_bbs.service.UserServiceMySQLImpl;

public class UserTest {

	public static void main(String[] args) {
		UserService userSvc = new UserServiceMySQLImpl();
		User user = null;
		
//		user = new User("admin", "1234", "관리자", "admin@gmail.com");
//		userSvc.registerUser(user);
//		user = new User("james", "1234", "제임스", "james@gmail.com");
//		userSvc.registerUser(user);
//		user = new User("maria", "1234", "마리아", "maria@naver.com");
//		userSvc.registerUser(user);
//		user = new User("brian", "1234", "브라이언", "brian@gmail.com");
//		userSvc.registerUser(user);
//		user = new User("sarah", "1234", "사라", "sarah@naver.com");
//		userSvc.registerUser(user);

//		user = userSvc.getUserByUid("admin");
//		System.out.println(user);
//		
//		user = userSvc.getUserByUid("james");
//		System.out.println(user);
		
//		System.out.println(userSvc.login("admin", "1234"));
//		System.out.println(userSvc.login("admin", "asdf"));
//		System.out.println(userSvc.login("james", "1234"));
		
		List<User> list = userSvc.getUserList(1);
		list.forEach(x -> System.out.println(x));
		
		userSvc.close();
	}

}