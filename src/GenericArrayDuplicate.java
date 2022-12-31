public class GenericArrayDuplicate {

    public static void main(String[] args) {
        int k = 0, ctr = 3;
        int[] a = new int[]{1,1, 4, 4, 7, 7, 8, 8, 9};
        int[] b = new int[]{7, 6, 5, 2, 2, 4, 5};
        int[] c = new int[]{8, 4, 3, 7, 2, 3, 5};
        int[] d = new int[10];


            for (int i = 0; i < a.length-1; i++) {
                if (a[i] == a[i + 1]) {
                    d[k++] = a[i];
                }

            }
        for(int j=0;j<d.length-1;j++)
            System.out.println(d[j]);
        }

    }

