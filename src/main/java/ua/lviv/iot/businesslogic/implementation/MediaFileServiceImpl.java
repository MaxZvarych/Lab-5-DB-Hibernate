package ua.lviv.iot.businesslogic.implementation;

import ua.lviv.iot.DAO.CommonDAO;
import ua.lviv.iot.DAO.implementation.MediaFileDAOImpl;
import ua.lviv.iot.businesslogic.MediaFileService;
import ua.lviv.iot.model.MediaFileEntity;

public class MediaFileServiceImpl implements MediaFileService {
    private CommonDAO<MediaFileEntity, Integer> entityDAO;

    @Override
    public CommonDAO<MediaFileEntity, Integer> giveDaoObject() {
        if (entityDAO == null) {
            entityDAO = new MediaFileDAOImpl();
        }
        return entityDAO;
    }
}
