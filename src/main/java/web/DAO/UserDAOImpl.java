package web.DAO;

import org.springframework.stereotype.Repository;
import web.models.User;

import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    @Override
    public List<User> getUsers(int count, List<User> users) {
        if (count >= 5) {
            return users;
        }
        return users.subList(0, count);
    }
}
