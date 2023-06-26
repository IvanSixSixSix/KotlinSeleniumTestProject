package ru.ya

import driver.BasePage
import org.openqa.selenium.WebDriver

class VKCallPage (driver: WebDriver) : BasePage(driver)  {
    val instalButton = FindElemetByXPath("//*[@id='wrap3']/div/div[1]/div[1]/button[1]")
    val startCallButton = FindElemetByXPath("//button[contains(@class, 'createCall')]")

}