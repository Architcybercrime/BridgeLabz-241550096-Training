import java.util.*;
public class Level3_Problem9{
 static String[] months={"","January","February","March","April","May","June","July","August","September","October","November","December"};
 static int[] days={0,31,28,31,30,31,30,31,31,30,31,30,31};
 public static boolean leap(int y){
  return (y%4==0 && y%100!=0) || (y%400==0);
 }
 public static int firstDay(int m,int y){
  int y0=y-(14-m)/12;
  int x=y0+y0/4-y0/100+y0/400;
  int m0=m+12*((14-m)/12)-2;
  int d0=(1+x+31*m0/12)%7;
  return d0;
 }
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int m=sc.nextInt();
  int y=sc.nextInt();
  int d=days[m];
  if(m==2 && leap(y)) d=29;
  int fd=firstDay(m,y);
  for(int i=0;i<fd;i++) System.out.print("   ");
  for(int i=1;i<=d;i++){
   System.out.printf("%3d",i);
   if((i+fd)%7==0) System.out.println();
  }
  System.out.println();
  sc.close();
 }
}