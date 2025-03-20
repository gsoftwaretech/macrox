package tech.gsoftware.macrox.data

/**
 * Data.kt
 * @author          woz07
 * @description     Data class whose properties are updated from json and written to json
 */

data class Data(
    var theme: String? = null,
    var items: List<Item>? = null
)
