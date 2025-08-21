package Lenstules

// Export lens profiles to JSON files
import com.google.gson.Gson
import java.io.File

class LensExporter {
    fun exportToFile(profile: LensProfile, file: File): Boolean {
        return try {
            val json = Gson().toJson(profile)
            file.writeText(json)
            true
        } catch (e: Exception) {
            false
        }
    }
}
