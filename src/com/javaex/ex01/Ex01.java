package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		
		InputStream in = new FileInputStream("C:\\javaStudy\\img.jpg"); // 만들면 부모까지 알아서 끌고 옴. 섞어쓰기 시전. ()안에 경로를 안쓰면 빨간줄이 뜨는걸 봐선 디폴트 생성자가 없다고 유추할수 있음
		//이 위치에 없을 수있으니 예외처리해달라.try-cathcah를 사용해서. 일단 지금 메인이 아니라서 밖으로 던지기 'throws IOException'하면 빨간줄 없어짐
		
		OutputStream out = new FileOutputStream("C:\\javaStudy\\byteimg.jpg"); // 아직 존재하지않는것
		
		System.out.println("복사시작");//한번에 딱 파일 복사하는게 아니라 조금조금씩 복사되는거임. 한모금 빨았다가 한모금 보냈다가 반복
		
		while(true) {//언제까지 돌지모르지만 -1오면 끝이다.그러므로 for문은 안됨. 계속 반복해야하니까
			
			int data = in.read(); //읽은거를 data에다가 담는다.  똑같은게 3개있다. 오버라이드된거
			//끝까지 다 읽으면 -1이 옴.(중간 값들은 어디서 끊어서 올지 모르니 해석할 필요가 없다)하지만 -1오는건 알아야함
			
			System.out.println(data);
			
			
			if(data == -1) {
				System.out.println("복사 끝" + data);
				break;
			}
			out.write(data); // data에다가 담아서 밷는거니까 data를 담아준다.
		}
		
		
		out.close();//이것도 잊지말고 닫아주기~
		in.close(); //부모쪽에서 만들어놓은거
		
	}

}
