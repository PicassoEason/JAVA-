public class E104 {
    public static void main(String[] args) {
        Integer[] lis={1,8,9,7};
        System.out.println(search(1, lis));
    }
    public static int search(Integer n,Integer[] list){
        int index=-1;
        for (int i=0;i<list.length;i++){
            if(list[i].equals(n)){
                index=i;
                break;
            }
        }
        return index;
    }
}
