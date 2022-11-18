package level0;

import java.util.ArrayList;
import java.util.Arrays;

public class 나누어떨어지는숫자배열 {
	public static void main(String[] args) {
		
		int arr [] = {5,9,7,10};
		int divisor = 5;
		int []result = solution(arr,divisor);
		for(int i = 0; i<result.length;i++) {
			System.out.println(result[i]);
		}
		
	}

	private static int[] solution(int[] arr, int divisor) {
		ArrayList<Integer> arrStr = new ArrayList<>();
		int temp = 0;
		for(int i= 0; i<arr.length;i++) {
			if(arr[i]%divisor ==0) {
				arrStr.add(arr[i]);
				temp ++;
			}
		}
		if(temp==0) {
			arrStr.add(-1);
		}
		int []result =arrStr.stream().mapToInt(i->i).toArray();
		Arrays.sort(result);
		return result;
	}
}
