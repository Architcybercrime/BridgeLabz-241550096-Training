import java.util.*;
public class Level2_Problem3{
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
  int k=0; idx[k++]=-1;
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
 public static String[][] wordLength(String[] w){
  String[][] r=new String[w.length][2];
  for(int i=0;i<w.length;i++){
   r[i][0]=w[i];
   r[i][1]=String.valueOf(findLength(w[i]));
  }
  return r;
 }
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  String s=sc.nextLine();
  String[] w=splitUser(s);
  String[][] t=wordLength(w);
  for(int i=0;i<t.length;i++){
   System.out.println(t[i][0]+" "+Integer.parseInt(t[i][1]));
  }
  sc.close();
 }
}