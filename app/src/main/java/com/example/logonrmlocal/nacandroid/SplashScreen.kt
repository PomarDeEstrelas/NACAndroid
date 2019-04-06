package com.example.logonrmlocal.nacandroid

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        ivLogo = findViewById(R.id.ivLogo)
        carregar()

    }

    fun carregar() {
        val anim = AnimationUtils.loadAnimation(this, R.anim.animacao)
        anim.reset()

        ivLogo!!.clearAnimation()
        ivLogo!!.startAnimation(anim)

        Handler().postDelayed({
            val intent = Intent(this@SplashScreen, MenuPrincipalActivity::class.java)
            intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION)
            startActivity(intent)
            this@SplashScreen.finish()
        }, SPLASH_DISPLAY_LENGTH)
    }


}
