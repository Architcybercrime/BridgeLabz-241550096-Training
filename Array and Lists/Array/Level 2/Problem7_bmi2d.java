import java.util.*;
public class Problem7_bmi2d{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  double[][] personData=new double[n][3];
  String[] weightStatus=new String[n];
  for(int i=0;i<n;i++){
   double w,h;
   do{ w=sc.nextDouble(); }while(w<0);
   do{ h=sc.nextDouble(); }while(h<0);
   personData[i][0]=w;
   personData[i][1]=h;
   personData[i][2]=w/(h*h);
   double bmi=personData[i][2];
   if(bmi<18.5) weightStatus[i]="Underweight";
   else if(bmi<25) weightStatus[i]="Normal";
   else if(bmi<30) weightStatus[i]="Overweight";
   else weightStatus[i]="Obese";
  }
  for(int i=0;i<n;i++){
   System.out.println(personData[i][1]+" "+personData[i][0]+" "+personData[i][2]+" "+weightStatus[i]);
  }
  sc.close();
 }
}