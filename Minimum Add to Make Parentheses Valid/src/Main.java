public class Main {

    public static void main(String[] args) {

        System.out.println(minAddToMakeValid("()))"));
    }

    public static int minAddToMakeValid(String S) {

        if(S.length()==0)
            return 0;
        int counter=0,output=0;

        for (int i = 0; i <S.length() ; i++) {

            if (S.charAt(i)=='(')
                counter++;
            else
                counter--;

            if (counter<0){
                output++;
                counter = 0;
            }

        }

        output+=counter;

        return output;
    }
}
