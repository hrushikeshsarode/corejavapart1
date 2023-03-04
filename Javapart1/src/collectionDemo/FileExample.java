package collectionDemo;

import java.io.File;
import java.io.IOException;
public class FileExample {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		File newFile = new File("C:FileHandling.txt");
		if (newFile.createNewFile()) {
		System.out.println("File created.");
		} else {
		System.out.println("File exists.");
		}

	}

}
