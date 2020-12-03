package ua.lviv.iot.controller;

import ua.lviv.iot.model.ChatEntity;
import ua.lviv.iot.businesslogic.implementation.ChatServiceImpl;

import java.sql.SQLException;
import java.util.List;

public class ChatController {
    public List<ChatEntity> getChats() throws SQLException {
        return new ChatServiceImpl().findAll();
    }

    public ChatEntity getChat(Integer id) throws SQLException {
        return new ChatServiceImpl().findById(id);
    }

    public int setChat(ChatEntity chat) throws SQLException {
        return new ChatServiceImpl().create(chat);
    }

    public void putChat(ChatEntity chat) throws SQLException {
        new ChatServiceImpl().update(chat);
    }

    public int removeChat(Integer id) throws SQLException {
        return new ChatServiceImpl().delete(id);
    }
}
