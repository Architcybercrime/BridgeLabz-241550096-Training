import java.util.*;
public class Problem8{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  if(n<=0){ System.out.println("Invalid input"); sc.close(); return; }
  int maxFactor=10;
  int[] factors=new int[maxFactor];
  int idx=0;
  for(int i=1;i<=n;i++){
   if(n % i == 0){
    if(idx==maxFactor){
     int newMax=maxFactor*2;
     int[] temp=new int[newMax];
     for(int j=0;j<maxFactor;j++) temp[j]=factors[j];
     factors=temp;
     maxFactor=newMax;
    }
    factors[idx++]=i;
   }
  }
  for(int i=0;i<idx;i++) System.out.println(factors[i]);
  sc.close();
 }
}