package ua.lviv.iot.controller;

import ua.lviv.iot.model.ChatStyleEntity;
import ua.lviv.iot.businesslogic.implementation.ChatStyleServiceImpl;

import java.sql.SQLException;
import java.util.List;

public class ChatStyleController {
    public List<ChatStyleEntity> getChatStyles() throws SQLException {
        return new ChatStyleServiceImpl().findAll();
    }

    public ChatStyleEntity getChatStyle(String name) throws SQLException {
        return new ChatStyleServiceImpl().findById(name);
    }

    public int setChatStyle(ChatStyleEntity chatStyle) throws SQLException {
        return new ChatStyleServiceImpl().create(chatStyle);
    }

    public void putChatStyle(ChatStyleEntity chatStyle) throws SQLException {
         new ChatStyleServiceImpl().update(chatStyle);
    }

    public int removeChatStyle(String name) throws SQLException {
        return new ChatStyleServiceImpl().delete(name);
    }
}
