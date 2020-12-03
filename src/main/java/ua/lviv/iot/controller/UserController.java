package ua.lviv.iot.controller;

import ua.lviv.iot.model.UserEntity;
import ua.lviv.iot.businesslogic.implementation.UserServiceImpl;

import java.sql.SQLException;
import java.util.List;

public class UserController {
    public List<UserEntity> getUsers() throws SQLException {
        return new UserServiceImpl().findAll();
    }

    public UserEntity getUser(Integer id) throws SQLException {
        return new UserServiceImpl().findById(id);
    }

    public int setUser(UserEntity user) throws SQLException {
        return new UserServiceImpl().create(user);
    }

    public void putUser(UserEntity user) throws SQLException {
         new UserServiceImpl().update(user);
    }

    public int removeUser(Integer id) throws SQLException {
        return new UserServiceImpl().delete(id);
    }
}
