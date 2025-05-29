package Java_code_from_zero_to_master;

public class FindingMinAndMaxElementInArray {
    public static void  main(String[] args){
        int[] arr= {12,32,54,23,54,12,64};
        int min = arr[0];
        int max = arr[0];
        for(int i=0;i<=arr.length-1;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("The max in th  given array is " + max);

        for(int i=0;i<=arr.length-1;i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("The min in th  given array is " + min);
    }
}
