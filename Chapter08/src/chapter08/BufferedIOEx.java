package chapter08;

import java.io.*;




/*
 * 8.4 버퍼 입출력과 파일 입출력
 * 
 * 버퍼 입출력의 필요성
 * 
 * 입출력 스트림은 운영체제 API를 호출하여 입출력 장치와 프로그램 사이에서 데이터가 전송되도록 한다.
 * 파일 쓰기 메소드는 최종적으로 운영체제 API를 호출하여 파일에 쓰도록 시키고, 운영제체 API는 하드 
 * 디스크에게 명령을 내려 파일에 데이터를 기록한다.
 * 
 * 자주 운영체제 API가 호출될수록 하드 디스크 장치나 네트워크 장치가 자주 작동하게 되어 시스템의 효율은 나빠지고
 * 프로그램 여깃 여러 번 입출력을 진행해야 하므로 입출력의 실행 속도가 떨어진다. 만일 스트림이 '버퍼'(buffer)
 * 를 가지게 되면 보다 효율적으로 작동할 수 있다. 버퍼란 데이터를 일시적으로 저장하기 위한 메모리이다.
 * 
 * 파일 출력 스트림이 파일에 쓸 데이터를 버퍼에 모아 두었다가, 한 번에 운영체제 API를 호출하여 파일에 쓰게 되면,
 * 운영체제의 부담도 줄이고 장치를 구동하는 일이 줄어들게 되어 시스템의 속도나 효율이 올라가게 된다.
 * 
 * 
 * 버퍼를 가지는 스트림을 '버퍼 스트림'(Buffered Stream)이라고 부른다. 버퍼 입력 스트림은 입력 장치로부터 입력된 데이터를
 * 모아서 프로그램으로 보내며, 버퍼 출력 스트림은 프로그램에서 출력한 데이터를 역시 버퍼에 모아 두었다가 한 번에 출력 장치에 출력한다.
 * 
 * 
 * 
 * 
 * 버퍼 스트림 역시 데이터 타입에 따라 바이트 버퍼 스트림과 문자 버퍼 스트림으로 구분된다. 바이트 버퍼 스트림을 구현한 클래스
 * BufferedInputStream과 BufferedOutputStream이 있으며, 문자 바퍼 스트림을 구현한 클래스는 BufferedReader와
 * BufferedWriter가 있다.
 * 
 * 
 * 
 * 버퍼 스트림 생성 및 활용
 * 
 * 
 * 버퍼 스트림은 내부에 버퍼를 가진다는 사실만 다를 뿐이지 개발자에게 보이는 면은 입출력 스트림과 동일하다.
 * 
 * <표 8-10>은 바이트  버퍼 스트림을 구현한 BufferedInputStream과 BufferedOutputStream의 생성자를,
 * <표 8-11>은 문자 버퍼 스트림을 구현한 BufferedReader와 BufferedWriter의 생성자를 각각 보여준다. 두
 * 표에서 볼 수 있듯이 버퍼 스트림의 클래스의 생성자는 모두 '바이트 스트림' 또는 '문자 스트림'과 연결하여 사용한다.
 * 그리고 생성자에 버퍼의 크기를 지정한다.
 * 
 * 
 * 
 * BufferedInputStream과 BufferedOutputStream의 메소드 <표 8-7>, <표 8-9>의 InputStream, OutputStream
 * 클래스와 각각 같으며, BufferedReader와 BufferedWriter의 메소드는 <표 8-2>, <표 8-5>의 Reader, writer클래스와
 * 같다.
 * 
 * 
 * 
 * 
 * <표 8-10> 바이트 버퍼 스트림 클래스의 생성자
 * 
 * ---------------------------------------------------------------------------------------------------
 * 			생성자									|						설명
 * ---------------------------------------------------------------------------------------------------
 * 	BufferedInputStream(InputStream in)				| in을 연결하는 디폴트 크기의 입력 버퍼 스트림 객체 생성
 * ---------------------------------------------------------------------------------------------------
 * 	BufferedInputStream(InputStream in, int size)	| in을 연결하는 size 크기의 입력 버퍼 스트림 객체 생성
 * ---------------------------------------------------------------------------------------------------
 * 	BufferedOutputStream(OutputStream out)			| out을 연결하는 디폴트 크기의 출력 버퍼 스트림 생성
 * ---------------------------------------------------------------------------------------------------
 * 	BufferedOutputStream(OutputStream out,int size) | out을 연결하는 size 크기의 출력 버퍼 스트림 생성
 * ---------------------------------------------------------------------------------------------------
 * 
 * 
 * 
 * 
 * <표 8-11> 문자 버퍼 스트림 클래스의 생성자
 * 
 * -----------------------------------------------------------------------------------------------------
 * 			생성자									| 						설명
 * -----------------------------------------------------------------------------------------------------
 *  BufferedReader(Reader in)						| in을 연결하는 디폴트 크기의 문자 입력 버퍼 스트림 생성
 * -----------------------------------------------------------------------------------------------------
 * 	BufferedReader(Reader in,int sz)				| in을 연결하는 sz 크기의 문자 입력 버퍼 스트림 생성
 * -----------------------------------------------------------------------------------------------------
 * 	BufferedWriter(Writer out)						| out을 연결하는 디폴트 크기의 문자 출력 버퍼 스트림 생성
 * -----------------------------------------------------------------------------------------------------
 * 	BufferedWriter(Writer out, int sz)				| out을 연결하는 sz 크기의 문자 출력 버퍼 스트림 생성
 * -----------------------------------------------------------------------------------------------------
 * 
 * 
 * 
 * 
 * 
 * 	* 버퍼 출력 스트림 생성
 * 
 * BufferedOutputStream 클래스로 화면에 출력하는 버퍼 출력 스트림을 생성해보자.
 * 
 * 		BufferedOutputStream bout=new BufferedOutputStream(System.out,20); // 20바이트 버퍼
 * 
 * 	앞라인은 20바이트 크기의 버퍼를 가지고, 표준 출력 스트림(System.out)에 연결하여 화면에 출력하는 버퍼 스트림을 생성한다.
 * 
 * 
 * 
 * 
 * 	* 스트림 출력
 * 
 * 다음은 c:\windows\system.ini 파일을 읽어, 버퍼 출력 스트림을 통해 화면에 출력하는 프로그램 코드를 보여주며,
 * 스트림이 연결되어 있는 모양은
 * 
 * 
 * 		FileReader fin=new FileReader("c:\\windows\\system.ini");
 * 		int c;
 * 		while((c=fin.read())!=-1){	// 파일 끝을 만날 때까지 문자들을 하나씩 읽는다.
 * 		bout.write((char)c);		// 읽은 문자를 버퍼 출력 스트림에 쓴다. 출력 스트림과 연결된 화면에 출력한다.
 * 		}
 * 
 * 
 * 
 * 
 * 
 * 	* 버퍼에 남아 있는 데이터 출력
 * 
 * 버퍼 스트림은 버퍼를 가지고 있기 때문에 버퍼가 꽉 찼을 때만 출려고디는 특징이 있다. 그러므로 프로그램에서
 * 데이터를 출력하였지만 버퍼에 들어 있어 출력 장치에 보이지 않을 수 있다. 버퍼가 다 차지 않은 상태에서 버퍼에
 * 있는 데이터를 강제로 출력장치로 보내려면, 다음과 같이 flush() 메소드를 호출하면 된다.
 * 
 * 
 * 		bout.flush(); //bout 스트림의 버퍼에 있는 데이터를 모두 장치에 출력
 * 
 * 	* 스트림 닫기
 * 버퍼 스트림을 모두 사용하였다면 다음과 같이 닫아주어야 한다.
 * 
 * bout.close();// 버퍼 스트림 닫기
 * fin.close();// 파일 입력 스트림 닫기
 * 
 */

import java.util.*;
public class BufferedIOEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fin=null;
		int c;
		
		try{
			
			fin=new FileReader("c:\\Temp\\test2.txt");
			BufferedOutputStream out=new BufferedOutputStream(System.out,5);
			while((c=fin.read())!=-1){// 파일 데이터를 모두 스크린에 출력
				out.write(c);
			}
			// 파일 데이터가 모두 출력된 상태
			new Scanner(System.in).nextLine();// <Enter> 키 입력
			out.flush();	// 버퍼에 남아 있던 문자 모두 출력
			fin.close();
			out.close();
			
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}