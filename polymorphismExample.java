package Java_code_from_zero_to_master;


    class calculator{
        public void add(int a, int b){
            System.out.println("The sum of a and b " + (a+b));
        }
        public void add(String a ,  String b){
            System.out.println("The output of a + b " + (a+b));

        }
        public void add(double a , double b){
            System.out.println("The output is " + (a+b));
        }
    }
    public class polymorphismExample {
        public static void main(String[] args) {
            calculator obj = new calculator();
            obj.add(12,31);
            obj.add("borish","thoiba");
            obj.add(32.432,12.23);
        }
}
