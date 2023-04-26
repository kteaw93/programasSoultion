package study;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class streamExam {

	public static void main(String[] args) {
		// Stream 사용 후
		String[] nameArr = { "IronMan", "Captain", "Hulk", "Thor" };
		List<String> nameList = Arrays.asList(nameArr);
		// 기존방식
		Arrays.sort(nameArr);
		for (String k : nameArr) {
			System.out.print(k + " ");
		}
		System.out.println();
		// 원본의 데이터가 아닌 별도의 Stream을 생성함
		Stream<String> nameStream = nameList.stream();
		Stream<String> arrayStream = Arrays.stream(nameArr);

		// 복사된 데이터를 정렬하여 출력함ln
		nameStream.sorted().forEach(System.out::println);
		arrayStream.sorted().forEach(System.out::println);

		List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

		myList.stream() // 생성하기
				.filter(s -> s.startsWith("c")) // 가공하기
				.map(String::toUpperCase) // 가공하기
				.sorted() // 가공하기
				.count(); // 결과만들기

		// filter 스ㅡ트림 내 요소들을 하나씩 평가해 걸러내는 작업
		// ex) b가 포함되어 있는 요소들만 스트링 형태로 변환
		List<String> names = Arrays.asList("abc", "bcd", "cde", "def");
		Stream<String> st = names.stream().filter(x -> x.contains("b"));

		// 스트림 내 요소들을 하나씩 연산
		// ex: 스트림 내 String의 toUpperCase 메소드 실행기술 중 하나
		Stream<String> st1 = names.stream().map(String::toUpperCase);

		List<String> lang = Arrays.asList("Java", "Scala", "Groovy", "Python", "Go", "Swift");

		lang = lang.stream().sorted() // 오름차순
				.collect(Collectors.toList());

		lang = lang.stream().sorted(Comparator.reverseOrder()) // 내림차순
				.collect(Collectors.toList());

		lang.stream().sorted(Comparator.comparingInt(String::length)) // 글자수 기준, 오름차순
				.collect(Collectors.toList());

		lang.stream().sorted((s1, s2) -> s2.length() - s1.length()) // 글자수 기준, 내림차순
				.collect(Collectors.toList());

		// peek
		// 스트림내각요소들로 특정연산수행
		int sum = IntStream.of(1, 3, 5, 7, 9).peek(System.out::println).sum();

		// count min max sum 요소들에 대한 개수 최소값 최대값 합계
		List<Integer> ages = Arrays.asList(1, 2, 3);
		ages.stream().map(x -> x == 1).count();

		// reduce 누적된 값을 계산
		List<Integer> ages3 = Arrays.asList(1, 2, 3);

		ages.stream().reduce((x, y) -> x + y).get(); // 1+2+3 = 6
		ages.stream().reduce((a, b) -> {
			return Integer.sum(a, b);
		});
		ages.stream().reduce(0, Integer::sum); // 0은 초기값. 10으로 할 경우 10+1+2+3=16이 됨

		// forEach 요소를 돌며 실행되는 최종작업
		names.stream().forEach(System.out::println);

		// collect : Collector 타입의 인자를 받아서 처리

		// productList.stream().map(Product::getName).collect(Collectors.toList()); //
		// 리스트로 결과 가져오기

		// productList.stream().map(Product::getName).collect(Collectors.joining()); //
		// 스트림 작업 결과를 하나의 String으로 이어붙이기

		// productList.stream().map(Product::getName).collect(Collectors.joining(", ",
		// "<", ">")); // <요소1, 요소2, 요소3>

		// productList.stream().collect(Collectors.averagingInt(Product::getAmount)); //
		// 숫자 값의 평균

		// noneMatch anyMatcg allMatch
		boolean anyMatch = names.stream().anyMatch(name -> name.contains("a"));

		Arrays.stream(new String[] { "c", "python", "java" })
		.filter(word -> {
									System.out.println("Call filter method: " + word);
									return word.length() > 3;
								})
		.map(word -> {
									System.out.println("Call map method: " + word);
									return word.substring(0, 3);
								})
		.findFirst();
		
		//배열의 첫 번째 요소인 "c"는 filter()를 거친다.
		//"c"는 length()가 3을 넘지 않아서 map()을 거치지 않는다.
		//배열의 두 번째 요소인 "python"은 filter()를 거친다.
		//"python"은 map()을 거친다.
		//"python"은 findFirst()를 거친다.
		//findFirst()는 조건에 맞는 하나의 결과를 찾았기 때문에 다음 요소인 "java"에 대해서는 수행하지 않는다.
	}
}
