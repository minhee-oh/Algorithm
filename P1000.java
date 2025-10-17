//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
import java.util.*;

public class P1000 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int sum =0;

        if(num1 > 0 && num2 <10){
            sum = num1 + num2;
            System.out.print(sum);
        }
        else{
            System.out.print("다시 입력해주세요");
        }
    }
}
