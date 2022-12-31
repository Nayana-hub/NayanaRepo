package CustomEXceptiontest;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

class myException1 {
    //int flag=1;
    void fun(int flag) throws FileNotFoundException, IOException, SQLException {
        if (flag == 1)
            throw new FileNotFoundException("File not found");
        else if (flag == 0)
            throw new IOException("IO Exception");

        else throw new SQLException("SQL Exception");

    }
}

public class MultipleExceptionthrows {

    public static void main(String[] args) {
        //int  flag=0;
        Scanner sc = new Scanner(System.in);
        int flag = sc.nextInt();
        myException1 m = new myException1();
        try {
            m.fun(flag);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
