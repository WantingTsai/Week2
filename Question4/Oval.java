import java.io.*;
import java.util.Scanner;
public class Oval {
    public static void main(String[] args) {
        int id[] = new int[100];
        double major[] = new double[100];
        double minor[] = new double[100];
        int count = 0, op;
        while(true)
        {
            System.out.print("1)輸入橢圓  -1)End: ");
            Scanner s = new Scanner(System.in);
            op = s.nextInt();
            if(op == -1)
                break;
            if(op != 1)
                continue;
            System.out.print("編號:" + (count+1) + "->請輸入長邊：");
            major[count] = s.nextDouble();
            System.out.print("編號:" + (count+1) + "->請輸入短邊：");
            minor[count] = s.nextDouble();
            id[count] = count+1;
            count++;
        }
        while(true)
        {
            System.out.print("請輸入編號搜尋 -1)End: ");
            Scanner s = new Scanner(System.in);
            op = s.nextInt();
            if(op == -1)
                break;
            if(op > count||op <= 0)
            {
                System.out.println("找不到此編號之橢圓!!");
                continue;
            }
            Oval_O o = new Oval_O(minor[op-1], major[op-1]);
            System.out.println("編號："+id[op-1]);
            o.OutputMajor();
            o.Outputminor();
            System.out.println("面積："+o.Area());
        }
    }
}
class Circle_C{
    double r=0;
    Circle_C(double r){
            this.r=r;
    }
    double Arc(double an){
            return (2*r*3.14)*an/360;
    }
    double Area(double an){
            return (r*r*3.14)*an/360;
    }
}
class Oval_O extends Circle_C {
    protected double major;
    public Oval_O(double a, double b) {
        super(a);//短軸繼承r
        major = b;
    }
    double Area(){
	return 3.14*major*r;
    }
    double Perimeter()
    {
        return 2*3.14*r+4*(major-r);
    }
    void OutputMajor(){
	System.out.println("長軸:" + major);
    }
    void Outputminor(){
	System.out.println("短軸:" + r);
    }
}