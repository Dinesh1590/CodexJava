package CodexBoxProjects;

public class StringBuilderApplication {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("dinesh");

        sb.append(" reddy");

        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());

       // System.out.println(sb.append("007"));

        sb.replace(0,6,"mahesh");
        System.out.println(sb);


        sb.delete(6,12);

        System.out.println(sb);


        sb.chars();
        System.out.println(sb);










    }


}
