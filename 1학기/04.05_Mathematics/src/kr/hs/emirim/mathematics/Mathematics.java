package kr.hs.emirim.mathematics;

import java.util.Random;

public class Mathematics {

	public static void main(String[] args) {
		
		//abs : 절댓값
		System.out.println(Math.abs(25));  
		System.out.println(Math.abs(-25));
		System.out.println(Math.abs(25.5));
		System.out.println(Math.abs(-25.5));
		System.out.println("---------------------");
		
		//round() : 반올림
		System.out.println(Math.round(25));
		System.out.println(Math.round(25.3));
		System.out.println(Math.round(25.5));
		System.out.println(Math.round(-25.4)); //마이너스 주의 
		System.out.println(Math.round(-25.5));
		System.out.println(Math.round(-25.6));
		System.out.println("---------------------");
		
		//pow() : 앞에 꺼를 뒤에 꺼 만큼 제곱 (정수여도 실수로 계산 실수면 실수로 계산) 
		//pow는 power의 줄임말
		System.out.println(Math.pow(3, 2));
		System.out.println(Math.pow(3.0f, 2.0f));
		System.out.println(Math.pow(5.0, 2));
		System.out.println(Math.pow(-5.0, 3.0));
		System.out.println("-------------------------");
		
		//sqrt() : 제곱근(정수도 실수로 계산)
		//sqare root의 줄임말
		System.out.println(Math.sqrt(9));
		System.out.println(Math.sqrt(9.0f));
		System.out.println(Math.sqrt(9.0));
		System.out.println(Math.sqrt(-9.0)); //마이너스의 제곱근은 없어서 Nan으로 뜸
		System.out.println("------------------------");
		
		//random() : 랜덤
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println((int)(Math.random()*5));
		System.out.println((int)(Math.random()*5)); //0부터 4까지의 임의의 정수 (0<=x<1) 이식에다가 *5를 곱하면 된다.
		System.out.println((int)(Math.random()*10)); //0부터 9까지의 임의의 정수
		System.out.println((int)(Math.random()*100)); //0부터 99까지의 임의의 정수
		
		
		//Random 클래스
		Random random = new Random();
		int randomNumber = random.nextInt(100); //0부터 99가지의 임의의 정수
		int start = 100;
		int end = 999;
		int randomNumber100to999 = random.nextInt(end-start+1) + start; //start~end까지임의의 정수

	}

}
