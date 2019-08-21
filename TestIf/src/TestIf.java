import java.util.Scanner;

public class TestIf {

	public static void main(String args[]) {

		// int member = 1;
		// if문으로 member가 5이면, itzy 출력
		// member가 7이면, BTS 출력
		// member가 9이면, EXO 출력
		// member가 1이면, IU 출력
		// member가 13이면, Seventeen 출력

		// 1. if문

//		if(member == 5) 
//			System.out.println("itzy");
//		else if(member == 7) 
//			System.out.println("BTS");
//		else if(member == 9 ) 
//			System.out.println("EXO");
//		else if(member == 1) 
//			System.out.println("IU");
//		else if(member == 13)
//			System.out.println("Seventeen");
//		
		// 2. switch문

//		switch(member) {
//		
//		case 5 : System.out.println("itzy"); break;
//		case 7 : System.out.println("BTS"); break;
//		case 9 : System.out.println("EXO"); break;
//		case 1 : System.out.println("IU"); break;
//		case 13 : System.out.println("Seventeen"); break;
//
//		}

//		System.out.println("----------------------------");

		// 반복문
		// 구구단을 출력하자!

//		System.out.println("<구구단 2단>");

		// for문

//		int i = 2;
//			for(int j=1; j<=9; j++) {
//				System.out.println(i + " X " + j + " = " + i*j);
//			}

		// while문

//		int i = 2;
//		int j = 1;
//		while(j<=9) {
//			System.out.println(i + " X " + j + " = " + i*j);
//			j++;
//		}
//		
//		System.out.println("--------------------");

		// for-each문
//		int arr[] = new int[] {5, 7, 9, 1, 13};
//		for(int a : arr) { //arr을 꺼내오는데 잠시 꺼내오는 임시 방을 a라고 함, 그렇게 차례대로 한다면 처음에는 5가 찍히고 하나씩 바뀔 것이다.
//			System.out.println(a + ""); //a+"" : 숫자랑 문자열을 더하면 문자열로 바뀐다. 숫자를 문자열로 바꿀 수 있는 가장 편한 방법
//			member = a;
//			if(member == 5) 
//				System.out.println("itzy");
//			else if(member == 7) 
//				System.out.println("BTS");
//			else if(member == 9 ) 
//				System.out.println("EXO");
//			else if(member == 1) 
//				System.out.println("IU");
//			else if(member == 13)
//				System.out.println("Seventeen");
//		}	

//		System.out.println("-----------------------");
		// 입력받자

		Scanner sc = new Scanner(System.in);
		int member = 0;

	
//		System.out.print("멤버 수를 입력하세요 : ");
//
//		member = sc.nextInt();
//
//		if (member == 5)
//			System.out.println("itzy");
//		else if (member == 7)
//			System.out.println("BTS");
//		else if (member == 9)
//			System.out.println("EXO");
//		else if (member == 1)
//			System.out.println("IU");
//		else if (member == 13)
//			System.out.println("Seventeen");
		
//			while(true) {
//				
//				System.out.print("멤버 수를 입력하세요 : ");
//				member = sc.nextInt();
//				
//				if(member==5 || member==7 || member==9 || member==1 || member==13) {
//					if (member == 5)
//						System.out.println("itzy");
//					else if (member == 7)
//						System.out.println("BTS");
//					else if (member == 9)
//						System.out.println("EXO");
//					else if (member == 1)
//						System.out.println("IU");
//					else if (member == 13)
//						System.out.println("Seventeen");
//				}
//				else 
//					break;
//			}
			
		
		//for문으로 
		
			for(boolean i; i = true;) {
				
				System.out.print("멤버 수를 입력하세요 : ");
				member = sc.nextInt();
				
				if(member==5 || member==7 || member==9 || member==1 || member==13) {
					if (member == 5)
						System.out.println("itzy");
					else if (member == 7)
						System.out.println("BTS");
					else if (member == 9)
						System.out.println("EXO");
					else if (member == 1)
						System.out.println("IU");
					else if (member == 13)
						System.out.println("Seventeen");
				}
				else 
					break;
			}

	}

}
