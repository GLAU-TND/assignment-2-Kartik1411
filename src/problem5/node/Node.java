
package problem5.node;

import problem5.student.Student;

// to define node properties
public class Node
{
    private Student s;
    private  Node next;


    public Student getS()
    {
        return s;
    }

    public void setNext(Node next)
    {
        this.next = next;
    }


    public void setS(Student s)
    {
        this.s = s;
    }

    public Node getNext()
    {
        return next;
    }

    public Node(Student s)
    {
        this.s = s;
        next=null;
    }
}
