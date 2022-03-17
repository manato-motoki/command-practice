import java.util.Scanner;
public class Main {
        public static void main(String[] args ) {
                Scanner scanner = new Scanner(System.in);
                double sin = scanner.nextDouble();
                double tai = scanner.nextDouble();
                double BMI = tai / (sin * sin);
                System.out.println(BMI);
        }
}
