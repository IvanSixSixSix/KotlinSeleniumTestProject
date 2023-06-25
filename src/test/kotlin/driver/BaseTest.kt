package driver

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.openqa.selenium.WebDriver

import org.openqa.selenium.chrome.ChromeDriver
 open class BaseTest() {
     val driver: ChromeDriver = ChromeDriver()
    fun GoToUrl(url: String) {
        driver.get(url)
    }
    @BeforeEach
     fun setUp() {
         driver.manage()?.window()?.maximize()
    }
    @AfterEach
    fun tearDown() {
        driver.quit()
         }
}

