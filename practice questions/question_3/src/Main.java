import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(n>m){
            System.out.println(n+"is bigger");
        } else {
            System.out.println(m+"is bigger");
        }
    }
}