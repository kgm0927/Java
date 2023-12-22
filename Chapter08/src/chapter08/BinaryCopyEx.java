package chapter08;

import java.io.*;


/*
 *
 * 
 * 바이너리 파일 복사
 * 
 * 		바이너리 파일 복사
 * 
 * 바이트 스트림을 이용하여 바이너리 파일을 복사해보자. 예제 8-10은 바이너리 파일을 복사하는 응용프로그램
 * 사례이다. 이 응용프로그램은 파일을 바이트 단위로 복사하므로, 이미지, 동영상, 실행 파일(exe)과 같은
 * 바이너리 파일뿐 아니라 텍스트 파일로 복사할 수 있다.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
 

public class BinaryCopyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File src=new File("c:\\Temp\\20230310120359.jpg");// 원본 파일 경로명
		
		File dest=new File("C:\\Temp\\iiii.jpg");// 복사 파일 경로명
		
		
		int c;
		try{
			FileInputStream fi=new FileInputStream(src);		// 파일 입력 스트림 생성
			FileOutputStream fo=new FileOutputStream(dest);		// 파일 출력 바이트 스트림 생성
			
			
			while((c=fi.read())!=-1){
				fo.write((byte)c);
			}
			
			fi.close();
			fo.close();
			
			System.out.println(src.getPath()+"를 "+dest.getPath()+"로 복사하였습니다.");
			
			
			
		}catch(IOException e){
			System.out.println("파일 복사 오류");
		}
		
	}

}
