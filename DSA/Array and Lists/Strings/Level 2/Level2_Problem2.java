import java.util.*;
public class Level2_Problem2{
 public static int findLength(String s){
  int c=0;
  try{ while(true){ s.charAt(c); c++; } }catch(Exception e){}
  return c;
 }
 public static String[] splitUser(String s){
  int n=findLength(s);
  int spaceCount=0;
  for(int i=0;i<n;i++) if(s.charAt(i)==' ') spaceCount++;
  int[] idx=new int[spaceCount+1];
  int k=0;
  idx[k++]=-1;
  for(int i=0;i<n;i++) if(s.charAt(i)==' ') idx[k++]=i;
  idx[k]=n;
  String[] words=new String[spaceCount+1];
  for(int i=0;i<spaceCount+1;i++){
   String w="";
   for(int j=idx[i]+1;j<idx[i+1];j++) w+=s.charAt(j);
   words[i]=w;
  }
  return words;
 }
 public static boolean compare(String[] a,String[] b){
  if(a.length!=b.length) return false;
  for(int i=0;i<a.length;i++) if(!a[i].equals(b[i])) return false;
  return true;
 }
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  String s=sc.nextLine();
  String[] a1=splitUser(s);
  String[] a2=s.split(" ");
  System.out.println(compare(a1,a2));
  sc.close();
 }
}