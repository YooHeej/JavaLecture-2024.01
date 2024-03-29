package ch05_reference;

import java.util.Arrays;

public class Ex02_ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int src[] = {1, 2, 4, 8};
		int [] dst = src;
		System.out.println(Arrays.toString(dst));
		
		dst[2] = 5;
		System.out.println(Arrays.toString(dst));
		// side effect (부작용) 발생 : 원치 않은 src 내용도 바뀐다
		System.out.println(Arrays.toString(src));
		
		int[] newSrc = {3, 4, 7, 9};
		int[] newDst = new int[4];
		// Deep copy, 2차원 배열은 안된다.
		System.arraycopy(newSrc, 0, newDst, 0, newSrc.length);
		System.out.println(Arrays.toString(newDst));
		
		newDst[2] = 15;
		System.out.println(Arrays.toString(newDst));
		System.out.println(Arrays.toString(newSrc));
	}

}
