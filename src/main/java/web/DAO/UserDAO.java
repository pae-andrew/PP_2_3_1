package web.DAO;

import web.models.User;

import java.util.List;

public interface UserDAO {

    List<User> getUsers(int count, List<User> users);
}
