import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        int[] a={4,6,15,35};
        System.out.println(largestComponentSize(a));
    }


    public static int largestComponentSize(int[] A) {

        Map<Integer, ArrayList<Integer>> Edges=new HashMap<>();
        ArrayList<Integer> nodes=new ArrayList<>();

        int counter=0;

        for (int i = 0; i <A.length ; i++) {
            for (int j = i+1; j < A.length; j++) {


                if (GCD(A[i],A[j])>1){
                    System.out.println(A[i]+" "+A[j]+" added");
                    nodes.add(A[i]);
                    nodes.add(A[j]);


                    List<Integer> itemsList = Edges.get(A[i]);

                    if(itemsList == null) {
                        itemsList = new ArrayList<>();
                        itemsList.add(A[j]);
                        Edges.put(A[i], (ArrayList<Integer>) itemsList);
                    } else {
                        if(!itemsList.contains(A[j])) itemsList.add(A[j]);
                    }


                }

            }

        }



        for (int x: nodes) {
            ArrayList<Integer> explored=new ArrayList<>();
            ArrayList<Integer> queue=new ArrayList<>();
            queue.add(x);
            while(!queue.isEmpty()){
                int item=queue.get(0);
                if (!explored.contains(item)){

                }
            }




        }


        return counter;
    }

    public static int GCD(int a,int b){
        int gcd = 1;

        for(int k = 1; k <= a && k <= b; ++k)
        {
            if(a % k==0 && b % k==0)
                gcd = k;
        }

        return gcd;
    }
}
