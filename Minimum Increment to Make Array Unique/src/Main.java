import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] a={3,2,1,2,1,7};
        System.out.println(minIncrementForUnique(a));
    }

    public static  int minIncrementForUnique(int[] A) {
        int answer=0;
        Arrays.sort(A);

        Map<Integer, Integer> map= new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();

        for (int i = 0; i < A.length; i++) {
            if(!map.containsKey(A[i])){
                map.put(A[i],1);
            }
            else{

                map.put(A[i],map.get(A[i])+1);
                if(!list.contains(A[i])){
                    list.add(A[i]);
                }
            }

        }
        while (!list.isEmpty()){
//            System.out.println(list+" "+map.get(2)+" "+map.get(1));
            int temp=list.get(0);
            int dumy=temp;
            while(map.get(dumy)>1){
                if(!map.containsKey(temp+1)){
                    map.put(temp+1,1);
                    map.put(dumy,map.get(dumy)-1);
//                    System.out.println(map.get(2)+" __");
                    answer+=temp+1-dumy;
                }
                temp++;
//                System.out.println(answer+" 555");
            }
            list.remove(0);
        }
        return answer;

    }
}
