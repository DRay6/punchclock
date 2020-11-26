package ch.zli.m223.punchclock.repository;

import ch.zli.m223.punchclock.domain.Entry;
import ch.zli.m223.punchclock.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
//greift auf die Einträge in der DB zu
public interface EntryRepository extends JpaRepository<Entry, Integer> {

}
