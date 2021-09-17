package DataDictionary.demo.dataAccess.abstracts;

import DataDictionary.demo.entities.concretes.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorDao extends JpaRepository<Author, Integer> {

}
