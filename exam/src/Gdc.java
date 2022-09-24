
public class Gdc {

    public static void main(String[] args) {
        int num1 = 7;
        int num2 = 8;

        int result = getGdc(num1, num2);
        System.out.println("찾는 정수:"+ num1 * num2/ result);
    }

    public static int getGdc(int num1, int num2){
        while(num2 != 0){
            int temp = num1 % num2;
            num1 = num2;
            num2 = temp;
        }
        return num1;
    }
}
