package ua.lviv.iot.DAO.implementation;


import ua.lviv.iot.DAO.MediaFileDAO;
import ua.lviv.iot.DAO.query.QueryGenerator;

public class MediaFileDAOImpl implements MediaFileDAO {

    private QueryGenerator queryGenerator;

    @Override
    public QueryGenerator getQueryGenerator() {
        if (queryGenerator==null){
            queryGenerator=new QueryGenerator("MediaFileEntity");
        }
        return queryGenerator;
    }
}
