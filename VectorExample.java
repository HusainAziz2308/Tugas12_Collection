package Collection;

import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {
        Vector<String> vc = new Vector<String>();
        //<E> Element type of Vector e.g. String, Integer, Object ...

        // add vector elements
        vc.add("Vector Object 1");
        vc.add("Vector Object 2");
        vc.add("Vector Object 3");
        vc.add("Vector Object 4");
        vc.add("Vector Object 5");

        // add vector element at index
        vc.add(3, "Element at fix position");

        // vc.size() inform number of elements in Vector
        System.out.println("Vector Size :" + vc.size());
        
        // get elements of Vector
        for (int i = 0; i < vc.size(); i++) {
            System.out.println("Vector Element " + i + " :" + vc.get(i));
        }
    }
}
