
package problem1.node;
import java.util.Scanner;

public class TreeNode
{

    private TreeNode left;
    private TreeNode right;
    private int data;


    //default constructor

    public TreeNode()
    {
        System.out.print("Enter integer value : ");
        data = new Scanner(System.in).nextInt();
        left = right = null;

    }
    public TreeNode getLeft()
    {
        return left;
    }

    public void setLeft(TreeNode left)
    {
        this.left = left;
    }

    public TreeNode getRight()
    {
        return right;
    }

    public void setRight(TreeNode right)
    {
        this.right = right;
    }

    public int getData()
    {
        return data;
    }

    public void setData(int data)
    {
        this.data = data;
    }
}
