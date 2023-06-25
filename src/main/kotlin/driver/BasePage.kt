package driver

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

open class BasePage(private val driver: WebDriver) {
  fun FindElemetByXPath(elemPath: String): WebElement {
      val elem: WebElement = driver.findElement(By.ByXPath(elemPath))
      return elem
  }
    fun FindElemetsByXPath(elemPath: String):List<WebElement> {
        val elemsList: List<WebElement> = driver.findElements(By.ByXPath(elemPath))
        return elemsList
    }
  fun InputValue(elem: WebElement, input: String) {
      elem.click()
      elem.sendKeys(input)
  }
}
