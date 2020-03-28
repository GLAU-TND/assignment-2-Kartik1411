package problem3.myqueue;


import problem3.node.Node;

public class MyPriorityQueue
{
    private Node temp, front, end;
    private  int i = 0;


    // inserting  new student into into queue
    // and priority is set by roll number
    public void enqueue(Node newNode)
    {

        if (front == null || newNode.getS().getRollNo() < front.getS().getRollNo())
        {
            newNode.setNext(front);
            front = newNode;
        }
        else
            {
            temp = front;

            while (temp.getNext() != null && temp.getNext().getS().getRollNo() < newNode.getS().getRollNo())
            {
                temp = temp.getNext();
            }
            newNode.setNext(temp.getNext());
            temp.setNext(newNode);
            }
    }

    // printing queue

    public void dequeue()
    {
        if (front == null)
        {
            System.out.println("No entry found");
            return;
        }
        do
            {
            System.out.println(i++);
            System.out.print(front.getS().getName() + " : ");
            System.out.println(front.getS().getRollNo());
            front = front.getNext();
        }
        while (front != null);
    }
}
