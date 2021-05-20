package com.miftahulhuda.todolistapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navCtrl = this.findNavController(R.id.navhost_fragment)
        NavigationUI.setupActionBarWithNavController(this, navCtrl)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navCtrl = this.findNavController(R.id.navhost_fragment)
        return navCtrl.navigateUp()
    }
}