package level0;

public class 배열뒤집기 {

	public static void main(String[] args) {
		int[] num_list = {1, 2, 3, 4, 5};
		int[] result = solution(num_list);
		for(int i = 0; i< result.length;i++) {
			System.out.println(result[i]);
		}
	}

	private static int[] solution(int[] num_list) {
		int[] answer = new int[num_list.length];
		for(int i = 1; i<= num_list.length; i++) {
			answer[i-1] = num_list[num_list.length - i];
		}
		return answer;
	}
}
