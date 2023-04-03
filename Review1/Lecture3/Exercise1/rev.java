package Exercise1;
import java.util.*;




public class rev {
    private String str;

    public void getNumber(){
        Scanner sc = new Scanner(System.in);                
        str = sc.nextLine();
    }

    public int reversNumber(){
        char[] reversed = new char[str.length()];
        for(int i = str.length() - 1, j = 0; i >= 0; i--, j++){
            reversed[j] = str.charAt(i);
        }
        String revString = new String(reversed);
        return Integer.parseInt(revString);
    }

}