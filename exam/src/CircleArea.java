import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("반지름을 입력하세요: ");
        double radius = scanner.nextDouble();
        double result = getCircle(radius);
        System.out.println("원의 넓이는 : "+ result);

    }

    public static double getCircle(double radius){
        double PI = 3.141592653589793;
        return radius * radius * PI;
    }
}
