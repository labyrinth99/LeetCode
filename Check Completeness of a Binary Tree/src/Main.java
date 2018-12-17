import java.util.ArrayList;
import java.util.List;

public class Main {

    public void main(String[] args) {
        isCompleteTree(null);
        System.out.println("Hello World!");
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    List<Integer> x = new ArrayList<>();

    public boolean isCompleteTree(TreeNode root) {

        if (root == null)
            return true;
        if(!completeTree(root))
            return false;
        Integer top=0;

        for (Integer elem: x) {
            if(top==null)
                return false;
            top=elem;
        }


        return true;
    }

    boolean completeTree(TreeNode root) {

        System.out.println("Element: " + root.val);
        if (root.left == null && root.right == null) {
            x.add(root.val);
            return true;
        }
        if(root.left!=null){
            completeTree(root.left);
        }
        else
            x.add(null);
        x.add(root.val);

        if(root.right!=null){
            completeTree(root.right);
            // return true;
        }

        else
        if(x.get(x.size()-1)==root.left.val){
            x.add(null);
            // return true;
        }
        else
            return false;
        return true;
    }
}
