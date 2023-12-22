package chapter08;


import java.io.*;

/*		8.6 파일 입출력 응용: 파일 복사
 * 
 * 
 * 이 절에서 파일 입출력 스트림의 응용으로서 파일을 복사하는 프로그램 작성에 대해 소개한다.
 * 파일들은 문자들로 이루어진 텍스트 파일과 이미지나 오디오 혹은 그래픽 등 바이너리 코드로 이루어진 바이너리
 * 파일로 나뉜다. 바이너리 파일은 바이트 스트림으로 읽고 정확하게 복사가 이루어지지만, 텍스트 파일은 문자 스트림이나
 * 바이트 스트림 중 어떤 것을 사용해도 복사에 문제가 없다.
 * 
 * 
 * 
 * 
 * 
 * 
 * 		텍스트 파일 복사
 * 
 * 
 * 문자 스틀미을 이용하여 텍스트 파일을 복사해보자. 예제 8-9는 텍스트 파일을 복사하는 응용프로그램을 보여준다. 'FileReader'를
 * 이용하여 텍스트 파일을 읽고 'FileWriter'로 텍스트 파일에 복사한다. 파일 경로명은 File 객체를 이용한다. 이 예제로는 이미지
 * 파일이나 워드 파일, ppt 파일, 한글 파일 등을 복사할 수 없다.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */






public class TextCopyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File src=new File("c:\\windows\\system.ini");
		File dest=new File("c:\\Temp\\system.txt");
		
		int c;
		
		try{
			
			FileReader fr=new FileReader(src);
			FileWriter fw=new FileWriter(dest);
			
			while((c=fr.read())!=-1)
				fw.write((char)c);
			
			fr.close();
			fw.close();
			
			System.out.println(src.getPath()+"를 "+dest.getPath()+"로 복사하였습니다.");
			
		}catch(IOException e ){
			System.out.println("파일 복사 오류");
		}
	}

}
// 텍스트 파일이 복사됨.
