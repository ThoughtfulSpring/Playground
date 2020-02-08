package e.niiaouhdev.playground.feature.form

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import e.niiaouhdev.playground.R
import e.niiaouhdev.playground.databinding.FormActivityBinding
import e.niiaouhdev.playground.feature.form.model.FormViewModel

class FormActivity : AppCompatActivity(), FormPresenter.FormPresenterView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = DataBindingUtil.setContentView<FormActivityBinding>(this, R.layout.form_activity)
        val model = ViewModelProviders.of(this)[FormViewModel::class.java]
        val presenter = FormPresenter(this, model)

        binding.lifecycleOwner = this
        binding.model = model
        binding.presenter = presenter
    }

    override fun showSuccessMessage() {
        Toast.makeText(this, "Save successful !", Toast.LENGTH_SHORT).show()
    }
}