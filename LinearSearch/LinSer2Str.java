package LinearSearch;

import java.util.Arrays;

public class LinSer2Str {
    public static void main(String[] args) {
        String str = "Harshit";
        System.out.println(Arrays.toString(str.toCharArray()));
        char target  = 'h';
        System.out.println(LinSerStr(str, target));
        System.out.println("Index : "+LinSerStr2(str, target));
        System.out.println(LinSerStr3(str, 'H'));
    }

    static boolean LinSerStr(String str, char target){
        if (str.length() == 0){
            return  false;
        }
        for (int i = 0 ; i < str.length() ; i ++){
            if ( target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }

    static boolean LinSerStr3(String str, char target){
        if (str.length() == 0){
            return  false;
        }
        for (char c : str.toCharArray()) {
            if (c == target){
                return true;
            }
        }
        return false;
    }

    static int LinSerStr2(String str, char target){
        if (str.length() == 0){
            return  -1;
        }
        for (int i = 0 ; i < str.length() ; i ++){
            if ( target == str.charAt(i)){
                return i;
            }
        }
        return -1;
    }
}
