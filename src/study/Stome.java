package algo;

import java.util.Arrays;
import java.util.HashMap;

public class timePar {

	public static void main(String[] args) {
		// int[] picks = { 1, 3, 2 };
		// String[] minerals = { "diamond", "diamond","diamond", "iron", "iron",
		// "diamond", "iron", "stone" };
		// 결과 =12
		// int []picks = {0,1,1};
		// String []minerals = {"diamond", "diamond", "diamond", "diamond",
		// "diamond","diamond", "diamond", "iron", "iron", "iron", "diamond"};
		// 결과 50
		int[] picks = { 0, 1, 0 };
		String[] minerals = { "diamond", "iron", "iron", "iron", "iron", "diamond", "diamond", "iron", "iron", "iron" };

		int result = Solution(picks, minerals);

	}

	private static int Solution(int[] picks, String[] minerals) {
		HashMap<Integer, String> mineralsTemp = new HashMap<>(); // 5개씩나누기
		HashMap<Integer, Integer> mineralsCntArr = new HashMap<>(); // 5개 나눈것 분류하기
		int[] mineralsCntArr1 = new int[minerals.length / 5 + 1];
		int k = 0; 
		for (int i = 0; i < minerals.length; i++) {
			mineralsTemp.put(i % 5, minerals[i]);
			if (i != 0 && (i + 1) % 5 == 0 || i == minerals.length - 1) {
				mineralsCntArr1[k] = mineralCnt(mineralsTemp); // 갯수구하기
				mineralsTemp = new HashMap<>(); // 초기화
				k++;
			}

		}
		String[] picksString = picksString(picks); // picks문자화
		int result = picksCnt(picksString, mineralsCntArr1); // 결과찾기
		System.out.println(result);
		return result;
	}

	// minerals 5개로 나눠서 숫자로 나열하기
	//100자리숫자 diamond 10자리 iron 1자리 stone
	private static Integer mineralCnt(HashMap<Integer, String> mineralsTemp) {
		int a = 0;
		int b = 0;
		int c = 0;
		for (int i = 0; i < mineralsTemp.size(); i++) {
			String word = mineralsTemp.get(i);
			switch (word) {
			case "diamond":
				a++;
				break;
			case "iron":
				b++;
				break;
			case "stone":
				c++;
				break;
			}

		}
		return a * 100 + b * 10 + c;
	}

	// pciks 문자로 나열하기
	//ex) 1 , 2 , 1 일때 diamond,iron,iron,stone으로만들기
	private static String[] picksString(int[] picks) {
		String[] picksString = new String[picks[0] + picks[1] + picks[2]];
		int k = 0;
		for (int i = 0; i < picks.length; i++) {
			for (int j = 0; j < picks[i]; j++) {
				if (i == 0) {
					picksString[k] = "diamond";
					k++;
				} else if (i == 1) {
					picksString[k] = "iron";
					k++;
				} else {
					picksString[k] = "stone";
					k++;
				}
			}
		}
		return picksString;
	}

	// 결과도출식 곡갱이에따른 피로도 계산하기
	private static int picksCnt(String[] picksString, int[] mineralsCntArr1) {
		// 1.조건 곡갱이가 더많으면 정렬
		if (picksString.length > mineralsCntArr1.length) {
			Arrays.sort(mineralsCntArr1);
		}
		// 2.조건 곡갱이가 광석보다 적을때 가장앞에or 곡갱이숫자만큼 남기기
		//ex ) 광석 15 16 17 18 19 ~ n개 이고 곡갱이가 3개이하 일떄 
		else if (mineralsCntArr1.length - picksString.length > 1) {
			for (int k = 0; k < mineralsCntArr1.length; k++) {
				if (k < picksString.length) {
				} else {
					mineralsCntArr1[k] = 0;
				}
			}
			Arrays.sort(mineralsCntArr1);
		}
		// 3.조건 곡갱이다쓰고도 광석 마지막이 5개이하일때 남을때
		//ex ) 광석 15 16 17 18 19개 이고 곡갱이가 3개일떄 
		else {
			for (int k = 0; k < mineralsCntArr1.length; k++) {
				if (mineralsCntArr1[k] / 100 + (mineralsCntArr1[k] % 100) / 10 + (mineralsCntArr1[k] % 10) == 5) {
				} else {
					mineralsCntArr1[k] = 0;
				}
			}
			Arrays.sort(mineralsCntArr1); 
		}
		
		//결과 도출 식

		int result = 0;
		
		for (int i = 0; i < picksString.length; i++) {
			if (i < mineralsCntArr1.length) {
				if (picksString[i] == "diamond") {
					//다이아몬드일때 계산
					result += mineralsCntArr1[mineralsCntArr1.length - i - 1] / 100 * 1
							   + (mineralsCntArr1[mineralsCntArr1.length - i - 1] % 100) / 10 * 1
							   + (mineralsCntArr1[mineralsCntArr1.length - i - 1] % 10) * 1;
				} else if (picksString[i] == "iron") {
					//광석일떄 계산
					result += mineralsCntArr1[mineralsCntArr1.length - i - 1] / 100 * 5
								+ (mineralsCntArr1[mineralsCntArr1.length - i - 1] % 100) / 10 * 1
								+ (mineralsCntArr1[mineralsCntArr1.length - i - 1] % 10) * 1;
				} else {
					//돌일때 계산
					result += mineralsCntArr1[mineralsCntArr1.length - i - 1] / 100 * 25
								+ (mineralsCntArr1[mineralsCntArr1.length - i - 1] % 100) / 10 * 5
								+ (mineralsCntArr1[mineralsCntArr1.length - i - 1] % 10) * 1;
				}
			} else {
				//오류발생시 잡을것 (문제풀이니까 따로 정의안하고 break;
				break;
			}
		}
		return result;
	}
}
