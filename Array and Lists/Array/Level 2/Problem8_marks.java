import java.util.*;
public class Problem8_marks{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  double[] perc=new double[n];
  char[] grade=new char[n];
  double[][] marks=new double[n][3];
  for(int i=0;i<n;i++){
   for(int j=0;j<3;j++){
    double m;
    do{ m=sc.nextDouble(); }while(m<0);
    marks[i][j]=m;
   }
  }
  for(int i=0;i<n;i++){
   perc[i]=(marks[i][0]+marks[i][1]+marks[i][2])/3.0;
   if(perc[i]>=90) grade[i]='A';
   else if(perc[i]>=80) grade[i]='B';
   else if(perc[i]>=70) grade[i]='C';
   else if(perc[i]>=60) grade[i]='D';
   else grade[i]='F';
  }
  for(int i=0;i<n;i++){
   System.out.println(marks[i][0]+" "+marks[i][1]+" "+marks[i][2]+" "+perc[i]+" "+grade[i]);
  }
  sc.close();
 }
}