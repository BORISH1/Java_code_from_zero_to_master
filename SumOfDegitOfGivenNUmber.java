package Java_code_from_zero_to_master;

public class SumOfDegitOfGivenNUmber {
    public static void main(String[] args){
        int num = 213124564;
        int sum=0;
        while(num > 0){
            int digit = num %10;
            sum += digit;
            num = num/10;
        }
        System.out.println("The sum of the digit of the number " + sum);
    }

}
