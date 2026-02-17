import java.util.*;
public class Problem1_bonus{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  double[] salary=new double[10];
  double[] years=new double[10];
  double[] bonus=new double[10];
  double[] newSalary=new double[10];
  double totalBonus=0,totalOld=0,totalNew=0;
  for(int i=0;i<10;i++){
   while(true){
    double s=sc.nextDouble();
    double y=sc.nextDouble();
    if(s<=0||y<0) continue;
    salary[i]=s;
    years[i]=y;
    break;
   }
  }
  for(int i=0;i<10;i++){
   double rate = years[i]>5 ? 0.05 : 0.02;
   bonus[i]=salary[i]*rate;
   newSalary[i]=salary[i]+bonus[i];
   totalBonus+=bonus[i];
   totalOld+=salary[i];
   totalNew+=newSalary[i];
  }
  System.out.println(totalBonus);
  System.out.println(totalOld);
  System.out.println(totalNew);
  sc.close();
 }
}