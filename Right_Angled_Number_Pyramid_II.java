import java.util.Scanner;
public class Right_Angled_Number_Pyramid_II {
    public static class Right_Angled_Triangle_Pattern {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the number of rows");
            int num = sc.nextInt();
            for (int i = 1; i <= num; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(i);
                } System.out.println(" ");
            }
        }
    }
}
