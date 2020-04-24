package component

import react.*
import react.dom.h2
import react.dom.h3
import react.dom.section

class Translator : RComponent<Translator.Props, Translator.State>() {
    init {
        state.apply {
            beforeTranslate = ""
        }
    }

    override fun RBuilder.render() {
        section(classes = "translator") {
            h2 {
                + "${props.from} -> ${props.to}"
            }
            h3 {
                + props.from
            }
            inputBox(state.beforeTranslate) {
                setState {
                    beforeTranslate = it
                }
            }
            h3 {
                + props.to
            }
            outputBox(props.translator(state.beforeTranslate))
        }
    }

    interface Props : RProps {
        var from: String
        var to: String
        var translator: (String) -> String
    }

    interface State : RState {
        var beforeTranslate: String
    }
}