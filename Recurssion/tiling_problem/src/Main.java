import java.util.*;
public class Main {
    public static int placetiles(int n, int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        int vertplacement = placetiles(n-m,m);
        int horplacement = placetiles(n-1,m);
        return vertplacement+horplacement;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int n = sc.nextInt();
        System.out.print("Enter the number of columns:");
        int m = sc.nextInt();
        System.out.println(placetiles(n,m));
    }
}