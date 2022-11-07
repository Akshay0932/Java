import java.util.*;
import java.lang.*;
import java.io.*;
public class sortarray{  
public static void main(String[] args){  
  
//{2, 3, 7, 6, 8, -1, -10, 15}
//Output: 1;
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int arr[]={2, 3, 7, 6, 8, -1, -10, 15};
Arrays.sort(arr);
for(int i=0;i<arr.length;i++){
System.out.print(arr[i]+" ");
}
if(num>0 && num<(arr[i]>0)){
  System.out.println("smallest +ve num");
}
}
}