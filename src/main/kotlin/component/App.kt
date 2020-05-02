package component

import kotlinx.css.*
import model.RafmanTranslator
import react.RBuilder
import react.dom.div
import react.dom.h1
import react.dom.header
import styled.css
import styled.styledDiv
import styled.styledHeader

fun RBuilder.app() {
    styledHeader {
        css {
            margin = 30.px.toString()
        }
        h1 {
            + "ラフム語翻訳機"
        }
    }
    styledDiv {
        css {
            display = Display.flex
            flexDirection = FlexDirection.row
            justifyContent = JustifyContent.flexStart
        }
        translator(
            "ラフム語",
            "日本語",
            RafmanTranslator::translateRafmanToJapanese
        )
        translator(
            "日本語",
            "ラフム語",
            RafmanTranslator::translateJapaneseToRafman
        )
    }
}