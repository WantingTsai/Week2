import java.io.*;
import java.util.Scanner;
public class Student {
    public static void main(String[] args) {
        int count=0, op, num;
        int id[] = new int[100], grade[] = new int[100];
        String name[] = new String[100];
        while(true)
        {
            System.out.print("輸入學生資料 1)Yes, -1)End");
            Scanner s = new Scanner(System.in);
            op = s.nextInt();
            if(op == 1)
            {
                try
                {
                    System.out.printf("第" + (count+1) + "位學生姓名:");
                    name[count] = s.next();
                    System.out.printf("第" + (count+1) + "位學生成績:");
                    grade[count] = s.nextInt();
                    id[count] = count+1;
                    count++;
                }
                catch(Exception e)
                {
                    System.out.println("Error:NumberFormatException("+ e +")");
                    if(count-1 >= 0)
                        count--;
                }
            }
            else if(op == -1)
                break;
        }
        while(true)
        {
            System.out.print("輸入編號搜尋 1)Yes, -1)End");
            Scanner s = new Scanner(System.in);
            op = s.nextInt();
            if(op == 1)
            {
                System.out.print("請輸入編號:");
                num = s.nextInt();
                if(num > count)
                    System.out.println("找不到此編號之學生資料!!");
                else
                {
                    System.out.println(num + ". 學生姓名:" + name[num-1] + ", 成績:" + grade[num-1]);
                }
            }
            else if(op == -1)
                break;
        }
    }
}