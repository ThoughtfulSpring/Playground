package e.niiaouhdev.playground.feature.form

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import e.niiaouhdev.playground.R
import e.niiaouhdev.playground.databinding.FormActivityBinding
import e.niiaouhdev.playground.feature.form.model.FormViewModel

class FormActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = DataBindingUtil.setContentView<FormActivityBinding>(this, R.layout.form_activity)

        val model = ViewModelProviders.of(this)[FormViewModel::class.java]

        binding.lifecycleOwner = this
        binding.model = model
    }
}