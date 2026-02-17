import java.util.*;
public class Problem5_reverse{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int temp=n,count=0;
  while(temp!=0){ temp/=10; count++; }
  int[] digits=new int[count];
  temp=n;
  for(int i=0;i<count;i++){
   digits[i]=temp%10;
   temp/=10;
  }
  for(int i=0;i<count;i++) System.out.print(digits[i]+" ");
  System.out.println();
  sc.close();
 }
}