public class PermitationTest {
    public static void main(String[] args) {
         String str="ABCD";
        PermitationTest  p=new PermitationTest();
        p.CalculatePer(str,"");

    }

    private void CalculatePer(String  s,String a) {
        if(s.length()==0){
            System.out.println(a+" ");
        }
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            String r=s.substring(0,i)+s.substring(i+1);
            CalculatePer(r,a+ch);
        }

    }
}
