import java.util.*;
public class UpperCaseCompare9{
 public static String toUpperUser(String s){
  String t="";
  for(int i=0;i<s.length();i++){
   char c=s.charAt(i);
   if(c>='a'&&c<='z') c=(char)(c-32);
   t+=c;
  }
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
  String s=sc.nextLine();
  String u1=toUpperUser(s);
  String u2=s.toUpperCase();
  System.out.println(compare(u1,u2));
  sc.close();
 }
}