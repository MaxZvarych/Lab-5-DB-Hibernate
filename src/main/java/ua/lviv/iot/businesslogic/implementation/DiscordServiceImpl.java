package ua.lviv.iot.businesslogic.implementation;

import ua.lviv.iot.DAO.CommonDAO;
import ua.lviv.iot.DAO.implementation.DiscordDAOImpl;
import ua.lviv.iot.businesslogic.DiscordService;
import ua.lviv.iot.model.DiscordEntity;

public class DiscordServiceImpl implements DiscordService {
    private CommonDAO<DiscordEntity, Integer> entityDAO;

    @Override
    public CommonDAO<DiscordEntity, Integer> giveDaoObject() {
        if (entityDAO == null) {
            entityDAO = new DiscordDAOImpl();
        }
        return entityDAO;
    }
}
