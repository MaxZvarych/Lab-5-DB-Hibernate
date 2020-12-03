package ua.lviv.iot.DAO.implementation;


import ua.lviv.iot.DAO.UserDAO;
import ua.lviv.iot.DAO.query.QueryGenerator;

public class UserDAOImpl implements UserDAO {

    private QueryGenerator queryGenerator;

    @Override
    public QueryGenerator getQueryGenerator() {
        if (queryGenerator==null){
            queryGenerator=new QueryGenerator("UserEntity");
        }
        return queryGenerator;
    }
}