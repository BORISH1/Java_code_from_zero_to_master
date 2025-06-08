package Java_code_from_zero_to_master;

public class SumOfAllElementInAArray {
    public static void main(String[] args) {
        int[] ar = {3,9,7,8,12,6,15,5,4,10};
        int sum = 0;
        for(int i =0;i<ar.length;i++){
            sum = sum+ ar[i];
        }
        System.out.println("The sum of the number is " + sum);
    }
}
