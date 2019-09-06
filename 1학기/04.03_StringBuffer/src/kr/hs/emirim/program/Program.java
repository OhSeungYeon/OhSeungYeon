package kr.hs.emirim.program;

public class Program {

	public static void main(String args[]) {
		
		StringBuffer sb1 = new StringBuffer(" Java Programming");
		StringBuffer sb2 = new StringBuffer(" Project");
		StringBuffer str1 = null;
		StringBuffer str2 = null;
		str1 = sb1.append(" Project"); //str1은 여기서 Java Programming Project
		str2 = sb1.append(sb2); //근데 여기서 한 번더 append, str1에 다시 sb2인 Project를 가져다가 붙이게 된다.
		System.out.println("sb1 = " + sb1);
		System.out.println("sb2 = " + sb2);
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);
		System.out.println("--------------------------------");
		
		//replace
		StringBuffer sb3 = new StringBuffer("Funny Java");
		StringBuffer sb4 = null;
		sb4 = sb3.replace(0, 5, "Happy"); //0번째에서 5번째까지의 글씨가 Happy 로 바뀐다. 만약 한 글자가 작은 good 으로 하게 되면 그냥 good Java로 한글자 보충해서 바꿔준다.
		System.out.println("sb3 = " + sb3);
		System.out.println("sb4 = " + sb4);
		System.out.println("--------------------------------");
		
		//reverse
		StringBuffer sb5 = sb4.reverse();
		System.out.println("sb5 = " + sb5); //거꾸로 출력
		
		//toString
		String str6 = sb5.toString().toUpperCase();
		System.out.println("str6 = " + str6);
		
		//String - > StringBuffer
		//new StringBuffer(String)
		//StringBuffer -> String
		//.toString()
		
		
	}
	
}
