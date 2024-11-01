@file:OptIn(ExperimentalSettingsApi::class)

package brn.mobile.brnmobile.di


import brn.mobile.brnmobile.ui.SplashScreenModel
import com.russhwolf.settings.ExperimentalSettingsApi
import io.ktor.client.HttpClient
import kotlinx.serialization.json.Json
import org.koin.core.KoinApplication
import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.core.module.dsl.factoryOf
import org.koin.core.parameter.parametersOf
import org.koin.core.scope.Scope
import org.koin.dsl.module

fun initKoin(additionalModules: List<Module>): KoinApplication {
    val koinApplication = startKoin {
        modules(
            additionalModules +
                    //  platformModule +
                    coreModule
        )
    }

    return koinApplication
}

val coreModule = module {

    factoryOf(::SplashScreenModel)

    single {
        HttpClient(engine = get()) {}
    }

    single {
        Json {
            ignoreUnknownKeys = true
        }
    }
}

internal inline fun <reified T> Scope.getWith(vararg params: Any?): T {
    return get(parameters = { parametersOf(*params) })
}

