package org.interview;

public class FindNumber {

	public static void main(String[] args) {
		
		int a[]= {4,5,8,6,7,2};
		
		System.out.print("The array is : ");
		
		System.out.print("{");
		for (int i = 0; i < a.length; i++) {
			
			System.out.print(a[i]);
			if (i!=a.length-1) {
				
				System.out.print(",");
			}
			
		}
		System.out.println("}");
		
		System.out.println("The number in fifth position is : "+a[4]);
	}
}
