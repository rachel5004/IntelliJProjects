import java.io.*;
import java.util.*;
import static java.lang.Math.sqrt;

public class Main {
    public static boolean prime(int num){
        if (num == 1){
            return false;
        }
        for (int i = 2; i <= sqrt(num); i++){
            if (num%i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String[] str = br.readLine().split(" ");
//        int a = Integer.parseInt(str[0]);
//        int b = Integer.parseInt(str[1]);
//        System.out.println((a>b) ? ">" : ((a < b) ? "<" : "=="));

        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        for (int i = 1; i <= t; i++){
//            int k = sc.nextInt(), n = sc.nextInt();
//            List<Integer> list = new ArrayList<>();
//            for (int j = 1; j <= n; j++){
//                list.add(j);
//            }
//            for (int a = 1; a <= k; a++){
//                for (int b = 1; b < n; b++){
//                    list.set(b, list.get(b) + list.get(b - 1));
//                }
//            }
//            System.out.println(list.get(list.size() - 1));
//        }
//        int n = sc.nextInt();
//        int cnt = 0;
//        for (int i = 0; i < n; i++ ){
//            int num = sc.nextInt();
//            if (prime(num)){
//                cnt++;
//            }
//        }
//        System.out.println(cnt);

//        int m = sc.nextInt();
//        int n = sc.nextInt();
//        sc.close();
//            List<Integer> prime_num = new ArrayList<>();
//            for (int num = m; num <= n; num++){
//                if (prime(num)){
//                    prime_num.add(num);
//                }
//            }
//            if (prime_num.size() == 0){
//                System.out.println("-1");
//            } else{
//                int sum = prime_num.stream().mapToInt(Integer::intValue).sum();
//                System.out.println(sum);
//                System.out.println(prime_num.get(0));
//            }
//        List<Integer> lst = new ArrayList<>();
//        for (int i = 2; i <= 246912; i++){
//            if (prime(i)){
//                lst.add(i);
//            }
//        }
//        while (true){
//            int cnt = 0;
//            int n = sc.nextInt();
//            if (n == 0) break;
//            for (int j = 0; j <= lst.size(); j++){
//                if (n < lst.get(j)&&lst.get(j) <= 2*n){
//                    cnt++;
//                }
//            }
//            System.out.println(cnt);
//        }
//        int i, n, new_n, num;
//        i = 0;
//        num = n = sc.nextInt();
//        while (true){
//            n = (n%10)*10 + (n/10 + n%10)%10;
//            i++;
//            if (n == num)
//                break;
//        }
//        System.out.println(i);

//        String[] str = br.readLine().split(" ");
//        int n = Integer.parseInt(str[0]);
//        int m = Integer.parseInt(str[1]);
//        int[] num = new int[n];
//        int res = 0;
//        str = br.readLine().split(" ");
//        for (int i = 0;i<n;i++){
//            num[i] = Integer.parseInt(str[i]);
//        }
//        for (int i = 0; i < n-2; i++){
//            for (int j = i+1; j < n-1; j++){
//                for (int k = j+1; k < n ; k++){
//                    int a = num[i] + num[j] + num[k];
//                    if (a <= m && a > res)
//                        res = a;
//                }
//            }
//        }
//        System.out.println(res);

        int a,b,fst,snd,lst;
        a = sc.nextInt();
        b = sc.nextInt();
        fst = a*(b%10);
        snd = a*((b/10)%10);
        lst = a*(b/100);
        System.out.println(fst+"\n"+snd+"\n"+lst+"\n"+a*b);
    }
}
