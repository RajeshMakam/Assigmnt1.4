package datatypecast;

import java.util.Scanner;



public class DataTypeCast {
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		byte numbyte = userInput.nextByte();
		short numshort = userInput.nextShort();
	    int i = (int)numbyte+numshort;
	    System.out.println("Integer "+i);
	    long l = (long)numshort+i;
	    System.out.println("Long "+l);
	}
}


