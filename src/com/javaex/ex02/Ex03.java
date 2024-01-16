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
			System.out.println(str); //한글 깨지게 나옴.
			//한글을 읽는 방식이 다 다름. 메모장이 똑똑해서 안깨지게 나오는거임 
			//한글은 'ㄱ'에 해당하는 01로 쓰겠다 매칭한 문자표 값을 찾아씀. 
			//텍스트 파일을 만들면 앞에 우리가 모르는 줄바꿈기호있듯이 부가적 정보가 들어감. 그 정보도 세트가 달라서 읽어라하면 글자가 깨짐. 인식을 못하니까 (주어진 정보가 글자인지 주석인지 모름) 세트가 다르니까
			//결론은 무슨 세트로 쓰는지 알려줘야함.
			//쌤이 준 파일은 UTF-8파일로 바꿔주었기때문에 굳이 셋팅안해도 잘읽음. 메모장은 전문적으로 글자를 읽는 프로그램이라 알아서 맞는 셋팅값 찾아서 읽음. 
			//Reader는 utf-8를 기본으로 읽음.
			//1010은 기계가 아는거라 상관없음. 글자를 해석하는 과정에서 문제가 있다. InputStream은 생으로 , Reader는 글자읽는 애니까 바꿔 보여줌. 
			//Reader는 아예 글자라고 알고 시작함.utf-8을 기본으로 놓고 해석함. 그래서 utf-8이 아닌 나머지해석 하려면 문제가 됨. 나머지를 해결하기 위해서 다른거 하나를 쓰게 됨 
			// 나머지 애들은 utf-8이 아니기때문에 Reader로 읽어봤자 해석이 안됨. 그래서 처음엔 파일 읽듯이 1010, 1100처럼 생으로 읽음. 그리고 중간에 글자로 바꾸는 애를 번역기로 놓음.(놓을때 셋팅할 수 있게 해줌)그래서 그걸 가지고 해석을함. 번역된걸 Reader로 읽음. 
			//3단으로 써야한다. 꼽는 빨대가 3단! 기능이 확장되면 뽑아서 쓰는 식으로! 주스트림(1010)무조건 하나 써야하고, 번역기 하나 쓰고, 버퍼쓰고! 이런식
			
		}
		
		br.close();
	}

}
