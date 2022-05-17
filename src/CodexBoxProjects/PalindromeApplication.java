package CodexBoxProjects;
import java.util.Scanner;

public class PalindromeApplication {

    public static void main(String[] args) {
        int rem,sum=0,temp;
        Scanner sc=new Scanner(System.in);
/*

        System.out.println("enter one number : ");

        int num=sc.nextInt();
        temp=num;
        while(num>0)
        {
         rem=num%10;
         num=num/10;
         sum=sum*10+rem;
        }

        if(sum==temp)
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");



        String A=sc.next();
        */
/* Enter your code here. Print output to STDOUT. *//*


        char[] str=A.toCharArray();

        String s="";
        for (int i = 0; i < str.length; i++) {

            s=s+str[str.length-i-1];

        }
        System.out.println(s);

        if(s.equals(A))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
*/

        String A="helloqwertyui";
        String B="aaaaaaaaaaaaa";


        System.out.println(A.length()+B.length());


        String x=A.compareTo(B)>0?"Yes":"No";


        System.out.println(x);

        System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1, A.length())+" "+B.substring(0, 1).toUpperCase()+B.substring(1, B.length()));



    }

}
