package ua.lviv.iot.controller;

import ua.lviv.iot.model.MessageEntity;
import ua.lviv.iot.businesslogic.implementation.MessageServiceImpl;

import java.sql.SQLException;
import java.util.List;

public class MessageController {
    public List<MessageEntity> getMessages() throws SQLException {
        return new MessageServiceImpl().findAll();
    }

    public MessageEntity getMessage(Integer id) throws SQLException {
        return new MessageServiceImpl().findById(id);
    }

    public int setMessage(MessageEntity message) throws SQLException {
        return new MessageServiceImpl().create(message);
    }

    public void putMessage(MessageEntity message) throws SQLException {
        new MessageServiceImpl().update(message);
    }

    public int removeMessage(Integer id) throws SQLException {
        return new MessageServiceImpl().delete(id);
    }
}
