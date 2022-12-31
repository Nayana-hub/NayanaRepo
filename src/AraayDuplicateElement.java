public class AraayDuplicateElement {

    static  int[] d=new int[10];
  static  int k = 0;

    public static void main(String[] args) {


        int[] a = new int[]{1, 4, 5, 1, 2, 4, 5};
        int[] b = new int[]{7, 6, 5, 2, 2, 6, 5};
        int[] c = new int[]{8,  3, 7, 8, 3,7};

        AraayDuplicateElement e=new AraayDuplicateElement();
        e.addDuplicate(a);
        e.addDuplicate(b);
        e.addDuplicate(c);
        for(int i=0;i<k;i++)
        System.out.println(d[i]);

    }

    private void  addDuplicate(int[] a) {
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    d[k++]=a[i];
                }
            }
        }

    }

}


