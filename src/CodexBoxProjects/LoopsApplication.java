package CodexBoxProjects;

import java.util.Scanner;

public class LoopsApplication {
    public static void main(String[] args) {

        int i;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a table :");
        int table = sc.nextInt();

        for (i = 1; i <= 10; i++) {
            System.out.println(table + "*" + i + "=" + table * i);


        }

        while (i <= 20) {
            System.out.println(table + "*" + i + "=" + table * i);
            i++;
        }

        System.out.println(i++);
        do {
            System.out.println(--i);
        }
        while (i == 21);


        int a, b, c;

        System.out.println("enter a,b,c values");

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();


        while(i>0)
        {
            if(i>a || i>b || i>c)
            {
                System.out.println(i);
                i--;
                continue;
            }

            if(i<a++ && i<b++ && i<c++)
            {
                System.out.println(i);
                i--;
                break;
            }
            if(i==1)
            {
                System.out.println(i);
                i--;
                return;
            }
            --i;
        }


    }
}
