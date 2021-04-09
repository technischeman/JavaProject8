public class homework8 {
    public static void main(String[] args) {
        int[] int_array = {45,6,1,543,13,98};
    /*
    int_array de 10 sayisindan buyuk olanlarin
    toplamini for ve if kullarak bulunuz.

     */
        int sum=0;
        for (int i = 0; i <int_array.length ; i++) {
            if (int_array[i]>10){

                    sum=sum+int_array[i];

        }


                }
        System.out.println(sum);
            }}








