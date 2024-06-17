public class E106 {
    public static void main(String[] args) {
        int[] list={5,9,7};
        System.out.println(maxinum(list));
    }
    public static Integer maxinum(int[] list){
        int max=list[0];
        for(int i:list){
            if(i>max){
                max=i;
            }
        }
        return max;
    }
    
}
