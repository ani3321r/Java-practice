import java.util.*;
public class Main {
    public static int countpaths(int i, int j, int n, int m){
        if(i == n || j == m){
            return 0;
        }
        if(i == n-1 && j == m-1){
            return 1;
        }
        int downpath = countpaths(i+1,j,n,m);
        int rightpath = countpaths(i,j+1,n,m);
        return downpath+rightpath;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows: ");
        int n = sc.nextInt();
        System.out.println("enter the number of columns: ");
        int m = sc.nextInt();
        int totalpaths = countpaths(0,0,n,m);
        System.out.println("the number of total paths is:" + totalpaths);
    }
}