package com.example.lesson1kotlin1.data.client

import com.example.lesson1kotlin1.R
import com.example.lesson1kotlin1.models.BooksModel

class BooksClient {
    fun getData(): List<BooksModel> {
        val list = ArrayList<BooksModel>()
        list.add(
            BooksModel(
                "Мутант.Начало", "Наш герой, идущий вперед сквозь тернии и невзгоды, " +
                        "" + "случайно оказался не вто время не в том месте, и попал в мир, " +
                        "очень не приветливый и суровый. Героя ждут суровые испытания, " +
                        "балансируя на грани жизни и смерти в постоянном напряжении, " +
                        "но он будет идти вперед. Новый мир, новые возможности, " +
                        "а также поставленные перед собой цели и жажда жизни заставляют" +
                        " достигать новых высот", R.drawable.mutant
            )
        )
        list.add(
            BooksModel(
                "Однажды я " +
                        "проснулась в романе",
                "Что делать, если однажды ты просыпаешься в мире любимого романа? " +
                        "И никаким не героем или героиней, а простым второстепенным персонажем," +
                        " о котором в книге упоминается всего лишь раз. Жить обычной жизнью." +
                        " А что если в этом мире ты можешь быть рядом со своим любимым героем" +
                        " и не дать автору сделать из него козла отпущения. Быть может стоит попытаться изменить его судьбу?",
                R.drawable.roman
            )
        )
        list.add(
            BooksModel(
                "Останься со мною",
                "Эмили: Уильям ушёл, завбрав с собою весь мой мир. " +
                        "Как жить без него? Неужели на этом всё закончилось? " +
                        "Энтони: наконец-то у меня появился шанс вернуть Эмили и я не упущу его. " +
                        "Уильям: я должен был оставить тебя, моя родная, но как жить без тебя Эм?",
                R.drawable.ostansya_so_mnoi
            )
        )
        list.add(
            BooksModel(
                "Секретный ингредиент",
                "Меня отделяло от звезды Мишлен только одно — отсутствие особого рецепта." +
                        "И я его нашла: купила в переходе старинный манускрипт с необычным немецким блюдом, " +
                        "а загадочная старушка-продавщица, пообещала мне такой карьерный взлёт, что звёзды позавидуют. " +
                        "Вот только одна проблема — часть ингредиентов была затёрта, чернила от времени потускнели, и понять, " +
                        "что же необходимо использовать не получалось очень долгое время… Но я девушка настойчивая," +
                        " и пусть на поиски недостающих специй потребовалось время, оно стоило того! Вкус получился просто невероятным! " +
                        "Как и дальнейшие приключения…",
                R.drawable.secretnyi_ingredient
            )
        )
        list.add(
            BooksModel(
                "Milk and Honey.Белые стихи,покорившие мир",
                "Рупи Каур – индианка по происхождению, молодой," +
                        " но всемирно известный писатель и художник." +
                        "Ее стихи не имеют рифмы, но поражают в самое сердце. " +
                        "Ее иллюстрации символичны, но накаляют чувства. Ее книгу никто не хотел публиковать," +
                        " но она стала мировым бестселлером." +
                        "Лирический сборник Рупи Каур – это откровенная, смелая и чувственная поэзия," +
                        " которая захватывает с первых строк. Каждый может найти в этих коротких," +
                        " эмоционально сконцентрированных и проницательных историях что-то из собственной жизни. " +
                        "Рассказывая о трагедии детства, несчастной любви и боли своих потерь, " +
                        "Рупи Каур погружает читателя в противоречивое чувство прекрасной грусти, подтверждая заявленное:" +
                        " «Пройти сквозь самые горькие моменты жизни, чтобы обнаружить в них сладость, ведь она есть во всем»." +
                        "Переводы стихов публикуются вместе с оригинальными текстами на английском языке.",
                R.drawable.milk_and_honey
            )
        )
        return list
    }
}