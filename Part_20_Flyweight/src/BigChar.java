import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class BigChar {

	
	// 문자의 이름
	private char charname;
	// 큰 문자를 표현하는 문자열
	private String fontdata;
	
	// 생성자
	public BigChar(char charname){
		this.charname=charname;
		try{
			String filename="big"+charname+".txt";
			StringBuilder sb=new StringBuilder();
			
			for(String line: Files.readAllLines(Path.of(filename))){
				sb.append(line);
				sb.append("\n");		// 한 줄씩 읽어서 추가
			}
			this.fontdata=sb.toString();
			
		}catch(IOException e){
			this.fontdata=charname+"?";
		}
	}
	
	// 큰 문자를 표시한다.
	public void print(){
		System.out.print(fontdata);
	}
}
/**
 * BigChar 클래스는 '큰 문자'를 나타내는 클래스이다.
 * 
 * 생성자에서는 인수로 주어진 문자의 '큰 문자'버전을 생성한다. 생성된 문자열은 fontdata 필드에서 저장한다.
 * 예를 들어 인수로 3이 주어지면 문자열이 fontdata 필드에 저장된다. 
 * 
*/
