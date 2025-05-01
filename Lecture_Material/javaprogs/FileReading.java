package iodemos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {

	public static void main(String[] args) {
		try {
			char [] chars = new char[10];
			FileReader fr = new FileReader("C:/myfiles/demo.txt");
			int i;
			while((i = fr.read(chars)) != -1 )
				System.out.println(new String(chars));
			fr.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("path incorrect");
		}
		catch(IOException e) {
			System.out.println("IO error");
		}

	}

}
