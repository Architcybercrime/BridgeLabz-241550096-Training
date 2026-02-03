import java.util.*;
public class Level3_Problem1{
 public static String[][] computeBMI(double[][] hw){
  String[][] r=new String[10][4];
  for(int i=0;i<10;i++){
   double w=hw[i][0];
   double h=hw[i][1]/100.0;
   double bmi=w/(h*h);
   String status;
   if(bmi<18.5) status="Underweight";
   else if(bmi<25) status="Normal";
   else if(bmi<30) status="Overweight";
   else status="Obese";
   r[i][0]=String.valueOf(hw[i][1]);
   r[i][1]=String.valueOf(hw[i][0]);
   r[i][2]=String.valueOf(bmi);
   r[i][3]=status;
  }
  return r;
 }
 public static void display(String[][] a){
  for(int i=0;i<10;i++){
   System.out.println(a[i][0]+" "+a[i][1]+" "+a[i][2]+" "+a[i][3]);
  }
 }
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  double[][] hw=new double[10][2];
  for(int i=0;i<10;i++){
   hw[i][0]=sc.nextDouble();
   hw[i][1]=sc.nextDouble();
  }
  display(computeBMI(hw));
  sc.close();
 }
}