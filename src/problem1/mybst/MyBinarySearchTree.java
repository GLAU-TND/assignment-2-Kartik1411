
package problem1.mybst;


import problem1.node.TreeNode;
import problem4.myqueue.MyQueue;
import problem4.myqueue.Node;

// to implement BinarySearchTree
public class MyBinarySearchTree
{

    private TreeNode newNode, root, tmp;
    private static int count;
    private MyQueue pre;
    private MyQueue post;

    public MyBinarySearchTree()
    {
        tmp = null;
        root = null;
        MyBinarySearchTree.count = 0;
        post=new MyQueue();
        pre=new MyQueue();
    }

    //setting root node

    public void setRoot()
    {
        newNode = new TreeNode();
        if(root==null)
        {
            root = newNode;
            tmp = root;
            newNode = null;
        }
    }
    public TreeNode getRoot()
    {
        return root;
    }
    public TreeNode getNewNode()

    {
        return newNode;
    }

    public void setNewNode(TreeNode newNode)
    {
        this.newNode = newNode;
    }

    public void setRoot(TreeNode root)

    {
        this.root = root;
    }

    public TreeNode getTmp()

    {
        return tmp;
    }

    public void setTmp(TreeNode tmp)

    {
        this.tmp = tmp;
    }

    public void setCount(int ctr)

    {
        MyBinarySearchTree.count = ctr;
    }

    public MyQueue getPre()

    {
        return pre;
    }

    public void setPre(MyQueue pre)
    {
        this.pre = pre;
    }

    public MyQueue getPost()
    {
        return post;
    }

    public void setPost(MyQueue post)
    {
        this.post = post;
    }

    public int getCount()
    {
        return count;
    }

    //setting binary tree
    public void insert(TreeNode tempRoot)
    {
        if(newNode == null)
        {
            newNode = new TreeNode();
        }

        try {
            if (newNode.getData() <= tempRoot.getData())
            {
                System.out.println("left traversal...");
                if (tempRoot.getLeft() == null)
                {
                    tempRoot.setLeft(newNode);
                    System.out.println("node inserted left");
                    pre.enqueue(new Node(newNode));//only left insertion
                    newNode = null;
                    return;
                }
                else
                {
                    System.out.println("left not empty changing temp root ");
                    insert(tempRoot.getLeft());
                }
            }
        } catch(NullPointerException ignore){}


        try {
            if (newNode.getData() > tempRoot.getData())
            {
                System.out.println("Right traversal...");
                if (tempRoot.getRight() == null)
                {
                    tempRoot.setRight(newNode);
                    System.out.println("Node inserted right");
                    newNode = null;
                }
                else
                {
                    System.out.println("Right not empty changing tmproot");
                    insert(tempRoot.getRight());
                }
            }
        } catch (NullPointerException ignore)
        {

        }

    }

    public void countNotLeft(TreeNode node)
    {
        if(node==null)
        {
            return;
        }

        countNotLeft(node.getLeft());

        if(node.getLeft()!=null)
        {
            ++count;
        }
        countNotLeft(node.getRight());

    }

    //pre-order
    public void preOrder(TreeNode node) {
        if (node == null)
        {
            return;
        }

        preOrder(node.getLeft());
        preOrder(node.getRight());
    }

    //post-order
    public void postOrder(TreeNode node)
    {
        if(node == null)
        {
            return;
        }

        postOrder(node.getLeft());
        postOrder(node.getRight());


    }

}
