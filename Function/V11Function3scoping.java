package Function;

import java.util.Arrays;

public class V11Function3scoping {
    public static void main(String[] args) {
        int[]  arr = {1,23,4,56,7};
        update(arr);
        System.out.println(Arrays.toString(arr));
        int a = 45;
        {
//            int a = 34;//This is not allowed
            int c = 45;
        }
        int c = 87;//This is allowed.
    }

    static void update(int[] nums){
        nums[0] = 99;//If you make a change to the object via this ref variable,same object will be change.
    }
}
