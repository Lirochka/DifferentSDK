package com.example.differentsdk_2

import android.app.Application
import android.os.Build
import android.text.Spanned
import androidx.annotation.RequiresApi

class App : Application() {

    lateinit var html: Html

    override fun onCreate() {
        super.onCreate()

        html = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            Html.About24()
        } else
            Html.Under24()
    }
}

interface Html {

    fun spannable(source: String): Spanned

    class Under24 : Html {

        override fun spannable(source: String) =
            android.text.Html.fromHtml(source)
    }

    class About24 : Html {
        @RequiresApi(Build.VERSION_CODES.N)
        override fun spannable(source: String): Spanned =
            android.text.Html.fromHtml(source, 0)

    }

}