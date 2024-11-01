package brn.mobile.brnmobile

import android.app.Activity
import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import brn.mobile.brnmobile.di.initKoin
import org.koin.dsl.module

class AppActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        initKoin(
            listOf(module {
                single<Context> { this@AppActivity }

                single<Class<out Activity>> { AppActivity::class.java }
//
            })
        )
        setContent { App() }
    }
}

