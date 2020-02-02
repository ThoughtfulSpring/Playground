package e.niiaouhdev.playground.feature.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import e.niiaouhdev.playground.R
import e.niiaouhdev.playground.databinding.MainActivityBinding
import e.niiaouhdev.playground.feature.form.FormActivity

class MainActivity : AppCompatActivity(), MainPresenter {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<MainActivityBinding>(this, R.layout.main_activity)

        binding.presenter = this
    }

    override fun goToFormActivity() {
        startActivity(Intent(this, FormActivity::class.java))
    }
}
