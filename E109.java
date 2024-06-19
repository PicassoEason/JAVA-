
import java.util.Arrays;
import java.util.List;
public class E109 {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(0, 1);
        System.out.println("Test with list " + list1 + "Input(1): " + getElement(list1, 1));
        List<Integer> list2 = Arrays.asList(3, 79, 55, 3);
        System.out.println("Test with list " + list2 + "Input(2): " + getElement(list2, 2));

    }

    public static Integer getElement(List<Integer> list, Integer n) {
        int getElementIndex = 2 * (n - 1);
        return getElementIndex >= list.size() ? -1 : list.get(getElementIndex);
    }
}