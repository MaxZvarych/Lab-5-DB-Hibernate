package ua.lviv.iot.DAO.implementation;


import ua.lviv.iot.DAO.MessageDAO;
import ua.lviv.iot.DAO.query.QueryGenerator;

public class MessageDAOImpl implements MessageDAO {

    private QueryGenerator queryGenerator;

    @Override
    public QueryGenerator getQueryGenerator() {
        if (queryGenerator==null){
            queryGenerator=new QueryGenerator("MessageEntity");
        }
        return queryGenerator;
    }
}