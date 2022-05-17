package OopsMainPackage;

public class MainApplication {

    public static void main(String[] args) {

        Benz benz=new Benz("white",9541544);

        System.out.println("benz color is : " + benz.color());
        System.out.println("benz prize is : " + benz.prize());
    benz.steering();
        benz.lights();
        benz.wheels();

        Ford ford=new Ford("blue",558548);


        System.out.println("ford color is : " + ford.color());
        System.out.println("ford prize is : " + ford.prize());
        ford.steering();
        ford.lights();
        ford.wheels();





    }
}
