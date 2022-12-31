import static java.lang.Character.*;

public class RemoveSpaceFromString {
    public static void main(String[] args) {
        String str = "Learn java Do coding";
        StringBuffer res = new StringBuffer();
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (!isWhitespace(str.charAt(i))) {
                res.append(ch);

            }
        }
        System.out.println(res);
    }
}
