import java.util.*;
public class Problem6{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  double[] heights=new double[11];
  double sum=0.0;
  for(int i=0;i<11;i++){ heights[i]=sc.nextDouble(); sum+=heights[i]; }
  double mean=sum/11.0;
  System.out.println(mean);
  sc.close();
 }
}