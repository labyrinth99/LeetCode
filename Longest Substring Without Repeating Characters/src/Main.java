import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("kkkkk"));
    }


    public static int lengthOfLongestSubstring(String s) {
        if(s.isEmpty())
            return 0;

        int counter = 0,cur=0,pos,top=-1;

        Map<Character, Integer> map = new HashMap<>();



//        System.out.println(s.length());
        for (int i = 0; i < s.length(); i++) {
//            System.out.println("loop"+i);

            if (map.containsKey(s.charAt(i))) {
                pos=map.get(s.charAt(i));
//                for (int j = top; j <pos+1 ; j++) {
//                    map.remove(s.charAt(j));
//                }
//                System.out.println(cur+" "+top+" "+counter);
                if(pos>=top) {
                    top = pos + 1;
                    map.put(s.charAt(i), i);
                    cur = i - top + 1;
                }
                else{
//                System.out.println(cur+" "+top+" "+counter);
                    top=(top==-1) ? i:top;
                    map.put(s.charAt(i),i);
                    cur++;
                    counter=(cur>counter) ? cur:counter;
//                    System.out.println(cur+" "+top+" "+counter);
                }
//                System.out.println(cur+" "+top+" "+counter);

            }
            else{
//                System.out.println(cur+" "+top+" "+counter);
                top=(top==-1) ? i:top;
                map.put(s.charAt(i),i);
                cur++;
                counter=(cur>counter) ? cur:counter;
//                System.out.println(cur+" "+top+" "+counter);
            }

        }

//        System.out.println(map.get('m'));

        return counter;

    }
}
