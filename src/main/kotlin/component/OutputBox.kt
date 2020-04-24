package component

import react.RBuilder
import react.dom.textArea
import react.dom.value

fun RBuilder.outputBox(value: String) {
    textArea(classes = "outputBox") {
        attrs.value = value
        attrs.readonly = true
        val lines = attrs.value.count { it == '\n' } + 1
        attrs.rows = maxOf(2, lines).toString()
    }
}