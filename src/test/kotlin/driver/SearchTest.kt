package driver

import org.junit.jupiter.api.Test
import org.openqa.selenium.WebDriver
import ru.ya.StartPage

class SearchTest : BaseTest() {
    @Test
    fun SearchYandexTest(){

        GoToUrl("https://ya.ru/")
        Thread.sleep(1000)
        val pageElem = StartPage(driver)
        pageElem.InputSearchValue("ВК звонки")
        pageElem.GetOutputValue()
    }
}