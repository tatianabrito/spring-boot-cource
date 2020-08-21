package br.gov.ce.sspds.course.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.ce.sspds.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
