import java.io.*;

public class inputReaderExam {

	public static void main(String[] args) {

		InputStreamReader reader = new InputStreamReader(System.in);
		while(true) {
			int i;
			try {
				i = reader.read();
				if(i == -1) break;  //Ctrl+z를 누르면 실행 중지
				char c = (char)i;
				System.out.print(c);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println(); 
		
	}

}
