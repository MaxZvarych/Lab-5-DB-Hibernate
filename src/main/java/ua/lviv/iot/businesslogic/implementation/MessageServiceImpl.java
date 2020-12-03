package ua.lviv.iot.businesslogic.implementation;

import ua.lviv.iot.DAO.CommonDAO;
import ua.lviv.iot.DAO.implementation.MessageDAOImpl;
import ua.lviv.iot.businesslogic.MessageService;
import ua.lviv.iot.model.MessageEntity;

public class MessageServiceImpl implements MessageService {
    private CommonDAO<MessageEntity, Integer> entityDAO;

    @Override
    public CommonDAO<MessageEntity, Integer> giveDaoObject() {
        if (entityDAO == null) {
            entityDAO = new MessageDAOImpl();
        }
        return entityDAO;
    }
}
