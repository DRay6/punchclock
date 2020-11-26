package ch.zli.m223.punchclock.controller;

import ch.zli.m223.punchclock.domain.Entry;
import ch.zli.m223.punchclock.repository.EntryRepository;
import ch.zli.m223.punchclock.service.EntryService;
import org.springframework.data.annotation.Persistent;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/entries")
//Verwaltet Requests für Entries
public class EntryController {

    private EntryService entryService;


    public EntryController(EntryService entryService) {
        this.entryService = entryService;
    }

    //Holt alle Einträge
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Entry> getAllEntries() {
        return entryService.findAll();
    }

    //Holt alle Enträge eines Users
    @GetMapping("/by-user{id}")
    public List<Entry> getEntryByUserid(@PathVariable int id){
        return entryService.findByUserId(id);
    }

    //erstellt einen Eintrag
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Entry createEntry(@Valid @RequestBody Entry entry) {
        return entryService.createEntry(entry);
    }

    //löscht einen Eintrag
    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteEntry(@PathVariable int id){
        entryService.deleteEntry(id);
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public  Entry updateEntry(@PathVariable int id,@Valid @RequestBody Entry entry)
    {
        return entryService.updateEntry(id,entry);
    }
}
