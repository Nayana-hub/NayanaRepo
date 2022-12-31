import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ResverseLinkList {
    public static void main(String[] args) {
        List<Integer> linklist=new LinkedList<Integer>();
        linklist.add(10);
        linklist.add(20);
        linklist.add(30);
        linklist.add(40);
        linklist.add(50);
        System.out.println(linklist);
        Collections.reverse(linklist);
        System.out.println(linklist);





    }
}
