import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        int[] x={0,0,0,0,0,0,1,1,0,1};
//        convertAndPut(x);
        System.out.println(readBinaryWatch(1));
    }


    static List<String> cloak=new ArrayList<>();
    public static List<String> readBinaryWatch(int num) {


        int[] number=new int[10];

        for (int i = 0; i < num ; i++) {
            number[i]=1;
        }

        findpermutation(number,0);
        return cloak;
    }

    public static void findpermutation(int[] number,int location){
        if (location==number.length-1){

//            for (int i = 0; i <number.length ; i++) {
//                System.out.print(number[i]);
//            }
//            System.out.println();
            // call fun to convert cloak
            convertAndPut(number);
            return;
        }


        for (int i = location; i <number.length ; i++) {
            int temp=number[i];
            number[i]=number[location];
            number[location]=temp;
            findpermutation(number,location+1);
            temp=number[i];
            number[i]=number[location];
            number[location]=temp;
        }
    }
    public static void convertAndPut(int[] x){
        int min=0,hour=0;
        for (int i = 0; i <6 ; i++) {
            min+= (int) (Math.pow(2,i)*x[i]);
        }
        if (min>=60)
            return;
        for (int i = 0; i <4 ; i++) {
            hour+= (int) (Math.pow(2,i)*x[6+i]);
        }
        if (hour>11)
            return;
        String clk=hour+":";
        if (min<10)
            clk+="0"+min;
        else
            clk+=min;

//        System.out.println(clk);
        if (!cloak.contains(clk))
        cloak.add(clk);

    }


}
