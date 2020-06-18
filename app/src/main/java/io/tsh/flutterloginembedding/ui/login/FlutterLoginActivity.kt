package io.tsh.flutterloginembedding.ui.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders

class FlutterLoginActivity : AppCompatActivity() {

    private lateinit var loginViewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /* poof */
        loginViewModel = ViewModelProviders.of(this, LoginViewModelFactory())
            .get(LoginViewModel::class.java)

        loginViewModel.loginFormState.observe(this@FlutterLoginActivity, Observer {
            val loginState = it ?: return@Observer
            /* poof */ loginState.isDataValid

            if (loginState.usernameError != null) {
                /* poof */
            }
            if (loginState.passwordError != null) {
                /* poof */
            }
        })

        loginViewModel.loginResult.observe(this@FlutterLoginActivity, Observer {
            val loginResult = it ?: return@Observer
            /* poof */
            if (loginResult.error != null) {
                /* poof */
            }
            if (loginResult.success != null) {
                /* poof */
            }
            /* poof */
        })

        /* poof */
        loginViewModel.loginDataChanged("poof user", "poof password")
        /* poof */
        loginViewModel.login("poof user", "poof password")
        /* poof */
    }
}