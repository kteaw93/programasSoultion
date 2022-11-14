package level0;

public class 옷가게활인받기 {
	public static void main(String[] args) {

		int price = 150000;
		int result = solution(price);

		System.out.println(result);
	}
	// 머쓱이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다.
	// 구매한 옷의 가격 price가 주어질 때, 지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요.

	private static int solution(int price) {
		if (price >= 100000 && price < 300000) {
			return (int) (price * 0.95);
		} else if (price >= 300000 && price < 500000) {
			return (int) (price * 0.9);
		} else if (price >= 500000) {
			return (int) (price * 0.8);
		} else {
			return price;
		}

	}
}
