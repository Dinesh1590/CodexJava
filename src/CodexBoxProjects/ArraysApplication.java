package CodexBoxProjects;

import java.util.Scanner;

public class ArraysApplication {

    public static void main(String[] args) {

        int n=5,sum=0,you=1;



        Scanner sc=new Scanner(System.in);
        int[] marks=new int[n];

        System.out.print("Enter student name : " );

        String name=sc.next();

        for(int i=0;i< marks.length;i++)
        {
            System.out.print("enter Subject "+ (i+1) +" marks = ");

          marks[i]=sc.nextInt();


        }

        for(int i=0;i<n;i++) {
            if (marks[i] > 100) {

                System.out.println("marks cannot be greater than 100 ");
                return;
            }
        }


        for(int i:marks)
        {
            sum=sum+i;

            System.out.println("subject " +you +" marks ="+i);
            you++;
        }

        float avg=(float)sum/n;

        System.out.println("average marks of student = "+avg);

if(avg<=100 && avg>=80)
{
    System.out.println(name + " you are a good student");
} else if (avg>50 && avg<=80) {
    System.out.println(name + " you are a avg student");
}
else
    System.out.println(name + " you are a worst student");





    }

}
