package CodexBoxProjects;

public class StringBufferApplication {

    public static void main(String[] args) {


        StringBuffer sb=new StringBuffer("dinesh");


        System.out.println(sb.capacity());

        System.out.println(sb);

        sb.append(" reddy");

        System.out.println(sb);

        sb.insert(0,"devireddy ");

        System.out.println(sb);

        sb.insert(4,"kjhh");

        System.out.println(sb);

        System.out.println(sb.capacity());

        sb.delete(4,8);

        System.out.println(sb);

        System.out.println(sb.reverse());

        System.out.println(sb.length());

        System.out.println(sb.replace(0,5,"AAAAAA"));

        System.out.println(sb.reverse());

        sb.delete(16,23);
        System.out.println(sb);

        System.out.println(sb.capacity());

       sb.trimToSize();

        System.out.println(sb);
        System.out.println(sb.capacity());


        sb.append(" reddy");

        System.out.println(sb);
        System.out.println(sb.capacity());

        sb.append(" you are selected");
        System.out.println(sb.capacity());
        System.out.println(sb);






    }
}
