package Java_code_from_zero_to_master;

public class ReverseTheArray {
    public static void main(String[] args){
        int[] arr = {12,43,65,76,23,65};
        for(int i = arr.length-1;i>=0;i--){
            System.out.print( " "+arr[i]);
        }
    }
}
