import java.util.Scanner;

public class CheckingEvenOrNOt {
    public static void main(String[] Args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = scan.nextInt();
        if(a%2==0){
            System.out.println("The given number "+a+" is Even");
        }
        else{
            System.out.println("The given number "+a+" is odd");
        }
    }
}
