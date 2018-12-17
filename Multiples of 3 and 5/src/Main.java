import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        long total = 0;
        int pow = 0;
        for (int i = 1; pow < 1000; i++) {


//            set.add(pow);
            total += pow;
            System.out.println(pow+" "+total);
            pow = pow + 3;

        }
        pow = 0;
        for (int i = 1; pow < 995; i++) {
            pow = pow + 5;
            if (pow%3!=0) {

                System.out.println(pow);
//                set.add(pow);
                total += pow;

            }
        }

        System.out.println(total);
    }
}
