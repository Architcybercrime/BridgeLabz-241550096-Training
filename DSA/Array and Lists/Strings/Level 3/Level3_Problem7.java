import java.util.*;
public class Level3_Problem7{
 public static boolean logic1(String s){
  int i=0,j=s.length()-1;
  while(i<j) if(s.charAt(i++)!=s.charAt(j--)) return false;
  return true;
 }
 public static boolean logic2(String s,int i,int j){
  if(i>=j) return true;
  if(s.charAt(i)!=s.charAt(j)) return false;
  return logic2(s,i+1,j-1);
 }
 public static char[] reverse(String s){
  char[] r=new char[s.length()];
  for(int i=0;i<s.length();i++) r[i]=s.charAt(s.length()-1-i);
  return r;
 }
 public static boolean logic3(String s){
  char[] a=s.toCharArray();
  char[] r=reverse(s);
  for(int i=0;i<a.length;i++) if(a[i]!=r[i]) return false;
  return true;
 }
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  String s=sc.nextLine();
  System.out.println(logic1(s)+" "+logic2(s,0,s.length()-1)+" "+logic3(s));
  sc.close();
 }
}