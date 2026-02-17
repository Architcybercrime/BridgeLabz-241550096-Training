import java.util.*;
public class Level3_Problem10{
 static String[] suits={"Hearts","Diamonds","Clubs","Spades"};
 static String[] ranks={"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
 public static String[] init(){
  int n=suits.length*ranks.length;
  String[] d=new String[n];
  int k=0;
  for(String r:ranks) for(String s:suits) d[k++]=r+" of "+s;
  return d;
 }
 public static void shuffle(String[] d){
  int n=d.length;
  for(int i=0;i<n;i++){
   int r=i+(int)(Math.random()*(n-i));
   String t=d[i]; d[i]=d[r]; d[r]=t;
  }
 }
 public static String[][] deal(String[] d,int x){
  int n=d.length;
  int per=n/x;
  String[][] p=new String[x][per];
  int k=0;
  for(int i=0;i<x;i++){
   for(int j=0;j<per;j++) p[i][j]=d[k++];
  }
  return p;
 }
 public static void display(String[][] p){
  for(int i=0;i<p.length;i++){
   System.out.print("Player "+(i+1)+": ");
   for(int j=0;j<p[i].length;j++) System.out.print(p[i][j]+", ");
   System.out.println();
  }
 }
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int x=sc.nextInt();
  String[] d=init();
  shuffle(d);
  String[][] p=deal(d,x);
  display(p);
  sc.close();
 }
}