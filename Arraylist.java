import java.io.*;
import java.util.*;

public class Arraylist {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<List<Integer>> data=new ArrayList<>();
        for(int i=0;i<n;i++){
            int d=sc.nextInt();
            List<Integer> row=new ArrayList<>();
            for(int j=0;j<d;j++){
                
                row.add(sc.nextInt());
            }
            data.add(row);
        }
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if((x-1)<data.size() && (y-1)<data.get(x-1).size()){
                System.out.println(data.get(x-1).get(y-1));
            }
            else System.out.println("ERROR!");
        }
    }
}