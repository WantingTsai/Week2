import java.io.*;
public class Array {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int sum=0, count=0;
        double avg;
        System.out.println("陣列:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
            count++;
            sum += arr[i];
        }
        avg = sum/count;
        System.out.println("\n總和" + sum + "\n平均" + avg);
    } 
}
