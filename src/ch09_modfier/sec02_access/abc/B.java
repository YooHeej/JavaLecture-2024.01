package ch09_modfier.sec02_access.abc;

public class B {
	void abc() {
	A a = new A();
	System.out.println(a.a + a.b + a.c);			// A 클래스의 a,b,c 사용 가능 - d = private (사용 불가능)
	}
}
