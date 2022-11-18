package level1;


import java.util.Arrays;

public class 제일작은수제거하기 {

	public static void main(String[] args) {
		int arr[] = { 1 ,2,5,9,3,6,6,3,4,8,6,1};
		int[] result = solution(arr);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

	private static int[] solution(int[] arr) {
		Arrays.sort(arr);
		if (arr.length > 1) {
			int result[] = new int[arr.length - 1];
			for (int i = 0; i < result.length; i++) {
				result[i] = arr[arr.length-i-1];
			}
			return result;
		} else {
			int[] result1 = { -1 };
			return result1;
		}

	}
	
	/*
	 	private static int[] solution(int[] arr) {
	
	    if(arr.length == 1){
          int[] answer = {-1};
          return answer;
      }
		
	      int[] result = new int[arr.length-1];
	      int minIndex=0;

	      for(int i=0;i<arr.length;i++){
	          if(arr[minIndex]>arr[i]){
	              minIndex = i;
	          }
	      }
	      for(int i=minIndex+1;i<arr.length;i++){
	          arr[i-1] = arr[i];
	      }
	      for(int i=0;i<result.length;i++){
	          result[i] = arr[i];
	      }
		return result;

	}
	*/
}
