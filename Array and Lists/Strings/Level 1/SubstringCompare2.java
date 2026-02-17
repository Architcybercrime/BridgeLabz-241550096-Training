import java.util.*;
public class SubstringCompare2{
 public static String sub(String s,int start,int end){
  String t="";
  for(int i=start;i<end;i++) t+=s.charAt(i);
  return t;
 }
 public static boolean compare(String a,String b){
  if(a.length()!=b.length()) return false;
  for(int i=0;i<a.length();i++){
   if(a.charAt(i)!=b.charAt(i)) return false;
  }
  return true;
 }
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  String s=sc.next();
  int start=sc.nextInt();
  int end=sc.nextInt();
  String u1=sub(s,start,end);
  String u2=s.substring(start,end);
  System.out.println(compare(u1,u2));
  sc.close();
 }
}