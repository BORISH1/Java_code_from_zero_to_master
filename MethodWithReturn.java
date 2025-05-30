package Java_code_from_zero_to_master;

public class MethodWithReturn {
    public  static String printTheStatement(){
        return ("HI i am borish");
    }
    public static void main(String[] args){
        String obj = MethodWithReturn.printTheStatement();
        System.out.println(obj);
    }
}
