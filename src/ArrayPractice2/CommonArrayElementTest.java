package ArrayPractice2;

public class CommonArrayElementTest {
    public static void main(String[] args) {
        int[] a = new int[]{1, 4, 5, 7,8 , 9, 3,6};
        int[] b = new int[]{7, 9, 5, 8, 2, 4, 3,1};
        int[] d = new int[]{1, 2, 6, 7, 2, 11,3,9};


        CommonArrayElementTest.ArrayOperation(a, b,d);
    }

    private static void ArrayOperation(int[] a, int[] b,int [] d) {
        int[] c = new int[10];
        int k=0,flag=0;
        for (int i = 0; i < a.length; i++) {
            flag=0;
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j] ) {
                flag=1;
                //c[k++]=a[i];
                }
                if(flag==1){
                    for(int l=0;l<d.length;l++){
                        if(a[i]==d[l]){
                            c[k++]=a[i];
                            flag=0;
                            break;

                        }

                    }
                }
            }
        }

        for(int i=0;i< k;i++)
        System.out.println(c[i]);
    }
}
