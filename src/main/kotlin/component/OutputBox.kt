package component

import react.RBuilder
import react.dom.value
import styled.styledTextArea

fun RBuilder.outputBox(value: String) {
    styledTextArea {
        textBox()
        attrs.value = value
        attrs.readonly = true
        val lines = attrs.value.count { it == '\n' } + 1
        attrs.rows = maxOf(2, lines).toString()
    }
}