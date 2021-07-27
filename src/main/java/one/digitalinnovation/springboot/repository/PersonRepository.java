package one.digitalinnovation.springboot.repository;

import one.digitalinnovation.springboot.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
