import androidx.compose.runtime.*
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.renderComposable

fun main() {
    renderComposable(rootElementId = "root") {
        Style(AppStylesheet)

        Div(attrs = { classes(AppStylesheet.container) }) {
            Navbar()

            Section(attrs = { id("home") }) {
                H1 { Text("Welcome to BlkCreek") }
                P { Text("A smart and secure future for smart contract interaction.") }
            }

            Section(attrs = { id("about") }) {
                H2 { Text("About") }
                P {
                    Text("BlkCreek is building verification tools for EVM smart contracts to help users better understand transaction intent and risk.")
                }
            }

            Section(attrs = { id("projects") }) {
                H2 { Text("Projects") }
                Ul {
                    Li { Text("🔍 EVM Smart Contract Verifier") }
                    Li { Text("🧠 AI-Powered Natural Language Summaries") }
                    Li { Text("🛠️ Kotlin Multiplatform DApps") }
                }
            }

            Footer {
                P {
                    Text("© ${js("new Date().getFullYear()")} BlkCreek. All rights reserved.")
                }
            }
        }
    }
}