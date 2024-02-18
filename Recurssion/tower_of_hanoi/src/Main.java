import java.util.*;
public class Main {
    public static void towerofHanoi(int n, String src, String helper, String dest){
        if(n == 1){
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        towerofHanoi(n-1, src, dest, helper);
        System.out.println("transfer disk "+ n + " from " + src + " to " + dest);
        towerofHanoi(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        System.out.print("Give the number of rings in tower 1 ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        towerofHanoi(n, "S", "H", "D");

    }
}