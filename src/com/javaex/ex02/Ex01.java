package com.javaex.ex02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class Ex01 {

	public static void main(String[] args) throws Exception { //이건 왜 IOE아닌지? ->  IOE보다 상위개념이라 이거 써도 알아서 상황에 맞는 IOException써짐
		
		Writer fw = new FileWriter("C:\\javaStudy\\song.txt");//경로가 없을 수도 있고, 파일이 없을 수 있기때문에 에러가남. throw로 던짐(예외처리 던짐)
		//빨대만 꽃아도 파일이 생겨버림. song.txt가 없어도 여기서 실행하면 생김. 생기긴하지만 내용은 없음. 이미 내용이 있는거 저장하고 이걸 실행하면 안에 있던 내용이 없어짐. 새로 만들어지는건지 지워지는건지 확실히 모르지만!결론은 내용이 초기화됨!
		BufferedWriter bw = new BufferedWriter(fw);//얘는 섞어쓰기 잘안함 . 주(fw)가 되는 애를 보조에다가 써줘야 연결이 됨
		
		bw.write("학교종이 땡땡땡");//쓰는건 모으는곳(배열쟁반)에 쓰여진다. 적절량은 모으는애가 알아서 함. 알아서 꽉차면 보내짐
		bw.newLine();
		bw.write("어서모이자");
		bw.newLine();
		bw.write("선생님이 우리를");
		bw.newLine();
		bw.write("기다리신다");
		
		bw.close();
//		fw.close();//보조에서 알아서 해주기때문에 얘는 굳이 써줄 필요가 없다.
	}

}
