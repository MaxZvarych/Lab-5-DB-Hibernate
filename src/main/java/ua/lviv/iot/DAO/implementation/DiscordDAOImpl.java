package ua.lviv.iot.DAO.implementation;


import ua.lviv.iot.DAO.DiscordDAO;
import ua.lviv.iot.DAO.query.QueryGenerator;

public class DiscordDAOImpl implements DiscordDAO {

    private QueryGenerator queryGenerator;

    @Override
    public QueryGenerator getQueryGenerator() {
        if (queryGenerator==null){
            queryGenerator=new QueryGenerator("DiscordEntity");
        }
        return queryGenerator;
    }
}
