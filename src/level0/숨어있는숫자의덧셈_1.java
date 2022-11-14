package level0;

public class 숨어있는숫자의덧셈_1 {

	public static void main(String[] args) {
		String my_string ="aAb1B2cC34oOp";
		
		int result = solution(my_string);
		System.out.println(result);
	}

	private static int solution(String my_string) {
		String []arr = my_string.split("");
		int result = 0;
		for(int i = 0; i< arr.length; i++) {
			char check = arr[i].charAt(0);
			if( check > 48 && check < 58)
			{
				
				result+= Integer.parseInt(arr[i]);
			}
		}
		return result;
	}
}
