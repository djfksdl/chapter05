package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex03 {

	public static void main(String[] args) throws IOException {
		
		Reader fr = new FileReader("C:\\javaStudy\\MS949.txt");
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			String str = br.readLine();
			
			if(str == null) {
				break;
			}
			System.out.println(str); //한글 깨지게 나옴
			//한글을 읽는 방식이 다 다름. 메모장이 똑똑해서 안깨지게 나오는거임 
			//한글은 ㄱ에 해당하는 문자표 값을 찾아씀. 
			//텍스트 파일을 만들면 앞에 부가적 정보가 들어감.
			//UTF-8파일로 바꿔줌
			//생으로 두고 1010을 변환할 수 있게 함->ㅘㅁ?
			//3단으로 써야한다. 꼽는 빨대가 3단! 기능이 확장되면 뽑아서 쓰는 식으로! 주스트림+10101 (2교시 거의 마지막)
			
		}
		
		br.close();
	}

}
