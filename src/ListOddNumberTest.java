import java.util.ArrayList;
import java.util.List;

public class ListOddNumberTest {
    public static void main(String[] args) {
        boolean t=false;
        List<Integer> ls = new ArrayList<>();
        ls.add(49);
        ls.add(43);
        ls.add(48);
        ls.add(47);
        ls.add(49);
        ls.add(41);

        for(Integer i:ls){
            if(i%2==0)
                t=true;
        }
        if(t==true)
            System.out.println(" contain Even also");
        else
            System.out.println(" ODD");
    }

}
