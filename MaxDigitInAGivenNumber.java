package Java_code_from_zero_to_master;

public class MaxDigitInAGivenNumber {
    public static void main(String[] args){
        int num = 234564672;
        int max = 0;
        while(num >0){
            int digit = num%10;
            if(digit>max){
                max = digit;
            }
            num = num/10;
        }
        System.out.println(max);
    }
}
