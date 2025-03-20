package tech.gsoftware.macrox;

import tech.gsoftware.macrox.data.Json;

import javax.swing.*;

/**
 * Main.java
 * @author          woz07
 * @description     Entry point of program
 */

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Application::new);
    }
}