package Lenstules

data class LensProfile(
    val id: String,
    val name: String,
    val description: String,
    val parameters: Map<String, Any>
)
