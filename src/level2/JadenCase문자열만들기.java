package level2;

public class JadenCase문자열만들기 {

	public static void main(String[] args) {
		String s = "3people unFollowed me";
		String result = solution(s);
	}

	private static boolean numOrStr(String wordArray) {
		try {
			Double.parseDouble(wordArray);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	private static String solution(String s) {
		/*
		 * s.indexOf(" "); System.out.println(s.indexOf(" "));
		 */
		String answer = "";
		String[] tempArray = s.split(" ");
		for (int i = 0; i < tempArray.length; i++) {
			String[] wordArray = tempArray[i].split("");

			if (numOrStr(wordArray[0]) == true) {
				answer += tempArray[i];
			} else {
				wordArray[0] = wordArray[0].toUpperCase();
				answer += " " + tempArray[i];
			}
		}
		System.out.println(answer);
		return null;
	}

}
