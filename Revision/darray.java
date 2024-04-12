package Revision;

import java.util.ArrayList;

public class darray {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6};
        ArrayList<Integer> list = new ArrayList<>(2);
        list.add(23);
        list.add(2331);
        list.add(213);
        list.add(113);
        list.add(99);

        System.out.println(list);
        System.out.println(list.contains(2));
        System.out.println(list.size());;
        System.out.println(list.clone());;
        list.set(0, 99999);
        list.remove(3);
        System.out.println(list);
    }
}
