
package problem5.student;

import java.util.Scanner;


// to store student information and properties
public class Student
{
    private  String name;
    private  int rollNo, backlog, appearingCount;

    public Student()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Name :");
        this.name = sc.next();

        System.out.print("Roll.no : ");
        this.rollNo = sc.nextInt();

        System.out.print("Backlog_count : ");
        this.backlog = sc.nextInt();

        System.out.print("appearing_count");
        this.appearingCount = sc.nextInt();


    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getRollNo()
    {
        return rollNo;
    }

    @Override
    public String toString()
    {
        return  "name='" + name + '\'' +
                ", roll no = " + rollNo +
                ", backlog = " + backlog +
                ", appearing count=" + appearingCount;
    }

    public void setRollNo(int rollNo)
    {
        this.rollNo = rollNo;
    }

    public int getBacklog()
    {
        return backlog;
    }

    public void setBacklog(int backlog)
    {
        this.backlog = backlog;
    }

    public int getAppearingCount()
    {
        return appearingCount;
    }

    public void setAppearingCount(int appearingCount)
    {
        this.appearingCount = appearingCount;
    }
}
