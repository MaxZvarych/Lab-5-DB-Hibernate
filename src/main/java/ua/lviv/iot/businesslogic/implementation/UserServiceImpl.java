package ua.lviv.iot.businesslogic.implementation;

import ua.lviv.iot.DAO.CommonDAO;
import ua.lviv.iot.DAO.implementation.UserDAOImpl;
import ua.lviv.iot.businesslogic.UserService;
import ua.lviv.iot.model.UserEntity;

public class UserServiceImpl implements UserService {
    private CommonDAO<UserEntity, Integer> entityDAO;

    @Override
    public CommonDAO<UserEntity, Integer> giveDaoObject() {
        if (entityDAO == null) {
            entityDAO = new UserDAOImpl();
        }
        return entityDAO;
    }
}
