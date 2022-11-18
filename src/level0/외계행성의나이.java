package level0;

public class 외계행성의나이 {
	
	public static void main(String[] args) {
		int age =22;
		String result = solution(age);
		System.out.println(result);
	}

	private static String solution(int age) {	
        String answer = "";
        char[] alpha = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        while (age >= 1) {
            answer = alpha[age % 10] + "" + answer;
            age /= 10;
        }


        return answer;
	}
}
