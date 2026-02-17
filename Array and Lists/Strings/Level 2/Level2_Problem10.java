import java.util.*;
public class Level2_Problem10{
 public static int[][] randomPCM(int n){
  int[][] m=new int[n][3];
  for(int i=0;i<n;i++) for(int j=0;j<3;j++) m[i][j]=(int)(Math.random()*90+10);
  return m;
 }
 public static double[][] calc(int[][] m){
  int n=m.length;
  double[][] r=new double[n][3];
  for(int i=0;i<n;i++){
   double total=m[i][0]+m[i][1]+m[i][2];
   double avg=total/3.0;
   double perc=Math.round(avg*100.0)/100.0;
   r[i][0]=total; r[i][1]=avg; r[i][2]=perc;
  }
  return r;
 }
 public static String[] grade(double[][] p){
  String[] g=new String[p.length];
  for(int i=0;i<p.length;i++){
   double per=p[i][2];
   if(per>=90) g[i]="A";
   else if(per>=80) g[i]="B";
   else if(per>=70) g[i]="C";
   else if(per>=60) g[i]="D";
   else g[i]="F";
  }
  return g;
 }
 public static void display(int[][] m,double[][] c,String[] g){
  for(int i=0;i<m.length;i++){
   System.out.println(m[i][0]+" "+m[i][1]+" "+m[i][2]+" "+c[i][0]+" "+c[i][1]+" "+c[i][2]+" "+g[i]);
  }
 }
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int[][] m=randomPCM(n);
  double[][] c=calc(m);
  String[] g=grade(c);
  display(m,c,g);
  sc.close();
 }
}