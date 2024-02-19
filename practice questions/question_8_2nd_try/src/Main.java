import java.util.*;
public class Main {
    public static int powers ( int x, int n) {
        int a = 1;
        for (int i = 1; i <= n; i++) {
            a *= x;
        }return a;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int result = powers(x,n);
        System.out.println(result);
    }
}


