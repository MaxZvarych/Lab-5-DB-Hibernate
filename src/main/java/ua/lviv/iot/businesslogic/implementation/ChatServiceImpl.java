package ua.lviv.iot.businesslogic.implementation;

import ua.lviv.iot.DAO.CommonDAO;
import ua.lviv.iot.DAO.implementation.ChatDAOImpl;
import ua.lviv.iot.businesslogic.ChatService;
import ua.lviv.iot.model.ChatEntity;

public class ChatServiceImpl implements ChatService {
    private CommonDAO<ChatEntity, Integer> entityDAO;

    @Override
    public CommonDAO<ChatEntity, Integer> giveDaoObject() {
        if (entityDAO == null) {
            entityDAO = new ChatDAOImpl();
        }
        return entityDAO;
    }
}
