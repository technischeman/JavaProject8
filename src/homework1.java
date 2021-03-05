public class homework1 {
    public static void main(String[] args) {
        int[]array={1535564,464465,651561};
        int toplam=0;
        for (int i = 0; i <= array.length ; i++) {
            toplam+=array[i];


        } System.out.println("toplam"+toplam);
        int ort=toplam/ array.length;
        System.out.println("ort"+ort);

    }
}
