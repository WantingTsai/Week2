import java.io.*;
import java.util.Scanner;
public class Year {
    public static void main(String[] args) {
        int year, count=0, i=1;
        System.out.print("請輸入一個西元的年份:");
        Scanner s = new Scanner(System.in);
        year = s.nextInt();
        System.out.println("西元" + year + "年前的閏年");
        while(i != year+1)
        {
                if(i % 400 == 0||(i % 4 == 0&&i % 100 != 0))
                {
                        System.out.print(i + "\t");
                        count++;
                        if(count % 10 == 0)
                                System.out.println("");
                }
                i++;
        }
    }
}
