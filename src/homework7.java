import java.util.ArrayList;

public class homework7 {
    public static void main(String[] args) {
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<Integer>list2=new ArrayList<>();
        list1.add(0,5);
        list1.add(1,9);
        list1.add(2,7);
        list1.add(3,0);
        list1.add(4,3);
        list2.add(0,6);
        list2.add(1,7);
        list2.add(2,8);
        list2.add(3,0);
        list2.add(4,3);
        for (int i = 0; i <list1.size() ; i++) {
            for (int j = 0; j <list2.size() ; j++) {
                if (i==j&&list1.get(i)==list2.get(j)){
                    System.out.print(i+". index esit");
                    System.out.println(" ve elemani="+list1.get(i));
                }

            }

        }
    }
}
