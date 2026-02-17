import java.util.*;
public class Level3_Problem2{
 public static int findLength(String s){
  int c=0;
  try{ while(true){ s.charAt(c); c++; } }catch(Exception e){}
  return c;
 }
 public static char[] uniqueChars(String s){
  int n=findLength(s);
  char[] temp=new char[n];
  int k=0;
  for(int i=0;i<n;i++){
   char c=s.charAt(i);
   boolean unique=true;
   for(int j=0;j<i;j++){
    if(s.charAt(j)==c){ unique=false; break; }
   }
   if(unique) temp[k++]=c;
  }
  char[] res=new char[k];
  for(int i=0;i<k;i++) res[i]=temp[i];
  return res;
 }
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  String s=sc.nextLine();
  char[] u=uniqueChars(s);
  for(char c:u) System.out.print(c+" ");
  System.out.println();
  sc.close();
 }
}