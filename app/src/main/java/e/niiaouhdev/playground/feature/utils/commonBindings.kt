package e.niiaouhdev.playground.feature.utils

import android.view.View
import androidx.databinding.BindingAdapter

@BindingAdapter("app:visibility")
fun setVisibility(view: View, value: Boolean) {
    if (value) {
        view.visibility = View.VISIBLE
    } else {
        view.visibility = View.GONE
    }
}
