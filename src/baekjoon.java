import java.io.*;
import java.util.*;
import static java.lang.Math.*;

public class baekjoon {
    static int pac(int n){
        int res=0;
        for(int i=1;i<=n;i++)
            res += i;
        return res;
    }
    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        List<Integer> X_lst = new ArrayList<>();
//        List<Integer> Y_lst = new ArrayList<>();
//        for (int i = 0; i < 3; i++){
//            String[] str = br.readLine().split(" ");
//            int a = Integer.parseInt(str[0]);
//            int b = Integer.parseInt(str[1]);
//            X_lst.add(a);
//            Y_lst.add(b);
//        }
//        int dx = ((X_lst.get(0) == X_lst.get(1)) ? X_lst.get(2) : (((X_lst.get(0) == X_lst.get(2)) ? X_lst.get(1) : X_lst.get(0))));
//        int dy = ((Y_lst.get(0) == Y_lst.get(1)) ? Y_lst.get(2) : (((Y_lst.get(0) == Y_lst.get(2)) ? Y_lst.get(1) : Y_lst.get(0))));
//        System.out.println(dx+" "+dy);
//        int n=10;
//        int res=0;
//        for (int i=1;i<11;i++){
//            res+=pac(i);
//        }
//        System.out.println(res);


        ArrayList<String> res = new ArrayList<String>();

        for(int i=1;i<101;i++){
            res.add(i+"");
        }
        for (int i=1;i<101;i++){
            if (1<=selfnum(i) && selfnum(i)<101){
                try{
                    res.remove(selfnum(i)+"");
                }catch (Exception e){}
            }
            if (res.contains(i+"")){
                System.out.println(i);
            }
        }
    }
    public static int selfnum(int a){
        String stra = Integer.toString(a);
        for(int i=0;i<stra.length();i++){
            a+=stra.charAt(i) - '0';
        }
        return a;
    }
}
