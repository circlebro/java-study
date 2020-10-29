import java.util.Scanner;

/**
 * 문자열 15칸 고정, 숫자 길이 3자리 안맞을시 0으로 채움
 */
public class outFormatting {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();

            System.out.println(String.format("%-15s%s", s1, String.format("%03d", x) ));

            //Complete this line
        }
        System.out.println("================================");

    }
}
