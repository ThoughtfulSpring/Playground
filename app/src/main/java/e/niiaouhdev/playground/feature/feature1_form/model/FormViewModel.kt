package e.niiaouhdev.playground.feature.feature1_form.model

import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import e.niiaouhdev.playground.feature.utils.SingleLiveEvent
import e.niiaouhdev.playground.feature.utils.uiThread
import java.util.*
import kotlin.concurrent.schedule

class FormViewModel : ViewModel() {
    val title = MutableLiveData<String>()
    val description = MutableLiveData<String>()
    val showPreview = MutableLiveData<Boolean>()
    val isLoading = MutableLiveData<Boolean>()

    val isSavedButtonEnabled = MediatorLiveData<Boolean>()

    val displaySaveMessage = SingleLiveEvent<Any>()

    init {
        title.value = ""
        description.value = ""
        showPreview.value = false
        isLoading.value = false
        isSavedButtonEnabled.addSource(title) {
            isSavedButtonEnabled.value = !title.value.isNullOrBlank() && isLoading.value != true
        }
        isSavedButtonEnabled.addSource(isLoading) {
            isSavedButtonEnabled.value = !title.value.isNullOrBlank() && isLoading.value != true
        }
    }

    fun onSaveButtonClicked() {
        isLoading.value = true

        Timer().schedule(3000) {
            uiThread {
                isLoading.value = false
                displaySaveMessage.call()
            }
        }
    }
}