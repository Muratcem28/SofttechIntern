package DataDictionary.demo.business.concretes;

import DataDictionary.demo.business.abstracts.AuthorService;
import DataDictionary.demo.dataAccess.abstracts.AuthorDao;
import DataDictionary.demo.entities.concretes.Author;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorManager implements AuthorService {

    private final AuthorDao authorDao;

    public AuthorManager(AuthorDao authorDao) {
        this.authorDao = authorDao;
    }


    @Override
    public List<Author> getAll() {
        return this.authorDao.findAll();
    }

    @Override
    public void add(Author author) {
        this.authorDao.save(author);
    }

    @Override
    public void update(Author author) {
        this.authorDao.save(author);
    }

    @Override
    public void delete(int id) {
        Author author = new Author();
        author.setId(id);
        this.authorDao.delete(author);
    }

    @Override
    public Author getById(int id) {
        return this.authorDao.getById(id);
    }

}
