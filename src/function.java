import java.util.Scanner;

public class function {

    public static int printCalculateAverage(int a,int b,int c) {
        int average = (a+b+c)/3;

        return average;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int Average = printCalculateAverage(a,b,c);
        System.out.println(Average);
    }
}
