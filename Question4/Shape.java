import java.io.*;
import java.util.Scanner;
public class Shape {
    public static void main(String[] args) {
        int op, count=0;
        Shapes shapelist[] = new Shapes[100];
        double t1, t2;
        while(true)
        {
            System.out.print("選項 1)圓形 2)三角形 3)橢圓形 4)矩形 -1)結束: ");
            Scanner s = new Scanner(System.in);
            op=s.nextInt();
            if(op == -1)
                break;
            if(op == 1)
            {
                System.out.print("輸入圓形半徑: ");
                t1 = s.nextDouble();
                if(t1 <= 0)
                    System.out.println("半徑輸入錯誤!!");
                else
                {
                    shapelist[count] = new Cir(t1);
                    count++;
                }
            }
            else if(op == 2)
            {
                System.out.print("輸入三角形底: ");
                t1=s.nextDouble();
                System.out.print("輸入三角形高: ");
                t2=s.nextDouble();
                if(t1 <= 0||t2 <= 0)
                    System.out.println("輸入錯誤!!");
                else
                {
                    shapelist[count] = new Triangle(t1, t2);
                    count++;
                }
            }
            else if(op == 3)
            {
                System.out.print("輸入橢圓形長軸: ");
                t1=s.nextDouble();
                System.out.print("輸入橢圓形短軸: ");
                t2=s.nextDouble();
                if(t1 <= 0||t2 <= 0)
                    System.out.println("輸入錯誤!!");
                else
                {
                    shapelist[count] = new Oval(t1, t2);
                    count++;
                }
            }
            else if(op == 4)
            {
                System.out.print("輸入矩形長: ");
                t1=s.nextDouble();
                System.out.print("輸入矩形寬: ");
                t2=s.nextDouble();
                if(t1 <= 0||t2 <= 0)
                    System.out.println("輸入錯誤!!");
                else
                {
                    shapelist[count] = new Rect(t1, t2);
                    count++;
                }
            }
        }
        for(int i=0;i < count;i++)
        {
            System.out.print("編號" + (i+1) + "->");
            shapelist[i].show();
        }
    }
}
abstract class Shapes {
    abstract double area();
    abstract void show();
}
class Cir extends Shapes
{
    double r;
    Cir(double r)
    {
        this.r=r;
    }
    double area()
    {
        return r*r*3.14;
    }
    void show()
    {
        System.out.println("圓形面積:" + area());
    }
}
class Triangle extends Shapes
{
    double length,height;
    Triangle(double length,double height)
    {
        this.length=length;
        this.height=height;
    }
    double area()
    {
        return (length*height/2);
    }
    void show()
    {
        System.out.println("三角形面積:" + area());
    }
}
class Oval extends Shapes
{
    double major,minor;
    Oval(double major,double minor)
    {
        this.major=major;
        this.minor=minor;
    }
    double area()
    {
        return major*minor*3.14;
    }
    void show()
    {
        System.out.println("橢圓形面積:" + area());
    }
}
class Rect extends Shapes
{
    double x,y;
    Rect(double x,double y)
    {
        this.x=x;
        this.y=y;
    }
    double area()
    {
        return x*y;
    }
    void show()
    {
        System.out.println("矩形面積:" + area());
    }
}