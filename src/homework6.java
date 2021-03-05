import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class homework6 {
    public static void main(String[] args) {
        ArrayList<Integer>intlist=new ArrayList<>();
        intlist.add(4);
        intlist.add(1);
        intlist.add(5);
        intlist.add(9);
        intlist.add(6);
        Collections.sort(intlist);
        System.out.println(intlist);

        for (int i = 0; i <intlist.size() ; i++) {
            for (int j = i+1; j <intlist.size()+1 ; j++) {
                if (intlist.get(i)> intlist.get(j)){
                    System.out.println(i);



            }

        }



        }

    }
}
