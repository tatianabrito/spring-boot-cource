package br.gov.ce.sspds.course.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.ce.sspds.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
