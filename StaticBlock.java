import java.io.*;
import java.util.*;

public class StaticBlock {
    static int b;
    static int h;
     static{
            Scanner sc=new Scanner(System.in);
            b=sc.nextInt();
            h=sc.nextInt();
            if(b<=0 || h<=0){
                System.out.println("java.lang.Exception: Breadth and height must be positive");
            }
            else System.out.println(b*h);
                
     }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
