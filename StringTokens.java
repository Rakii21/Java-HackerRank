import java.io.*;
import java.util.*;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String[] result=s.trim().split("[ !,?._'@]+");
        if(s.trim().equals("")) System.out.println(0);
        else System.out.println(result.length);
        for(String word:result){
            System.out.println(word);
        }
        scan.close();
    }
}