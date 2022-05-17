package CodexBoxProjects;

public class WrapperToPrimitive {

    private int a=10;
    private short b=20;
    private byte c=30;
    private char d='a';
    private long e;
    private boolean f;
    private float g;
    private double h;


    Integer integer=new Integer(a);
    Short aShort=new Short(c);
    byte i=90;
    Byte aByte=new Byte(i);


    static void m(Integer i)
    {System.out.println("Integer");}
    static void m(int i)
    {System.out.println("int");}


    public static void main(String[] args) {

        WrapperToPrimitive wrapperToPrimitive =new WrapperToPrimitive();
        System.out.println(wrapperToPrimitive.integer);

short p=1234;
             Short p1=p;


        System.out.println(p1);
            Integer ashort=new Integer(wrapperToPrimitive.c);
            int s=10;
            m(s);

    }















}
