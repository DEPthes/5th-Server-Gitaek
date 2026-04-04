import java.util.Arrays;
import java.util.List;

public class StreamPractice {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream()
                .filter(n -> n % 2 == 0) // 짝수만 필터링
                .map(n -> n * 2) // 각 요소 값을 2배로 변환
                .forEach(System.out::println);
    }
}