import java.util.*;

public class sahil {
//    public static int calculateProduct(int a, int b){
//         int product = a*b;
//         return product;
//    }
    public static void printfactorial(int n){
        if (n < 0){
            System.out.println("invalid numbaer");
                    return;
        }
        int factorial = 1;
        for (int i = n; i>=1; i--) {
            factorial = factorial * i;
        }

            System.out.println(factorial);
            return;
        }

    public static void main(String args[])  {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printfactorial(n);
        }
    }