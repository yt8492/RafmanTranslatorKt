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
        child(Translator::class) {
            attrs {
                from = "ラフム語"
                to = "日本語"
                translator = RafmanTranslator::translateRafmanToJapanese
            }
        }
        child(Translator::class) {
            attrs {
                from = "日本語"
                to = "ラフム語"
                translator = RafmanTranslator::translateJapaneseToRafman
            }
        }
    }
}