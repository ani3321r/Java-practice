import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N : ");
        int n=sc.nextInt();

        System.out.print("Enter Symbol : ");

        char c = sc.next().charAt(0);

        for(int i=1;i<=n;i++)
        {

            for(int j=1;j<=n-i;j++)

            {
                System.out.print(" ");
            }
            if(i==1 || i==n)
                for(int j=1;j<=n;j++)

                {
                    System.out.print(c);
                }
            else
            {
                for(int j=1;j<=n;j++)

                {
                    if(j==1 || j==n)
                        System.out.print(c);
                    else

                        System.out.print(" ");
                }
            }
            System.out.println();

        }



    }
}
/**import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
                if (i == 1 || i == n) {
                    for (j = 1; j <= n; j++) {
                        System.out.print("*");
                    }
                    } else{
                        for (j = 1; j <= n; j++) {
                            if (j == 1 || j == n) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                    }
                }System.out.println();

            }
        }
    }
//Function for Hollow Rhombus
//    static void hollowRhombus(int rows)
//    {
//        int i, j;
//        for (i=1; i<=rows; i++)
//        {
//            // Print trailing spaces
//            for (j=1; j<=rows - i; j++)
//                System.out.print(" ");
//
//            // Print stars after spaces
//            // Print stars for each solid rows
//            if (i==1 || i==rows)
//                for (j=1; j<=rows; j++)
//                    System.out.print("*");
//
//            // stars for hollow rows
//            else
//                for (j=1; j<=rows; j++)
//                    if (j==1 || j==rows)
//                        System.out.print("*");
//                    else
//                        System.out.print(" ");
//            // Move to the next line/row
//            System.out.println();
//        }
//    }
//
//    // utility program to print all patterns
//    static void printPattern(int rows)
//    {
//        System.out.println("Solid Rhombus:");
//        solidRhombus(rows);
//
//        System.out.println("Hollow Rhombus:");
//        hollowRhombus(rows);
//    }
//
//    // driver program
//    public static void main (String[] args)
//    {
//        int rows = 5;
//        printPattern (rows);
//    }
//}**/
