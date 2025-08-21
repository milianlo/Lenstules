package Lenstules

// Import lens profiles from JSON files
import com.google.gson.Gson
import java.io.File

class LensImporter {
    fun importFromFile(file: File): LensProfile? {
        return try {
            val json = file.readText()
            Gson().fromJson(json, LensProfile::class.java)
        } catch (e: Exception) {
            null
        }
    }
}
