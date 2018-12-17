public class Main {

    public static void main(String[] args) {
        System.out.println(reverse(-1534236469));
    }

    public static int reverse(int x) {
        int ans=0;
        while (x!=0 ){
            if(Math.abs(ans)>214748365 )
                return  0;
            ans=ans*10+(x%10);
            x=x/10;
            System.out.println(ans);
        }

        return  ans;
    }
}
