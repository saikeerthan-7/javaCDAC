package filehandlingPractice;
import java.io.*;
import java.util.Scanner;


public class Characters {
	public static void main(String[] args) throws Exception {
		
		
//		FileOutputStream fos=new FileOutputStream("filex.txt");
//		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		FileWriter f=new FileWriter("hat.txt");
		 Scanner sc=new Scanner(System.in);
		 
		String str=sc.nextLine();
		
		
		
		
		f.write(str);
		
		f.close();
		
		FileReader fr=new FileReader("hat.txt");
		
		int ch;
		while((ch=fr.read())!=-1) {
			System.out.print((char) ch);
		}
		
		int upper = 0, lower = 0, spaces = 0 ,specialcharc=0,digits=0;
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
				if(Character.isUpperCase(c)) {
					upper++;
				}
				

				else if(Character.isLowerCase(c)) {
					lower++;
				}
				

				else if(Character.isWhitespace(c)) {
					spaces++;
				}
				
				else if(Character.isDigit(c)) {
					digits++;
			}
				
				else {
					specialcharc++;
				}
		}
		
		
		System.out.println("Uppercase letters :" + upper);
		System.out.println("Lower letters :" + lower);
		System.out.println("spaces letters :" + spaces);
		System.out.println("digits letters :" + digits);
		System.out.println("Special letters :" + specialcharc);
		fr.close();
		
	}
	
	
	
	
}
