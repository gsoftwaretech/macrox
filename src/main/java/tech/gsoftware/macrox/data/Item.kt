package tech.gsoftware.macrox.data

data class Item(
    var name:   String? = null,
    var path:   String? = null,
    var keys:   List<Int>? = null,
    var active: Boolean? = null
)
