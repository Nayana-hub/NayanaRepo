package ArrayPractice2;

public class ArraySubset {
    public static void main(String[] args) {
        int[] a = new int[]{7,6,5};
        int temp=0;
        int limit = (int) Math.pow(2, a.length);

        for (int i = 0; i < limit; i++) {   //to find binary bit
            String set = "";
            temp=i;
            for (int j = a.length-1; j >=0; j--) {   // to print no //

                int rem = temp % 2;
                temp = temp/ 2;
                if (rem == 0) {
                    set = "" + set;
                } else {
                    set = a[j] + " " + set;
                }

            }

            System.out.println("{"+set+"}");
        }

    }
}
