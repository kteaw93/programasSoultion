package level0;

import java.util.Arrays;

public class 삼각형의완성조건1 {

	public static void main(String[] args) {
	
		int[] sides= {3, 6, 2};
		
		int result = solution(sides);
		System.out.println(result);
	}

	private static int solution(int[] sides) {
		Arrays.sort(sides); 
		if(sides[0] + sides[1] > sides[2]) {
			return 1;
		}else {
			
			return 2;
		}
	}

}
