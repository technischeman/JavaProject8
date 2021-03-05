import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class dd {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        list.add("ptes");
        list.add("sali");
        list.add("carsamba");
        list.add("persembe");
        list.add("cuMa");
        list.add("ctesi");
        list.add("payar");
        for (String gün:list){
            System.out.println(gün.toLowerCase(Locale.ROOT));

        }

    }
}