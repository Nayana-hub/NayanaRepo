

public class DigitCount {
    public static void main(String[] args) {
        int no = 8877666, rem = 0, flag = 0;
        int find = 8;
        int[] count = new int[256];
        for (int i = 0; i < 10; i++) {
            do {

                rem = no % 10;
                count[rem]++;
                no = no / 10;
                flag = 1;
            } while (rem != 0);

        }
        if (flag == 1) {

            System.out.println("No of occurance of " + find + "=" + count[find]);

        }


    }
}
