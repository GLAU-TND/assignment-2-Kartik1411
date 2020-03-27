package problem3.main;


import problem3.myqueue.MyPriorityQueue;
import problem3.node.Node;

// executable class
// use problem5.student.Student class to create object of student

public class MyMain
{
    public static void main(String[] args)
    {
        MyPriorityQueue m = new MyPriorityQueue();

        for (int i = 0; i < 4; i++)
        {
            Node newNode=new Node();
            m.enqueue(newNode);
        }

        m.dequeue();
    }
}
