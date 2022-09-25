package jpabook.jpashop.repository;

import jpabook.jpashop.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class MemberRepository {

    //jpa의 엔티티매니저를 자기가 주입해주는 애너테이션
    private final EntityManager em;
    //스프링 jpa data가 지원해주는것

    public void save(Member member){
        em.persist(member);
    }

    //단건 조회
    public Member findOne(Long id){
        return em.find(Member.class, id);
    }

    //JPQL문법을 사용하여 모든 목록 리스트로 조회
    public List<Member> findAll(){

        return em.createQuery("select m from Member m", Member.class)
                .getResultList();
    }

    //파라미터를 바인딩하여 특정 이름만 찾도록 함
    public List<Member> findByName(String name){
        return em.createQuery("select m from Member m where m.name = :name", Member.class)
                .setParameter("name",name)
                .getResultList();

    }

}
