package Function_Assignment;

public class Q12 {
    public static void main(String[] args) {
//        Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet
//        is when the sum of the square of two numbers is equal to the square of the third number).
        System.out.println(isPythagoreanTriplet(5,12,13));
    }

    private static boolean isPythagoreanTriplet(int a, int b, int c) {
        return Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2) ? true : false;
    }
}
