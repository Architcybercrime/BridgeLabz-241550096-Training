import java.util.*;
public class Problem10{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  if(n<=0){ System.out.println("Error: Input must be a positive integer"); sc.close(); return; }
  String[] arr=new String[n];
  for(int i=1;i<=n;i++){
   if(i%3==0 && i%5==0) arr[i-1]="FizzBuzz";
   else if(i%3==0) arr[i-1]="Fizz";
   else if(i%5==0) arr[i-1]="Buzz";
   else arr[i-1]=String.valueOf(i);
  }
  for(int i=1;i<=n;i++) System.out.println("Position "+i+" = "+arr[i-1]);
  sc.close();
 }
}