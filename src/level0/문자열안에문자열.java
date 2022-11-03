package level0;

public class 문자열안에문자열 {

	public static void main(String[] args) {
		String str1 ="ab6CDE443fgh22iJKlmn1o";
		String str2 ="DE44";
		int result = solution(str1,str2);
		System.out.println(result);
	}
//문자열 str1, str2가 매개변수로 주어집니다. str1 안에 str2가 있다면 1을 없다면 2를 return하도록 solution 함수를 완성해주세요.
	private static int solution(String str1, String str2) {
		
		if(str1.indexOf(str2) != -1) { return 1; }
		else { return 2; }
	}
	
}
