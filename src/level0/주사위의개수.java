package level0;

public class 주사위의개수 {
	public static void main(String[] args) {
		int[] box = {10,8,6};
		int n = 3;
		int result = solution(box, n);
		System.out.println(result);
		
	}

	private static int solution(int[] box, int n) {
		int result = 1;
		for(int i = 0 ; i< box.length; i++) {
			result = result * (box[i]/n);
		}
		return result;
	}
}
