package Leetcode;

import java.lang.String;

public class LC1832 {
    public static void main(String[] args) {
        String str = "leetcode";
        System.out.println(checkIfPangram(str));

    }

    static boolean checkIfPangram(String sentence) {
        boolean[] arr = new boolean[26];

        for (int i = 0; i < sentence.length(); i++) {
            arr[sentence.charAt(i) - 97] = true;
        }

        for (boolean e : arr) {
            if (!e) {
                return false;
            }
        }
        return true;
    }
}
