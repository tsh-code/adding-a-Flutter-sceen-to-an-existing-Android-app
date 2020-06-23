package io.tsh.flutterloginembedding.ui.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import io.flutter.embedding.android.FlutterFragmentActivity

class FlutterLoginActivity : FlutterFragmentActivity() {

    companion object {
        fun withNewEngine() = CustomNewEngineIntentBuilder()
    }

    class CustomNewEngineIntentBuilder :
        FlutterFragmentActivity.NewEngineIntentBuilder(FlutterLoginActivity::class.java)
    
}