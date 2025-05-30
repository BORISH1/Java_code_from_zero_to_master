public class MethodWithParamater {
    public void positiveOrNegative(int n){
        if(n>0){
            System.out.println(n+" is positive");
        }
        else if(n<0){
            System.out.println(n+" is negative");
        }
        else{
            System.out.println(n+" is not negative and positive");
        }
    }
    public static void main(String[] args){
        MethodWithParamater d = new MethodWithParamater();
        d.positiveOrNegative(7);
    }
}