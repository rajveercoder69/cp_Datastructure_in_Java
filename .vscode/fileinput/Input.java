import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Input {
    public  static void readacc()throws IOException
    {
        try (BufferedWriter writeFil = new BufferedWriter(new FileWriter("D:\\Documents\\DSA placement\\.vscode\\fileinput\\output1.txt"))) {
            writeFil.write("\n"+"Rajveer,14356,4000202");
            writeFil.write("\n"+"veer,14356,4000202");
            writeFil.write("\n"+"veer2,14356,4000202");
            writeFil.write("\n"+"rajver,14356,4000202");
        }
        Scanner readFile=new Scanner(new File("D:\\Documents\\DSA placement\\.vscode\\fileinput\\output1.txt"));
        String name="";
        int account=0;
        int balance=0;
        StringTokenizer token=null;
        System.out.println(readFile.nextLine());
        while(readFile.hasNextLine())
        {
            token=new StringTokenizer(readFile.nextLine(),",");
            name=token.nextToken();
            account=Integer.parseInt(token.nextToken());
            balance=Integer.parseInt(token.nextToken());
            System.out.println(name+balance+account);
        }
    }
    public static File editrecord(String name,String path,String newname)
    {
        String tempp="D:\\Documents\\DSA placement\\.vscode\\fileinput\\temp.txt";
        File temp=new File(tempp);
        File oldfile=new File(path);
        String namee="";
        String balance="";
        String acc="";
        try
        {
            BufferedWriter bw=new BufferedWriter(new FileWriter(tempp, true));
            PrintWriter pw=new PrintWriter(bw);
            Scanner readFile=new Scanner(new File(path));
            readFile.useDelimiter("[,\n]");
            while(readFile.hasNext())
            {
                namee=readFile.next();
                acc=readFile.next();
                balance=readFile.next();
                if(namee.equals(name))
                {
                    pw.println(newname+","+acc+","+balance);

                }
                else{
                    pw.println(namee+","+acc+","+balance);
                }
            }
            readFile.close();
            pw.flush();
            pw.close();
            oldfile.delete();
            File dump=new File("Rajveer","D:\\Documents\\DSA placement\\.vscode\\fileinput\\output1.txt");
            temp.renameTo(dump);
        }
        catch(Exception e)
        {
            System.out.println("Error");
        }
        return temp;
    }
    public static void main(String args[])throws IOException
    {
        readacc();
        File path=editrecord("Rajveer","D:\\Documents\\DSA placement\\.vscode\\fileinput\\output1.txt","Antu");
        try{
        Scanner readFile=new Scanner(path);
        readFile.useDelimiter("[,\n]");
        while(readFile.hasNext())
        {
            String name=readFile.next();
            String acc=readFile.next();
            String bal=readFile.next();
            System.out.println(name+","+acc+","+bal+"\n");
        }
        readFile.close();
    }
    catch(Exception e)
    {
        System.out.println("Error");
    }
    }
}
