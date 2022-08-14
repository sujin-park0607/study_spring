package hello.core;

import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
//bean을 스프링 컨테이너에 등록해주는 애너테이션
@ComponentScan(
        //componentScan의 대상이 되어주는 경로를 등록
        basePackages = "hello.core.member",
        basePackageClasses = AutoAppConfig.class,
        //예제를 안전하기 유지하기 위해 뺌. 기존의 AppConfig 등록을 막기 위해서 ㅅ사용함
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
//기존과는 다르게 @bean으로 등록한 클래스가 하나도 없다.
public class AutoAppConfig {

    @Bean(name = "memoryMemberRepository")
    MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }

}
