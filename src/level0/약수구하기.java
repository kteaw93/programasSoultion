package level0;

import java.util.ArrayList;

public class 약수구하기 {

	public static void main(String[] args) {
		int n = 24;
		int [] result = solution(n);
		for(int i = 0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}

	private static int[] solution(int n) {
		
		ArrayList<Integer> result = new ArrayList<>();
		for(int i = 1; i<= n ; i++) {
			if(n%i ==0) {
				result.add(i);
			}
		}
		return result.stream().mapToInt(i->i).toArray();
	}
}
