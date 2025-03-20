package tech.gsoftware.macrox;

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

        // Set theme

        // Launch the app and pass through data object
        SwingUtilities.invokeLater(() -> new Application(data));
    }
}