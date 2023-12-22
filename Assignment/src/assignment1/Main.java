package assignment1;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileIO f = new FileProperties();
        try {
            f.readFromFile("C:\\Users\\kgm09\\eclipse-workspace\\Assignment\\src\\assignment1\\file.txt");
            f.setValue("width", "1024");
            f.setValue("height", "512");
            f.setValue("depth", "32");
            f.WriteToFile("C:\\Users\\kgm09\\eclipse-workspace\\Assignment\\src\\assignment1\\newfile.txt");
            
            System.out.println("newfile.txt is created.");
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
