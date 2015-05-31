package com.ksimeo.nazaru.view.services;

import com.ksimeo.nazaru.core.models.User;
import com.ksimeo.nazaru.view.dao.IUserDao;
import com.ksimeo.nazaru.view.dao.UserDao;
import com.ksimeo.nazaru.view.requests.IRestSystem;
import com.ksimeo.nazaru.view.requests.RestSystem;

import java.util.List;
import java.util.Map;

/**
 * Created by @Ksimeo on 01.04.2015
 */
public enum UserService implements IUserService {

    INSTANCE;
    IRestSystem userDao;

    private UserService() {

        userDao = new RestSystem();
    }

    @Override
    public List<User> getUsers() {

        return userDao.getUsers();
    }

//    @Override
//    public Map<String, User> getUsersData() {
//
//        return userDao.getUsersMap();
//    }

    @Override
    public void delById(int id) {

        userDao.delUser(id);
    }

    @Override
    public User getById(int id) {

        return userDao.getUser(id);
    }
}
