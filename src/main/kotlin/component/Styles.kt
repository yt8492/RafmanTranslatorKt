package component

import kotlinx.css.*
import kotlinx.css.properties.LineHeight
import styled.StyledDOMBuilder
import styled.css

fun StyledDOMBuilder<*>.textBox() {
    css {
        lineHeight = LineHeight(150.pct.toString())
        borderColor = Color.black
        borderWidth = 3.px
        width = 100.pct
        fontSize = 20.px
        put("resize", "none")
    }
}