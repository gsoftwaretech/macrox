package tech.gsoftware.macrox

import dev.woz07.lwlfj.Logger
import dev.woz07.lwlfj.color.Background
import dev.woz07.lwlfj.color.Foreground
import tech.gsoftware.macrox.data.Data
import tech.gsoftware.macrox.ui.pages.DashboardPage
import tech.gsoftware.macrox.ui.pages.SettingsPage
import tech.gsoftware.macrox.ui.pages.SupportPage
import tech.gsoftware.macrox.ui.pages.InformationPage
import java.awt.BorderLayout
import java.awt.Dimension
import javax.swing.*

/**
 * Application.kt
 * @author          woz07
 * @description     The JFrame of the gui which contains all the content
 */

class Application(var data: Data) : JFrame("macrox") {
    private val logger = Logger()
    private val container = JTabbedPane()

    init {
        // Set up logger
        logger.setBackground(Background.GREEN)
        logger.setForeground(Foreground.WHITE)

        // Set up gui
        size = Dimension(600, 400)
        iconImage = ImageIcon(javaClass.getResource("/favicon.png")).image

        // JPanels
        val dashboard = DashboardPage()
        val settings  = SettingsPage()
        val support   = SupportPage()
        val info      = InformationPage()

        container.addTab("Dashboard", dashboard)
        container.addTab("Settings", settings)
        container.addTab("Support", support)
        container.addTab("TOS & Info", info)

        add(container, BorderLayout.CENTER)
        defaultCloseOperation = EXIT_ON_CLOSE
        setLocationRelativeTo(null)
        isResizable = false
        isVisible   = true
    }
}