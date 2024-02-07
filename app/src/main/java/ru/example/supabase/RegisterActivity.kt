package ru.example.supabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import io.github.jan.supabase.SupabaseClient
import io.github.jan.supabase.createSupabaseClient
import io.github.jan.supabase.gotrue.Auth
import io.github.jan.supabase.postgrest.Postgrest
import io.github.jan.supabase.realtime.Realtime
import io.github.jan.supabase.storage.Storage
import kotlinx.coroutines.launch
import ru.example.recapon.R

class RegisterActivity : AppCompatActivity() {
    private lateinit var supabase: SupabaseClient
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val supabase = createSupabaseClient(
            supabaseUrl = "https://sfppwaxahfrikikceagu.supabase.co",
            supabaseKey = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6InNmcHB3YXhhaGZyaWtpa2NlYWd1Iiwicm9sZSI6ImFub24iLCJpYXQiOjE3MDczMDI4NDgsImV4cCI6MjAyMjg3ODg0OH0.__faJFvBkw0Qjtdxj8x8YMMLqwtKJleWkPSwb-Y--nU"
        ) {
            install(Auth)
            install(Postgrest)
            install(Realtime)
            install(Storage)
        }
    }

    private fun getData() {

        lifecycleScope.launch {
            val client = get
        }
    }

    private fun getClient(): SupabaseClient {

    }
}