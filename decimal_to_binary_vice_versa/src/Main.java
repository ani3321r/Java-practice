import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        int deNum = sc.nextInt();
        String binRep = dectobin(deNum);
        System.out.println("Binary Representation: " + binRep);
        System.out.print("Enter a binary number: ");
        String binNum = sc.next();
        int DecRes = bintodec(binNum);
        System.out.println("Decimal Representation " + DecRes);
        sc.close();
    }
    static String dectobin(int deNum){
        return Integer.toBinaryString(deNum);
    }
    static int bintodec(String binNum){
        return Integer.parseInt(binNum, 2);

    }
}