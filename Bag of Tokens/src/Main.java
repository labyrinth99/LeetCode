import sun.swing.BakedArrayList;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        int[] x={71,55,82};
        System.out.println(bagOfTokensScore(x,54));
    }

    public static int bagOfTokensScore(int[] tokens, int P) {


        if(tokens.length==0)
            return 0;
        ArrayList<Integer> list= new ArrayList<>();
        for (int i = 0; i <tokens.length ; i++) {
            list.add(tokens[i]);
        }
        Collections.sort(list);
        if(list.get(0)>P)
            return 0;

        int score=0;
        while(!list.isEmpty()){
            while (!list.isEmpty() && list.get(0)<=P) {
                    P-=list.get(0);
                    list.remove(0);
                    score++;
            }

            if (list.size()<=1)
                return score;
            P+=list.get(list.size()-1);
            list.remove(list.size()-1);
            score--;
        }
        return score;
    }
}
