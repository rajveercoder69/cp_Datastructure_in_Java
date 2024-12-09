import java.util.*;
public class civil {
    public static void main(String[] args)throws Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num length");
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        boolean iron=true;
        int i=0;
        int j=n-1;
        int q=0;
        int ironman_Team=0;
        int captain_team=0;
        while(q<n)
        {
            if(iron)
            {
                if(a[i]<a[j])
                {
                    if(a[j]<0)
                    {
                        ironman_Team+=a[j];
                        j--;
                        q++;
                    }
                    else
                    {
                    while(j>=i&&a[j]>0)
                    {
                    ironman_Team+=a[j];
                    j--;
                    q++;
                    }
                }
                }
                else{
                     if(a[i]<0)
                    {
                        ironman_Team+=a[i];
                        i++;
                        q++;
                    }
                    else
                    {
                    while(i<=j&&a[i]>0)
                    {
                    ironman_Team+=a[i];
                    i++;
                    q++;
                    }
                    }
                }
            }
            else
            {
                 if(a[i]<a[j])
                {
                     if(a[j]<0)
                    {
                        captain_team+=a[j];
                        j--;
                        q++;
                    }
                    else
                    {
                    while(j>=i&&a[j]>0)
                    {
                    captain_team+=a[j];
                    j--;
                    q++;
                    }
                    }
                }
                else{
                     if(a[i]<0)
                    {
                        captain_team+=a[i];
                        i++;
                        q++;
                    }
                    else
                    {
                    while(i<=q&&a[i]>0)
                    {
                    captain_team+=a[i];
                    i++;
                    q++;
                    }
                    }
                }
            }
            iron=!iron;
            if(q==n)
            {
                break;
            }
        }
        System.out.print(ironman_Team-captain_team);
    }
}
