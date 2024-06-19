import java.util.List;
import static java.util.stream.Collectors.joining;

public class M109 {
    public static void main(String[] args) {
        
    }
    public String getString(List<Integer> list) {
        return list.stream()
            .map(i -> i % 2 == 0 ? "e" + i : "o" + i)
            .collect(joining(","));
    }
}
