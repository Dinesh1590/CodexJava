package CodexBoxProjects;


import Ownprojects.StudentApplication;

import java.util.ArrayList;
import java.util.List;

public class SchoolApplication {

    public static void main(String[] args) {

        StudentApplication std1 = new StudentApplication();
        std1.setName("Dinesh");
        std1.setRollno(101);
        std1.setMarks(556);
        std1.setSection('A');

        StudentApplication std2 = new StudentApplication();
        std2.setName("Vidya");
        std2.setRollno(102);
        std2.setMarks(555);
        std2.setSection('A');

        StudentApplication std3 = new StudentApplication();
        std3.setName("mounika");
        std3.setSection('B');
        std3.setMarks(456);
        std3.setRollno(103);

        StudentApplication std4 = new StudentApplication();
        std4.setName("sohail");
        std4.setSection('B');
        std4.setMarks(456);
        std4.setRollno(104);

        StudentApplication std5 = new StudentApplication();
        std5.setName("vasu");
        std5.setSection('A');
        std5.setMarks(458);
        std5.setRollno(105);


        List<StudentApplication> stds = new ArrayList<>();

        stds.add(std1);
        stds.add(std2);
        stds.add(std3);
        stds.add(std4);
        stds.add(std5);


//        for (int i = 0; i < stds.size(); i++) {
//            System.out.println(stds.get(i).getName());
//            System.out.println(stds.get(i).getSection());
//            System.out.println(stds.get(i).getRollno());
//            System.out.println(stds.get(i).getMarks());
//
//        }

//
//        for (StudentApplication s:stds) {
//
//            System.out.println("**************--------------*******************");
//
//            System.out.println(s.getName());
//            System.out.println(s.getSection());
//            System.out.println(s.getRollno());
//            System.out.println(s.getMarks());
//
//
//            System.out.println();
//        }


    }
}
