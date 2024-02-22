package selva;
import java.util.Scanner;

class hollow {
    
    void get1() {
        int i, j, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n value:");
        n = sc.nextInt();
        for(i = 1; i <= n; i++) {
            for(j = 1; j <= n; j++) {
                if(i == 1 || i == n || j == 1 || j == n) {
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}

public class SquareHollow {

    public static void main(String[] args) {
        hollow s1 = new hollow();
        s1.get1();
    }
}
