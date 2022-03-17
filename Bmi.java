import java.util.Scanner;
public class Main {
        public static void main(String[] args ) {
                Scanner scanner = new Scanner(System.in);
		int cnt;
		cnt = 0;
		
		while( cnt <= 1){
			double hight = scanner.nextDouble();
                	double weight = scanner.nextDouble();
                	double BMI = weight / (hight * hight);
                	System.out.println(BMI);
			cnt = cnt + 1;
		}
        }
}
