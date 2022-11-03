package level0;

public class 점의위치구하기 {

	public static void main(String[] args) {
		int[] dot = { -2, -4 };

		int result = solution(dot);
		System.out.println(result);
	}
//사분면은 한 평면을 x축과 y축을 기준으로 나눈 네 부분입니다. 사분면은 아래와 같이 1부터 4까지 번호를매깁니다
	private static int solution(int[] dot) {
		if (dot[0] > 0 && dot[1] > 0) {
			return 1;
		} else if (dot[0] < 0 && dot[1] > 0) {
			return 2;
		} else if (dot[0] < 0 && dot[1] < 0) {
			return 3;
		} else {
			return 4;
		}
	}
}
