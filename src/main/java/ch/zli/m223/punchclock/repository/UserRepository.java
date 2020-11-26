package ch.zli.m223.punchclock.repository;

import ch.zli.m223.punchclock.domain.User;
import org.hibernate.annotations.Where;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.logging.Filter;
//Greift auf die Benutzer in der Datenbank zu
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

    @Query(value = "SELECT u FROM User u ")
    List<User> findAll();
    List<User> findAll(Sort sort);
}