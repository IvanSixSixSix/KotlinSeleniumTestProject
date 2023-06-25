package ru.ya

import driver.BasePage
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement


class StartPage(driver: WebDriver) : BasePage(driver) {

    private val searchField = FindElemetByXPath("//*[@id='text']")
    private var searchButton = FindElemetByXPath("//button[text()]")
    private var listOutput = FindElemetsByXPath("//*[@id='suggest-list-gc0lnfr8ff']")

    fun InputSearchValue(searchValue: String) {
            InputValue(searchField, searchValue)
        }
    fun EnterSrearch(){
        searchButton.click()
    }
   //fun GetOutputValue():Array<String> {
   //    val array:Array<String> = listOutput.toTypedArray()
   //    return array
    }
}


