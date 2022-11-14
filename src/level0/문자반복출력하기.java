package level0;

public class 문자반복출력하기 {

	public static void main(String[] args) {
		String my_string = "hello";
		int n = 3;
		String result = solution(my_string,n);
		System.out.println(result);
	}

	private static String solution(String my_string,int n) {
		String [] arr = my_string.split("");
		String result = "";
		for(int i = 0; i< arr.length;i++) {
			for( int j = 0; j< n; j++) {
				result += arr[i];
			}
		}
		return result;
	}
}
