

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        int[] bills = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

        System.out.println("금액을 넣으세요:");
        Scanner scanner = new Scanner(System.in);

        int money = scanner.nextInt();
        int[] result = getMoney(bills, money);

        for(int i=0; i<result.length; i++){
            System.out.println(bills[i] + "원"+ result[i] + "개");
        }
    }

    private static int[] getMoney(int[] bills, int money) {
        int[] result = new int[8];
        int cnt = 0;

        while(money >= 10 ){
            if(money >= bills[cnt]){
                money -= bills[cnt];
                result[cnt]++;
            }
            else{
                cnt ++;
            }
        }
        return result;
    }
}
