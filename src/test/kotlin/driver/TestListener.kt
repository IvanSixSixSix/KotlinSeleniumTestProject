//package driver
//
//import io.qameta.allure.Allure
//import org.junit.jupiter.api.extension.TestWatcher
//import org.junit.jupiter.api.extension.ExtensionContext
//import org.openqa.selenium.OutputType
//import org.openqa.selenium.TakesScreenshot
//
//
// class TestListener : TestWatcher{
//    @Override
//     fun testSuccessful(context: ExtensionContext , cause: Throwable){
//        Allure.addAttachment("screnshot","image", ".png",
//            (BaseTest().driver as TakesScreenshot).getScreenshotAs(OutputType.BYTES).toString())
//    }
//}