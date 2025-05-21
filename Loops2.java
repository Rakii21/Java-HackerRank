import java.util.*;
import java.io.*;

class Loops2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int val=0;
            for(int j=0;j<n;j++){
                val+=((int)(Math.pow(2,j))*b);
                System.out.print((a+val)+" ");
                
            }
            System.out.println();
        }
        in.close();
    }
}