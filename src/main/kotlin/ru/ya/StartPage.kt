package ru.ya

import driver.BasePage
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement


class StartPage(driver: WebDriver) : BasePage(driver) {

    private val searchField = FindElemetByXPath("//*[@id='text']")
    private val searchButton = FindElemetByXPath("//button[text()]")
    val listOutput = "//*[contains(@data-text,'вк звонки')]"

    fun InputSearchValue(searchValue: String) {
        InputValue(searchField, searchValue)
    }

    fun EnterSrearch() {
        searchButton.click()
    }

    fun GetElemetns(elemPath: String):List<WebElement>{
        val list = FindElemetsByXPath(elemPath)
        return list
    }

}


