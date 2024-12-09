import java.io.*;
public class inputoutput {
    public static void main(String args[]) throws FileNotFoundException
    {
        String [] str={"RAj","veer","Singh"};
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Documents\\DSA placement\\.vscode\\fileinput\\output.txt"))) {
            writer.write("This is my first text file");
            for(String strr:str)
            {
                writer.newLine();
                writer.write(strr);
                writer.write("\n"+"25");
            }
            writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        BufferedReader reader=new BufferedReader(new FileReader("D:\\Documents\\DSA placement\\.vscode\\fileinput\\output.txt"));
        try {
            String line;
            while((line=reader.readLine())!=null)
            {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
