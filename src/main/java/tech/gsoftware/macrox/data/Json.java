package tech.gsoftware.macrox.data;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.woz07.lwlfj.Logger;
import dev.woz07.lwlfj.color.Background;
import dev.woz07.lwlfj.color.Foreground;
import dev.woz07.lwlfj.level.Severity;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * Json.java
 * @author          woz07
 * @description     Class that lets us read and write data to json file
 */

public class Json {
    private final Logger logger = new Logger();
    private static ObjectMapper mapper = new ObjectMapper();

    public Json() {
        this.logger.setBackground(Background.WHITE);
        this.logger.setForeground(Foreground.RED);
    }

    public Data read(String path) {
        InputStream input = getClass().getClassLoader().getResourceAsStream(path);

        if (input == null) {
            logger.log(Json.class, Severity.SEVERE, "Unable to find resource: '" + path + "'.");
            return null;
        }

        try {
            return mapper.readValue(input, Data.class);
        } catch (IOException e) {
            logger.log(Json.class, Severity.SEVERE, "Unable to read data from resource: '" + path + "'.");
            return null;
        }
    }

    public boolean write(Data data, String path) {
        try {
            mapper.writeValue(new File(path), data);
            return true;
        } catch (IOException e) {
            logger.log(Json.class, Severity.SEVERE, "Unable to write data to path: '" + path + "'.");
            return false;
        }
    }
}