import java.util.ArrayList;

public class homework5 {
    public static void main(String[] args) {
        ArrayList<String> cities=new ArrayList<>();
        sehirler.add(0,"istanbul");
        sehirler.add(1,"kastamonu");
        sehirler.add(2,"ankara");
        sehirler.add(3,"izmir");
        sehirler.add(4,"bolu");
        sehirler.add(5,"manisa");
        sehirler.add(6,"konya");

        for (int i = 0; i <cities.size() ; i++) {

            System.out.println("reverse writing="+String.valueOf(cities.get(i)));


        }
    }
}
