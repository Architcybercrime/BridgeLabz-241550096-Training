import java.util.*;
public class Level3_Problem6{
 public static String[] frequency(String s){
  char[] a=s.toCharArray();
  int n=a.length;
  int[] f=new int[n];
  for(int i=0;i<n;i++){
   if(a[i]=='0') continue;
   f[i]=1;
   for(int j=i+1;j<n;j++){
    if(a[i]==a[j]){ f[i]++; a[j]='0'; }
   }
  }
  String[] r=new String[n];
  int k=0;
  for(int i=0;i<n;i++){
   if(a[i]!='0') r[k++]=a[i]+" "+f[i];
  }
  String[] out=new String[k];
  for(int i=0;i<k;i++) out[i]=r[i];
  return out;
 }
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  String s=sc.nextLine();
  String[] r=frequency(s);
  for(String x:r) System.out.println(x);
  sc.close();
 }
}