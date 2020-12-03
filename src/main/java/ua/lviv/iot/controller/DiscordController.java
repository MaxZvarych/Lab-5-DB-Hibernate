package ua.lviv.iot.controller;

import ua.lviv.iot.model.DiscordEntity;
import ua.lviv.iot.businesslogic.implementation.DiscordServiceImpl;

import java.sql.SQLException;
import java.util.List;

public class DiscordController {
    public List<DiscordEntity> getDiscords() throws SQLException {
        return new DiscordServiceImpl().findAll();
    }

    public DiscordEntity getDiscord(Integer id) throws SQLException {
        return new DiscordServiceImpl().findById(id);
    }

    public int setDiscord(DiscordEntity discord) throws SQLException {
        return new DiscordServiceImpl().create(discord);
    }

    public void putDiscord(DiscordEntity discord) throws SQLException {
         new DiscordServiceImpl().update(discord);
    }

    public int removeDiscord(Integer id) throws SQLException {
        return new DiscordServiceImpl().delete(id);
    }
}
