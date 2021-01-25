import java.util.Scanner;

public class javaQ {
    public static void main(String[] args) {
        int ans = (int)(Math.random()*100+1);
        int input = 0;
        int cnt = 0;
        Scanner sc = new Scanner(System.in);
        do{
            cnt++;
            System.out.println("input: ");
            input = sc.nextInt();

            if(input==ans) {
                System.out.println("맞췄습니다");
                System.out.println("시도횟수는 "+cnt);
                break;
            }
            else if (input>ans) {
                System.out.println("더 작은 수를 입력하세요");
            }
            else{
                System.out.println("더 큰 수를 입력하세요");
            }
        }while (true);
    }
}
