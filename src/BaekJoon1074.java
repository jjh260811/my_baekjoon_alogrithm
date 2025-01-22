import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class BaekJoon1074 {
    static int start = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int size = (int)Math.pow(2,n);
        find(size,r,c);
        bw.write(start+"\n");
        bw.flush();
        bw.close();
        br.close();

        
        
    }
    public static int find(int size, int r, int c){
        
        if(size<=1){
            return 0;
        }
        int howLong = size/2;
        if(r<howLong&&c<howLong){
            start+=0;
            return find(howLong,r,c);
        }
        else if(r<howLong && c>=howLong){
            start += (size * size)/4;
            return find(howLong,r,c-howLong);
        }
        else if(r>=howLong && c<howLong){
            start += (size * size)/4 * 2;
            return find(howLong,r-howLong,c);
        }
        else{
            start += (size * size)/4 * 3;
            return find(howLong,r-howLong,c-howLong);
        }
       
    }

}