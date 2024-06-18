
import java.util.Scanner;

public class E101{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(sum(a,b));
    }
    public static int sum(Integer a,Integer b){
        return a+b;
    }
}