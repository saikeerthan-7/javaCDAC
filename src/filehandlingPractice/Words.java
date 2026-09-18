package filehandlingPractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Words {
	
	public static void main(String[] args) throws Exception {
//		FileWriter fw=new FileWriter("Word.txt");
//
//		Scanner sc=new Scanner(System.in);
//		String str=sc.nextLine();
//		
//		BufferedWriter bw=new BufferedWriter(fw);
//		bw.write(str);
//		
//		FileReader fr=new FileReader(str);
//		BufferedReader br=new BufferedReader(fr);
//		
	
		try {
			
			FileWriter fw=new FileWriter("Word.txt");

			Scanner sc=new Scanner(System.in);
			String str=sc.nextLine();
			
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write(str);
			
			FileReader fr=new FileReader(str);
			BufferedReader br=new BufferedReader(fr);
		
		
		String[] arr = str.split("//s+");
		System.out.println(arr.length);
		}catch(Exception e) {
			
		}
		
		}
		
	
	
	
	
	
	
}
