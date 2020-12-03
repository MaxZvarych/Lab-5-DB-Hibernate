package ua.lviv.iot.businesslogic.implementation;

import ua.lviv.iot.DAO.CommonDAO;
import ua.lviv.iot.DAO.implementation.AudioFileDAOImpl;
import ua.lviv.iot.businesslogic.AudioFileService;
import ua.lviv.iot.model.AudioFileEntity;

public class AudioFileServiceImpl implements AudioFileService {
    private CommonDAO<AudioFileEntity, Integer> entityDAO;

    @Override
    public CommonDAO<AudioFileEntity, Integer> giveDaoObject() {
        if (entityDAO == null) {
            entityDAO = new AudioFileDAOImpl();
        }
        return entityDAO;
    }
}
