package CodexBoxProjects;

public class DataTypes {
    public static void main(String[] args) {
        byte num1=100;
        short num2=5466;
        int num3=646461;
        long num4=num1+num2+num3;

        char section='A';
        float percentage=30.4565f;
        double percentage1=68876.98732974990;
        boolean flag = true;
        char ss=207;

        double total=num4+num1+num2+num3+percentage+percentage1;
        System.out.println(total>num4);
        System.out.println(~num2);


        if(total>num4) {
            flag = false;
        }
            System.out.println(flag);


        System.out.println(ss);

        System.out.println(num4);

        System.out.println(total);
    }
}
