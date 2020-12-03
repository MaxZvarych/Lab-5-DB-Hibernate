package ua.lviv.iot.DAO.implementation;


import ua.lviv.iot.DAO.ChatDAO;
import ua.lviv.iot.DAO.query.QueryGenerator;

public class ChatDAOImpl implements ChatDAO {

    private QueryGenerator queryGenerator;

    @Override
    public QueryGenerator getQueryGenerator() {
        if (queryGenerator==null){
            queryGenerator=new QueryGenerator("ChatEntity");
        }
        return queryGenerator;
    }
}