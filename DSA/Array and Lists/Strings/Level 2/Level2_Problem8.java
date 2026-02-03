import java.util.*;
public class Level2_Problem8{
 public static int[] randomAges(int n){
  int[] a=new int[n];
  for(int i=0;i<n;i++) a[i]=(int)(Math.random()*90+10);
  return a;
 }
 public static String[][] canVote(int[] a){
  String[][] r=new String[a.length][2];
  for(int i=0;i<a.length;i++){
   r[i][0]=String.valueOf(a[i]);
   if(a[i]<0) r[i][1]="false";
   else if(a[i]>=18) r[i][1]="true";
   else r[i][1]="false";
  }
  return r;
 }
 public static void display(String[][] r){
  for(int i=0;i<r.length;i++){
   System.out.println(r[i][0]+" "+r[i][1]);
  }
 }
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  display(canVote(randomAges(n)));
  sc.close();
 }
}