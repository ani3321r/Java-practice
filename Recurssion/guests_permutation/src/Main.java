import java.util.*;
public class Main {
    public static int callguests(int n){
        if(n<=1){
            return 1;
        }
        int ways1 = callguests(n-1);
        int ways2 = (n-1) * callguests(n-2);
        return ways1 + ways2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of guests");
        int n = sc.nextInt();
        System.out.println(callguests(n));
    }
}