package org.interview;

import java.util.Scanner;

public class ReverseOfString {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String str = "Inmakes Infotech";
		String rev = "";
		
		System.out.print("The reverse of the string 'Inmakes Infotech' is : ");
		for (int i = str.length()-1; i >= 0; i--) {
			
			System.out.print(str.charAt(i));
		}
		System.out.println();
	}
}
