package level0;

public class 아이스아메리카노 {
	public static void main(String[] args) {
		int money = 5500;
		int[] result = solution(money);
	}

	//아메리카노가격  5500 결과값 몇잔사는지 , 나머지 돈 
	private static int[] solution(int money) {
		int [] answer = new int[2];
		answer[0] = money/5500;
		answer[1] = money%5500;
		
		return answer;
	}
}
