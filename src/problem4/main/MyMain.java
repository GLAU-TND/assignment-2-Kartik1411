
package problem4.main;

import problem1.mybst.MyBinarySearchTree;
import problem4.myqueue.MyQueue;

import java.util.Scanner;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        MyBinarySearchTree m = new MyBinarySearchTree();
        MyQueue q = new MyQueue();

        //setting up the root

        m.setRoot();

        //inserting into the tree

        for (int i = 0; i < 5; i++)
        {
            m.insert(m.getRoot());
        }

        //method to print pre-order Successor of given Node

        q.preOrder(m.getRoot());

        q.queuePrint(q);

        System.out.print("Enter value of which you want to find pre-order Successor : ");
        q.printSuccessor(sc.nextInt());

    }
}
