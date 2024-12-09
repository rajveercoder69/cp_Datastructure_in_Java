import java.util.Scanner;

public class minimal {
    public long putMarbles(int[] weights, int k) {
        int low=0;
        int high=0;
        int sum=0;
        for(int i=0;i<weights.length;i++)
        {
            sum=sum+weights[i];
        }
        high=sum;
        int mid=low+(high-low)/2;
        int lowans=0;
        int highans=0;
        while(low<=high)
        {
            int[] kk=issafe(mid,weights,k);
            if(kk[0]==1)
            {
                System.out.println(kk[1]);
                lowans=Math.min(lowans,kk[1]);
                highans=Math.max(highans,kk[1]);
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
             mid=low+(high-low)/2;
        }
        return highans-lowans;
    }
    public int[] issafe(int mid,int[] weights,int k)
    {
        int[] kl=new int[2];
        int sum=0;
        int counter=1;
        int index=0;
        for(int i=0;i<weights.length;i++)
        {
            if(sum+weights[i]<=mid)
            {
                sum=sum+weights[i];
            }
            else{
                counter++;
                if(counter>k|| weights[i]>mid)
                {
                    kl[0]=0;
                    return kl ;
                }
                kl[1]+=weights[index]+weights[i];
                index=i;
                sum=weights[i];
            }
        }
        kl[1]+=weights[index]+weights[weights.length-1];
        kl[0]=1;
        return kl;
    }
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
        minimal obj=new minimal();
       long p=obj.putMarbles(book,m);
        System.out.println("the minimum page of book allocated is:"+p);
    }
}
