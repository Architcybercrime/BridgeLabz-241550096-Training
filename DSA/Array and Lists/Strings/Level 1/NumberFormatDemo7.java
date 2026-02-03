import java.util.*;
public class NumberFormatDemo7{
 public static void generate(String t){
  Integer.parseInt(t);
 }
 public static void handle(String t){
  try{
   Integer.parseInt(t);
  }catch(NumberFormatException e){
   System.out.println("Handled NumberFormatException");
  }catch(RuntimeException e){
   System.out.println("Handled RuntimeException");
  }
 }
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  String t=sc.next();
  try{ generate(t);}catch(Exception e){}
  handle(t);
  sc.close();
 }
}