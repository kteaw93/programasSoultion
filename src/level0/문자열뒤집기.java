package level0;

public class 문자열뒤집기 {
	public static void main(String[] args) {
		String my_string = "jaron";
		String result = solution(my_string);
		System.out.println(result);
	}
//문자열 my_string이 매개변수로 주어집니다. my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.
	private static String solution(String my_string) {
		return new StringBuffer(my_string).reverse().toString();
	}
}
