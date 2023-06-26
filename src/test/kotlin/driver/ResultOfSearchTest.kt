package driver

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import ru.ya.MainPage
import ru.ya.StartPage
import kotlin.test.assertTrue

class ResultOfSearchTest : BaseTest() {
    private val input = "ВК звонки"
    @Test
    fun ResultOfSearch(){

        GoToUrl("https://ya.ru/")

        val startPage = StartPage(driver)

        startPage.InputSearchValue(input)
        startPage.EnterSrearch()

        val mainPage = MainPage(driver)

        assertAll("Проверка страницы результата поиска в Яндексе",
             { assertTrue(mainPage.firstLink.isEnabled, "Перая ссылка не доступна")},
             { assertTrue(mainPage.verifyIcon.isDisplayed, "Иконка верификации не отображается")}
        )
    }
}