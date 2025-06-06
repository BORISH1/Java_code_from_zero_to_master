package Java_code_from_zero_to_master;

import java.util.ArrayList;

        public class operationInArraylist {
            public static void main(String[] args) {
                ArrayList al = new ArrayList();
                al.add(20);
                al.add(40);
                al.add(23.43f);
                al.add('D');
                al.add("Alex");
                al.remove(3);
                al.set(2,50);
                System.out.println(al);
                System.out.println(al.indexOf(40));

            }


        }


