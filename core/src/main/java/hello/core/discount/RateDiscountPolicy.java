package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class RateDiscountPolicy implements DiscountPolicy{

    private int discountPolicy = 10;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP){
            return price * discountPolicy / 100;
            //10% 할인로직 굉장히 중요하다. 경계값테스트 등등 ...
        } else {
            return 0;
        }
    }
}
