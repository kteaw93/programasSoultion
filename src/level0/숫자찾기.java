package level0;

import java.util.ArrayList;

public class 숫자찾기 {

	public static void main(String[] args) {

		int num = 232443;
		int k = 4;

		int result = solution(num, k);
		System.out.println(result);
	}

	private static int solution(int num, int k) {
        int answer = 0;

        String str = String.valueOf(num);

        answer = str.indexOf(String.valueOf(k));

        if (answer < 0) {

            return answer;

        } else {

            return answer + 1;

        }
	}
}
