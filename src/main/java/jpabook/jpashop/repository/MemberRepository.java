package jpabook.jpashop.repository;
import jpabook.jpashop.domain.Member;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class MemberRepository {
    // 스프링이 엔티티 매니저를 만들어서 주입해준다.
    @PersistenceContext
    private EntityManager em;

    // 저장
    public void save(Member member) {
        em.persist(member);
    }

    // 하나 조회
    public Member findOne(Long id) {
        return em.find(Member.class, id);
    }

    // 회원 목록
    public List<Member> findAll() {
        // jpql을 작성해야한다.
        // sql은 테이블을 대상으로 쿼리를 작성
        // jpql은 엔티티 객체를 대상으로 쿼리 작성
        return em.createQuery("select m from Member m", Member.class)
                .getResultList(); // 리스트로 만들어줌
    }

    // 이름으로 회원 검색
    public List<Member> findByName(String name) {
        return em.createQuery("select m from Member m where m.name = :name", Member.class)
                .setParameter("name", name)
                .getResultList();
    }
}