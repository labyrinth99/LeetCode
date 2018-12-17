import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }

    public static boolean isPalindrome(int x) {

        String number=Integer.toString(x);

        int length=number.length()-1;
        for(int i=0;i<number.length()/2;i++){
            if (number.charAt(i)!=number.charAt(length-i))
                return false;
        }
        return true;

    }
}
