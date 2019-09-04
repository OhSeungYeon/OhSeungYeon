package kr.hs.emrim.studentnumbertomajor;

import java.util.Scanner;

public class StudentNumberToMajor {

	public static void main(String[] args) {
		
		String number;
		System.out.println("학번을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		number = sc.nextLine();
		
//		String number2 = number.substring(0, 1);
		
		//틀림././///
//		if(number2.equals("11") || number2.equals("11")) {
//			System.out.println("뉴미디어소프트웨어과");
//		}
//		else if(number2.equals("13") || number2.equals("14")) {
//			System.out.println("뉴미디어웹솔루션과");
//		}
//		else if(number2.equals("15") || number2.equals("16")) {
//			System.out.println("뉴미디어디자인과");
//		}
//		else if(number2.equals("21") || number2.equals("22")) {
//			System.out.println("뉴미디어소프트웨어과");
//		}
//		else if(number2.equals("23") || number2.equals("24")) {
//			System.out.println("뉴미디어웹솔루션과");
//		}
//		else if(number2.equals("25") || number2.equals("26")) {
//			System.out.println("뉴미디어디자인과");
//		}
//		else if(number2.equals("31") || number2.equals("32")) {
//			System.out.println("인터렉티브미디어과");
//		}
//		else if(number2.equals("33") || number2.equals("34")) {
//			System.out.println("뉴미디어디자인과");
//		}
//		else if(number2.equals("35") || number2.equals("36")) {
//			System.out.println("뉴미디어솔루션과");
//		}
//		else {
//			System.out.println("잘못 입력하셨습니다.");
//		}
		
		
		//선생님 해설
		if(number.substring(0, 1).equals("3")) { //3학년일때
			if(number.substring(1, 2).equals("1") || number.substring(1, 2).equals("2")) {
				System.out.println("인터렉티브미디어과");
			}
			else if(number.substring(1, 2).equals("3") || number.substring(1, 2).equals("4")) {
				System.out.println("뉴미디어디자인과");
			}
			else if(number.substring(1, 2).equals("5") || number.substring(1, 2).equals("6")) {
				System.out.println("뉴미디어솔루션과");
			}
		}
		else { //1학년, 2학년일때
			if(number.substring(1, 2).equals("1") || number.substring(1, 2).equals("2")) {
				System.out.println("뉴미디어소프트웨어과");
			}
			else if(number.substring(1, 2).equals("3") || number.substring(1, 2).equals("4")) {
				System.out.println("뉴미디어웹솔루션과");
			}
			else if(number.substring(1, 2).equals("5") || number.substring(1, 2).equals("6")) {
				System.out.println("뉴미디어디자인과");
			}
		}
		
		
		

	}

}
