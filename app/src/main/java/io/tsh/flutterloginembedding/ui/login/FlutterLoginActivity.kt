package io.tsh.flutterloginembedding.ui.login

import android.graphics.drawable.ColorDrawable
import android.widget.ImageView
import androidx.core.content.ContextCompat
import io.flutter.embedding.android.DrawableSplashScreen
import io.flutter.embedding.android.FlutterFragmentActivity
import io.flutter.embedding.android.SplashScreen
import io.tsh.flutterloginembedding.R

class FlutterLoginActivity : FlutterFragmentActivity() {

    companion object {
        fun withCachedEngine(engineId: String) = CustomCachedEngineIntentBuilder(engineId)
    }

    class CustomCachedEngineIntentBuilder(engineId: String) :
        CachedEngineIntentBuilder(FlutterLoginActivity::class.java, engineId)

    override fun provideSplashScreen(): SplashScreen =
        DrawableSplashScreen(
            ColorDrawable(ContextCompat.getColor(this, R.color.white)),
            ImageView.ScaleType.CENTER,
            0
        )
}