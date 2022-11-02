package level1;

public class fir {

	public static void main(String[] args) {
		int a  = 4;
		int b = 2;
		int n = 20;
		
		int result = solution(a,b,n);
		
	}  

	/*
	 * 20 ...2 6 
	 * 8 ... 2 2 
	 * 4 ... 1 1
	 */
	private static int solution(int a, int b, int n) {
		int answer = 0;

		while(true) {
			if(n<a) {
				break;
			}
			int ch = n/a;
			int helf = n%a;
			n = ch*b + helf;
			System.out.println(n);
			answer += (n/a) * b ;
			System.out.println(answer);
		}
		return answer;
	}
}
