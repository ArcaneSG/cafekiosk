package sample.cafekiosk.spring.domain.orderproduct;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderProductReopsitory extends JpaRepository<OrderProduct, Long> {
}
