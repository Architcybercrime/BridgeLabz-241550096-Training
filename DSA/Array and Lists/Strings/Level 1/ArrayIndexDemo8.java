import java.util.*;
public class ArrayIndexDemo8{
 public static void generate(String[] a){
  System.out.println(a[a.length+1]);
 }
 public static void handle(String[] a){
  try{
   System.out.println(a[a.length+1]);
  }catch(ArrayIndexOutOfBoundsException e){
   System.out.println("Handled ArrayIndexOutOfBoundsException");
  }catch(RuntimeException e){
   System.out.println("Handled RuntimeException");
  }
 }
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  String[] a=new String[3];
  for(int i=0;i<3;i++) a[i]=sc.next();
  try{ generate(a);}catch(Exception e){}
  handle(a);
  sc.close();
 }
}