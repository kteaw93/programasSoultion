package level0;

import java.util.Arrays;

public class 최댓값만들기2 {
	public static void main(String[] args) {
		
		int[]  numbers = {-16, 31, 24, 10, 1, 9}; 
		
		int result = solution(numbers);
		int result1 = solution1(numbers);
		
		System.out.println(result1);
	}

	private static int solution1(int[] numbers) {
        int answer = 0;
        int num = 0;
        for(int i = 0; i < numbers.length;i++){
            for(int j = i + 1;j < numbers.length;j++){
                num = numbers[i] * numbers[j];
                if(num >= answer){
                    answer = num;
                } else if(answer == 0){
                    answer = numbers[i] * numbers[j];
                }
            }
        }

        return answer;
	}

	private static int solution(int[] numbers) {

		Arrays.sort(numbers);
		if( numbers[0]*numbers[1] > numbers[numbers.length-1]*numbers[numbers.length-2]) {
			return numbers[0]*numbers[1] ;
		}else {
			return numbers[numbers.length-1]*numbers[numbers.length-2];
		}
	}
}
