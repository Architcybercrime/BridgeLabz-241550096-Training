import java.util.*;
public class StringIndexDemo5{
 public static void generate(String s){
  s.charAt(s.length()+1);
 }
 public static void handle(String s){
  try{
   s.charAt(s.length()+1);
  }catch(StringIndexOutOfBoundsException e){
   System.out.println("Handled StringIndexOutOfBoundsException");
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