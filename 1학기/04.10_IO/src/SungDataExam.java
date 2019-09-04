import java.io.*;
import java.util.StringTokenizer;

public class SungDataExam {

//	Kim 용산구 100 100 total average
//	Lee 구로구 90 90 total average
//	Choi 강남구 100 100 total average
//	Hong 강서구 90 90 total average
	
	public static void main(String[] args) {
		try {
			//파일 연결하자(Writed.txt)
			FileReader fr = new FileReader("src/Writed.txt");
			//버퍼 연결하자(readLine()하기 위해서)
			BufferedReader br = new BufferedReader(fr);
			//한 줄 읽고, \t로 연결하자
			String csvStr = ""; //모든 내용 \t로 연결한 String
			String tmpStr = ""; //한줄 읽기용 임시 String
			while((tmpStr = br.readLine()) != null) {
				csvStr += tmpStr + "\t";
			}
			//System.out.println(csvStr);
			
			//token으로 나누어 데이터 저장하자
			StringTokenizer parse = new StringTokenizer(csvStr, "\t");
			int length = parse.countTokens() / 4; //총 토큰이 16개인데 4개씩 자르는 것
			String[] name = new String[length];
			String[] address = new String[length];
			double[] math = new double[length];
			double[] english = new double[length];
			double[] total = new double[length];
			double[] avg = new double[length];
			for(int i = 0; i<length; i++) {
				name[i] = parse.nextToken();
				address[i] = parse.nextToken();
				math[i] = Double.parseDouble(parse.nextToken()); //String으로 쪼개는 건데 double로 쪼개고 있어서 오류난다
				english[i] = Double.parseDouble(parse.nextToken()); //double로 형변화해주기
				total[i] = math[i] + english[i];
				avg[i] = total[i] / 2;
			}
			//total, avg 계산하자
			
			//출력하자
			for(int i=0; i<length; i++) {
				System.out.println("이름 : " + name[i] + ", 주소 : " + address[i] + ", 수학 : " + math[i] + 
						", 영어" + english[i] + ", 총점 : " + total[i] + ", 평균 : " + avg[i]);
			} 
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}
