package Lenstules

import android.os.Bundle
import androidx.fragment.app.DialogFragment
import androidx.recyclerview.widget.RecyclerView

class LensPickerFragment(
    private val onLensSelected: (LensStyle) -> Unit
) : DialogFragment() {

    // Usage: LensPickerFragment.newInstance { selected -> ... }
    companion object {
        fun newInstance(onLensSelected: (LensStyle) -> Unit): LensPickerFragment {
            return LensPickerFragment(onLensSelected)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // TODO: Load lens styles from assets
    }

    // TODO: Implement RecyclerView UI for lens picker
}
