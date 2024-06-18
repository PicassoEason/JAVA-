public class M105 {
    public static void main(String[] args) {
        System.out.println(evenFibonacciSum(5));
    }
    public static  Integer evenFibonacciSum(Integer n){
        int pr=1;
        int cu=2;
        int event=0;
        do{
            if(cu%2==0){
                event+=cu;
            }
            int newf=cu+pr;
            pr=cu;
            cu=newf;
        }while(cu<n);
        return event;
    }
}
