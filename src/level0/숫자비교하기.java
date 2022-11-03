package level0;

public class 숫자비교하기 {

	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 3;
		
		int result =solution(num1,num2);
		System.out.println(result);
		
	}

	private static int solution(int num1, int num2) {
		if(num1 == num2) {
			return 1;
		}else {
			return -1;
		}
	}
}
