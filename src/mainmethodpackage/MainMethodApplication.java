package mainmethodpackage;

import interfacepackage.America;
import interfacepackage.Country;
import interfacepackage.Pakistan;
import overridingpackage.Dinesh;
import overridingpackage.StudentApplication;

public class MainMethodApplication {
    public static void main(String[] args) {

    /*    America america=new America(9.843f,320,"the star spangled banner","dollers" );

        System.out.println("america area : " +america.area() +" million sq.km");
        System.out.println("america currency : "+america.currency());
        System.out.println("america population : "+america.population()+" million");
        System.out.println("america national song : "+america.nationalsong());

        System.out.println();

        Country pakistan=new Pakistan(0.881f,220,"qaumi taranah","pakistan rupee");

        System.out.println("pakistan area : " +pakistan.area()+" million sq.km");
        System.out.println("pakistan currency : "+pakistan.currency());
        System.out.println("pakistan population : "+pakistan.population()+" million");
        System.out.println("pakistan national song : "+pakistan.nationalsong());
*/



        Dinesh dinesh=new Dinesh();
        System.out.println(dinesh.dob("23-02-1999",45,456));

        System.out.println(dinesh.rollNumber(123));

















    }}
















