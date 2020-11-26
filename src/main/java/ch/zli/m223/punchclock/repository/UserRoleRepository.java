package ch.zli.m223.punchclock.repository;

import ch.zli.m223.punchclock.domain.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
//greift auf die Benutzerrollen in der Datenbank zu
public interface UserRoleRepository extends JpaRepository<UserRole, Integer> {
}
