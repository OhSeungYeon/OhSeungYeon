import java.io.IOException;

public class ReadFromSysExam {

	public static void main(String[] args) {
		
		byte[] b = new byte[1024];
		int len = 0;
		try {
			len = System.in.read(b); //원래는 이렇게 읽다가
		} catch (IOException e) { //IOException 오류가 발생하면 catch
			e.printStackTrace();
		}
		System.out.write(b, 0, len);

	}

}
