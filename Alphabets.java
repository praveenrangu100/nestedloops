package nestedloops;

public class Alphabets {

	public static void main(String[] args) {
		printPattern();

	}

	public static void printPattern() {
		for(int i = 1; i <= 7;i++) {
			for(int j = 1; j <= 7;j++) {
				if((i != 1 && (j == 1  || j == 7)) ||(i == 1 && j % 2 == 0) ||(i == 4 && j % 2 != 0) ) {
					System.out.print("A");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}

	}

}
