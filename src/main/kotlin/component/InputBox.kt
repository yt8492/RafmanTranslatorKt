package component

import kotlinx.html.js.onChangeFunction
import org.w3c.dom.HTMLTextAreaElement
import react.RBuilder
import styled.styledTextArea

fun RBuilder.inputBox(value: String, onTextChange: (String) -> Unit) {
    styledTextArea {
        textBox()
        val lines = value.count { it == '\n' } + 1
        attrs.rows = maxOf(2, lines).toString()
        attrs.onChangeFunction = {
            val textArea = it.target as HTMLTextAreaElement
            onTextChange(textArea.value)
        }
    }
}