package ch18_io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex07_BufferedIO {

	public static void main(String[] args) throws Exception {
		// buffer를 쓸때 안 쓸때 비교
		
		// case 1) 미사용
		InputStream is = new FileInputStream("c:/Temp/eiffel.jpg");
		OutputStream os = new FileOutputStream("c:/Temp/에펠.jpg");
		
		long noBufferTime = copy(is, os);
		System.out.println("버퍼 미사용: " + noBufferTime + " ns");				// 3.08 ??? -1567319832618100 ns  ??
		is.close(); os.close();
		
		// case 2) 사용
		is = new BufferedInputStream(new FileInputStream("c:/Temp/eiffel.jpg"));
		os = new BufferedOutputStream(new FileOutputStream("c:/Temp/에펠.jpg"));
		
		long bufferTime = copy(is, os);
		System.out.println("버퍼 사용: " + bufferTime + " ns");					// 0.03 ??? -1567577774947600 ns ??
		is.close(); os.close();

	}
	
	static long copy(InputStream is, OutputStream os) throws IOException {
		long startTime = System.nanoTime();
		// 1바이트씩 읽고 쓰기
		while (true) {
			int data = is.read();
			if (data == -1)
				break;
			os.write(data);
		}
		os.flush();
		long endTime = System.nanoTime();
		return endTime = - startTime;
	}
}
