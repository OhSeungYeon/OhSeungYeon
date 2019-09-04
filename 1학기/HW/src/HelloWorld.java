
public class HelloWorld {

	public static void main(String[] args) {

		System.out.println("Hello World!");
		System.out.println(~5);
		System.out.println(5>>2);   //1 (2칸을 오른쪽으로 밀고 남은 자리는 0으로 채운다)
		System.out.println(5>>3);   //0
		// 5>>3은 밀려난 수가 01 이니깐 최초의 첫째자리 0으로 채워주면 값은 0이된다
		System.out.println(5<<2);   //20 (2칸을 왼쪽으로 민다)
		System.out.println(5>>>2);  //1 
		System.out.println(-5>>2);  //-2 (5를 2의 보수로 바꿔준 다음 오른쪽으로 2칸 민다)
		//2의 보수 -> 원래 숫자를 반대로 바꾼다음(1의 보수) -> 1을 더해준다(2의 보수)
		// >> (밀기전의 최초 첫째자리 값과 동일한 값으로 채워진다는 것)
		System.out.println(-5>>>2); //1073741822
		// >>> (밀려서 빈 자리는 무조건 0으로 채워진다는 것)
		
		System.out.println("---------------");
		System.out.println(false||false);
		System.out.println(false||true);
		System.out.println(true||false);
		System.out.println(true||true);
		System.out.println(!true); //false (Not 연산자)
		
	}
}
