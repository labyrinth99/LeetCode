public class Main {

    public static void main(String[] args) {

        int p1=1,p2=2,temp=1;
        long sum=2;
        while(temp<4000000){
            temp=p1+p2;
            p1=p2;
            p2=temp;
            if (temp%2==0)
                sum+=temp;
        }


        System.out.println("Sum: "+sum);
    }
}
