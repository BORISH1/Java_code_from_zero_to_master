package Java_code_from_zero_to_master;

class overload {
    void test() {
        System.out.println("No parameter");
    }

    void test(int a) {
        System.out.println("a = " + a);
    }

    void test(int a, int b) {
        System.out.println(" a = " + a + " b = " + b);
    }

    double test(double a) {
        return a * a;
    }
}
class overloading {
    public static void main(String[] args) {
        overload o = new overload();
        o.test();
        o.test(10);
        o.test(10,23);
      double result = o.test(3.1);
       System.out.println("The result is " + result);

    }
}
