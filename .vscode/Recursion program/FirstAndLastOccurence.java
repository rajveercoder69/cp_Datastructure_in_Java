public class FirstAndLastOccurence {
   
    public static void main(String[] args)
    {
        int[][] alphabet= new int[26][3];
       // int[][] alphabet= new int[26][2];
        for(int i=0;i<alphabet.length;i++)
        {
            alphabet[i][0]=-1;
            alphabet[i][1]=-1;
            alphabet[i][2]=-1;
        }
        String str="abaaacdaefaabdh";
        alphabet=find_Occurence(str,0,alphabet);
        char start='a';
       // System.out.println(alphabet[0][0]);
       for (int i = 0; i < alphabet.length; i++) {
        if (alphabet[i][0] != -1) { // Check if the character appeared in the string
            System.out.println("Character: " + start + ", First Index: " + alphabet[i][0] + ", Last Index: " + alphabet[i][1] + ", Number of Occurences: " + alphabet[i][2]);
        }
        start++;
    }
    }
    public static int[][] find_Occurence(String str,int start, int[][] alphabet)
    {
        if(start==str.length())
        {
        return alphabet;
        }
            char element=str.charAt(start);
            int integerValueChar= element-'a';
        if(alphabet[integerValueChar][0]==-1)
        {
           // System.out.println(val);
            alphabet[integerValueChar][0]=start;
            alphabet[integerValueChar][2]++;
            System.out.println("FirstIndex"+"\t"+alphabet[integerValueChar][0]+"of char"+str);
        }
        alphabet[integerValueChar][1]=start;
        alphabet[integerValueChar][2]++;
       // System.out.println("LastIndex"+alphabet[val][1]+"of char"+st);
        return find_Occurence(str, start+1,alphabet);
    }
}

