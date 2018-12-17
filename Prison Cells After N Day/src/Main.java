import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        int []x={0,1,0,1,1,0,0,1};
      int[] y=prisonAfterNDays(x,7);
        for(int k=0;k<x.length;k++)
            System.out.print(y[k]);
        System.out.println();
//        System.out.println(convertToInt(x));
    }

    public static int[] prisonAfterNDays(int[] cells, int N) {

        int temp[]=cells.clone();
        Map<Integer,Integer> seen=new HashMap<>();

        for (int i = 0; i < N ; i++) {
            temp[0]=0;
            temp[7]=0;
            for (int j = 1; j < 7; j++) {
                if (cells[j-1]==cells[j+1])
                    temp[j]=1;
                else
                    temp[j]=0;
            }
            cells=temp.clone();
            if(!seen.containsKey(convertToInt(cells)))
                seen.put(convertToInt(cells),i);
            else{
                int z=i-seen.get(convertToInt(cells));
                i=N-((N-i-1)%z)-1;
            }
        }
        return cells;
    }

    public static int convertToInt(int[] x){
        int result=0;
        int j=0;
        for (int i:x) {
            result+=Math.pow(2,j)*i;
            j++;
//            System.out.println(result);

        }
        return result;
    }


}
