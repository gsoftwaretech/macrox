package tech.gsoftware.macrox;

import com.formdev.flatlaf.*;
//import com.formdev.flatlaf.intellijthemes.*;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import tech.gsoftware.macrox.data.Data;
import tech.gsoftware.macrox.data.Json;

import javax.swing.*;
import java.util.Objects;

/**
 * Main.java
 * @author          woz07
 * @description     Entry point of program
 */

public class Main {
    public static void main(String[] args) {
        Json json = new Json();
        // Read the data from the JSON file
        Data data = json.read("data.json");

        // TODO: Continue but also take a look at this, which allows for custom intellJ themes:
        //  https://www.formdev.com/flatlaf/themes/
        //  "How to find a 3rd party IntelliJ theme?"
        //  Can also check recent chatgpt dms

        // Set theme
        String theme = Objects.requireNonNull(data.getTheme());
        if (Objects.equals(data.getOtype(), "windows")) {
            switch (theme) {
                case "light":
                    FlatLightLaf.setup();
                    break;
                case "dark":
                    FlatDarkLaf.setup();
                    break;
            }
        } else {
            switch (Objects.requireNonNull(data.getTheme())) {
                case "light":
                    FlatMacLightLaf.setup();
                    break;
                case "dark":
                    FlatMacDarkLaf.setup();
                    break;

            }
        }

        // Launch the app and pass through data object
        SwingUtilities.invokeLater(() -> new Application(data));
    }
}