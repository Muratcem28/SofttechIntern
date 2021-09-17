package DataDictionary.demo.api.controllers;

import DataDictionary.demo.business.abstracts.AuthorService;
import DataDictionary.demo.entities.concretes.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Author/")
public class AuthorController {

    private final AuthorService authorService;
    private String author;

    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/gelAll")
    public List<Author> gelAll(){
        return this.authorService.getAll();
    }

    @PostMapping("/save/")
    public void save (Author author){
        this.authorService.add(author);
    }

    @PutMapping("/update/")
    public void update (Author author){
        this.authorService.update(author);
    }

    @DeleteMapping("/delete/")
    public void delete (int id){
        this.authorService.delete(id);
    }
}


