package level2;

public class JadenCase문자열만들기 {

	public static void main(String[] args) {
		String s = "3people unFollowed me";
		String result = solution(s);
	}

	// 첫번째 단어 숫자인지 문자인지
	private static boolean numOrStr(String wordArray) {
		try {
			Double.parseDouble(wordArray);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	// 단어하나씩 빼서 변환시키
	private static String wordCh(String[] wordArray) {
		String word = "";
		if (numOrStr(wordArray[0]) == true) {
			// answer += tempArray[i];
			word += wordArray[0];

			for (int i = 1; i < wordArray.length; i++) {
				word += wordArray[i];
			}
		} else {
			word += wordArray[0].toUpperCase();
			for (int i = 1; i < wordArray.length; i++) {
				word += wordArray[i];
			}
		}

		return word;
	}

	private static String solution(String s) {
		s = s.toLowerCase();
		String answer = "";
		String[] tempArray = s.split(" ");
		for (int i = 0; i < tempArray.length; i++) {
			String[] wordArray = tempArray[i].split("");
			if (i != tempArray.length - 1) {
				answer += wordCh(wordArray) + " ";
			} else {
				answer += wordCh(wordArray);
			}

		}
		System.out.println(answer);
		return answer;
	}

}
