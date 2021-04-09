import java.util.ArrayList;

public class homework4 {
    public static void main(String[] args) {
        ArrayList<Integer>intlist1=new ArrayList<>(5);
        intlist1.add(1453);
        intlist1.add(1071);
        intlist1.add(1991);
        intlist1.add(2017);
        intlist1.add(2021);
        for (int i =0; i <intlist1.size() ; i++) {
            System.out.println("reverse writing="+String.valueOf(intlist1.get(i)));

        }
    }
}
