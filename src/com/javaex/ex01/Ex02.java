package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex02 {

	public static void main(String[] args) throws IOException { //버퍼의 원리
		
		InputStream in = new FileInputStream("C:\\javaStudy\\img.jpg");
		OutputStream out = new FileOutputStream("C:\\javaStudy\\byteBufferImg.jpg"); //실행해보면 아까와는 확실하게 속도 차이가 남
		
		byte[] buffer = new byte[1024];//1024칸짜리 배열로 만들어서 모은것에 while문안에서 값 매칭
		
		System.out.println("복사 시작");
		
		while(true) {
			int data = in.read(buffer); //버퍼라는 빈 쟁반 넣어주면 여기서 채워줌
			
			if(data == -1) {
				System.out.println("복사끝");
				break;
			}
			out.write(buffer);
		}
		
		
		out.close();
		in.close();
	}

}
