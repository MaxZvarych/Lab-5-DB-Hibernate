package ua.lviv.iot.view;

import java.io.IOException;
import java.sql.SQLException;

@FunctionalInterface
public interface Printable {
    void print() throws IOException, SQLException;
}
