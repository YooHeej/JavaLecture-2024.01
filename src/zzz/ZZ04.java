package zzz;

public class ZZ04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// 04. C:/Workspace/WebProject/03.JavaScript/ch07.표준내장객체/04.String연습.js
//		 에서 파일명(04.String연습.js)만 출력하세요.
		
		String path = "C:/Workspace/WebProject/03.JavaScript/ch07.표준내장객체/04.String연습.js";
		String[] pathArray = path.split("/");
		System.out.println(pathArray[pathArray.length - 1]);
	}

}
