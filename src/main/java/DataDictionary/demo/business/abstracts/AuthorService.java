package DataDictionary.demo.business.abstracts;

import DataDictionary.demo.entities.concretes.Author;

import java.util.List;

public interface AuthorService {

    List<Author> getAll();
    void add (Author author);
    void update (Author author);
    void delete (int id);
    Author getById(int authorId);


}
