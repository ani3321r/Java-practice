import java.util.*;
public class Main {
    public static void printsubset(ArrayList<Integer>subset){
        for(int i = 0; i<subset.size();i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void findsubset(int n, ArrayList<Integer>subset){
        if(n == 0){
            printsubset(subset);
            return;
        }
        subset.add(n);
        findsubset(n-1,subset);
        subset.remove(subset.size()-1);
        findsubset(n-1,subset);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the integer:");
        int n = sc.nextInt();
        ArrayList<Integer>subset = new ArrayList<>();
        findsubset(n,subset);
    }
}