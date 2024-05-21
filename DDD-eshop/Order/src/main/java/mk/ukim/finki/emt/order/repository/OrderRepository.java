package mk.ukim.finki.emt.order.repository;

import jakarta.persistence.criteria.Order;
import mk.ukim.finki.emt.order.domain.model.OrderId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, OrderId> {
}
