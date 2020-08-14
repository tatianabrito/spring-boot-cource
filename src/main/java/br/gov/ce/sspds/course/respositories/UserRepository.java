package br.gov.ce.sspds.course.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.ce.sspds.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
