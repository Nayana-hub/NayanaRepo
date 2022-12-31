public class arrayduplicateTest {
    public static void main(String[] args) {
        int k = 0,temp=0;
        int[] a = new int[]{1, 4, 5,7, 2, 4, 5};
        int[] b = new int[]{7, 6, 5, 2,2, 4, 5};
        int[] c = new int[]{8, 4, 3, 7,2, 3,5};
        int[] d = new int[10];


for(int j=0;j<a.length;j++) {
    for (int i = j+1; i < a.length; i++) {
        if (a[i] == a[j]) {
            d[k++] = a[i];

        }
        if (b[i] == b[j]) {
            d[k++] = b[i];

        }
        if (c[i] == c[j]) {
            d[k++] = c[i];

        }

    }
}
        System.out.println("Duplicate elenets are");
        for(int i=0;i<k;i++){
            System.out.println(d[i]);
        }

        }
    }

