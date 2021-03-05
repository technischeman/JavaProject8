import java.util.ArrayList;

public class calisma {
    public static void main(String[] args) {
        ArrayList<Integer>int_list=new ArrayList<>();
        int_list.add(1);
        int_list.add(3);
        int_list.add(4);
        int_list.add(5);
        int_list.add(6);
        for (int i = int_list.size()-1; i>=0 ; i++) {
            System.out.println(int_list.get(i));

        }
    }
}
