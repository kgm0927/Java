package assignment1;



import java.util.Properties;
import java.io.IOException;
import java.io.*;




public class FileProperties  implements FileIO  {
	Properties proper;
	FileReader reader;
	

	public FileProperties(){
		proper=new Properties();
		
		
	}
	
	@Override
	public void WriteToFile(String filename) throws IOException {	// 파일 읽어들이기
		// TODO Auto-generated method stub

	proper.store(new FileWriter(filename),"written by FileProperties");
	
	}

	
	@Override
	public void setValue(String key, String value) {		// 입력
		// TODO Auto-generated method stub
		proper.setProperty(key,value);
	}

	
	@Override
	public String getValue(String key) {// 
		// TODO Auto-generated method stub
	
		return proper.getProperty(key);
		
	}

	
	@Override
	public void readFromFile(String filename) throws IOException {
		// TODO Auto-generated method stub
		reader=null;
		try{
			reader=new FileReader(filename);
		proper.load(reader);
	
		reader=new FileReader(filename);
		
		
		
		
		int c;
		while((c=reader.read())!=-1){
			System.out.print((char)c);
			}
		System.out.println();
	
		reader.close();
	
	
	
		}catch(IOException e){
			System.out.println("열 수 없음");
		}
		
	
		
}
}