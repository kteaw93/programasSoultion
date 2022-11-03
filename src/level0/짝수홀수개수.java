package level0;

public class 짝수홀수개수 {

	public static void main(String[] args) {
		int[] num_list = { 1, 2, 3, 4, 5 };

		int[] result = solution(num_list);
		System.out.println(result[0]+"홀수개수" +result[1]);

	}

//정수가 담긴 리스트 num_list가 주어질 때, num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
	private static int[] solution(int[] num_list) {
		int[] answer = {0,0};
		
		for (int i = 0; i < num_list.length; i++) {
			if (num_list[i] % 2 == 0) {
				answer[0]++;
			} else {
				answer[1]++;
			}
		}
		return answer;
	}
}
