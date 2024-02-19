import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>18){
            System.out.println("you are eligible for voting");
        }else{
            System.out.println("you are not eligible for voting");
        }
    }
}