package tech.gsoftware.macrox.data

/**
 * Item.kt
 * @author          woz07
 * @description     Data class regarding info that gets displayed to ui
 */

data class Item(
    var name:   String? = null,
    var path:   String? = null,
    var keys:   List<Int>? = null,
    var active: Boolean? = null
)
