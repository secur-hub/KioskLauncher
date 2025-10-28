package com.kiosk.launcher

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.core.view.setPadding

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(50)
        }

        // Pulsante Wi-Fi
        val wifiButton = Button(this).apply {
            text = "Apri impostazioni Wi-Fi"
            setOnClickListener {
                try {
                    startActivity(Intent(Settings.ACTION_WIFI_SETTINGS))
                } catch (e: Exception) {
                    Toast.makeText(this@MainActivity, "Impossibile aprire Wi-Fi", Toast.LENGTH_SHORT).show()
                }
            }
        }
        layout.addView(wifiButton)

        // Pulsante uscita segreta
        val exitButton = Button(this).apply {
            text = "Esci Kiosk (password)"
            setOnClickListener {
                val pass = "1234" // password segreta
                val input = android.widget.EditText(this@MainActivity)
                android.app.AlertDialog.Builder(this@MainActivity)
                    .setTitle("Inserisci password")
                    .setView(input)
                    .setPositiveButton("OK") { _, _ ->
                        if(input.text.toString() == pass){
                            stopLockTask()
                        } else {
                            Toast.makeText(this@MainActivity, "Password errata", Toast.LENGTH_SHORT).show()
                        }
                    }
                    .setNegativeButton("Annulla", null)
                    .show()
            }
        }
        layout.addView(exitButton)

        setContentView(layout)

        startKioskApp()
    }

    private fun startKioskApp() {
        packageManager.getLaunchIntentForPackage("co.median.android.nmxzeyd")?.let {
            startLockTask()
            startActivity(it)
        } ?: Toast.makeText(this, "App target non trovata", Toast.LENGTH_LONG).show()
    }
}
