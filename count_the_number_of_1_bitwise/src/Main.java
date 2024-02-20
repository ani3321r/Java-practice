import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        int countOnes = cuntOneBin(num);
        System.out.println("Number of 1's in the binary representation is: " + countOnes);
        sc.close();
    }

    static int cuntOneBin(int num) {
        int count = 0;
        while (num > 0) {
            int lastBit = num%2;
            if(lastBit == 1){
                count++;
            }
            num = num >>1;
        }
        return count;
    }
}