package level0;

public class 게임369 {
	public static void main(String[] args) {
		int order = 123456789;
		int result = solution(order);
		System.out.println(result);
	}

	private static int solution(int order) {
		String ordStr = Integer.toString(order);
		String [] ordStrArr  = ordStr.split("");
		int cnt = 0;
		for(int i = 0 ; i< ordStrArr.length; i++) {
			if( Integer.parseInt(ordStrArr[i]) == 3 || 
				Integer.parseInt(ordStrArr[i]) == 6 ||
				Integer.parseInt(ordStrArr[i]) == 9) {
				cnt++;
			}
		}
		return cnt;
	}

}
