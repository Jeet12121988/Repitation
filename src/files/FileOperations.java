package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOperations {

	static String src=".\\excel\\files.txt";
	static File file =new File(src);
	
	
	public static void createFile() {
		
		
		
		try {
			file.createNewFile();
		} catch (IOException e) {
			System.out.println("Unable to create the file");
		}
		
	}

	
	public static void writeFile() {
		
		try {
			FileWriter write=new FileWriter(src);
			write.write("HI My name is Jeet");
			write.flush();
		} catch (IOException e) {
			System.out.println("Unable to write the file");
		}
	}
	
	
	public static void readFile() {
		
		try {
		
			FileReader readFile=new FileReader(file);
			Scanner sc=new Scanner(file);
			
			if(sc.hasNextLine()) {
				
				System.err.println(sc.nextLine());
			}
		
		} catch (FileNotFoundException e) {
			System.out.println("Unable to read the file");
		}
	}
	public static void main(String[] args) {
		
		//createFile();
		writeFile();
		readFile();
	}

}
