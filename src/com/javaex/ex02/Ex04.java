package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Ex04 {
	public static void main(String[] args) throws IOException {
		//in - 왼쪽 셋팅
		InputStream in = new FileInputStream("C:\\javaStudy\\MS949.txt");
		InputStreamReader isr = new InputStreamReader(in , "MS949"); //시작할떄 시작주소를 ()안에 줌 in. UTF-8은 번역 잘됨. 지금 txt파일은 ms949방식으로 저장을 해준거임.그래서 뒤에 ""는 MS949라는걸 알려주는것
		BufferedReader br = new BufferedReader(isr);
		
		//out - 오른쪽
		OutputStream out = new FileOutputStream("C:\\javaStudy\\MS949-copy.txt");//여기까지는 빨대 꼽은 상태 -> 꼽는순간 안에 내용이 초기화되어서 같은 파일이름으로 하면 못읽음(일부러 실험한거)
		OutputStreamWriter osw = new OutputStreamWriter(out,"MS949"); //MS949로 바꿔줘라
		BufferedWriter bw = new BufferedWriter(osw);
		
		while(true) {
			String str = br.readLine();
			
			if(str == null) {
				break;
			}
//			System.out.println(str);
			bw.write(str);
			bw.newLine();
		}
		bw.close();
		br.close();
		
	}
}
