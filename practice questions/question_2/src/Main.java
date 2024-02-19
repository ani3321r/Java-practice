import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int odd_sum = 0;
        for(int i=1; i<=n; i++){
            if(i % 2 != 0 ){
                odd_sum += i;
            }
        }System.out.println(odd_sum);


    }
}