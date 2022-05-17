package CodexBoxProjects;

public class PatternsApplication {
    public static void main(String[] args) {

        int n=5;

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+ " ");
            }
            System.out.println();
        }

        for(int i=5;i>0;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }



        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("0"+j+" ");
            }
            System.out.println();
        }


 for(int i=1;i<=4;i++)
 {
     for (int j=1;j<=i;j++)
     {
         System.out.print(j+" ");
     }
     System.out.println();
 }
 for(int i=5;i>0;i--)
 {
     for(int j=1;j<=i;j++)
     {
         System.out.print(j+" ");
     }
     System.out.println();
 }



for(int i=6;i>=0;i--)
{
    for(int j=i-1;j>0;j--)
    {
        System.out.print(j);
    }
    System.out.println();
}




        for(int i=5;i>0;i--)
        {
            for(int j=1;j<i;j++)
                {
                    System.out.print(" ");
                }
                for(int k=i;k<=5;k++)
                {
                    System.out.print("*");
                }
            System.out.println();
        }

            }

}








