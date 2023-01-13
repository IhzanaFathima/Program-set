package org.interview;

import java.util.Scanner;

public class StudDetailsUsingScanner {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Student Id : ");
		int studId = s.nextInt();
		s.nextLine();
		
		System.out.println("Enter Student Name : ");
		String studName = s.nextLine();
		
		System.out.println("Enter the marks of 5 subjects : ");
		
		int total=0,avg;
		int mark[] = new int[5];
		
		for (int i = 0; i < 5; i++) {
			
			mark[i] = s.nextInt();
			total=total+mark[i];
		}
		
		avg=total/5;
		System.out.println("Student ID : "+studId);
		System.out.println("Student Name : "+studName);
		
		System.out.println("Marks of 5 subjects : ");
		for (int i = 0; i < 5; i++) {
			
			System.out.println(mark[i]);
		}
		
		System.out.println("Total Marks obtained : "+total);
		System.out.println("Average of Marks : "+avg);

	}
}
