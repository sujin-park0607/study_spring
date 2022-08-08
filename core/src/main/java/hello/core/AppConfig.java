package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//설계에 대한 정보를 AppConfig에서 바로확인이 가능해야한다.
//역할과 그에 대한 구현정보를 쉽게 확인 가능하다.
//구성영역은 공연기획자처럼 기획을 하는것이고, 사용자영역에는 클라이언트 코드를 전혀 변경할 필요가 없다.
@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
        //같이 담아서 넘겨줌!! 생서자 주입
        //마치 의존관계를 주입해주는것 같아서 의존관계 주입이라고 한다.
    }

    @Bean
    public MemoryMemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy(){
//        return new FixDiscountPolicy();
                return new RateDiscountPolicy();
    }
//
//    public DiscountPolicy discountPolicy(){
//        new RateDiscountPolicy();
//    }
}
