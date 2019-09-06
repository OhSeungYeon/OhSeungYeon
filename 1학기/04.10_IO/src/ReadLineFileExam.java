import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineFileExam {
	public static void main(String[] args) {
		//파일 읽게 연결
		FileReader fr;
		try {
			fr = new FileReader("src/dataw.txt");
			//버퍼 읽게 연결
			BufferedReader br = new BufferedReader(fr);
			//한 줄 읽기
			String s;
			while((s = br.readLine()) != null) {
				//화면 출력
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
