public class E103 {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
    public static Integer factorial(Integer n){
        int sum=n;
        for(int i=n-1;i>0;i--){
            sum*=i;
        }
        return sum;
    }
}
