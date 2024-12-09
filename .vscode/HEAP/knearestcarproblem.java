import java.util.*;
public class knearestcarproblem {
    public static class Car implements Comparable<Car> 
    {
        int x;
        int y;
        int disty;
        int id;
        public  Car(int x,int y,int disty,int id)
        {
            this.x=x;
            this.y=y;
            this.disty=disty;
            this.id=id;
        }
        @Override
        public int compareTo(Car c)
        {
            return this.disty-c.disty;
        }
    }
    PriorityQueue<Car> pq;
    public knearestcarproblem()
    {
        this.pq=new PriorityQueue<Car>(Comparator.reverseOrder());
    }
    public static void main(String arg[])
    {
        knearestcarproblem obj=new knearestcarproblem();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("Enter the value");
        int[][] arr=new int[n][2];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<2;j++)
            {
            arr[i][j]=sc.nextInt();
            }
        }
       obj.kcars(arr,n,2);
    }
    public void kcars(int[][] arr,int n,int k)
    {
        int i;
        for(i=0;i<n;i++)
        {
           int dist=arr[i][0]*arr[i][0] + arr[i][1]*arr[i][1];
            pq.add(new Car(arr[i][0], arr[i][1], dist, i));
        }
        while(i>k)
        {
            pq.remove();
            i--;

        }
        while(!pq.isEmpty())
        {
            System.out.print("C"+pq.peek().id+"&");
            pq.remove();
        }
    }
}
