import java.util.*;
public class Level2_Problem5{
 public static int check(char c){
  if(c>='A'&&c<='Z') c=(char)(c+32);
  if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') return 1;
  if(c>='a'&&c<='z') return 2;
  return 0;
 }
 public static int[] countVC(String s){
  int v=0,c=0;
  for(int i=0;i<s.length();i++){
   int r=check(s.charAt(i));
   if(r==1) v++;
   else if(r==2) c++;
  }
  return new int[]{v,c};
 }
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  String s=sc.nextLine();
  int[] r=countVC(s);
  System.out.println(r[0]+" "+r[1]);
  sc.close();
 }
}