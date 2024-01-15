package com.javaex.ex01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex03 {

	public static void main(String[] args) throws IOException {
		
		//in
		InputStream in = new FileInputStream("C:\\javaStudy\\img.jpg"); 
		BufferedInputStream bin = new BufferedInputStream(in); //얘는 섞어쓰기 잘 안함(in)이 있어야 권총이랑 소음기 연결한거임. 안그럼 둘이 접점이 없음
		
		//out
		OutputStream out = new FileOutputStream("C:\\javaStudy\\bufferedImg.jpg");
		BufferedOutputStream bout = new BufferedOutputStream(out);//얘도 out을 연결해줘야함
		
		System.out.println("복사 시작");
		
		while(true) {
			int data = bin.read(); //in.read()라 하면 연결한 의미가 없음;;			
			
			if(data == -1) {
				System.out.println("복사 끝");
				break;
			}
			
			bout.write(data);//알아서 모아서 감
			
		}
			
		bout.close();
		bin.close();
		in.close();
	}

}
