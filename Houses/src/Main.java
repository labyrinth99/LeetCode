import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {
        int[] x={1,1,1,0,1,1,1,1};
        System.out.println(cellCompete(x,2));
    }

    public static List<Integer> cellCompete(int[] states, int days) {
        // WRITE YOUR CODE HERE
        List<Integer> temp =new ArrayList<>();
        List<Integer> Answer = new ArrayList<Integer>();
        if (states.length == 0)
            return Answer;

        Answer=Arrays.stream(states).boxed().collect(Collectors.toList());
        temp=Arrays.stream(states).boxed().collect(Collectors.toList());
//        for (int i = 0; i < states.length; i++) {
//            Answer.add(states[i]);
//            temp.add(states[i]);
//        }

//        System.out.println(temp);
        for (int i = 0; i < days; i++) {
            for (int k = 0; k < states.length; k++) {
                Answer.set(k,temp.get(k));
            }
//            System.out.println(Answer +" " +temp);
            for (int j = 0; j < states.length; j++) {


//                System.out.println(j+ " ");
                if (j == 0 && states.length > 1) {
                    temp.set(j, Answer.get(j + 1));

                }

                if (j == states.length - 1 && states.length > 1) {
                    temp.set(j, Answer.get(j - 1));
                }

                if (states.length > 2 && j>0 && j<states.length-1)
                    if (Answer.get(j - 1) == 1 && Answer.get(j + 1)==1)
                        temp.set(j,1);
                    else
                        if (Answer.get(j - 1) == 0 && Answer.get(j + 1)==0)
                        temp.set(j,0);

//                System.out.println(temp);
            }

        }


        return Answer;

    }
}
