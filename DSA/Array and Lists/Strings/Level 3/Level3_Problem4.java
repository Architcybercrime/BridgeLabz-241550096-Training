import java.util.*;
public class Level3_Problem4{
 public static String[][] frequency(String s){
  int[] f=new int[256];
  for(int i=0;i<s.length();i++) f[s.charAt(i)]++;
  String[][] r=new String[s.length()][2];
  int k=0;
  for(int i=0;i<s.length();i++){
   char c=s.charAt(i);
   if(f[c]>0){
    r[k][0]=String.valueOf(c);
    r[k][1]=String.valueOf(f[c]);
    f[c]=0;
    k++;
   }
  }
  String[][] out=new String[k][2];
  for(int i=0;i<k;i++) out[i]=r[i];
  return out;
 }
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  String s=sc.nextLine();
  String[][] r=frequency(s);
  for(int i=0;i<r.length;i++) System.out.println(r[i][0]+" "+r[i][1]);
  sc.close();
 }
}