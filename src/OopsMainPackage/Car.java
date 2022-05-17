package OopsMainPackage;

public abstract class Car {

    public void wheels () {

         System.out.println("Car have a 4 wheels");
     }
   public void lights(){

        System.out.println("Car have 2 head lights");
    }

 public void steering() {
        System.out.println("Car have 1 steering");
    }

   public abstract String color();
    public abstract int prize();




}


