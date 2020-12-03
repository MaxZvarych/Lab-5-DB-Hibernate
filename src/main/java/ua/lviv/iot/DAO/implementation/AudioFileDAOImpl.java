package ua.lviv.iot.DAO.implementation;

import ua.lviv.iot.DAO.AudioFileDAO;
import ua.lviv.iot.DAO.query.QueryGenerator;


public class AudioFileDAOImpl implements AudioFileDAO {
 private QueryGenerator queryGenerator;

 @Override
    public QueryGenerator getQueryGenerator() {
     if (queryGenerator==null){
         queryGenerator=new QueryGenerator("AudioFileEntity");
     }
     return queryGenerator;
 }
}
