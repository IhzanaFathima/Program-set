package org.interview;

public class OddEvenNumbers {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		
        System.out.print("The array is : ");
		
		System.out.print("{");
		for (int i = 0; i < a.length; i++) {
			
			System.out.print(a[i]);
			if (i!=a.length-1) {
				
				System.out.print(",");
			}
			
		}
		System.out.println("}");
		
		System.out.println("Odd Numbers : ");
		
        for (int i = 0; i < a.length; i++) {
			
			if (a[i]%2!=0) {
				
				System.out.println(a[i]);
				
			} 
	    }
		
		System.out.println("Even Numbers : ");
		
        for (int j = 0; j < a.length; j++) {
			
			if (a[j]%2==0) {
				
				System.out.println(a[j]);
				
			} 
	    }
	}
}
