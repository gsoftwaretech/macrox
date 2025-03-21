package tech.gsoftware.macrox.data

/**
 * Data.kt
 * @author          woz07
 * @description     Data class whose properties are updated from json and written to json
 */

data class Data(
    var opacity: Float? = null,     // Opacity? 0.0 = invisible, 1.0 = visible
    var theme: String? = null,      // Dark mode? Light mode?
    var otype: String? = null,      // Os type, Windows? Mac?
    var items: List<Item>? = null   // Item info, such as keys, active or not, etc
)
