package collectionDemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("C:Test.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("String is a class.");
		bw.write("File Write Demo.");
		bw.close();
		System.out.println("File Created and Edited successfully.");

	}

}
