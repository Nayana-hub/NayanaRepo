public class SecondLargestNo {
    public static void main(String[] args) {
        int[] arr = new int[]{40, 44, 11, 22, 33, 77, 454, 844};
        int highest = Integer.MIN_VALUE;
        int secondhigh = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > highest) {
                secondhigh = highest;
                highest = i;
         }
            //else if (i > secondhigh) {
//                secondhigh = i;
//            }
        }

        System.out.println("Second Highest="+secondhigh);
    }
}
