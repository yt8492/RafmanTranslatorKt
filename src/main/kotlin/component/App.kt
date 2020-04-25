package component

import model.RafmanTranslator
import react.RBuilder
import react.dom.div
import react.dom.h1
import react.dom.header

fun RBuilder.app() {
    header {
        h1 {
            + "ラフム語翻訳機"
        }
    }
    div(classes = "main") {
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