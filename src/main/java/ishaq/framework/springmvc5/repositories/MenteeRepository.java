package ishaq.framework.springmvc5.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ishaq.framework.springmvc5.domain.Mentee;

// Spring Data JPARepository Project
public interface MenteeRepository extends JpaRepository<Mentee, Long>{

}
