package Array;

import java.util.ArrayList;
import java.util.List;

public class Array4DynamicArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(3);
        System.out.println("Size : "+list.size());
        list.add(22);
        list.add(33);
        list.add(256);
        list.add(65);
        list.add(98);
        System.out.println(list);
        System.out.println("Size : "+list.size());

        System.out.println(list.get(2));
        list.set(0, 99);
        System.out.println(list);
        list.remove(4);
        System.out.println(list);
        list.add(1,43);
        System.out.println(list);
        List list2 = (ArrayList)list.clone();
        System.out.println("List 2 :"+ list2);
    }
}
