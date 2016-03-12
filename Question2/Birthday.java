import java.io.*;
import java.util.Scanner;
public class Birthday {
    public static void main(String[] args) {
        String name;
        int year, month, day;
        System.out.print("請輸入姓名:");
        Scanner s = new Scanner(System.in);
        name = s.nextLine();
        System.out.print("請輸入生日-西元年:");
        year = s.nextInt();
        System.out.print("請輸入生日-月:");
        month = s.nextInt();
        System.out.print("請輸入生日-日:");
        day = s.nextInt();
        System.out.println(name + "的生日:民國"+ (year-1911) + "年" + month + "月" + day +"日");
    }
}
