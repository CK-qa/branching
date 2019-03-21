package package_1;

import java.util.ArrayList;
import java.util.Collections;

public class A_Class {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<>();
        s.add("00");
        s.add("01");
        s.add("0");
        s.add("1");
        s.add("10");
        s.add("11");
        s.add("20");

        Collections.sort(s);//ывыв

        System.out.println("List after the use of" +
                " Collection.sort() :\n" + s);
    }

    //comment
}
