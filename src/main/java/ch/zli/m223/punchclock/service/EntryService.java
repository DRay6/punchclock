package ch.zli.m223.punchclock.service;

import ch.zli.m223.punchclock.domain.Entry;
import ch.zli.m223.punchclock.repository.EntryRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

@Service
//Hier ist die Logik für die Einträge
public class EntryService {
    private EntryRepository entryRepository;

    public EntryService(EntryRepository entryRepository) {
        this.entryRepository = entryRepository;
    }

    public Entry createEntry(Entry entry) {
        return entryRepository.saveAndFlush(entry);
    }

    public List<Entry> findAll() {
        return entryRepository.findAll();
    }

    public List<Entry> findByUserId(int id){
        List<Entry> entryList = new Stack<>();

        for (Entry entry :entryRepository.findAll()) {
            if (entry.getId() == id){
                entryList.add(entry);
            }
        }

        return entryList;
    }

    public void deleteEntry(int id){
        entryRepository.deleteById(id);
    }

    public Entry updateEntry(int id, Entry entry){
        entry.setId(id);
        return  entryRepository.save(entry);
    }
}
