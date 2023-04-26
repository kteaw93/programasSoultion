package level1;

public class 공원산책 {

	public static void main(String[] args) {

		String[] park = {"OSO","OOO","OXO","OOO"};
		String[] routes = { "E 2","S 3","W 1"};

		int[] result2 = solution2(park, routes);

		int[] result = solution(park, routes);
		for (int i = 0; i < result.length; i++) {
			System.out.println("result : " + result[i]);
			System.out.println("result : " + result2[i]);
		}
	}

	private static int[] solution2(String[] park, String[] routes) {
		String[][] array = new String[park.length][park[0].length()];
		int startX = 0;
		int startY = 0;
		// 시작 지점 찾기 : park에서 s위치
		// 1. 각 요소에서 한글자씩 s인지 비교하기
		for (int i = 0; i < park.length; i++) {
			int k = 0;
			String[] ckS = park[i].split("");
			for (int j = 0; j < ckS.length; j++) {
				array[i][j] = ckS[j];
				if (ckS[j].equals("S")) {
					startX = i;
					startY = k;
				} else {
					k++;
				}
			}
		}
		// ----------------------------2번째 routes에서 방향 충돌 시 return 하기
		// ----------------------------------------//

		for (String movePark : routes) {
			String way = movePark.split(" ")[0];// eswn
			int moveCnt = Integer.parseInt(movePark.split(" ")[1]); // 몇칸가는지
			int nextX = startX;
			int nextY = startY;
			for (int i = 0; i < moveCnt; i++) {
				if (way.equals("E")) {
					nextX++;
				}
				if (way.equals("W")) {
					nextX--;
				}
				if (way.equals("S")) {
					nextY++;
				}
				if (way.equals("N")) {
					nextY--;
				}

				if (nextX >= 0 && nextY >= 0 && nextY < array.length && nextY < array[0].length) {
					if (array[nextY][nextX].equals("X")) {
						break;
					}
					// 범위내 & 장애물 x
					if (i == moveCnt - 1) {
						startX = nextX;
						startY = nextY;
					}
				}
			}
		}
		int[] answer = { startY ,startX};
		return answer;
	}

	private static int[] solution(String[] park, String[] routes) {
		int sx = 0;
		int sy = 0;

		char[][] arr = new char[park.length][park[0].length()];

		for (int i = 0; i < park.length; i++) {
			arr[i] = park[i].toCharArray();

			if (park[i].contains("S")) {
				sy = i;
				sx = park[i].indexOf("S");
			}
		}

		for (String st : routes) {
			String way = st.split(" ")[0];
			int len = Integer.parseInt(st.split(" ")[1]);

			int nx = sx;
			int ny = sy;

			for (int i = 0; i < len; i++) {
				if (way.equals("E")) {
					nx++;
				}
				if (way.equals("W")) {
					nx--;
				}
				if (way.equals("S")) {
					ny++;
				}
				if (way.equals("N")) {
					ny--;
				}
				if (nx >= 0 && ny >= 0 && ny < arr.length && nx < arr[0].length) {
					if (arr[ny][nx] == 'X') {
						break;
					}
					// 범위내 & 장애물 x
					if (i == len - 1) {
						sx = nx;
						sy = ny;
					}
				}
			}
		}
		int[] answer = { sy, sx };
		return answer;
	}
}
