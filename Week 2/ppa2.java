import java.util.*;
class FClass {
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s1 = sc.next();
    evenDisplay(s1);
  }
//Define evenDisplay(String) method hereS
public static void evenDisplay(String s){
//   String s1 = "";
//   char ch;
  for(int i=0; i<s.length(); i+=2){
    //   ch = s.charAt(i);
    //   s1+=ch;
    System.out.print(s.charAt(i));
  }
        
      
  
}
  
}