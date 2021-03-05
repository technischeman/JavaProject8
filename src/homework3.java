import java.util.ArrayList;

public class homework3 {
    public static void main(String[] args) {
        ArrayList<String>sehirler=new ArrayList<>();
       sehirler.add("istanbul");
       sehirler.add("kastamonu");
       sehirler.add("ankara");
       sehirler.add("izmir");
       sehirler.add("bolu");
       sehirler.add("manisa");
       sehirler.add("konya");
        //System.out.println("sehirler"+sehirler);
        //System.out.print("sehirler;"+sehirler.get(0));
        sehirler.remove(2);
        for (int i = 0; i < sehirler.size() ; i++) {
            System.out.println(sehirler.get(i)+"--");

        }
        sehirler.set(2,"ADD");
        for (int i = 0; i < sehirler.size() ; i++) {
            System.out.print("yeni sehir "+(i+1)+sehirler.get(i));

        }



    }
}
