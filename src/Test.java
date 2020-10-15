/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-10-15
 * Time:21:25
 **/
class Node1 {
    public char val;
    public  Node1 left;
    public Node1 right;

    public Node1(char val){

        this.val = val;
    }

}
public class Test {
    public static int height(Node1 root){
        if (root == null){
            return 0;
        }
        int left = height(root.left) +1;
        int right = height(root.right)+1;
        return Math.max(left,right)+1;
    }
    public static void print(Node1 root){
        if (root == null){
            return;
        }
       


    }

}
