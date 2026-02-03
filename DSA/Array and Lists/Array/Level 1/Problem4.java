import java.util.*;
public class Problem4{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  double[] arr=new double[10];
  double total=0.0;
  int index=0;
  while(true){
   if(index==10) break;
   double v=sc.nextDouble();
   if(v<=0) break;
   arr[index++]=v;
  }
  for(int i=0;i<index;i++) total+=arr[i];
  for(int i=0;i<index;i++) System.out.println(arr[i]);
  System.out.println("Total = "+total);
  sc.close();
 }
}