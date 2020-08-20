package br.gov.ce.sspds.course.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.ce.sspds.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
