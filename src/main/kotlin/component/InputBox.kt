package component

import kotlinx.html.js.onChangeFunction
import org.w3c.dom.HTMLTextAreaElement
import react.RBuilder
import react.dom.textArea

fun RBuilder.inputBox(value: String, onTextChange: (String) -> Unit) {
    textArea(classes = "inputBox") {
        val lines = value.count { it == '\n' } + 1
        attrs.rows = maxOf(2, lines).toString()
        attrs.onChangeFunction = {
            val textArea = it.target as HTMLTextAreaElement
            onTextChange(textArea.value)
        }
    }
}