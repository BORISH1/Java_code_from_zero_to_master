import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of the Rectangle : ");
        int l = sc.nextInt();
        System.out.println("Enter the Breadth of the Rectangle: ");
        int b = sc.nextInt();
        int area = l*b;
        System.out.println("The Area of the rectangle is "+ area);
    }

    public static class LargestElementInAnArray {
        public static void main(String[] args){
            int[] arr = {12,24,83,45,56,74,73,12,45};
            int max =arr[0];
            for(int i=0;i<arr.length;i++){
                if(max< arr[i]){
                    max= arr[i];
                }

            }
            System.out.println(max);

        }
    }
}
