package Lenstules

// Parameter tuner for lens styles
class LensParameterTuner {
    fun tune(profile: LensProfile, newParams: Map<String, Any>): LensProfile {
        return profile.copy(parameters = newParams)
    }
}
