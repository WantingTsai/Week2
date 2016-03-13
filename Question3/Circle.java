import java.io.*;
import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        int id[] = new int[100];
        double r[] = new double[100];
        double temp;
        int count = 0, num, an;
        while(true)
        {
            System.out.print("編號:" + (count+1) + "->請輸入半徑 -1)End: ");
            Scanner s = new Scanner(System.in);
            temp = s.nextDouble();
            if(temp == -1)
                break;
            if(temp < 0)
            {
                System.out.println("輸入錯誤!!");
                continue;
            }
            r[count] = temp;
            id[count] = count+1;
            count++;
        }
        while(true)
        {
            System.out.print("請輸入編號搜尋: -1)End: ");
            Scanner s = new Scanner(System.in);
            num = s.nextInt();
            if(num == -1)
                break;
            if(num > count||num <= 0)
            {
                System.out.println("找不到此編號之半徑!!");
                continue;
            }
            System.out.print("輸入角度：");
            an = s.nextInt();
            Circle_r c = new Circle_r(r[num-1]);
            System.out.println("編號："+id[num-1]);
            System.out.println("半徑："+r[num-1]);
            System.out.println("弧長："+c.Arc(an));
            System.out.println("面積："+c.Area(an));
        }
    }
}
class Circle_r{
	double r=0;
	Circle_r(double r){
		this.r=r;
	}
	double Arc(double an){
		return (2*r*3.14)*an/360;
	}
	double Area(double an){
		return (r*r*3.14)*an/360;
	}
}