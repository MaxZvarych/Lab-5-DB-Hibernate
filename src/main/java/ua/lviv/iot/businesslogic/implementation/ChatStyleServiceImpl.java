package ua.lviv.iot.businesslogic.implementation;

import ua.lviv.iot.DAO.CommonDAO;
import ua.lviv.iot.DAO.implementation.ChatStyleDAOImpl;
import ua.lviv.iot.businesslogic.ChatStyleService;
import ua.lviv.iot.model.ChatStyleEntity;

public class ChatStyleServiceImpl implements ChatStyleService {
    private CommonDAO<ChatStyleEntity, String> entityDAO;

    @Override
    public CommonDAO<ChatStyleEntity, String> giveDaoObject() {
        if (entityDAO == null) {
            entityDAO = new ChatStyleDAOImpl();
        }
        return entityDAO;
    }
}
