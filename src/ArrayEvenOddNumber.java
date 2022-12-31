public class ArrayEvenOddNumber {
    public static void main(String[] args) {
        int[] array=new int[]{10,21,34,23,12,43};
        System.out.println("Even numbers from array");;
        for(int i=0;i<6;i++){
            if(array[i]%2==0){
                System.out.print(array[i]+"\t");
            }
        }
        System.out.println();
        System.out.println("Odd numbers from array");;
        for(int i=0;i<6;i++){
            if(array[i]%2!=0){
                System.out.print(array[i]+"\t");
            }
        }

    }
}
