import java.util.*;
public class Problem5{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int number=sc.nextInt();
  int[] multiplicationResult=new int[4];
  int idx=0;
  for(int i=6;i<=9;i++) multiplicationResult[idx++]=number*i;
  int j=6;
  for(int i=0;i<multiplicationResult.length;i++){
   System.out.println(number+" * "+j+" = "+multiplicationResult[i]);
   j++;
  }
  sc.close();
 }
}