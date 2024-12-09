@FunctionalInterface
interface A
{
 void show();
}
// class B implements A
// {
//     public void show()
//     {
//         System.out.println("Rajveer: Learning Interface");
//     }
// }
public class UnderstandingInterface {
    public static void main(String[] args)
    {
        A obj= ()-> System.out.println("Rajveer: Learning Interface of A");
        obj.show();
    }
}
