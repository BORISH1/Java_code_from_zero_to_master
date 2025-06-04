package Java_code_from_zero_to_master;

public class addTwoNumberUsingMethod {
    public int add(int a,int b){
        return a+b;
    }

    public static void main(String[] args) {
        addTwoNumberUsingMethod obj = new addTwoNumberUsingMethod();
        int addition = obj.add(23,32);
        System.out.println("The sum is " + addition);
    }
}
