package nestedloops;

import java.util.Scanner;

public class PyramidPatterns {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		printPyramid(n);
	}

	public static void printPyramid(int n) {
		
		for (int i=1;i<=n;i++) {
			for(int k=n;k>i;k--) {
				System.out.print(" ");
			}
			for (int j=1;j<=i;j++) {
				System.out.print(i+" ");
				
		}
			
		System.out.println();
		
		/*}
		for (int i=n;i>1;i--) {
			for(int k=n;k>=i;k--) {
			System.out.print(" ");
			}
			for (int j=1;j<i;j++) {
			System.out.print(i+" ");
		}
		System.out.println();*/
		}
		
			
	}

	}
