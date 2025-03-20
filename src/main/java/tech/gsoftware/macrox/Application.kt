package tech.gsoftware.macrox

import dev.woz07.lwlfj.Logger
import dev.woz07.lwlfj.color.Background
import dev.woz07.lwlfj.color.Foreground
import tech.gsoftware.macrox.data.Data
import java.awt.Dimension
import javax.swing.JFrame

/**
 * Application.kt
 * @author          woz07
 * @description     The JFrame of the gui which contains all the content
 */

class Application(var data: Data) : JFrame("macrox") {
    private val logger = Logger()

    init {
        // Set up logger
        logger.setBackground(Background.GREEN)
        logger.setForeground(Foreground.WHITE)

        // Set up gui
        size = Dimension(600, 300)

        defaultCloseOperation = EXIT_ON_CLOSE
        setLocationRelativeTo(null)
        isResizable = false
        isVisible   = true
    }
}
