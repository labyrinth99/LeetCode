import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] b={4,5,3,2,1};
        System.out.println(validateStackSequences(a,b));
    }

    public static boolean validateStackSequences(int[] pushed, int[] popped) {

        Stack<Integer> stack = new Stack<>();
        System.out.println(pushed.length);
        int i = 0, j = 0;
        while (i < pushed.length) {
            while (pushed[i] != popped[j] && i < pushed.length) {
                stack.push(pushed[i]);
                i++;
                System.out.println(i - 1 + " " + pushed[i - 1] + " " + i + " " + j);
            }
            if (pushed[i - 1] != popped[j] && i == pushed.length)
                return false;
            boolean flag=false;
            j++;
            do{

                int temp=stack.pop();
                if(temp!=popped[j]){
                    stack.push(temp);
                    flag=true;
                }
                else{

                }
                j++;
            }while(!flag && j<popped.length);
            if (j>=popped.length)
                return  false;
        }
        return true;

    }
}
