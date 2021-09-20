package DataDictionary.demo.api.controllers;

import DataDictionary.demo.business.abstracts.AuthorService;
import DataDictionary.demo.business.abstracts.BookService;
import DataDictionary.demo.entities.concretes.Author;
import DataDictionary.demo.entities.concretes.Book;
import DataDictionary.demo.entities.dtos.BookSaveDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Book/")
public class BookController {

    private final BookService bookService;
    private final AuthorService authorService;
//    private String book;

    @Autowired
    public BookController(BookService bookService, AuthorService authorService) {
        this.bookService = bookService;
        this.authorService = authorService;
    }

    @GetMapping ("getAll")
    public List<Book> getAll(){
        return this.bookService.getAll();
    }


    @PostMapping("save")
    public void save(BookSaveDto bookSaveDto){
        Book book = new Book();
        Author author = this.authorService.getById(bookSaveDto.getAuthorId());
        book.setName(bookSaveDto.getName());

        book.setAuthor(author);
        book.setPrice(bookSaveDto.getPrice());
        book.setPublishedAt(bookSaveDto.getPublishedAt());
        this.bookService.add(book);
    }

    @PutMapping("update")
    public void update(Book book){
        this.bookService.update(book);
    }

    @DeleteMapping("delete")
    public void delete(int id){
        this.bookService.delete(id);
    }


}
