package model

object RafmanTranslator {
    fun translateJapaneseToRafman(text: String): String {
        return buildString {
            text.forEach {
                append(japaneseToRafmanMap["$it"] ?: "$it")
            }
        }
    }

    fun translateRafmanToJapanese(text: String): String {
        return buildString {
            text.forEach {
                append(rafmanToJapaneseMap["$it"] ?: "$it")
            }
        }
    }

    private val japaneseToRafmanMap = mapOf(
        "あ" to "3", "い" to "e", "う" to "4", "え" to "5", "お" to "6",
        "か" to "t", "き" to "g", "く" to "h", "け" to ":", "こ" to "b",
        "さ" to "x", "し" to "d", "す" to "r", "せ" to "p", "そ" to "c",
        "た" to "q", "ち" to "a", "つ" to "z", "て" to "w", "と" to "s",
        "な" to "u", "に" to "i", "ぬ" to "1", "ね" to "<", "の" to "k",
        "は" to "f", "ひ" to "v", "ふ" to "2", "へ" to "^", "ほ" to "-",
        "ま" to "j", "み" to "n", "む" to "]", "め" to "/", "も" to "m",
        "や" to "7", "ゆ" to "8", "よ" to "9",
        "ら" to "o", "り" to "l", "る" to ".", "れ" to ";", "ろ" to "\\",
        "わ" to "0", "を" to "=", "ん" to "y",
        "が" to "t@", "ぎ" to "g@", "ぐ" to "h@", "げ" to ":@", "ご" to "b@",
        "ざ" to "x@", "じ" to "d@", "ず" to "r@", "ぜ" to "p@", "ぞ" to "c@",
        "だ" to "q@", "ぢ" to "a@", "づ" to "z@", "で" to "w@", "ど" to "s@",
        "ば" to "f@", "び" to "v@", "ぶ" to "2@", "べ" to "^@", "ぼ" to "-@",
        "ぱ" to "f[", "ぴ" to "v[", "ぷ" to "2[", "ぺ" to "^[", "ぽ" to "-[",
        "ぁ" to "3", "ぃ" to "e", "ぅ" to "4", "ぇ" to "5", "ぉ" to "6",
        "っ" to "z",
        "ゃ" to "7", "ゅ" to "8", "ょ" to "9",
        "ア" to "3", "イ" to "e", "ウ" to "4", "エ" to "5", "オ" to "6",
        "カ" to "t", "キ" to "g", "ク" to "h", "ケ" to ":", "コ" to "b",
        "サ" to "x", "シ" to "d", "ス" to "r", "セ" to "p", "ソ" to "c",
        "タ" to "q", "チ" to "a", "ツ" to "z", "テ" to "w", "ト" to "s",
        "ナ" to "u", "ニ" to "i", "ヌ" to "1", "ネ" to "<", "ノ" to "k",
        "ハ" to "f", "ヒ" to "v", "フ" to "2", "ヘ" to "^", "ホ" to "-",
        "マ" to "j", "ミ" to "n", "ム" to "]", "メ" to "/", "モ" to "m",
        "ヤ" to "7", "ユ" to "8", "ヨ" to "9",
        "ラ" to "o", "リ" to "l", "ル" to ".", "レ" to ";", "ロ" to "\\",
        "ワ" to "0", "ヲ" to "=", "ン" to "y",
        "ガ" to "t@", "ギ" to "g@", "グ" to "h@", "ゲ" to ":@", "ゴ" to "b@",
        "ザ" to "x@", "ジ" to "d@", "ズ" to "r@", "ゼ" to "p@", "ゾ" to "c@",
        "ダ" to "q@", "ヂ" to "a@", "ヅ" to "z@", "デ" to "w@", "ド" to "s@",
        "バ" to "f@", "ビ" to "v@", "ブ" to "2@", "ベ" to "^@", "ボ" to "-@",
        "パ" to "f[", "ピ" to "v[", "プ" to "2[", "ペ" to "^[", "ポ" to "-[",
        "ァ" to "3", "ィ" to "e", "ゥ" to "4", "ェ" to "5", "ォ" to "6",
        "ッ" to "z",
        "ャ" to "7", "ュ" to "8", "ョ" to "9",
        "゛" to "@", "゜" to "["
    )

    private val rafmanToJapaneseMap = mapOf(
        "3" to "あ", "e" to "い", "4" to "う", "5" to "え", "6" to "お",
        "t" to "か", "g" to "き", "h" to "く", ":" to "け", "b" to "こ",
        "x" to "さ", "d" to "し", "r" to "す", "p" to "せ", "c" to "そ",
        "q" to "た", "a" to "ち", "z" to "つ", "w" to "て", "s" to "と",
        "u" to "な", "i" to "に", "1" to "ぬ", "<" to "ね", "k" to "の",
        "f" to "は", "v" to "ひ", "2" to "ふ", "^" to "へ", "-" to "ほ",
        "j" to "ま", "n" to "み", "]" to "む", "/" to "め", "m" to "も",
        "7" to "や", "8" to "ゆ", "9" to "よ",
        "o" to "ら", "l" to "り", "." to "る", ";" to "れ", "\\" to "ろ",
        "0" to "わ", "=" to "を", "y" to "ん",
        "@" to "゛", "[" to "゜"
    )
}