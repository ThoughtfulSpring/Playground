package e.niiaouhdev.playground.feature.form

import e.niiaouhdev.playground.feature.form.model.FormViewModel
import e.niiaouhdev.playground.feature.utils.uiThread
import java.util.*
import kotlin.concurrent.schedule

class FormPresenter(val view: FormPresenterView, val model: FormViewModel) {
    fun save() {
        model.isLoading.value = true

        Timer().schedule(3000) {
            uiThread {
                model.isLoading.value = false
                view.showSuccessMessage()
            }
        }
    }

    interface FormPresenterView {
        fun showSuccessMessage()
    }
}