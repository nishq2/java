import java.util.Scanner;
class Occurence
{
    public static void main(String args[])
    {
    String str;
    int i,j,flag=0;
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a string:");
    str=sc.nextLine();
    int a[]= new int[100];
    int len= str.length();

    for(i=0;i<len;i++)
    {
        a[str.charAt(i)]++;
    }

    char ch[]= new char[str.length()];

    for(i=0;i<len;i++)
    {
        ch[i]=str.charAt(i);
        
        for(j=0; j<=i;j++)
        {
            if(str.charAt(i)==ch[j])
            flag=1;

        }
    }

    if(flag==1)
    {
        System.out.println("The number of occurences: "+str.charAt(i)+"is "+a[str.charAt(i)]);
    }

    sc.close();
}
}

// class Occurence {
//     static final int MAX_CHAR = 256;
 
//     static void getOccuringChar(String str)
//     {
         
//         // Create an array of size 256
//         // i.e. ASCII_SIZE
//         int count[] = new int[MAX_CHAR];
 
//         int len = str.length();
 
//         // Initialize count array index
//         for (int i = 0; i < len; i++)
//             count[str.charAt(i)]++;
 
//         // Create an array of given String size
//         char ch[] = new char[str.length()];
//         for (int i = 0; i < len; i++) {
//             ch[i] = str.charAt(i);
//             int find = 0;
//             for (int j = 0; j <= i; j++) {
 
//                 // If any matches found
//                 if (str.charAt(i) == ch[j])
//                     find++;
//             }
 
//             if (find == 1)
//                 System.out.println(
//                     "Number of Occurrence of "
//                     + str.charAt(i)
//                     + " is:" + count[str.charAt(i)]);
//         }
//     }
   
//     // Driver Code
//     public static void main(String[] args)
//     {
//         String str = "geeksforgeeks";
//         getOccuringChar(str);
//     }
// }