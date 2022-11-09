package web.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.DAO.UserDAO;
import web.DAO.UserDAOImpl;
import web.models.User;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsersServiceImpl implements UserService {

    List<User> users = new ArrayList<>();

    @Autowired
    UserDAO userDAO = new UserDAOImpl();

    public UsersServiceImpl() {
        users.add(new User("Andrew","Paevskiy"));

    }

    @Override
    public List<User> getUsers(int count) {
        return userDAO.getUsers(count, users);
    }
}
