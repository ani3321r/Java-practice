import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = 2*a;
        int m = n;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=m; j++){
                if(i+j == n+1 || i == j  || j == 1 || j == n){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
//int n = 5;
//        for (int i = 1; i <= n; i++) {
//            System.out.print("*");
//            for (int j = 1; j <= i - 2; j++){
//                System.out.print(" ");
//            }
//            if(i>1)
//            {
//                System.out.print("*");
//            }
//            for(int j=1; j<=2*(n-i); j++){
//                System.out.print(" ");
//            }
//            System.out.print("*");
//            for (int j = 1; j <= i - 2; j++){
//                System.out.print(" ");
//            }
//            if(i>1)
//            {
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
//        for (int i = n; i >= 1; i--) {
//            System.out.print("*");
//            for (int j = 1; j <= i - 2; j++){
//                System.out.print(" ");
//            }
//            if(i>1)
//                System.out.print("*");
//            for(int j=1; j<=2*(n-i); j++){
//                System.out.print(" ");
//            }
//            System.out.print("*");
//            for (int j = 1; j <= i - 2; j++){
//                System.out.print(" ");
//            }
//            if(i>1)
//                System.out.print("*");
//            System.out.println(" ");
//        }