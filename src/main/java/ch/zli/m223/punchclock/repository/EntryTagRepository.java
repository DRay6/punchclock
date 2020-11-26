package ch.zli.m223.punchclock.repository;

import ch.zli.m223.punchclock.domain.EntryTag;
import org.springframework.data.jpa.repository.JpaRepository;
//Greift auf die Eintragskategorien in der Datenbank zu
public interface EntryTagRepository extends JpaRepository<EntryTag,Integer> {
}
