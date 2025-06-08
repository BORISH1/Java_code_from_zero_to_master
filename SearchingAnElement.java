package Java_code_from_zero_to_master;

import java.util.Scanner;

public class SearchingAnElement {
    public static void main(String[] args) {
        int[] ar = {3,9,7,8,12,6,15,5,4,10};
        int key ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the you want to search " );
        key = sc.nextInt();
        for(int i=0;i<ar.length;i++){
            if(ar[i] == key){
                System.out.println("The is found at " + i+1 );
                System.exit(0);
            }

        }System.out.println("Element is not found");
    }
}
