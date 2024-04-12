package Revision;

public class fibbonachi {
    public static void main(String[] args) {
        int n = 5;
        int t1 = 0;
        int t2 = 1;
        int i = 0;

        while(i <= n){
            if (i == 0){
                System.out.print(t1+ " ");
            }
            else if(i == 1){
                System.out.print(t2+ " ");
            }
            else{
                int temp = t1+t2;
                t1 = t2;
                t2 = temp;
                System.out.print(temp+ " ");
            }
            i++;
        }
    }
}
