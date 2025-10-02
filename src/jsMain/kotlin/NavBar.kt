import androidx.compose.runtime.*
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.attributes.*
import org.jetbrains.compose.web.css.*

@Composable
fun Navbar() {
    Nav(attrs = { classes(AppStylesheet.navbar) }) {
        A("#home", attrs = { classes(AppStylesheet.navLink) }) { Text("Home") }
        A("#about", attrs = { classes(AppStylesheet.navLink) }) { Text("About") }
        A("#projects", attrs = { classes(AppStylesheet.navLink) }) { Text("Projects") }
    }
}