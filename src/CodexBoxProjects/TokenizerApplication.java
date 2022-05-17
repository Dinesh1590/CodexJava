package CodexBoxProjects;

import java.util.StringTokenizer;

public class TokenizerApplication {

    public static void main(String[] args) {

        StringTokenizer st = new StringTokenizer("Life is like Battleground Mobile India, we never know from which side the enemy may arrive and hit us. So live your each and every day, happily, and be ready for challanges."," ");

        System.out.println(st.countTokens());
while (st.hasMoreElements()){

            System.out.println(st.nextElement());
        }




    }

}
