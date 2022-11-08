import java.util.Scanner;
public class Sumof3digitnum {
public static void main(String[] args) {
Scanner scn = new Scanner(System.in);
int x = scn.nextInt();
int sum = 0;
while(x > 0){
sum += x % 10;
x/=10;
}
System.out.println(sum) ;
}
}
/*eneter=123
op=6
