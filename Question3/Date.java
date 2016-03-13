import java.io.*;
import java.util.Scanner;
public class Date {
    public static void main(String[] args) {
        int year, mon, day, op;
        while(true)
        {
            System.out.print("1)請輸入日期判斷是否為正確日期 -1)End: ");
            Scanner s = new Scanner(System.in);
            op = s.nextInt();
            if(op == -1)
                break;
            if(op != 1)
                continue;
            System.out.print("西元年: ");
            year = s.nextInt();
            System.out.print("月: ");
            mon = s.nextInt();
            System.out.print("日: ");
            day = s.nextInt();
            Date_d d = new Date_d();
            if(d.checkDate(year, mon, day) == true)
                System.out.println(year + "/" + mon + "/" + day +"是正確的!!");
            else
                System.out.println("日期輸入錯誤!!");
        }
    }
}
class Date_d{
    boolean checkDate(int y, int m, int d)
    {
        if(y <= 0||d <= 0||m > 12||m <= 0)
            return false;
        if(m == 1||m == 3||m == 5||m == 7||m == 8||m == 10||m ==12)
        {
            if(d > 31)
                return false;
        }
        if(m == 4||m == 6||m == 9||m == 11)
        {
            if(d > 30)
                return false;
        }
        if(y % 400 == 0||(y % 4 == 0&&y % 100 !=0))
        {
            if(m == 2)
            {
                if(d <= 29)
                    return true;
            }
        }
        if(m == 2)
        {
            if(d > 28)
                return false;
        }
        return true;
    }
}