package nestedloops;

import java.util.Scanner;

public class CharacterPattern {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number of rows");
	int rows = sc.nextInt();
	System.out.println("Enter number of columns");
	int columns = sc.nextInt();
	printPyramid(rows,columns);
}
	public static void printPyramid(int rows,int columns) {
	for (int i=1;i<=rows;i++) {
		for(int k=1;k>i;k++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print((char)(j+64)+" ");
		}
		System.out.println();	
	}
	}
	}

	/*public static void main(String[] args) {
		for (int i=68;i>=65;i--) {
			for(int k=68;k>=i;k--) {
				System.out.print(" ");
			}
			for(int j=65;j<=i;j++) {
				System.out.print((char)i+" ");
			}
			
			System.out.println();
			}
			}
			}*/
