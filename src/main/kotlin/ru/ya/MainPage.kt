package ru.ya

import driver.BasePage
import org.openqa.selenium.WebDriver

class MainPage(driver: WebDriver) : BasePage(driver) {

    val verifyIcon = FindElemetByXPath("//*[contains(@class, 'Verified-Icon')]")
    val firstLink = FindElemetByXPath("//*[@id='search-result']/li[1]/div/div[1]/a/h2/span")
    fun ClickFirstLink(){
        firstLink.click()
    }
}
