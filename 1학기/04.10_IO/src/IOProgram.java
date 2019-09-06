import java.io.IOException;
import java.util.Scanner;

public class IOProgram {

	public static void main(String[] args) {
		
//		Scanner scanner = new Scanner(System.in);
//		String inputString = scanner.nextLine();
//		System.out.println(inputString);
//		System.err.println(inputString);
		
		int bt;
		try {
			while((bt = System.in.read()) != -1) { //System.in.read는 한글은 깨져서 나온다.
				System.out.print((char)bt);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
