import java.util.*;
public class Level3_Problem5{
 public static char[] unique(String s){
  char[] t=new char[s.length()];
  int k=0;
  for(int i=0;i<s.length();i++){
   boolean u=true;
   for(int j=0;j<i;j++) if(s.charAt(i)==s.charAt(j)){u=false;break;}
   if(u) t[k++]=s.charAt(i);
  }
  char[] r=new char[k];
  for(int i=0;i<k;i++) r[i]=t[i];
  return r;
 }
 public static String[][] frequency(String s){
  int[] f=new int[256];
  for(int i=0;i<s.length();i++) f[s.charAt(i)]++;
  char[] u=unique(s);
  String[][] r=new String[u.length][2];
  for(int i=0;i<u.length;i++){
   r[i][0]=String.valueOf(u[i]);
   r[i][1]=String.valueOf(f[u[i]]);
  }
  return r;
 }
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  String s=sc.nextLine();
  String[][] r=frequency(s);
  for(int i=0;i<r.length;i++) System.out.println(r[i][0]+" "+r[i][1]);
  sc.close();
 }
}