package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PositiveTests {
    //
//    @Test
//    void someTest() {
//        assertTrue(true);
//    }
//
//    @Test
//    void someTest1() {
//        assertTrue(true);
//    }
//
//    @Test
//    void someTest2() {
//        assertTrue(true);
//    }
//
//    @Test
//    void someTest3() {
//        assertTrue(true);
//    }
//
//    @Test
//    void someTest4() {
//        assertTrue(true);
//    }
//
//    @Test
//    void someTest5() {
//        assertTrue(true);
//    }
//
//    @Test
//    void someTest6() {
//        assertTrue(true);
//    }
//
//    @Test
//    void someTest7() {
//        assertTrue(true);
//    }
//
//    @Test
//    void someTest8() {
//        assertTrue(true);
//    }
//
//    @Test
//    void someTest9() {
//        assertTrue(true);
//    }
    @Test
    void someTest9() {
//        "- адрес тестируемого сайта" https://demoqa.com
        String baseUrl = System.getProperty("baseUrl");
        System.out.println("Test baseUrl is " + baseUrl);

//                "- адрес удаленного браузера (selenoid)\n"
        String urlSelenoid = System.getProperty("urlSelenoid");
        System.out.println("Test urlSelenoid is " + urlSelenoid);

//                "- браузер, версию браузера, параметр headless, разрешение экрана"
        String browser = System.getProperty("browser", "chrome");

//        Configuration.browser = "chrome";
        String browserVersion = System.getProperty("browserVersion", "148.0");

        //        Configuration.browserVersion = "148.0";
        String headless = System.getProperty("headless");
        String browserSize = System.getProperty("browserSize", "1920x1080");
//        Configuration.browserSize = "1920x1080";
        System.out.println("Test browser is " + browser +
                "browserVersion is " + browserVersion +
                "headless is " + headless +
                "browserSize is " + browserSize);

    }

}