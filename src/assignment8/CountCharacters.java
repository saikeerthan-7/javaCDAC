package assignment8;
import java.io.*;
import java.util.*;

public class CountCharacters {
	
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		FileWriter fw=new FileWriter("characterfile.txt");
		
		
		fw.write(str);
		fw.close();
		int ch;
		FileReader fr =new FileReader("characterfile.txt");
		int upperCase = 0, lowerCase = 0, digits = 0, specialChar = 0, spaces = 0;
		while((ch=fr.read())!=-1){
			if(Character.isUpperCase(ch)) {
				upperCase++;
			}
			else if(Character.isLowerCase(ch)) {
				lowerCase++;
			}
			else if (Character.isDigit(ch)){
				digits++;
			}
			else if(Character.isWhitespace(ch)) {
				spaces++;
			}
			else {
				specialChar++;
			}
		}
		System.out.println("Data Read from file :" + str);
		System.out.println("UpperCase Characters : " + upperCase);
		System.out.println("LowerCase Characters : " +lowerCase);
		System.out.println("Digits : " + digits);
		System.out.println("Special Characters : " +specialChar);
		System.out.println("Spaces : " + spaces);
		fr.close();
	}

	
	
}
