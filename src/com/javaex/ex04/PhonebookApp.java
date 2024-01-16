package com.javaex.ex04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class PhonebookApp {

	public static void main(String[] args) throws IOException {
		//쓰기 빨대 쓰면 파일 다 지워짐
		
		//파일에서 읽은 내용을 리스트로 관리
		//(이름, 핸드폰, 회사) -->Person
		
		//자기의 정보 Person 리스트에 추가하고
		
		//리스트 전체내용을 PhoneDB.txt에 쓴다.
		
		
		//Reader준비
		
		Reader fr = new FileReader("C:\\javaStudy\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		
		//쓰기
		Writer fw = new FileWriter("C:\\javaStudy\\PhoneDB.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("이연수 ,010-7590-5190, It");
		bw.newLine();
		
		
		//반복
		while(true) {
			String str = br.readLine();
			
			if(str == null) {
				break;
			}
			
			String[] Person = str.split(",");
			
			String name = Person[0];
			String hp = Person[1];
			String company = Person[2];
			
			System.out.println("이름: "+ name);
			System.out.println("핸드폰: "+ hp);
			System.out.println("회사: "+ company);
			System.out.println("");
		}
		
		//종료
		br.close();
		bw.close();
		
		
	}

}
