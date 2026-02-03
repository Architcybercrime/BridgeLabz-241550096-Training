import java.util.*;
public class Level2_Problem7{
 public static int[] trimPoints(String s){
  int start=0,end=s.length()-1;
  while(start<=end && s.charAt(start)==' ') start++;
  while(end>=start && s.charAt(end)==' ') end--;
  return new int[]{start,end};
 }
 public static String sub(String s,int start,int end){
  String t="";
  for(int i=start;i<=end;i++) t+=s.charAt(i);
  return t;
 }
 public static boolean compare(String a,String b){
  if(a.length()!=b.length()) return false;
  for(int i=0;i<a.length();i++) if(a.charAt(i)!=b.charAt(i)) return false;
  return true;
 }
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  String s=sc.nextLine();
  int[] p=trimPoints(s);
  String u=sub(s,p[0],p[1]);
  String b=s.trim();
  System.out.println(compare(u,b));
  sc.close();
 }
}