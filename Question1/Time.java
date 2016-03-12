import java.io.*;
public class Time {
    public static void main(String[] args) {
        int hour[] = {4, 13};
        int min[] = {23, 54};
        int sec[] ={45, 23};
        int time1, time2, ans;
        time1 = hour[0]*60*60 + min[0]*60 + sec[0];
        time2 = hour[1]*60*60 + min[1]*60 + sec[1];
        ans = time2 - time1;
        System.out.println(hour[0]+":"+min[0]+":"+sec[0]+"和"+hour[1]+":"+min[1]+":"+sec[1]+"相差"+ans+"秒");
    } 
}
