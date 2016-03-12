import java.io.*;
import java.util.Scanner;
public class Math {
    public static void main(String[] args) {
        float num1, num2, ans;
        int op;
        System.out.println("請輸入兩個浮點數:");
        System.out.print("Number1:");
        Scanner s = new Scanner(System.in);
        num1 = s.nextFloat();
        System.out.print("Number2:");
        num2 = s.nextFloat();
        System.out.print("請選擇運算子: 1)+, 2)-, 3)*, 4)/ ");
        op = s.nextInt();
        switch(op)
        {
            case(1):
                ans = num1 + num2;
                System.out.println(num1 + "+" + num2 + "=" + ans);
                break;
            case(2):
                ans = num1 - num2;
                System.out.println(num1 + "-" + num2 + "=" + ans);
                break;
            case(3):
                ans = num1 * num2;
                System.out.println(num1 + "*" + num2 + "=" + ans);
                break;
            case(4):
                if(num2 == 0)
                    System.out.println("Error!!分母為零!!");
                else
                {
                    ans = num1 / num2;
                    System.out.println(num1 + "/" + num2 + "=" + ans);
                }
                break;
            default:
                break;
        }
    }
    
}
