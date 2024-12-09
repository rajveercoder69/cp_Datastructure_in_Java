public class ExceptionHandling {
    public static void main(String[] args)  {
        int ab=15;
        try
        {
            int result=ab/0;
            System.out.println(result);
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage()+"\n"+ex.getStackTrace());
        }
        finally
        {
        System.out.println("We got an exception!");
        }
    }
}
