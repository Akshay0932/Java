import java.util.Scanner;
public class Sumofnnaturalnum {
public static void main(String[] args) {
Scanner scn = new Scanner(System.in);
int num = scn.nextInt();
int i=1;
int sum = 0;
while(i<=num){
    sum=sum+i;
    i++;
}
System.out.println(sum) ;
}
}
/*Enter 5
op=15
enter 6
op=21