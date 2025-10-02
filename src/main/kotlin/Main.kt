import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.renderComposable

fun Main() {
    renderComposable(rootElementId = "root") {
        H1 { Text("Hello from my awesome Vercel + Kotlin site!")}
        P { Text("This is static Kotlin hosted on Vercel.")}
    }
}