import java.util.ArrayList;
import java.util.List;

public class neu1 {
    public static void main(String[] args) {
        List<Integer>list1=new ArrayList<>();
        List<Integer>list2=new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);
        list2.add(7);
        list2.add(9);
        list2.add(11);
        list1.addAll(list2);
        for (Integer number:list1){
            if (number>3){
                System.out.println(number+"buyuk");
                System.out.println(number+"kucuk");
            }
        }
    }
}
