//
//  Koin.swift
//  iosApp
//
//  Created by Mykola Maletskyi on 22.06.2023.
//

import Foundation
import ComposeApp



func startKoin() {

    let koinApplication = Koin_iosKt.doInitKoinIos()
    _koin = koinApplication.koin
}

private var _koin: Koin_coreKoin? = nil
var koin: Koin_coreKoin {
    return _koin!
}
