public class Main {
    public static void moveallx(String str, int idx, int count, String newstring){
        if(idx == str.length()){
            for(int i = 0; i<count; i++){
                newstring += 'x';
            }
            System.out.println(newstring);
            return;
        }
        char currchar = str.charAt(idx);
        if(currchar == 'x'){
            count++;
            moveallx(str, idx+1, count, newstring);
        }else{
            newstring += currchar;
            moveallx(str, idx+1, count, newstring );
        }
    }
    public static void main(String[] args) {
        String str = "axbcxxd";
        moveallx(str, 0, 0, "");

    }
}