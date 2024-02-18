public class Main {
    public static void subsequent(String str, int idx, String newstring){
        if(idx == str.length()){
            System.out.println(newstring);
            return;
        }
        char currchar = str.charAt(idx);
        //to be
        subsequent(str, idx+1, newstring+currchar);
        //not to be
        subsequent(str, idx+1, newstring);
    }
    public static void main(String[] args) {
        String str = "abc";
        subsequent(str, 0, "");
    }
}