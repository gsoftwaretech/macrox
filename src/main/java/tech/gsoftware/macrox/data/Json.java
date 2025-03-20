package tech.gsoftware.macrox.data;

import com.fasterxml.jackson.databind.ObjectMapper;
import dev.woz07.lwlfj.Logger;
import dev.woz07.lwlfj.color.Background;
import dev.woz07.lwlfj.color.Foreground;
import dev.woz07.lwlfj.level.Severity;

import java.io.File;
import java.io.IOException;

public class Json {
    private final Logger logger;
    private static ObjectMapper mapper = new ObjectMapper();

    public Json(Logger logger) {
        this.logger = logger;
        this.logger.setBackground(Background.WHITE);
        this.logger.setForeground(Foreground.RED);
    }

    public Data read(String path) {
        try {
            return mapper.readValue(new File(path), Data.class);
        } catch (IOException e) {
            logger.log(Json.class, Severity.SEVERE, "Unable to read data from path: '" + path + "'.");
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