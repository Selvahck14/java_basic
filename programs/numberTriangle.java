package selva;
import java.util.Scanner;

class numbertri {
    void num1() {
        int i, j, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n value:");
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
       
           
            for (j = 1; j <= n - i; j++) {
                System.out.print("   ");
         }
            
            for (j = 1; j <= i; j++) {
                System.out.print("  " +i + "  ");
            }
            System.out.println("");
        }
    }
}

public class numberTriangle {
    public static void main(String[] args) {
        numbertri s1 = new numbertri();
        s1.num1();
    }
}
