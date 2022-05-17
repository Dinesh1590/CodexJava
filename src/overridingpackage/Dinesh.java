package overridingpackage;

public class Dinesh extends StudentApplication {

    public String schoolName(String sn) {
        System.out.println("dinesh schoolname is : ");
        return sn;
    }

    public int rollNumber(int rn) {
        System.out.println("dinesh rollnumber is : ");
        return rn;
    }

    public String dob(String dob,int k,int l)
    {
        System.out.println("dinesh date of birth is : ");
        return k+l+dob;
    }

}
