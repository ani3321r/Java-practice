public class Main {
    public static boolean[] map = new boolean[26];
    public static  void removedups(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currchar = str.charAt(idx);
        if(map[currchar-'a']){
            removedups(str,idx+1,newString);
        }else{
            newString += currchar;
            map[currchar-'a']=true;
            removedups(str,idx+1,newString);
        }
    }
    public static void main(String[] args) {
        String str = "abbabbbccdda";
        removedups(str, 0 , "");

    }
}