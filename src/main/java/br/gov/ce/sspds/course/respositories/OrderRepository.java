package br.gov.ce.sspds.course.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.ce.sspds.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
