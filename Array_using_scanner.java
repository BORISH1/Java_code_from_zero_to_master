package Java_code_from_zero_to_master;

import java.util.Scanner;

public class Array_using_scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Corrected here

        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        int[] ar = new int[n];

        for (int i = 0; i < ar.length; i++) {
            System.out.println("Enter the value for index " + i + ":");
            ar[i] = sc.nextInt();
        }
        
        System.out.println("You entered the array:");
        for (int value : ar) {
            System.out.print(value + " ");
        }
    }
}
