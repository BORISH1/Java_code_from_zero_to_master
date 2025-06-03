package Java_code_from_zero_to_master;

class Parent{
void having(){
    System.out.println("Parent having 1 acre of land");
}
}
class child extends Parent{
    @Override 
void having(){
    System.out.println("child added 4 car");
}
}
public class simpleInheritence {
    public static void main(String[] args){
        Parent obj = new Parent();
        obj.having();
        child object = new child();
        object.having();
    }
}
