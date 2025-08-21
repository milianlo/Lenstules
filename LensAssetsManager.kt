package Lenstules

// Manage lens assets such as images and previews
class LensAssetsManager {
    fun getPreviewImage(profile: LensProfile): String {
        // TODO: Return path or URI to preview image
        return "assets/${profile.id}_preview.png"
    }
}
