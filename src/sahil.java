import java.util.*;
public class sahil {
    public static void printCalculateTable(int n) {
        for (int i = 1; i < 11; i++) {
            System.out.println(n * i);
        }
      return;
    }
        public static void main (String args[]){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            printCalculateTable(n);
        }
    }
