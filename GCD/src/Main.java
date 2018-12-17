import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int[] x={2,-4,6,8,11};
        System.out.println(generalizedGCD(-5,x)+" "+findGCD(x,-5));
    }



    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    // Function to find gcd of array of
    // numbers
    static int findGCD(int arr[], int n)
    {
        int result = arr[0];
        for (int i = 1; i < n; i++)
            result = gcd(arr[i], result);

        return result;
    }

    public static int generalizedGCD(int num, int[] arr)
    {
        // WRITE YOUR CODE HERE

        for (int i=Math.abs(num);i>=1 ;i-- ){
            boolean flag=true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j]%i!=0)
                    flag=false;
            }
            System.out.println(i+" "+flag);
            if (flag)
                return i;
//            System.out.println(i);
        }
        return 1;
    }
}
