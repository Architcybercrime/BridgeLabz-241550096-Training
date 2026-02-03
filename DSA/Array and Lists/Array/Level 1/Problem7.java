import java.util.*;
public class Problem7{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int number=sc.nextInt();
  if(number<1){ System.out.println("Error: Input is not a natural number"); sc.close(); return; }
  int size=number/2+1;
  int[] evens=new int[size];
  int[] odds=new int[size];
  int ei=0, oi=0;
  for(int i=1;i<=number;i++){
   if(i%2==0) evens[ei++]=i;
   else odds[oi++]=i;
  }
  for(int i=0;i<ei;i++) System.out.println(evens[i]);
  for(int i=0;i<oi;i++) System.out.println(odds[i]);
  sc.close();
 }
}