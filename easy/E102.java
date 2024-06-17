
import java.util.Scanner;

public class E102 {
    public static void main(String[] args) {
        Scanner sc=new  Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sum(n));
    }
    public static int sum(Integer n){
        Integer sum=0;
        for(int i=1;i<=n;i++){
            if(n%3==0 || n%5==0){
                sum+=i;
            }
        }
        return sum;
    }
}
