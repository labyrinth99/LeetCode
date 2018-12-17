public class Main {

    public static void main(String[] args) {
        int[] x={140638725,436257910,953274816,734065819,362748590};
        miniMaxSum(x);
        System.out.println();
        System.out.println(140638725+436257910+734065819+362748590);
    }


    static void miniMaxSum(int[] arr) {

        long min,max;
        for(int i=4;i>0;i--){
            if(arr[i]<arr[i-1]){
                int temp=arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=temp;
            }

        }
        for(int i=2;i<5;i++){
            if(arr[i-1]>arr[i]){
                int temp=arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=temp;
            }

        }
        min=arr[0];
        max=arr[4];
        System.out.println(min+" "+max);

        for (int i = 1; i < 4; i++) {
            min+=arr[i];
            max += arr[i];
            System.out.println(min+" "+max);
        }
        System.out.print(min+" "+max);

    }
}
