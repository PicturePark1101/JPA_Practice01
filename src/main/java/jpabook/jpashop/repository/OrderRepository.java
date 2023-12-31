package jpabook.jpashop.repository;

import jakarta.persistence.EntityManager;
import jpabook.jpashop.domain.Order;
import jpabook.jpashop.domain.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class OrderRepository {

    private final EntityManager em;

    public void save(Order order){
        em.persist(order);
    }
    public Order findOne(Long id){
        return em.find(Order.class, id);
    }

// 이렇게 하면 번거로워진다.
//    public List<Order> findAll(OrderSearch orderSearch){
//
//        return em.createQuery("select o from Order o join o.member m" +
//                " where o.status = :status" +
//                        " and m.name like :name ", Order.class)
//                .setParameter("status", orderSearch.getOrderStatus())
//                .setParameter("name", orderSearch.getMemberName())
////                .setFirstResult(100) // 페이징 이런 식으로
//                .setMaxResults(1000) // 최대 1000건
//                .getResultList();
//    }

//    public List<Order> findAll(OrderSearch orderSearch){
//
//    }
}
