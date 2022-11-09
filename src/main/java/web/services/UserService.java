package web.services;

import web.models.User;

import java.util.List;

public interface UserService {

    List<User> getUsers(int count);
}
