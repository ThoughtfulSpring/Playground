package e.niiaouhdev.playground.feature.form.model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FormViewModel : ViewModel() {
    var mutableLiveData = MutableLiveData<String>()
    var title = MutableLiveData<String>()
    var description = MutableLiveData<String>()
    var showPreview = MutableLiveData<Boolean>()
    var isLoading = MutableLiveData<Boolean>()

    init {
        mutableLiveData.value = "Hey you, this is the playground  of Niaaouh-Dev"
        title.value = ""
        description.value = ""
        showPreview.value = false
        isLoading.value = false
    }
}