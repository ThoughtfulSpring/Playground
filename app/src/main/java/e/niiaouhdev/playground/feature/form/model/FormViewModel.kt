package e.niiaouhdev.playground.feature.form.model

import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FormViewModel : ViewModel() {
    val title = MutableLiveData<String>()
    val description = MutableLiveData<String>()
    val showPreview = MutableLiveData<Boolean>()
    val isLoading = MutableLiveData<Boolean>()

    val isSavedButtonEnabled = MediatorLiveData<Boolean>()

    init {
        title.value = ""
        description.value = ""
        showPreview.value = false
        isLoading.value = false
        isSavedButtonEnabled.addSource(title) { isSavedButtonEnabled.value = !title.value.isNullOrBlank() && isLoading.value != true }
        isSavedButtonEnabled.addSource(isLoading) { isSavedButtonEnabled.value = !title.value.isNullOrBlank() && isLoading.value != true }
    }
}