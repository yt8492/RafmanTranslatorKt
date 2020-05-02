package component

import kotlinx.css.*
import react.*
import react.dom.h2
import react.dom.h3
import styled.css
import styled.styledSection

interface TranslatorProps : RProps {
    var from: String
    var to: String
    var translateFunc: (String) -> String
}

val translator = functionalComponent<TranslatorProps> { props ->
    val (beforeTranslate, setBeforeTranslateText) = useState("")
    styledSection {
        css {
            backgroundColor = Color.whiteSmoke
            width = 50.pct
            height = 80.pct
            margin = 30.px.toString()
            padding = 20.px.toString()
        }
        h2 {
            + "${props.from} -> ${props.to}"
        }
        h3 {
            + props.from
        }
        inputBox(beforeTranslate) {
            setBeforeTranslateText(it)
        }
        h3 {
            + props.to
        }
        outputBox(props.translateFunc(beforeTranslate))
    }
}

fun RBuilder.translator(
    fromLanguageName: String,
    toLanguageName: String,
    translateFunc: (String) -> String
) {
    child(translator) {
        attrs.from = fromLanguageName
        attrs.to = toLanguageName
        attrs.translateFunc = translateFunc
    }
}
