package level0;

public class 배열두배만들기 {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 };
		int[] result = solution(numbers);
		
	}
//정수 배열 numbers가 매개변수로 주어집니다. numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.
	private static int[] solution(int[] numbers) {
        int[] answer = new int [numbers.length];
        for( int i = 0; i<numbers.length;i++) {
        	answer[i] = numbers[i]*2;
        }
        return answer;
	}
}
