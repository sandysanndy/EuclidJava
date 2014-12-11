/**
 * Auto Generated Java Class.
 */
import java.util.*;
public class EuclidJava {
  
  /* ADD YOUR CODE HERE */
  public static int egcd(int a, int b){
    if (b==0)
      return a;
    
    return egcd(b, a%b);
  }
  
  public static void main(String[] args){
    int a, b;
    Scanner in = new Scanner(System.in);
    
    System.out.println("Masukkan a =");
    a = in.nextInt();
    System.out.println("Masukkan b =");
    b = in.nextInt();
    
    int j = egcd(a,b);
    System.out.print(j);
    in.close();
  }
  
}
