package study;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamExam {

	public static void main(String[] args) {
		// Stream 사용 후
		String[] nameArr = {"IronMan", "Captain", "Hulk", "Thor"};
		List<String> nameList = Arrays.asList(nameArr);

		// 원본의 데이터가 아닌 별도의 Stream을 생성함
		Stream<String> nameStream = nameList.stream();
		Stream<String> arrayStream = Arrays.stream(nameArr);

		// 복사된 데이터를 정렬하여 출력함
		nameStream.sorted().forEach(System.out::println);
		arrayStream.sorted().forEach(System.out::println);
	}
}
