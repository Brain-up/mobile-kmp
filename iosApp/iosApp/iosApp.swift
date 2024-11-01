import UIKit
import ComposeApp
import SwiftUI

//@main
//class AppDelegate: UIResponder, UIApplicationDelegate {
//    var window: UIWindow?
//
//    func application(
//        _ application: UIApplication,
//        didFinishLaunchingWithOptions launchOptions: [UIApplication.LaunchOptionsKey: Any]?
//    ) -> Bool {
//        window = UIWindow(frame: UIScreen.main.bounds)
//        if let window = window {
//            window.rootViewController = MainKt.MainViewController()
//            window.makeKeyAndVisible()
//        }
//        return true
//    }
//}
class AppDelegate: NSObject, UIApplicationDelegate {
  func application(_ application: UIApplication,
                   didFinishLaunchingWithOptions launchOptions: [UIApplication.LaunchOptionsKey : Any]? = nil) -> Bool {
    return true
  }
}

@main
struct iosApp: App {
init() {
    @UIApplicationDelegateAdaptor(AppDelegate.self) var delegate
       startKoin()
    }
    var body: some Scene {
        WindowGroup {
            ContentView()
        }
    }
}

struct ContentView: View {
    var body: some View {
        ComposeView().ignoresSafeArea(.all, edges: .all)
    }
}

struct ComposeView: UIViewControllerRepresentable {

    func makeUIViewController(context: Context) -> UIViewController {

        let viewController =  MainKt.MainViewController()

       return viewController
    }

    func updateUIViewController(_ uiViewController: UIViewController, context: Context) {}

}
func startKoin() {

    let koinApplication = Koin_iosKt.doInitKoinIos()
    _koin = koinApplication.koin
}

private var _koin: Koin_coreKoin? = nil
var koin: Koin_coreKoin {
    return _koin!
}