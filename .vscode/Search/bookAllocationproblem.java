import java.util.*;
class bookAllocationproblem
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the book size");
        int n=sc.nextInt();
        int[] book=new int[n];
        for(int i=0;i<n;i++)
        {
            book[i]=sc.nextInt();
        }
        System.out.println("Enter the number of student");
        int m=sc.nextInt();
        bookAllocationproblem obj=new bookAllocationproblem();
       int p=obj.bookallocate(n,book,m);
        System.out.println("the minimum page of book allocated is:"+p);
    }
    public int bookallocate(int n,int[] books,int m)
    {
        int min=0; int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+books[i];
        }
        int max=sum;
        int count=-1;
        int c=0;
        int mid=min+(max-min)/2;
        while(min<=max)
        {
            int[] kl=ischecksolution(mid,books,m,n);
            if(kl[0]==1)
            {
                System.out.println(kl[1]);
                c=Math.max(kl[1],c);
                count=mid;
                max=mid-1;
            }
            else
            {
                min=mid+1;
            }
            mid=min+(max-min)/2;
        }
        return c-count;
    }
    public int[] ischecksolution(int mid,int[] books,int m,int n)
    {
        int sum=0;
        int counter=1;
        int index=0;
        int[] kk=new int[2];
        for(int i=0;i<n;i++)
        {
            if(sum+books[i]<=mid)
            {
                sum=sum+books[i];
            }
            else{
                kk[1]+=books[index]+books[i-1];
                System.out.println(" this is"+index+"this is som"+i);
                index=i;
                counter++;
                if(counter>m|| books[i]>mid)
                {
                    kk[0]=0;
                    return kk;
                }
                sum=books[i];
            }
        }
        kk[1]+=books[index]+books[n-1];
        kk[0]=1;
        return kk;
    }
}