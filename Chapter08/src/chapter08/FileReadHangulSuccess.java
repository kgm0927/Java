package chapter08;


import java.io.*;


// page.455
// InputStreamReader을 이용하여 MS949 문자 집합으로 한글 텍스트 파일을 읽고 출력하라.
public class FileReadHangulSuccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InputStreamReader in=null;
		FileInputStream fin=null;
		
		try{
			
			fin=new FileInputStream("c:\\Temp\\hangul.txt");
			in=new InputStreamReader(fin,"UTF-8");	// 올바른 문자 집합 지정
			
			int c;
			
			System.out.println("인코딩 문자 집합"+in.getEncoding());// 문자 집합 이름 리턴
			while((c=in.read())!=-1){
				System.out.println((char)c);
			}
			in.close();	// InputStreamReader 닫기
			fin.close();// FileInputStream 닫기
			
		}catch(IOException e){
			System.out.print("입출력 오류");
		}

	}

}
