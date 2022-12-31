
        import java.util.*;
class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(61);
        list.add(9);
        list.add(5);
        boolean result = true;
        for (int i : list) {
            if (i % 2 == 0) {
                result = false;
            }

        }if (result) {
            System.out.println("List contains only odd elements");
        }
        else
        System.out.println("list doesn't contains only odd elements");
    }
}


