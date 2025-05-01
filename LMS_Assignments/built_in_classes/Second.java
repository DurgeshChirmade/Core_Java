import java.io.*;
import java.util.*;

public class Second
{
	public static void main(String[] args){

		for(int i=0;i<args.length;i++){

			System.out.println("Length of String "+args[i]+" is "+args[i].length());

			boolean bResult = args[i].contains("ATC");
			System.out.println("Your substring is found in String.");

			Arrays.sort(args);
			for(String str:args)
				System.out.print(str+" ");

		}
	}
}