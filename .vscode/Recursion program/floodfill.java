import java.util.Scanner;

public class floodfill {
    public static void main(String arg[])
    {
        floodfill obj=new floodfill();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] ar=new int[n][m];
        for(int i=0;i<ar.length;i++)
        {
            for(int j=0;j<ar[0].length;j++)
            {
                 ar[i][j]=sc.nextInt();
            }
        }
        boolean[][] visited=new boolean[n][m];
        obj.flood(ar,0,0,"",visited);
    }
    public void flood(int[][] maze,int row,int col,String ans,boolean[][] visit)
    {
        if(row<0||col<0||row==maze.length||col==maze[0].length||maze[row][col]==1||visit[row][col]==true)
        {
            return;
        }
        if(row==maze.length-1&&col==maze[0].length-1)
        {
            System.out.println(ans);
            return;
        }
        else
        {
            visit[row][col]=true;
            flood(maze,row-1,col,ans+"t",visit);
            flood(maze,row,col-1,ans+"l",visit);
            flood(maze,row+1,col,ans+"d",visit);
            flood(maze,row,col+1,ans+"r",visit);
            visit[row][col]=false;
        }
    }
}
