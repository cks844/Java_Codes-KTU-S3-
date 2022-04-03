import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] n1 = {2, 3, 12, 4, 12, -2};
        Arrays.sort(n1);
        System.out.println("The sorted array is:");
        for(int list:n1){
         System.out.println(list);
        }
        int key=2;
        System.out.println(key+"found at index-"+ Arrays.binarySearch(n1,key));
       
        
    }
}
