package DataDictionary.demo.business.concretes;

import DataDictionary.demo.business.abstracts.BookService;
import DataDictionary.demo.dataAccess.abstracts.BookDao;
import DataDictionary.demo.entities.concretes.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookManager implements BookService {

    private final BookDao bookDao;

    public BookManager(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public List<Book> getAll() {
        return this.bookDao.findAll();
    }

    @Override
    public void add(Book book) {
        this.bookDao.save(book);
    }

    @Override
    public void update(Book book) {
        this.bookDao.save(book);
    }

    @Override
    public void delete(int id) {
        Book book = new Book();
        book.setId(id);
        this.bookDao.delete(book);
    }



/*    @Override
    public Book getFirstById(String id) {
        return this.bookDao.getFirstById(id);
    }*/


}
