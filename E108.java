import java.util.Arrays;
import java.util.List;

public class E108 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Double averageValue = average(numbers);
        if (averageValue != null) {
            System.out.println("The average is: " + averageValue);
        } else {
            System.out.println("error");
        }
    }

    public static Double average(List<Integer> list) {
        return list.stream()
                .mapToInt(i -> i)
                .average()
                .getAsDouble();
    }
}