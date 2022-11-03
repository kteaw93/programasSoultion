package level5;

import java.util.Arrays;

public class 직사각형의넓이 {

	public static void main(String[] args) {
		//int[][] sizeAdd = { { 0, 1, 4, 4 }, { 3, 1, 5, 3 } };
		 int[][] sizeAdd = {{1, 1, 6, 5}, {2, 0, 4, 2}, {2, 4, 5, 7}, {4, 3, 8, 6}, {7, 5, 9, 7}};

		int result = solution(sizeAdd);
		System.out.println(result);
	}

	private static int solution(int[][] sizeAdd) {

		int arr[][] = new int[size(sizeAdd, 'x')][size(sizeAdd, 'y')];
		int sum = 0;
		for (int k = 0; k < sizeAdd.length; k++) {
			int[] arrNum = sizeAdd[k];
			for (int i = arrNum[0]; i < arrNum[2]; i++) {
				for (int j = arrNum[1]; j < arrNum[3]; j++) {
					if (arr[i][j] == 0) {
						arr[i][j] = 1;
						sum++;
					}
				}
			}
		}
		return sum;
	}

	private static int size(int[][] sizeAdd, char division) {
		int temp = 0;
		int arr[] = new int[sizeAdd.length];

		if (division == 'x') {
			for (int i = 0; i < sizeAdd.length; i++) {
				if (sizeAdd[i][0] >= sizeAdd[i][2]) {
					arr[temp] = sizeAdd[i][0];
					temp++;
				} else {
					arr[temp] = sizeAdd[i][2];
					temp++;
				}
			}
		} else {
			for (int i = 0; i < sizeAdd.length; i++) {
				if (sizeAdd[i][1] >= sizeAdd[i][3]) {
					arr[temp] = sizeAdd[i][1];
					temp++;
				} else {
					arr[temp] = sizeAdd[i][3];
					temp++;
				}
			}
		}

		Arrays.sort(arr);
		return arr[arr.length-1];
	}

}
