package component

import react.*
import react.dom.h2
import react.dom.h3
import react.dom.section

interface TranslatorProps : RProps {
    var from: String
    var to: String
    var translateFunc: (String) -> String
}

val translator = functionalComponent<TranslatorProps> { props ->
    val (beforeTranslate, setBeforeTranslateText) = useState("")
    section(classes = "translator") {
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
