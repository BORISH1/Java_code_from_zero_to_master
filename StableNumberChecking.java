import java.util.Scanner;

public class StableNumberChecking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=sc.nextInt();
        if(isStable(number)){
            System.out.println(number + " is a stable number");
        }
        else{
            System.out.println(number+" is not a stable number");
        }

    }
    public static boolean isStable(int num){
        int[] array = new int[10];
        int r;
        int i;
        while(num>0){
            r = num%10;
            array[r]++;
            num/=10;
        }
        int expected =0;
        for(i=0;i<9;i++){
            if(array[i]!=0){
                expected = array[i];
            }
        }
        for(i=0;i<9;i++)
        {
            if(array[i]!=0 && array[i]!=expected){
                return false;

            }
        }

        return true;
    }
}
