package level0;

public class 개미군단 {
	public static void main(String[] args) {
		int hp = 999;
		int result = solution(hp);
		System.out.println(result);
	}

	private static int solution(int hp) {
		return hp/5+ (hp%5)/3 +(hp%5)%3;
	}
}
