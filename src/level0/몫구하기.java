package level0;

public class 몫구하기 {

	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 0;
		
		int result = soultion(num1 , num2);
		System.out.println(result);
		
	}
	//정수 num1, num2가 매개변수로 주어질 때, num1을 num2로 나눈 몫을 return 하도록 solution 함수를 완성해주세요.
	private static int soultion(int num1, int num2) {
		int answer = 0;
		if(num2 !=0) {
			answer = num1/num2;
		}
		return answer;
	}
	
}
