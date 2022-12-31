import java.util.LinkedList;
import java.util.List;

public class ReverseLinklistRecur {
    public static void main(String[] args) {
        List<Integer> lk=new LinkedList<>();
        lk.add(10);
        lk.add(20);
        lk.add(30);
        lk.add(40);
        lk.add(50);
        lk.add(60);
        lk.add(100);
        System.out.println(lk.size());
      lk=  ReverseLinklistRecur.ReverseList(lk);
        System.out.println("Reverse list"+lk);
    }

    private static List<Integer>  ReverseList(List<Integer> lk) {
        Integer temp;
        for(int i=0;i<lk.size()/2;i++){
            temp=lk.get(i);
            lk.set(i,lk.get(lk.size()-i-1));
            lk.set(lk.size()-i-1,temp);

        }
        return lk;
    }
}
