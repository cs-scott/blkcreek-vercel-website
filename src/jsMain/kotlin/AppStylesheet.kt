import org.jetbrains.compose.web.css.*

object AppStylesheet : StyleSheet() {
    val container by style {
        fontFamily("sans-serif")
        padding(32.px)
        lineHeight("1.5")
        backgroundColor(Color("#f9f9f9"))
    }

    val navbar by style {
        display(DisplayStyle.Flex)
        gap(24.px)
        marginBottom(24.px)
        fontWeight("bold")
        fontSize(18.px)
    }

    val navLink by style {
        color(Color("#0066cc"))
        textDecoration("none")
        hover {
            textDecoration("underline")
        }
    }
}