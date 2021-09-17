package DataDictionary.demo.dataAccess.abstracts;

import DataDictionary.demo.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Integer> {
}
