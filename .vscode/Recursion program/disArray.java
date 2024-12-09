public class disArray {
public static void main(String args[])
{
    int[] arr={4,5,6,7,8,4};
    int ind=0;
    disArray obj=new disArray();
    obj.display(arr,ind);
}
public void display(int[] ar,int id)
{
    if(id==ar.length)
    {
        return;
    } 
    System.out.println(ar[id]);
    display(ar,id+1);
    System.out.println(ar[id]);
}
}
