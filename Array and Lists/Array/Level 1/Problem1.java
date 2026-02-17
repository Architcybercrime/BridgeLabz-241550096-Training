import java.util.*;
public class Problem1{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int[] ages=new int[10];
  for(int i=0;i<10;i++) ages[i]=sc.nextInt();
  for(int i=0;i<10;i++){
   int a=ages[i];
   if(a<0) System.out.println("Invalid age");
   else if(a>=18) System.out.println("The student with the age "+a+" can vote.");
   else System.out.println("The student with the age "+a+" cannot vote.");
  }
  sc.close();
 }
}