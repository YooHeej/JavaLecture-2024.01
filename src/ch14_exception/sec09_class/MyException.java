package ch14_exception.sec09_class;

public class MyException extends Exception {
	
	public MyException () {
	}
	
	public MyException(String message) {
		super(message);
	}
}
