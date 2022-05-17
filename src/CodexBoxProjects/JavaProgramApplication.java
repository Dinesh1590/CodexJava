package CodexBoxProjects;

import java.util.Scanner;


public class JavaProgramApplication {

    int sum1=50;
    int sum2=25;

    static int sum3=125;


    Scanner sc=new Scanner(System.in);
    public void greaterP() {


        System.out.println("enter a,b,c values");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();



        if(a>b && a>c)
            System.out.println(a +" is greater");
        if(b>a && b>c)
            System.out.println(b +" is greater");
        else
            System.out.println(c +" is greater");

    }

    void addition()
    {
        System.out.println("enter add of a & b values");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a+b;
        System.out.println(c);

    }
    



    public static void main(String[] args) {
        System.out.println("hello world");


        JavaProgramApplication fp=new JavaProgramApplication(); //object
        fp.greaterP();
fp.addition();

        System.out.println(fp.sum1+fp.sum2+sum3);
        

        

    }



}
