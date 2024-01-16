package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex02 {

	public static void main(String[] args) throws IOException { //예외처리-경로가 있을수도 없을수도 있어서 에러날 수 있기에 방지하고자
		Reader fr = new FileReader("C:\\javaStudy\\song.txt");
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			String str = br.readLine(); //read도 있지만 readLine이 한줄씩 읽는거다. 근데 출력할때 줄바꿈 기호는 포함하지 않음 
			if(str == null) { // null은 값이 아닌 주소임. 그래서 equals()아닌 == 으로 써준다.
				break;
			}
			System.out.println(str);
//			-> ??그러므로 자바변수에 넣고 조절할 수 있음을 알 수 있다.
		}
		
		br.close(); //if안쓸땐 무한반복이라 빠져나갈길이 없어서 여기 못씀-> if-break로 빠져나갈수있게 해주면 오류 사라짐
	}
	//1ㅡ2번 예제는 읽고 쓰고를 따로따로 표현함. 어떤 프로그램은 둘다 한번에 할 수 있게할 수 있다.

}
