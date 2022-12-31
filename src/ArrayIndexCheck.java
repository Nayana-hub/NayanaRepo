public class ArrayIndexCheck {
    public static void main(String[] args) {
        int[] arr1 = new int[]{10, 20, 40, 50, 43, 67, 55};
        int[] arr2 = new int[]{10, 20, 40, 50, 43, 67, 55};
        int cnt = 0;
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {

                if (arr1[i] == arr2[i]) {
                    cnt++;
                    continue;
                }
            }
        } else
            System.out.println("array are of diffrent size");
        if (cnt == arr1.length) {
            System.out.println("both array are equal");
        } else {
            System.out.println("not equal");
        }
    }
}
