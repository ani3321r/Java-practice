public class Main {
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void printcomb(String str, int idx, String combi) {
        if (idx == str.length()) {
            System.out.println(combi);
            return;
        }
        char currchar = str.charAt(idx);
        String mapping = keypad[currchar - '0'];

        for (int i = 0; i < mapping.length(); i++) {
            printcomb(str, idx + 1, combi + mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        String str = "23";
        printcomb(str, 0, "");
    }
}