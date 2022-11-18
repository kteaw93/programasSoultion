package level0;

public class 배열회전시키기 {

	public static void main(String[] args) {
		int numbers[] = { 1, 2, 3 };
		String direction = "left";
		int result[] = solution(numbers, direction);
		
		
		for(int i = 0; i< result.length;i++) {
			System.out.println(result[i]);
		}
	}

	private static int[] solution(int[] numbers, String direction) {

		int[] result = new int[numbers.length];
		if (direction.equals("right")) {
			result[0] = numbers[numbers.length-1];
			for (int i = 1; i < numbers.length; i++) {
				result[i] = numbers[i - 1];
			}
		}else {
			for (int i = 0; i < numbers.length-1; i++) {
				result[i] = numbers[i + 1];
			}
			result[numbers.length-1] = numbers[0];
		}
		return result;
	}
}
