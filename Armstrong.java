public class Armstrong{
public static void main(String[] args)
  {
    int num=167;
int N;
    N=num;
    int digit=0;
    int sum=0;
    while(N>0)
    {
      digit=N%10;
      sum=sum+(digit*digit*digit);
      N=N/10;
    }
    if(num==sum){
     System.out.print("it is armstrong");
    }
    else
    {
     System.out.print("not an armstrong");
    }
  }
}


    