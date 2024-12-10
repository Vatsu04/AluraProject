package br.com.alura.orgs

import android.app.Activity
import android.os.Bundle
import android.view.View


class MainActivity : Activity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val view = View(this)
        setContentView(view)
    }


}
