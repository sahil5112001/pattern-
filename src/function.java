import java.util.*;
public class function {

    public static int printGreaterNumber(int a, int b) {
        if (a < b) {
            return b;
        }
        else{
            return a;
        }

    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(printGreaterNumber(a,b));
    }
}
