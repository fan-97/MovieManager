package com.service;

import com.entity.User;

import java.util.List;
import static com.util.StorageCache.*;

public class UserService {

    public void add(User user) {
        USER_CACHE_LIST.add(user);
    }

    public void delete(Integer id) {
        for (User user : USER_CACHE_LIST) {
            if (user.getId().equals(id)) {
                USER_CACHE_LIST.remove(user);
                break;
            }
        }
    }

    public User findById(int id) {
        for (User user : USER_CACHE_LIST) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }

    public List<User> findAll() {
        return USER_CACHE_LIST;
    }

    public void update(User newUser) {
        for (User user : USER_CACHE_LIST) {
            if (user.getId().equals(newUser)) {
                user = newUser;
                break;
            }
        }
    }
}
