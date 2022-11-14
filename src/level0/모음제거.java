package level0;

public class 모음제거 {

	public static void main(String[] args) {
		String my_string = "aeouik";
		
		String result = solution(my_string);
		
	}

	private static String solution(String my_string) {
		
		String result = my_string.replaceAll("[aieou]","");

		return result;
	}

	
}
