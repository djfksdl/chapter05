package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class PhoneBookApp {
	public static void main(String[] args) throws  IOException{
		
		
		//Reader 준비
		  //리더 + 버퍼  ---> 빨대 PhonewDB.txt  UTF8;
		Reader fr = new FileReader("C:\\javaStudy\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		
		//반복
		while(true) {
			//파일을 1줄씩 읽는다.
			String str = br.readLine();
			
			//null이면 반복문을 나간다(글자가 없으면)
			if(str == null) {
				break;
			}
			
			String[] personInfo = str.split(",");
       		//이효리,010 - 2222-3333, 031-2323-4441
			//,로 분리해서 배열로 만든다.			
			//["이효리"]["010 - 2222-3333"], ["031-2323-4441"]
			String name = personInfo[0];
			String hp = personInfo[1];
			String company = personInfo[2];
			
			//출력한다
			System.out.println("이름: " + name);
			System.out.println("핸드폰: " + hp);
			System.out.println("회사: " + company);
			System.out.println("");
			
		
		}
		//종료
		br.close();
		
	}
}
