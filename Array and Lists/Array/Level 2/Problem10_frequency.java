import java.util.*;
public class Problem10_frequency{
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
  int[] freq=new int[10];
  for(int i=0;i<count;i++) freq[digits[i]]++;
  for(int i=0;i<10;i++) System.out.println(i+" "+freq[i]);
  sc.close();
 }
}