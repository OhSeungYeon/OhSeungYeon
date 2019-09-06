
public class p151_tryCatch {

	public static void main(String[] args) {
		
		String[] irum = new String[3];
		irum[0] = "이채린";
		irum[1] = "원채린";
		irum[2] = "서남경";
		
		//try.catch문이 없으면 배열의 방은 0~2까지 있는데 length가 1~3까지 있어서 방 하나가 남아서 오류가 나게 된다.
		//하지만 try.catch을 하면 전체적인 오류 발생이 아닌 예외 발생시 예외 발생을 출력해낸다.
		try {
			for(int i=0; i<=irum.length; i++) {
				System.out.println(irum[i]);
			}			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외 발생");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("익셉션");
		} finally {
			System.out.println("무조건 실행합니다.");
		}

	}

}
