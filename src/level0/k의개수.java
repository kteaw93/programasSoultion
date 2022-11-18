package level0;

public class k의개수 {
	
	public static void main(String[] args) {
		int i = 10; 
		int j = 50;
		int k = 5;
		int result = solution(i,j,k);
		System.out.println(result );
	}

	private static int solution(int i, int j, int k) {
		String numStr = "";

		for(int num = i; num<=j;num++) {
			numStr+=num;
		}
		String []numArr = numStr.split("");
		int result = 0;
		for(int num2 = 0; num2<numArr.length;num2++) {
			if( Integer.parseInt(numArr[num2])  == k) {
				result++;
			}
		}
		
		return result;
	}
}
