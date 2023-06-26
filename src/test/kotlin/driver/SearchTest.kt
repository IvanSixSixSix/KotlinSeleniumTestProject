package driver

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import ru.ya.StartPage
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class SearchTest : BaseTest() {
    private val input = "ВК звонки"
    @Test
    fun SearchYandex(){

        GoToUrl("https://ya.ru/")

        val pageElem = StartPage(driver)
        pageElem.InputSearchValue(input)

        val output = pageElem.GetElemetns(pageElem.listOutput)
        for ( i in output) {
         val field = i.getAttribute("data-text")
            assertTrue(field.contains(input.toLowerCase()), "Не все выведеные поля содержат условия поиска: \"${input}\"")
        }
    }
}