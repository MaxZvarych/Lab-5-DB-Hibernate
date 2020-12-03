package ua.lviv.iot.DAO.implementation;


import ua.lviv.iot.DAO.ChatStyleDAO;
import ua.lviv.iot.DAO.query.QueryGenerator;

public class ChatStyleDAOImpl implements ChatStyleDAO {

    private QueryGenerator queryGenerator;

    @Override
    public QueryGenerator getQueryGenerator() {
        if (queryGenerator==null){
            queryGenerator=new QueryGenerator("ChatStyleEntity");
        }
        return queryGenerator;
    }
}
