import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        int[] a={0,0,0,0};
        System.out.println(largestTimeFromDigits(a));
    }


    public static String largestTimeFromDigits(int[] A) {
        String ans = "";

        int max = -1;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i != j) {
                    for (int k = 0; k < 4; k++) {
                        if (k != i && k != j)
                            for (int l = 0; l < 4; l++) {
                                if (l != i && l != j && l != k) {
                                    if (A[i] < 3 && A[k] < 6) {
                                        if (A[i] == 0 || A[i] == 1) {
                                            int temp = A[i] * 1000 + A[j] * 100 + A[k] * 10 + A[l];
                                            if (temp > max) {
//                                                System.out.println("a:" + temp);
                                                max = temp;
                                                ans = ""+A[i] + A[j] + ":" + A[k] + A[l];
                                            }
                                        } else {
                                            if (A[j] < 4) {
                                                int temp = A[i] * 1000 + A[j] * 100 + A[k] * 10 + A[l];
                                                if (temp > max) {
//                                                    System.out.println("b:" + temp);
                                                    max = temp;
                                                    ans =""+A[i] + A[j] + ":" + A[k] + A[l];
                                                }
                                            }
                                        }

                                    }

                                }
                            }
                    }
                }
            }


        }
        return ans;
    }
}
