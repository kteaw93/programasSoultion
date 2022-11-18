package level0;

public class 중복된문자제거 {
	
	public static void main(String[] args) {
		String my_string = "we are the world";
		String result = solution(my_string);
		System.out.println(result);
	}

	private static String solution(String my_string) {
		String answer = "";
		
		for (int i = 0; i < my_string.length(); i++) {
			if(my_string.indexOf(my_string.charAt(i)) == i) {
				answer += my_string.charAt(i);
			}
		}
		return answer;
	}
}
