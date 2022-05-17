package OopsMainPackage;

public class Ford extends Car {
    private String color;
    private int rate;

    public Ford(String c,int r)
    {
        this.color=c;
        this.rate=r;
    }


    public String color()
    {
        return color;
    }


   public int prize()
    {
        return rate;
    }


}
