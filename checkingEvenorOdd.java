package Java_code_from_zero_to_master;

public class checkingEvenorOdd {
    public void checking(int a){
        if(a%2==0){
            System.out.println("The given number is even");
        }
        else{
            System.out.println("The given number is odd");
        }
    }

    public static void main(String[] args) {
        checkingEvenorOdd obj =new checkingEvenorOdd();
        obj.checking(23);
    }
}
