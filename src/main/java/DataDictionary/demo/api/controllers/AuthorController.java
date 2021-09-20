package DataDictionary.demo.api.controllers;

import DataDictionary.demo.business.abstracts.AuthorService;
import DataDictionary.demo.business.abstracts.BookService;
import DataDictionary.demo.entities.concretes.Author;
import DataDictionary.demo.entities.concretes.Book;
import DataDictionary.demo.entities.dtos.AuthorSaveDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Author/")
public class AuthorController {

    private final AuthorService authorService;
    private final BookService bookService;
    // private String author;

    @Autowired
    public AuthorController(AuthorService authorService, BookService bookService) {
        this.authorService = authorService;
        this.bookService = bookService;
    }

    @GetMapping("/gelAll")
    public List<Author> gelAll() {
        return this.authorService.getAll();
    }

    @PostMapping("/save/")
    public void save(AuthorSaveDto authorSaveDto) {

        Author author = new Author();

        author.setName(authorSaveDto.getName());
        author.setDate(authorSaveDto.getDate());


        this.authorService.add(author);
    }

    @PutMapping("/update/")
    public void update(Author author) {
        this.authorService.update(author);
    }

    @DeleteMapping("/delete/")
    public void delete(int id) {
        this.authorService.delete(id);
    }
}


