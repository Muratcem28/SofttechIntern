package DataDictionary.demo.business.concretes;

import DataDictionary.demo.business.abstracts.UserService;
import DataDictionary.demo.dataAccess.abstracts.UserDao;
import DataDictionary.demo.entities.concretes.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManager implements UserService {

    private final UserDao usersDao;

    public UserManager(UserDao usersDao) {
        this.usersDao = usersDao;
    }

    @Override
    public List<User> getAll() {
        return this.usersDao.findAll();
    }

    @Override
    public void add(User user) {
        this.usersDao.save(user);
    }

    @Override
    public void update(User user) {
        this.usersDao.save(user);
    }

    @Override
    public void delete(int id) {
        User user = new User();
        user.setId(id);
        this.usersDao.delete(user);
    }
}
