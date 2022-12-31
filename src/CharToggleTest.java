import java.util.Scanner;
public class CharToggleTest {
    public static void main(String[] args) {
        System.out.println("Enter String");
        Scanner sc = new Scanner(System.in);
        String ip = sc.next();
        StringBuffer res = new StringBuffer("");
        char ch;
        for (int i = 0; i < ip.length(); i++) {
            ch = ip.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {

                res.append((char) (ch + 32));
            } else if (ch >= 'a' && ch <= 'z') {
                res.append((char) (ch - 32));
            } else {
                res.append(ch);
            }
        }
        System.out.println("result= "+res.toString());
    }

}

