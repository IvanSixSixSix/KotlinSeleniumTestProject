package driver

import io.qameta.allure.Description
import org.junit.jupiter.api.Assertions.assertAll
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import ru.ya.MainPage
import ru.ya.StartPage
import ru.ya.VKCallPage


class GoToVkLinkTest : BaseTest() {
    private val input = "ВК звонки"
    private val VKLink = "https://calls.v.com/"
    @Test
    @Description("Переход по первой ссылке в результате яндекс поиска по запросу ВК звонки")
    fun GoToVkLink() {

        GoToUrl("https://ya.ru/")
        val startPage = StartPage(driver)

        startPage.InputSearchValue(input)
        startPage.EnterSrearch()

        val mainPage = MainPage(driver)
        mainPage.ClickFirstLink()
        driver.switchTo().window(driver.windowHandles.last())

        val vkCallPage = VKCallPage(driver)

        val currentURL = driver.currentUrl
        assertAll("Проверка страницы ВК звонки",
            { assertTrue(vkCallPage.instalButton.isEnabled, "Кнопка установки не доступна") },
            { assertTrue(vkCallPage.startCallButton.isEnabled, "Кнопка начала звонка не доступна") },
            { assertEquals(currentURL, VKLink, "Первая ссылка поиска не ведет на страницу \"${input}\"") })
    }
}
