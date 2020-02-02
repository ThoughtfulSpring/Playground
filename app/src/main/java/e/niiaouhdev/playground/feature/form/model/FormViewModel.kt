package e.niiaouhdev.playground.feature.form.model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FormViewModel : ViewModel() {
    var mutableLiveData = MutableLiveData<String>()

    init {
        mutableLiveData.value = "Hey you, this is the playground  of Niaaouh-Dev"
    }
}