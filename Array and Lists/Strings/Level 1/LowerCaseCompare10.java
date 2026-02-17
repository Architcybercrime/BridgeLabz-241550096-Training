import java.util.*;
public class LowerCaseCompare10{
 public static String toLowerUser(String s){
  String t="";
  for(int i=0;i<s.length();i++){
   char c=s.charAt(i);
   if(c>='A'&&c<='Z') c=(char)(c+32);
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
  String l1=toLowerUser(s);
  String l2=s.toLowerCase();
  System.out.println(compare(l1,l2));
  sc.close();
 }
}