public class NullPointerDemo4{
 public static void generate(){
  String text=null;
  text.length();
 }
 public static void handle(){
  String text=null;
  try{
   text.length();
  }catch(NullPointerException e){
   System.out.println("Handled NullPointerException");
  }
 }
 public static void main(String[] args){
  try{ generate(); }catch(Exception e){}
  handle();
 }
}