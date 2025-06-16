import java.util.Scanner;

public class Right_Angled_Triangle_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int num = sc.nextInt();
        for (int i = 0; i <= num; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print("*");
            } System.out.println(" ");
        }
    }
}
