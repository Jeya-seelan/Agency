import java.util.*;
class Agency{
 public static void main(String args[]){
  Scanner in = new Scanner(System.in);
  int x,a,b;
  x = in.nextInt();
  a = in.nextInt();
  b = in.nextInt();
  System.out.printf("The profit obtained is Rs.%d",((x*a)-(x*b))-100);
 }
}