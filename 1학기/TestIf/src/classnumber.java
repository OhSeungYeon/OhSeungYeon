import java.util.*;

public class classnumber {

	public static void main(String args[]) {
		
//		Scanner sc = new Scanner(System.in);
//		int number = 0;
//		System.out.println("번호를 입력하세요 (ex.2301) : ");
//		number = sc.nextInt();
		
//		switch(number) {
//			case 2301: System.out.println("강지민");break;
//			case 2302: System.out.println("강혜정");break;
//			case 2303: System.out.println("김가영");break;
//			case 2304: System.out.println("김나영");break;
//			case 2305: System.out.println("김선옥");break;
//			case 2306: System.out.println("김수진");break;
//			case 2307: System.out.println("류정민");break;
//			case 2308: System.out.println("박교령");break;
//			case 2309: System.out.println("서남경");break;
//			case 2310: System.out.println("오승연");break;
//			case 2311: System.out.println("원예린");break;
//			case 2312: System.out.println("원채린");break;
//			case 2313: System.out.println("이서현");break;
//			case 2314: System.out.println("이채린");break;
//			case 2315: System.out.println("이현수");break;
//			case 2316: System.out.println("임현진");break;
//			case 2317: System.out.println("장유경");break;
//			case 2318: System.out.println("장원이");break;
//			case 2319: System.out.println("한다연");break;
//			case 2401: System.out.println("강은서");break;
//			case 2402: System.out.println("곽가연");break;
//			case 2403: System.out.println("김민지");break;
//			case 2404: System.out.println("김봄이");break;
//			case 2405: System.out.println("김소현");break;
//			case 2406: System.out.println("김채민");break;
//			case 2407: System.out.println("남정윤");break;
//			case 2408: System.out.println("박서연");break;
//			case 2409: System.out.println("서혜림");break;
//			case 2410: System.out.println("신채린");break;
//			case 2411: System.out.println("양수빈");break;
//			case 2412: System.out.println("엄하늘");break;
//			case 2413: System.out.println("원채연");break;
//			case 2414: System.out.println("윤수빈");break;
//			case 2415: System.out.println("임태희");break;
//			case 2416: System.out.println("전은정");break;
//			case 2417: System.out.println("정유경");break;
//			case 2418: System.out.println("함지현");break;
//		}
		
		String[] 반3 = {"강지민", "강혜정", "김가영", "김나영", "김선옥", "김수진", "류정민", "박교령", "서남경", "오승연", "원예린", 
							"원채린", "이서현", "이채린", "이현수", "임현진", "장유경", "장원이", "한다연"};
				System.out.println("번호를 입력하세요 : ");
				
		Scanner sc = new Scanner(System.in);
//			while(true) {
//				int number = sc.nextInt();
//				//i<=number<=18
//				if(1<=number && number<=반3.length) { 
//					System.out.println(반3[number-1]);
//				}
//				else {
//					break;
//				}
//		}
			
		//for문
//		for(int i=0; i<반3.length; i++) {
//			System.out.println(반3[i]);
//		}
		
		//for each문(훨씬 간단하다) -> 인덱스가 필요하면 for문을 사용해야함
		for(String name:반3) {
			System.out.println(name);
		}
		
		
	}
	
}
