package io.tsh.flutterloginembedding.ui.login

import android.content.Context
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import androidx.core.content.ContextCompat
import io.flutter.embedding.android.DrawableSplashScreen
import io.flutter.embedding.android.FlutterFragmentActivity
import io.flutter.embedding.android.SplashScreen
import io.tsh.flutterloginembedding.R

class FlutterLoginActivity : FlutterFragmentActivity() {

    companion object {
        fun withNewEngine() = CustomNewEngineIntentBuilder()
    }

    class CustomNewEngineIntentBuilder :
        FlutterFragmentActivity.NewEngineIntentBuilder(FlutterLoginActivity::class.java)

    override fun provideSplashScreen(): SplashScreen =
        DrawableSplashScreen(
            ColorDrawable(ContextCompat.getColor(this, R.color.white)),
            ImageView.ScaleType.CENTER,
            0
        )

}