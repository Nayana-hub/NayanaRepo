public class PalindromString {
    public static void main(String[] args) {
        String str="nitin";
        String res="";
        char ch;
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            res=ch+res;
        }

        if(str.equals(res))
        {
            System.out.println("palindrom");
        }
        else{
            System.out.println("not palindrom");
        }
    }
}
