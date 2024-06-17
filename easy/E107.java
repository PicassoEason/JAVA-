import java.util.ArrayList;
import java.util.List;
public class E107 {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<Integer>(); 
        l1.add(0, 1);
        l1.add(1, 9);  
        System.out.println(average(l1));
    }
    public static double average(List <Integer> list){
        return list.stream().mapToInt(i->i).average().getAsDouble();
    }
}
