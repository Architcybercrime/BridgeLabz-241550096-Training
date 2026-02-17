import java.util.*;
public class Problem2{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int[] arr=new int[5];
  for(int i=0;i<5;i++) arr[i]=sc.nextInt();
  for(int i=0;i<5;i++){
   int n=arr[i];
   if(n>0){
    if(n%2==0) System.out.println(n+" is positive even");
    else System.out.println(n+" is positive odd");
   } else if(n<0) System.out.println(n+" is negative");
   else System.out.println("0");
  }
  int first=arr[0];
  int last=arr[4];
  if(first==last) System.out.println("First element is equal to last element");
  else if(first>last) System.out.println("First element is greater than last element");
  else System.out.println("First element is less than last element");
  sc.close();
 }
}