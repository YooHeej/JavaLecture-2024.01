package ch17_collection.qna.q8_set;

import java.util.Objects;

public class Student {
	public int studentNum;
	public String name;
	
	public Student(int studentNum, String name) {
		super();
		this.studentNum = studentNum;
		this.name = name;
	}

	@Override
	public int hashCode() {
//		return studentNum;
		return Objects.hash(studentNum);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student st = (Student) obj;
			return this.studentNum == st.studentNum;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Student [studentNum=" + studentNum + ", name=" + name + "]";
	}
	
	

	

}
