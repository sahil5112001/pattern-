import java.util.*;

public class Main
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int input;
        do{
        int marks = sc.nextInt();
        if (marks <=100 && marks >=90){
        System.out.println("This is Good");
        }
        else if (marks >=60 && marks <=89){
        System.out.println("This is also Also Good");
        }
        else if (marks >=0 && marks <=59){
        System.out.println("This is Good as well");
        }
        else {
        System.out.println("invalid");
        }
        System.out.println("want to continue ? (yes(1) or no(0))");
        input = sc.nextInt();
        }
        while(input==1);
        }
        }
