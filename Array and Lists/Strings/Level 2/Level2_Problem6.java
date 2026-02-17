import java.util.*;
public class Level2_Problem6{
 public static String check(char c){
  if(c>='A'&&c<='Z') c=(char)(c+32);
  if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') return "Vowel";
  if(c>='a'&&c<='z') return "Consonant";
  return "Not a Letter";
 }
 public static String[][] classify(String s){
  String[][] r=new String[s.length()][2];
  for(int i=0;i<s.length();i++){
   r[i][0]=String.valueOf(s.charAt(i));
   r[i][1]=check(s.charAt(i));
  }
  return r;
 }
 public static void display(String[][] a){
  for(int i=0;i<a.length;i++){
   System.out.println(a[i][0]+" "+a[i][1]);
  }
 }
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  String s=sc.nextLine();
  display(classify(s));
  sc.close();
 }
}