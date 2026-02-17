import java.util.*;
public class Problem3_digits{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int maxDigit=10;
  int[] digits=new int[maxDigit];
  int idx=0;
  while(n!=0){
   if(idx==maxDigit) break;
   digits[idx++]=n%10;
   n/=10;
  }
  int max=0, second=0;
  for(int i=0;i<idx;i++){
   if(digits[i]>max){
    second=max;
    max=digits[i];
   } else if(digits[i]>second){
    second=digits[i];
   }
  }
  System.out.println(max);
  System.out.println(second);
  sc.close();
 }
}