import java.util.*;

public class basic {
public static class Student implements Comparable<Student>
{
    String student;
    int rollno;
    public Student(String student,int rollno)
    {
        this.student=student;
        this.rollno=rollno;
    }
    @Override
    public int compareTo(Student s2)
    {
        return this.rollno-s2.rollno;
    }
}
    public static void main(String arg[])
    {
        PriorityQueue<Student> pq=new PriorityQueue<Student>(Comparator.reverseOrder());
        pq.add(new Student("A",1));
        pq.add(new Student("B",4));
        pq.add(new Student("C",0));
        pq.add(new Student("D",45));
        while(!pq.isEmpty())
        {
            System.out.println(pq.peek().student+" -> "+pq.peek().rollno);
            pq.remove();
        }
    }
}
