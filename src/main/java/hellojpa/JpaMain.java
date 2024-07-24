package hellojpa;

import javax.persistence.*;
import java.util.List;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");


        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();  //em을 마치 자바 컬렉션처럼 객체를 대신 저장해주는 놈이라 생각하기
        try {
            Member member = new Member();
            member.setId(1L);
            member.setUsername("K");
            em.persist(member);
            tx.commit();
            System.out.println("Member saved successfully!");
        }catch(Exception e){
            tx.rollback();
        }finally {
            em.close();
        }
        emf.close();
    }

}

