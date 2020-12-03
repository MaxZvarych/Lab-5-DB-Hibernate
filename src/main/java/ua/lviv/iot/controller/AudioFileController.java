package ua.lviv.iot.controller;

import ua.lviv.iot.model.AudioFileEntity;
import ua.lviv.iot.businesslogic.implementation.AudioFileServiceImpl;

import java.sql.SQLException;
import java.util.List;

public class AudioFileController {
    public List<AudioFileEntity> getAudioFiles() throws SQLException {
        return new AudioFileServiceImpl().findAll();
    }

    public AudioFileEntity getAudioFile(Integer id) throws SQLException {
        return new AudioFileServiceImpl().findById(id);
    }

    public int setAudioFile(AudioFileEntity audioFile) throws SQLException {
        return new AudioFileServiceImpl().create(audioFile);
    }

    public void putAudioFile(AudioFileEntity audioFile) throws SQLException {
        new AudioFileServiceImpl().update(audioFile);
    }

    public int removeAudioFile(Integer id) throws SQLException {
        return new AudioFileServiceImpl().delete(id);
    }
}
