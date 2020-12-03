package ua.lviv.iot.controller;

import ua.lviv.iot.model.MediaFileEntity;
import ua.lviv.iot.businesslogic.implementation.MediaFileServiceImpl;

import java.sql.SQLException;
import java.util.List;

public class MediaFileController {
    public List<MediaFileEntity> getMediaFiles() throws SQLException {
        return new MediaFileServiceImpl().findAll();
    }

    public MediaFileEntity getMediaFile(Integer id) throws SQLException {
        return new MediaFileServiceImpl().findById(id);
    }

    public int setMediaFile(MediaFileEntity mediaFile) throws SQLException {
        return new MediaFileServiceImpl().create(mediaFile);
    }

    public void putMediaFile(MediaFileEntity mediaFile) throws SQLException {
         new MediaFileServiceImpl().update(mediaFile);
    }

    public int removeMediaFile(Integer id) throws SQLException {
        return new MediaFileServiceImpl().delete(id);
    }
}
