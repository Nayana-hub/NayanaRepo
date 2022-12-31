public class Uniquearray {
    public static void main(String[] args) {
        int[] a=new int[]{1,2,2,3,3,3,4,5};
        int[] b=new int[7];
        int j=0;
       for(int i=0;i<7;i++){
           if(a[i]!=a[i+1])
               b[j++] = a[i];
       }
       b[j]=a[6];
       for(int i=0;i<j;i++)
        System.out.print(b[i]);
    }
}
