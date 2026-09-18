package assignment8;

import java.util.*;
import java.io.*;

public class StringBased {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sc.nextLine();

        str = str.toLowerCase();

        FileWriter fw = new FileWriter("cdac.txt");
        fw.write(str);
        fw.close();

        BufferedReader br = new BufferedReader(new FileReader("cdac.txt"));
        String fileData = br.readLine();
        br.close();

        int vowels = 0, consonants = 0;

        for (int i = 0; i < fileData.length(); i++) {
            char ch = fileData.charAt(i);
            if (Character.isLetter(ch)) {

                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } 
                else {
                    consonants++;
                }
            }
        }

        String[] arr = fileData.split("\\s+");
        String longestWord = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (longestWord.length() < arr[i].length()) {
                longestWord = arr[i];
            }
        }
        String rev = "";
        for (int i = 0; i < fileData.length(); i++) {
            char c = fileData.charAt(i);
            rev = c + rev;
        }
        System.out.println("Number of Words : " + arr.length);
        System.out.println("Number of Vowels : " + vowels);
        System.out.println("Number of Consonants : " + consonants);
        System.out.println("Longest Word : " + longestWord);
        System.out.println("Reversed : " + rev);
        System.out.println("UpperCase : " + fileData.toUpperCase());
        sc.close();
    }
}