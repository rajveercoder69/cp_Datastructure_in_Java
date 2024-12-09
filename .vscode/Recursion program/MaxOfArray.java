public class MaxOfArray {
    public static void main(String args[])
    {
        int[] arr={4,5,6,7,8,4,45,553,556,3,3345,233456,445666544,897678456,987645389,214783486};
        int ind=0;
        MaxOfArray obj=new MaxOfArray();
        int n=0;
        obj.display(arr,ind,n);
    }
    public void display(int[] ar,int id,int max)
    {
        if(id==ar.length)
        {
        System.out.println(max);
        }
        else{
            if(max<ar[id])
            {
                max=ar[id];
                display(ar,id+1,max);
            }
            else{
                display(ar,id+1,max);
            }
        }
    }
    }