import java.util.*;
class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        int min_space=-1;int len=0;
        int p=0;
        List<String> res=new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
             len+=words[i].length();
             min_space+=1;
             int dk=-1;
             if(len+min_space>maxWidth)
             {
                 len-=words[i].length();
                 min_space=min_space-1;;
                 int space=maxWidth-len;
                  System.out.println(space+""+min_space);
                 int sp=0;
                 int k;
                 String st="";
                 if(space%(min_space)==0)
                 {
                       System.out.println("nsh");
                     sp=space/min_space;
                     for(int j=p;j<i;j++)
                     {
                      k=0;
                     dk=j;
                     st+=words[j];
                     if(dk<i-1)
                     {
                     while(k<sp){
                          st+=" ";
                          k++;  }
                     }
                     }
             }
            else if(space%(min_space)!=0)
             {
               
                 sp=space/min_space;
                  for(int j=p;j<i;j++)
                  {
                     st+=words[j];
                     k=0;
                     dk=j;
                     if(dk<i-1)
                     {
                     if(j==p)
                     {
                     while(k<=(sp+(space%min_space))){
                          st+=" ";
                          k++;  }
                     }
                          else
                          {
                              while(k<sp){
                          st+=" ";
                          k++;  }
                          }
                     }
                }
               
             }
             res.add(st);
             i--;
             p=i+1;
             len=0;
             min_space=0;
        }
        if(i==words.length-1)
        {
          int space=maxWidth-len;
                 int sp=0;
                 int k;
                 String st="";
                 if(space%min_space==0)
                 {
                     sp=space/min_space;
                     for(int j=p;j<=i;j++)
                     {
                      k=0;
                     dk=j;
                     st+=words[j];
                     if(dk<i)
                     {
                     while(k<sp){
                          st+=" ";
                          k++;  }
                     }
                     }
             }
            else if(space%min_space!=0)
             {
                 sp=space/min_space;
                 
                  for(int j=p;j<=i;j++)
                  {
                     st+=words[j];
                     k=0;
                     dk=j;
                     if(dk<i)
                     {
                     if(j==p)
                     {
                     while(k<sp+(space%min_space)){
                          st+=" ";
                          k++;  }
                     }
                     if(j==i)
                     {
                         while(k<sp)
                         {
                             st+=" ";
                             k++;
                         }
                     }
                          else
                          {
                              while(k<sp){
                          st+=" ";
                          k++;  }
                          }
                     }

                }
               
             }
             res.add(st);
        }
    }
    return res;
}
}
public class textjustification  {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] words=new String[n];
        for(int i=0; i<n; i++)
        {
        words[i]=sc.nextLine();
        }
        Solution solution=new Solution();
        List<String> word=solution.fullJustify(words, 16);
        System.out.println(word);
}
}


