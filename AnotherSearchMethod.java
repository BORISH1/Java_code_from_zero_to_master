import java.util.Scanner;
public class AnotherSearchMethod {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        int key;
        System.out.println("Enter the number of array");
        n = sc.nextInt();
        System.out.println("Enter the array element");
        int[] ar = new int[n];
        for(int i = 0;i<ar.length;i++) {
            System.out.printf("The element of the index[%d] is", i);
            ar[i] = sc.nextInt();
        }
            System.out.println("Enter the element need to be search ");
            key = sc.nextInt();
        }
        for(int j =0;j<ar.length;j++){
            if(ar[j] == key)
            {
                System.out.println("The "+ i);
            }
        }
    }

}








