import java.util.*;
public class IllegalArgDemo6{
 public static void generate(String s){
  s.substring(5,2);
 }
 public static void handle(String s){
  try{
   s.substring(5,2);
  }catch(IllegalArgumentException e){
   System.out.println("Handled IllegalArgumentException");
  }catch(RuntimeException e){
   System.out.println("Handled RuntimeException");
  }
 }
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  String s=sc.next();
  try{ generate(s);}catch(Exception e){}
  handle(s);
  sc.close();
 }
}