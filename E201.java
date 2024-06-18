import java.util.Scanner;
public class E201 {
    public static void main (String [] args){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(fizzBuzz(a));
    }
    public static String fizzBuzz(Integer i){
        String result="";
        if(i%3==0){
            result+="FIZZ";
        }
        if(i%5==0){
            result+="BUZZ";
        }
        if(result.equals("")){
            result+=i.toString();
        }
        return  result;
    }
}
