package org.interview;

public class ReplaceElement {

	public static void main(String[] args) {
		
		int a[]= {50,20,60,80,50,40,50};
		
		for (int i = 0; i < a.length; i++) {
			
			if (a[i]==50) {
				
				a[i]=400;
			}
		}
		
		System.out.println("New List : ");
		
		for (int i = 0; i < a.length; i++) {
		
			System.out.println(a[i]);
		}
	}
}
