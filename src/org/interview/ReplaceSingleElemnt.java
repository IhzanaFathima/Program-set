package org.interview;

public class ReplaceSingleElemnt {

	public static void main(String[] args) {
		
		int a[]= {200,600,100,700,900};
		
		for (int i = 0; i < a.length; i++) {
			
			if (a[i]==100) {
				
				a[i]=150;
			}
		}
		
		System.out.println("New List : ");
		
		for (int i = 0; i < a.length; i++) {
		
			System.out.println(a[i]);
		}
	}
}
