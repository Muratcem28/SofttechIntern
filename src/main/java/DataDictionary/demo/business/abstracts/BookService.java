package DataDictionary.demo.business.abstracts;

import DataDictionary.demo.entities.concretes.Book;

import java.util.List;

public interface BookService {
    List<Book> getAll();
    void add (Book book);
    void update (Book book);
    void delete (int id);








    //  Book getFirstById(String id);

}
