package chapter08;

import java.io.FileOutputStream;
import java.io.IOException;



/*
 * 
 * 
 * 
 * 	8.3 바이트 스트림과 파일 입출력
 * 
 * 바이트 스트림 클래스
 * 
 * 바이트 스트림은 바이트 단위로 바이너리 데이터가 흐르는 스트림이다. 바이트 스트림은 바이너리
 * 데이터를 있는 그대로 입출력하기 때문에 이미지나 동영상 파일 입출력에 필수적이고, 문자들로
 * 구성된 텍스트 파일도 입출력할 수 있다.다음은 대표적인 바이트 입출력 스트림 클래스이다.
 * 
 * 
 * 
 * 
 * 		*InputStream/OutputStream
 * 	
 * 추상 클래스이며, 바이트 입출력 처리를 위한 공통 기능을 가진 슈퍼 클래스이다.
 * 
 * 
 * 
 * 
 * 		*FileInputStream/FileOutputStream
 * 
 * 파일 입출력을 위한 클래스로서, 파일로부터 바이너리 데이터를 읽거나 파일에 바이너리 데이터를
 * 저장할 수 있다.
 * 
 * 
 * 
 * 
 * 		*DataInputStream/DataOutputStream
 * 
 * 이 스트림을 이용하면 boolean, char, byte, short, int, long, float, double 타입의
 * 값을 바이너리 형태로 출력한다. 문자열도 바이너리 형태로 입출력한다.
 * 
 * 
 * 
 * 
 * FileOutputStream을 이용한 바이너리 파일 쓰기
 * 
 * 프로그램 내의 변수나 배열에 들어 있는 '바이너리 값'을 그대로 파일에 저장해야 하는 경우가 있다. 메모리에
 * 있는 이미지 비트들을 그대로 이미지 파일로 저장하는 경우다. 바이너리 파일은 사람이 읽고 해석하는 것이 거의
 * 불가능하다.
 * 
 * 이제, 프로그램 내의 변수나 배열을 c:\Temp\test.out 파일에 바이너리 형태로 그대로 기록하는 예를 통해
 * 바이트 스트림 파일 쓰기를 알아본다.
 * 
 * 
 * 
 * <표 8-6> FileOutputStrema 클래스의 생성자
 * 
 * -------------------------------------------------------------------------------------------
 * 		FileOutputStream(File file)		| file이 지정하는 파일에 출력하는 FileOutputStream 생성
 * -------------------------------------------------------------------------------------------
 * 		FileOutputStream(String name)   | FileOutputStream을 생성하며 append가 true이면 file이 지정하는
 * 										| 파일의 마지막부터 데이터 저장
 * -------------------------------------------------------------------------------------------
 * 		FileOutputStream(String name,	| FileOutputStream을 생성하며 appendrk true이면 name이름의 파일의
 * 						boolean append)	| 마지막부터 데이터 저장
 * -------------------------------------------------------------------------------------------
 * 
 * 
 * 
 * <표 8-7> OutputStream과 FileOutputStream의 공통 주요 메소드
 * 
 * -----------------------------------------------------------------------------------------------
 * 	void write(int b)			| int 형으로 넘겨진 한 바이트를 출력 스트림으로 출력
 * -----------------------------------------------------------------------------------------------	
 * 	void write(byte []b)		| 배열 b의 바이트를 모두 출력 스트림으로 출력
 * -----------------------------------------------------------------------------------------------
 * 	void write(byte []b,int off	| len 크기만큼 off부터 배열 b를 출력 스트림으로 출력
 * 	, int len)					|
 * -----------------------------------------------------------------------------------------------
 * void flush()					| 출력 스트림에서 남아 있는 바이너리 데이터 모두 출력
 * -----------------------------------------------------------------------------------------------
 * void close()					| 출력 스트림을 닫고 관련된 시스템 자원 해제
 * -----------------------------------------------------------------------------------------------
 * 
 * 
 * 
 * 바이너리 데이터를 파일에 저장할 때 FileOutputStream 클래스를 이용한다.
 * FileOutputStream의 생성자 <표 8-6>과 같으며, <표 8-7>는 FileOutputStream의
 * 주요 메서드를 보여준다.
 * 
 *  
 *  
 *  * 파일 출력 스트림 생성
 *  
 *  c:\Temp\test.out 파일에 바이너리 데이터를 저장하는 출력 스트림은 다음과 같이 생성한다.
 *  
 *  FileOutputStream fout=new FileOutputStream("c:\\Temp\\test.out");
 *  
 *  
 *  FileOutputStream 생성자는 c:\Temp\test.out 파일을 생성하여 연결한다. 파일이
 *  이미 있으면 그 내용을 지우고 스트림에 연결한다. 쓰기가 이루어지면 c:\Temp\testout
 *  파일은 바이너리 파일이 된다.
 *  
 *  
 *  
 *  * 파일 쓰기
 *  
 *  배열을 파일에 저장해보자. write() 메소드를 이용하여 다음과 같이 한 바이트씩 배열 데이터를 기록한다.
 *  
 *  byte b[]={7,51,3,4,-1,24};
 *  for(int i=0;i<b.length;i++)
 *  	fout.write(b[i]);
 *  
 *  
 *  for 문 없이 한 번에 배열 b[]를 저장할 수도 있다.
 * 		fout.write(b); // 배열 b[]의 바이트 모두 파일 저장
 * 
 * (실행의 결과는 형태에 따라 약간씩 다르다.)
 * 
 * 
 * 
 * */



// page.462
// FileOutputStream으로 바이너리 파일 쓰기
public class FileOutputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte b[]={7,51,3,4,-1,24};
		
		try{
			FileOutputStream fout=new FileOutputStream("c:\\Temp\\test.out");
			for(int i=0;i<b.length;i++){
				fout.write(b[i]);
			}
			fout.close();
		}catch(IOException e){
			System.out.println("저장할 수 없습니다.");
		}
			System.out.println("c:\\Temp\\test.out을 저장하였습니다.");
	}

}
