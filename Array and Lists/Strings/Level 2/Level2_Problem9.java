import java.util.*;
public class Level2_Problem9{
 public static String computer(){
  int r=(int)(Math.random()*3);
  if(r==0) return "rock";
  if(r==1) return "paper";
  return "scissors";
 }
 public static int winner(String u,String c){
  if(u.equals(c)) return 0;
  if(u.equals("rock")&&c.equals("scissors")) return 1;
  if(u.equals("paper")&&c.equals("rock")) return 1;
  if(u.equals("scissors")&&c.equals("paper")) return 1;
  return -1;
 }
 public static String[][] stats(int games,int pw,int cw){
  String[][] r=new String[2][3];
  r[0][0]="Player";
  r[1][0]="Computer";
  r[0][1]=String.valueOf(pw);
  r[1][1]=String.valueOf(cw);
  r[0][2]=String.valueOf(Math.round((pw*100.0)/games));
  r[1][2]=String.valueOf(Math.round((cw*100.0)/games));
  return r;
 }
 public static void display(String[][] t){
  for(int i=0;i<t.length;i++){
   System.out.println(t[i][0]+" "+t[i][1]+" "+t[i][2]);
  }
 }
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int g=sc.nextInt();
  int pw=0,cw=0;
  for(int i=0;i<g;i++){
   String u=sc.next();
   String c=computer();
   int w=winner(u,c);
   if(w==1) pw++;
   else if(w==-1) cw++;
  }
  display(stats(g,pw,cw));
  sc.close();
 }
}