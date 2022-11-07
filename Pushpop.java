import java.util.*;
import java.io.*;
public class Pushpop
{
   public static void main(String[] args) 
   {
       Stack<Integer> s=new Stack<Integer>();

       s.push(1);
       s.push(2);
       s.push(3);
       s.push(4);
       s.push(5);
     int size=s.size();
     System.out.println(s.size());
       System.out.println(s);
       System.out.println(s.pop());
       System.out.println(s.pop());
       System.out.println(s);
       System.out.println(s.peek());// gives top element
       System.out.println(s.size());
       System.out.println(s.empty());// to check if stack is empty or not
}
}