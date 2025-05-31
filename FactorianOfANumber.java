package Java_code_from_zero_to_master;

public class FactorianOfANumber {
    public static void main(String[] args){
        int num = 5;
        int i =1;
        int fact = 1;
        while(i<=num){
            fact = fact * i;
            i++;
        }
        System.out.println("The factorian of " + num + " is " + fact);
    }

}
