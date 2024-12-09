import java.io.IOException;
import java.util.*;
public class teamdivision {
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the team length");
        int n=sc.nextInt();
        System.out.println("Enter the team members ");
        int [] members=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            members[i]=sc.nextInt();
            sum+=members[i];
        }
        teamdivision obj=new teamdivision();
        int team1=obj.backtrack(members,n,0,0,sum);
        int team2=sum-team1;
        System.out.println(team1+","+team2);
    }
    public int backtrack(int[] members,int n,int val,int index,int sum)
    {
        if(index>n/2+1)
        {
            return Integer.MAX_VALUE;
        }
        if(index==n/2)
        {
            return sum-val;
        }
      return Math.min(backtrack(members, n, val+members[index], index+1, sum),backtrack(members, n, val, index+1, sum));
    }
}
