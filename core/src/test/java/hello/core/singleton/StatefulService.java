package hello.core.singleton;

public class StatefulService {
//    private int price; //상태를 유지하는 필드

    public int order(String name, int price){
        System.out.println("name = " + name + " price = " + price);
//        this.price = price; //여기가 문제 전역변수는 안됨
        return price; //지역변수로 변경해야지 유지가 가능함
    }

//    public int getPrice(){
//        return price;
//    }

}
